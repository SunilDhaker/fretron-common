package com.fretron;


import org.apache.avro.specific.SpecificRecord;

public class Response<T> {

  int code ;
  String message ;
  T data;


  private Response(int code , String message, T data){

    this.code = code;
    this.message = message;
    this.data = data;
  }


  public static <T> Response<T> ok(T data){

    return new Response<T>(200 , null , data);
  }


  public static  Response error(String message){

    return new Response<SpecificRecord>(400 , message , null);
  }


  @Override
  public String toString() {
    return "{ \"status\" : "+ code +" , \"message\" : \"" + message + "\" , \"data\" : " + data + " }";
  }
}

