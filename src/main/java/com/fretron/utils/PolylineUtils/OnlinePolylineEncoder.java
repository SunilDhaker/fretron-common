package com.fretron.utils.PolylineUtils;

/**
 * Created by sdhaker on 21/07/17.
 */


import com.fretron.Model.LitePosition;

import java.util.List;

/**
 * This is a utility
 * For streaming we need a polyline line encoder to encode stream growing polyline
 *
 */
public class OnlinePolylineEncoder {



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


	/**
	 * Extend a encoded polyline string by adding a point to it
	 * @param lineString
	 * @param lastLat
	 * @param lastLng
	 * @param newLat
	 * @param newLng
	 * @return
	 */
	public static String extendPolyline(String lineString , double lastLat , double lastLng , double newLat , double newLng){

		int lastlate5 = floor1e5(lastLat);
		int lastlnge5 = floor1e5(lastLng);

		int late5 = floor1e5(newLat);
		int lnge5 = floor1e5(newLng);

		int dlat = late5 - lastlate5;
		int dlng = lnge5 - lastlnge5;


		lineString = lineString +  (encodeSignedNumber(dlat).toString() + encodeSignedNumber(dlng).toString());
		return lineString;
	};


	public static String extendPolyline(String lineString , LitePosition lastPos, LitePosition nextPos){

		int lastlate5 = floor1e5(lastPos.getLatitude());
		int lastlnge5 = floor1e5(lastPos.getLongitude());

		int late5 = floor1e5(nextPos.getLatitude());
		int lnge5 = floor1e5(nextPos.getLongitude());

		int dlat = late5 - lastlate5;
		int dlng = lnge5 - lastlnge5;


		lineString = lineString +  (encodeSignedNumber(dlat).toString() + encodeSignedNumber(dlng).toString());
		return lineString;
	};


	/**
	 * Merge two given polyline
	 * @param polyline1
	 * @param polyline2
	 * @param lastlat1
	 * @param lastlng1
	 * @return
	 */
	public static String mergePolylines(String polyline1 , String polyline2 , double lastlat1 , double lastlng1){

		double lastlat = lastlat1;
		double lastlng = lastlng1;

		List<Point> points  = (new PolylineDecoder()).decode(polyline2);
		for(Point point : points){
			polyline1 = extendPolyline(polyline1 , lastlat , lastlng , point.getLat() , point.getLng());
			lastlat =  point.getLat();
			lastlng =  point.getLng();
		}
		return polyline1;
	}


/**
 * Merge two given polyline
 * @param polyline1
 * @param polyline2
 * * @return
 */

	public static  String mergePolylines(String polyline1 ,String polyline2){

		if (polyline1.length() == 0){

			return  polyline2;
		}

		List<Point> points = (new PolylineDecoder().decode(polyline1));
		Point lastPoint = points.get(points.size() - 1);

		double lastlat = lastPoint.getLat();
		double lastlng = lastPoint.getLng();

		points = new PolylineDecoder().decode(polyline2);

		for (Point point : points){

			polyline1 = extendPolyline(polyline1,lastlat,lastlng,point.getLat(),point.getLng());

			lastlat = point.getLat();
			lastlng = point.getLng();

		}

           return polyline1;
	}


}
