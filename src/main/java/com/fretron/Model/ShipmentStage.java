/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ShipmentStage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3675634226111937727L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShipmentStage\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"arrivalTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"departureTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"tripPoint\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TripPoint\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"purpose\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sequenceId\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"place\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Place\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"center\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"suggestedRadius\",\"type\":\"double\",\"default\":null},{\"name\":\"viewport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ViewPort\",\"fields\":[{\"name\":\"northeast\",\"type\":[\"null\",\"Location\"],\"default\":null},{\"name\":\"southwest\",\"type\":[\"null\",\"Location\"],\"default\":null}]}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"boundary\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"eta\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"remainingDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"plannedArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"assosiatedShipmentsId\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"creationTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"outOfTrackSince\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isOutOfTrack\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isAutoCompleted\",\"type\":\"boolean\",\"default\":false},{\"name\":\"coveredDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"purposedDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"forShipmentStages\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}],\"default\":null},{\"name\":\"place\",\"type\":[\"null\",\"Place\"],\"default\":null},{\"name\":\"resourcePickup\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"resourceDropOff\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"consignmentPickUps\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"consignmentDelivered\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.Long arrivalTime;
  @Deprecated public java.lang.Long departureTime;
  @Deprecated public com.fretron.Model.TripPoint tripPoint;
  @Deprecated public com.fretron.Model.Place place;
  @Deprecated public java.util.List<java.lang.String> resourcePickup;
  @Deprecated public java.util.List<java.lang.String> resourceDropOff;
  @Deprecated public java.util.List<java.lang.String> consignmentPickUps;
  @Deprecated public java.util.List<java.lang.String> consignmentDelivered;
  @Deprecated public java.lang.String status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ShipmentStage() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param arrivalTime The new value for arrivalTime
   * @param departureTime The new value for departureTime
   * @param tripPoint The new value for tripPoint
   * @param place The new value for place
   * @param resourcePickup The new value for resourcePickup
   * @param resourceDropOff The new value for resourceDropOff
   * @param consignmentPickUps The new value for consignmentPickUps
   * @param consignmentDelivered The new value for consignmentDelivered
   * @param status The new value for status
   */
  public ShipmentStage(java.lang.String uuid, java.lang.Long arrivalTime, java.lang.Long departureTime, com.fretron.Model.TripPoint tripPoint, com.fretron.Model.Place place, java.util.List<java.lang.String> resourcePickup, java.util.List<java.lang.String> resourceDropOff, java.util.List<java.lang.String> consignmentPickUps, java.util.List<java.lang.String> consignmentDelivered, java.lang.String status) {
    this.uuid = uuid;
    this.arrivalTime = arrivalTime;
    this.departureTime = departureTime;
    this.tripPoint = tripPoint;
    this.place = place;
    this.resourcePickup = resourcePickup;
    this.resourceDropOff = resourceDropOff;
    this.consignmentPickUps = consignmentPickUps;
    this.consignmentDelivered = consignmentDelivered;
    this.status = status;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return arrivalTime;
    case 2: return departureTime;
    case 3: return tripPoint;
    case 4: return place;
    case 5: return resourcePickup;
    case 6: return resourceDropOff;
    case 7: return consignmentPickUps;
    case 8: return consignmentDelivered;
    case 9: return status;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: arrivalTime = (java.lang.Long)value$; break;
    case 2: departureTime = (java.lang.Long)value$; break;
    case 3: tripPoint = (com.fretron.Model.TripPoint)value$; break;
    case 4: place = (com.fretron.Model.Place)value$; break;
    case 5: resourcePickup = (java.util.List<java.lang.String>)value$; break;
    case 6: resourceDropOff = (java.util.List<java.lang.String>)value$; break;
    case 7: consignmentPickUps = (java.util.List<java.lang.String>)value$; break;
    case 8: consignmentDelivered = (java.util.List<java.lang.String>)value$; break;
    case 9: status = (java.lang.String)value$; break;
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
   * Gets the value of the 'arrivalTime' field.
   * @return The value of the 'arrivalTime' field.
   */
  public java.lang.Long getArrivalTime() {
    return arrivalTime;
  }

  /**
   * Sets the value of the 'arrivalTime' field.
   * @param value the value to set.
   */
  public void setArrivalTime(java.lang.Long value) {
    this.arrivalTime = value;
  }

  /**
   * Gets the value of the 'departureTime' field.
   * @return The value of the 'departureTime' field.
   */
  public java.lang.Long getDepartureTime() {
    return departureTime;
  }

  /**
   * Sets the value of the 'departureTime' field.
   * @param value the value to set.
   */
  public void setDepartureTime(java.lang.Long value) {
    this.departureTime = value;
  }

  /**
   * Gets the value of the 'tripPoint' field.
   * @return The value of the 'tripPoint' field.
   */
  public com.fretron.Model.TripPoint getTripPoint() {
    return tripPoint;
  }

  /**
   * Sets the value of the 'tripPoint' field.
   * @param value the value to set.
   */
  public void setTripPoint(com.fretron.Model.TripPoint value) {
    this.tripPoint = value;
  }

  /**
   * Gets the value of the 'place' field.
   * @return The value of the 'place' field.
   */
  public com.fretron.Model.Place getPlace() {
    return place;
  }

  /**
   * Sets the value of the 'place' field.
   * @param value the value to set.
   */
  public void setPlace(com.fretron.Model.Place value) {
    this.place = value;
  }

  /**
   * Gets the value of the 'resourcePickup' field.
   * @return The value of the 'resourcePickup' field.
   */
  public java.util.List<java.lang.String> getResourcePickup() {
    return resourcePickup;
  }

  /**
   * Sets the value of the 'resourcePickup' field.
   * @param value the value to set.
   */
  public void setResourcePickup(java.util.List<java.lang.String> value) {
    this.resourcePickup = value;
  }

  /**
   * Gets the value of the 'resourceDropOff' field.
   * @return The value of the 'resourceDropOff' field.
   */
  public java.util.List<java.lang.String> getResourceDropOff() {
    return resourceDropOff;
  }

  /**
   * Sets the value of the 'resourceDropOff' field.
   * @param value the value to set.
   */
  public void setResourceDropOff(java.util.List<java.lang.String> value) {
    this.resourceDropOff = value;
  }

  /**
   * Gets the value of the 'consignmentPickUps' field.
   * @return The value of the 'consignmentPickUps' field.
   */
  public java.util.List<java.lang.String> getConsignmentPickUps() {
    return consignmentPickUps;
  }

  /**
   * Sets the value of the 'consignmentPickUps' field.
   * @param value the value to set.
   */
  public void setConsignmentPickUps(java.util.List<java.lang.String> value) {
    this.consignmentPickUps = value;
  }

  /**
   * Gets the value of the 'consignmentDelivered' field.
   * @return The value of the 'consignmentDelivered' field.
   */
  public java.util.List<java.lang.String> getConsignmentDelivered() {
    return consignmentDelivered;
  }

  /**
   * Sets the value of the 'consignmentDelivered' field.
   * @param value the value to set.
   */
  public void setConsignmentDelivered(java.util.List<java.lang.String> value) {
    this.consignmentDelivered = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.String value) {
    this.status = value;
  }

  /**
   * Creates a new ShipmentStage RecordBuilder.
   * @return A new ShipmentStage RecordBuilder
   */
  public static com.fretron.Model.ShipmentStage.Builder newBuilder() {
    return new com.fretron.Model.ShipmentStage.Builder();
  }

  /**
   * Creates a new ShipmentStage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ShipmentStage RecordBuilder
   */
  public static com.fretron.Model.ShipmentStage.Builder newBuilder(com.fretron.Model.ShipmentStage.Builder other) {
    return new com.fretron.Model.ShipmentStage.Builder(other);
  }

  /**
   * Creates a new ShipmentStage RecordBuilder by copying an existing ShipmentStage instance.
   * @param other The existing instance to copy.
   * @return A new ShipmentStage RecordBuilder
   */
  public static com.fretron.Model.ShipmentStage.Builder newBuilder(com.fretron.Model.ShipmentStage other) {
    return new com.fretron.Model.ShipmentStage.Builder(other);
  }

  /**
   * RecordBuilder for ShipmentStage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ShipmentStage>
    implements org.apache.avro.data.RecordBuilder<ShipmentStage> {

    private java.lang.String uuid;
    private java.lang.Long arrivalTime;
    private java.lang.Long departureTime;
    private com.fretron.Model.TripPoint tripPoint;
    private com.fretron.Model.TripPoint.Builder tripPointBuilder;
    private com.fretron.Model.Place place;
    private com.fretron.Model.Place.Builder placeBuilder;
    private java.util.List<java.lang.String> resourcePickup;
    private java.util.List<java.lang.String> resourceDropOff;
    private java.util.List<java.lang.String> consignmentPickUps;
    private java.util.List<java.lang.String> consignmentDelivered;
    private java.lang.String status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.ShipmentStage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.arrivalTime)) {
        this.arrivalTime = data().deepCopy(fields()[1].schema(), other.arrivalTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.departureTime)) {
        this.departureTime = data().deepCopy(fields()[2].schema(), other.departureTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tripPoint)) {
        this.tripPoint = data().deepCopy(fields()[3].schema(), other.tripPoint);
        fieldSetFlags()[3] = true;
      }
      if (other.hasTripPointBuilder()) {
        this.tripPointBuilder = com.fretron.Model.TripPoint.newBuilder(other.getTripPointBuilder());
      }
      if (isValidValue(fields()[4], other.place)) {
        this.place = data().deepCopy(fields()[4].schema(), other.place);
        fieldSetFlags()[4] = true;
      }
      if (other.hasPlaceBuilder()) {
        this.placeBuilder = com.fretron.Model.Place.newBuilder(other.getPlaceBuilder());
      }
      if (isValidValue(fields()[5], other.resourcePickup)) {
        this.resourcePickup = data().deepCopy(fields()[5].schema(), other.resourcePickup);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.resourceDropOff)) {
        this.resourceDropOff = data().deepCopy(fields()[6].schema(), other.resourceDropOff);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.consignmentPickUps)) {
        this.consignmentPickUps = data().deepCopy(fields()[7].schema(), other.consignmentPickUps);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.consignmentDelivered)) {
        this.consignmentDelivered = data().deepCopy(fields()[8].schema(), other.consignmentDelivered);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.status)) {
        this.status = data().deepCopy(fields()[9].schema(), other.status);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ShipmentStage instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.ShipmentStage other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.arrivalTime)) {
        this.arrivalTime = data().deepCopy(fields()[1].schema(), other.arrivalTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.departureTime)) {
        this.departureTime = data().deepCopy(fields()[2].schema(), other.departureTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tripPoint)) {
        this.tripPoint = data().deepCopy(fields()[3].schema(), other.tripPoint);
        fieldSetFlags()[3] = true;
      }
      this.tripPointBuilder = null;
      if (isValidValue(fields()[4], other.place)) {
        this.place = data().deepCopy(fields()[4].schema(), other.place);
        fieldSetFlags()[4] = true;
      }
      this.placeBuilder = null;
      if (isValidValue(fields()[5], other.resourcePickup)) {
        this.resourcePickup = data().deepCopy(fields()[5].schema(), other.resourcePickup);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.resourceDropOff)) {
        this.resourceDropOff = data().deepCopy(fields()[6].schema(), other.resourceDropOff);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.consignmentPickUps)) {
        this.consignmentPickUps = data().deepCopy(fields()[7].schema(), other.consignmentPickUps);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.consignmentDelivered)) {
        this.consignmentDelivered = data().deepCopy(fields()[8].schema(), other.consignmentDelivered);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.status)) {
        this.status = data().deepCopy(fields()[9].schema(), other.status);
        fieldSetFlags()[9] = true;
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
    public com.fretron.Model.ShipmentStage.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.ShipmentStage.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'arrivalTime' field.
      * @return The value.
      */
    public java.lang.Long getArrivalTime() {
      return arrivalTime;
    }

    /**
      * Sets the value of the 'arrivalTime' field.
      * @param value The value of 'arrivalTime'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder setArrivalTime(java.lang.Long value) {
      validate(fields()[1], value);
      this.arrivalTime = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'arrivalTime' field has been set.
      * @return True if the 'arrivalTime' field has been set, false otherwise.
      */
    public boolean hasArrivalTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'arrivalTime' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder clearArrivalTime() {
      arrivalTime = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'departureTime' field.
      * @return The value.
      */
    public java.lang.Long getDepartureTime() {
      return departureTime;
    }

    /**
      * Sets the value of the 'departureTime' field.
      * @param value The value of 'departureTime'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder setDepartureTime(java.lang.Long value) {
      validate(fields()[2], value);
      this.departureTime = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'departureTime' field has been set.
      * @return True if the 'departureTime' field has been set, false otherwise.
      */
    public boolean hasDepartureTime() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'departureTime' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder clearDepartureTime() {
      departureTime = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'tripPoint' field.
      * @return The value.
      */
    public com.fretron.Model.TripPoint getTripPoint() {
      return tripPoint;
    }

    /**
      * Sets the value of the 'tripPoint' field.
      * @param value The value of 'tripPoint'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder setTripPoint(com.fretron.Model.TripPoint value) {
      validate(fields()[3], value);
      this.tripPointBuilder = null;
      this.tripPoint = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'tripPoint' field has been set.
      * @return True if the 'tripPoint' field has been set, false otherwise.
      */
    public boolean hasTripPoint() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'tripPoint' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.TripPoint.Builder getTripPointBuilder() {
      if (tripPointBuilder == null) {
        if (hasTripPoint()) {
          setTripPointBuilder(com.fretron.Model.TripPoint.newBuilder(tripPoint));
        } else {
          setTripPointBuilder(com.fretron.Model.TripPoint.newBuilder());
        }
      }
      return tripPointBuilder;
    }

    /**
     * Sets the Builder instance for the 'tripPoint' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.ShipmentStage.Builder setTripPointBuilder(com.fretron.Model.TripPoint.Builder value) {
      clearTripPoint();
      tripPointBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'tripPoint' field has an active Builder instance
     * @return True if the 'tripPoint' field has an active Builder instance
     */
    public boolean hasTripPointBuilder() {
      return tripPointBuilder != null;
    }

    /**
      * Clears the value of the 'tripPoint' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder clearTripPoint() {
      tripPoint = null;
      tripPointBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'place' field.
      * @return The value.
      */
    public com.fretron.Model.Place getPlace() {
      return place;
    }

    /**
      * Sets the value of the 'place' field.
      * @param value The value of 'place'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder setPlace(com.fretron.Model.Place value) {
      validate(fields()[4], value);
      this.placeBuilder = null;
      this.place = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'place' field has been set.
      * @return True if the 'place' field has been set, false otherwise.
      */
    public boolean hasPlace() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'place' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Place.Builder getPlaceBuilder() {
      if (placeBuilder == null) {
        if (hasPlace()) {
          setPlaceBuilder(com.fretron.Model.Place.newBuilder(place));
        } else {
          setPlaceBuilder(com.fretron.Model.Place.newBuilder());
        }
      }
      return placeBuilder;
    }

    /**
     * Sets the Builder instance for the 'place' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.ShipmentStage.Builder setPlaceBuilder(com.fretron.Model.Place.Builder value) {
      clearPlace();
      placeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'place' field has an active Builder instance
     * @return True if the 'place' field has an active Builder instance
     */
    public boolean hasPlaceBuilder() {
      return placeBuilder != null;
    }

    /**
      * Clears the value of the 'place' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder clearPlace() {
      place = null;
      placeBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'resourcePickup' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getResourcePickup() {
      return resourcePickup;
    }

    /**
      * Sets the value of the 'resourcePickup' field.
      * @param value The value of 'resourcePickup'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder setResourcePickup(java.util.List<java.lang.String> value) {
      validate(fields()[5], value);
      this.resourcePickup = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'resourcePickup' field has been set.
      * @return True if the 'resourcePickup' field has been set, false otherwise.
      */
    public boolean hasResourcePickup() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'resourcePickup' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder clearResourcePickup() {
      resourcePickup = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'resourceDropOff' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getResourceDropOff() {
      return resourceDropOff;
    }

    /**
      * Sets the value of the 'resourceDropOff' field.
      * @param value The value of 'resourceDropOff'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder setResourceDropOff(java.util.List<java.lang.String> value) {
      validate(fields()[6], value);
      this.resourceDropOff = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'resourceDropOff' field has been set.
      * @return True if the 'resourceDropOff' field has been set, false otherwise.
      */
    public boolean hasResourceDropOff() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'resourceDropOff' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder clearResourceDropOff() {
      resourceDropOff = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'consignmentPickUps' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getConsignmentPickUps() {
      return consignmentPickUps;
    }

    /**
      * Sets the value of the 'consignmentPickUps' field.
      * @param value The value of 'consignmentPickUps'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder setConsignmentPickUps(java.util.List<java.lang.String> value) {
      validate(fields()[7], value);
      this.consignmentPickUps = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'consignmentPickUps' field has been set.
      * @return True if the 'consignmentPickUps' field has been set, false otherwise.
      */
    public boolean hasConsignmentPickUps() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'consignmentPickUps' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder clearConsignmentPickUps() {
      consignmentPickUps = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'consignmentDelivered' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getConsignmentDelivered() {
      return consignmentDelivered;
    }

    /**
      * Sets the value of the 'consignmentDelivered' field.
      * @param value The value of 'consignmentDelivered'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder setConsignmentDelivered(java.util.List<java.lang.String> value) {
      validate(fields()[8], value);
      this.consignmentDelivered = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'consignmentDelivered' field has been set.
      * @return True if the 'consignmentDelivered' field has been set, false otherwise.
      */
    public boolean hasConsignmentDelivered() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'consignmentDelivered' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder clearConsignmentDelivered() {
      consignmentDelivered = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.String getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder setStatus(java.lang.String value) {
      validate(fields()[9], value);
      this.status = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentStage.Builder clearStatus() {
      status = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public ShipmentStage build() {
      try {
        ShipmentStage record = new ShipmentStage();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.arrivalTime = fieldSetFlags()[1] ? this.arrivalTime : (java.lang.Long) defaultValue(fields()[1]);
        record.departureTime = fieldSetFlags()[2] ? this.departureTime : (java.lang.Long) defaultValue(fields()[2]);
        if (tripPointBuilder != null) {
          record.tripPoint = this.tripPointBuilder.build();
        } else {
          record.tripPoint = fieldSetFlags()[3] ? this.tripPoint : (com.fretron.Model.TripPoint) defaultValue(fields()[3]);
        }
        if (placeBuilder != null) {
          record.place = this.placeBuilder.build();
        } else {
          record.place = fieldSetFlags()[4] ? this.place : (com.fretron.Model.Place) defaultValue(fields()[4]);
        }
        record.resourcePickup = fieldSetFlags()[5] ? this.resourcePickup : (java.util.List<java.lang.String>) defaultValue(fields()[5]);
        record.resourceDropOff = fieldSetFlags()[6] ? this.resourceDropOff : (java.util.List<java.lang.String>) defaultValue(fields()[6]);
        record.consignmentPickUps = fieldSetFlags()[7] ? this.consignmentPickUps : (java.util.List<java.lang.String>) defaultValue(fields()[7]);
        record.consignmentDelivered = fieldSetFlags()[8] ? this.consignmentDelivered : (java.util.List<java.lang.String>) defaultValue(fields()[8]);
        record.status = fieldSetFlags()[9] ? this.status : (java.lang.String) defaultValue(fields()[9]);
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
