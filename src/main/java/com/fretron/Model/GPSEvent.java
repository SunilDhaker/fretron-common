/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class GPSEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -9125909090760855848L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GPSEvent\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"payload\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"VehicleGpsState\",\"fields\":[{\"name\":\"isManuallyAdded\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isIgnore\",\"type\":\"boolean\",\"default\":false},{\"name\":\"startTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"startLocation\",\"type\":{\"type\":\"record\",\"name\":\"LitePosition\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"},{\"name\":\"speed\",\"type\":\"double\"},{\"name\":\"course\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"decoder\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lngLat\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"isFillingEnabled\",\"type\":\"boolean\",\"default\":false},{\"name\":\"odometer\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Odometer\",\"fields\":[{\"name\":\"softwareMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"lastUpdateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isSoftwareMeterManuallyCalibrated\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"lastCalibrationTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"hardwareReading\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"hardwareDistance\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null}]}},{\"name\":\"endLocation\",\"type\":\"LitePosition\"},{\"name\":\"sigmasq\",\"type\":\"double\"},{\"name\":\"mean\",\"type\":\"LitePosition\"},{\"name\":\"totalDistance\",\"type\":\"double\"},{\"name\":\"totalTime\",\"type\":\"long\"},{\"name\":\"averageOfSpeed\",\"type\":\"double\"},{\"name\":\"averageSpeeds\",\"type\":\"double\"},{\"name\":\"numberOfRecord\",\"type\":\"int\"},{\"name\":\"lateArrivedRecordsCount\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"GPSState\",\"symbols\":[\"Stopped\",\"Moving\",\"Overspeeding\",\"Disconnected\",\"Unknown\"]}]},{\"name\":\"encodedPolyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timeAwarePolyline\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TimeAwarePolyline\",\"fields\":[{\"name\":\"polyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"compressedPolyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastPoint\",\"type\":{\"type\":\"record\",\"name\":\"PointAtTime\",\"fields\":[{\"name\":\"timestamp\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"],\"default\":null}]}},{\"name\":\"isAssumed\",\"type\":\"boolean\",\"default\":false},{\"name\":\"totalPoints\",\"type\":[\"null\",\"int\"],\"default\":null}]}],\"default\":null},{\"name\":\"polylineSegments\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TimeAwarePolyline\"}],\"default\":null},{\"name\":\"recalculatedDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"odoMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"lastOdoMeterReading\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"isDisconnected\",\"type\":\"boolean\",\"default\":false},{\"name\":\"eventType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"batteryStatus\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastStateOdometer\",\"type\":[\"null\",\"Odometer\"],\"default\":null},{\"name\":\"odometer\",\"type\":[\"null\",\"Odometer\"],\"default\":null},{\"name\":\"clusters\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Properties\",\"fields\":[{\"name\":\"catagory\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"level\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"customeFields\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"hasUTurn\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"tripPoints\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TripPoint\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"imei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"purpose\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sequenceId\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"place\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Place\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"center\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"suggestedRadius\",\"type\":\"double\",\"default\":null},{\"name\":\"viewport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ViewPort\",\"fields\":[{\"name\":\"northeast\",\"type\":[\"null\",\"Location\"],\"default\":null},{\"name\":\"southwest\",\"type\":[\"null\",\"Location\"],\"default\":null}]}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"boundary\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"eta\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"remainingDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"plannedArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"assosiatedShipmentsId\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"creationTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"outOfTrackSince\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isOutOfTrack\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isAutoCompleted\",\"type\":\"boolean\",\"default\":false},{\"name\":\"coveredDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"purposedDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"forShipmentStages\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"currentLocation\",\"type\":[\"null\",\"LitePosition\"],\"default\":null},{\"name\":\"hub\",\"type\":[\"null\",\"Place\"],\"default\":null},{\"name\":\"expectedActivityStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actua","lActivityStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualActivityEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"updates\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Updates\",\"fields\":[{\"name\":\"forwardReasons\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"resourceType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resourceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"currentGpsState\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LiteVehicleGpsState\",\"fields\":[{\"name\":\"startTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"startLocation\",\"type\":\"LitePosition\"},{\"name\":\"endLocation\",\"type\":\"LitePosition\"},{\"name\":\"mean\",\"type\":[\"null\",\"LitePosition\"],\"default\":null},{\"name\":\"totalDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"totalTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"averageSpeeds\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"numberOfRecord\",\"type\":\"int\"},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"state\",\"type\":[\"null\",\"GPSState\"]},{\"name\":\"isDisconnected\",\"type\":\"boolean\",\"default\":false},{\"name\":\"eventType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null}]}}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String type;
  @Deprecated public com.fretron.Model.VehicleGpsState payload;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GPSEvent() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param payload The new value for payload
   */
  public GPSEvent(java.lang.String type, com.fretron.Model.VehicleGpsState payload) {
    this.type = type;
    this.payload = payload;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return payload;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.String)value$; break;
    case 1: payload = (com.fretron.Model.VehicleGpsState)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.String value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'payload' field.
   * @return The value of the 'payload' field.
   */
  public com.fretron.Model.VehicleGpsState getPayload() {
    return payload;
  }

  /**
   * Sets the value of the 'payload' field.
   * @param value the value to set.
   */
  public void setPayload(com.fretron.Model.VehicleGpsState value) {
    this.payload = value;
  }

  /**
   * Creates a new GPSEvent RecordBuilder.
   * @return A new GPSEvent RecordBuilder
   */
  public static com.fretron.Model.GPSEvent.Builder newBuilder() {
    return new com.fretron.Model.GPSEvent.Builder();
  }

  /**
   * Creates a new GPSEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GPSEvent RecordBuilder
   */
  public static com.fretron.Model.GPSEvent.Builder newBuilder(com.fretron.Model.GPSEvent.Builder other) {
    return new com.fretron.Model.GPSEvent.Builder(other);
  }

  /**
   * Creates a new GPSEvent RecordBuilder by copying an existing GPSEvent instance.
   * @param other The existing instance to copy.
   * @return A new GPSEvent RecordBuilder
   */
  public static com.fretron.Model.GPSEvent.Builder newBuilder(com.fretron.Model.GPSEvent other) {
    return new com.fretron.Model.GPSEvent.Builder(other);
  }

  /**
   * RecordBuilder for GPSEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GPSEvent>
    implements org.apache.avro.data.RecordBuilder<GPSEvent> {

    private java.lang.String type;
    private com.fretron.Model.VehicleGpsState payload;
    private com.fretron.Model.VehicleGpsState.Builder payloadBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.GPSEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.payload)) {
        this.payload = data().deepCopy(fields()[1].schema(), other.payload);
        fieldSetFlags()[1] = true;
      }
      if (other.hasPayloadBuilder()) {
        this.payloadBuilder = com.fretron.Model.VehicleGpsState.newBuilder(other.getPayloadBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing GPSEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.GPSEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.payload)) {
        this.payload = data().deepCopy(fields()[1].schema(), other.payload);
        fieldSetFlags()[1] = true;
      }
      this.payloadBuilder = null;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.String getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.fretron.Model.GPSEvent.Builder setType(java.lang.String value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.fretron.Model.GPSEvent.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'payload' field.
      * @return The value.
      */
    public com.fretron.Model.VehicleGpsState getPayload() {
      return payload;
    }

    /**
      * Sets the value of the 'payload' field.
      * @param value The value of 'payload'.
      * @return This builder.
      */
    public com.fretron.Model.GPSEvent.Builder setPayload(com.fretron.Model.VehicleGpsState value) {
      validate(fields()[1], value);
      this.payloadBuilder = null;
      this.payload = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'payload' field has been set.
      * @return True if the 'payload' field has been set, false otherwise.
      */
    public boolean hasPayload() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'payload' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.VehicleGpsState.Builder getPayloadBuilder() {
      if (payloadBuilder == null) {
        if (hasPayload()) {
          setPayloadBuilder(com.fretron.Model.VehicleGpsState.newBuilder(payload));
        } else {
          setPayloadBuilder(com.fretron.Model.VehicleGpsState.newBuilder());
        }
      }
      return payloadBuilder;
    }

    /**
     * Sets the Builder instance for the 'payload' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.GPSEvent.Builder setPayloadBuilder(com.fretron.Model.VehicleGpsState.Builder value) {
      clearPayload();
      payloadBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'payload' field has an active Builder instance
     * @return True if the 'payload' field has an active Builder instance
     */
    public boolean hasPayloadBuilder() {
      return payloadBuilder != null;
    }

    /**
      * Clears the value of the 'payload' field.
      * @return This builder.
      */
    public com.fretron.Model.GPSEvent.Builder clearPayload() {
      payload = null;
      payloadBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public GPSEvent build() {
      try {
        GPSEvent record = new GPSEvent();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.String) defaultValue(fields()[0]);
        if (payloadBuilder != null) {
          record.payload = this.payloadBuilder.build();
        } else {
          record.payload = fieldSetFlags()[1] ? this.payload : (com.fretron.Model.VehicleGpsState) defaultValue(fields()[1]);
        }
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
