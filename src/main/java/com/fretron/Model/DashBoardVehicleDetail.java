/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DashBoardVehicleDetail extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -376849665954904125L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DashBoardVehicleDetail\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicle\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Vehicle\",\"fields\":[{\"name\":\"customerId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleModel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleMake\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vtsDeviceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleRegistrationNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"associatedWith\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isDeleted\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"updateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"groups\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"driverId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"attachedDocs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isTrackingEnabled\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"gpsState\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"VehicleGpsState\",\"fields\":[{\"name\":\"isManuallyAdded\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isIgnore\",\"type\":\"boolean\",\"default\":false},{\"name\":\"startTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"startLocation\",\"type\":{\"type\":\"record\",\"name\":\"LitePosition\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"},{\"name\":\"speed\",\"type\":\"double\"},{\"name\":\"course\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"decoder\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lngLat\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"isFillingEnabled\",\"type\":\"boolean\",\"default\":false}]}},{\"name\":\"endLocation\",\"type\":\"LitePosition\"},{\"name\":\"sigmasq\",\"type\":\"double\"},{\"name\":\"mean\",\"type\":\"LitePosition\"},{\"name\":\"totalDistance\",\"type\":\"double\"},{\"name\":\"totalTime\",\"type\":\"long\"},{\"name\":\"averageOfSpeed\",\"type\":\"double\"},{\"name\":\"averageSpeeds\",\"type\":\"double\"},{\"name\":\"numberOfRecord\",\"type\":\"int\"},{\"name\":\"lateArrivedRecordsCount\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"GPSState\",\"symbols\":[\"Stopped\",\"Moving\",\"Overspeeding\",\"Disconnected\",\"Unknown\"]}]},{\"name\":\"encodedPolyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timeAwarePolyline\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TimeAwarePolyline\",\"fields\":[{\"name\":\"polyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"compressedPolyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastPoint\",\"type\":{\"type\":\"record\",\"name\":\"PointAtTime\",\"fields\":[{\"name\":\"timestamp\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"],\"default\":null}]}},{\"name\":\"isAssumed\",\"type\":\"boolean\",\"default\":false},{\"name\":\"totalPoints\",\"type\":[\"null\",\"int\"],\"default\":null}]}],\"default\":null},{\"name\":\"polylineSegments\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TimeAwarePolyline\"}],\"default\":null},{\"name\":\"recalculatedDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"odoMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"lastOdoMeterReading\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"isDisconnected\",\"type\":\"boolean\",\"default\":false},{\"name\":\"eventType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"batteryStatus\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastStateOdometer\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Odometer\",\"fields\":[{\"name\":\"globalMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"tripMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"lastUpdateTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"isGlobalMeterManuallyCalibrated\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"isInTrip\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"odometer\",\"type\":[\"null\",\"Odometer\"],\"default\":null}]}],\"default\":null},{\"name\":\"trip\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Trip\",\"fields\":[{\"name\":\"distance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"quantityOfMaterial\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"unitOfQuantity\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"driverName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"driverMobNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"remarks\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"origin\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TripLocation\",\"fields\":[{\"name\":\"freightLocation\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"FreightLocation\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":null},{\"name\":\"geofence\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Geofence\",\"fields\":[{\"name\":\"center\",\"type\":{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}},{\"name\":\"boundry\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Location\"}],\"default\":null},{\"name\":\"circle\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Circle\",\"fields\":[{\"name\":\"center\",\"type\":\"Location\"},{\"name\":\"radius\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"GeofenceType\",\"symbols\":[\"Proximity\",\"Polygon\"]}],\"default\":null}]}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"favouriteOf\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"FreightLocType\",\"symbols\":[\"Private\",\"Public\"]}],\"default\":null},{\"name\":\"isDeleted\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"fromTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timesta","mp-millis\"},{\"name\":\"tillTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"firstGpsLogId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastGpsLogId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ignoredVehicleGpsLogs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updatedAt\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"}]}}],\"default\":null},{\"name\":\"destination\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TripLocation\"}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"tripId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"actualStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"lane\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Lane\",\"fields\":[{\"name\":\"sources\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"FreightLocation\"}],\"default\":null},{\"name\":\"destination\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"FreightLocation\"}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"baseSource\",\"type\":[\"null\",\"FreightLocation\"],\"default\":null},{\"name\":\"baseDestination\",\"type\":[\"null\",\"FreightLocation\"],\"default\":null},{\"name\":\"baseMaterial\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"baseRate\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"sourceOffSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"destinationOffSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"materialOffSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"baseTransitDays\",\"type\":[\"null\",\"int\"],\"default\":null}]}],\"default\":null},{\"name\":\"tripState\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TripState\",\"symbols\":[\"Created\",\"Started\",\"Completed\"]}],\"default\":null},{\"name\":\"deviceImei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"shipmentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"trackingType\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TrackingType\",\"symbols\":[\"Tracker\",\"Trip\",\"Manual\"]}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"expectedDestinations\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"FreightLocation\"}],\"default\":null},{\"name\":\"reprocessTill\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"liveliness\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isOffTrack\",\"type\":\"boolean\",\"default\":false},{\"name\":\"offTrackSince\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"expectedSystemResolution\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createdAt\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"}]}],\"default\":null},{\"name\":\"vtsState\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"VehicleTripState\",\"fields\":[{\"name\":\"deviceImei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"VehicleState\",\"symbols\":[\"WaitingForLoad\",\"EnrouteForPickUp\",\"AtPickUpPoint\",\"EnrouteForDestination\",\"AtDestination\"]}],\"default\":null},{\"name\":\"tripId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"startTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"updatedAt\",\"type\":[\"null\",\"long\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public com.fretron.Model.Vehicle vehicle;
  @Deprecated public com.fretron.Model.VehicleGpsState gpsState;
  @Deprecated public com.fretron.Model.Trip trip;
  @Deprecated public com.fretron.Model.VehicleTripState vtsState;
  @Deprecated public java.lang.Long updatedAt;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DashBoardVehicleDetail() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param vehicle The new value for vehicle
   * @param gpsState The new value for gpsState
   * @param trip The new value for trip
   * @param vtsState The new value for vtsState
   * @param updatedAt The new value for updatedAt
   */
  public DashBoardVehicleDetail(java.lang.String uuid, com.fretron.Model.Vehicle vehicle, com.fretron.Model.VehicleGpsState gpsState, com.fretron.Model.Trip trip, com.fretron.Model.VehicleTripState vtsState, java.lang.Long updatedAt) {
    this.uuid = uuid;
    this.vehicle = vehicle;
    this.gpsState = gpsState;
    this.trip = trip;
    this.vtsState = vtsState;
    this.updatedAt = updatedAt;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return vehicle;
    case 2: return gpsState;
    case 3: return trip;
    case 4: return vtsState;
    case 5: return updatedAt;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: vehicle = (com.fretron.Model.Vehicle)value$; break;
    case 2: gpsState = (com.fretron.Model.VehicleGpsState)value$; break;
    case 3: trip = (com.fretron.Model.Trip)value$; break;
    case 4: vtsState = (com.fretron.Model.VehicleTripState)value$; break;
    case 5: updatedAt = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uuid' field.
   * @return The value of the 'uuid' field.
   */
  public java.lang.String getUuid() {
    return uuid;
  }

  /**
   * Sets the value of the 'uuid' field.
   * @param value the value to set.
   */
  public void setUuid(java.lang.String value) {
    this.uuid = value;
  }

  /**
   * Gets the value of the 'vehicle' field.
   * @return The value of the 'vehicle' field.
   */
  public com.fretron.Model.Vehicle getVehicle() {
    return vehicle;
  }

  /**
   * Sets the value of the 'vehicle' field.
   * @param value the value to set.
   */
  public void setVehicle(com.fretron.Model.Vehicle value) {
    this.vehicle = value;
  }

  /**
   * Gets the value of the 'gpsState' field.
   * @return The value of the 'gpsState' field.
   */
  public com.fretron.Model.VehicleGpsState getGpsState() {
    return gpsState;
  }

  /**
   * Sets the value of the 'gpsState' field.
   * @param value the value to set.
   */
  public void setGpsState(com.fretron.Model.VehicleGpsState value) {
    this.gpsState = value;
  }

  /**
   * Gets the value of the 'trip' field.
   * @return The value of the 'trip' field.
   */
  public com.fretron.Model.Trip getTrip() {
    return trip;
  }

  /**
   * Sets the value of the 'trip' field.
   * @param value the value to set.
   */
  public void setTrip(com.fretron.Model.Trip value) {
    this.trip = value;
  }

  /**
   * Gets the value of the 'vtsState' field.
   * @return The value of the 'vtsState' field.
   */
  public com.fretron.Model.VehicleTripState getVtsState() {
    return vtsState;
  }

  /**
   * Sets the value of the 'vtsState' field.
   * @param value the value to set.
   */
  public void setVtsState(com.fretron.Model.VehicleTripState value) {
    this.vtsState = value;
  }

  /**
   * Gets the value of the 'updatedAt' field.
   * @return The value of the 'updatedAt' field.
   */
  public java.lang.Long getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the value of the 'updatedAt' field.
   * @param value the value to set.
   */
  public void setUpdatedAt(java.lang.Long value) {
    this.updatedAt = value;
  }

  /**
   * Creates a new DashBoardVehicleDetail RecordBuilder.
   * @return A new DashBoardVehicleDetail RecordBuilder
   */
  public static com.fretron.Model.DashBoardVehicleDetail.Builder newBuilder() {
    return new com.fretron.Model.DashBoardVehicleDetail.Builder();
  }

  /**
   * Creates a new DashBoardVehicleDetail RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DashBoardVehicleDetail RecordBuilder
   */
  public static com.fretron.Model.DashBoardVehicleDetail.Builder newBuilder(com.fretron.Model.DashBoardVehicleDetail.Builder other) {
    return new com.fretron.Model.DashBoardVehicleDetail.Builder(other);
  }

  /**
   * Creates a new DashBoardVehicleDetail RecordBuilder by copying an existing DashBoardVehicleDetail instance.
   * @param other The existing instance to copy.
   * @return A new DashBoardVehicleDetail RecordBuilder
   */
  public static com.fretron.Model.DashBoardVehicleDetail.Builder newBuilder(com.fretron.Model.DashBoardVehicleDetail other) {
    return new com.fretron.Model.DashBoardVehicleDetail.Builder(other);
  }

  /**
   * RecordBuilder for DashBoardVehicleDetail instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DashBoardVehicleDetail>
    implements org.apache.avro.data.RecordBuilder<DashBoardVehicleDetail> {

    private java.lang.String uuid;
    private com.fretron.Model.Vehicle vehicle;
    private com.fretron.Model.Vehicle.Builder vehicleBuilder;
    private com.fretron.Model.VehicleGpsState gpsState;
    private com.fretron.Model.VehicleGpsState.Builder gpsStateBuilder;
    private com.fretron.Model.Trip trip;
    private com.fretron.Model.Trip.Builder tripBuilder;
    private com.fretron.Model.VehicleTripState vtsState;
    private com.fretron.Model.VehicleTripState.Builder vtsStateBuilder;
    private java.lang.Long updatedAt;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.DashBoardVehicleDetail.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vehicle)) {
        this.vehicle = data().deepCopy(fields()[1].schema(), other.vehicle);
        fieldSetFlags()[1] = true;
      }
      if (other.hasVehicleBuilder()) {
        this.vehicleBuilder = com.fretron.Model.Vehicle.newBuilder(other.getVehicleBuilder());
      }
      if (isValidValue(fields()[2], other.gpsState)) {
        this.gpsState = data().deepCopy(fields()[2].schema(), other.gpsState);
        fieldSetFlags()[2] = true;
      }
      if (other.hasGpsStateBuilder()) {
        this.gpsStateBuilder = com.fretron.Model.VehicleGpsState.newBuilder(other.getGpsStateBuilder());
      }
      if (isValidValue(fields()[3], other.trip)) {
        this.trip = data().deepCopy(fields()[3].schema(), other.trip);
        fieldSetFlags()[3] = true;
      }
      if (other.hasTripBuilder()) {
        this.tripBuilder = com.fretron.Model.Trip.newBuilder(other.getTripBuilder());
      }
      if (isValidValue(fields()[4], other.vtsState)) {
        this.vtsState = data().deepCopy(fields()[4].schema(), other.vtsState);
        fieldSetFlags()[4] = true;
      }
      if (other.hasVtsStateBuilder()) {
        this.vtsStateBuilder = com.fretron.Model.VehicleTripState.newBuilder(other.getVtsStateBuilder());
      }
      if (isValidValue(fields()[5], other.updatedAt)) {
        this.updatedAt = data().deepCopy(fields()[5].schema(), other.updatedAt);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DashBoardVehicleDetail instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.DashBoardVehicleDetail other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vehicle)) {
        this.vehicle = data().deepCopy(fields()[1].schema(), other.vehicle);
        fieldSetFlags()[1] = true;
      }
      this.vehicleBuilder = null;
      if (isValidValue(fields()[2], other.gpsState)) {
        this.gpsState = data().deepCopy(fields()[2].schema(), other.gpsState);
        fieldSetFlags()[2] = true;
      }
      this.gpsStateBuilder = null;
      if (isValidValue(fields()[3], other.trip)) {
        this.trip = data().deepCopy(fields()[3].schema(), other.trip);
        fieldSetFlags()[3] = true;
      }
      this.tripBuilder = null;
      if (isValidValue(fields()[4], other.vtsState)) {
        this.vtsState = data().deepCopy(fields()[4].schema(), other.vtsState);
        fieldSetFlags()[4] = true;
      }
      this.vtsStateBuilder = null;
      if (isValidValue(fields()[5], other.updatedAt)) {
        this.updatedAt = data().deepCopy(fields()[5].schema(), other.updatedAt);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'uuid' field.
      * @return The value.
      */
    public java.lang.String getUuid() {
      return uuid;
    }

    /**
      * Sets the value of the 'uuid' field.
      * @param value The value of 'uuid'.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder setUuid(java.lang.String value) {
      validate(fields()[0], value);
      this.uuid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'uuid' field has been set.
      * @return True if the 'uuid' field has been set, false otherwise.
      */
    public boolean hasUuid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'uuid' field.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'vehicle' field.
      * @return The value.
      */
    public com.fretron.Model.Vehicle getVehicle() {
      return vehicle;
    }

    /**
      * Sets the value of the 'vehicle' field.
      * @param value The value of 'vehicle'.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder setVehicle(com.fretron.Model.Vehicle value) {
      validate(fields()[1], value);
      this.vehicleBuilder = null;
      this.vehicle = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicle' field has been set.
      * @return True if the 'vehicle' field has been set, false otherwise.
      */
    public boolean hasVehicle() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'vehicle' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Vehicle.Builder getVehicleBuilder() {
      if (vehicleBuilder == null) {
        if (hasVehicle()) {
          setVehicleBuilder(com.fretron.Model.Vehicle.newBuilder(vehicle));
        } else {
          setVehicleBuilder(com.fretron.Model.Vehicle.newBuilder());
        }
      }
      return vehicleBuilder;
    }

    /**
     * Sets the Builder instance for the 'vehicle' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.DashBoardVehicleDetail.Builder setVehicleBuilder(com.fretron.Model.Vehicle.Builder value) {
      clearVehicle();
      vehicleBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'vehicle' field has an active Builder instance
     * @return True if the 'vehicle' field has an active Builder instance
     */
    public boolean hasVehicleBuilder() {
      return vehicleBuilder != null;
    }

    /**
      * Clears the value of the 'vehicle' field.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder clearVehicle() {
      vehicle = null;
      vehicleBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'gpsState' field.
      * @return The value.
      */
    public com.fretron.Model.VehicleGpsState getGpsState() {
      return gpsState;
    }

    /**
      * Sets the value of the 'gpsState' field.
      * @param value The value of 'gpsState'.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder setGpsState(com.fretron.Model.VehicleGpsState value) {
      validate(fields()[2], value);
      this.gpsStateBuilder = null;
      this.gpsState = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'gpsState' field has been set.
      * @return True if the 'gpsState' field has been set, false otherwise.
      */
    public boolean hasGpsState() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'gpsState' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.VehicleGpsState.Builder getGpsStateBuilder() {
      if (gpsStateBuilder == null) {
        if (hasGpsState()) {
          setGpsStateBuilder(com.fretron.Model.VehicleGpsState.newBuilder(gpsState));
        } else {
          setGpsStateBuilder(com.fretron.Model.VehicleGpsState.newBuilder());
        }
      }
      return gpsStateBuilder;
    }

    /**
     * Sets the Builder instance for the 'gpsState' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.DashBoardVehicleDetail.Builder setGpsStateBuilder(com.fretron.Model.VehicleGpsState.Builder value) {
      clearGpsState();
      gpsStateBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'gpsState' field has an active Builder instance
     * @return True if the 'gpsState' field has an active Builder instance
     */
    public boolean hasGpsStateBuilder() {
      return gpsStateBuilder != null;
    }

    /**
      * Clears the value of the 'gpsState' field.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder clearGpsState() {
      gpsState = null;
      gpsStateBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'trip' field.
      * @return The value.
      */
    public com.fretron.Model.Trip getTrip() {
      return trip;
    }

    /**
      * Sets the value of the 'trip' field.
      * @param value The value of 'trip'.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder setTrip(com.fretron.Model.Trip value) {
      validate(fields()[3], value);
      this.tripBuilder = null;
      this.trip = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'trip' field has been set.
      * @return True if the 'trip' field has been set, false otherwise.
      */
    public boolean hasTrip() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'trip' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Trip.Builder getTripBuilder() {
      if (tripBuilder == null) {
        if (hasTrip()) {
          setTripBuilder(com.fretron.Model.Trip.newBuilder(trip));
        } else {
          setTripBuilder(com.fretron.Model.Trip.newBuilder());
        }
      }
      return tripBuilder;
    }

    /**
     * Sets the Builder instance for the 'trip' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.DashBoardVehicleDetail.Builder setTripBuilder(com.fretron.Model.Trip.Builder value) {
      clearTrip();
      tripBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'trip' field has an active Builder instance
     * @return True if the 'trip' field has an active Builder instance
     */
    public boolean hasTripBuilder() {
      return tripBuilder != null;
    }

    /**
      * Clears the value of the 'trip' field.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder clearTrip() {
      trip = null;
      tripBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'vtsState' field.
      * @return The value.
      */
    public com.fretron.Model.VehicleTripState getVtsState() {
      return vtsState;
    }

    /**
      * Sets the value of the 'vtsState' field.
      * @param value The value of 'vtsState'.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder setVtsState(com.fretron.Model.VehicleTripState value) {
      validate(fields()[4], value);
      this.vtsStateBuilder = null;
      this.vtsState = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'vtsState' field has been set.
      * @return True if the 'vtsState' field has been set, false otherwise.
      */
    public boolean hasVtsState() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'vtsState' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.VehicleTripState.Builder getVtsStateBuilder() {
      if (vtsStateBuilder == null) {
        if (hasVtsState()) {
          setVtsStateBuilder(com.fretron.Model.VehicleTripState.newBuilder(vtsState));
        } else {
          setVtsStateBuilder(com.fretron.Model.VehicleTripState.newBuilder());
        }
      }
      return vtsStateBuilder;
    }

    /**
     * Sets the Builder instance for the 'vtsState' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.DashBoardVehicleDetail.Builder setVtsStateBuilder(com.fretron.Model.VehicleTripState.Builder value) {
      clearVtsState();
      vtsStateBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'vtsState' field has an active Builder instance
     * @return True if the 'vtsState' field has an active Builder instance
     */
    public boolean hasVtsStateBuilder() {
      return vtsStateBuilder != null;
    }

    /**
      * Clears the value of the 'vtsState' field.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder clearVtsState() {
      vtsState = null;
      vtsStateBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'updatedAt' field.
      * @return The value.
      */
    public java.lang.Long getUpdatedAt() {
      return updatedAt;
    }

    /**
      * Sets the value of the 'updatedAt' field.
      * @param value The value of 'updatedAt'.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder setUpdatedAt(java.lang.Long value) {
      validate(fields()[5], value);
      this.updatedAt = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'updatedAt' field has been set.
      * @return True if the 'updatedAt' field has been set, false otherwise.
      */
    public boolean hasUpdatedAt() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'updatedAt' field.
      * @return This builder.
      */
    public com.fretron.Model.DashBoardVehicleDetail.Builder clearUpdatedAt() {
      updatedAt = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public DashBoardVehicleDetail build() {
      try {
        DashBoardVehicleDetail record = new DashBoardVehicleDetail();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        if (vehicleBuilder != null) {
          record.vehicle = this.vehicleBuilder.build();
        } else {
          record.vehicle = fieldSetFlags()[1] ? this.vehicle : (com.fretron.Model.Vehicle) defaultValue(fields()[1]);
        }
        if (gpsStateBuilder != null) {
          record.gpsState = this.gpsStateBuilder.build();
        } else {
          record.gpsState = fieldSetFlags()[2] ? this.gpsState : (com.fretron.Model.VehicleGpsState) defaultValue(fields()[2]);
        }
        if (tripBuilder != null) {
          record.trip = this.tripBuilder.build();
        } else {
          record.trip = fieldSetFlags()[3] ? this.trip : (com.fretron.Model.Trip) defaultValue(fields()[3]);
        }
        if (vtsStateBuilder != null) {
          record.vtsState = this.vtsStateBuilder.build();
        } else {
          record.vtsState = fieldSetFlags()[4] ? this.vtsState : (com.fretron.Model.VehicleTripState) defaultValue(fields()[4]);
        }
        record.updatedAt = fieldSetFlags()[5] ? this.updatedAt : (java.lang.Long) defaultValue(fields()[5]);
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
