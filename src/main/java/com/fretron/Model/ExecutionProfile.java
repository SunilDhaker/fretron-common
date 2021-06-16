/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ExecutionProfile extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8581177522869843860L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ExecutionProfile\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"legs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Leg\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"allowedOrigins\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Place\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"center\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"centerCoordinates\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"suggestedRadius\",\"type\":\"double\",\"default\":null},{\"name\":\"viewport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ViewPort\",\"fields\":[{\"name\":\"northeast\",\"type\":[\"null\",\"Location\"],\"default\":null},{\"name\":\"southwest\",\"type\":[\"null\",\"Location\"],\"default\":null}]}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"addedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"hubId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"district\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"subDistrict\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"boundary\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null},{\"name\":\"places\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Place\"}],\"default\":null},{\"name\":\"accessibility\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isOwned\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"geoJsonBoundry\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Geometry\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"coordinates\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}],\"default\":null}]}}],\"default\":null},{\"name\":\"allowedDestination\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Place\"}],\"default\":null},{\"name\":\"originType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"transportationMode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"allowedTransitDays\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"destinationType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"allowedVehicleTypes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LoadType\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"partnerId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"partnerName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"partnerExternalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleCategory\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"numberOfWheels\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"passingCapacityMT\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"passingCapacityCFT\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"bodyType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"chassisType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"dimensionString\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"minLength\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"includeMinLength\",\"type\":\"boolean\",\"default\":false},{\"name\":\"maxLength\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"includeMaxLength\",\"type\":\"boolean\",\"default\":false},{\"name\":\"minHeight\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"includeMinHeight\",\"type\":\"boolean\",\"default\":false},{\"name\":\"maxHeight\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"includeMaxHeight\",\"type\":\"boolean\",\"default\":false},{\"name\":\"bodyTypes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"chassisTypes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"updates\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Updates\",\"fields\":[{\"name\":\"forwardReasons\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"resourceType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resourceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sourceOfInformation\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updateType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"forwardedFrom\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"revision\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"traceID\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String name;
  @Deprecated public java.util.List<com.fretron.Model.Leg> legs;
  @Deprecated public java.lang.String orgId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ExecutionProfile() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param name The new value for name
   * @param legs The new value for legs
   * @param orgId The new value for orgId
   */
  public ExecutionProfile(java.lang.String uuid, java.lang.String name, java.util.List<com.fretron.Model.Leg> legs, java.lang.String orgId) {
    this.uuid = uuid;
    this.name = name;
    this.legs = legs;
    this.orgId = orgId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return name;
    case 2: return legs;
    case 3: return orgId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: name = (java.lang.String)value$; break;
    case 2: legs = (java.util.List<com.fretron.Model.Leg>)value$; break;
    case 3: orgId = (java.lang.String)value$; break;
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
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'legs' field.
   * @return The value of the 'legs' field.
   */
  public java.util.List<com.fretron.Model.Leg> getLegs() {
    return legs;
  }

  /**
   * Sets the value of the 'legs' field.
   * @param value the value to set.
   */
  public void setLegs(java.util.List<com.fretron.Model.Leg> value) {
    this.legs = value;
  }

  /**
   * Gets the value of the 'orgId' field.
   * @return The value of the 'orgId' field.
   */
  public java.lang.String getOrgId() {
    return orgId;
  }

  /**
   * Sets the value of the 'orgId' field.
   * @param value the value to set.
   */
  public void setOrgId(java.lang.String value) {
    this.orgId = value;
  }

  /**
   * Creates a new ExecutionProfile RecordBuilder.
   * @return A new ExecutionProfile RecordBuilder
   */
  public static com.fretron.Model.ExecutionProfile.Builder newBuilder() {
    return new com.fretron.Model.ExecutionProfile.Builder();
  }

  /**
   * Creates a new ExecutionProfile RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ExecutionProfile RecordBuilder
   */
  public static com.fretron.Model.ExecutionProfile.Builder newBuilder(com.fretron.Model.ExecutionProfile.Builder other) {
    return new com.fretron.Model.ExecutionProfile.Builder(other);
  }

  /**
   * Creates a new ExecutionProfile RecordBuilder by copying an existing ExecutionProfile instance.
   * @param other The existing instance to copy.
   * @return A new ExecutionProfile RecordBuilder
   */
  public static com.fretron.Model.ExecutionProfile.Builder newBuilder(com.fretron.Model.ExecutionProfile other) {
    return new com.fretron.Model.ExecutionProfile.Builder(other);
  }

  /**
   * RecordBuilder for ExecutionProfile instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ExecutionProfile>
    implements org.apache.avro.data.RecordBuilder<ExecutionProfile> {

    private java.lang.String uuid;
    private java.lang.String name;
    private java.util.List<com.fretron.Model.Leg> legs;
    private java.lang.String orgId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.ExecutionProfile.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.legs)) {
        this.legs = data().deepCopy(fields()[2].schema(), other.legs);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.orgId)) {
        this.orgId = data().deepCopy(fields()[3].schema(), other.orgId);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ExecutionProfile instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.ExecutionProfile other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.legs)) {
        this.legs = data().deepCopy(fields()[2].schema(), other.legs);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.orgId)) {
        this.orgId = data().deepCopy(fields()[3].schema(), other.orgId);
        fieldSetFlags()[3] = true;
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
    public com.fretron.Model.ExecutionProfile.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.ExecutionProfile.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.fretron.Model.ExecutionProfile.Builder setName(java.lang.String value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.fretron.Model.ExecutionProfile.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'legs' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.Leg> getLegs() {
      return legs;
    }

    /**
      * Sets the value of the 'legs' field.
      * @param value The value of 'legs'.
      * @return This builder.
      */
    public com.fretron.Model.ExecutionProfile.Builder setLegs(java.util.List<com.fretron.Model.Leg> value) {
      validate(fields()[2], value);
      this.legs = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'legs' field has been set.
      * @return True if the 'legs' field has been set, false otherwise.
      */
    public boolean hasLegs() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'legs' field.
      * @return This builder.
      */
    public com.fretron.Model.ExecutionProfile.Builder clearLegs() {
      legs = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'orgId' field.
      * @return The value.
      */
    public java.lang.String getOrgId() {
      return orgId;
    }

    /**
      * Sets the value of the 'orgId' field.
      * @param value The value of 'orgId'.
      * @return This builder.
      */
    public com.fretron.Model.ExecutionProfile.Builder setOrgId(java.lang.String value) {
      validate(fields()[3], value);
      this.orgId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'orgId' field has been set.
      * @return True if the 'orgId' field has been set, false otherwise.
      */
    public boolean hasOrgId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'orgId' field.
      * @return This builder.
      */
    public com.fretron.Model.ExecutionProfile.Builder clearOrgId() {
      orgId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public ExecutionProfile build() {
      try {
        ExecutionProfile record = new ExecutionProfile();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.legs = fieldSetFlags()[2] ? this.legs : (java.util.List<com.fretron.Model.Leg>) defaultValue(fields()[2]);
        record.orgId = fieldSetFlags()[3] ? this.orgId : (java.lang.String) defaultValue(fields()[3]);
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
