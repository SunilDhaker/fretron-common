/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TpiDataPacket extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -518136493013888430L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TpiDataPacket\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"vehicle\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Vehicle\",\"fields\":[{\"name\":\"customerId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleModel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleMake\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vtsDeviceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleRegistrationNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"associatedWith\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isDeleted\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"updateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"groups\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"driverId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"attachedDocs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isTrackingEnabled\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"groupsExtended\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OrganisationGroup\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"groupName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"groupType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}}],\"default\":null},{\"name\":\"truckLength\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"loadCapacity\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"floorType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"kmDriven\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"mileageLoaded\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"mileageEmpty\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null},{\"name\":\"device\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Device\",\"fields\":[{\"name\":\"imei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"mobileNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"manufacturerName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"isAssociated\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isDeleted\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"updateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"groups\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"isSuspended\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"usedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"attachedResourceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"position\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Position\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"]},{\"name\":\"attributes\",\"type\":{\"type\":\"record\",\"name\":\"Attributes\",\"fields\":[{\"name\":\"battery\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"alarm\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ip\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"distance\",\"type\":[\"null\",\"double\"]},{\"name\":\"totalDistance\",\"type\":[\"null\",\"double\"]},{\"name\":\"isCharge\",\"type\":\"boolean\",\"default\":false},{\"name\":\"chargingValue\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"ignition\",\"type\":\"boolean\",\"default\":false},{\"name\":\"ignitionValue\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"isOilElectricityConnected\",\"type\":\"boolean\",\"default\":false},{\"name\":\"oilElectricityValue\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"isGpsTrackingOn\",\"type\":\"boolean\",\"default\":false},{\"name\":\"acc\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"satellitesGpsQualityInfo\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"uploadReason\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uploadMode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"signalStrength\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"commandResult\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"serialNumber\",\"type\":[\"null\",\"int\"],\"default\":null}]}},{\"name\":\"deviceId\",\"type\":[\"null\",\"int\"]},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"imei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"protocol\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"serverTime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"deviceTime\",\"type\":[\"null\",\"double\"]},{\"name\":\"fixTime\",\"type\":[\"null\",\"double\"]},{\"name\":\"decoder\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"outdated\",\"type\":\"boolean\"},{\"name\":\"valid\",\"type\":\"boolean\"},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"]},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"]},{\"name\":\"altitude\",\"type\":[\"null\",\"double\"]},{\"name\":\"speed\",\"type\":[\"null\",\"double\"]},{\"name\":\"course\",\"type\":[\"null\",\"double\"]},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"accuracy\",\"type\":[\"null\",\"int\"]},{\"name\":\"network\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"movemetState\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"totalDistance\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.fretron.Model.Vehicle vehicle;
  @Deprecated public com.fretron.Model.Device device;
  @Deprecated public com.fretron.Model.Position position;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TpiDataPacket() {}

  /**
   * All-args constructor.
   * @param vehicle The new value for vehicle
   * @param device The new value for device
   * @param position The new value for position
   */
  public TpiDataPacket(com.fretron.Model.Vehicle vehicle, com.fretron.Model.Device device, com.fretron.Model.Position position) {
    this.vehicle = vehicle;
    this.device = device;
    this.position = position;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vehicle;
    case 1: return device;
    case 2: return position;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: vehicle = (com.fretron.Model.Vehicle)value$; break;
    case 1: device = (com.fretron.Model.Device)value$; break;
    case 2: position = (com.fretron.Model.Position)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'position' field.
   * @return The value of the 'position' field.
   */
  public com.fretron.Model.Position getPosition() {
    return position;
  }

  /**
   * Sets the value of the 'position' field.
   * @param value the value to set.
   */
  public void setPosition(com.fretron.Model.Position value) {
    this.position = value;
  }

  /**
   * Creates a new TpiDataPacket RecordBuilder.
   * @return A new TpiDataPacket RecordBuilder
   */
  public static com.fretron.Model.TpiDataPacket.Builder newBuilder() {
    return new com.fretron.Model.TpiDataPacket.Builder();
  }

  /**
   * Creates a new TpiDataPacket RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TpiDataPacket RecordBuilder
   */
  public static com.fretron.Model.TpiDataPacket.Builder newBuilder(com.fretron.Model.TpiDataPacket.Builder other) {
    return new com.fretron.Model.TpiDataPacket.Builder(other);
  }

  /**
   * Creates a new TpiDataPacket RecordBuilder by copying an existing TpiDataPacket instance.
   * @param other The existing instance to copy.
   * @return A new TpiDataPacket RecordBuilder
   */
  public static com.fretron.Model.TpiDataPacket.Builder newBuilder(com.fretron.Model.TpiDataPacket other) {
    return new com.fretron.Model.TpiDataPacket.Builder(other);
  }

  /**
   * RecordBuilder for TpiDataPacket instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TpiDataPacket>
    implements org.apache.avro.data.RecordBuilder<TpiDataPacket> {

    private com.fretron.Model.Vehicle vehicle;
    private com.fretron.Model.Vehicle.Builder vehicleBuilder;
    private com.fretron.Model.Device device;
    private com.fretron.Model.Device.Builder deviceBuilder;
    private com.fretron.Model.Position position;
    private com.fretron.Model.Position.Builder positionBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.TpiDataPacket.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.vehicle)) {
        this.vehicle = data().deepCopy(fields()[0].schema(), other.vehicle);
        fieldSetFlags()[0] = true;
      }
      if (other.hasVehicleBuilder()) {
        this.vehicleBuilder = com.fretron.Model.Vehicle.newBuilder(other.getVehicleBuilder());
      }
      if (isValidValue(fields()[1], other.device)) {
        this.device = data().deepCopy(fields()[1].schema(), other.device);
        fieldSetFlags()[1] = true;
      }
      if (other.hasDeviceBuilder()) {
        this.deviceBuilder = com.fretron.Model.Device.newBuilder(other.getDeviceBuilder());
      }
      if (isValidValue(fields()[2], other.position)) {
        this.position = data().deepCopy(fields()[2].schema(), other.position);
        fieldSetFlags()[2] = true;
      }
      if (other.hasPositionBuilder()) {
        this.positionBuilder = com.fretron.Model.Position.newBuilder(other.getPositionBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing TpiDataPacket instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.TpiDataPacket other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.vehicle)) {
        this.vehicle = data().deepCopy(fields()[0].schema(), other.vehicle);
        fieldSetFlags()[0] = true;
      }
      this.vehicleBuilder = null;
      if (isValidValue(fields()[1], other.device)) {
        this.device = data().deepCopy(fields()[1].schema(), other.device);
        fieldSetFlags()[1] = true;
      }
      this.deviceBuilder = null;
      if (isValidValue(fields()[2], other.position)) {
        this.position = data().deepCopy(fields()[2].schema(), other.position);
        fieldSetFlags()[2] = true;
      }
      this.positionBuilder = null;
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
    public com.fretron.Model.TpiDataPacket.Builder setVehicle(com.fretron.Model.Vehicle value) {
      validate(fields()[0], value);
      this.vehicleBuilder = null;
      this.vehicle = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicle' field has been set.
      * @return True if the 'vehicle' field has been set, false otherwise.
      */
    public boolean hasVehicle() {
      return fieldSetFlags()[0];
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
    public com.fretron.Model.TpiDataPacket.Builder setVehicleBuilder(com.fretron.Model.Vehicle.Builder value) {
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
    public com.fretron.Model.TpiDataPacket.Builder clearVehicle() {
      vehicle = null;
      vehicleBuilder = null;
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
    public com.fretron.Model.TpiDataPacket.Builder setDevice(com.fretron.Model.Device value) {
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
    public com.fretron.Model.TpiDataPacket.Builder setDeviceBuilder(com.fretron.Model.Device.Builder value) {
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
    public com.fretron.Model.TpiDataPacket.Builder clearDevice() {
      device = null;
      deviceBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'position' field.
      * @return The value.
      */
    public com.fretron.Model.Position getPosition() {
      return position;
    }

    /**
      * Sets the value of the 'position' field.
      * @param value The value of 'position'.
      * @return This builder.
      */
    public com.fretron.Model.TpiDataPacket.Builder setPosition(com.fretron.Model.Position value) {
      validate(fields()[2], value);
      this.positionBuilder = null;
      this.position = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'position' field has been set.
      * @return True if the 'position' field has been set, false otherwise.
      */
    public boolean hasPosition() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'position' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Position.Builder getPositionBuilder() {
      if (positionBuilder == null) {
        if (hasPosition()) {
          setPositionBuilder(com.fretron.Model.Position.newBuilder(position));
        } else {
          setPositionBuilder(com.fretron.Model.Position.newBuilder());
        }
      }
      return positionBuilder;
    }

    /**
     * Sets the Builder instance for the 'position' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.TpiDataPacket.Builder setPositionBuilder(com.fretron.Model.Position.Builder value) {
      clearPosition();
      positionBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'position' field has an active Builder instance
     * @return True if the 'position' field has an active Builder instance
     */
    public boolean hasPositionBuilder() {
      return positionBuilder != null;
    }

    /**
      * Clears the value of the 'position' field.
      * @return This builder.
      */
    public com.fretron.Model.TpiDataPacket.Builder clearPosition() {
      position = null;
      positionBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public TpiDataPacket build() {
      try {
        TpiDataPacket record = new TpiDataPacket();
        if (vehicleBuilder != null) {
          record.vehicle = this.vehicleBuilder.build();
        } else {
          record.vehicle = fieldSetFlags()[0] ? this.vehicle : (com.fretron.Model.Vehicle) defaultValue(fields()[0]);
        }
        if (deviceBuilder != null) {
          record.device = this.deviceBuilder.build();
        } else {
          record.device = fieldSetFlags()[1] ? this.device : (com.fretron.Model.Device) defaultValue(fields()[1]);
        }
        if (positionBuilder != null) {
          record.position = this.positionBuilder.build();
        } else {
          record.position = fieldSetFlags()[2] ? this.position : (com.fretron.Model.Position) defaultValue(fields()[2]);
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
