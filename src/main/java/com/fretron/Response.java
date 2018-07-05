package com.fretron;


import org.apache.avro.specific.SpecificRecord;

public class Response<T> {

  int code ;
  String error;
  T data;


  private Response(int code , String error, T data){

    this.code = code;
    this.error = error;
    this.data = data;
  }


  public static <T> Response<T> ok(T data){

    return new Response<T>(200 , null , data);
  }


  public static  Response error(String error){

    return new Response<SpecificRecord>(400 , error , null);
  }


  @Override
  public String toString() {
    return "{ \"status\" : "+ code +" , \"error\" : \"" + error + "\" , \"data\" : " + data + " }";
  }
}

