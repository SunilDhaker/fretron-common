/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AllTrips extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2302660764973750372L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AllTrips\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"trips\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Trip\",\"fields\":[{\"name\":\"distance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"quantityOfMaterial\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"unitOfQuantity\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"driverName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"driverMobNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"remarks\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"origin\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TripLocation\",\"fields\":[{\"name\":\"freightLocation\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"FreightLocation\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":null},{\"name\":\"geofence\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Geofence\",\"fields\":[{\"name\":\"center\",\"type\":{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}},{\"name\":\"boundry\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Location\"}],\"default\":null},{\"name\":\"circle\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Circle\",\"fields\":[{\"name\":\"center\",\"type\":\"Location\"},{\"name\":\"radius\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"GeofenceType\",\"symbols\":[\"Proximity\",\"Polygon\"]}],\"default\":null}]}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"favouriteOf\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"FreightLocType\",\"symbols\":[\"Private\",\"Public\"]}],\"default\":null}]}],\"default\":null},{\"name\":\"fromTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"tillTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"firstGpsLogId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastGpsLogId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ignoredVehicleGpsLogs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updatedAt\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"}]}}],\"default\":null},{\"name\":\"destination\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TripLocation\"}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"tripId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"actualStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"lane\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Lane\",\"fields\":[{\"name\":\"sources\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"FreightLocation\"}],\"default\":null},{\"name\":\"destination\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"FreightLocation\"}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"baseSource\",\"type\":[\"null\",\"FreightLocation\"],\"default\":null},{\"name\":\"baseDestination\",\"type\":[\"null\",\"FreightLocation\"],\"default\":null},{\"name\":\"baseMaterial\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"baseRate\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"sourceOffSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"destinationOffSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"materialOffSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"baseTransitDays\",\"type\":[\"null\",\"int\"],\"default\":null}]}],\"default\":null},{\"name\":\"tripState\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TripState\",\"symbols\":[\"Created\",\"Started\",\"Completed\"]}],\"default\":null},{\"name\":\"deviceImei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"shipmentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"trackingType\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TrackingType\",\"symbols\":[\"Tracker\",\"Trip\",\"Manual\"]}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"expectedDestinations\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"FreightLocation\"}],\"default\":null},{\"name\":\"reprocessTill\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"liveliness\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isOffTrack\",\"type\":\"boolean\",\"default\":false},{\"name\":\"offTrackSince\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"expectedSystemResolution\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<com.fretron.Model.Trip> trips;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AllTrips() {}

  /**
   * All-args constructor.
   * @param trips The new value for trips
   */
  public AllTrips(java.util.List<com.fretron.Model.Trip> trips) {
    this.trips = trips;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return trips;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: trips = (java.util.List<com.fretron.Model.Trip>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'trips' field.
   * @return The value of the 'trips' field.
   */
  public java.util.List<com.fretron.Model.Trip> getTrips() {
    return trips;
  }

  /**
   * Sets the value of the 'trips' field.
   * @param value the value to set.
   */
  public void setTrips(java.util.List<com.fretron.Model.Trip> value) {
    this.trips = value;
  }

  /**
   * Creates a new AllTrips RecordBuilder.
   * @return A new AllTrips RecordBuilder
   */
  public static com.fretron.Model.AllTrips.Builder newBuilder() {
    return new com.fretron.Model.AllTrips.Builder();
  }

  /**
   * Creates a new AllTrips RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AllTrips RecordBuilder
   */
  public static com.fretron.Model.AllTrips.Builder newBuilder(com.fretron.Model.AllTrips.Builder other) {
    return new com.fretron.Model.AllTrips.Builder(other);
  }

  /**
   * Creates a new AllTrips RecordBuilder by copying an existing AllTrips instance.
   * @param other The existing instance to copy.
   * @return A new AllTrips RecordBuilder
   */
  public static com.fretron.Model.AllTrips.Builder newBuilder(com.fretron.Model.AllTrips other) {
    return new com.fretron.Model.AllTrips.Builder(other);
  }

  /**
   * RecordBuilder for AllTrips instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AllTrips>
    implements org.apache.avro.data.RecordBuilder<AllTrips> {

    private java.util.List<com.fretron.Model.Trip> trips;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.AllTrips.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.trips)) {
        this.trips = data().deepCopy(fields()[0].schema(), other.trips);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AllTrips instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.AllTrips other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.trips)) {
        this.trips = data().deepCopy(fields()[0].schema(), other.trips);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'trips' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.Trip> getTrips() {
      return trips;
    }

    /**
      * Sets the value of the 'trips' field.
      * @param value The value of 'trips'.
      * @return This builder.
      */
    public com.fretron.Model.AllTrips.Builder setTrips(java.util.List<com.fretron.Model.Trip> value) {
      validate(fields()[0], value);
      this.trips = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'trips' field has been set.
      * @return True if the 'trips' field has been set, false otherwise.
      */
    public boolean hasTrips() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'trips' field.
      * @return This builder.
      */
    public com.fretron.Model.AllTrips.Builder clearTrips() {
      trips = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public AllTrips build() {
      try {
        AllTrips record = new AllTrips();
        record.trips = fieldSetFlags()[0] ? this.trips : (java.util.List<com.fretron.Model.Trip>) defaultValue(fields()[0]);
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
