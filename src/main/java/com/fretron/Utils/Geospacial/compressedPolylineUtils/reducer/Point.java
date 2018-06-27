package com.fretron.Utils.Geospacial.compressedPolylineUtils.reducer;

/**
 * Represents a point on a plane. A point consists of 2 coordinates - x and y.
 */
public interface Point {

  double getX();

  double getY();

  long getT();

}
