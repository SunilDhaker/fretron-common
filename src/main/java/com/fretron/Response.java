package com.fretron;


import org.apache.avro.specific.SpecificRecord;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Response<T> {
    int code;
    String error;
    T data;
    Long syncUpTime;


    private Response(int code, String error, T data, Long syncUpTime) {
        this.code = code;
        this.error = error;
        this.data = data;
        this.syncUpTime = syncUpTime;
    }


    public static <T> Response<T> ok(T data) {
        return new Response<T>(200, null, data, null);
    }

    public static <T> Response<T> ok(T data, Long syncUpTime) {
        return new Response<T>(200, null, data, syncUpTime);
    }

    public static Response error(String error) {
        return new Response<SpecificRecord>(400, error, null, null);
    }
    public static Response error(int code,String error) {
        return new Response<SpecificRecord>(code, error, null, null);
    }
    private JSONObject covertIntoJSONObject(T json) {
        try {
            return new JSONObject(json.toString());
        } catch (JSONException e) {
            return null;
        }
    }


    @Override
    public String toString() {
        JSONObject response = new JSONObject();
        response.put("status", code);
        if (error == null) response.put("error", JSONObject.NULL);
        else response.put("error", error);
        if (data == null) {
            response.put("data", JSONObject.NULL);
        } else {
            if (data instanceof JSONObject || data instanceof JSONArray || data instanceof String) {
                response.put("data", data);
            } else {
                if (data instanceof SpecificRecord) {
                    response.put("data", new JSONObject(data.toString()));
                } else if (data instanceof List) {
                    response.put("data", new JSONArray((data.toString())));
                } else {
                    JSONObject obj = covertIntoJSONObject(data);
                    if ((obj == null)) {
                        response.put("data", data);
                    } else {
                        response.put("data", obj);
                    }
                }
            }

        }
        if (syncUpTime != null) response.put("syncUpTime", syncUpTime);
        return response.toString();

//        if (data instanceof String) {
//            return "{ \"status\" : " + code + " , \"error\" : \"" + error + "\" , \"data\" : \"" + data + "\" }";
//        }
//        return "{ \"status\" : " + code + " , \"error\" : \"" + error + "\" , \"data\" : " + data + " }";
    }


}


