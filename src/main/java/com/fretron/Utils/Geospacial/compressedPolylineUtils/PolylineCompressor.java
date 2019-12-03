package com.fretron.Utils.Geospacial.compressedPolylineUtils;

import com.fretron.Constant.Constants;
import com.fretron.Logger.Log;
import com.fretron.Model.PointAtTime;
import com.fretron.Model.TimeAwarePolyline;
import com.fretron.Utils.Geospacial.PolylineUtils.OnlinePolylineEncoder;
import com.fretron.Utils.Geospacial.PolylineUtils.PolylineDecoder;
import com.fretron.Utils.Geospacial.compressedPolylineUtils.reducer.Point;
import com.fretron.Utils.Geospacial.compressedPolylineUtils.reducer.SeriesReducer;

import java.util.List;

public class PolylineCompressor {

  private static PolylineCompressor instance;
  private PolylineDecoder decoder;

  private PolylineCompressor() {
    Log.info(PolylineCompressor.class, "constructor called.");
    decoder = PolylineDecoder.getInstance();
  }

  public static PolylineCompressor getCompressor() {
    if (instance == null) {
      instance = new PolylineCompressor();
    }
    return instance;
  }


  private List<Point> getCompressedPointList(List<Point> points) {
    return SeriesReducer.reduce(points, Constants.ep);

  }


  public TimeAwarePolyline compress(TimeAwarePolyline polylineObj) {
    try {
      String polyline = polylineObj.getPolyline();
      if (polyline != null) {
        List<Point> points = decoder.decodeTimeAwarePolylineForCompression(polyline);
        if (points.size() > 0) {
          List<Point> compressedPointList = getCompressedPointList(points);
          TimeAwarePolyline compressedPolylineObj = OnlinePolylineEncoder.INSTANCE
              .extendTimeAwarePolyline(new TimeAwarePolyline("", "", new PointAtTime(0L, 0d, 0d),
                      polylineObj.getIsAssumed(), 1), compressedPointList.get(0).getX(),
                  compressedPointList.get(0).getY(), compressedPointList.get(0).getT());
          for (int index = 1; index < compressedPointList.size(); index++) {
            compressedPolylineObj = OnlinePolylineEncoder.INSTANCE
                .extendTimeAwarePolyline(compressedPolylineObj,
                    compressedPointList.get(index).getX(), compressedPointList.get(index).getY(),
                    compressedPointList.get(index).getT());
          }
          return compressedPolylineObj;
        }

      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    return polylineObj;
  }
}
