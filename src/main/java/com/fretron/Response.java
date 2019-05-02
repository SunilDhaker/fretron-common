package com.fretron;


import org.apache.avro.specific.SpecificRecord;
import org.json.JSONObject;

public class Response<T> {

    int code;
    String error;
    T data;

    private Response(int code, String error, T data) {

        this.code = code;
        this.error = error;
        this.data = data;
    }


    public static <T> Response<T> ok(T data) {

        return new Response<T>(200, null, data);
    }


    public static Response error(String error) {

        return new Response<SpecificRecord>(400, error, null);
    }


    @Override
    public String toString() {
        JSONObject response = new JSONObject();
        response.put("status", code);
        if (error == null) response.put("error", JSONObject.NULL);
        else response.put("error", error);
        if (data == null) response.put("data", JSONObject.NULL);
        else response.put("data", data);
        return response.toString();
    }
}

