/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CommandOfTrip extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1144097170343708694L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommandOfTrip\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"trip\",\"type\":{\"type\":\"record\",\"name\":\"Trip\",\"fields\":[{\"name\":\"distance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"quantityOfMaterial\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"unitOfQuantity\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"driverName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"driverMobNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"remarks\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"origin\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TripLocation\",\"fields\":[{\"name\":\"freightLocation\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"FreightLocation\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":null},{\"name\":\"geofence\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Geofence\",\"fields\":[{\"name\":\"center\",\"type\":{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}},{\"name\":\"boundry\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Location\"}],\"default\":null},{\"name\":\"circle\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Circle\",\"fields\":[{\"name\":\"center\",\"type\":\"Location\"},{\"name\":\"radius\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"GeofenceType\",\"symbols\":[\"Proximity\",\"Polygon\"]}],\"default\":null}]}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"favouriteOf\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"FreightLocType\",\"symbols\":[\"Private\",\"Public\"]}],\"default\":null}]}],\"default\":null},{\"name\":\"fromTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"tillTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"firstGpsLogId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastGpsLogId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ignoredVehicleGpsLogs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updatedAt\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"}]}}],\"default\":null},{\"name\":\"destination\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TripLocation\"}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"tripId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"actualStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"lane\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Lane\",\"fields\":[{\"name\":\"sources\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"FreightLocation\"}],\"default\":null},{\"name\":\"destination\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"FreightLocation\"}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"baseSource\",\"type\":[\"null\",\"FreightLocation\"],\"default\":null},{\"name\":\"baseDestination\",\"type\":[\"null\",\"FreightLocation\"],\"default\":null},{\"name\":\"baseMaterial\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"baseRate\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"sourceOffSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"destinationOffSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"materialOffSet\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"baseTransitDays\",\"type\":[\"null\",\"int\"],\"default\":null}]}],\"default\":null},{\"name\":\"tripState\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TripState\",\"symbols\":[\"Created\",\"Started\",\"Completed\"]}],\"default\":null},{\"name\":\"deviceImei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"shipmentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"trackingType\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TrackingType\",\"symbols\":[\"Tracker\",\"Trip\",\"Manual\"]}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"expectedDestinations\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"FreightLocation\"}],\"default\":null},{\"name\":\"reprocessTill\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"liveliness\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}},{\"name\":\"startTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"statusCode\",\"type\":[\"null\",\"int\"]},{\"name\":\"errorMessage\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"trackerTrip\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TrackerTrip\",\"fields\":[{\"name\":\"distance\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"quantityOfMaterial\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"unitOfQuantity\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"driverName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"driverMobNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"remarks\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"origin\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TripLocation\"}],\"default\":null},{\"name\":\"destination\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TripLocation\"}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"tripId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"actualStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"actualEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedStartTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"plannedEndTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"lane\",\"type\":[\"null\",\"Lane\"],\"default\":null},{\"name\":\"tripState\",\"type\":[\"null\",\"TripState\"],\"default\":null},{\"name\":\"deviceImei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"shipmentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String type;
  @Deprecated public java.lang.String id;
  @Deprecated public com.fretron.Model.Trip trip;
  @Deprecated public java.lang.Long startTime;
  @Deprecated public java.lang.Integer statusCode;
  @Deprecated public java.lang.String errorMessage;
  @Deprecated public com.fretron.Model.TrackerTrip trackerTrip;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CommandOfTrip() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param id The new value for id
   * @param trip The new value for trip
   * @param startTime The new value for startTime
   * @param statusCode The new value for statusCode
   * @param errorMessage The new value for errorMessage
   * @param trackerTrip The new value for trackerTrip
   */
  public CommandOfTrip(java.lang.String type, java.lang.String id, com.fretron.Model.Trip trip, java.lang.Long startTime, java.lang.Integer statusCode, java.lang.String errorMessage, com.fretron.Model.TrackerTrip trackerTrip) {
    this.type = type;
    this.id = id;
    this.trip = trip;
    this.startTime = startTime;
    this.statusCode = statusCode;
    this.errorMessage = errorMessage;
    this.trackerTrip = trackerTrip;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return id;
    case 2: return trip;
    case 3: return startTime;
    case 4: return statusCode;
    case 5: return errorMessage;
    case 6: return trackerTrip;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.String)value$; break;
    case 1: id = (java.lang.String)value$; break;
    case 2: trip = (com.fretron.Model.Trip)value$; break;
    case 3: startTime = (java.lang.Long)value$; break;
    case 4: statusCode = (java.lang.Integer)value$; break;
    case 5: errorMessage = (java.lang.String)value$; break;
    case 6: trackerTrip = (com.fretron.Model.TrackerTrip)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'trip' field.
   * @return The value of the 'trip' field.
   */
  public com.fretron.Model.Trip getTrip() {
    return trip;
  }

  /**
   * Sets the value of the 'trip' field.
   * @param value the value to set.
   */
  public void setTrip(com.fretron.Model.Trip value) {
    this.trip = value;
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
   * Gets the value of the 'statusCode' field.
   * @return The value of the 'statusCode' field.
   */
  public java.lang.Integer getStatusCode() {
    return statusCode;
  }

  /**
   * Sets the value of the 'statusCode' field.
   * @param value the value to set.
   */
  public void setStatusCode(java.lang.Integer value) {
    this.statusCode = value;
  }

  /**
   * Gets the value of the 'errorMessage' field.
   * @return The value of the 'errorMessage' field.
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Sets the value of the 'errorMessage' field.
   * @param value the value to set.
   */
  public void setErrorMessage(java.lang.String value) {
    this.errorMessage = value;
  }

  /**
   * Gets the value of the 'trackerTrip' field.
   * @return The value of the 'trackerTrip' field.
   */
  public com.fretron.Model.TrackerTrip getTrackerTrip() {
    return trackerTrip;
  }

  /**
   * Sets the value of the 'trackerTrip' field.
   * @param value the value to set.
   */
  public void setTrackerTrip(com.fretron.Model.TrackerTrip value) {
    this.trackerTrip = value;
  }

  /**
   * Creates a new CommandOfTrip RecordBuilder.
   * @return A new CommandOfTrip RecordBuilder
   */
  public static com.fretron.Model.CommandOfTrip.Builder newBuilder() {
    return new com.fretron.Model.CommandOfTrip.Builder();
  }

  /**
   * Creates a new CommandOfTrip RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CommandOfTrip RecordBuilder
   */
  public static com.fretron.Model.CommandOfTrip.Builder newBuilder(com.fretron.Model.CommandOfTrip.Builder other) {
    return new com.fretron.Model.CommandOfTrip.Builder(other);
  }

  /**
   * Creates a new CommandOfTrip RecordBuilder by copying an existing CommandOfTrip instance.
   * @param other The existing instance to copy.
   * @return A new CommandOfTrip RecordBuilder
   */
  public static com.fretron.Model.CommandOfTrip.Builder newBuilder(com.fretron.Model.CommandOfTrip other) {
    return new com.fretron.Model.CommandOfTrip.Builder(other);
  }

  /**
   * RecordBuilder for CommandOfTrip instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommandOfTrip>
    implements org.apache.avro.data.RecordBuilder<CommandOfTrip> {

    private java.lang.String type;
    private java.lang.String id;
    private com.fretron.Model.Trip trip;
    private com.fretron.Model.Trip.Builder tripBuilder;
    private java.lang.Long startTime;
    private java.lang.Integer statusCode;
    private java.lang.String errorMessage;
    private com.fretron.Model.TrackerTrip trackerTrip;
    private com.fretron.Model.TrackerTrip.Builder trackerTripBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.CommandOfTrip.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.trip)) {
        this.trip = data().deepCopy(fields()[2].schema(), other.trip);
        fieldSetFlags()[2] = true;
      }
      if (other.hasTripBuilder()) {
        this.tripBuilder = com.fretron.Model.Trip.newBuilder(other.getTripBuilder());
      }
      if (isValidValue(fields()[3], other.startTime)) {
        this.startTime = data().deepCopy(fields()[3].schema(), other.startTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.statusCode)) {
        this.statusCode = data().deepCopy(fields()[4].schema(), other.statusCode);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.errorMessage)) {
        this.errorMessage = data().deepCopy(fields()[5].schema(), other.errorMessage);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.trackerTrip)) {
        this.trackerTrip = data().deepCopy(fields()[6].schema(), other.trackerTrip);
        fieldSetFlags()[6] = true;
      }
      if (other.hasTrackerTripBuilder()) {
        this.trackerTripBuilder = com.fretron.Model.TrackerTrip.newBuilder(other.getTrackerTripBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing CommandOfTrip instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.CommandOfTrip other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.trip)) {
        this.trip = data().deepCopy(fields()[2].schema(), other.trip);
        fieldSetFlags()[2] = true;
      }
      this.tripBuilder = null;
      if (isValidValue(fields()[3], other.startTime)) {
        this.startTime = data().deepCopy(fields()[3].schema(), other.startTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.statusCode)) {
        this.statusCode = data().deepCopy(fields()[4].schema(), other.statusCode);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.errorMessage)) {
        this.errorMessage = data().deepCopy(fields()[5].schema(), other.errorMessage);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.trackerTrip)) {
        this.trackerTrip = data().deepCopy(fields()[6].schema(), other.trackerTrip);
        fieldSetFlags()[6] = true;
      }
      this.trackerTripBuilder = null;
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
    public com.fretron.Model.CommandOfTrip.Builder setType(java.lang.String value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder setId(java.lang.String value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'trip' field.
      * @return The value.
      */
    public com.fretron.Model.Trip getTrip() {
      return trip;
    }

    /**
      * Sets the value of the 'trip' field.
      * @param value The value of 'trip'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder setTrip(com.fretron.Model.Trip value) {
      validate(fields()[2], value);
      this.tripBuilder = null;
      this.trip = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'trip' field has been set.
      * @return True if the 'trip' field has been set, false otherwise.
      */
    public boolean hasTrip() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'trip' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Trip.Builder getTripBuilder() {
      if (tripBuilder == null) {
        if (hasTrip()) {
          setTripBuilder(com.fretron.Model.Trip.newBuilder(trip));
        } else {
          setTripBuilder(com.fretron.Model.Trip.newBuilder());
        }
      }
      return tripBuilder;
    }

    /**
     * Sets the Builder instance for the 'trip' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CommandOfTrip.Builder setTripBuilder(com.fretron.Model.Trip.Builder value) {
      clearTrip();
      tripBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'trip' field has an active Builder instance
     * @return True if the 'trip' field has an active Builder instance
     */
    public boolean hasTripBuilder() {
      return tripBuilder != null;
    }

    /**
      * Clears the value of the 'trip' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder clearTrip() {
      trip = null;
      tripBuilder = null;
      fieldSetFlags()[2] = false;
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
    public com.fretron.Model.CommandOfTrip.Builder setStartTime(java.lang.Long value) {
      validate(fields()[3], value);
      this.startTime = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'startTime' field has been set.
      * @return True if the 'startTime' field has been set, false otherwise.
      */
    public boolean hasStartTime() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'startTime' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder clearStartTime() {
      startTime = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'statusCode' field.
      * @return The value.
      */
    public java.lang.Integer getStatusCode() {
      return statusCode;
    }

    /**
      * Sets the value of the 'statusCode' field.
      * @param value The value of 'statusCode'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder setStatusCode(java.lang.Integer value) {
      validate(fields()[4], value);
      this.statusCode = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'statusCode' field has been set.
      * @return True if the 'statusCode' field has been set, false otherwise.
      */
    public boolean hasStatusCode() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'statusCode' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder clearStatusCode() {
      statusCode = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'errorMessage' field.
      * @return The value.
      */
    public java.lang.String getErrorMessage() {
      return errorMessage;
    }

    /**
      * Sets the value of the 'errorMessage' field.
      * @param value The value of 'errorMessage'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder setErrorMessage(java.lang.String value) {
      validate(fields()[5], value);
      this.errorMessage = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'errorMessage' field has been set.
      * @return True if the 'errorMessage' field has been set, false otherwise.
      */
    public boolean hasErrorMessage() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'errorMessage' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder clearErrorMessage() {
      errorMessage = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'trackerTrip' field.
      * @return The value.
      */
    public com.fretron.Model.TrackerTrip getTrackerTrip() {
      return trackerTrip;
    }

    /**
      * Sets the value of the 'trackerTrip' field.
      * @param value The value of 'trackerTrip'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder setTrackerTrip(com.fretron.Model.TrackerTrip value) {
      validate(fields()[6], value);
      this.trackerTripBuilder = null;
      this.trackerTrip = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'trackerTrip' field has been set.
      * @return True if the 'trackerTrip' field has been set, false otherwise.
      */
    public boolean hasTrackerTrip() {
      return fieldSetFlags()[6];
    }

    /**
     * Gets the Builder instance for the 'trackerTrip' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.TrackerTrip.Builder getTrackerTripBuilder() {
      if (trackerTripBuilder == null) {
        if (hasTrackerTrip()) {
          setTrackerTripBuilder(com.fretron.Model.TrackerTrip.newBuilder(trackerTrip));
        } else {
          setTrackerTripBuilder(com.fretron.Model.TrackerTrip.newBuilder());
        }
      }
      return trackerTripBuilder;
    }

    /**
     * Sets the Builder instance for the 'trackerTrip' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CommandOfTrip.Builder setTrackerTripBuilder(com.fretron.Model.TrackerTrip.Builder value) {
      clearTrackerTrip();
      trackerTripBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'trackerTrip' field has an active Builder instance
     * @return True if the 'trackerTrip' field has an active Builder instance
     */
    public boolean hasTrackerTripBuilder() {
      return trackerTripBuilder != null;
    }

    /**
      * Clears the value of the 'trackerTrip' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfTrip.Builder clearTrackerTrip() {
      trackerTrip = null;
      trackerTripBuilder = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public CommandOfTrip build() {
      try {
        CommandOfTrip record = new CommandOfTrip();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.String) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.String) defaultValue(fields()[1]);
        if (tripBuilder != null) {
          record.trip = this.tripBuilder.build();
        } else {
          record.trip = fieldSetFlags()[2] ? this.trip : (com.fretron.Model.Trip) defaultValue(fields()[2]);
        }
        record.startTime = fieldSetFlags()[3] ? this.startTime : (java.lang.Long) defaultValue(fields()[3]);
        record.statusCode = fieldSetFlags()[4] ? this.statusCode : (java.lang.Integer) defaultValue(fields()[4]);
        record.errorMessage = fieldSetFlags()[5] ? this.errorMessage : (java.lang.String) defaultValue(fields()[5]);
        if (trackerTripBuilder != null) {
          record.trackerTrip = this.trackerTripBuilder.build();
        } else {
          record.trackerTrip = fieldSetFlags()[6] ? this.trackerTrip : (com.fretron.Model.TrackerTrip) defaultValue(fields()[6]);
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
