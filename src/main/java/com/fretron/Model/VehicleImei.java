/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class VehicleImei extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 207198460305754116L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VehicleImei\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"imei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleUUID\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String imei;
  @Deprecated public java.lang.String vehicleUUID;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public VehicleImei() {}

  /**
   * All-args constructor.
   * @param imei The new value for imei
   * @param vehicleUUID The new value for vehicleUUID
   */
  public VehicleImei(java.lang.String imei, java.lang.String vehicleUUID) {
    this.imei = imei;
    this.vehicleUUID = vehicleUUID;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return imei;
    case 1: return vehicleUUID;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: imei = (java.lang.String)value$; break;
    case 1: vehicleUUID = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'vehicleUUID' field.
   * @return The value of the 'vehicleUUID' field.
   */
  public java.lang.String getVehicleUUID() {
    return vehicleUUID;
  }

  /**
   * Sets the value of the 'vehicleUUID' field.
   * @param value the value to set.
   */
  public void setVehicleUUID(java.lang.String value) {
    this.vehicleUUID = value;
  }

  /**
   * Creates a new VehicleImei RecordBuilder.
   * @return A new VehicleImei RecordBuilder
   */
  public static com.fretron.Model.VehicleImei.Builder newBuilder() {
    return new com.fretron.Model.VehicleImei.Builder();
  }

  /**
   * Creates a new VehicleImei RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new VehicleImei RecordBuilder
   */
  public static com.fretron.Model.VehicleImei.Builder newBuilder(com.fretron.Model.VehicleImei.Builder other) {
    return new com.fretron.Model.VehicleImei.Builder(other);
  }

  /**
   * Creates a new VehicleImei RecordBuilder by copying an existing VehicleImei instance.
   * @param other The existing instance to copy.
   * @return A new VehicleImei RecordBuilder
   */
  public static com.fretron.Model.VehicleImei.Builder newBuilder(com.fretron.Model.VehicleImei other) {
    return new com.fretron.Model.VehicleImei.Builder(other);
  }

  /**
   * RecordBuilder for VehicleImei instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VehicleImei>
    implements org.apache.avro.data.RecordBuilder<VehicleImei> {

    private java.lang.String imei;
    private java.lang.String vehicleUUID;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.VehicleImei.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.imei)) {
        this.imei = data().deepCopy(fields()[0].schema(), other.imei);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vehicleUUID)) {
        this.vehicleUUID = data().deepCopy(fields()[1].schema(), other.vehicleUUID);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing VehicleImei instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.VehicleImei other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.imei)) {
        this.imei = data().deepCopy(fields()[0].schema(), other.imei);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vehicleUUID)) {
        this.vehicleUUID = data().deepCopy(fields()[1].schema(), other.vehicleUUID);
        fieldSetFlags()[1] = true;
      }
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
    public com.fretron.Model.VehicleImei.Builder setImei(java.lang.String value) {
      validate(fields()[0], value);
      this.imei = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'imei' field has been set.
      * @return True if the 'imei' field has been set, false otherwise.
      */
    public boolean hasImei() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'imei' field.
      * @return This builder.
      */
    public com.fretron.Model.VehicleImei.Builder clearImei() {
      imei = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'vehicleUUID' field.
      * @return The value.
      */
    public java.lang.String getVehicleUUID() {
      return vehicleUUID;
    }

    /**
      * Sets the value of the 'vehicleUUID' field.
      * @param value The value of 'vehicleUUID'.
      * @return This builder.
      */
    public com.fretron.Model.VehicleImei.Builder setVehicleUUID(java.lang.String value) {
      validate(fields()[1], value);
      this.vehicleUUID = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleUUID' field has been set.
      * @return True if the 'vehicleUUID' field has been set, false otherwise.
      */
    public boolean hasVehicleUUID() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'vehicleUUID' field.
      * @return This builder.
      */
    public com.fretron.Model.VehicleImei.Builder clearVehicleUUID() {
      vehicleUUID = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public VehicleImei build() {
      try {
        VehicleImei record = new VehicleImei();
        record.imei = fieldSetFlags()[0] ? this.imei : (java.lang.String) defaultValue(fields()[0]);
        record.vehicleUUID = fieldSetFlags()[1] ? this.vehicleUUID : (java.lang.String) defaultValue(fields()[1]);
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
