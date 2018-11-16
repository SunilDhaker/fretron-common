/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LoadInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1124298014514912668L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LoadInfo\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"measurements\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Measurement\",\"fields\":[{\"name\":\"measurmentType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"unitOfMeasurment\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"plannedLoadQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"actualLoadedQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"netQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"grossQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"standardQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"actualDeliveredQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"shortage\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"frieghtDeductableQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"claimQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"temperature\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"density\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"moisture\",\"type\":[\"null\",\"double\"],\"default\":null}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String material;
  @Deprecated public java.util.List<com.fretron.Model.Measurement> measurements;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LoadInfo() {}

  /**
   * All-args constructor.
   * @param material The new value for material
   * @param measurements The new value for measurements
   */
  public LoadInfo(java.lang.String material, java.util.List<com.fretron.Model.Measurement> measurements) {
    this.material = material;
    this.measurements = measurements;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return material;
    case 1: return measurements;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: material = (java.lang.String)value$; break;
    case 1: measurements = (java.util.List<com.fretron.Model.Measurement>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'material' field.
   * @return The value of the 'material' field.
   */
  public java.lang.String getMaterial() {
    return material;
  }

  /**
   * Sets the value of the 'material' field.
   * @param value the value to set.
   */
  public void setMaterial(java.lang.String value) {
    this.material = value;
  }

  /**
   * Gets the value of the 'measurements' field.
   * @return The value of the 'measurements' field.
   */
  public java.util.List<com.fretron.Model.Measurement> getMeasurements() {
    return measurements;
  }

  /**
   * Sets the value of the 'measurements' field.
   * @param value the value to set.
   */
  public void setMeasurements(java.util.List<com.fretron.Model.Measurement> value) {
    this.measurements = value;
  }

  /**
   * Creates a new LoadInfo RecordBuilder.
   * @return A new LoadInfo RecordBuilder
   */
  public static com.fretron.Model.LoadInfo.Builder newBuilder() {
    return new com.fretron.Model.LoadInfo.Builder();
  }

  /**
   * Creates a new LoadInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LoadInfo RecordBuilder
   */
  public static com.fretron.Model.LoadInfo.Builder newBuilder(com.fretron.Model.LoadInfo.Builder other) {
    return new com.fretron.Model.LoadInfo.Builder(other);
  }

  /**
   * Creates a new LoadInfo RecordBuilder by copying an existing LoadInfo instance.
   * @param other The existing instance to copy.
   * @return A new LoadInfo RecordBuilder
   */
  public static com.fretron.Model.LoadInfo.Builder newBuilder(com.fretron.Model.LoadInfo other) {
    return new com.fretron.Model.LoadInfo.Builder(other);
  }

  /**
   * RecordBuilder for LoadInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LoadInfo>
    implements org.apache.avro.data.RecordBuilder<LoadInfo> {

    private java.lang.String material;
    private java.util.List<com.fretron.Model.Measurement> measurements;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.LoadInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.material)) {
        this.material = data().deepCopy(fields()[0].schema(), other.material);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.measurements)) {
        this.measurements = data().deepCopy(fields()[1].schema(), other.measurements);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing LoadInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.LoadInfo other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.material)) {
        this.material = data().deepCopy(fields()[0].schema(), other.material);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.measurements)) {
        this.measurements = data().deepCopy(fields()[1].schema(), other.measurements);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'material' field.
      * @return The value.
      */
    public java.lang.String getMaterial() {
      return material;
    }

    /**
      * Sets the value of the 'material' field.
      * @param value The value of 'material'.
      * @return This builder.
      */
    public com.fretron.Model.LoadInfo.Builder setMaterial(java.lang.String value) {
      validate(fields()[0], value);
      this.material = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'material' field has been set.
      * @return True if the 'material' field has been set, false otherwise.
      */
    public boolean hasMaterial() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'material' field.
      * @return This builder.
      */
    public com.fretron.Model.LoadInfo.Builder clearMaterial() {
      material = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'measurements' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.Measurement> getMeasurements() {
      return measurements;
    }

    /**
      * Sets the value of the 'measurements' field.
      * @param value The value of 'measurements'.
      * @return This builder.
      */
    public com.fretron.Model.LoadInfo.Builder setMeasurements(java.util.List<com.fretron.Model.Measurement> value) {
      validate(fields()[1], value);
      this.measurements = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'measurements' field has been set.
      * @return True if the 'measurements' field has been set, false otherwise.
      */
    public boolean hasMeasurements() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'measurements' field.
      * @return This builder.
      */
    public com.fretron.Model.LoadInfo.Builder clearMeasurements() {
      measurements = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public LoadInfo build() {
      try {
        LoadInfo record = new LoadInfo();
        record.material = fieldSetFlags()[0] ? this.material : (java.lang.String) defaultValue(fields()[0]);
        record.measurements = fieldSetFlags()[1] ? this.measurements : (java.util.List<com.fretron.Model.Measurement>) defaultValue(fields()[1]);
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