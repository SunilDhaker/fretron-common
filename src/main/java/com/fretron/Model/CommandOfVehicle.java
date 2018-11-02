/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CommandOfVehicle extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2246997469513995900L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommandOfVehicle\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicle\",\"type\":{\"type\":\"record\",\"name\":\"Vehicle\",\"fields\":[{\"name\":\"customerId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleModel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleMake\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vtsDeviceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleRegistrationNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"associatedWith\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isDeleted\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"updateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"groups\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"driverId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"attachedDocs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isTrackingEnabled\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"groupsExtended\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OrganisationGroup\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"groupName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"groupType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}}],\"default\":null},{\"name\":\"truckLength\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"loadCapacity\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"floorType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"kmDriven\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"mileageLoaded\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"mileageEmpty\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}},{\"name\":\"startTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"statusCode\",\"type\":[\"null\",\"int\"]},{\"name\":\"errorMessage\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"oldVehcile\",\"type\":[\"null\",\"Vehicle\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String type;
  @Deprecated public java.lang.String id;
  @Deprecated public com.fretron.Model.Vehicle vehicle;
  @Deprecated public java.lang.Long startTime;
  @Deprecated public java.lang.Integer statusCode;
  @Deprecated public java.lang.String errorMessage;
  @Deprecated public com.fretron.Model.Vehicle oldVehcile;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CommandOfVehicle() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param id The new value for id
   * @param vehicle The new value for vehicle
   * @param startTime The new value for startTime
   * @param statusCode The new value for statusCode
   * @param errorMessage The new value for errorMessage
   * @param oldVehcile The new value for oldVehcile
   */
  public CommandOfVehicle(java.lang.String type, java.lang.String id, com.fretron.Model.Vehicle vehicle, java.lang.Long startTime, java.lang.Integer statusCode, java.lang.String errorMessage, com.fretron.Model.Vehicle oldVehcile) {
    this.type = type;
    this.id = id;
    this.vehicle = vehicle;
    this.startTime = startTime;
    this.statusCode = statusCode;
    this.errorMessage = errorMessage;
    this.oldVehcile = oldVehcile;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return id;
    case 2: return vehicle;
    case 3: return startTime;
    case 4: return statusCode;
    case 5: return errorMessage;
    case 6: return oldVehcile;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.String)value$; break;
    case 1: id = (java.lang.String)value$; break;
    case 2: vehicle = (com.fretron.Model.Vehicle)value$; break;
    case 3: startTime = (java.lang.Long)value$; break;
    case 4: statusCode = (java.lang.Integer)value$; break;
    case 5: errorMessage = (java.lang.String)value$; break;
    case 6: oldVehcile = (com.fretron.Model.Vehicle)value$; break;
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
   * Gets the value of the 'vehicle' field.
   * @return The value of the 'vehicle' field.
   */
  public com.fretron.Model.Vehicle getVehicle() {
    return vehicle;
  }

  /**
   * Sets the value of the 'vehicle' field.
   * @param value the value to set.
   */
  public void setVehicle(com.fretron.Model.Vehicle value) {
    this.vehicle = value;
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
   * Gets the value of the 'oldVehcile' field.
   * @return The value of the 'oldVehcile' field.
   */
  public com.fretron.Model.Vehicle getOldVehcile() {
    return oldVehcile;
  }

  /**
   * Sets the value of the 'oldVehcile' field.
   * @param value the value to set.
   */
  public void setOldVehcile(com.fretron.Model.Vehicle value) {
    this.oldVehcile = value;
  }

  /**
   * Creates a new CommandOfVehicle RecordBuilder.
   * @return A new CommandOfVehicle RecordBuilder
   */
  public static com.fretron.Model.CommandOfVehicle.Builder newBuilder() {
    return new com.fretron.Model.CommandOfVehicle.Builder();
  }

  /**
   * Creates a new CommandOfVehicle RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CommandOfVehicle RecordBuilder
   */
  public static com.fretron.Model.CommandOfVehicle.Builder newBuilder(com.fretron.Model.CommandOfVehicle.Builder other) {
    return new com.fretron.Model.CommandOfVehicle.Builder(other);
  }

  /**
   * Creates a new CommandOfVehicle RecordBuilder by copying an existing CommandOfVehicle instance.
   * @param other The existing instance to copy.
   * @return A new CommandOfVehicle RecordBuilder
   */
  public static com.fretron.Model.CommandOfVehicle.Builder newBuilder(com.fretron.Model.CommandOfVehicle other) {
    return new com.fretron.Model.CommandOfVehicle.Builder(other);
  }

  /**
   * RecordBuilder for CommandOfVehicle instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommandOfVehicle>
    implements org.apache.avro.data.RecordBuilder<CommandOfVehicle> {

    private java.lang.String type;
    private java.lang.String id;
    private com.fretron.Model.Vehicle vehicle;
    private com.fretron.Model.Vehicle.Builder vehicleBuilder;
    private java.lang.Long startTime;
    private java.lang.Integer statusCode;
    private java.lang.String errorMessage;
    private com.fretron.Model.Vehicle oldVehcile;
    private com.fretron.Model.Vehicle.Builder oldVehcileBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.CommandOfVehicle.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.vehicle)) {
        this.vehicle = data().deepCopy(fields()[2].schema(), other.vehicle);
        fieldSetFlags()[2] = true;
      }
      if (other.hasVehicleBuilder()) {
        this.vehicleBuilder = com.fretron.Model.Vehicle.newBuilder(other.getVehicleBuilder());
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
      if (isValidValue(fields()[6], other.oldVehcile)) {
        this.oldVehcile = data().deepCopy(fields()[6].schema(), other.oldVehcile);
        fieldSetFlags()[6] = true;
      }
      if (other.hasOldVehcileBuilder()) {
        this.oldVehcileBuilder = com.fretron.Model.Vehicle.newBuilder(other.getOldVehcileBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing CommandOfVehicle instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.CommandOfVehicle other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.vehicle)) {
        this.vehicle = data().deepCopy(fields()[2].schema(), other.vehicle);
        fieldSetFlags()[2] = true;
      }
      this.vehicleBuilder = null;
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
      if (isValidValue(fields()[6], other.oldVehcile)) {
        this.oldVehcile = data().deepCopy(fields()[6].schema(), other.oldVehcile);
        fieldSetFlags()[6] = true;
      }
      this.oldVehcileBuilder = null;
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
    public com.fretron.Model.CommandOfVehicle.Builder setType(java.lang.String value) {
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
    public com.fretron.Model.CommandOfVehicle.Builder clearType() {
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
    public com.fretron.Model.CommandOfVehicle.Builder setId(java.lang.String value) {
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
    public com.fretron.Model.CommandOfVehicle.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'vehicle' field.
      * @return The value.
      */
    public com.fretron.Model.Vehicle getVehicle() {
      return vehicle;
    }

    /**
      * Sets the value of the 'vehicle' field.
      * @param value The value of 'vehicle'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfVehicle.Builder setVehicle(com.fretron.Model.Vehicle value) {
      validate(fields()[2], value);
      this.vehicleBuilder = null;
      this.vehicle = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicle' field has been set.
      * @return True if the 'vehicle' field has been set, false otherwise.
      */
    public boolean hasVehicle() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'vehicle' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Vehicle.Builder getVehicleBuilder() {
      if (vehicleBuilder == null) {
        if (hasVehicle()) {
          setVehicleBuilder(com.fretron.Model.Vehicle.newBuilder(vehicle));
        } else {
          setVehicleBuilder(com.fretron.Model.Vehicle.newBuilder());
        }
      }
      return vehicleBuilder;
    }

    /**
     * Sets the Builder instance for the 'vehicle' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CommandOfVehicle.Builder setVehicleBuilder(com.fretron.Model.Vehicle.Builder value) {
      clearVehicle();
      vehicleBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'vehicle' field has an active Builder instance
     * @return True if the 'vehicle' field has an active Builder instance
     */
    public boolean hasVehicleBuilder() {
      return vehicleBuilder != null;
    }

    /**
      * Clears the value of the 'vehicle' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfVehicle.Builder clearVehicle() {
      vehicle = null;
      vehicleBuilder = null;
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
    public com.fretron.Model.CommandOfVehicle.Builder setStartTime(java.lang.Long value) {
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
    public com.fretron.Model.CommandOfVehicle.Builder clearStartTime() {
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
    public com.fretron.Model.CommandOfVehicle.Builder setStatusCode(java.lang.Integer value) {
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
    public com.fretron.Model.CommandOfVehicle.Builder clearStatusCode() {
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
    public com.fretron.Model.CommandOfVehicle.Builder setErrorMessage(java.lang.String value) {
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
    public com.fretron.Model.CommandOfVehicle.Builder clearErrorMessage() {
      errorMessage = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'oldVehcile' field.
      * @return The value.
      */
    public com.fretron.Model.Vehicle getOldVehcile() {
      return oldVehcile;
    }

    /**
      * Sets the value of the 'oldVehcile' field.
      * @param value The value of 'oldVehcile'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfVehicle.Builder setOldVehcile(com.fretron.Model.Vehicle value) {
      validate(fields()[6], value);
      this.oldVehcileBuilder = null;
      this.oldVehcile = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'oldVehcile' field has been set.
      * @return True if the 'oldVehcile' field has been set, false otherwise.
      */
    public boolean hasOldVehcile() {
      return fieldSetFlags()[6];
    }

    /**
     * Gets the Builder instance for the 'oldVehcile' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Vehicle.Builder getOldVehcileBuilder() {
      if (oldVehcileBuilder == null) {
        if (hasOldVehcile()) {
          setOldVehcileBuilder(com.fretron.Model.Vehicle.newBuilder(oldVehcile));
        } else {
          setOldVehcileBuilder(com.fretron.Model.Vehicle.newBuilder());
        }
      }
      return oldVehcileBuilder;
    }

    /**
     * Sets the Builder instance for the 'oldVehcile' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CommandOfVehicle.Builder setOldVehcileBuilder(com.fretron.Model.Vehicle.Builder value) {
      clearOldVehcile();
      oldVehcileBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'oldVehcile' field has an active Builder instance
     * @return True if the 'oldVehcile' field has an active Builder instance
     */
    public boolean hasOldVehcileBuilder() {
      return oldVehcileBuilder != null;
    }

    /**
      * Clears the value of the 'oldVehcile' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfVehicle.Builder clearOldVehcile() {
      oldVehcile = null;
      oldVehcileBuilder = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public CommandOfVehicle build() {
      try {
        CommandOfVehicle record = new CommandOfVehicle();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.String) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.String) defaultValue(fields()[1]);
        if (vehicleBuilder != null) {
          record.vehicle = this.vehicleBuilder.build();
        } else {
          record.vehicle = fieldSetFlags()[2] ? this.vehicle : (com.fretron.Model.Vehicle) defaultValue(fields()[2]);
        }
        record.startTime = fieldSetFlags()[3] ? this.startTime : (java.lang.Long) defaultValue(fields()[3]);
        record.statusCode = fieldSetFlags()[4] ? this.statusCode : (java.lang.Integer) defaultValue(fields()[4]);
        record.errorMessage = fieldSetFlags()[5] ? this.errorMessage : (java.lang.String) defaultValue(fields()[5]);
        if (oldVehcileBuilder != null) {
          record.oldVehcile = this.oldVehcileBuilder.build();
        } else {
          record.oldVehcile = fieldSetFlags()[6] ? this.oldVehcile : (com.fretron.Model.Vehicle) defaultValue(fields()[6]);
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
