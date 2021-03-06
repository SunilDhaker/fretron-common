/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Odometer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -147806379498770525L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Odometer\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"softwareMeter\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"lastUpdateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isSoftwareMeterManuallyCalibrated\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"lastCalibrationTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"hardwareReading\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"hardwareDistance\",\"type\":[\"null\",\"double\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Double softwareMeter;
  @Deprecated public java.lang.Long lastUpdateTime;
  @Deprecated public java.lang.Boolean isSoftwareMeterManuallyCalibrated;
  @Deprecated public java.lang.Long lastCalibrationTime;
  @Deprecated public java.lang.Double hardwareReading;
  @Deprecated public java.lang.Double hardwareDistance;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Odometer() {}

  /**
   * All-args constructor.
   * @param softwareMeter The new value for softwareMeter
   * @param lastUpdateTime The new value for lastUpdateTime
   * @param isSoftwareMeterManuallyCalibrated The new value for isSoftwareMeterManuallyCalibrated
   * @param lastCalibrationTime The new value for lastCalibrationTime
   * @param hardwareReading The new value for hardwareReading
   * @param hardwareDistance The new value for hardwareDistance
   */
  public Odometer(java.lang.Double softwareMeter, java.lang.Long lastUpdateTime, java.lang.Boolean isSoftwareMeterManuallyCalibrated, java.lang.Long lastCalibrationTime, java.lang.Double hardwareReading, java.lang.Double hardwareDistance) {
    this.softwareMeter = softwareMeter;
    this.lastUpdateTime = lastUpdateTime;
    this.isSoftwareMeterManuallyCalibrated = isSoftwareMeterManuallyCalibrated;
    this.lastCalibrationTime = lastCalibrationTime;
    this.hardwareReading = hardwareReading;
    this.hardwareDistance = hardwareDistance;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return softwareMeter;
    case 1: return lastUpdateTime;
    case 2: return isSoftwareMeterManuallyCalibrated;
    case 3: return lastCalibrationTime;
    case 4: return hardwareReading;
    case 5: return hardwareDistance;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: softwareMeter = (java.lang.Double)value$; break;
    case 1: lastUpdateTime = (java.lang.Long)value$; break;
    case 2: isSoftwareMeterManuallyCalibrated = (java.lang.Boolean)value$; break;
    case 3: lastCalibrationTime = (java.lang.Long)value$; break;
    case 4: hardwareReading = (java.lang.Double)value$; break;
    case 5: hardwareDistance = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'softwareMeter' field.
   * @return The value of the 'softwareMeter' field.
   */
  public java.lang.Double getSoftwareMeter() {
    return softwareMeter;
  }

  /**
   * Sets the value of the 'softwareMeter' field.
   * @param value the value to set.
   */
  public void setSoftwareMeter(java.lang.Double value) {
    this.softwareMeter = value;
  }

  /**
   * Gets the value of the 'lastUpdateTime' field.
   * @return The value of the 'lastUpdateTime' field.
   */
  public java.lang.Long getLastUpdateTime() {
    return lastUpdateTime;
  }

  /**
   * Sets the value of the 'lastUpdateTime' field.
   * @param value the value to set.
   */
  public void setLastUpdateTime(java.lang.Long value) {
    this.lastUpdateTime = value;
  }

  /**
   * Gets the value of the 'isSoftwareMeterManuallyCalibrated' field.
   * @return The value of the 'isSoftwareMeterManuallyCalibrated' field.
   */
  public java.lang.Boolean getIsSoftwareMeterManuallyCalibrated() {
    return isSoftwareMeterManuallyCalibrated;
  }

  /**
   * Sets the value of the 'isSoftwareMeterManuallyCalibrated' field.
   * @param value the value to set.
   */
  public void setIsSoftwareMeterManuallyCalibrated(java.lang.Boolean value) {
    this.isSoftwareMeterManuallyCalibrated = value;
  }

  /**
   * Gets the value of the 'lastCalibrationTime' field.
   * @return The value of the 'lastCalibrationTime' field.
   */
  public java.lang.Long getLastCalibrationTime() {
    return lastCalibrationTime;
  }

  /**
   * Sets the value of the 'lastCalibrationTime' field.
   * @param value the value to set.
   */
  public void setLastCalibrationTime(java.lang.Long value) {
    this.lastCalibrationTime = value;
  }

  /**
   * Gets the value of the 'hardwareReading' field.
   * @return The value of the 'hardwareReading' field.
   */
  public java.lang.Double getHardwareReading() {
    return hardwareReading;
  }

  /**
   * Sets the value of the 'hardwareReading' field.
   * @param value the value to set.
   */
  public void setHardwareReading(java.lang.Double value) {
    this.hardwareReading = value;
  }

  /**
   * Gets the value of the 'hardwareDistance' field.
   * @return The value of the 'hardwareDistance' field.
   */
  public java.lang.Double getHardwareDistance() {
    return hardwareDistance;
  }

  /**
   * Sets the value of the 'hardwareDistance' field.
   * @param value the value to set.
   */
  public void setHardwareDistance(java.lang.Double value) {
    this.hardwareDistance = value;
  }

  /**
   * Creates a new Odometer RecordBuilder.
   * @return A new Odometer RecordBuilder
   */
  public static com.fretron.Model.Odometer.Builder newBuilder() {
    return new com.fretron.Model.Odometer.Builder();
  }

  /**
   * Creates a new Odometer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Odometer RecordBuilder
   */
  public static com.fretron.Model.Odometer.Builder newBuilder(com.fretron.Model.Odometer.Builder other) {
    return new com.fretron.Model.Odometer.Builder(other);
  }

  /**
   * Creates a new Odometer RecordBuilder by copying an existing Odometer instance.
   * @param other The existing instance to copy.
   * @return A new Odometer RecordBuilder
   */
  public static com.fretron.Model.Odometer.Builder newBuilder(com.fretron.Model.Odometer other) {
    return new com.fretron.Model.Odometer.Builder(other);
  }

  /**
   * RecordBuilder for Odometer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Odometer>
    implements org.apache.avro.data.RecordBuilder<Odometer> {

    private java.lang.Double softwareMeter;
    private java.lang.Long lastUpdateTime;
    private java.lang.Boolean isSoftwareMeterManuallyCalibrated;
    private java.lang.Long lastCalibrationTime;
    private java.lang.Double hardwareReading;
    private java.lang.Double hardwareDistance;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Odometer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.softwareMeter)) {
        this.softwareMeter = data().deepCopy(fields()[0].schema(), other.softwareMeter);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastUpdateTime)) {
        this.lastUpdateTime = data().deepCopy(fields()[1].schema(), other.lastUpdateTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.isSoftwareMeterManuallyCalibrated)) {
        this.isSoftwareMeterManuallyCalibrated = data().deepCopy(fields()[2].schema(), other.isSoftwareMeterManuallyCalibrated);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.lastCalibrationTime)) {
        this.lastCalibrationTime = data().deepCopy(fields()[3].schema(), other.lastCalibrationTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.hardwareReading)) {
        this.hardwareReading = data().deepCopy(fields()[4].schema(), other.hardwareReading);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.hardwareDistance)) {
        this.hardwareDistance = data().deepCopy(fields()[5].schema(), other.hardwareDistance);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Odometer instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Odometer other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.softwareMeter)) {
        this.softwareMeter = data().deepCopy(fields()[0].schema(), other.softwareMeter);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastUpdateTime)) {
        this.lastUpdateTime = data().deepCopy(fields()[1].schema(), other.lastUpdateTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.isSoftwareMeterManuallyCalibrated)) {
        this.isSoftwareMeterManuallyCalibrated = data().deepCopy(fields()[2].schema(), other.isSoftwareMeterManuallyCalibrated);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.lastCalibrationTime)) {
        this.lastCalibrationTime = data().deepCopy(fields()[3].schema(), other.lastCalibrationTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.hardwareReading)) {
        this.hardwareReading = data().deepCopy(fields()[4].schema(), other.hardwareReading);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.hardwareDistance)) {
        this.hardwareDistance = data().deepCopy(fields()[5].schema(), other.hardwareDistance);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'softwareMeter' field.
      * @return The value.
      */
    public java.lang.Double getSoftwareMeter() {
      return softwareMeter;
    }

    /**
      * Sets the value of the 'softwareMeter' field.
      * @param value The value of 'softwareMeter'.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder setSoftwareMeter(java.lang.Double value) {
      validate(fields()[0], value);
      this.softwareMeter = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'softwareMeter' field has been set.
      * @return True if the 'softwareMeter' field has been set, false otherwise.
      */
    public boolean hasSoftwareMeter() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'softwareMeter' field.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder clearSoftwareMeter() {
      softwareMeter = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastUpdateTime' field.
      * @return The value.
      */
    public java.lang.Long getLastUpdateTime() {
      return lastUpdateTime;
    }

    /**
      * Sets the value of the 'lastUpdateTime' field.
      * @param value The value of 'lastUpdateTime'.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder setLastUpdateTime(java.lang.Long value) {
      validate(fields()[1], value);
      this.lastUpdateTime = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastUpdateTime' field has been set.
      * @return True if the 'lastUpdateTime' field has been set, false otherwise.
      */
    public boolean hasLastUpdateTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastUpdateTime' field.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder clearLastUpdateTime() {
      lastUpdateTime = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'isSoftwareMeterManuallyCalibrated' field.
      * @return The value.
      */
    public java.lang.Boolean getIsSoftwareMeterManuallyCalibrated() {
      return isSoftwareMeterManuallyCalibrated;
    }

    /**
      * Sets the value of the 'isSoftwareMeterManuallyCalibrated' field.
      * @param value The value of 'isSoftwareMeterManuallyCalibrated'.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder setIsSoftwareMeterManuallyCalibrated(java.lang.Boolean value) {
      validate(fields()[2], value);
      this.isSoftwareMeterManuallyCalibrated = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'isSoftwareMeterManuallyCalibrated' field has been set.
      * @return True if the 'isSoftwareMeterManuallyCalibrated' field has been set, false otherwise.
      */
    public boolean hasIsSoftwareMeterManuallyCalibrated() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'isSoftwareMeterManuallyCalibrated' field.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder clearIsSoftwareMeterManuallyCalibrated() {
      isSoftwareMeterManuallyCalibrated = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastCalibrationTime' field.
      * @return The value.
      */
    public java.lang.Long getLastCalibrationTime() {
      return lastCalibrationTime;
    }

    /**
      * Sets the value of the 'lastCalibrationTime' field.
      * @param value The value of 'lastCalibrationTime'.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder setLastCalibrationTime(java.lang.Long value) {
      validate(fields()[3], value);
      this.lastCalibrationTime = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'lastCalibrationTime' field has been set.
      * @return True if the 'lastCalibrationTime' field has been set, false otherwise.
      */
    public boolean hasLastCalibrationTime() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'lastCalibrationTime' field.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder clearLastCalibrationTime() {
      lastCalibrationTime = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'hardwareReading' field.
      * @return The value.
      */
    public java.lang.Double getHardwareReading() {
      return hardwareReading;
    }

    /**
      * Sets the value of the 'hardwareReading' field.
      * @param value The value of 'hardwareReading'.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder setHardwareReading(java.lang.Double value) {
      validate(fields()[4], value);
      this.hardwareReading = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'hardwareReading' field has been set.
      * @return True if the 'hardwareReading' field has been set, false otherwise.
      */
    public boolean hasHardwareReading() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'hardwareReading' field.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder clearHardwareReading() {
      hardwareReading = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'hardwareDistance' field.
      * @return The value.
      */
    public java.lang.Double getHardwareDistance() {
      return hardwareDistance;
    }

    /**
      * Sets the value of the 'hardwareDistance' field.
      * @param value The value of 'hardwareDistance'.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder setHardwareDistance(java.lang.Double value) {
      validate(fields()[5], value);
      this.hardwareDistance = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'hardwareDistance' field has been set.
      * @return True if the 'hardwareDistance' field has been set, false otherwise.
      */
    public boolean hasHardwareDistance() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'hardwareDistance' field.
      * @return This builder.
      */
    public com.fretron.Model.Odometer.Builder clearHardwareDistance() {
      hardwareDistance = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Odometer build() {
      try {
        Odometer record = new Odometer();
        record.softwareMeter = fieldSetFlags()[0] ? this.softwareMeter : (java.lang.Double) defaultValue(fields()[0]);
        record.lastUpdateTime = fieldSetFlags()[1] ? this.lastUpdateTime : (java.lang.Long) defaultValue(fields()[1]);
        record.isSoftwareMeterManuallyCalibrated = fieldSetFlags()[2] ? this.isSoftwareMeterManuallyCalibrated : (java.lang.Boolean) defaultValue(fields()[2]);
        record.lastCalibrationTime = fieldSetFlags()[3] ? this.lastCalibrationTime : (java.lang.Long) defaultValue(fields()[3]);
        record.hardwareReading = fieldSetFlags()[4] ? this.hardwareReading : (java.lang.Double) defaultValue(fields()[4]);
        record.hardwareDistance = fieldSetFlags()[5] ? this.hardwareDistance : (java.lang.Double) defaultValue(fields()[5]);
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
