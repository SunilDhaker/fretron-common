/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TripPoint extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8078507410747533471L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TripPoint\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"purpose\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sequenceId\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"place\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Place\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"center\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"suggestedRadius\",\"type\":\"double\",\"default\":null},{\"name\":\"viewport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ViewPort\",\"fields\":[{\"name\":\"northeast\",\"type\":[\"null\",\"Location\"],\"default\":null},{\"name\":\"southwest\",\"type\":[\"null\",\"Location\"],\"default\":null}]}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"boundary\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"eta\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"remainingDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"plannedArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"assosiatedShipmentsId\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String vehicleId;
  @Deprecated public java.lang.String purpose;
  @Deprecated public java.lang.Double sequenceId;
  @Deprecated public com.fretron.Model.Place place;
  @Deprecated public java.lang.String status;
  @Deprecated public java.lang.Long eta;
  @Deprecated public java.lang.Double remainingDistance;
  @Deprecated public java.lang.Long plannedArrival;
  @Deprecated public java.lang.Long plannedDeparture;
  @Deprecated public java.lang.Long actualArrival;
  @Deprecated public java.lang.Long actualDeparture;
  @Deprecated public java.util.List<java.lang.String> assosiatedShipmentsId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TripPoint() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param vehicleId The new value for vehicleId
   * @param purpose The new value for purpose
   * @param sequenceId The new value for sequenceId
   * @param place The new value for place
   * @param status The new value for status
   * @param eta The new value for eta
   * @param remainingDistance The new value for remainingDistance
   * @param plannedArrival The new value for plannedArrival
   * @param plannedDeparture The new value for plannedDeparture
   * @param actualArrival The new value for actualArrival
   * @param actualDeparture The new value for actualDeparture
   * @param assosiatedShipmentsId The new value for assosiatedShipmentsId
   */
  public TripPoint(java.lang.String uuid, java.lang.String vehicleId, java.lang.String purpose, java.lang.Double sequenceId, com.fretron.Model.Place place, java.lang.String status, java.lang.Long eta, java.lang.Double remainingDistance, java.lang.Long plannedArrival, java.lang.Long plannedDeparture, java.lang.Long actualArrival, java.lang.Long actualDeparture, java.util.List<java.lang.String> assosiatedShipmentsId) {
    this.uuid = uuid;
    this.vehicleId = vehicleId;
    this.purpose = purpose;
    this.sequenceId = sequenceId;
    this.place = place;
    this.status = status;
    this.eta = eta;
    this.remainingDistance = remainingDistance;
    this.plannedArrival = plannedArrival;
    this.plannedDeparture = plannedDeparture;
    this.actualArrival = actualArrival;
    this.actualDeparture = actualDeparture;
    this.assosiatedShipmentsId = assosiatedShipmentsId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return vehicleId;
    case 2: return purpose;
    case 3: return sequenceId;
    case 4: return place;
    case 5: return status;
    case 6: return eta;
    case 7: return remainingDistance;
    case 8: return plannedArrival;
    case 9: return plannedDeparture;
    case 10: return actualArrival;
    case 11: return actualDeparture;
    case 12: return assosiatedShipmentsId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: vehicleId = (java.lang.String)value$; break;
    case 2: purpose = (java.lang.String)value$; break;
    case 3: sequenceId = (java.lang.Double)value$; break;
    case 4: place = (com.fretron.Model.Place)value$; break;
    case 5: status = (java.lang.String)value$; break;
    case 6: eta = (java.lang.Long)value$; break;
    case 7: remainingDistance = (java.lang.Double)value$; break;
    case 8: plannedArrival = (java.lang.Long)value$; break;
    case 9: plannedDeparture = (java.lang.Long)value$; break;
    case 10: actualArrival = (java.lang.Long)value$; break;
    case 11: actualDeparture = (java.lang.Long)value$; break;
    case 12: assosiatedShipmentsId = (java.util.List<java.lang.String>)value$; break;
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
   * Gets the value of the 'purpose' field.
   * @return The value of the 'purpose' field.
   */
  public java.lang.String getPurpose() {
    return purpose;
  }

  /**
   * Sets the value of the 'purpose' field.
   * @param value the value to set.
   */
  public void setPurpose(java.lang.String value) {
    this.purpose = value;
  }

  /**
   * Gets the value of the 'sequenceId' field.
   * @return The value of the 'sequenceId' field.
   */
  public java.lang.Double getSequenceId() {
    return sequenceId;
  }

  /**
   * Sets the value of the 'sequenceId' field.
   * @param value the value to set.
   */
  public void setSequenceId(java.lang.Double value) {
    this.sequenceId = value;
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
   * Gets the value of the 'eta' field.
   * @return The value of the 'eta' field.
   */
  public java.lang.Long getEta() {
    return eta;
  }

  /**
   * Sets the value of the 'eta' field.
   * @param value the value to set.
   */
  public void setEta(java.lang.Long value) {
    this.eta = value;
  }

  /**
   * Gets the value of the 'remainingDistance' field.
   * @return The value of the 'remainingDistance' field.
   */
  public java.lang.Double getRemainingDistance() {
    return remainingDistance;
  }

  /**
   * Sets the value of the 'remainingDistance' field.
   * @param value the value to set.
   */
  public void setRemainingDistance(java.lang.Double value) {
    this.remainingDistance = value;
  }

  /**
   * Gets the value of the 'plannedArrival' field.
   * @return The value of the 'plannedArrival' field.
   */
  public java.lang.Long getPlannedArrival() {
    return plannedArrival;
  }

  /**
   * Sets the value of the 'plannedArrival' field.
   * @param value the value to set.
   */
  public void setPlannedArrival(java.lang.Long value) {
    this.plannedArrival = value;
  }

  /**
   * Gets the value of the 'plannedDeparture' field.
   * @return The value of the 'plannedDeparture' field.
   */
  public java.lang.Long getPlannedDeparture() {
    return plannedDeparture;
  }

  /**
   * Sets the value of the 'plannedDeparture' field.
   * @param value the value to set.
   */
  public void setPlannedDeparture(java.lang.Long value) {
    this.plannedDeparture = value;
  }

  /**
   * Gets the value of the 'actualArrival' field.
   * @return The value of the 'actualArrival' field.
   */
  public java.lang.Long getActualArrival() {
    return actualArrival;
  }

  /**
   * Sets the value of the 'actualArrival' field.
   * @param value the value to set.
   */
  public void setActualArrival(java.lang.Long value) {
    this.actualArrival = value;
  }

  /**
   * Gets the value of the 'actualDeparture' field.
   * @return The value of the 'actualDeparture' field.
   */
  public java.lang.Long getActualDeparture() {
    return actualDeparture;
  }

  /**
   * Sets the value of the 'actualDeparture' field.
   * @param value the value to set.
   */
  public void setActualDeparture(java.lang.Long value) {
    this.actualDeparture = value;
  }

  /**
   * Gets the value of the 'assosiatedShipmentsId' field.
   * @return The value of the 'assosiatedShipmentsId' field.
   */
  public java.util.List<java.lang.String> getAssosiatedShipmentsId() {
    return assosiatedShipmentsId;
  }

  /**
   * Sets the value of the 'assosiatedShipmentsId' field.
   * @param value the value to set.
   */
  public void setAssosiatedShipmentsId(java.util.List<java.lang.String> value) {
    this.assosiatedShipmentsId = value;
  }

  /**
   * Creates a new TripPoint RecordBuilder.
   * @return A new TripPoint RecordBuilder
   */
  public static com.fretron.Model.TripPoint.Builder newBuilder() {
    return new com.fretron.Model.TripPoint.Builder();
  }

  /**
   * Creates a new TripPoint RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TripPoint RecordBuilder
   */
  public static com.fretron.Model.TripPoint.Builder newBuilder(com.fretron.Model.TripPoint.Builder other) {
    return new com.fretron.Model.TripPoint.Builder(other);
  }

  /**
   * Creates a new TripPoint RecordBuilder by copying an existing TripPoint instance.
   * @param other The existing instance to copy.
   * @return A new TripPoint RecordBuilder
   */
  public static com.fretron.Model.TripPoint.Builder newBuilder(com.fretron.Model.TripPoint other) {
    return new com.fretron.Model.TripPoint.Builder(other);
  }

  /**
   * RecordBuilder for TripPoint instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TripPoint>
    implements org.apache.avro.data.RecordBuilder<TripPoint> {

    private java.lang.String uuid;
    private java.lang.String vehicleId;
    private java.lang.String purpose;
    private java.lang.Double sequenceId;
    private com.fretron.Model.Place place;
    private com.fretron.Model.Place.Builder placeBuilder;
    private java.lang.String status;
    private java.lang.Long eta;
    private java.lang.Double remainingDistance;
    private java.lang.Long plannedArrival;
    private java.lang.Long plannedDeparture;
    private java.lang.Long actualArrival;
    private java.lang.Long actualDeparture;
    private java.util.List<java.lang.String> assosiatedShipmentsId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.TripPoint.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[1].schema(), other.vehicleId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.purpose)) {
        this.purpose = data().deepCopy(fields()[2].schema(), other.purpose);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sequenceId)) {
        this.sequenceId = data().deepCopy(fields()[3].schema(), other.sequenceId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.place)) {
        this.place = data().deepCopy(fields()[4].schema(), other.place);
        fieldSetFlags()[4] = true;
      }
      if (other.hasPlaceBuilder()) {
        this.placeBuilder = com.fretron.Model.Place.newBuilder(other.getPlaceBuilder());
      }
      if (isValidValue(fields()[5], other.status)) {
        this.status = data().deepCopy(fields()[5].schema(), other.status);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.eta)) {
        this.eta = data().deepCopy(fields()[6].schema(), other.eta);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.remainingDistance)) {
        this.remainingDistance = data().deepCopy(fields()[7].schema(), other.remainingDistance);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.plannedArrival)) {
        this.plannedArrival = data().deepCopy(fields()[8].schema(), other.plannedArrival);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.plannedDeparture)) {
        this.plannedDeparture = data().deepCopy(fields()[9].schema(), other.plannedDeparture);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.actualArrival)) {
        this.actualArrival = data().deepCopy(fields()[10].schema(), other.actualArrival);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.actualDeparture)) {
        this.actualDeparture = data().deepCopy(fields()[11].schema(), other.actualDeparture);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.assosiatedShipmentsId)) {
        this.assosiatedShipmentsId = data().deepCopy(fields()[12].schema(), other.assosiatedShipmentsId);
        fieldSetFlags()[12] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing TripPoint instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.TripPoint other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[1].schema(), other.vehicleId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.purpose)) {
        this.purpose = data().deepCopy(fields()[2].schema(), other.purpose);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sequenceId)) {
        this.sequenceId = data().deepCopy(fields()[3].schema(), other.sequenceId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.place)) {
        this.place = data().deepCopy(fields()[4].schema(), other.place);
        fieldSetFlags()[4] = true;
      }
      this.placeBuilder = null;
      if (isValidValue(fields()[5], other.status)) {
        this.status = data().deepCopy(fields()[5].schema(), other.status);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.eta)) {
        this.eta = data().deepCopy(fields()[6].schema(), other.eta);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.remainingDistance)) {
        this.remainingDistance = data().deepCopy(fields()[7].schema(), other.remainingDistance);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.plannedArrival)) {
        this.plannedArrival = data().deepCopy(fields()[8].schema(), other.plannedArrival);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.plannedDeparture)) {
        this.plannedDeparture = data().deepCopy(fields()[9].schema(), other.plannedDeparture);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.actualArrival)) {
        this.actualArrival = data().deepCopy(fields()[10].schema(), other.actualArrival);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.actualDeparture)) {
        this.actualDeparture = data().deepCopy(fields()[11].schema(), other.actualDeparture);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.assosiatedShipmentsId)) {
        this.assosiatedShipmentsId = data().deepCopy(fields()[12].schema(), other.assosiatedShipmentsId);
        fieldSetFlags()[12] = true;
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
    public com.fretron.Model.TripPoint.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.TripPoint.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
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
    public com.fretron.Model.TripPoint.Builder setVehicleId(java.lang.String value) {
      validate(fields()[1], value);
      this.vehicleId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleId' field has been set.
      * @return True if the 'vehicleId' field has been set, false otherwise.
      */
    public boolean hasVehicleId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'vehicleId' field.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder clearVehicleId() {
      vehicleId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'purpose' field.
      * @return The value.
      */
    public java.lang.String getPurpose() {
      return purpose;
    }

    /**
      * Sets the value of the 'purpose' field.
      * @param value The value of 'purpose'.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder setPurpose(java.lang.String value) {
      validate(fields()[2], value);
      this.purpose = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'purpose' field has been set.
      * @return True if the 'purpose' field has been set, false otherwise.
      */
    public boolean hasPurpose() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'purpose' field.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder clearPurpose() {
      purpose = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'sequenceId' field.
      * @return The value.
      */
    public java.lang.Double getSequenceId() {
      return sequenceId;
    }

    /**
      * Sets the value of the 'sequenceId' field.
      * @param value The value of 'sequenceId'.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder setSequenceId(java.lang.Double value) {
      validate(fields()[3], value);
      this.sequenceId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'sequenceId' field has been set.
      * @return True if the 'sequenceId' field has been set, false otherwise.
      */
    public boolean hasSequenceId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'sequenceId' field.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder clearSequenceId() {
      sequenceId = null;
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
    public com.fretron.Model.TripPoint.Builder setPlace(com.fretron.Model.Place value) {
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
    public com.fretron.Model.TripPoint.Builder setPlaceBuilder(com.fretron.Model.Place.Builder value) {
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
    public com.fretron.Model.TripPoint.Builder clearPlace() {
      place = null;
      placeBuilder = null;
      fieldSetFlags()[4] = false;
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
    public com.fretron.Model.TripPoint.Builder setStatus(java.lang.String value) {
      validate(fields()[5], value);
      this.status = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder clearStatus() {
      status = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'eta' field.
      * @return The value.
      */
    public java.lang.Long getEta() {
      return eta;
    }

    /**
      * Sets the value of the 'eta' field.
      * @param value The value of 'eta'.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder setEta(java.lang.Long value) {
      validate(fields()[6], value);
      this.eta = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'eta' field has been set.
      * @return True if the 'eta' field has been set, false otherwise.
      */
    public boolean hasEta() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'eta' field.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder clearEta() {
      eta = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'remainingDistance' field.
      * @return The value.
      */
    public java.lang.Double getRemainingDistance() {
      return remainingDistance;
    }

    /**
      * Sets the value of the 'remainingDistance' field.
      * @param value The value of 'remainingDistance'.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder setRemainingDistance(java.lang.Double value) {
      validate(fields()[7], value);
      this.remainingDistance = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'remainingDistance' field has been set.
      * @return True if the 'remainingDistance' field has been set, false otherwise.
      */
    public boolean hasRemainingDistance() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'remainingDistance' field.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder clearRemainingDistance() {
      remainingDistance = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'plannedArrival' field.
      * @return The value.
      */
    public java.lang.Long getPlannedArrival() {
      return plannedArrival;
    }

    /**
      * Sets the value of the 'plannedArrival' field.
      * @param value The value of 'plannedArrival'.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder setPlannedArrival(java.lang.Long value) {
      validate(fields()[8], value);
      this.plannedArrival = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'plannedArrival' field has been set.
      * @return True if the 'plannedArrival' field has been set, false otherwise.
      */
    public boolean hasPlannedArrival() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'plannedArrival' field.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder clearPlannedArrival() {
      plannedArrival = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'plannedDeparture' field.
      * @return The value.
      */
    public java.lang.Long getPlannedDeparture() {
      return plannedDeparture;
    }

    /**
      * Sets the value of the 'plannedDeparture' field.
      * @param value The value of 'plannedDeparture'.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder setPlannedDeparture(java.lang.Long value) {
      validate(fields()[9], value);
      this.plannedDeparture = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'plannedDeparture' field has been set.
      * @return True if the 'plannedDeparture' field has been set, false otherwise.
      */
    public boolean hasPlannedDeparture() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'plannedDeparture' field.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder clearPlannedDeparture() {
      plannedDeparture = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'actualArrival' field.
      * @return The value.
      */
    public java.lang.Long getActualArrival() {
      return actualArrival;
    }

    /**
      * Sets the value of the 'actualArrival' field.
      * @param value The value of 'actualArrival'.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder setActualArrival(java.lang.Long value) {
      validate(fields()[10], value);
      this.actualArrival = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'actualArrival' field has been set.
      * @return True if the 'actualArrival' field has been set, false otherwise.
      */
    public boolean hasActualArrival() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'actualArrival' field.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder clearActualArrival() {
      actualArrival = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'actualDeparture' field.
      * @return The value.
      */
    public java.lang.Long getActualDeparture() {
      return actualDeparture;
    }

    /**
      * Sets the value of the 'actualDeparture' field.
      * @param value The value of 'actualDeparture'.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder setActualDeparture(java.lang.Long value) {
      validate(fields()[11], value);
      this.actualDeparture = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'actualDeparture' field has been set.
      * @return True if the 'actualDeparture' field has been set, false otherwise.
      */
    public boolean hasActualDeparture() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'actualDeparture' field.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder clearActualDeparture() {
      actualDeparture = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'assosiatedShipmentsId' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getAssosiatedShipmentsId() {
      return assosiatedShipmentsId;
    }

    /**
      * Sets the value of the 'assosiatedShipmentsId' field.
      * @param value The value of 'assosiatedShipmentsId'.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder setAssosiatedShipmentsId(java.util.List<java.lang.String> value) {
      validate(fields()[12], value);
      this.assosiatedShipmentsId = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'assosiatedShipmentsId' field has been set.
      * @return True if the 'assosiatedShipmentsId' field has been set, false otherwise.
      */
    public boolean hasAssosiatedShipmentsId() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'assosiatedShipmentsId' field.
      * @return This builder.
      */
    public com.fretron.Model.TripPoint.Builder clearAssosiatedShipmentsId() {
      assosiatedShipmentsId = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    @Override
    public TripPoint build() {
      try {
        TripPoint record = new TripPoint();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.vehicleId = fieldSetFlags()[1] ? this.vehicleId : (java.lang.String) defaultValue(fields()[1]);
        record.purpose = fieldSetFlags()[2] ? this.purpose : (java.lang.String) defaultValue(fields()[2]);
        record.sequenceId = fieldSetFlags()[3] ? this.sequenceId : (java.lang.Double) defaultValue(fields()[3]);
        if (placeBuilder != null) {
          record.place = this.placeBuilder.build();
        } else {
          record.place = fieldSetFlags()[4] ? this.place : (com.fretron.Model.Place) defaultValue(fields()[4]);
        }
        record.status = fieldSetFlags()[5] ? this.status : (java.lang.String) defaultValue(fields()[5]);
        record.eta = fieldSetFlags()[6] ? this.eta : (java.lang.Long) defaultValue(fields()[6]);
        record.remainingDistance = fieldSetFlags()[7] ? this.remainingDistance : (java.lang.Double) defaultValue(fields()[7]);
        record.plannedArrival = fieldSetFlags()[8] ? this.plannedArrival : (java.lang.Long) defaultValue(fields()[8]);
        record.plannedDeparture = fieldSetFlags()[9] ? this.plannedDeparture : (java.lang.Long) defaultValue(fields()[9]);
        record.actualArrival = fieldSetFlags()[10] ? this.actualArrival : (java.lang.Long) defaultValue(fields()[10]);
        record.actualDeparture = fieldSetFlags()[11] ? this.actualDeparture : (java.lang.Long) defaultValue(fields()[11]);
        record.assosiatedShipmentsId = fieldSetFlags()[12] ? this.assosiatedShipmentsId : (java.util.List<java.lang.String>) defaultValue(fields()[12]);
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