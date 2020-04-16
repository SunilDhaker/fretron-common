/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ShipmentWindow extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7541239833082958024L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShipmentWindow\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"startTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"endTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"tripState\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"tripId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"windowUuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"shipmentUuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"imei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isOverlapping\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"isShipmentCompleted\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Long startTime;
  @Deprecated public java.lang.Long endTime;
  @Deprecated public java.lang.String tripState;
  @Deprecated public java.lang.String tripId;
  @Deprecated public java.lang.String windowUuid;
  @Deprecated public java.lang.String shipmentUuid;
  @Deprecated public java.lang.String vehicleId;
  @Deprecated public java.lang.String imei;
  @Deprecated public java.lang.Boolean isOverlapping;
  @Deprecated public java.lang.Boolean isShipmentCompleted;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ShipmentWindow() {}

  /**
   * All-args constructor.
   * @param startTime The new value for startTime
   * @param endTime The new value for endTime
   * @param tripState The new value for tripState
   * @param tripId The new value for tripId
   * @param windowUuid The new value for windowUuid
   * @param shipmentUuid The new value for shipmentUuid
   * @param vehicleId The new value for vehicleId
   * @param imei The new value for imei
   * @param isOverlapping The new value for isOverlapping
   * @param isShipmentCompleted The new value for isShipmentCompleted
   */
  public ShipmentWindow(java.lang.Long startTime, java.lang.Long endTime, java.lang.String tripState, java.lang.String tripId, java.lang.String windowUuid, java.lang.String shipmentUuid, java.lang.String vehicleId, java.lang.String imei, java.lang.Boolean isOverlapping, java.lang.Boolean isShipmentCompleted) {
    this.startTime = startTime;
    this.endTime = endTime;
    this.tripState = tripState;
    this.tripId = tripId;
    this.windowUuid = windowUuid;
    this.shipmentUuid = shipmentUuid;
    this.vehicleId = vehicleId;
    this.imei = imei;
    this.isOverlapping = isOverlapping;
    this.isShipmentCompleted = isShipmentCompleted;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return startTime;
    case 1: return endTime;
    case 2: return tripState;
    case 3: return tripId;
    case 4: return windowUuid;
    case 5: return shipmentUuid;
    case 6: return vehicleId;
    case 7: return imei;
    case 8: return isOverlapping;
    case 9: return isShipmentCompleted;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: startTime = (java.lang.Long)value$; break;
    case 1: endTime = (java.lang.Long)value$; break;
    case 2: tripState = (java.lang.String)value$; break;
    case 3: tripId = (java.lang.String)value$; break;
    case 4: windowUuid = (java.lang.String)value$; break;
    case 5: shipmentUuid = (java.lang.String)value$; break;
    case 6: vehicleId = (java.lang.String)value$; break;
    case 7: imei = (java.lang.String)value$; break;
    case 8: isOverlapping = (java.lang.Boolean)value$; break;
    case 9: isShipmentCompleted = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'tripState' field.
   * @return The value of the 'tripState' field.
   */
  public java.lang.String getTripState() {
    return tripState;
  }

  /**
   * Sets the value of the 'tripState' field.
   * @param value the value to set.
   */
  public void setTripState(java.lang.String value) {
    this.tripState = value;
  }

  /**
   * Gets the value of the 'tripId' field.
   * @return The value of the 'tripId' field.
   */
  public java.lang.String getTripId() {
    return tripId;
  }

  /**
   * Sets the value of the 'tripId' field.
   * @param value the value to set.
   */
  public void setTripId(java.lang.String value) {
    this.tripId = value;
  }

  /**
   * Gets the value of the 'windowUuid' field.
   * @return The value of the 'windowUuid' field.
   */
  public java.lang.String getWindowUuid() {
    return windowUuid;
  }

  /**
   * Sets the value of the 'windowUuid' field.
   * @param value the value to set.
   */
  public void setWindowUuid(java.lang.String value) {
    this.windowUuid = value;
  }

  /**
   * Gets the value of the 'shipmentUuid' field.
   * @return The value of the 'shipmentUuid' field.
   */
  public java.lang.String getShipmentUuid() {
    return shipmentUuid;
  }

  /**
   * Sets the value of the 'shipmentUuid' field.
   * @param value the value to set.
   */
  public void setShipmentUuid(java.lang.String value) {
    this.shipmentUuid = value;
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
   * Gets the value of the 'isOverlapping' field.
   * @return The value of the 'isOverlapping' field.
   */
  public java.lang.Boolean getIsOverlapping() {
    return isOverlapping;
  }

  /**
   * Sets the value of the 'isOverlapping' field.
   * @param value the value to set.
   */
  public void setIsOverlapping(java.lang.Boolean value) {
    this.isOverlapping = value;
  }

  /**
   * Gets the value of the 'isShipmentCompleted' field.
   * @return The value of the 'isShipmentCompleted' field.
   */
  public java.lang.Boolean getIsShipmentCompleted() {
    return isShipmentCompleted;
  }

  /**
   * Sets the value of the 'isShipmentCompleted' field.
   * @param value the value to set.
   */
  public void setIsShipmentCompleted(java.lang.Boolean value) {
    this.isShipmentCompleted = value;
  }

  /**
   * Creates a new ShipmentWindow RecordBuilder.
   * @return A new ShipmentWindow RecordBuilder
   */
  public static com.fretron.Model.ShipmentWindow.Builder newBuilder() {
    return new com.fretron.Model.ShipmentWindow.Builder();
  }

  /**
   * Creates a new ShipmentWindow RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ShipmentWindow RecordBuilder
   */
  public static com.fretron.Model.ShipmentWindow.Builder newBuilder(com.fretron.Model.ShipmentWindow.Builder other) {
    return new com.fretron.Model.ShipmentWindow.Builder(other);
  }

  /**
   * Creates a new ShipmentWindow RecordBuilder by copying an existing ShipmentWindow instance.
   * @param other The existing instance to copy.
   * @return A new ShipmentWindow RecordBuilder
   */
  public static com.fretron.Model.ShipmentWindow.Builder newBuilder(com.fretron.Model.ShipmentWindow other) {
    return new com.fretron.Model.ShipmentWindow.Builder(other);
  }

  /**
   * RecordBuilder for ShipmentWindow instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ShipmentWindow>
    implements org.apache.avro.data.RecordBuilder<ShipmentWindow> {

    private java.lang.Long startTime;
    private java.lang.Long endTime;
    private java.lang.String tripState;
    private java.lang.String tripId;
    private java.lang.String windowUuid;
    private java.lang.String shipmentUuid;
    private java.lang.String vehicleId;
    private java.lang.String imei;
    private java.lang.Boolean isOverlapping;
    private java.lang.Boolean isShipmentCompleted;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.ShipmentWindow.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.startTime)) {
        this.startTime = data().deepCopy(fields()[0].schema(), other.startTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.endTime)) {
        this.endTime = data().deepCopy(fields()[1].schema(), other.endTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tripState)) {
        this.tripState = data().deepCopy(fields()[2].schema(), other.tripState);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tripId)) {
        this.tripId = data().deepCopy(fields()[3].schema(), other.tripId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.windowUuid)) {
        this.windowUuid = data().deepCopy(fields()[4].schema(), other.windowUuid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.shipmentUuid)) {
        this.shipmentUuid = data().deepCopy(fields()[5].schema(), other.shipmentUuid);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[6].schema(), other.vehicleId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.imei)) {
        this.imei = data().deepCopy(fields()[7].schema(), other.imei);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.isOverlapping)) {
        this.isOverlapping = data().deepCopy(fields()[8].schema(), other.isOverlapping);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.isShipmentCompleted)) {
        this.isShipmentCompleted = data().deepCopy(fields()[9].schema(), other.isShipmentCompleted);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ShipmentWindow instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.ShipmentWindow other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.startTime)) {
        this.startTime = data().deepCopy(fields()[0].schema(), other.startTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.endTime)) {
        this.endTime = data().deepCopy(fields()[1].schema(), other.endTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tripState)) {
        this.tripState = data().deepCopy(fields()[2].schema(), other.tripState);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tripId)) {
        this.tripId = data().deepCopy(fields()[3].schema(), other.tripId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.windowUuid)) {
        this.windowUuid = data().deepCopy(fields()[4].schema(), other.windowUuid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.shipmentUuid)) {
        this.shipmentUuid = data().deepCopy(fields()[5].schema(), other.shipmentUuid);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[6].schema(), other.vehicleId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.imei)) {
        this.imei = data().deepCopy(fields()[7].schema(), other.imei);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.isOverlapping)) {
        this.isOverlapping = data().deepCopy(fields()[8].schema(), other.isOverlapping);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.isShipmentCompleted)) {
        this.isShipmentCompleted = data().deepCopy(fields()[9].schema(), other.isShipmentCompleted);
        fieldSetFlags()[9] = true;
      }
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
    public com.fretron.Model.ShipmentWindow.Builder setStartTime(java.lang.Long value) {
      validate(fields()[0], value);
      this.startTime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'startTime' field has been set.
      * @return True if the 'startTime' field has been set, false otherwise.
      */
    public boolean hasStartTime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'startTime' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder clearStartTime() {
      startTime = null;
      fieldSetFlags()[0] = false;
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
    public com.fretron.Model.ShipmentWindow.Builder setEndTime(java.lang.Long value) {
      validate(fields()[1], value);
      this.endTime = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'endTime' field has been set.
      * @return True if the 'endTime' field has been set, false otherwise.
      */
    public boolean hasEndTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'endTime' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder clearEndTime() {
      endTime = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'tripState' field.
      * @return The value.
      */
    public java.lang.String getTripState() {
      return tripState;
    }

    /**
      * Sets the value of the 'tripState' field.
      * @param value The value of 'tripState'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder setTripState(java.lang.String value) {
      validate(fields()[2], value);
      this.tripState = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'tripState' field has been set.
      * @return True if the 'tripState' field has been set, false otherwise.
      */
    public boolean hasTripState() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'tripState' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder clearTripState() {
      tripState = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'tripId' field.
      * @return The value.
      */
    public java.lang.String getTripId() {
      return tripId;
    }

    /**
      * Sets the value of the 'tripId' field.
      * @param value The value of 'tripId'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder setTripId(java.lang.String value) {
      validate(fields()[3], value);
      this.tripId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'tripId' field has been set.
      * @return True if the 'tripId' field has been set, false otherwise.
      */
    public boolean hasTripId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'tripId' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder clearTripId() {
      tripId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'windowUuid' field.
      * @return The value.
      */
    public java.lang.String getWindowUuid() {
      return windowUuid;
    }

    /**
      * Sets the value of the 'windowUuid' field.
      * @param value The value of 'windowUuid'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder setWindowUuid(java.lang.String value) {
      validate(fields()[4], value);
      this.windowUuid = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'windowUuid' field has been set.
      * @return True if the 'windowUuid' field has been set, false otherwise.
      */
    public boolean hasWindowUuid() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'windowUuid' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder clearWindowUuid() {
      windowUuid = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'shipmentUuid' field.
      * @return The value.
      */
    public java.lang.String getShipmentUuid() {
      return shipmentUuid;
    }

    /**
      * Sets the value of the 'shipmentUuid' field.
      * @param value The value of 'shipmentUuid'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder setShipmentUuid(java.lang.String value) {
      validate(fields()[5], value);
      this.shipmentUuid = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'shipmentUuid' field has been set.
      * @return True if the 'shipmentUuid' field has been set, false otherwise.
      */
    public boolean hasShipmentUuid() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'shipmentUuid' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder clearShipmentUuid() {
      shipmentUuid = null;
      fieldSetFlags()[5] = false;
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
    public com.fretron.Model.ShipmentWindow.Builder setVehicleId(java.lang.String value) {
      validate(fields()[6], value);
      this.vehicleId = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleId' field has been set.
      * @return True if the 'vehicleId' field has been set, false otherwise.
      */
    public boolean hasVehicleId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'vehicleId' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder clearVehicleId() {
      vehicleId = null;
      fieldSetFlags()[6] = false;
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
    public com.fretron.Model.ShipmentWindow.Builder setImei(java.lang.String value) {
      validate(fields()[7], value);
      this.imei = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'imei' field has been set.
      * @return True if the 'imei' field has been set, false otherwise.
      */
    public boolean hasImei() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'imei' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder clearImei() {
      imei = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'isOverlapping' field.
      * @return The value.
      */
    public java.lang.Boolean getIsOverlapping() {
      return isOverlapping;
    }

    /**
      * Sets the value of the 'isOverlapping' field.
      * @param value The value of 'isOverlapping'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder setIsOverlapping(java.lang.Boolean value) {
      validate(fields()[8], value);
      this.isOverlapping = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'isOverlapping' field has been set.
      * @return True if the 'isOverlapping' field has been set, false otherwise.
      */
    public boolean hasIsOverlapping() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'isOverlapping' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder clearIsOverlapping() {
      isOverlapping = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'isShipmentCompleted' field.
      * @return The value.
      */
    public java.lang.Boolean getIsShipmentCompleted() {
      return isShipmentCompleted;
    }

    /**
      * Sets the value of the 'isShipmentCompleted' field.
      * @param value The value of 'isShipmentCompleted'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder setIsShipmentCompleted(java.lang.Boolean value) {
      validate(fields()[9], value);
      this.isShipmentCompleted = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'isShipmentCompleted' field has been set.
      * @return True if the 'isShipmentCompleted' field has been set, false otherwise.
      */
    public boolean hasIsShipmentCompleted() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'isShipmentCompleted' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentWindow.Builder clearIsShipmentCompleted() {
      isShipmentCompleted = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public ShipmentWindow build() {
      try {
        ShipmentWindow record = new ShipmentWindow();
        record.startTime = fieldSetFlags()[0] ? this.startTime : (java.lang.Long) defaultValue(fields()[0]);
        record.endTime = fieldSetFlags()[1] ? this.endTime : (java.lang.Long) defaultValue(fields()[1]);
        record.tripState = fieldSetFlags()[2] ? this.tripState : (java.lang.String) defaultValue(fields()[2]);
        record.tripId = fieldSetFlags()[3] ? this.tripId : (java.lang.String) defaultValue(fields()[3]);
        record.windowUuid = fieldSetFlags()[4] ? this.windowUuid : (java.lang.String) defaultValue(fields()[4]);
        record.shipmentUuid = fieldSetFlags()[5] ? this.shipmentUuid : (java.lang.String) defaultValue(fields()[5]);
        record.vehicleId = fieldSetFlags()[6] ? this.vehicleId : (java.lang.String) defaultValue(fields()[6]);
        record.imei = fieldSetFlags()[7] ? this.imei : (java.lang.String) defaultValue(fields()[7]);
        record.isOverlapping = fieldSetFlags()[8] ? this.isOverlapping : (java.lang.Boolean) defaultValue(fields()[8]);
        record.isShipmentCompleted = fieldSetFlags()[9] ? this.isShipmentCompleted : (java.lang.Boolean) defaultValue(fields()[9]);
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
