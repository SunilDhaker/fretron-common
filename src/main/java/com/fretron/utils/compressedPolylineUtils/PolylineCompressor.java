package com.fretron.utils.compressedPolylineUtils;


import com.fretron.Constant.Constants;
import com.fretron.Model.PointAtTime;
import com.fretron.Model.TimeAwarePolyline;
import com.fretron.utils.compressedPolylineUtils.reducer.Point;
import com.fretron.utils.compressedPolylineUtils.reducer.SeriesReducer;
import com.fretron.utils.PolylineUtils.PolylineDecoder;
import java.util.List;


import static com.fretron.utils.PolylineUtils.OnlinePolylineEncoder.*;

public class PolylineCompressor {

    private PolylineDecoder decoder;

    public PolylineCompressor(){

        decoder = new PolylineDecoder();
    }



    public List<Point> getCompressedPointList(List<Point> points){

        return  SeriesReducer.reduce(points, Constants.ep);

    }



    public TimeAwarePolyline compress(TimeAwarePolyline polylineObj){

        try {

            String polyline = polylineObj.getPolyline();

            if (polyline != null) {

                List<Point> points = decoder.decodeTimeAwarePolylineForCompression(polyline);

                List<Point> compressedPointList = getCompressedPointList(points);

                TimeAwarePolyline compressedPolylineObj = extendTimeAwarePolyline(new TimeAwarePolyline("", "", new PointAtTime(0l, 0d, 0d)), compressedPointList.get(0).getX(), compressedPointList.get(0).getX(), compressedPointList.get(0).getT());

                for (int index = 1; index < compressedPointList.size(); index++) {

                    compressedPolylineObj = extendTimeAwarePolyline(compressedPolylineObj, compressedPointList.get(index).getX(), compressedPointList.get(index).getY(), compressedPointList.get(index).getT());
                }

                return compressedPolylineObj;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return polylineObj;
    }
}
