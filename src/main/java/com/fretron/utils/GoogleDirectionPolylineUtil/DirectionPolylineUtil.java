package com.fretron.utils.GoogleDirectionPolylineUtil;

/**
 * Created by Mohit on 23-11-2017.
 */


import static com.fretron.utils.PolylineUtils.OnlinePolylineEncoder.mergePolylines;

import java.util.HashMap;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;



public final class DirectionPolylineUtil {

    private  static String API_KEY = "AIzaSyAiKyto-33wx4RvJw7kplHqSdyacUseGZw";
    private  static String API_URL = "https://maps.googleapis.com/maps/api/directions/json?";
    private  static String ROUTES_KEY = "routes";
    private  static String OVERVIEW_POLYLINE = "overview_polyline";
    private  static String POINTS_KEY = "points";
    private  static String LEGS_KEY = "legs";
    private  static String STEPS_KEY = "steps";

    public   static String POLYLINE_KEY = "polyline";
    public   static  String DISTANCE_KEY = "distance";

    // false : For Detailed Points String
    public static Boolean isOverview = false;
    private  static Double distance;



//https://maps.googleapis.com/maps/api/directions/json?origin=Disneyland&destination=Universal+Studios+Hollywood4&key=AIzaSyBs7T9fTwzqLFJpJv35xToAbJKwLC3OOfo

    private static String getApiUrl(String statrLocation, String endLocation ,Boolean isDrivingMode) {
        //driving by default
        return (isDrivingMode) ? API_URL + "origin=" + statrLocation + "&destination=" + endLocation + "&key=" + API_KEY :
                API_URL + "origin=" + statrLocation + "&destination=" + endLocation + "&key=" + API_KEY + "&mode=walking";
    }


    public static HashMap<String ,Object> getDirectionPolyLinePoints(String startLocation, String endLocation ,Boolean isDrivingMode) throws Exception {

        DefaultHttpClient httpClient = new DefaultHttpClient();
        String apiURL = getApiUrl(startLocation, endLocation ,isDrivingMode);
        HttpGet get = new HttpGet(apiURL);
        HttpResponse response = httpClient.execute(get);
        HttpEntity entity = response.getEntity();
        String responseString = EntityUtils.toString(entity);

        JSONObject jsonObject = new JSONObject(responseString);

        distance = 0.0;

         return  (isOverview) ? getOverviewPointsString(jsonObject) : getDetailedPointsString(jsonObject);

    }


    private static HashMap<String ,Object> getOverviewPointsString(JSONObject jsonObject) {

        HashMap<String ,Object> map = new HashMap<String ,Object>();
        Double totalDistance = 0.0;


        JSONArray routes = jsonObject.getJSONArray(ROUTES_KEY);

        if (routes.length() > 0){

            JSONObject route = routes.getJSONObject(0);
            JSONObject overviewPolyline = route.getJSONObject(OVERVIEW_POLYLINE);

            for (int index = 0 ; index < route.getJSONArray(LEGS_KEY).length() ; index++) {

                JSONObject legs = route.getJSONArray(LEGS_KEY).getJSONObject(index);

                totalDistance += legs.getJSONObject(DISTANCE_KEY).getDouble("value");

            }


            map.put(DISTANCE_KEY,totalDistance);
            map.put(POLYLINE_KEY, overviewPolyline.getString(POINTS_KEY));
            return map;
        }

        return null;

    }


    private  static HashMap<String ,Object> getDetailedPointsString(JSONObject jsonObject){

        HashMap<String ,Object> map = new HashMap<String ,Object>();
        String points = new String();
        Double totalDistance = 0.0;


        JSONArray routes = jsonObject.getJSONArray(ROUTES_KEY);
        if (routes.length() > 0) {

            JSONObject route = routes.getJSONObject(0);

            for (int index = 0 ; index < route.getJSONArray(LEGS_KEY).length() ; index++){

                JSONObject legs = route.getJSONArray(LEGS_KEY).getJSONObject(index);

                totalDistance += legs.getJSONObject(DISTANCE_KEY).getDouble("value");

                JSONArray steps = legs.getJSONArray(STEPS_KEY);

                for (int step = 0; step < steps.length(); step++) {

                     String extendedPolyLine = steps.getJSONObject(step).getJSONObject(POLYLINE_KEY).getString(POINTS_KEY);
                     points = mergePolylines(points.toString(),extendedPolyLine);

                }

            }

            map.put(DISTANCE_KEY,totalDistance);
            map.put(POLYLINE_KEY,points);

            return map;

        }

      return null;
    }





}