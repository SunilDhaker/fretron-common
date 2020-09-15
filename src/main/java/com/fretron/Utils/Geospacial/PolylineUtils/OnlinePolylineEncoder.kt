package com.fretron.Utils.Geospacial.PolylineUtils

import com.fretron.Logger.Log
import com.fretron.Model.LitePosition
import com.fretron.Model.PointAtTime
import com.fretron.Model.TimeAwarePolyline
import java.util.*

object OnlinePolylineEncoder {

    init {
        Log.info("polyline encoder init called.")
    }

    private val decoder = PolylineDecoder.getInstance()
    private fun floor1e5(coordinate: Double): Int {
        return Math.floor(coordinate * 1e5).toInt()
    }

    private fun encodeSignedNumber(num: Int): String {
        var sNum = num shl 1
        if (num < 0) {
            sNum = sNum.inv()
        }
        return encodeNumber(sNum)
    }

    private fun encodeNumber(num: Int): String {
        var sNum = num
        val encodeString = StringBuffer()
        while (sNum >= 0x20) {
            val nextValue = (0x20 or (sNum and 0x1f)) + 63
            encodeString.append(nextValue.toChar())
            sNum = sNum shr 5
        }
        sNum += 63
        encodeString.append(sNum.toChar())
        return encodeString.toString()
    }

    private fun encodeSignedNumber(num: Long): String {
        var sgnNum = num shl 1
        if (num < 0) {
            sgnNum = sgnNum.inv()
        }
        return encodeNumber(sgnNum)
    }

    private fun encodeNumber(num: Long): String {
        var sNum = num
        val encodeString = StringBuilder()
        while (sNum >= 0x20) {
            val nextValue = (0x20.toLong() or (sNum and 0x1f)) + 63
            encodeString.append(nextValue.toChar())
            sNum = sNum shr 5
        }
        sNum += 63
        encodeString.append(sNum.toChar())
        return encodeString.toString()
    }


    fun extendPolyline(lineString: String, lastLat: Double, lastLng: Double, newLat: Double, newLng: Double): String {
        var polyline = lineString
        val lastLate5 = floor1e5(lastLat)
        val lastLnge5 = floor1e5(lastLng)
        val late5 = floor1e5(newLat)
        val lnge5 = floor1e5(newLng)
        val dlat = late5 - lastLate5
        val dlng = lnge5 - lastLnge5
        polyline += (encodeSignedNumber(dlat) + encodeSignedNumber(dlng))
        return polyline
    }


    fun extendTimeAwarePolyline(polylineObj: TimeAwarePolyline?,
                                newLat: Double,
                                newLng: Double,
                                newLocationTime: Long): TimeAwarePolyline? {
        if (polylineObj == null) {
            return null
        }
        val lastPoint = polylineObj.getLastPoint()
        val lastLat = floor1e5(lastPoint.getLatitude()!!)
        val lastLng = floor1e5(lastPoint.getLongitude()!!)
        val late5 = floor1e5(newLat)
        val lnge5 = floor1e5(newLng)
        val dlat = late5 - lastLat
        val dlng = lnge5 - lastLng
        val dtime = newLocationTime - lastPoint.getTimestamp()!!

        if (dlat != 0 || dlng != 0) {
            val extendedPolyline = encodeSignedNumber(dlat) + encodeSignedNumber(dlng) + encodeSignedNumber(dtime)
            polylineObj.setPolyline(polylineObj.getPolyline() + extendedPolyline)
            lastPoint.setTimestamp(newLocationTime)
            lastPoint.setLatitude(newLat)
            lastPoint.setLongitude(newLng)
            polylineObj.setLastPoint(lastPoint)
            polylineObj.setTotalPoints(polylineObj.getTotalPoints() + 1)
        }
        return polylineObj
    }


    fun extendPolyline(lineString: String, lastPos: LitePosition, nextPos: LitePosition): String {
        var polyline = lineString
        val lastLat = floor1e5(lastPos.getLatitude())
        val lastLng = floor1e5(lastPos.getLongitude())
        val late5 = floor1e5(nextPos.getLatitude())
        val lnge5 = floor1e5(nextPos.getLongitude())
        val dlat = late5 - lastLat
        val dlng = lnge5 - lastLng
        polyline += (encodeSignedNumber(dlat) + encodeSignedNumber(dlng))
        return polyline
    }


