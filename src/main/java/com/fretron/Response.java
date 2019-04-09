package com.fretron;


import org.apache.avro.specific.SpecificRecord;

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

    public static <T> Response<T> ok(T data ,Long syncUpTime) {
        return new Response<T>(200, null, data, syncUpTime);
    }


    public static Response error(String error) {
        return new Response<SpecificRecord>(400, error, null, null);
    }


    @Override
    public String toString() {
        if (data instanceof String) {
            if (syncUpTime != null){
                return "{ \"status\" : " + code + " , \"error\" : \"" + error + "\" , \"data\" : \"" + data + "\" ,\"syncUpTime\" : "+syncUpTime+" }";
            }else{
                return "{ \"status\" : " + code + " , \"error\" : \"" + error + "\" , \"data\" : \"" + data + "\" }";
            }
        }

        if (syncUpTime != null){
            return "{ \"status\" : " + code + " , \"error\" : \"" + error + "\" , \"data\" : " + data + " ,\"syncUpTime\" : "+syncUpTime+" }";

        }else{
            return "{ \"status\" : " + code + " , \"error\" : \"" + error + "\" , \"data\" : " + data + " }";

        }
    }
}


