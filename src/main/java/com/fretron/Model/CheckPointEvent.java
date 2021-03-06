/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CheckPointEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6270360712331237158L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CheckPointEvent\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"checkPoint\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CheckPoint\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"coordinate\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"accessiblity\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"eventTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"info\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.fretron.Model.CheckPoint checkPoint;
  @Deprecated public java.lang.String type;
  @Deprecated public java.lang.Long eventTime;
  @Deprecated public java.lang.String vehicleId;
  @Deprecated public java.lang.String info;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CheckPointEvent() {}

  /**
   * All-args constructor.
   * @param checkPoint The new value for checkPoint
   * @param type The new value for type
   * @param eventTime The new value for eventTime
   * @param vehicleId The new value for vehicleId
   * @param info The new value for info
   */
  public CheckPointEvent(com.fretron.Model.CheckPoint checkPoint, java.lang.String type, java.lang.Long eventTime, java.lang.String vehicleId, java.lang.String info) {
    this.checkPoint = checkPoint;
    this.type = type;
    this.eventTime = eventTime;
    this.vehicleId = vehicleId;
    this.info = info;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return checkPoint;
    case 1: return type;
    case 2: return eventTime;
    case 3: return vehicleId;
    case 4: return info;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: checkPoint = (com.fretron.Model.CheckPoint)value$; break;
    case 1: type = (java.lang.String)value$; break;
    case 2: eventTime = (java.lang.Long)value$; break;
    case 3: vehicleId = (java.lang.String)value$; break;
    case 4: info = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'checkPoint' field.
   * @return The value of the 'checkPoint' field.
   */
  public com.fretron.Model.CheckPoint getCheckPoint() {
    return checkPoint;
  }

  /**
   * Sets the value of the 'checkPoint' field.
   * @param value the value to set.
   */
  public void setCheckPoint(com.fretron.Model.CheckPoint value) {
    this.checkPoint = value;
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
   * Gets the value of the 'eventTime' field.
   * @return The value of the 'eventTime' field.
   */
  public java.lang.Long getEventTime() {
    return eventTime;
  }

  /**
   * Sets the value of the 'eventTime' field.
   * @param value the value to set.
   */
  public void setEventTime(java.lang.Long value) {
    this.eventTime = value;
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
   * Gets the value of the 'info' field.
   * @return The value of the 'info' field.
   */
  public java.lang.String getInfo() {
    return info;
  }

  /**
   * Sets the value of the 'info' field.
   * @param value the value to set.
   */
  public void setInfo(java.lang.String value) {
    this.info = value;
  }

  /**
   * Creates a new CheckPointEvent RecordBuilder.
   * @return A new CheckPointEvent RecordBuilder
   */
  public static com.fretron.Model.CheckPointEvent.Builder newBuilder() {
    return new com.fretron.Model.CheckPointEvent.Builder();
  }

  /**
   * Creates a new CheckPointEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CheckPointEvent RecordBuilder
   */
  public static com.fretron.Model.CheckPointEvent.Builder newBuilder(com.fretron.Model.CheckPointEvent.Builder other) {
    return new com.fretron.Model.CheckPointEvent.Builder(other);
  }

  /**
   * Creates a new CheckPointEvent RecordBuilder by copying an existing CheckPointEvent instance.
   * @param other The existing instance to copy.
   * @return A new CheckPointEvent RecordBuilder
   */
  public static com.fretron.Model.CheckPointEvent.Builder newBuilder(com.fretron.Model.CheckPointEvent other) {
    return new com.fretron.Model.CheckPointEvent.Builder(other);
  }

  /**
   * RecordBuilder for CheckPointEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CheckPointEvent>
    implements org.apache.avro.data.RecordBuilder<CheckPointEvent> {

    private com.fretron.Model.CheckPoint checkPoint;
    private com.fretron.Model.CheckPoint.Builder checkPointBuilder;
    private java.lang.String type;
    private java.lang.Long eventTime;
    private java.lang.String vehicleId;
    private java.lang.String info;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.CheckPointEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.checkPoint)) {
        this.checkPoint = data().deepCopy(fields()[0].schema(), other.checkPoint);
        fieldSetFlags()[0] = true;
      }
      if (other.hasCheckPointBuilder()) {
        this.checkPointBuilder = com.fretron.Model.CheckPoint.newBuilder(other.getCheckPointBuilder());
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.eventTime)) {
        this.eventTime = data().deepCopy(fields()[2].schema(), other.eventTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[3].schema(), other.vehicleId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.info)) {
        this.info = data().deepCopy(fields()[4].schema(), other.info);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CheckPointEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.CheckPointEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.checkPoint)) {
        this.checkPoint = data().deepCopy(fields()[0].schema(), other.checkPoint);
        fieldSetFlags()[0] = true;
      }
      this.checkPointBuilder = null;
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.eventTime)) {
        this.eventTime = data().deepCopy(fields()[2].schema(), other.eventTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[3].schema(), other.vehicleId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.info)) {
        this.info = data().deepCopy(fields()[4].schema(), other.info);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'checkPoint' field.
      * @return The value.
      */
    public com.fretron.Model.CheckPoint getCheckPoint() {
      return checkPoint;
    }

    /**
      * Sets the value of the 'checkPoint' field.
      * @param value The value of 'checkPoint'.
      * @return This builder.
      */
    public com.fretron.Model.CheckPointEvent.Builder setCheckPoint(com.fretron.Model.CheckPoint value) {
      validate(fields()[0], value);
      this.checkPointBuilder = null;
      this.checkPoint = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'checkPoint' field has been set.
      * @return True if the 'checkPoint' field has been set, false otherwise.
      */
    public boolean hasCheckPoint() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'checkPoint' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.CheckPoint.Builder getCheckPointBuilder() {
      if (checkPointBuilder == null) {
        if (hasCheckPoint()) {
          setCheckPointBuilder(com.fretron.Model.CheckPoint.newBuilder(checkPoint));
        } else {
          setCheckPointBuilder(com.fretron.Model.CheckPoint.newBuilder());
        }
      }
      return checkPointBuilder;
    }

    /**
     * Sets the Builder instance for the 'checkPoint' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CheckPointEvent.Builder setCheckPointBuilder(com.fretron.Model.CheckPoint.Builder value) {
      clearCheckPoint();
      checkPointBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'checkPoint' field has an active Builder instance
     * @return True if the 'checkPoint' field has an active Builder instance
     */
    public boolean hasCheckPointBuilder() {
      return checkPointBuilder != null;
    }

    /**
      * Clears the value of the 'checkPoint' field.
      * @return This builder.
      */
    public com.fretron.Model.CheckPointEvent.Builder clearCheckPoint() {
      checkPoint = null;
      checkPointBuilder = null;
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
    public com.fretron.Model.CheckPointEvent.Builder setType(java.lang.String value) {
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
    public com.fretron.Model.CheckPointEvent.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventTime' field.
      * @return The value.
      */
    public java.lang.Long getEventTime() {
      return eventTime;
    }

    /**
      * Sets the value of the 'eventTime' field.
      * @param value The value of 'eventTime'.
      * @return This builder.
      */
    public com.fretron.Model.CheckPointEvent.Builder setEventTime(java.lang.Long value) {
      validate(fields()[2], value);
      this.eventTime = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'eventTime' field has been set.
      * @return True if the 'eventTime' field has been set, false otherwise.
      */
    public boolean hasEventTime() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'eventTime' field.
      * @return This builder.
      */
    public com.fretron.Model.CheckPointEvent.Builder clearEventTime() {
      eventTime = null;
      fieldSetFlags()[2] = false;
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
    public com.fretron.Model.CheckPointEvent.Builder setVehicleId(java.lang.String value) {
      validate(fields()[3], value);
      this.vehicleId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleId' field has been set.
      * @return True if the 'vehicleId' field has been set, false otherwise.
      */
    public boolean hasVehicleId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'vehicleId' field.
      * @return This builder.
      */
    public com.fretron.Model.CheckPointEvent.Builder clearVehicleId() {
      vehicleId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'info' field.
      * @return The value.
      */
    public java.lang.String getInfo() {
      return info;
    }

    /**
      * Sets the value of the 'info' field.
      * @param value The value of 'info'.
      * @return This builder.
      */
    public com.fretron.Model.CheckPointEvent.Builder setInfo(java.lang.String value) {
      validate(fields()[4], value);
      this.info = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'info' field has been set.
      * @return True if the 'info' field has been set, false otherwise.
      */
    public boolean hasInfo() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'info' field.
      * @return This builder.
      */
    public com.fretron.Model.CheckPointEvent.Builder clearInfo() {
      info = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public CheckPointEvent build() {
      try {
        CheckPointEvent record = new CheckPointEvent();
        if (checkPointBuilder != null) {
          record.checkPoint = this.checkPointBuilder.build();
        } else {
          record.checkPoint = fieldSetFlags()[0] ? this.checkPoint : (com.fretron.Model.CheckPoint) defaultValue(fields()[0]);
        }
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.String) defaultValue(fields()[1]);
        record.eventTime = fieldSetFlags()[2] ? this.eventTime : (java.lang.Long) defaultValue(fields()[2]);
        record.vehicleId = fieldSetFlags()[3] ? this.vehicleId : (java.lang.String) defaultValue(fields()[3]);
        record.info = fieldSetFlags()[4] ? this.info : (java.lang.String) defaultValue(fields()[4]);
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
