package com.fretron;


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


  public static <T> Response<T> error(String message){

    return new Response<T>(400 , message , null);
  }


  @Override
  public String toString() {
    return "{ \"status\" : "+ code +" , \"message\" : \"" + message + "\" , \"data\" : " + data + " }";
  }
}

