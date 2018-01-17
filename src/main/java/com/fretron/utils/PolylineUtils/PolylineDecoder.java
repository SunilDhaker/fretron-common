package com.fretron.utils.PolylineUtils;

/**
 * Created by sdhaker on 21/07/17.
 */

import com.fretron.Model.LitePosition;

import java.util.ArrayList;
import java.util.List;

/**
 * Port to Java of Mark McClures Javascript OnlinePolylineEncoder :
 * http://facstaff.unca.edu/mcmcclur/GoogleMaps/EncodePolyline/decode.js
 */

public class PolylineDecoder {
	private static final double DEFAULT_PRECISION = 1E5;

	public List<Point> decode(String encoded) {
		return decode(encoded, DEFAULT_PRECISION);
	}
	public List<LitePosition> decodeInPositions(String encoded) {
		return decodeInPositions(encoded, DEFAULT_PRECISION);
	}

	/**
	 * Precision should be something like 1E5 or 1E6. For OSRM routes found precision was 1E6, not the original default
	 * 1E5.
	 *
	 * @param encoded
	 * @param precision
	 * @return
	 */
	public List<Point> decode(String encoded, double precision) {
		List<Point> track = new ArrayList<Point>();
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

			Point p = new Point((double) lat / precision, (double) lng / precision);
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

			LitePosition p = new LitePosition((double) lat / precision, (double) lng / precision , 0d , 0l ,"","" , null , null);
			track.add(p);
		}
		return track;
	}

}
