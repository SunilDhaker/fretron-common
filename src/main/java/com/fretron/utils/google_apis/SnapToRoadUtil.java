package com.fretron.utils.google_apis;

import com.fretron.Model.PointAtTime;
import com.fretron.utils.PolylineUtils.Point;
import com.ning.http.util.UriEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SnapToRoadUtil {

    public static final String api_key = "AIzaSyAiKyto-33wx4RvJw7kplHqSdyacUseGZw";
    public static final Boolean isInterpolate = false;

    private static String getUrl(String points){
        String query = "";
        try {
            query =   URLEncoder.encode(points ,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return  "https://roads.googleapis.com/v1/snapToRoads?path="+query+"&interpolate="+isInterpolate+"&key="+api_key;
    }


    public static String getQuery(List<PointAtTime> points){
        String query = "";
        Iterator<PointAtTime> it = points.iterator();

        while (it.hasNext()){
            PointAtTime p = it.next();
            query = query + ((query.length() > 0) ? "|" : "")+p.getLatitude() + ","+p.getLongitude();
        }

        return query;
    }


    /**
     *
     * @param points points string must be in following format lat1,lng1|lat2,lng2|lat3,lng3
     */
    private static JSONArray snappedPoints(String points) throws Exception{

        DefaultHttpClient httpClient = new DefaultHttpClient();
        String apiURL = getUrl(points);
        HttpGet get = new HttpGet(apiURL);
        HttpResponse response = httpClient.execute(get);
        HttpEntity entity = response.getEntity();
        String responseString = EntityUtils.toString(entity);
        JSONObject responseObj = new JSONObject(responseString);
        return responseObj.getJSONArray("snappedPoints");

    }

    public static ArrayList<Point> snap(String query) throws Exception{

        ArrayList<Point> result = new ArrayList<>();
        JSONArray snappedPoints = snappedPoints(query);

        for (Object json: snappedPoints){
            JSONObject jsonObj = (JSONObject)json;
            JSONObject location = jsonObj.getJSONObject("location");
            result.add(new Point(location.getDouble("latitude") ,location.getDouble("longitude")));
        }
        return result;

    }


    public static List<PointAtTime> snapRouteWithTime(String query ,List<PointAtTime> points){
        try {
            JSONArray snappedPoints = snappedPoints(query);
             PointAtTime sp = points.get(0);
             PointAtTime ep = points.get(points.size()-1);
             long delta = ep.getTimestamp() - sp.getTimestamp();
            if ((snappedPoints.length() > 0)){
                List<PointAtTime> list = new ArrayList<>();
                long timestamp = sp.getTimestamp();
                for (int index = 0 ; index < snappedPoints.length() ;index++){
                    JSONObject jsonObj = snappedPoints.getJSONObject(index);
                    JSONObject location = jsonObj.getJSONObject("location");
                    list.add(new PointAtTime(timestamp ,location.getDouble("latitude"),location.getDouble("longitude")));
                      timestamp += delta;
                }

                return list;
            }else {
                System.out.println("SnapToRoad snapped points size different from original, may be interpolation is true" +(points.size() - snappedPoints.length()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return points;

    }





}
