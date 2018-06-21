package com.fretron.utils.PolylineUtils;

/**
 * Created by sdhaker on 21/07/17.
 */

import com.fretron.Model.LitePosition;
import com.fretron.Model.PointAtTime;
import com.fretron.Model.TimeAwarePolyline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This is a utility
 * For streaming we need a polyline line encoder to encode stream growing polyline
 *
 */
public class OnlinePolylineEncoder {
    private static  PolylineDecoder decoder = PolylineDecoder.getInstance();
    private static int floor1e5(double coordinate) {
        return (int) Math.floor(coordinate * 1e5);
    }

    private static String encodeSignedNumber(int num) {
        int sgn_num = num << 1;
        if (num < 0) {
            sgn_num = ~(sgn_num);
        }
        return (encodeNumber(sgn_num));
    }

    private static String encodeNumber(int num) {
        StringBuffer encodeString = new StringBuffer();
        while (num >= 0x20) {
            int nextValue = (0x20 | (num & 0x1f)) + 63;
            encodeString.append((char) (nextValue));
            num >>= 5;
        }
        num += 63;
        encodeString.append((char) (num));
        return encodeString.toString();
    }

    private static String encodeSignedNumber(long num) {
        long sgn_num = num << 1;
        if (num < 0) {
            sgn_num = ~(sgn_num);
        }
        return (encodeNumber(sgn_num));
    }

    private static String encodeNumber(long num) {
        StringBuilder encodeString = new StringBuilder();
        while (num >= 0x20) {
            long nextValue = (0x20 | (num & 0x1f)) + 63;
            encodeString.append((char) (nextValue));
            num >>= 5;
        }
        num += 63;
        encodeString.append((char) (num));
        return encodeString.toString();
    }



    public static String extendPolyline(String lineString , double lastLat , double lastLng , double newLat , double newLng){
        int lastlate5 = floor1e5(lastLat);
        int lastlnge5 = floor1e5(lastLng);
        int late5 = floor1e5(newLat);
        int lnge5 = floor1e5(newLng);
        int dlat = late5 - lastlate5;
        int dlng = lnge5 - lastlnge5;
        lineString = lineString +  (encodeSignedNumber(dlat) + encodeSignedNumber(dlng).toString());
        return lineString;
    }



    public static TimeAwarePolyline extendTimeAwarePolyline(TimeAwarePolyline polylineObj , double newLat , double newLng , long newLocationTime){
        if (polylineObj == null){ return  null;}
        PointAtTime lastPoint = polylineObj.getLastPoint();
        int lastlate5 = floor1e5(lastPoint.getLatitude());
        int lastlnge5 = floor1e5(lastPoint.getLongitude());
        int late5 = floor1e5(newLat);
        int lnge5 = floor1e5(newLng);
        int dlat = late5 - lastlate5;
        int dlng = lnge5 - lastlnge5;
        long dtime = newLocationTime - lastPoint.getTimestamp();

        if (dlat != 0 || dlng != 0){
            String extendedPolyline = (encodeSignedNumber(dlat).toString() + encodeSignedNumber(dlng).toString()) + encodeSignedNumber(dtime).toString() ;
            polylineObj.setPolyline(polylineObj.getPolyline() + extendedPolyline);
            lastPoint.setTimestamp(newLocationTime);
            lastPoint.setLatitude(newLat);
            lastPoint.setLongitude(newLng);
            polylineObj.setLastPoint(lastPoint);
            polylineObj.setTotalPoints(polylineObj.getTotalPoints()+1);
        }
        return polylineObj;
    }


    public static String extendPolyline(String lineString , LitePosition lastPos, LitePosition nextPos){
        int lastlate5 = floor1e5(lastPos.getLatitude());
        int lastlnge5 = floor1e5(lastPos.getLongitude());
        int late5 = floor1e5(nextPos.getLatitude());
        int lnge5 = floor1e5(nextPos.getLongitude());
        int dlat = late5 - lastlate5;
        int dlng = lnge5 - lastlnge5;
        lineString = lineString +  (encodeSignedNumber(dlat) + encodeSignedNumber(dlng).toString());
        return lineString;
    }




    public static TimeAwarePolyline extendTimeAwarePolyline(TimeAwarePolyline polylineObj ,LitePosition nextPos){
        if (polylineObj == null) return null;
        PointAtTime lastPoint = polylineObj.getLastPoint();
        int lastlate5 = floor1e5(lastPoint.getLatitude());
        int lastlnge5 = floor1e5(lastPoint.getLongitude());
        int late5 = floor1e5(nextPos.getLatitude());
        int lnge5 = floor1e5(nextPos.getLongitude());
        long lastTimestamp = lastPoint.getTimestamp();
        long timestamp = nextPos.getTime();
        int dlat = late5 - lastlate5;
        int dlng = lnge5 - lastlnge5;
        long dtime = timestamp - lastTimestamp;
        if (dlat != 0 || dlng != 0){
            String extendedPolyline = (encodeSignedNumber(dlat) + encodeSignedNumber(dlng).toString()) + encodeSignedNumber(dtime).toString() ;
            polylineObj.setPolyline(polylineObj.getPolyline() + extendedPolyline);
            lastPoint.setTimestamp(nextPos.getTime());
            lastPoint.setLatitude(nextPos.getLatitude());
            lastPoint.setLongitude(nextPos.getLongitude());
            polylineObj.setLastPoint(lastPoint);
            polylineObj.setTotalPoints(polylineObj.getTotalPoints()+1);
        }
        return polylineObj;
    }




