/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum GPSState {
  Stopped, Moving, Overspeeding, Disconnected, Unknown  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"GPSState\",\"namespace\":\"com.fretron.Model\",\"symbols\":[\"Stopped\",\"Moving\",\"Overspeeding\",\"Disconnected\",\"Unknown\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
