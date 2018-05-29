/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DeviceStateSessions extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6995195745055201319L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DeviceStateSessions\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"imei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"startTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"endTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"lngLat\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"endLngLat\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String type;
  @Deprecated public java.lang.String state;
  @Deprecated public java.lang.String imei;
  @Deprecated public java.lang.String vehicleId;
  @Deprecated public java.lang.Long startTime;
  @Deprecated public java.lang.Long endTime;
  @Deprecated public java.util.List<java.lang.Double> lngLat;
  @Deprecated public java.util.List<java.lang.Double> endLngLat;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DeviceStateSessions() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param type The new value for type
   * @param state The new value for state
   * @param imei The new value for imei
   * @param vehicleId The new value for vehicleId
   * @param startTime The new value for startTime
   * @param endTime The new value for endTime
   * @param lngLat The new value for lngLat
   * @param endLngLat The new value for endLngLat
   */
  public DeviceStateSessions(java.lang.String uuid, java.lang.String type, java.lang.String state, java.lang.String imei, java.lang.String vehicleId, java.lang.Long startTime, java.lang.Long endTime, java.util.List<java.lang.Double> lngLat, java.util.List<java.lang.Double> endLngLat) {
    this.uuid = uuid;
    this.type = type;
    this.state = state;
    this.imei = imei;
    this.vehicleId = vehicleId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.lngLat = lngLat;
    this.endLngLat = endLngLat;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return type;
    case 2: return state;
    case 3: return imei;
    case 4: return vehicleId;
    case 5: return startTime;
    case 6: return endTime;
    case 7: return lngLat;
    case 8: return endLngLat;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: type = (java.lang.String)value$; break;
    case 2: state = (java.lang.String)value$; break;
    case 3: imei = (java.lang.String)value$; break;
    case 4: vehicleId = (java.lang.String)value$; break;
    case 5: startTime = (java.lang.Long)value$; break;
    case 6: endTime = (java.lang.Long)value$; break;
    case 7: lngLat = (java.util.List<java.lang.Double>)value$; break;
    case 8: endLngLat = (java.util.List<java.lang.Double>)value$; break;
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
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.String value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'imei' field.
   * @return The value of the 'imei' field.
   */
  public java.lang.String getImei() {
    return imei;
  }

  /**
   * Sets the value of the 'imei' field.
   * @param value the value to set.
   */
  public void setImei(java.lang.String value) {
    this.imei = value;
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
   * Gets the value of the 'lngLat' field.
   * @return The value of the 'lngLat' field.
   */
  public java.util.List<java.lang.Double> getLngLat() {
    return lngLat;
  }

  /**
   * Sets the value of the 'lngLat' field.
   * @param value the value to set.
   */
  public void setLngLat(java.util.List<java.lang.Double> value) {
    this.lngLat = value;
  }

  /**
   * Gets the value of the 'endLngLat' field.
   * @return The value of the 'endLngLat' field.
   */
  public java.util.List<java.lang.Double> getEndLngLat() {
    return endLngLat;
  }

  /**
   * Sets the value of the 'endLngLat' field.
   * @param value the value to set.
   */
  public void setEndLngLat(java.util.List<java.lang.Double> value) {
    this.endLngLat = value;
  }

  /**
   * Creates a new DeviceStateSessions RecordBuilder.
   * @return A new DeviceStateSessions RecordBuilder
   */
  public static com.fretron.Model.DeviceStateSessions.Builder newBuilder() {
    return new com.fretron.Model.DeviceStateSessions.Builder();
  }

  /**
   * Creates a new DeviceStateSessions RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DeviceStateSessions RecordBuilder
   */
  public static com.fretron.Model.DeviceStateSessions.Builder newBuilder(com.fretron.Model.DeviceStateSessions.Builder other) {
    return new com.fretron.Model.DeviceStateSessions.Builder(other);
  }

  /**
   * Creates a new DeviceStateSessions RecordBuilder by copying an existing DeviceStateSessions instance.
   * @param other The existing instance to copy.
   * @return A new DeviceStateSessions RecordBuilder
   */
  public static com.fretron.Model.DeviceStateSessions.Builder newBuilder(com.fretron.Model.DeviceStateSessions other) {
    return new com.fretron.Model.DeviceStateSessions.Builder(other);
  }

  /**
   * RecordBuilder for DeviceStateSessions instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DeviceStateSessions>
    implements org.apache.avro.data.RecordBuilder<DeviceStateSessions> {

    private java.lang.String uuid;
    private java.lang.String type;
    private java.lang.String state;
    private java.lang.String imei;
    private java.lang.String vehicleId;
    private java.lang.Long startTime;
    private java.lang.Long endTime;
    private java.util.List<java.lang.Double> lngLat;
    private java.util.List<java.lang.Double> endLngLat;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.DeviceStateSessions.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.imei)) {
        this.imei = data().deepCopy(fields()[3].schema(), other.imei);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[4].schema(), other.vehicleId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.startTime)) {
        this.startTime = data().deepCopy(fields()[5].schema(), other.startTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.endTime)) {
        this.endTime = data().deepCopy(fields()[6].schema(), other.endTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.lngLat)) {
        this.lngLat = data().deepCopy(fields()[7].schema(), other.lngLat);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.endLngLat)) {
        this.endLngLat = data().deepCopy(fields()[8].schema(), other.endLngLat);
        fieldSetFlags()[8] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DeviceStateSessions instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.DeviceStateSessions other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.imei)) {
        this.imei = data().deepCopy(fields()[3].schema(), other.imei);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[4].schema(), other.vehicleId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.startTime)) {
        this.startTime = data().deepCopy(fields()[5].schema(), other.startTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.endTime)) {
        this.endTime = data().deepCopy(fields()[6].schema(), other.endTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.lngLat)) {
        this.lngLat = data().deepCopy(fields()[7].schema(), other.lngLat);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.endLngLat)) {
        this.endLngLat = data().deepCopy(fields()[8].schema(), other.endLngLat);
        fieldSetFlags()[8] = true;
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
    public com.fretron.Model.DeviceStateSessions.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.DeviceStateSessions.Builder clearUuid() {
      uuid = null;
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
    public com.fretron.Model.DeviceStateSessions.Builder setType(java.lang.String value) {
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
    public com.fretron.Model.DeviceStateSessions.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public java.lang.String getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public com.fretron.Model.DeviceStateSessions.Builder setState(java.lang.String value) {
      validate(fields()[2], value);
      this.state = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceStateSessions.Builder clearState() {
      state = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'imei' field.
      * @return The value.
      */
    public java.lang.String getImei() {
      return imei;
    }

    /**
      * Sets the value of the 'imei' field.
      * @param value The value of 'imei'.
      * @return This builder.
      */
    public com.fretron.Model.DeviceStateSessions.Builder setImei(java.lang.String value) {
      validate(fields()[3], value);
      this.imei = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'imei' field has been set.
      * @return True if the 'imei' field has been set, false otherwise.
      */
    public boolean hasImei() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'imei' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceStateSessions.Builder clearImei() {
      imei = null;
      fieldSetFlags()[3] = false;
      return this;
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
    public com.fretron.Model.DeviceStateSessions.Builder setVehicleId(java.lang.String value) {
      validate(fields()[4], value);
      this.vehicleId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleId' field has been set.
      * @return True if the 'vehicleId' field has been set, false otherwise.
      */
    public boolean hasVehicleId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'vehicleId' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceStateSessions.Builder clearVehicleId() {
      vehicleId = null;
      fieldSetFlags()[4] = false;
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
    public com.fretron.Model.DeviceStateSessions.Builder setStartTime(java.lang.Long value) {
      validate(fields()[5], value);
      this.startTime = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'startTime' field has been set.
      * @return True if the 'startTime' field has been set, false otherwise.
      */
    public boolean hasStartTime() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'startTime' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceStateSessions.Builder clearStartTime() {
      startTime = null;
      fieldSetFlags()[5] = false;
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
    public com.fretron.Model.DeviceStateSessions.Builder setEndTime(java.lang.Long value) {
      validate(fields()[6], value);
      this.endTime = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'endTime' field has been set.
      * @return True if the 'endTime' field has been set, false otherwise.
      */
    public boolean hasEndTime() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'endTime' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceStateSessions.Builder clearEndTime() {
      endTime = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'lngLat' field.
      * @return The value.
      */
    public java.util.List<java.lang.Double> getLngLat() {
      return lngLat;
    }

    /**
      * Sets the value of the 'lngLat' field.
      * @param value The value of 'lngLat'.
      * @return This builder.
      */
    public com.fretron.Model.DeviceStateSessions.Builder setLngLat(java.util.List<java.lang.Double> value) {
      validate(fields()[7], value);
      this.lngLat = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'lngLat' field has been set.
      * @return True if the 'lngLat' field has been set, false otherwise.
      */
    public boolean hasLngLat() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'lngLat' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceStateSessions.Builder clearLngLat() {
      lngLat = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'endLngLat' field.
      * @return The value.
      */
    public java.util.List<java.lang.Double> getEndLngLat() {
      return endLngLat;
    }

    /**
      * Sets the value of the 'endLngLat' field.
      * @param value The value of 'endLngLat'.
      * @return This builder.
      */
    public com.fretron.Model.DeviceStateSessions.Builder setEndLngLat(java.util.List<java.lang.Double> value) {
      validate(fields()[8], value);
      this.endLngLat = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'endLngLat' field has been set.
      * @return True if the 'endLngLat' field has been set, false otherwise.
      */
    public boolean hasEndLngLat() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'endLngLat' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceStateSessions.Builder clearEndLngLat() {
      endLngLat = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public DeviceStateSessions build() {
      try {
        DeviceStateSessions record = new DeviceStateSessions();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.String) defaultValue(fields()[1]);
        record.state = fieldSetFlags()[2] ? this.state : (java.lang.String) defaultValue(fields()[2]);
        record.imei = fieldSetFlags()[3] ? this.imei : (java.lang.String) defaultValue(fields()[3]);
        record.vehicleId = fieldSetFlags()[4] ? this.vehicleId : (java.lang.String) defaultValue(fields()[4]);
        record.startTime = fieldSetFlags()[5] ? this.startTime : (java.lang.Long) defaultValue(fields()[5]);
        record.endTime = fieldSetFlags()[6] ? this.endTime : (java.lang.Long) defaultValue(fields()[6]);
        record.lngLat = fieldSetFlags()[7] ? this.lngLat : (java.util.List<java.lang.Double>) defaultValue(fields()[7]);
        record.endLngLat = fieldSetFlags()[8] ? this.endLngLat : (java.util.List<java.lang.Double>) defaultValue(fields()[8]);
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
