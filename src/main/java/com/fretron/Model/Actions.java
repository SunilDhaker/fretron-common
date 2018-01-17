/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Actions extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1977979318421253470L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Actions\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"oldState\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"VehicleTripState\",\"fields\":[{\"name\":\"deviceImei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"VehicleState\",\"symbols\":[\"WaitingForLoad\",\"EnrouteForPickUp\",\"AtPickUpPoint\",\"EnrouteForDestination\",\"AtDestination\"]}],\"default\":null},{\"name\":\"tripId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"startTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"newState\",\"type\":[\"null\",\"VehicleTripState\"],\"default\":null},{\"name\":\"eventStartTime\",\"type\":[\"null\",\"long\"],\"logicalType\":\"timestamp-millis\"},{\"name\":\"causedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.fretron.Model.VehicleTripState oldState;
  @Deprecated public com.fretron.Model.VehicleTripState newState;
  @Deprecated public java.lang.Long eventStartTime;
  @Deprecated public java.lang.String causedBy;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Actions() {}

  /**
   * All-args constructor.
   * @param oldState The new value for oldState
   * @param newState The new value for newState
   * @param eventStartTime The new value for eventStartTime
   * @param causedBy The new value for causedBy
   */
  public Actions(com.fretron.Model.VehicleTripState oldState, com.fretron.Model.VehicleTripState newState, java.lang.Long eventStartTime, java.lang.String causedBy) {
    this.oldState = oldState;
    this.newState = newState;
    this.eventStartTime = eventStartTime;
    this.causedBy = causedBy;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return oldState;
    case 1: return newState;
    case 2: return eventStartTime;
    case 3: return causedBy;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: oldState = (com.fretron.Model.VehicleTripState)value$; break;
    case 1: newState = (com.fretron.Model.VehicleTripState)value$; break;
    case 2: eventStartTime = (java.lang.Long)value$; break;
    case 3: causedBy = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'oldState' field.
   * @return The value of the 'oldState' field.
   */
  public com.fretron.Model.VehicleTripState getOldState() {
    return oldState;
  }

  /**
   * Sets the value of the 'oldState' field.
   * @param value the value to set.
   */
  public void setOldState(com.fretron.Model.VehicleTripState value) {
    this.oldState = value;
  }

  /**
   * Gets the value of the 'newState' field.
   * @return The value of the 'newState' field.
   */
  public com.fretron.Model.VehicleTripState getNewState() {
    return newState;
  }

  /**
   * Sets the value of the 'newState' field.
   * @param value the value to set.
   */
  public void setNewState(com.fretron.Model.VehicleTripState value) {
    this.newState = value;
  }

  /**
   * Gets the value of the 'eventStartTime' field.
   * @return The value of the 'eventStartTime' field.
   */
  public java.lang.Long getEventStartTime() {
    return eventStartTime;
  }

  /**
   * Sets the value of the 'eventStartTime' field.
   * @param value the value to set.
   */
  public void setEventStartTime(java.lang.Long value) {
    this.eventStartTime = value;
  }

  /**
   * Gets the value of the 'causedBy' field.
   * @return The value of the 'causedBy' field.
   */
  public java.lang.String getCausedBy() {
    return causedBy;
  }

  /**
   * Sets the value of the 'causedBy' field.
   * @param value the value to set.
   */
  public void setCausedBy(java.lang.String value) {
    this.causedBy = value;
  }

  /**
   * Creates a new Actions RecordBuilder.
   * @return A new Actions RecordBuilder
   */
  public static com.fretron.Model.Actions.Builder newBuilder() {
    return new com.fretron.Model.Actions.Builder();
  }

  /**
   * Creates a new Actions RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Actions RecordBuilder
   */
  public static com.fretron.Model.Actions.Builder newBuilder(com.fretron.Model.Actions.Builder other) {
    return new com.fretron.Model.Actions.Builder(other);
  }

  /**
   * Creates a new Actions RecordBuilder by copying an existing Actions instance.
   * @param other The existing instance to copy.
   * @return A new Actions RecordBuilder
   */
  public static com.fretron.Model.Actions.Builder newBuilder(com.fretron.Model.Actions other) {
    return new com.fretron.Model.Actions.Builder(other);
  }

  /**
   * RecordBuilder for Actions instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Actions>
    implements org.apache.avro.data.RecordBuilder<Actions> {

    private com.fretron.Model.VehicleTripState oldState;
    private com.fretron.Model.VehicleTripState.Builder oldStateBuilder;
    private com.fretron.Model.VehicleTripState newState;
    private com.fretron.Model.VehicleTripState.Builder newStateBuilder;
    private java.lang.Long eventStartTime;
    private java.lang.String causedBy;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Actions.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.oldState)) {
        this.oldState = data().deepCopy(fields()[0].schema(), other.oldState);
        fieldSetFlags()[0] = true;
      }
      if (other.hasOldStateBuilder()) {
        this.oldStateBuilder = com.fretron.Model.VehicleTripState.newBuilder(other.getOldStateBuilder());
      }
      if (isValidValue(fields()[1], other.newState)) {
        this.newState = data().deepCopy(fields()[1].schema(), other.newState);
        fieldSetFlags()[1] = true;
      }
      if (other.hasNewStateBuilder()) {
        this.newStateBuilder = com.fretron.Model.VehicleTripState.newBuilder(other.getNewStateBuilder());
      }
      if (isValidValue(fields()[2], other.eventStartTime)) {
        this.eventStartTime = data().deepCopy(fields()[2].schema(), other.eventStartTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.causedBy)) {
        this.causedBy = data().deepCopy(fields()[3].schema(), other.causedBy);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Actions instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Actions other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.oldState)) {
        this.oldState = data().deepCopy(fields()[0].schema(), other.oldState);
        fieldSetFlags()[0] = true;
      }
      this.oldStateBuilder = null;
      if (isValidValue(fields()[1], other.newState)) {
        this.newState = data().deepCopy(fields()[1].schema(), other.newState);
        fieldSetFlags()[1] = true;
      }
      this.newStateBuilder = null;
      if (isValidValue(fields()[2], other.eventStartTime)) {
        this.eventStartTime = data().deepCopy(fields()[2].schema(), other.eventStartTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.causedBy)) {
        this.causedBy = data().deepCopy(fields()[3].schema(), other.causedBy);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'oldState' field.
      * @return The value.
      */
    public com.fretron.Model.VehicleTripState getOldState() {
      return oldState;
    }

    /**
      * Sets the value of the 'oldState' field.
      * @param value The value of 'oldState'.
      * @return This builder.
      */
    public com.fretron.Model.Actions.Builder setOldState(com.fretron.Model.VehicleTripState value) {
      validate(fields()[0], value);
      this.oldStateBuilder = null;
      this.oldState = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'oldState' field has been set.
      * @return True if the 'oldState' field has been set, false otherwise.
      */
    public boolean hasOldState() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'oldState' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.VehicleTripState.Builder getOldStateBuilder() {
      if (oldStateBuilder == null) {
        if (hasOldState()) {
          setOldStateBuilder(com.fretron.Model.VehicleTripState.newBuilder(oldState));
        } else {
          setOldStateBuilder(com.fretron.Model.VehicleTripState.newBuilder());
        }
      }
      return oldStateBuilder;
    }

    /**
     * Sets the Builder instance for the 'oldState' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.Actions.Builder setOldStateBuilder(com.fretron.Model.VehicleTripState.Builder value) {
      clearOldState();
      oldStateBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'oldState' field has an active Builder instance
     * @return True if the 'oldState' field has an active Builder instance
     */
    public boolean hasOldStateBuilder() {
      return oldStateBuilder != null;
    }

    /**
      * Clears the value of the 'oldState' field.
      * @return This builder.
      */
    public com.fretron.Model.Actions.Builder clearOldState() {
      oldState = null;
      oldStateBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'newState' field.
      * @return The value.
      */
    public com.fretron.Model.VehicleTripState getNewState() {
      return newState;
    }

    /**
      * Sets the value of the 'newState' field.
      * @param value The value of 'newState'.
      * @return This builder.
      */
    public com.fretron.Model.Actions.Builder setNewState(com.fretron.Model.VehicleTripState value) {
      validate(fields()[1], value);
      this.newStateBuilder = null;
      this.newState = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'newState' field has been set.
      * @return True if the 'newState' field has been set, false otherwise.
      */
    public boolean hasNewState() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'newState' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.VehicleTripState.Builder getNewStateBuilder() {
      if (newStateBuilder == null) {
        if (hasNewState()) {
          setNewStateBuilder(com.fretron.Model.VehicleTripState.newBuilder(newState));
        } else {
          setNewStateBuilder(com.fretron.Model.VehicleTripState.newBuilder());
        }
      }
      return newStateBuilder;
    }

    /**
     * Sets the Builder instance for the 'newState' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.Actions.Builder setNewStateBuilder(com.fretron.Model.VehicleTripState.Builder value) {
      clearNewState();
      newStateBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'newState' field has an active Builder instance
     * @return True if the 'newState' field has an active Builder instance
     */
    public boolean hasNewStateBuilder() {
      return newStateBuilder != null;
    }

    /**
      * Clears the value of the 'newState' field.
      * @return This builder.
      */
    public com.fretron.Model.Actions.Builder clearNewState() {
      newState = null;
      newStateBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventStartTime' field.
      * @return The value.
      */
    public java.lang.Long getEventStartTime() {
      return eventStartTime;
    }

    /**
      * Sets the value of the 'eventStartTime' field.
      * @param value The value of 'eventStartTime'.
      * @return This builder.
      */
    public com.fretron.Model.Actions.Builder setEventStartTime(java.lang.Long value) {
      validate(fields()[2], value);
      this.eventStartTime = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'eventStartTime' field has been set.
      * @return True if the 'eventStartTime' field has been set, false otherwise.
      */
    public boolean hasEventStartTime() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'eventStartTime' field.
      * @return This builder.
      */
    public com.fretron.Model.Actions.Builder clearEventStartTime() {
      eventStartTime = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'causedBy' field.
      * @return The value.
      */
    public java.lang.String getCausedBy() {
      return causedBy;
    }

    /**
      * Sets the value of the 'causedBy' field.
      * @param value The value of 'causedBy'.
      * @return This builder.
      */
    public com.fretron.Model.Actions.Builder setCausedBy(java.lang.String value) {
      validate(fields()[3], value);
      this.causedBy = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'causedBy' field has been set.
      * @return True if the 'causedBy' field has been set, false otherwise.
      */
    public boolean hasCausedBy() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'causedBy' field.
      * @return This builder.
      */
    public com.fretron.Model.Actions.Builder clearCausedBy() {
      causedBy = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Actions build() {
      try {
        Actions record = new Actions();
        if (oldStateBuilder != null) {
          record.oldState = this.oldStateBuilder.build();
        } else {
          record.oldState = fieldSetFlags()[0] ? this.oldState : (com.fretron.Model.VehicleTripState) defaultValue(fields()[0]);
        }
        if (newStateBuilder != null) {
          record.newState = this.newStateBuilder.build();
        } else {
          record.newState = fieldSetFlags()[1] ? this.newState : (com.fretron.Model.VehicleTripState) defaultValue(fields()[1]);
        }
        record.eventStartTime = fieldSetFlags()[2] ? this.eventStartTime : (java.lang.Long) defaultValue(fields()[2]);
        record.causedBy = fieldSetFlags()[3] ? this.causedBy : (java.lang.String) defaultValue(fields()[3]);
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