    fun extendTimeAwarePolyline(polylineObj: TimeAwarePolyline?, nextPos: LitePosition): TimeAwarePolyline? {
        if (polylineObj == null) return null
        val lastPoint = polylineObj.getLastPoint()
        val lastLat = floor1e5(lastPoint.getLatitude()!!)
        val lastLng = floor1e5(lastPoint.getLongitude()!!)
        val late5 = floor1e5(nextPos.getLatitude()!!)
        val lnge5 = floor1e5(nextPos.getLongitude()!!)
        val lastTimestamp = lastPoint.getTimestamp()!!
        val timestamp = nextPos.getTime()!!
        val dlat = late5 - lastLat
        val dlng = lnge5 - lastLng
        val dtime = timestamp - lastTimestamp
        if (dlat != 0 || dlng != 0) {
            val extendedPolyline = encodeSignedNumber(dlat) + encodeSignedNumber(dlng) + encodeSignedNumber(dtime)
            polylineObj.setPolyline(polylineObj.getPolyline() + extendedPolyline)
            lastPoint.setTimestamp(nextPos.getTime())
            lastPoint.setLatitude(nextPos.getLatitude())
            lastPoint.setLongitude(nextPos.getLongitude())
            polylineObj.setLastPoint(lastPoint)
            polylineObj.setTotalPoints(polylineObj.getTotalPoints()!! + 1)
        }
        return polylineObj
    }


    fun mergePolylines(p1: String, polyline2: String, lastlat1: Double, lastlng1: Double): String {
        var polyline1 = p1
        var lastlat = lastlat1
        var lastlng = lastlng1
        val points = decoder.decode(polyline2)
        for (point in points) {
            polyline1 = extendPolyline(polyline1, lastlat, lastlng, point.lat, point.lng)
            lastlat = point.lat
            lastlng = point.lng
        }
        return polyline1
    }


    fun mergeTimeAwarePolylines(polylineObj1: TimeAwarePolyline?,
                                polylineObj2: TimeAwarePolyline?): TimeAwarePolyline? {
        var timeAwarePolyline = polylineObj1
        if (timeAwarePolyline != null && polylineObj2 != null) {
            val points = decoder.decodeTimeAwarePolyline(polylineObj2.getPolyline())
            for (point in points) {
                timeAwarePolyline = extendTimeAwarePolyline(timeAwarePolyline,
                    point.getLatitude()!!,
                    point.getLongitude()!!,
                    point.getTimestamp()!!)
            }
        } else if (timeAwarePolyline == null && polylineObj2 != null) return polylineObj2

        return timeAwarePolyline
    }


    fun mergePolylines(polyline1: String, polyline2: String): String {
        var polyline = polyline1
        if (polyline.isEmpty()) return polyline2
        var points = decoder.decode(polyline)
        val lastPoint = points[points.size - 1]
        var lastlat = lastPoint.lat
        var lastlng = lastPoint.lng
        points = decoder.decode(polyline2)
        for (point in points) {
            polyline = extendPolyline(polyline, lastlat, lastlng, point.lat, point.lng)
            lastlat = point.lat
            lastlng = point.lng
        }
        return polyline
    }


    fun insertPointsIn(polylineObj: TimeAwarePolyline?, points: List<Point>, from: Long, to: Long): TimeAwarePolyline? {
        var timeAwarePolyline = polylineObj
        if (points.isEmpty() || timeAwarePolyline == null) return timeAwarePolyline
        val timeDiff = to - from
        val deltaTime = timeDiff / points.size
        var nextLocationTime = from + deltaTime
        for (point in points) {
            timeAwarePolyline = extendTimeAwarePolyline(timeAwarePolyline, point.lat, point.lng, nextLocationTime)
            nextLocationTime += deltaTime
        }
        return timeAwarePolyline
    }

