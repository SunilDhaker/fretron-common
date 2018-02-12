/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DeviceSession extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3140530291484690270L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DeviceSession\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"remoteAddress\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"imei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timeZoneOffset\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"isExpire\",\"type\":[\"null\",\"boolean\"],\"default\":false}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String remoteAddress;
  @Deprecated public java.lang.String imei;
  @Deprecated public java.lang.Integer timeZoneOffset;
  @Deprecated public java.lang.Boolean isExpire;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DeviceSession() {}

  /**
   * All-args constructor.
   * @param remoteAddress The new value for remoteAddress
   * @param imei The new value for imei
   * @param timeZoneOffset The new value for timeZoneOffset
   * @param isExpire The new value for isExpire
   */
  public DeviceSession(java.lang.String remoteAddress, java.lang.String imei, java.lang.Integer timeZoneOffset, java.lang.Boolean isExpire) {
    this.remoteAddress = remoteAddress;
    this.imei = imei;
    this.timeZoneOffset = timeZoneOffset;
    this.isExpire = isExpire;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return remoteAddress;
    case 1: return imei;
    case 2: return timeZoneOffset;
    case 3: return isExpire;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: remoteAddress = (java.lang.String)value$; break;
    case 1: imei = (java.lang.String)value$; break;
    case 2: timeZoneOffset = (java.lang.Integer)value$; break;
    case 3: isExpire = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'remoteAddress' field.
   * @return The value of the 'remoteAddress' field.
   */
  public java.lang.String getRemoteAddress() {
    return remoteAddress;
  }

  /**
   * Sets the value of the 'remoteAddress' field.
   * @param value the value to set.
   */
  public void setRemoteAddress(java.lang.String value) {
    this.remoteAddress = value;
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
   * Gets the value of the 'timeZoneOffset' field.
   * @return The value of the 'timeZoneOffset' field.
   */
  public java.lang.Integer getTimeZoneOffset() {
    return timeZoneOffset;
  }

  /**
   * Sets the value of the 'timeZoneOffset' field.
   * @param value the value to set.
   */
  public void setTimeZoneOffset(java.lang.Integer value) {
    this.timeZoneOffset = value;
  }

  /**
   * Gets the value of the 'isExpire' field.
   * @return The value of the 'isExpire' field.
   */
  public java.lang.Boolean getIsExpire() {
    return isExpire;
  }

  /**
   * Sets the value of the 'isExpire' field.
   * @param value the value to set.
   */
  public void setIsExpire(java.lang.Boolean value) {
    this.isExpire = value;
  }

  /**
   * Creates a new DeviceSession RecordBuilder.
   * @return A new DeviceSession RecordBuilder
   */
  public static com.fretron.Model.DeviceSession.Builder newBuilder() {
    return new com.fretron.Model.DeviceSession.Builder();
  }

  /**
   * Creates a new DeviceSession RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DeviceSession RecordBuilder
   */
  public static com.fretron.Model.DeviceSession.Builder newBuilder(com.fretron.Model.DeviceSession.Builder other) {
    return new com.fretron.Model.DeviceSession.Builder(other);
  }

  /**
   * Creates a new DeviceSession RecordBuilder by copying an existing DeviceSession instance.
   * @param other The existing instance to copy.
   * @return A new DeviceSession RecordBuilder
   */
  public static com.fretron.Model.DeviceSession.Builder newBuilder(com.fretron.Model.DeviceSession other) {
    return new com.fretron.Model.DeviceSession.Builder(other);
  }

  /**
   * RecordBuilder for DeviceSession instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DeviceSession>
    implements org.apache.avro.data.RecordBuilder<DeviceSession> {

    private java.lang.String remoteAddress;
    private java.lang.String imei;
    private java.lang.Integer timeZoneOffset;
    private java.lang.Boolean isExpire;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.DeviceSession.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.remoteAddress)) {
        this.remoteAddress = data().deepCopy(fields()[0].schema(), other.remoteAddress);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.imei)) {
        this.imei = data().deepCopy(fields()[1].schema(), other.imei);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timeZoneOffset)) {
        this.timeZoneOffset = data().deepCopy(fields()[2].schema(), other.timeZoneOffset);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.isExpire)) {
        this.isExpire = data().deepCopy(fields()[3].schema(), other.isExpire);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DeviceSession instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.DeviceSession other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.remoteAddress)) {
        this.remoteAddress = data().deepCopy(fields()[0].schema(), other.remoteAddress);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.imei)) {
        this.imei = data().deepCopy(fields()[1].schema(), other.imei);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timeZoneOffset)) {
        this.timeZoneOffset = data().deepCopy(fields()[2].schema(), other.timeZoneOffset);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.isExpire)) {
        this.isExpire = data().deepCopy(fields()[3].schema(), other.isExpire);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'remoteAddress' field.
      * @return The value.
      */
    public java.lang.String getRemoteAddress() {
      return remoteAddress;
    }

    /**
      * Sets the value of the 'remoteAddress' field.
      * @param value The value of 'remoteAddress'.
      * @return This builder.
      */
    public com.fretron.Model.DeviceSession.Builder setRemoteAddress(java.lang.String value) {
      validate(fields()[0], value);
      this.remoteAddress = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'remoteAddress' field has been set.
      * @return True if the 'remoteAddress' field has been set, false otherwise.
      */
    public boolean hasRemoteAddress() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'remoteAddress' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceSession.Builder clearRemoteAddress() {
      remoteAddress = null;
      fieldSetFlags()[0] = false;
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
    public com.fretron.Model.DeviceSession.Builder setImei(java.lang.String value) {
      validate(fields()[1], value);
      this.imei = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'imei' field has been set.
      * @return True if the 'imei' field has been set, false otherwise.
      */
    public boolean hasImei() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'imei' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceSession.Builder clearImei() {
      imei = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timeZoneOffset' field.
      * @return The value.
      */
    public java.lang.Integer getTimeZoneOffset() {
      return timeZoneOffset;
    }

    /**
      * Sets the value of the 'timeZoneOffset' field.
      * @param value The value of 'timeZoneOffset'.
      * @return This builder.
      */
    public com.fretron.Model.DeviceSession.Builder setTimeZoneOffset(java.lang.Integer value) {
      validate(fields()[2], value);
      this.timeZoneOffset = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timeZoneOffset' field has been set.
      * @return True if the 'timeZoneOffset' field has been set, false otherwise.
      */
    public boolean hasTimeZoneOffset() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timeZoneOffset' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceSession.Builder clearTimeZoneOffset() {
      timeZoneOffset = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'isExpire' field.
      * @return The value.
      */
    public java.lang.Boolean getIsExpire() {
      return isExpire;
    }

    /**
      * Sets the value of the 'isExpire' field.
      * @param value The value of 'isExpire'.
      * @return This builder.
      */
    public com.fretron.Model.DeviceSession.Builder setIsExpire(java.lang.Boolean value) {
      validate(fields()[3], value);
      this.isExpire = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'isExpire' field has been set.
      * @return True if the 'isExpire' field has been set, false otherwise.
      */
    public boolean hasIsExpire() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'isExpire' field.
      * @return This builder.
      */
    public com.fretron.Model.DeviceSession.Builder clearIsExpire() {
      isExpire = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public DeviceSession build() {
      try {
        DeviceSession record = new DeviceSession();
        record.remoteAddress = fieldSetFlags()[0] ? this.remoteAddress : (java.lang.String) defaultValue(fields()[0]);
        record.imei = fieldSetFlags()[1] ? this.imei : (java.lang.String) defaultValue(fields()[1]);
        record.timeZoneOffset = fieldSetFlags()[2] ? this.timeZoneOffset : (java.lang.Integer) defaultValue(fields()[2]);
        record.isExpire = fieldSetFlags()[3] ? this.isExpire : (java.lang.Boolean) defaultValue(fields()[3]);
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
