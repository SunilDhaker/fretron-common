package com.fretron.Utils.Geospacial.PolylineUtils;

/**
 * Created by sdhaker on 21/07/17.
 */

import java.util.List;

public class PolylineUtils {

  public static String toString(List<Point> polyline) {
    String str = "[ ";
    for (Point p : polyline) {
      str += p;
    }
    return str + " ]";
  }

  public static String toMarkers(List<Point> polyline) {
    String str = "";
    for (Point p : polyline) {
      str += "|" + p.getLat() + "," + p.getLng();
    }
    return str.substring(1, str.length());
  }

}
