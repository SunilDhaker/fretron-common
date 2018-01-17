/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HourWiseMovementLog extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2291896155020232216L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HourWiseMovementLog\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"startTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"movingTime\",\"type\":\"long\"},{\"name\":\"stopTime\",\"type\":\"long\"},{\"name\":\"disconnectTime\",\"type\":\"long\"},{\"name\":\"totalDistance\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String vehicleId;
  @Deprecated public long startTime;
  @Deprecated public long endTime;
  @Deprecated public long movingTime;
  @Deprecated public long stopTime;
  @Deprecated public long disconnectTime;
  @Deprecated public double totalDistance;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HourWiseMovementLog() {}

  /**
   * All-args constructor.
   * @param vehicleId The new value for vehicleId
   * @param startTime The new value for startTime
   * @param endTime The new value for endTime
   * @param movingTime The new value for movingTime
   * @param stopTime The new value for stopTime
   * @param disconnectTime The new value for disconnectTime
   * @param totalDistance The new value for totalDistance
   */
  public HourWiseMovementLog(java.lang.String vehicleId, java.lang.Long startTime, java.lang.Long endTime, java.lang.Long movingTime, java.lang.Long stopTime, java.lang.Long disconnectTime, java.lang.Double totalDistance) {
    this.vehicleId = vehicleId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.movingTime = movingTime;
    this.stopTime = stopTime;
    this.disconnectTime = disconnectTime;
    this.totalDistance = totalDistance;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vehicleId;
    case 1: return startTime;
    case 2: return endTime;
    case 3: return movingTime;
    case 4: return stopTime;
    case 5: return disconnectTime;
    case 6: return totalDistance;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: vehicleId = (java.lang.String)value$; break;
    case 1: startTime = (java.lang.Long)value$; break;
    case 2: endTime = (java.lang.Long)value$; break;
    case 3: movingTime = (java.lang.Long)value$; break;
    case 4: stopTime = (java.lang.Long)value$; break;
    case 5: disconnectTime = (java.lang.Long)value$; break;
    case 6: totalDistance = (java.lang.Double)value$; break;
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
   * Gets the value of the 'movingTime' field.
   * @return The value of the 'movingTime' field.
   */
  public java.lang.Long getMovingTime() {
    return movingTime;
  }

  /**
   * Sets the value of the 'movingTime' field.
   * @param value the value to set.
   */
  public void setMovingTime(java.lang.Long value) {
    this.movingTime = value;
  }

  /**
   * Gets the value of the 'stopTime' field.
   * @return The value of the 'stopTime' field.
   */
  public java.lang.Long getStopTime() {
    return stopTime;
  }

  /**
   * Sets the value of the 'stopTime' field.
   * @param value the value to set.
   */
  public void setStopTime(java.lang.Long value) {
    this.stopTime = value;
  }

  /**
   * Gets the value of the 'disconnectTime' field.
   * @return The value of the 'disconnectTime' field.
   */
  public java.lang.Long getDisconnectTime() {
    return disconnectTime;
  }

  /**
   * Sets the value of the 'disconnectTime' field.
   * @param value the value to set.
   */
  public void setDisconnectTime(java.lang.Long value) {
    this.disconnectTime = value;
  }

  /**
   * Gets the value of the 'totalDistance' field.
   * @return The value of the 'totalDistance' field.
   */
  public java.lang.Double getTotalDistance() {
    return totalDistance;
  }

  /**
   * Sets the value of the 'totalDistance' field.
   * @param value the value to set.
   */
  public void setTotalDistance(java.lang.Double value) {
    this.totalDistance = value;
  }

  /**
   * Creates a new HourWiseMovementLog RecordBuilder.
   * @return A new HourWiseMovementLog RecordBuilder
   */
  public static com.fretron.Model.HourWiseMovementLog.Builder newBuilder() {
    return new com.fretron.Model.HourWiseMovementLog.Builder();
  }

  /**
   * Creates a new HourWiseMovementLog RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HourWiseMovementLog RecordBuilder
   */
  public static com.fretron.Model.HourWiseMovementLog.Builder newBuilder(com.fretron.Model.HourWiseMovementLog.Builder other) {
    return new com.fretron.Model.HourWiseMovementLog.Builder(other);
  }

  /**
   * Creates a new HourWiseMovementLog RecordBuilder by copying an existing HourWiseMovementLog instance.
   * @param other The existing instance to copy.
   * @return A new HourWiseMovementLog RecordBuilder
   */
  public static com.fretron.Model.HourWiseMovementLog.Builder newBuilder(com.fretron.Model.HourWiseMovementLog other) {
    return new com.fretron.Model.HourWiseMovementLog.Builder(other);
  }

  /**
   * RecordBuilder for HourWiseMovementLog instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HourWiseMovementLog>
    implements org.apache.avro.data.RecordBuilder<HourWiseMovementLog> {

    private java.lang.String vehicleId;
    private long startTime;
    private long endTime;
    private long movingTime;
    private long stopTime;
    private long disconnectTime;
    private double totalDistance;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.HourWiseMovementLog.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[0].schema(), other.vehicleId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.startTime)) {
        this.startTime = data().deepCopy(fields()[1].schema(), other.startTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.endTime)) {
        this.endTime = data().deepCopy(fields()[2].schema(), other.endTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.movingTime)) {
        this.movingTime = data().deepCopy(fields()[3].schema(), other.movingTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.stopTime)) {
        this.stopTime = data().deepCopy(fields()[4].schema(), other.stopTime);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.disconnectTime)) {
        this.disconnectTime = data().deepCopy(fields()[5].schema(), other.disconnectTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.totalDistance)) {
        this.totalDistance = data().deepCopy(fields()[6].schema(), other.totalDistance);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing HourWiseMovementLog instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.HourWiseMovementLog other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[0].schema(), other.vehicleId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.startTime)) {
        this.startTime = data().deepCopy(fields()[1].schema(), other.startTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.endTime)) {
        this.endTime = data().deepCopy(fields()[2].schema(), other.endTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.movingTime)) {
        this.movingTime = data().deepCopy(fields()[3].schema(), other.movingTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.stopTime)) {
        this.stopTime = data().deepCopy(fields()[4].schema(), other.stopTime);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.disconnectTime)) {
        this.disconnectTime = data().deepCopy(fields()[5].schema(), other.disconnectTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.totalDistance)) {
        this.totalDistance = data().deepCopy(fields()[6].schema(), other.totalDistance);
        fieldSetFlags()[6] = true;
      }
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
    public com.fretron.Model.HourWiseMovementLog.Builder setVehicleId(java.lang.String value) {
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
    public com.fretron.Model.HourWiseMovementLog.Builder clearVehicleId() {
      vehicleId = null;
      fieldSetFlags()[0] = false;
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
    public com.fretron.Model.HourWiseMovementLog.Builder setStartTime(long value) {
      validate(fields()[1], value);
      this.startTime = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'startTime' field has been set.
      * @return True if the 'startTime' field has been set, false otherwise.
      */
    public boolean hasStartTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'startTime' field.
      * @return This builder.
      */
    public com.fretron.Model.HourWiseMovementLog.Builder clearStartTime() {
      fieldSetFlags()[1] = false;
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
    public com.fretron.Model.HourWiseMovementLog.Builder setEndTime(long value) {
      validate(fields()[2], value);
      this.endTime = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'endTime' field has been set.
      * @return True if the 'endTime' field has been set, false otherwise.
      */
    public boolean hasEndTime() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'endTime' field.
      * @return This builder.
      */
    public com.fretron.Model.HourWiseMovementLog.Builder clearEndTime() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'movingTime' field.
      * @return The value.
      */
    public java.lang.Long getMovingTime() {
      return movingTime;
    }

    /**
      * Sets the value of the 'movingTime' field.
      * @param value The value of 'movingTime'.
      * @return This builder.
      */
    public com.fretron.Model.HourWiseMovementLog.Builder setMovingTime(long value) {
      validate(fields()[3], value);
      this.movingTime = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'movingTime' field has been set.
      * @return True if the 'movingTime' field has been set, false otherwise.
      */
    public boolean hasMovingTime() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'movingTime' field.
      * @return This builder.
      */
    public com.fretron.Model.HourWiseMovementLog.Builder clearMovingTime() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'stopTime' field.
      * @return The value.
      */
    public java.lang.Long getStopTime() {
      return stopTime;
    }

    /**
      * Sets the value of the 'stopTime' field.
      * @param value The value of 'stopTime'.
      * @return This builder.
      */
    public com.fretron.Model.HourWiseMovementLog.Builder setStopTime(long value) {
      validate(fields()[4], value);
      this.stopTime = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'stopTime' field has been set.
      * @return True if the 'stopTime' field has been set, false otherwise.
      */
    public boolean hasStopTime() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'stopTime' field.
      * @return This builder.
      */
    public com.fretron.Model.HourWiseMovementLog.Builder clearStopTime() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'disconnectTime' field.
      * @return The value.
      */
    public java.lang.Long getDisconnectTime() {
      return disconnectTime;
    }

    /**
      * Sets the value of the 'disconnectTime' field.
      * @param value The value of 'disconnectTime'.
      * @return This builder.
      */
    public com.fretron.Model.HourWiseMovementLog.Builder setDisconnectTime(long value) {
      validate(fields()[5], value);
      this.disconnectTime = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'disconnectTime' field has been set.
      * @return True if the 'disconnectTime' field has been set, false otherwise.
      */
    public boolean hasDisconnectTime() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'disconnectTime' field.
      * @return This builder.
      */
    public com.fretron.Model.HourWiseMovementLog.Builder clearDisconnectTime() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'totalDistance' field.
      * @return The value.
      */
    public java.lang.Double getTotalDistance() {
      return totalDistance;
    }

    /**
      * Sets the value of the 'totalDistance' field.
      * @param value The value of 'totalDistance'.
      * @return This builder.
      */
    public com.fretron.Model.HourWiseMovementLog.Builder setTotalDistance(double value) {
      validate(fields()[6], value);
      this.totalDistance = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'totalDistance' field has been set.
      * @return True if the 'totalDistance' field has been set, false otherwise.
      */
    public boolean hasTotalDistance() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'totalDistance' field.
      * @return This builder.
      */
    public com.fretron.Model.HourWiseMovementLog.Builder clearTotalDistance() {
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public HourWiseMovementLog build() {
      try {
        HourWiseMovementLog record = new HourWiseMovementLog();
        record.vehicleId = fieldSetFlags()[0] ? this.vehicleId : (java.lang.String) defaultValue(fields()[0]);
        record.startTime = fieldSetFlags()[1] ? this.startTime : (java.lang.Long) defaultValue(fields()[1]);
        record.endTime = fieldSetFlags()[2] ? this.endTime : (java.lang.Long) defaultValue(fields()[2]);
        record.movingTime = fieldSetFlags()[3] ? this.movingTime : (java.lang.Long) defaultValue(fields()[3]);
        record.stopTime = fieldSetFlags()[4] ? this.stopTime : (java.lang.Long) defaultValue(fields()[4]);
        record.disconnectTime = fieldSetFlags()[5] ? this.disconnectTime : (java.lang.Long) defaultValue(fields()[5]);
        record.totalDistance = fieldSetFlags()[6] ? this.totalDistance : (java.lang.Double) defaultValue(fields()[6]);
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
