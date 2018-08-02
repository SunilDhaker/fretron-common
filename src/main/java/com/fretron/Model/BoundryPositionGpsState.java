/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BoundryPositionGpsState extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 853259906025853996L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BoundryPositionGpsState\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"pickUpPoints\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"VehicleGpsState\",\"fields\":[{\"name\":\"isManuallyAdded\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isIgnore\",\"type\":\"boolean\",\"default\":false},{\"name\":\"startTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"startLocation\",\"type\":{\"type\":\"record\",\"name\":\"LitePosition\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"},{\"name\":\"speed\",\"type\":\"double\"},{\"name\":\"course\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"decoder\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lngLat\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"isFillingEnabled\",\"type\":\"boolean\",\"default\":false},{\"name\":\"odometer\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Odometer\",\"fields\":[{\"name\":\"softwareMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"lastUpdateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isSoftwareMeterManuallyCalibrated\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"lastCalibrationTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"hardwareReading\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"hardwareDistance\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null}]}},{\"name\":\"endLocation\",\"type\":\"LitePosition\"},{\"name\":\"sigmasq\",\"type\":\"double\"},{\"name\":\"mean\",\"type\":\"LitePosition\"},{\"name\":\"totalDistance\",\"type\":\"double\"},{\"name\":\"totalTime\",\"type\":\"long\"},{\"name\":\"averageOfSpeed\",\"type\":\"double\"},{\"name\":\"averageSpeeds\",\"type\":\"double\"},{\"name\":\"numberOfRecord\",\"type\":\"int\"},{\"name\":\"lateArrivedRecordsCount\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"GPSState\",\"symbols\":[\"Stopped\",\"Moving\",\"Overspeeding\",\"Disconnected\",\"Unknown\"]}]},{\"name\":\"encodedPolyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timeAwarePolyline\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TimeAwarePolyline\",\"fields\":[{\"name\":\"polyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"compressedPolyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastPoint\",\"type\":{\"type\":\"record\",\"name\":\"PointAtTime\",\"fields\":[{\"name\":\"timestamp\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"],\"default\":null}]}},{\"name\":\"isAssumed\",\"type\":\"boolean\",\"default\":false},{\"name\":\"totalPoints\",\"type\":[\"null\",\"int\"],\"default\":null}]}],\"default\":null},{\"name\":\"polylineSegments\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TimeAwarePolyline\"}],\"default\":null},{\"name\":\"recalculatedDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"odoMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"lastOdoMeterReading\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"isDisconnected\",\"type\":\"boolean\",\"default\":false},{\"name\":\"eventType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"batteryStatus\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastStateOdometer\",\"type\":[\"null\",\"Odometer\"],\"default\":null},{\"name\":\"odometer\",\"type\":[\"null\",\"Odometer\"],\"default\":null},{\"name\":\"clusters\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Properties\",\"fields\":[{\"name\":\"catagory\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"level\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"customeFields\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"hasUTurn\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"tripPoints\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TripPoint\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"purpose\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sequenceId\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"place\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Place\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"center\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"suggestedRadius\",\"type\":\"double\",\"default\":null},{\"name\":\"viewport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ViewPort\",\"fields\":[{\"name\":\"northeast\",\"type\":[\"null\",\"Location\"],\"default\":null},{\"name\":\"southwest\",\"type\":[\"null\",\"Location\"],\"default\":null}]}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"boundary\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"eta\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"remainingDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"plannedArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"assosiatedShipmentsId\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"creationTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"outOfTrackSince\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isOutOfTrack\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isAutoCompleted\",\"type\":\"boolean\",\"default\":false},{\"name\":\"coveredDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"purposedDistance\",\"type\":[\"null\",\"double\"],\"default\":null}]}}],\"default\":null}]}}],\"default\":null},{\"name\":\"deliveryPoints\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"VehicleGpsState\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<com.fretron.Model.VehicleGpsState> pickUpPoints;
  @Deprecated public java.util.List<com.fretron.Model.VehicleGpsState> deliveryPoints;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BoundryPositionGpsState() {}

  /**
   * All-args constructor.
   * @param pickUpPoints The new value for pickUpPoints
   * @param deliveryPoints The new value for deliveryPoints
   */
  public BoundryPositionGpsState(java.util.List<com.fretron.Model.VehicleGpsState> pickUpPoints, java.util.List<com.fretron.Model.VehicleGpsState> deliveryPoints) {
    this.pickUpPoints = pickUpPoints;
    this.deliveryPoints = deliveryPoints;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return pickUpPoints;
    case 1: return deliveryPoints;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: pickUpPoints = (java.util.List<com.fretron.Model.VehicleGpsState>)value$; break;
    case 1: deliveryPoints = (java.util.List<com.fretron.Model.VehicleGpsState>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'pickUpPoints' field.
   * @return The value of the 'pickUpPoints' field.
   */
  public java.util.List<com.fretron.Model.VehicleGpsState> getPickUpPoints() {
    return pickUpPoints;
  }

  /**
   * Sets the value of the 'pickUpPoints' field.
   * @param value the value to set.
   */
  public void setPickUpPoints(java.util.List<com.fretron.Model.VehicleGpsState> value) {
    this.pickUpPoints = value;
  }

  /**
   * Gets the value of the 'deliveryPoints' field.
   * @return The value of the 'deliveryPoints' field.
   */
  public java.util.List<com.fretron.Model.VehicleGpsState> getDeliveryPoints() {
    return deliveryPoints;
  }

  /**
   * Sets the value of the 'deliveryPoints' field.
   * @param value the value to set.
   */
  public void setDeliveryPoints(java.util.List<com.fretron.Model.VehicleGpsState> value) {
    this.deliveryPoints = value;
  }

  /**
   * Creates a new BoundryPositionGpsState RecordBuilder.
   * @return A new BoundryPositionGpsState RecordBuilder
   */
  public static com.fretron.Model.BoundryPositionGpsState.Builder newBuilder() {
    return new com.fretron.Model.BoundryPositionGpsState.Builder();
  }

  /**
   * Creates a new BoundryPositionGpsState RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BoundryPositionGpsState RecordBuilder
   */
  public static com.fretron.Model.BoundryPositionGpsState.Builder newBuilder(com.fretron.Model.BoundryPositionGpsState.Builder other) {
    return new com.fretron.Model.BoundryPositionGpsState.Builder(other);
  }

  /**
   * Creates a new BoundryPositionGpsState RecordBuilder by copying an existing BoundryPositionGpsState instance.
   * @param other The existing instance to copy.
   * @return A new BoundryPositionGpsState RecordBuilder
   */
  public static com.fretron.Model.BoundryPositionGpsState.Builder newBuilder(com.fretron.Model.BoundryPositionGpsState other) {
    return new com.fretron.Model.BoundryPositionGpsState.Builder(other);
  }

  /**
   * RecordBuilder for BoundryPositionGpsState instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BoundryPositionGpsState>
    implements org.apache.avro.data.RecordBuilder<BoundryPositionGpsState> {

    private java.util.List<com.fretron.Model.VehicleGpsState> pickUpPoints;
    private java.util.List<com.fretron.Model.VehicleGpsState> deliveryPoints;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.BoundryPositionGpsState.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.pickUpPoints)) {
        this.pickUpPoints = data().deepCopy(fields()[0].schema(), other.pickUpPoints);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.deliveryPoints)) {
        this.deliveryPoints = data().deepCopy(fields()[1].schema(), other.deliveryPoints);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BoundryPositionGpsState instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.BoundryPositionGpsState other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.pickUpPoints)) {
        this.pickUpPoints = data().deepCopy(fields()[0].schema(), other.pickUpPoints);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.deliveryPoints)) {
        this.deliveryPoints = data().deepCopy(fields()[1].schema(), other.deliveryPoints);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'pickUpPoints' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.VehicleGpsState> getPickUpPoints() {
      return pickUpPoints;
    }

    /**
      * Sets the value of the 'pickUpPoints' field.
      * @param value The value of 'pickUpPoints'.
      * @return This builder.
      */
    public com.fretron.Model.BoundryPositionGpsState.Builder setPickUpPoints(java.util.List<com.fretron.Model.VehicleGpsState> value) {
      validate(fields()[0], value);
      this.pickUpPoints = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'pickUpPoints' field has been set.
      * @return True if the 'pickUpPoints' field has been set, false otherwise.
      */
    public boolean hasPickUpPoints() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'pickUpPoints' field.
      * @return This builder.
      */
    public com.fretron.Model.BoundryPositionGpsState.Builder clearPickUpPoints() {
      pickUpPoints = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'deliveryPoints' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.VehicleGpsState> getDeliveryPoints() {
      return deliveryPoints;
    }

    /**
      * Sets the value of the 'deliveryPoints' field.
      * @param value The value of 'deliveryPoints'.
      * @return This builder.
      */
    public com.fretron.Model.BoundryPositionGpsState.Builder setDeliveryPoints(java.util.List<com.fretron.Model.VehicleGpsState> value) {
      validate(fields()[1], value);
      this.deliveryPoints = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'deliveryPoints' field has been set.
      * @return True if the 'deliveryPoints' field has been set, false otherwise.
      */
    public boolean hasDeliveryPoints() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'deliveryPoints' field.
      * @return This builder.
      */
    public com.fretron.Model.BoundryPositionGpsState.Builder clearDeliveryPoints() {
      deliveryPoints = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public BoundryPositionGpsState build() {
      try {
        BoundryPositionGpsState record = new BoundryPositionGpsState();
        record.pickUpPoints = fieldSetFlags()[0] ? this.pickUpPoints : (java.util.List<com.fretron.Model.VehicleGpsState>) defaultValue(fields()[0]);
        record.deliveryPoints = fieldSetFlags()[1] ? this.deliveryPoints : (java.util.List<com.fretron.Model.VehicleGpsState>) defaultValue(fields()[1]);
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
