package com.fretron.Utils.Geospacial;

import com.fretron.Model.Geofence;
import com.fretron.Model.Location;
import java.util.ArrayList;

/**
 * Created by sdhaker on 17/08/17.
 */
public class GeoSpecial {

  private static double DegreesToRadians = Math.PI / 180.0;
  private static double RadiansToDegrees = 180.0 / Math.PI;
  private static double EarthRadius = 6378137.0;


  public static boolean onSegment(Location p, Location q, Location r) {
    return q.latitude <= Math.max(p.latitude, r.latitude) && q.latitude >= Math
        .min(p.latitude, r.latitude)
        && q.longitude <= Math.max(p.longitude, r.longitude) && q.longitude >= Math
        .min(p.longitude, r.longitude);
  }

  public static int orientation(Location p, Location q, Location r) {
    double val =
        (q.longitude - p.longitude) * (r.latitude - q.latitude) - (q.latitude - p.latitude) * (
            r.longitude - q.longitude);

    if (val == 0) {
      return 0;
    }
    return (val > 0) ? 1 : 2;
  }

  public static boolean doIntersect(Location p1, Location q1, Location p2, Location q2) {

    int o1 = orientation(p1, q1, p2);
    int o2 = orientation(p1, q1, q2);
    int o3 = orientation(p2, q2, p1);
    int o4 = orientation(p2, q2, q1);

    if (o1 != o2 && o3 != o4) {
      return true;
    }

    if (o1 == 0 && onSegment(p1, p2, q1)) {
      return true;
    }

    if (o2 == 0 && onSegment(p1, q2, q1)) {
      return true;
    }

    if (o3 == 0 && onSegment(p2, p1, q2)) {
      return true;
    }

    return o4 == 0 && onSegment(p2, q1, q2);

  }

  public static boolean isInside(Location polygon[], int n, Location p) {
    double INF = 10000;
    if (n < 3) {
      return false;
    }

    Location extreme = new Location(INF, p.longitude);

    int count = 0, i = 0;
    do {
      int next = (i + 1) % n;
      if (doIntersect(polygon[i], polygon[next], p, extreme)) {
        if (orientation(polygon[i], p, polygon[next]) == 0) {
          return onSegment(polygon[i], p, polygon[next]);
        }

        count++;
      }
      i = next;
    } while (i != 0);

    return (count & 1) == 1;
  }

  public static boolean isInside(ArrayList<Location> polygon, Location p) {

    //return isInside( polygon.toArray(new Location[polygon.size()]) , polygon.size() - 1 , p);
    return coordinateInRegion(polygon, p);
  }

  public static boolean isInside(Location location, Geofence geofence) {

    return coordinateInRegion(new ArrayList<>(geofence.boundry), location);
  }

  public static boolean coordinateInRegion(ArrayList<Location> regionIn, Location coord) {

    ArrayList<Location> region = regionIn;
    if (region.get(region.size() - 1).longitude == region.get(0).longitude
        && region.get(region.size() - 1).latitude == region.get(0).latitude) {
      region = new ArrayList<>(regionIn);
      region.remove(0);
    }
    int i, j;
    boolean isInside = false;
    //create an array of coordinates from the region boundary list
    Location[] verts = region.toArray(new Location[region.size()]);
    int sides = verts.length;
    for (i = 0, j = sides - 1; i < sides; j = i++) {
      //verifying if your coordinate is inside your region
      if (
          ((
              (verts[i].getLongitude() <= coord.getLongitude()) && (coord.getLongitude() < verts[j]
                  .getLongitude())
          ) || (
              (verts[j].getLongitude() <= coord.getLongitude()) && (coord.getLongitude() < verts[i]
                  .getLongitude())
          )
          ) &&
              (coord.getLatitude() <
                  (verts[j].getLatitude() - verts[i].getLatitude()) * (coord.getLongitude()
                      - verts[i].getLongitude()) / (verts[j].getLongitude() - verts[i]
                      .getLongitude()) + verts[i].getLatitude())
          ) {
        isInside = !isInside;
      }
    }
    return isInside;
  }

  public static Location getAPointOutsidePolygon(ArrayList<Location> polygone) {

    //Will Handle most of the case
    ArrayList<Location> circularPoints = getNPointsOnPerimeter(polygone.get(0), 0.01, 10);
    for (Location l : circularPoints) {
      if (!isInside(polygone, l)) {
        return l;
      }
    }

    //fall back
    //depth search expansive
    circularPoints = getNPointsOnPerimeter(polygone.get(0), 0.01, 360);
    for (Location l : circularPoints) {
      if (!isInside(polygone, l)) {
        return l;
      }
    }

    return null; // i do want to crash if such thing happen to see what caused it
  }

  public static Location getAPointInsidePolygon(ArrayList<Location> polygone) {

    //Will Handle most of the case
    ArrayList<Location> circularPoints = getNPointsOnPerimeter(polygone.get(0), 0.01, 10);
    for (Location l : circularPoints) {
      if (isInside(polygone, l)) {
        return l;
      }
    }

    //fall back
    //depth search expansive
    circularPoints = getNPointsOnPerimeter(polygone.get(1), 0.01, 360);
    for (Location l : circularPoints) {
      if (isInside(polygone, l)) {
        return l;
      }
    }

    return null; // i do want to crash if such thing happen to see what caused it
  }

  public static ArrayList<Location> getNPointsOnPerimeter(Location center, double radius,
      int number) {

    ArrayList<Location> points = new ArrayList<>();

    double diff = 360d / number;
    for (int i = 0; i < number; i++) {

      points.add(CalculateDerivedPosition(center, radius, i * diff));
    }
    return points;
  }

  public static Location calculateDerivedPosition(Location source, double range, double bearing) {
    double latA = source.latitude * DegreesToRadians;
    double lonA = source.longitude * DegreesToRadians;
    double angularDistance = range / EarthRadius;
    double trueCourse = bearing * DegreesToRadians;

    double lat = Math.asin(
        Math.sin(latA) * Math.cos(angularDistance) +
            Math.cos(latA) * Math.sin(angularDistance) * Math.sin(trueCourse));

    double dlon = Math.atan2(
        Math.sin(trueCourse) * Math.sin(angularDistance) * Math.cos(latA),
        Math.cos(angularDistance) - Math.sin(latA) * Math.sin(lat));

    double lon = ((lonA + dlon + Math.PI) % (Math.PI * 2)) - Math.PI;

    return new Location(
        lat * RadiansToDegrees,
        lon * RadiansToDegrees
    );
  }

  public static Location CalculateDerivedPosition(Location source, double range, double bearing) {
    double latA = source.latitude * DegreesToRadians;
    double lonA = source.longitude * DegreesToRadians;
    double angularDistance = range / EarthRadius;
    double trueCourse = bearing * DegreesToRadians;

    double lat = Math.asin(
        Math.sin(latA) * Math.cos(angularDistance) +
            Math.cos(latA) * Math.sin(angularDistance) * Math.cos(trueCourse));

    double dlon = Math.atan2(
        Math.sin(trueCourse) * Math.sin(angularDistance) * Math.sin(latA),
        Math.cos(angularDistance) - Math.sin(latA) * Math.sin(lat));

    double lon = ((lonA + dlon + Math.PI) % (Math.PI * 2)) - Math.PI;

    return new Location(
        lat * RadiansToDegrees,
        lon * RadiansToDegrees
    );
  }

  public static double toRAD(double NUM) {
    return NUM * Math.PI / 180;
  }

  public static double toDeg(double NUM) {
    return NUM * 180 / Math.PI;
  }

}