    public static String mergePolylines(String polyline1 , String polyline2 , double lastlat1 , double lastlng1){
        double lastlat = lastlat1;
        double lastlng = lastlng1;
        List<Point> points  = decoder.decode(polyline2);
        for(Point point : points){
            polyline1 = extendPolyline(polyline1 , lastlat , lastlng , point.getLat() , point.getLng());
            lastlat =  point.getLat();
            lastlng =  point.getLng();
        }
        return polyline1;
    }



    public static TimeAwarePolyline mergeTimeAwarePolylines(TimeAwarePolyline polylineObj1 , TimeAwarePolyline polylineObj2){
        if (polylineObj1 != null && polylineObj2 != null){
            List<PointAtTime> points  = decoder.decodeTimeAwarePolyline(polylineObj2.getPolyline());
            for(PointAtTime point : points){
                polylineObj1 = extendTimeAwarePolyline(polylineObj1 ,point.getLatitude() ,point.getLongitude() ,point.getTimestamp());
            }
        }else if (polylineObj1 == null && polylineObj2 != null) return polylineObj2;

        return polylineObj1;
    }



    public static  String mergePolylines(String polyline1 ,String polyline2){
        if (polyline1.length() == 0) return polyline2;
        List<Point> points = decoder.decode(polyline1);
        Point lastPoint = points.get(points.size() - 1);
        double lastlat = lastPoint.getLat();
        double lastlng = lastPoint.getLng();
        points = decoder.decode(polyline2);
        for (Point point : points){
            polyline1 = extendPolyline(polyline1,lastlat,lastlng,point.getLat(),point.getLng());
            lastlat = point.getLat();
            lastlng = point.getLng();
        }
        return polyline1;
    }


    public static TimeAwarePolyline insertPointsIn(TimeAwarePolyline polylineObj ,List<Point> points ,long from ,long to){
        if (points.size() == 0 || polylineObj == null) return polylineObj;
        long timeDiff = to - from;
        long deltaTime = timeDiff / points.size();
        long nextLocationTime = from + deltaTime;
        for (Point point: points) {
            polylineObj = extendTimeAwarePolyline(polylineObj ,point.getLat() ,point.getLng() ,nextLocationTime);
            nextLocationTime += deltaTime;
        }
        return  polylineObj;
    }

    public static TimeAwarePolyline mergePolylineWithTimeAwarePolyline(TimeAwarePolyline polylineObj ,String polyline ,long newLocationTime){
        if (polyline.length() == 0 || polylineObj == null) return polylineObj;
        long lastPointTimestamp = polylineObj.getLastPoint().getTimestamp();
        long timeDiff = newLocationTime - lastPointTimestamp;
        List<Point> npoints = decoder.decode(polyline);
        if (npoints.size() > 0){
            long deltaTime = timeDiff / npoints.size();
            long nextLocationTime = lastPointTimestamp + deltaTime;
            for (Point point: npoints) {
                polylineObj = extendTimeAwarePolyline(polylineObj ,point.getLat() ,point.getLng() ,nextLocationTime);
                nextLocationTime += deltaTime;
            }
        }

        return  polylineObj;
    }


    public static String extendPolyline(Point[] list){
        String p = "";
        if (list.length > 0){
            double l = 0;
            double la = 0.0 ;
            for (Point aList : list) {
                p = extendPolyline(p, l, la, aList.getLat(), aList.getLng());
                l = aList.getLat();
                la = aList.getLng();
            }
        }
        return p;
    }


    public static TimeAwarePolyline extendTimeAwarePolyline(ArrayList<PointAtTime> list){
        TimeAwarePolyline polyline = null;
        if (list.size() > 0){
            polyline = new TimeAwarePolyline("","",new PointAtTime(0L,0d,0d),false,0);
            for (PointAtTime point : list) {
                polyline = extendTimeAwarePolyline(polyline, point.getLatitude(), point.getLongitude(), point.getTimestamp());
            }
        }
        return polyline;
    }


    public static TimeAwarePolyline extendTimeAwarePolyline(List<Point> list ,long startTime ,long endTime){
        TimeAwarePolyline polyline = null;
        if (list.size() > 0){
            long deltaTime = endTime - startTime / list.size();
            polyline = new TimeAwarePolyline("","",new PointAtTime(0L,0d,0d),false,0);
            for (Point point : list) {
                polyline = extendTimeAwarePolyline(polyline, point.getLat(), point.getLng(), startTime);
                startTime += deltaTime;
            }
        }
        return polyline;
    }


    public static TimeAwarePolyline extendTimeAwarePolylineWithPoints(TimeAwarePolyline polyline ,List<PointAtTime> list){
        if (list.size() > 0){
            for (PointAtTime point : list) {
                polyline = extendTimeAwarePolyline(polyline, point.getLatitude(), point.getLongitude(), point.getTimestamp());
            }
        }
        return polyline;
    }


    public static TimeAwarePolyline extendTimeAwarePolylineUsingPositions(List<LitePosition> list){
        TimeAwarePolyline polyline = null;
        if (list.size() > 0){
            polyline = new TimeAwarePolyline("","",new PointAtTime(0L,0d,0d),false,0);
            for (LitePosition point : list) {
                polyline = extendTimeAwarePolyline(polyline, point.getLatitude(), point.getLongitude(), point.getTime());
            }

        }
        return polyline;
    }



    public static String convertToGeoPolyline(TimeAwarePolyline timeAwarePolyline){
        String polyline = "";
        List<PointAtTime> list = decoder.decodeTimeAwarePolyline(timeAwarePolyline.getPolyline());
        Iterator<PointAtTime> it =  list.iterator();
        double lastLat = 0;
        double lastLng = 0;
        while (it.hasNext()){
            PointAtTime point = it.next();
            polyline = extendPolyline(polyline ,lastLat ,lastLng,point.getLatitude() ,point.getLongitude());
            lastLat = point.getLatitude();
            lastLng = point.getLongitude();
        }

        return polyline;
    }




}
