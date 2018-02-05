package com.fretron.utils.compressedPolylineUtils;



import com.fretron.Constant.Constants;
import com.fretron.Model.PointAtTime;
import com.fretron.Model.TimeAwarePolyline;
import com.fretron.utils.compressedPolylineUtils.reducer.SeriesReducer;
import com.fretron.utils.PolylineUtils.Point;
import com.fretron.utils.PolylineUtils.PolylineDecoder;


import javax.json.JsonObject;

import static com.fretron.utils.compressedPolylineUtils.reducer.PointImpl.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.fretron.utils.PolylineUtils.OnlinePolylineEncoder.*;

public class CompressPolyline {
       public List<com.fretron.utils.compressedPolylineUtils.reducer.Point> getCompressedPointList(List<PointAtTime> points){

           List<com.fretron.utils.compressedPolylineUtils.reducer.Point> dataList= new ArrayList<>(Arrays.asList());

           for(int i=0;i< points.size();i++){

               com.fretron.utils.compressedPolylineUtils.reducer.Point x = p(points.get(i).getLatitude(),points.get(i).getLongitude(),points.get(i).getTimestamp());

               dataList.addAll(Arrays.asList(x));

           }
           return  SeriesReducer.reduce(dataList, Constants.ep);
       }
}
