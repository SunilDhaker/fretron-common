/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class WindowedState extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1798962337759770768L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WindowedState\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"vehicleGpsState\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"VehicleGpsState\",\"fields\":[{\"name\":\"isManuallyAdded\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isIgnore\",\"type\":\"boolean\",\"default\":false},{\"name\":\"startTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":\"long\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"startLocation\",\"type\":{\"type\":\"record\",\"name\":\"LitePosition\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"},{\"name\":\"speed\",\"type\":\"double\"},{\"name\":\"course\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"decoder\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lngLat\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null}]}},{\"name\":\"endLocation\",\"type\":\"LitePosition\"},{\"name\":\"sigmasq\",\"type\":\"double\"},{\"name\":\"mean\",\"type\":\"LitePosition\"},{\"name\":\"totalDistance\",\"type\":\"double\"},{\"name\":\"totalTime\",\"type\":\"long\"},{\"name\":\"averageOfSpeed\",\"type\":\"double\"},{\"name\":\"averageSpeeds\",\"type\":\"double\"},{\"name\":\"numberOfRecord\",\"type\":\"int\"},{\"name\":\"lateArrivedRecordsCount\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"imei\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"GPSState\",\"symbols\":[\"Stopped\",\"Moving\",\"Overspeeding\",\"Disconnected\",\"Unknown\"]}]},{\"name\":\"encodedPolyline\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"timeAwarePolyline\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TimeAwarePolyline\",\"fields\":[{\"name\":\"polyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"compressedPolyline\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastPoint\",\"type\":{\"type\":\"record\",\"name\":\"PointAtTime\",\"fields\":[{\"name\":\"timestamp\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"],\"default\":null}]}},{\"name\":\"isAssumed\",\"type\":\"boolean\",\"default\":false}]}],\"default\":null},{\"name\":\"polylineSegments\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TimeAwarePolyline\"}],\"default\":null},{\"name\":\"eventType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"lastUpdatedTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isDirty\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isMature\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isCurrentWindow\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isSessionDirty\",\"type\":\"boolean\",\"default\":false},{\"name\":\"lastWindowEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"windowTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"litePositions\",\"type\":{\"type\":\"array\",\"items\":\"LitePosition\"},\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.fretron.Model.VehicleGpsState vehicleGpsState;
  @Deprecated public java.lang.Long lastUpdatedTime;
  @Deprecated public boolean isDirty;
  @Deprecated public boolean isMature;
  @Deprecated public boolean isCurrentWindow;
  @Deprecated public boolean isSessionDirty;
  @Deprecated public java.lang.Long lastWindowEndTime;
  @Deprecated public java.lang.Long windowTime;
  @Deprecated public java.util.List<com.fretron.Model.LitePosition> litePositions;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public WindowedState() {}

  /**
   * All-args constructor.
   * @param vehicleGpsState The new value for vehicleGpsState
   * @param lastUpdatedTime The new value for lastUpdatedTime
   * @param isDirty The new value for isDirty
   * @param isMature The new value for isMature
   * @param isCurrentWindow The new value for isCurrentWindow
   * @param isSessionDirty The new value for isSessionDirty
   * @param lastWindowEndTime The new value for lastWindowEndTime
   * @param windowTime The new value for windowTime
   * @param litePositions The new value for litePositions
   */
  public WindowedState(com.fretron.Model.VehicleGpsState vehicleGpsState, java.lang.Long lastUpdatedTime, java.lang.Boolean isDirty, java.lang.Boolean isMature, java.lang.Boolean isCurrentWindow, java.lang.Boolean isSessionDirty, java.lang.Long lastWindowEndTime, java.lang.Long windowTime, java.util.List<com.fretron.Model.LitePosition> litePositions) {
    this.vehicleGpsState = vehicleGpsState;
    this.lastUpdatedTime = lastUpdatedTime;
    this.isDirty = isDirty;
    this.isMature = isMature;
    this.isCurrentWindow = isCurrentWindow;
    this.isSessionDirty = isSessionDirty;
    this.lastWindowEndTime = lastWindowEndTime;
    this.windowTime = windowTime;
    this.litePositions = litePositions;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vehicleGpsState;
    case 1: return lastUpdatedTime;
    case 2: return isDirty;
    case 3: return isMature;
    case 4: return isCurrentWindow;
    case 5: return isSessionDirty;
    case 6: return lastWindowEndTime;
    case 7: return windowTime;
    case 8: return litePositions;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: vehicleGpsState = (com.fretron.Model.VehicleGpsState)value$; break;
    case 1: lastUpdatedTime = (java.lang.Long)value$; break;
    case 2: isDirty = (java.lang.Boolean)value$; break;
    case 3: isMature = (java.lang.Boolean)value$; break;
    case 4: isCurrentWindow = (java.lang.Boolean)value$; break;
    case 5: isSessionDirty = (java.lang.Boolean)value$; break;
    case 6: lastWindowEndTime = (java.lang.Long)value$; break;
    case 7: windowTime = (java.lang.Long)value$; break;
    case 8: litePositions = (java.util.List<com.fretron.Model.LitePosition>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'vehicleGpsState' field.
   * @return The value of the 'vehicleGpsState' field.
   */
  public com.fretron.Model.VehicleGpsState getVehicleGpsState() {
    return vehicleGpsState;
  }

  /**
   * Sets the value of the 'vehicleGpsState' field.
   * @param value the value to set.
   */
  public void setVehicleGpsState(com.fretron.Model.VehicleGpsState value) {
    this.vehicleGpsState = value;
  }

  /**
   * Gets the value of the 'lastUpdatedTime' field.
   * @return The value of the 'lastUpdatedTime' field.
   */
  public java.lang.Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  /**
   * Sets the value of the 'lastUpdatedTime' field.
   * @param value the value to set.
   */
  public void setLastUpdatedTime(java.lang.Long value) {
    this.lastUpdatedTime = value;
  }

  /**
   * Gets the value of the 'isDirty' field.
   * @return The value of the 'isDirty' field.
   */
  public java.lang.Boolean getIsDirty() {
    return isDirty;
  }

  /**
   * Sets the value of the 'isDirty' field.
   * @param value the value to set.
   */
  public void setIsDirty(java.lang.Boolean value) {
    this.isDirty = value;
  }

  /**
   * Gets the value of the 'isMature' field.
   * @return The value of the 'isMature' field.
   */
  public java.lang.Boolean getIsMature() {
    return isMature;
  }

  /**
   * Sets the value of the 'isMature' field.
   * @param value the value to set.
   */
  public void setIsMature(java.lang.Boolean value) {
    this.isMature = value;
  }

  /**
   * Gets the value of the 'isCurrentWindow' field.
   * @return The value of the 'isCurrentWindow' field.
   */
  public java.lang.Boolean getIsCurrentWindow() {
    return isCurrentWindow;
  }

  /**
   * Sets the value of the 'isCurrentWindow' field.
   * @param value the value to set.
   */
  public void setIsCurrentWindow(java.lang.Boolean value) {
    this.isCurrentWindow = value;
  }

  /**
   * Gets the value of the 'isSessionDirty' field.
   * @return The value of the 'isSessionDirty' field.
   */
  public java.lang.Boolean getIsSessionDirty() {
    return isSessionDirty;
  }

  /**
   * Sets the value of the 'isSessionDirty' field.
   * @param value the value to set.
   */
  public void setIsSessionDirty(java.lang.Boolean value) {
    this.isSessionDirty = value;
  }

  /**
   * Gets the value of the 'lastWindowEndTime' field.
   * @return The value of the 'lastWindowEndTime' field.
   */
  public java.lang.Long getLastWindowEndTime() {
    return lastWindowEndTime;
  }

  /**
   * Sets the value of the 'lastWindowEndTime' field.
   * @param value the value to set.
   */
  public void setLastWindowEndTime(java.lang.Long value) {
    this.lastWindowEndTime = value;
  }

  /**
   * Gets the value of the 'windowTime' field.
   * @return The value of the 'windowTime' field.
   */
  public java.lang.Long getWindowTime() {
    return windowTime;
  }

  /**
   * Sets the value of the 'windowTime' field.
   * @param value the value to set.
   */
  public void setWindowTime(java.lang.Long value) {
    this.windowTime = value;
  }

  /**
   * Gets the value of the 'litePositions' field.
   * @return The value of the 'litePositions' field.
   */
  public java.util.List<com.fretron.Model.LitePosition> getLitePositions() {
    return litePositions;
  }

  /**
   * Sets the value of the 'litePositions' field.
   * @param value the value to set.
   */
  public void setLitePositions(java.util.List<com.fretron.Model.LitePosition> value) {
    this.litePositions = value;
  }

  /**
   * Creates a new WindowedState RecordBuilder.
   * @return A new WindowedState RecordBuilder
   */
  public static com.fretron.Model.WindowedState.Builder newBuilder() {
    return new com.fretron.Model.WindowedState.Builder();
  }

  /**
   * Creates a new WindowedState RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new WindowedState RecordBuilder
   */
  public static com.fretron.Model.WindowedState.Builder newBuilder(com.fretron.Model.WindowedState.Builder other) {
    return new com.fretron.Model.WindowedState.Builder(other);
  }

  /**
   * Creates a new WindowedState RecordBuilder by copying an existing WindowedState instance.
   * @param other The existing instance to copy.
   * @return A new WindowedState RecordBuilder
   */
  public static com.fretron.Model.WindowedState.Builder newBuilder(com.fretron.Model.WindowedState other) {
    return new com.fretron.Model.WindowedState.Builder(other);
  }

  /**
   * RecordBuilder for WindowedState instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WindowedState>
    implements org.apache.avro.data.RecordBuilder<WindowedState> {

    private com.fretron.Model.VehicleGpsState vehicleGpsState;
    private com.fretron.Model.VehicleGpsState.Builder vehicleGpsStateBuilder;
    private java.lang.Long lastUpdatedTime;
    private boolean isDirty;
    private boolean isMature;
    private boolean isCurrentWindow;
    private boolean isSessionDirty;
    private java.lang.Long lastWindowEndTime;
    private java.lang.Long windowTime;
    private java.util.List<com.fretron.Model.LitePosition> litePositions;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.WindowedState.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.vehicleGpsState)) {
        this.vehicleGpsState = data().deepCopy(fields()[0].schema(), other.vehicleGpsState);
        fieldSetFlags()[0] = true;
      }
      if (other.hasVehicleGpsStateBuilder()) {
        this.vehicleGpsStateBuilder = com.fretron.Model.VehicleGpsState.newBuilder(other.getVehicleGpsStateBuilder());
      }
      if (isValidValue(fields()[1], other.lastUpdatedTime)) {
        this.lastUpdatedTime = data().deepCopy(fields()[1].schema(), other.lastUpdatedTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.isDirty)) {
        this.isDirty = data().deepCopy(fields()[2].schema(), other.isDirty);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.isMature)) {
        this.isMature = data().deepCopy(fields()[3].schema(), other.isMature);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.isCurrentWindow)) {
        this.isCurrentWindow = data().deepCopy(fields()[4].schema(), other.isCurrentWindow);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.isSessionDirty)) {
        this.isSessionDirty = data().deepCopy(fields()[5].schema(), other.isSessionDirty);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.lastWindowEndTime)) {
        this.lastWindowEndTime = data().deepCopy(fields()[6].schema(), other.lastWindowEndTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.windowTime)) {
        this.windowTime = data().deepCopy(fields()[7].schema(), other.windowTime);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.litePositions)) {
        this.litePositions = data().deepCopy(fields()[8].schema(), other.litePositions);
        fieldSetFlags()[8] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing WindowedState instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.WindowedState other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.vehicleGpsState)) {
        this.vehicleGpsState = data().deepCopy(fields()[0].schema(), other.vehicleGpsState);
        fieldSetFlags()[0] = true;
      }
      this.vehicleGpsStateBuilder = null;
      if (isValidValue(fields()[1], other.lastUpdatedTime)) {
        this.lastUpdatedTime = data().deepCopy(fields()[1].schema(), other.lastUpdatedTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.isDirty)) {
        this.isDirty = data().deepCopy(fields()[2].schema(), other.isDirty);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.isMature)) {
        this.isMature = data().deepCopy(fields()[3].schema(), other.isMature);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.isCurrentWindow)) {
        this.isCurrentWindow = data().deepCopy(fields()[4].schema(), other.isCurrentWindow);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.isSessionDirty)) {
        this.isSessionDirty = data().deepCopy(fields()[5].schema(), other.isSessionDirty);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.lastWindowEndTime)) {
        this.lastWindowEndTime = data().deepCopy(fields()[6].schema(), other.lastWindowEndTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.windowTime)) {
        this.windowTime = data().deepCopy(fields()[7].schema(), other.windowTime);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.litePositions)) {
        this.litePositions = data().deepCopy(fields()[8].schema(), other.litePositions);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'vehicleGpsState' field.
      * @return The value.
      */
    public com.fretron.Model.VehicleGpsState getVehicleGpsState() {
      return vehicleGpsState;
    }

    /**
      * Sets the value of the 'vehicleGpsState' field.
      * @param value The value of 'vehicleGpsState'.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder setVehicleGpsState(com.fretron.Model.VehicleGpsState value) {
      validate(fields()[0], value);
      this.vehicleGpsStateBuilder = null;
      this.vehicleGpsState = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleGpsState' field has been set.
      * @return True if the 'vehicleGpsState' field has been set, false otherwise.
      */
    public boolean hasVehicleGpsState() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'vehicleGpsState' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.VehicleGpsState.Builder getVehicleGpsStateBuilder() {
      if (vehicleGpsStateBuilder == null) {
        if (hasVehicleGpsState()) {
          setVehicleGpsStateBuilder(com.fretron.Model.VehicleGpsState.newBuilder(vehicleGpsState));
        } else {
          setVehicleGpsStateBuilder(com.fretron.Model.VehicleGpsState.newBuilder());
        }
      }
      return vehicleGpsStateBuilder;
    }

    /**
     * Sets the Builder instance for the 'vehicleGpsState' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.WindowedState.Builder setVehicleGpsStateBuilder(com.fretron.Model.VehicleGpsState.Builder value) {
      clearVehicleGpsState();
      vehicleGpsStateBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'vehicleGpsState' field has an active Builder instance
     * @return True if the 'vehicleGpsState' field has an active Builder instance
     */
    public boolean hasVehicleGpsStateBuilder() {
      return vehicleGpsStateBuilder != null;
    }

    /**
      * Clears the value of the 'vehicleGpsState' field.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder clearVehicleGpsState() {
      vehicleGpsState = null;
      vehicleGpsStateBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastUpdatedTime' field.
      * @return The value.
      */
    public java.lang.Long getLastUpdatedTime() {
      return lastUpdatedTime;
    }

    /**
      * Sets the value of the 'lastUpdatedTime' field.
      * @param value The value of 'lastUpdatedTime'.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder setLastUpdatedTime(java.lang.Long value) {
      validate(fields()[1], value);
      this.lastUpdatedTime = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastUpdatedTime' field has been set.
      * @return True if the 'lastUpdatedTime' field has been set, false otherwise.
      */
    public boolean hasLastUpdatedTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastUpdatedTime' field.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder clearLastUpdatedTime() {
      lastUpdatedTime = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'isDirty' field.
      * @return The value.
      */
    public java.lang.Boolean getIsDirty() {
      return isDirty;
    }

    /**
      * Sets the value of the 'isDirty' field.
      * @param value The value of 'isDirty'.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder setIsDirty(boolean value) {
      validate(fields()[2], value);
      this.isDirty = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'isDirty' field has been set.
      * @return True if the 'isDirty' field has been set, false otherwise.
      */
    public boolean hasIsDirty() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'isDirty' field.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder clearIsDirty() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'isMature' field.
      * @return The value.
      */
    public java.lang.Boolean getIsMature() {
      return isMature;
    }

    /**
      * Sets the value of the 'isMature' field.
      * @param value The value of 'isMature'.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder setIsMature(boolean value) {
      validate(fields()[3], value);
      this.isMature = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'isMature' field has been set.
      * @return True if the 'isMature' field has been set, false otherwise.
      */
    public boolean hasIsMature() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'isMature' field.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder clearIsMature() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'isCurrentWindow' field.
      * @return The value.
      */
    public java.lang.Boolean getIsCurrentWindow() {
      return isCurrentWindow;
    }

    /**
      * Sets the value of the 'isCurrentWindow' field.
      * @param value The value of 'isCurrentWindow'.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder setIsCurrentWindow(boolean value) {
      validate(fields()[4], value);
      this.isCurrentWindow = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'isCurrentWindow' field has been set.
      * @return True if the 'isCurrentWindow' field has been set, false otherwise.
      */
    public boolean hasIsCurrentWindow() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'isCurrentWindow' field.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder clearIsCurrentWindow() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'isSessionDirty' field.
      * @return The value.
      */
    public java.lang.Boolean getIsSessionDirty() {
      return isSessionDirty;
    }

    /**
      * Sets the value of the 'isSessionDirty' field.
      * @param value The value of 'isSessionDirty'.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder setIsSessionDirty(boolean value) {
      validate(fields()[5], value);
      this.isSessionDirty = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'isSessionDirty' field has been set.
      * @return True if the 'isSessionDirty' field has been set, false otherwise.
      */
    public boolean hasIsSessionDirty() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'isSessionDirty' field.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder clearIsSessionDirty() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastWindowEndTime' field.
      * @return The value.
      */
    public java.lang.Long getLastWindowEndTime() {
      return lastWindowEndTime;
    }

    /**
      * Sets the value of the 'lastWindowEndTime' field.
      * @param value The value of 'lastWindowEndTime'.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder setLastWindowEndTime(java.lang.Long value) {
      validate(fields()[6], value);
      this.lastWindowEndTime = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'lastWindowEndTime' field has been set.
      * @return True if the 'lastWindowEndTime' field has been set, false otherwise.
      */
    public boolean hasLastWindowEndTime() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'lastWindowEndTime' field.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder clearLastWindowEndTime() {
      lastWindowEndTime = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'windowTime' field.
      * @return The value.
      */
    public java.lang.Long getWindowTime() {
      return windowTime;
    }

    /**
      * Sets the value of the 'windowTime' field.
      * @param value The value of 'windowTime'.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder setWindowTime(java.lang.Long value) {
      validate(fields()[7], value);
      this.windowTime = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'windowTime' field has been set.
      * @return True if the 'windowTime' field has been set, false otherwise.
      */
    public boolean hasWindowTime() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'windowTime' field.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder clearWindowTime() {
      windowTime = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'litePositions' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.LitePosition> getLitePositions() {
      return litePositions;
    }

    /**
      * Sets the value of the 'litePositions' field.
      * @param value The value of 'litePositions'.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder setLitePositions(java.util.List<com.fretron.Model.LitePosition> value) {
      validate(fields()[8], value);
      this.litePositions = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'litePositions' field has been set.
      * @return True if the 'litePositions' field has been set, false otherwise.
      */
    public boolean hasLitePositions() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'litePositions' field.
      * @return This builder.
      */
    public com.fretron.Model.WindowedState.Builder clearLitePositions() {
      litePositions = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public WindowedState build() {
      try {
        WindowedState record = new WindowedState();
        if (vehicleGpsStateBuilder != null) {
          record.vehicleGpsState = this.vehicleGpsStateBuilder.build();
        } else {
          record.vehicleGpsState = fieldSetFlags()[0] ? this.vehicleGpsState : (com.fretron.Model.VehicleGpsState) defaultValue(fields()[0]);
        }
        record.lastUpdatedTime = fieldSetFlags()[1] ? this.lastUpdatedTime : (java.lang.Long) defaultValue(fields()[1]);
        record.isDirty = fieldSetFlags()[2] ? this.isDirty : (java.lang.Boolean) defaultValue(fields()[2]);
        record.isMature = fieldSetFlags()[3] ? this.isMature : (java.lang.Boolean) defaultValue(fields()[3]);
        record.isCurrentWindow = fieldSetFlags()[4] ? this.isCurrentWindow : (java.lang.Boolean) defaultValue(fields()[4]);
        record.isSessionDirty = fieldSetFlags()[5] ? this.isSessionDirty : (java.lang.Boolean) defaultValue(fields()[5]);
        record.lastWindowEndTime = fieldSetFlags()[6] ? this.lastWindowEndTime : (java.lang.Long) defaultValue(fields()[6]);
        record.windowTime = fieldSetFlags()[7] ? this.windowTime : (java.lang.Long) defaultValue(fields()[7]);
        record.litePositions = fieldSetFlags()[8] ? this.litePositions : (java.util.List<com.fretron.Model.LitePosition>) defaultValue(fields()[8]);
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
