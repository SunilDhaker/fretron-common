package com.fretron;

public class FretronException extends Exception {
  public FretronException(){
    super();
  }
  public FretronException(String msg){
    super(msg);
  }
  public FretronException(String msg , Exception e ){

  }
}