    fun mergePolylineWithTimeAwarePolyline(polylineObj: TimeAwarePolyline?,
                                           polyline: String,
                                           newLocationTime: Long): TimeAwarePolyline? {
        var timeAwarePolyline = polylineObj
        if (polyline.isEmpty() || timeAwarePolyline == null) return timeAwarePolyline
        val lastPointTimestamp = timeAwarePolyline.getLastPoint().getTimestamp()
        val timeDiff = newLocationTime - lastPointTimestamp
        val nPoints = decoder.decode(polyline)
        if (nPoints.size > 0) {
            val deltaTime = timeDiff / nPoints.size
            var nextLocationTime = lastPointTimestamp + deltaTime
            for (point in nPoints) {
                timeAwarePolyline = extendTimeAwarePolyline(timeAwarePolyline, point.lat, point.lng, nextLocationTime)
                nextLocationTime += deltaTime
            }
        }

        return timeAwarePolyline
    }


    fun extendPolyline(list: Array<Point>): String {
        var p = ""
        if (list.isNotEmpty()) {
            var l = 0.0
            var la = 0.0
            for (aList in list) {
                p = extendPolyline(p, l, la, aList.lat, aList.lng)
                l = aList.lat
                la = aList.lng
            }
        }
        return p
    }


    fun extendTimeAwarePolyline(list: ArrayList<PointAtTime>): TimeAwarePolyline? {
        var polyline: TimeAwarePolyline? = null
        if (list.size > 0) {
            polyline = TimeAwarePolyline("", "", PointAtTime(0L, 0.0, 0.0), false, 0)
            for (point in list) {
                polyline = extendTimeAwarePolyline(polyline,
                    point.getLatitude()!!,
                    point.getLongitude()!!,
                    point.getTimestamp()!!)
            }
        }
        return polyline
    }


    fun extendTimeAwarePolyline(list: List<Point>, startTime: Long, endTime: Long): TimeAwarePolyline? {
        var time = startTime
        var polyline: TimeAwarePolyline? = null
        if (list.isNotEmpty()) {
            val deltaTime = endTime - time / list.size
            polyline = TimeAwarePolyline("", "", PointAtTime(0L, 0.0, 0.0), false, 0)
            for (point in list) {
                polyline = extendTimeAwarePolyline(polyline, point.lat, point.lng, time)
                time += deltaTime
            }
        }
        return polyline
    }


    fun extendTimeAwarePolylineWithPoints(polyline: TimeAwarePolyline?, list: List<PointAtTime>): TimeAwarePolyline? {
        var timeAwarePolyline = polyline
        if (list.isNotEmpty()) {
            for (point in list) {
                timeAwarePolyline = extendTimeAwarePolyline(timeAwarePolyline,
                    point.getLatitude(),
                    point.getLongitude(),
                    point.getTimestamp())
            }
        }
        return timeAwarePolyline
    }




    fun extendTimeAwarePolylineUsingPositions(list: List<LitePosition>): TimeAwarePolyline? {
        var polyline: TimeAwarePolyline? = null
        if (list.isNotEmpty()) {
            polyline = TimeAwarePolyline("", "", PointAtTime(0L, 0.0, 0.0), false, 0)
            for (point in list) {
                polyline =
                    extendTimeAwarePolyline(polyline, point.getLatitude()!!, point.getLongitude()!!, point.getTime()!!)
            }
        }
        return polyline
    }

    fun extendTimeAwarePolylineUsingPositions(polyline : TimeAwarePolyline?,list: List<LitePosition>): TimeAwarePolyline? {
        var timeAwarePolyline: TimeAwarePolyline? = polyline ?: TimeAwarePolyline("", "", PointAtTime(0L, 0.0, 0.0), false, 0)
        if (list.isNotEmpty()) {
            for (point in list) {
                timeAwarePolyline =
                    extendTimeAwarePolyline(timeAwarePolyline, point.getLatitude(), point.getLongitude(), point.getTime())
            }
        }
        return timeAwarePolyline
    }


    fun convertToGeoPolyline(timeAwarePolyline: TimeAwarePolyline): String {
        var polyline = ""
        val list = decoder.decodeTimeAwarePolyline(timeAwarePolyline.getPolyline())
        val it = list.iterator()
        var lastLat = 0.0
        var lastLng = 0.0
        while (it.hasNext()) {
            val point = it.next()
            polyline = extendPolyline(polyline, lastLat, lastLng, point.getLatitude()!!, point.getLongitude()!!)
            lastLat = point.getLatitude()!!
            lastLng = point.getLongitude()!!
        }

        return polyline
    }


}
