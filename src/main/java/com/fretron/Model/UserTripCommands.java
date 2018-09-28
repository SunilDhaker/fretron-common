/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserTripCommands extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9202837462470561826L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserTripCommands\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"tripId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"startTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"deviceImei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"locationInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LitePosition\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"},{\"name\":\"speed\",\"type\":\"double\"},{\"name\":\"course\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"decoder\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lngLat\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"isFillingEnabled\",\"type\":\"boolean\",\"default\":false},{\"name\":\"odometer\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Odometer\",\"fields\":[{\"name\":\"softwareMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"lastUpdateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isSoftwareMeterManuallyCalibrated\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"lastCalibrationTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"hardwareReading\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"hardwareDistance\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null}]}],\"default\":null},{\"name\":\"vehicleStateInfo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"VehicleTripState\",\"fields\":[{\"name\":\"deviceImei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"VehicleState\",\"symbols\":[\"WaitingForLoad\",\"EnrouteForPickUp\",\"AtPickUpPoint\",\"EnrouteForDestination\",\"AtDestination\"]}],\"default\":null},{\"name\":\"tripId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"startTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"vgs\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"VehicleGpsState\",\"fields\":[{\"name\":\"isManuallyAdded\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isIgnore\",\"type\":\"boolean\",\"default\":false},{\"name\":\"startTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"startLocation\",\"type\":\"LitePosition\"},{\"name\":\"endLocation\",\"type\":\"LitePosition\"},{\"name\":\"sigmasq\",\"type\":\"double\"},{\"name\":\"mean\",\"type\":\"LitePosition\"},{\"name\":\"totalDistance\",\"type\":\"double\"},{\"name\":\"totalTime\",\"type\":\"long\"},{\"name\":\"averageOfSpeed\",\"type\":\"double\"},{\"name\":\"averageSpeeds\",\"type\":\"double\"},{\"name\":\"numberOfRecord\",\"type\":\"int\"},{\"name\":\"lateArrivedRecordsCount\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"GPSState\",\"symbols\":[\"Stopped\",\"Moving\",\"Overspeeding\",\"Disconnected\",\"Unknown\"]}]},{\"name\":\"encodedPolyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timeAwarePolyline\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TimeAwarePolyline\",\"fields\":[{\"name\":\"polyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"compressedPolyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastPoint\",\"type\":{\"type\":\"record\",\"name\":\"PointAtTime\",\"fields\":[{\"name\":\"timestamp\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"],\"default\":null}]}},{\"name\":\"isAssumed\",\"type\":\"boolean\",\"default\":false},{\"name\":\"totalPoints\",\"type\":[\"null\",\"int\"],\"default\":null}]}],\"default\":null},{\"name\":\"polylineSegments\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TimeAwarePolyline\"}],\"default\":null},{\"name\":\"recalculatedDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"odoMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"lastOdoMeterReading\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"isDisconnected\",\"type\":\"boolean\",\"default\":false},{\"name\":\"eventType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"batteryStatus\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastStateOdometer\",\"type\":[\"null\",\"Odometer\"],\"default\":null},{\"name\":\"odometer\",\"type\":[\"null\",\"Odometer\"],\"default\":null},{\"name\":\"clusters\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Properties\",\"fields\":[{\"name\":\"catagory\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"level\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"customeFields\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"hasUTurn\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"tripPoints\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TripPoint\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"purpose\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sequenceId\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"place\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Place\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"center\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"suggestedRadius\",\"type\":\"double\",\"default\":null},{\"name\":\"viewport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ViewPort\",\"fields\":[{\"name\":\"northeast\",\"type\":[\"null\",\"Location\"],\"default\":null},{\"name\":\"southwest\",\"type\":[\"null\",\"Location\"],\"default\":null}]}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"boundary\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}],\"default\":null},{\"name\":\"status\",\"type\":","[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"eta\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"remainingDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"plannedArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"assosiatedShipmentsId\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String vehicleId;
  @Deprecated public java.lang.String type;
  @Deprecated public java.lang.String tripId;
  @Deprecated public java.lang.Long startTime;
  @Deprecated public java.lang.Long endTime;
  @Deprecated public java.lang.String deviceImei;
  @Deprecated public com.fretron.Model.LitePosition locationInfo;
  @Deprecated public com.fretron.Model.VehicleTripState vehicleStateInfo;
  @Deprecated public com.fretron.Model.VehicleGpsState vgs;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserTripCommands() {}

  /**
   * All-args constructor.
   * @param vehicleId The new value for vehicleId
   * @param type The new value for type
   * @param tripId The new value for tripId
   * @param startTime The new value for startTime
   * @param endTime The new value for endTime
   * @param deviceImei The new value for deviceImei
   * @param locationInfo The new value for locationInfo
   * @param vehicleStateInfo The new value for vehicleStateInfo
   * @param vgs The new value for vgs
   */
  public UserTripCommands(java.lang.String vehicleId, java.lang.String type, java.lang.String tripId, java.lang.Long startTime, java.lang.Long endTime, java.lang.String deviceImei, com.fretron.Model.LitePosition locationInfo, com.fretron.Model.VehicleTripState vehicleStateInfo, com.fretron.Model.VehicleGpsState vgs) {
    this.vehicleId = vehicleId;
    this.type = type;
    this.tripId = tripId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.deviceImei = deviceImei;
    this.locationInfo = locationInfo;
    this.vehicleStateInfo = vehicleStateInfo;
    this.vgs = vgs;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vehicleId;
    case 1: return type;
    case 2: return tripId;
    case 3: return startTime;
    case 4: return endTime;
    case 5: return deviceImei;
    case 6: return locationInfo;
    case 7: return vehicleStateInfo;
    case 8: return vgs;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: vehicleId = (java.lang.String)value$; break;
    case 1: type = (java.lang.String)value$; break;
    case 2: tripId = (java.lang.String)value$; break;
    case 3: startTime = (java.lang.Long)value$; break;
    case 4: endTime = (java.lang.Long)value$; break;
    case 5: deviceImei = (java.lang.String)value$; break;
    case 6: locationInfo = (com.fretron.Model.LitePosition)value$; break;
    case 7: vehicleStateInfo = (com.fretron.Model.VehicleTripState)value$; break;
    case 8: vgs = (com.fretron.Model.VehicleGpsState)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'vehicleId' field.
   * @return The value of the 'vehicleId' field.
   */
  public java.lang.String getVehicleId() {
    return vehicleId;
  }

  /**
   * Sets the value of the 'vehicleId' field.
   * @param value the value to set.
   */
  public void setVehicleId(java.lang.String value) {
    this.vehicleId = value;
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
   * Gets the value of the 'tripId' field.
   * @return The value of the 'tripId' field.
   */
  public java.lang.String getTripId() {
    return tripId;
  }

  /**
   * Sets the value of the 'tripId' field.
   * @param value the value to set.
   */
  public void setTripId(java.lang.String value) {
    this.tripId = value;
  }

  /**
   * Gets the value of the 'startTime' field.
   * @return The value of the 'startTime' field.
   */
  public java.lang.Long getStartTime() {
    return startTime;
  }

  /**
   * Sets the value of the 'startTime' field.
   * @param value the value to set.
   */
  public void setStartTime(java.lang.Long value) {
    this.startTime = value;
  }

  /**
   * Gets the value of the 'endTime' field.
   * @return The value of the 'endTime' field.
   */
  public java.lang.Long getEndTime() {
    return endTime;
  }

  /**
   * Sets the value of the 'endTime' field.
   * @param value the value to set.
   */
  public void setEndTime(java.lang.Long value) {
    this.endTime = value;
  }

  /**
   * Gets the value of the 'deviceImei' field.
   * @return The value of the 'deviceImei' field.
   */
  public java.lang.String getDeviceImei() {
    return deviceImei;
  }

  /**
   * Sets the value of the 'deviceImei' field.
   * @param value the value to set.
   */
  public void setDeviceImei(java.lang.String value) {
    this.deviceImei = value;
  }

  /**
   * Gets the value of the 'locationInfo' field.
   * @return The value of the 'locationInfo' field.
   */
  public com.fretron.Model.LitePosition getLocationInfo() {
    return locationInfo;
  }

  /**
   * Sets the value of the 'locationInfo' field.
   * @param value the value to set.
   */
  public void setLocationInfo(com.fretron.Model.LitePosition value) {
    this.locationInfo = value;
  }

  /**
   * Gets the value of the 'vehicleStateInfo' field.
   * @return The value of the 'vehicleStateInfo' field.
   */
  public com.fretron.Model.VehicleTripState getVehicleStateInfo() {
    return vehicleStateInfo;
  }

  /**
   * Sets the value of the 'vehicleStateInfo' field.
   * @param value the value to set.
   */
  public void setVehicleStateInfo(com.fretron.Model.VehicleTripState value) {
    this.vehicleStateInfo = value;
  }

  /**
   * Gets the value of the 'vgs' field.
   * @return The value of the 'vgs' field.
   */
  public com.fretron.Model.VehicleGpsState getVgs() {
    return vgs;
  }

  /**
   * Sets the value of the 'vgs' field.
   * @param value the value to set.
   */
  public void setVgs(com.fretron.Model.VehicleGpsState value) {
    this.vgs = value;
  }

  /**
   * Creates a new UserTripCommands RecordBuilder.
   * @return A new UserTripCommands RecordBuilder
   */
  public static com.fretron.Model.UserTripCommands.Builder newBuilder() {
    return new com.fretron.Model.UserTripCommands.Builder();
  }

  /**
   * Creates a new UserTripCommands RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserTripCommands RecordBuilder
   */
  public static com.fretron.Model.UserTripCommands.Builder newBuilder(com.fretron.Model.UserTripCommands.Builder other) {
    return new com.fretron.Model.UserTripCommands.Builder(other);
  }

  /**
   * Creates a new UserTripCommands RecordBuilder by copying an existing UserTripCommands instance.
   * @param other The existing instance to copy.
   * @return A new UserTripCommands RecordBuilder
   */
  public static com.fretron.Model.UserTripCommands.Builder newBuilder(com.fretron.Model.UserTripCommands other) {
    return new com.fretron.Model.UserTripCommands.Builder(other);
  }

  /**
   * RecordBuilder for UserTripCommands instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserTripCommands>
    implements org.apache.avro.data.RecordBuilder<UserTripCommands> {

    private java.lang.String vehicleId;
    private java.lang.String type;
    private java.lang.String tripId;
    private java.lang.Long startTime;
    private java.lang.Long endTime;
    private java.lang.String deviceImei;
    private com.fretron.Model.LitePosition locationInfo;
    private com.fretron.Model.LitePosition.Builder locationInfoBuilder;
    private com.fretron.Model.VehicleTripState vehicleStateInfo;
    private com.fretron.Model.VehicleTripState.Builder vehicleStateInfoBuilder;
    private com.fretron.Model.VehicleGpsState vgs;
    private com.fretron.Model.VehicleGpsState.Builder vgsBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.UserTripCommands.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[0].schema(), other.vehicleId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tripId)) {
        this.tripId = data().deepCopy(fields()[2].schema(), other.tripId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.startTime)) {
        this.startTime = data().deepCopy(fields()[3].schema(), other.startTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.endTime)) {
        this.endTime = data().deepCopy(fields()[4].schema(), other.endTime);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.deviceImei)) {
        this.deviceImei = data().deepCopy(fields()[5].schema(), other.deviceImei);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.locationInfo)) {
        this.locationInfo = data().deepCopy(fields()[6].schema(), other.locationInfo);
        fieldSetFlags()[6] = true;
      }
      if (other.hasLocationInfoBuilder()) {
        this.locationInfoBuilder = com.fretron.Model.LitePosition.newBuilder(other.getLocationInfoBuilder());
      }
      if (isValidValue(fields()[7], other.vehicleStateInfo)) {
        this.vehicleStateInfo = data().deepCopy(fields()[7].schema(), other.vehicleStateInfo);
        fieldSetFlags()[7] = true;
      }
      if (other.hasVehicleStateInfoBuilder()) {
        this.vehicleStateInfoBuilder = com.fretron.Model.VehicleTripState.newBuilder(other.getVehicleStateInfoBuilder());
      }
      if (isValidValue(fields()[8], other.vgs)) {
        this.vgs = data().deepCopy(fields()[8].schema(), other.vgs);
        fieldSetFlags()[8] = true;
      }
      if (other.hasVgsBuilder()) {
        this.vgsBuilder = com.fretron.Model.VehicleGpsState.newBuilder(other.getVgsBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing UserTripCommands instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.UserTripCommands other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[0].schema(), other.vehicleId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tripId)) {
        this.tripId = data().deepCopy(fields()[2].schema(), other.tripId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.startTime)) {
        this.startTime = data().deepCopy(fields()[3].schema(), other.startTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.endTime)) {
        this.endTime = data().deepCopy(fields()[4].schema(), other.endTime);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.deviceImei)) {
        this.deviceImei = data().deepCopy(fields()[5].schema(), other.deviceImei);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.locationInfo)) {
        this.locationInfo = data().deepCopy(fields()[6].schema(), other.locationInfo);
        fieldSetFlags()[6] = true;
      }
      this.locationInfoBuilder = null;
      if (isValidValue(fields()[7], other.vehicleStateInfo)) {
        this.vehicleStateInfo = data().deepCopy(fields()[7].schema(), other.vehicleStateInfo);
        fieldSetFlags()[7] = true;
      }
      this.vehicleStateInfoBuilder = null;
      if (isValidValue(fields()[8], other.vgs)) {
        this.vgs = data().deepCopy(fields()[8].schema(), other.vgs);
        fieldSetFlags()[8] = true;
      }
      this.vgsBuilder = null;
    }

    /**
      * Gets the value of the 'vehicleId' field.
      * @return The value.
      */
    public java.lang.String getVehicleId() {
      return vehicleId;
    }

    /**
      * Sets the value of the 'vehicleId' field.
      * @param value The value of 'vehicleId'.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder setVehicleId(java.lang.String value) {
      validate(fields()[0], value);
      this.vehicleId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleId' field has been set.
      * @return True if the 'vehicleId' field has been set, false otherwise.
      */
    public boolean hasVehicleId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'vehicleId' field.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder clearVehicleId() {
      vehicleId = null;
      fieldSetFlags()[0] = false;
      return this;
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
    public com.fretron.Model.UserTripCommands.Builder setType(java.lang.String value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'tripId' field.
      * @return The value.
      */
    public java.lang.String getTripId() {
      return tripId;
    }

    /**
      * Sets the value of the 'tripId' field.
      * @param value The value of 'tripId'.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder setTripId(java.lang.String value) {
      validate(fields()[2], value);
      this.tripId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'tripId' field has been set.
      * @return True if the 'tripId' field has been set, false otherwise.
      */
    public boolean hasTripId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'tripId' field.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder clearTripId() {
      tripId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'startTime' field.
      * @return The value.
      */
    public java.lang.Long getStartTime() {
      return startTime;
    }

    /**
      * Sets the value of the 'startTime' field.
      * @param value The value of 'startTime'.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder setStartTime(java.lang.Long value) {
      validate(fields()[3], value);
      this.startTime = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'startTime' field has been set.
      * @return True if the 'startTime' field has been set, false otherwise.
      */
    public boolean hasStartTime() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'startTime' field.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder clearStartTime() {
      startTime = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'endTime' field.
      * @return The value.
      */
    public java.lang.Long getEndTime() {
      return endTime;
    }

    /**
      * Sets the value of the 'endTime' field.
      * @param value The value of 'endTime'.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder setEndTime(java.lang.Long value) {
      validate(fields()[4], value);
      this.endTime = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'endTime' field has been set.
      * @return True if the 'endTime' field has been set, false otherwise.
      */
    public boolean hasEndTime() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'endTime' field.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder clearEndTime() {
      endTime = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'deviceImei' field.
      * @return The value.
      */
    public java.lang.String getDeviceImei() {
      return deviceImei;
    }

    /**
      * Sets the value of the 'deviceImei' field.
      * @param value The value of 'deviceImei'.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder setDeviceImei(java.lang.String value) {
      validate(fields()[5], value);
      this.deviceImei = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'deviceImei' field has been set.
      * @return True if the 'deviceImei' field has been set, false otherwise.
      */
    public boolean hasDeviceImei() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'deviceImei' field.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder clearDeviceImei() {
      deviceImei = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'locationInfo' field.
      * @return The value.
      */
    public com.fretron.Model.LitePosition getLocationInfo() {
      return locationInfo;
    }

    /**
      * Sets the value of the 'locationInfo' field.
      * @param value The value of 'locationInfo'.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder setLocationInfo(com.fretron.Model.LitePosition value) {
      validate(fields()[6], value);
      this.locationInfoBuilder = null;
      this.locationInfo = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'locationInfo' field has been set.
      * @return True if the 'locationInfo' field has been set, false otherwise.
      */
    public boolean hasLocationInfo() {
      return fieldSetFlags()[6];
    }

    /**
     * Gets the Builder instance for the 'locationInfo' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.LitePosition.Builder getLocationInfoBuilder() {
      if (locationInfoBuilder == null) {
        if (hasLocationInfo()) {
          setLocationInfoBuilder(com.fretron.Model.LitePosition.newBuilder(locationInfo));
        } else {
          setLocationInfoBuilder(com.fretron.Model.LitePosition.newBuilder());
        }
      }
      return locationInfoBuilder;
    }

    /**
     * Sets the Builder instance for the 'locationInfo' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.UserTripCommands.Builder setLocationInfoBuilder(com.fretron.Model.LitePosition.Builder value) {
      clearLocationInfo();
      locationInfoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'locationInfo' field has an active Builder instance
     * @return True if the 'locationInfo' field has an active Builder instance
     */
    public boolean hasLocationInfoBuilder() {
      return locationInfoBuilder != null;
    }

    /**
      * Clears the value of the 'locationInfo' field.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder clearLocationInfo() {
      locationInfo = null;
      locationInfoBuilder = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'vehicleStateInfo' field.
      * @return The value.
      */
    public com.fretron.Model.VehicleTripState getVehicleStateInfo() {
      return vehicleStateInfo;
    }

    /**
      * Sets the value of the 'vehicleStateInfo' field.
      * @param value The value of 'vehicleStateInfo'.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder setVehicleStateInfo(com.fretron.Model.VehicleTripState value) {
      validate(fields()[7], value);
      this.vehicleStateInfoBuilder = null;
      this.vehicleStateInfo = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleStateInfo' field has been set.
      * @return True if the 'vehicleStateInfo' field has been set, false otherwise.
      */
    public boolean hasVehicleStateInfo() {
      return fieldSetFlags()[7];
    }

    /**
     * Gets the Builder instance for the 'vehicleStateInfo' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.VehicleTripState.Builder getVehicleStateInfoBuilder() {
      if (vehicleStateInfoBuilder == null) {
        if (hasVehicleStateInfo()) {
          setVehicleStateInfoBuilder(com.fretron.Model.VehicleTripState.newBuilder(vehicleStateInfo));
        } else {
          setVehicleStateInfoBuilder(com.fretron.Model.VehicleTripState.newBuilder());
        }
      }
      return vehicleStateInfoBuilder;
    }

    /**
     * Sets the Builder instance for the 'vehicleStateInfo' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.UserTripCommands.Builder setVehicleStateInfoBuilder(com.fretron.Model.VehicleTripState.Builder value) {
      clearVehicleStateInfo();
      vehicleStateInfoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'vehicleStateInfo' field has an active Builder instance
     * @return True if the 'vehicleStateInfo' field has an active Builder instance
     */
    public boolean hasVehicleStateInfoBuilder() {
      return vehicleStateInfoBuilder != null;
    }

    /**
      * Clears the value of the 'vehicleStateInfo' field.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder clearVehicleStateInfo() {
      vehicleStateInfo = null;
      vehicleStateInfoBuilder = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'vgs' field.
      * @return The value.
      */
    public com.fretron.Model.VehicleGpsState getVgs() {
      return vgs;
    }

    /**
      * Sets the value of the 'vgs' field.
      * @param value The value of 'vgs'.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder setVgs(com.fretron.Model.VehicleGpsState value) {
      validate(fields()[8], value);
      this.vgsBuilder = null;
      this.vgs = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'vgs' field has been set.
      * @return True if the 'vgs' field has been set, false otherwise.
      */
    public boolean hasVgs() {
      return fieldSetFlags()[8];
    }

    /**
     * Gets the Builder instance for the 'vgs' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.VehicleGpsState.Builder getVgsBuilder() {
      if (vgsBuilder == null) {
        if (hasVgs()) {
          setVgsBuilder(com.fretron.Model.VehicleGpsState.newBuilder(vgs));
        } else {
          setVgsBuilder(com.fretron.Model.VehicleGpsState.newBuilder());
        }
      }
      return vgsBuilder;
    }

    /**
     * Sets the Builder instance for the 'vgs' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.UserTripCommands.Builder setVgsBuilder(com.fretron.Model.VehicleGpsState.Builder value) {
      clearVgs();
      vgsBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'vgs' field has an active Builder instance
     * @return True if the 'vgs' field has an active Builder instance
     */
    public boolean hasVgsBuilder() {
      return vgsBuilder != null;
    }

    /**
      * Clears the value of the 'vgs' field.
      * @return This builder.
      */
    public com.fretron.Model.UserTripCommands.Builder clearVgs() {
      vgs = null;
      vgsBuilder = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public UserTripCommands build() {
      try {
        UserTripCommands record = new UserTripCommands();
        record.vehicleId = fieldSetFlags()[0] ? this.vehicleId : (java.lang.String) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.String) defaultValue(fields()[1]);
        record.tripId = fieldSetFlags()[2] ? this.tripId : (java.lang.String) defaultValue(fields()[2]);
        record.startTime = fieldSetFlags()[3] ? this.startTime : (java.lang.Long) defaultValue(fields()[3]);
        record.endTime = fieldSetFlags()[4] ? this.endTime : (java.lang.Long) defaultValue(fields()[4]);
        record.deviceImei = fieldSetFlags()[5] ? this.deviceImei : (java.lang.String) defaultValue(fields()[5]);
        if (locationInfoBuilder != null) {
          record.locationInfo = this.locationInfoBuilder.build();
        } else {
          record.locationInfo = fieldSetFlags()[6] ? this.locationInfo : (com.fretron.Model.LitePosition) defaultValue(fields()[6]);
        }
        if (vehicleStateInfoBuilder != null) {
          record.vehicleStateInfo = this.vehicleStateInfoBuilder.build();
        } else {
          record.vehicleStateInfo = fieldSetFlags()[7] ? this.vehicleStateInfo : (com.fretron.Model.VehicleTripState) defaultValue(fields()[7]);
        }
        if (vgsBuilder != null) {
          record.vgs = this.vgsBuilder.build();
        } else {
          record.vgs = fieldSetFlags()[8] ? this.vgs : (com.fretron.Model.VehicleGpsState) defaultValue(fields()[8]);
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
