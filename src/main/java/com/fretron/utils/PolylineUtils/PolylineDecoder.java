package com.fretron.utils.PolylineUtils;

/**
 * Created by sdhaker on 21/07/17.
 */

import com.fretron.Model.LitePosition;
import com.fretron.utils.compressedPolylineUtils.reducer.Point;
import java.util.ArrayList;
import java.util.List;
import com.fretron.Model.PointAtTime;
import static com.fretron.utils.compressedPolylineUtils.reducer.PointImpl.p;

/**
 * Port to Java of Mark McClures Javascript OnlinePolylineEncoder :
 * http://facstaff.unca.edu/mcmcclur/GoogleMaps/EncodePolyline/decode.js
 */

public class PolylineDecoder {
	private static final double DEFAULT_PRECISION = 1E5;


	public List<com.fretron.utils.PolylineUtils.Point> decode(String encoded) {
		return decode(encoded, DEFAULT_PRECISION);
	}

	public List<PointAtTime> decodeTimeAwarePolyline(String encoded) {
		return decodeTimeAwarePolyline(encoded, DEFAULT_PRECISION);
	}

	public List<Point> decodeTimeAwarePolylineForCompression(String encoded){
		return decodeTimeAwarePolylineForCompression(encoded ,DEFAULT_PRECISION);
	}

	public List<LitePosition> decodeInPositions(String encoded) {
		return decodeInPositions(encoded, DEFAULT_PRECISION);
	}

	public List<LitePosition> decodeTimeAwarePolylineInPositions(String encoded) {
		return decodeTimeAwarePolylineInPositions(encoded, DEFAULT_PRECISION);
	}




	/**
	 * Precision should be something like 1E5 or 1E6. For OSRM routes found precision was 1E6, not the original default
	 * 1E5.
	 *
	 * @param encoded
	 * @param precision
	 * @return
	 */
	public List<com.fretron.utils.PolylineUtils.Point> decode(String encoded, double precision) {

		List<com.fretron.utils.PolylineUtils.Point> track = new ArrayList<>();

		int index = 0;
		int lat = 0, lng = 0;

		while (index < encoded.length()) {
			int b, shift = 0, result = 0;
			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
			lat += dlat;

			shift = 0;
			result = 0;
			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
			lng += dlng;

			com.fretron.utils.PolylineUtils.Point p = new com.fretron.utils.PolylineUtils.Point((double) lat / precision, (double) lng / precision);
			track.add(p);
		}
		return track;
	}


	/**
	 * Precision should be something like 1E5 or 1E6. For OSRM routes found precision was 1E6, not the original default
	 * 1E5.
	 *
	 * @param encoded
	 * @param precision
	 * @return
	 */

	public List<PointAtTime> decodeTimeAwarePolyline(String encoded, double precision) {

		List<PointAtTime> track = new ArrayList<PointAtTime>();
		int index = 0;
		int lat = 0, lng = 0 ;
		long time = 0 ,lb, lresult = 0;

		while (index < encoded.length()) {
			int b, shift = 0, result = 0;
			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
			lat += dlat;

			shift = 0;
			result = 0;
			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
			lng += dlng;


			shift = 0;
			lresult = 0; // lresult used for long data type result

			do {
				lb = encoded.charAt(index++) - 63;
				lresult |= (lb & 0x1f) << shift;
				shift += 5;
			} while (lb >= 0x20);

			long dtime =  ((lresult & 1) != 0 ? ~(lresult >> 1) : (lresult >> 1));
			time += dtime;

			PointAtTime p = new PointAtTime(time,(double) lat / precision, (double) lng / precision );
			track.add(p);

		}
		return track;
	}



	/**
	 * Precision should be something like 1E5 or 1E6. For OSRM routes found precision was 1E6, not the original default
	 * 1E5.
	 *
	 * @param encoded
	 * @param precision
	 * @return
	 */
	public List<Point> decodeTimeAwarePolylineForCompression(String encoded, double precision) {

		List<Point> track = new ArrayList<Point>();
		int index = 0;
		int lat = 0, lng = 0 ;
		long time = 0 ,lb, lresult = 0;

		while (index < encoded.length()) {
			int b, shift = 0, result = 0;
			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
			lat += dlat;

			shift = 0;
			result = 0;
			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
			lng += dlng;


			shift = 0;
			lresult = 0; // lresult used for long data type result

			do {
				lb = encoded.charAt(index++) - 63;
				lresult |= (lb & 0x1f) << shift;
				shift += 5;
			} while (lb >= 0x20);

			long dtime =  ((lresult & 1) != 0 ? ~(lresult >> 1) : (lresult >> 1));
			time += dtime;

			Point p = p((double) lat / precision,(double) lng / precision,time);

			track.add(p);

		}
		return track;
	}



	/**
	 * Precision should be something like 1E5 or 1E6. For OSRM routes found precision was 1E6, not the original default
	 * 1E5.
	 *
	 * @param encoded
	 * @param precision
	 * @return
	 */
	public List<LitePosition> decodeInPositions(String encoded, double precision) {
		List<LitePosition> track = new ArrayList<LitePosition>();
		int index = 0;
		int lat = 0, lng = 0;

		while (index < encoded.length()) {
			int b, shift = 0, result = 0;
			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
			lat += dlat;

			shift = 0;
			result = 0;
			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
			lng += dlng;

			LitePosition p = new LitePosition((double) lat / precision, (double) lng / precision , 0d,0d ,"" , 0l ,"","" , null , null);
			track.add(p);
		}
		return track;
	}




	/**
	 * Precision should be something like 1E5 or 1E6. For OSRM routes found precision was 1E6, not the original default
	 * 1E5.
	 *
	 * @param encoded
	 * @param precision
	 * @return
	 */
	public List<LitePosition> decodeTimeAwarePolylineInPositions(String encoded, double precision) {

		List<LitePosition> track = new ArrayList<LitePosition>();
		int index = 0;
		int lat = 0, lng = 0 ;
		long time = 0 ,lb, lresult = 0;

		while (index < encoded.length()) {
			int b, shift = 0, result = 0;
			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
			lat += dlat;

			shift = 0;
			result = 0;
			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
			lng += dlng;


			shift = 0;
			lresult = 0; // lresult used for long data type result

			do {
				lb = encoded.charAt(index++) - 63;
				lresult |= (lb & 0x1f) << shift;
				shift += 5;
			} while (lb >= 0x20);

			long dtime =  ((lresult & 1) != 0 ? ~(lresult >> 1) : (lresult >> 1));
			time += dtime;
			LitePosition p = new LitePosition((double) lat / precision, (double) lng / precision , 0d,0d,"" , time ,"","" , null , null);
			track.add(p);
		}
		return track;
	}






}
