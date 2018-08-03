/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DeviceDetailResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5462864299291576636L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DeviceDetailResponse\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"shipment\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Shipment\",\"fields\":[{\"name\":\"startLocation\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TripLocation\",\"fields\":[{\"name\":\"freightLocation\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"FreightLocation\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":null},{\"name\":\"geofence\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Geofence\",\"fields\":[{\"name\":\"center\",\"type\":{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}},{\"name\":\"boundry\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Location\"}],\"default\":null},{\"name\":\"circle\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Circle\",\"fields\":[{\"name\":\"center\",\"type\":\"Location\"},{\"name\":\"radius\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"GeofenceType\",\"symbols\":[\"Proximity\",\"Polygon\"]}],\"default\":null}]}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"favouriteOf\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"FreightLocType\",\"symbols\":[\"Private\",\"Public\"]}],\"default\":null},{\"name\":\"isDeleted\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"fromTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"tillTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"firstGpsLogId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastGpsLogId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ignoredVehicleGpsLogs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updatedAt\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"}]}],\"default\":null},{\"name\":\"endLocation\",\"type\":[\"null\",\"TripLocation\"],\"default\":null},{\"name\":\"planedStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"planedEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"deviceImei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"trackingType\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TrackingType\",\"symbols\":[\"Tracker\",\"Trip\",\"Manual\"]}],\"default\":null},{\"name\":\"shipmentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"VehicleState\",\"symbols\":[\"WaitingForLoad\",\"EnrouteForPickUp\",\"AtPickUpPoint\",\"EnrouteForDestination\",\"AtDestination\"]}],\"default\":null},{\"name\":\"shipmentState\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TripState\",\"symbols\":[\"Created\",\"Started\",\"Completed\"]}],\"default\":null},{\"name\":\"actualStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"shipmentNo\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"vehicleRegistrationNo\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"driverName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"mobileNo\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"assosiatedTripId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"deafult\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"shipmentNoExtended\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"shipmentDate\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"consignmentDate\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"invoiceDate\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"invoiceNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"valueOfGoods\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"currentTrackingState\",\"type\":[\"null\",\"VehicleState\"],\"default\":null}]}],\"default\":null},{\"name\":\"device\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Device\",\"fields\":[{\"name\":\"imei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"mobileNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"manufacturerName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"isAssociated\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isDeleted\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"updateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"groups\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"isSuspended\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"deafault\":null},{\"name\":\"latestGpsState\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"VehicleGpsState\",\"fields\":[{\"name\":\"isManuallyAdded\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isIgnore\",\"type\":\"boolean\",\"default\":false},{\"name\":\"startTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"startLocation\",\"type\":{\"type\":\"record\",\"name\":\"LitePosition\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"},{\"name\":\"speed\",\"type\":\"double\"},{\"name\":\"course\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"decoder\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lngLat\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"isFillingEnabled\",\"type\":\"boolean\",\"default\":false},{\"name\":\"odometer\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Odometer\",\"fields\":[{\"name\":\"softwareMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"lastUpdateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isSoftwareMeterManuallyCalibrated\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"lastCalibrationTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"hardwareReading\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"hardwareDistance\",\"type\":[\"null\"",",\"double\"],\"default\":null}]}],\"default\":null}]}},{\"name\":\"endLocation\",\"type\":\"LitePosition\"},{\"name\":\"sigmasq\",\"type\":\"double\"},{\"name\":\"mean\",\"type\":\"LitePosition\"},{\"name\":\"totalDistance\",\"type\":\"double\"},{\"name\":\"totalTime\",\"type\":\"long\"},{\"name\":\"averageOfSpeed\",\"type\":\"double\"},{\"name\":\"averageSpeeds\",\"type\":\"double\"},{\"name\":\"numberOfRecord\",\"type\":\"int\"},{\"name\":\"lateArrivedRecordsCount\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"GPSState\",\"symbols\":[\"Stopped\",\"Moving\",\"Overspeeding\",\"Disconnected\",\"Unknown\"]}]},{\"name\":\"encodedPolyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timeAwarePolyline\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TimeAwarePolyline\",\"fields\":[{\"name\":\"polyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"compressedPolyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastPoint\",\"type\":{\"type\":\"record\",\"name\":\"PointAtTime\",\"fields\":[{\"name\":\"timestamp\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"],\"default\":null}]}},{\"name\":\"isAssumed\",\"type\":\"boolean\",\"default\":false},{\"name\":\"totalPoints\",\"type\":[\"null\",\"int\"],\"default\":null}]}],\"default\":null},{\"name\":\"polylineSegments\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TimeAwarePolyline\"}],\"default\":null},{\"name\":\"recalculatedDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"odoMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"lastOdoMeterReading\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"isDisconnected\",\"type\":\"boolean\",\"default\":false},{\"name\":\"eventType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"batteryStatus\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastStateOdometer\",\"type\":[\"null\",\"Odometer\"],\"default\":null},{\"name\":\"odometer\",\"type\":[\"null\",\"Odometer\"],\"default\":null},{\"name\":\"clusters\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Properties\",\"fields\":[{\"name\":\"catagory\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"level\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"customeFields\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"hasUTurn\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"tripPoints\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TripPoint\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"purpose\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sequenceId\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"place\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Place\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"center\",\"type\":[\"null\",\"Location\"],\"default\":null},{\"name\":\"suggestedRadius\",\"type\":\"double\",\"default\":null},{\"name\":\"viewport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ViewPort\",\"fields\":[{\"name\":\"northeast\",\"type\":[\"null\",\"Location\"],\"default\":null},{\"name\":\"southwest\",\"type\":[\"null\",\"Location\"],\"default\":null}]}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"boundary\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"eta\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"remainingDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"plannedArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"assosiatedShipmentsId\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"creationTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"outOfTrackSince\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isOutOfTrack\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isAutoCompleted\",\"type\":\"boolean\",\"default\":false},{\"name\":\"coveredDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"purposedDistance\",\"type\":[\"null\",\"double\"],\"default\":null}]}}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.fretron.Model.Shipment shipment;
  @Deprecated public com.fretron.Model.Device device;
  @Deprecated public com.fretron.Model.VehicleGpsState latestGpsState;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DeviceDetailResponse() {}

  /**
   * All-args constructor.
   * @param shipment The new value for shipment
   * @param device The new value for device
   * @param latestGpsState The new value for latestGpsState
   */
  public DeviceDetailResponse(com.fretron.Model.Shipment shipment, com.fretron.Model.Device device, com.fretron.Model.VehicleGpsState latestGpsState) {
    this.shipment = shipment;
    this.device = device;
    this.latestGpsState = latestGpsState;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return shipment;
    case 1: return device;
    case 2: return latestGpsState;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: shipment = (com.fretron.Model.Shipment)value$; break;
    case 1: device = (com.fretron.Model.Device)value$; break;
    case 2: latestGpsState = (com.fretron.Model.VehicleGpsState)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'shipment' field.
   * @return The value of the 'shipment' field.
   */
  public com.fretron.Model.Shipment getShipment() {
    return shipment;
  }

  /**
   * Sets the value of the 'shipment' field.
   * @param value the value to set.
   */
  public void setShipment(com.fretron.Model.Shipment value) {
    this.shipment = value;
  }

  /**
   * Gets the value of the 'device' field.
   * @return The value of the 'device' field.
   */
  public com.fretron.Model.Device getDevice() {
    return device;
  }

  /**
   * Sets the value of the 'device' field.
   * @param value the value to set.
   */
  public void setDevice(com.fretron.Model.Device value) {
    this.device = value;
  }

  /**
   * Gets the value of the 'latestGpsState' field.
   * @return The value of the 'latestGpsState' field.
   */
  public com.fretron.Model.VehicleGpsState getLatestGpsState() {
    return latestGpsState;
  }

  /**
   * Sets the value of the 'latestGpsState' field.
   * @param value the value to set.
   */
  public void setLatestGpsState(com.fretron.Model.VehicleGpsState value) {
    this.latestGpsState = value;
  }

  /**
   * Creates a new DeviceDetailResponse RecordBuilder.
   * @return A new DeviceDetailResponse RecordBuilder
   */
  public static com.fretron.Model.DeviceDetailResponse.Builder newBuilder() {
    return new com.fretron.Model.DeviceDetailResponse.Builder();
  }

  /**
   * Creates a new DeviceDetailResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DeviceDetailResponse RecordBuilder
   */
  public static com.fretron.Model.DeviceDetailResponse.Builder newBuilder(com.fretron.Model.DeviceDetailResponse.Builder other) {
    return new com.fretron.Model.DeviceDetailResponse.Builder(other);
  }

  /**
   * Creates a new DeviceDetailResponse RecordBuilder by copying an existing DeviceDetailResponse instance.
   * @param other The existing instance to copy.
   * @return A new DeviceDetailResponse RecordBuilder
   */
  public static com.fretron.Model.DeviceDetailResponse.Builder newBuilder(com.fretron.Model.DeviceDetailResponse other) {
    return new com.fretron.Model.DeviceDetailResponse.Builder(other);
  }

  /**
   * RecordBuilder for DeviceDetailResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DeviceDetailResponse>
    implements org.apache.avro.data.RecordBuilder<DeviceDetailResponse> {

    private com.fretron.Model.Shipment shipment;
    private com.fretron.Model.Shipment.Builder shipmentBuilder;
    private com.fretron.Model.Device device;
    private com.fretron.Model.Device.Builder deviceBuilder;
    private com.fretron.Model.VehicleGpsState latestGpsState;
    private com.fretron.Model.VehicleGpsState.Builder latestGpsStateBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.DeviceDetailResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.shipment)) {
        this.shipment = data().deepCopy(fields()[0].schema(), other.shipment);
        fieldSetFlags()[0] = true;
      }
      if (other.hasShipmentBuilder()) {
        this.shipmentBuilder = com.fretron.Model.Shipment.newBuilder(other.getShipmentBuilder());
      }
      if (isValidValue(fields()[1], other.device)) {
        this.device = data().deepCopy(fields()[1].schema(), other.device);
        fieldSetFlags()[1] = true;
      }
      if (other.hasDeviceBuilder()) {
        this.deviceBuilder = com.fretron.Model.Device.newBuilder(other.getDeviceBuilder());
      }
      if (isValidValue(fields()[2], other.latestGpsState)) {
        this.latestGpsState = data().deepCopy(fields()[2].schema(), other.latestGpsState);
        fieldSetFlags()[2] = true;
      }
      if (other.hasLatestGpsStateBuilder()) {
        this.latestGpsStateBuilder = com.fretron.Model.VehicleGpsState.newBuilder(other.getLatestGpsStateBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing DeviceDetailResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.DeviceDetailResponse other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.shipment)) {
        this.shipment = data().deepCopy(fields()[0].schema(), other.shipment);
        fieldSetFlags()[0] = true;
      }
      this.shipmentBuilder = null;
      if (isValidValue(fields()[1], other.device)) {
        this.device = data().deepCopy(fields()[1].schema(), other.device);
        fieldSetFlags()[1] = true;
      }
      this.deviceBuilder = null;
      if (isValidValue(fields()[2], other.latestGpsState)) {
        this.latestGpsState = data().deepCopy(fields()[2].schema(), other.latestGpsState);
        fieldSetFlags()[2] = true;
      }
      this.latestGpsStateBuilder = null;
    }

    /**
      * Gets the value of the 'shipment' field.
      * @return The value.
      */
    public com.fretron.Model.Shipment getShipment() {
      return shipment;
    }

    /**
      * Sets the value of the 'shipment' field.
      * @param value The value of 'shipment'.
      * @return This builder.
      */
    public com.fretron.Model.DeviceDetailResponse.Builder setShipment(com.fretron.Model.Shipment value) {
      validate(fields()[0], value);
      this.shipmentBuilder = null;
      this.shipment = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'shipment' field has been set.
      * @return True if the 'shipment' field has been set, false otherwise.
      */
    public boolean hasShipment() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'shipment' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Shipment.Builder getShipmentBuilder() {
      if (shipmentBuilder == null) {
        if (hasShipment()) {
          setShipmentBuilder(com.fretron.Model.Shipment.newBuilder(shipment));
        } else {
          setShipmentBuilder(com.fretron.Model.Shipment.newBuilder());
        }
      }
      return shipmentBuilder;
    }

    /**
     * Sets the Builder instance for the 'shipment' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.DeviceDetailResponse.Builder setShipmentBuilder(com.fretron.Model.Shipment.Builder value) {
      clearShipment();
      shipmentBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'shipment' field has an active Builder instance
     * @return True if the 'shipment' field has an active Builder instance
     */
    public boolean hasShipmentBuilder() {
      return shipmentBuilder != null;
    }

    /**
      * Clears the value of the 'shipment' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceDetailResponse.Builder clearShipment() {
      shipment = null;
      shipmentBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'device' field.
      * @return The value.
      */
    public com.fretron.Model.Device getDevice() {
      return device;
    }

    /**
      * Sets the value of the 'device' field.
      * @param value The value of 'device'.
      * @return This builder.
      */
    public com.fretron.Model.DeviceDetailResponse.Builder setDevice(com.fretron.Model.Device value) {
      validate(fields()[1], value);
      this.deviceBuilder = null;
      this.device = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'device' field has been set.
      * @return True if the 'device' field has been set, false otherwise.
      */
    public boolean hasDevice() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'device' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Device.Builder getDeviceBuilder() {
      if (deviceBuilder == null) {
        if (hasDevice()) {
          setDeviceBuilder(com.fretron.Model.Device.newBuilder(device));
        } else {
          setDeviceBuilder(com.fretron.Model.Device.newBuilder());
        }
      }
      return deviceBuilder;
    }

    /**
     * Sets the Builder instance for the 'device' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.DeviceDetailResponse.Builder setDeviceBuilder(com.fretron.Model.Device.Builder value) {
      clearDevice();
      deviceBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'device' field has an active Builder instance
     * @return True if the 'device' field has an active Builder instance
     */
    public boolean hasDeviceBuilder() {
      return deviceBuilder != null;
    }

    /**
      * Clears the value of the 'device' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceDetailResponse.Builder clearDevice() {
      device = null;
      deviceBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'latestGpsState' field.
      * @return The value.
      */
    public com.fretron.Model.VehicleGpsState getLatestGpsState() {
      return latestGpsState;
    }

    /**
      * Sets the value of the 'latestGpsState' field.
      * @param value The value of 'latestGpsState'.
      * @return This builder.
      */
    public com.fretron.Model.DeviceDetailResponse.Builder setLatestGpsState(com.fretron.Model.VehicleGpsState value) {
      validate(fields()[2], value);
      this.latestGpsStateBuilder = null;
      this.latestGpsState = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'latestGpsState' field has been set.
      * @return True if the 'latestGpsState' field has been set, false otherwise.
      */
    public boolean hasLatestGpsState() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'latestGpsState' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.VehicleGpsState.Builder getLatestGpsStateBuilder() {
      if (latestGpsStateBuilder == null) {
        if (hasLatestGpsState()) {
          setLatestGpsStateBuilder(com.fretron.Model.VehicleGpsState.newBuilder(latestGpsState));
        } else {
          setLatestGpsStateBuilder(com.fretron.Model.VehicleGpsState.newBuilder());
        }
      }
      return latestGpsStateBuilder;
    }

    /**
     * Sets the Builder instance for the 'latestGpsState' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.DeviceDetailResponse.Builder setLatestGpsStateBuilder(com.fretron.Model.VehicleGpsState.Builder value) {
      clearLatestGpsState();
      latestGpsStateBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'latestGpsState' field has an active Builder instance
     * @return True if the 'latestGpsState' field has an active Builder instance
     */
    public boolean hasLatestGpsStateBuilder() {
      return latestGpsStateBuilder != null;
    }

    /**
      * Clears the value of the 'latestGpsState' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceDetailResponse.Builder clearLatestGpsState() {
      latestGpsState = null;
      latestGpsStateBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public DeviceDetailResponse build() {
      try {
        DeviceDetailResponse record = new DeviceDetailResponse();
        if (shipmentBuilder != null) {
          record.shipment = this.shipmentBuilder.build();
        } else {
          record.shipment = fieldSetFlags()[0] ? this.shipment : (com.fretron.Model.Shipment) defaultValue(fields()[0]);
        }
        if (deviceBuilder != null) {
          record.device = this.deviceBuilder.build();
        } else {
          record.device = fieldSetFlags()[1] ? this.device : (com.fretron.Model.Device) defaultValue(fields()[1]);
        }
        if (latestGpsStateBuilder != null) {
          record.latestGpsState = this.latestGpsStateBuilder.build();
        } else {
          record.latestGpsState = fieldSetFlags()[2] ? this.latestGpsState : (com.fretron.Model.VehicleGpsState) defaultValue(fields()[2]);
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
