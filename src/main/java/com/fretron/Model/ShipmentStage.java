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
  private static final long serialVersionUID = -9029397180759379763L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShipmentStage\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"tripPoint\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TripPoint\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"purpose\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sequenceId\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"place\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Place\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"center\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"suggestedRadius\",\"type\":\"double\",\"default\":null},{\"name\":\"viewport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ViewPort\",\"fields\":[{\"name\":\"northeast\",\"type\":[\"null\",\"Location\"],\"default\":null},{\"name\":\"southwest\",\"type\":[\"null\",\"Location\"],\"default\":null}]}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"boundary\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"eta\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"remainingDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"plannedArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualArrival\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualDeparture\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"assosiatedShipmentsId\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"creationTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"outOfTrackSince\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isOutOfTrack\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isAutoCompleted\",\"type\":\"boolean\",\"default\":false},{\"name\":\"coveredDistance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"purposedDistance\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public com.fretron.Model.TripPoint tripPoint;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ShipmentStage() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param tripPoint The new value for tripPoint
   */
  public ShipmentStage(java.lang.String uuid, com.fretron.Model.TripPoint tripPoint) {
    this.uuid = uuid;
    this.tripPoint = tripPoint;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return tripPoint;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: tripPoint = (com.fretron.Model.TripPoint)value$; break;
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
    private com.fretron.Model.TripPoint tripPoint;
    private com.fretron.Model.TripPoint.Builder tripPointBuilder;

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
      if (isValidValue(fields()[1], other.tripPoint)) {
        this.tripPoint = data().deepCopy(fields()[1].schema(), other.tripPoint);
        fieldSetFlags()[1] = true;
      }
      if (other.hasTripPointBuilder()) {
        this.tripPointBuilder = com.fretron.Model.TripPoint.newBuilder(other.getTripPointBuilder());
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
      if (isValidValue(fields()[1], other.tripPoint)) {
        this.tripPoint = data().deepCopy(fields()[1].schema(), other.tripPoint);
        fieldSetFlags()[1] = true;
      }
      this.tripPointBuilder = null;
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
      validate(fields()[1], value);
      this.tripPointBuilder = null;
      this.tripPoint = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'tripPoint' field has been set.
      * @return True if the 'tripPoint' field has been set, false otherwise.
      */
    public boolean hasTripPoint() {
      return fieldSetFlags()[1];
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
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public ShipmentStage build() {
      try {
        ShipmentStage record = new ShipmentStage();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        if (tripPointBuilder != null) {
          record.tripPoint = this.tripPointBuilder.build();
        } else {
          record.tripPoint = fieldSetFlags()[1] ? this.tripPoint : (com.fretron.Model.TripPoint) defaultValue(fields()[1]);
        }
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
