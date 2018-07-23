/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BuisnessPartner extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 164007596920411699L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BuisnessPartner\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"geoFence\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GeoJsonFence\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"properties\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Properties\",\"fields\":[{\"name\":\"catagory\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"level\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"customeFields\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"geometry\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Geometry\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"coordinates\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}],\"default\":null},{\"name\":\"metadata\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"MetaData\",\"fields\":[{\"name\":\"clazz\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"addedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"accessibility\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isFavorite\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}],\"default\":null}]}],\"default\":null},{\"name\":\"contacts\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Contact\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"mobileNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"location\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String orgId;
  @Deprecated public com.fretron.Model.GeoJsonFence geoFence;
  @Deprecated public java.util.List<com.fretron.Model.Contact> contacts;
  @Deprecated public com.fretron.Model.Location location;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BuisnessPartner() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param name The new value for name
   * @param orgId The new value for orgId
   * @param geoFence The new value for geoFence
   * @param contacts The new value for contacts
   * @param location The new value for location
   */
  public BuisnessPartner(java.lang.String uuid, java.lang.String name, java.lang.String orgId, com.fretron.Model.GeoJsonFence geoFence, java.util.List<com.fretron.Model.Contact> contacts, com.fretron.Model.Location location) {
    this.uuid = uuid;
    this.name = name;
    this.orgId = orgId;
    this.geoFence = geoFence;
    this.contacts = contacts;
    this.location = location;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return name;
    case 2: return orgId;
    case 3: return geoFence;
    case 4: return contacts;
    case 5: return location;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: name = (java.lang.String)value$; break;
    case 2: orgId = (java.lang.String)value$; break;
    case 3: geoFence = (com.fretron.Model.GeoJsonFence)value$; break;
    case 4: contacts = (java.util.List<com.fretron.Model.Contact>)value$; break;
    case 5: location = (com.fretron.Model.Location)value$; break;
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
   * Gets the value of the 'geoFence' field.
   * @return The value of the 'geoFence' field.
   */
  public com.fretron.Model.GeoJsonFence getGeoFence() {
    return geoFence;
  }

  /**
   * Sets the value of the 'geoFence' field.
   * @param value the value to set.
   */
  public void setGeoFence(com.fretron.Model.GeoJsonFence value) {
    this.geoFence = value;
  }

  /**
   * Gets the value of the 'contacts' field.
   * @return The value of the 'contacts' field.
   */
  public java.util.List<com.fretron.Model.Contact> getContacts() {
    return contacts;
  }

  /**
   * Sets the value of the 'contacts' field.
   * @param value the value to set.
   */
  public void setContacts(java.util.List<com.fretron.Model.Contact> value) {
    this.contacts = value;
  }

  /**
   * Gets the value of the 'location' field.
   * @return The value of the 'location' field.
   */
  public com.fretron.Model.Location getLocation() {
    return location;
  }

  /**
   * Sets the value of the 'location' field.
   * @param value the value to set.
   */
  public void setLocation(com.fretron.Model.Location value) {
    this.location = value;
  }

  /**
   * Creates a new BuisnessPartner RecordBuilder.
   * @return A new BuisnessPartner RecordBuilder
   */
  public static com.fretron.Model.BuisnessPartner.Builder newBuilder() {
    return new com.fretron.Model.BuisnessPartner.Builder();
  }

  /**
   * Creates a new BuisnessPartner RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BuisnessPartner RecordBuilder
   */
  public static com.fretron.Model.BuisnessPartner.Builder newBuilder(com.fretron.Model.BuisnessPartner.Builder other) {
    return new com.fretron.Model.BuisnessPartner.Builder(other);
  }

  /**
   * Creates a new BuisnessPartner RecordBuilder by copying an existing BuisnessPartner instance.
   * @param other The existing instance to copy.
   * @return A new BuisnessPartner RecordBuilder
   */
  public static com.fretron.Model.BuisnessPartner.Builder newBuilder(com.fretron.Model.BuisnessPartner other) {
    return new com.fretron.Model.BuisnessPartner.Builder(other);
  }

  /**
   * RecordBuilder for BuisnessPartner instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BuisnessPartner>
    implements org.apache.avro.data.RecordBuilder<BuisnessPartner> {

    private java.lang.String uuid;
    private java.lang.String name;
    private java.lang.String orgId;
    private com.fretron.Model.GeoJsonFence geoFence;
    private com.fretron.Model.GeoJsonFence.Builder geoFenceBuilder;
    private java.util.List<com.fretron.Model.Contact> contacts;
    private com.fretron.Model.Location location;
    private com.fretron.Model.Location.Builder locationBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.BuisnessPartner.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.orgId)) {
        this.orgId = data().deepCopy(fields()[2].schema(), other.orgId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.geoFence)) {
        this.geoFence = data().deepCopy(fields()[3].schema(), other.geoFence);
        fieldSetFlags()[3] = true;
      }
      if (other.hasGeoFenceBuilder()) {
        this.geoFenceBuilder = com.fretron.Model.GeoJsonFence.newBuilder(other.getGeoFenceBuilder());
      }
      if (isValidValue(fields()[4], other.contacts)) {
        this.contacts = data().deepCopy(fields()[4].schema(), other.contacts);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.location)) {
        this.location = data().deepCopy(fields()[5].schema(), other.location);
        fieldSetFlags()[5] = true;
      }
      if (other.hasLocationBuilder()) {
        this.locationBuilder = com.fretron.Model.Location.newBuilder(other.getLocationBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing BuisnessPartner instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.BuisnessPartner other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.orgId)) {
        this.orgId = data().deepCopy(fields()[2].schema(), other.orgId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.geoFence)) {
        this.geoFence = data().deepCopy(fields()[3].schema(), other.geoFence);
        fieldSetFlags()[3] = true;
      }
      this.geoFenceBuilder = null;
      if (isValidValue(fields()[4], other.contacts)) {
        this.contacts = data().deepCopy(fields()[4].schema(), other.contacts);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.location)) {
        this.location = data().deepCopy(fields()[5].schema(), other.location);
        fieldSetFlags()[5] = true;
      }
      this.locationBuilder = null;
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
    public com.fretron.Model.BuisnessPartner.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.BuisnessPartner.Builder clearUuid() {
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
    public com.fretron.Model.BuisnessPartner.Builder setName(java.lang.String value) {
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
    public com.fretron.Model.BuisnessPartner.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
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
    public com.fretron.Model.BuisnessPartner.Builder setOrgId(java.lang.String value) {
      validate(fields()[2], value);
      this.orgId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'orgId' field has been set.
      * @return True if the 'orgId' field has been set, false otherwise.
      */
    public boolean hasOrgId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'orgId' field.
      * @return This builder.
      */
    public com.fretron.Model.BuisnessPartner.Builder clearOrgId() {
      orgId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'geoFence' field.
      * @return The value.
      */
    public com.fretron.Model.GeoJsonFence getGeoFence() {
      return geoFence;
    }

    /**
      * Sets the value of the 'geoFence' field.
      * @param value The value of 'geoFence'.
      * @return This builder.
      */
    public com.fretron.Model.BuisnessPartner.Builder setGeoFence(com.fretron.Model.GeoJsonFence value) {
      validate(fields()[3], value);
      this.geoFenceBuilder = null;
      this.geoFence = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'geoFence' field has been set.
      * @return True if the 'geoFence' field has been set, false otherwise.
      */
    public boolean hasGeoFence() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'geoFence' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.GeoJsonFence.Builder getGeoFenceBuilder() {
      if (geoFenceBuilder == null) {
        if (hasGeoFence()) {
          setGeoFenceBuilder(com.fretron.Model.GeoJsonFence.newBuilder(geoFence));
        } else {
          setGeoFenceBuilder(com.fretron.Model.GeoJsonFence.newBuilder());
        }
      }
      return geoFenceBuilder;
    }

    /**
     * Sets the Builder instance for the 'geoFence' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.BuisnessPartner.Builder setGeoFenceBuilder(com.fretron.Model.GeoJsonFence.Builder value) {
      clearGeoFence();
      geoFenceBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'geoFence' field has an active Builder instance
     * @return True if the 'geoFence' field has an active Builder instance
     */
    public boolean hasGeoFenceBuilder() {
      return geoFenceBuilder != null;
    }

    /**
      * Clears the value of the 'geoFence' field.
      * @return This builder.
      */
    public com.fretron.Model.BuisnessPartner.Builder clearGeoFence() {
      geoFence = null;
      geoFenceBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'contacts' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.Contact> getContacts() {
      return contacts;
    }

    /**
      * Sets the value of the 'contacts' field.
      * @param value The value of 'contacts'.
      * @return This builder.
      */
    public com.fretron.Model.BuisnessPartner.Builder setContacts(java.util.List<com.fretron.Model.Contact> value) {
      validate(fields()[4], value);
      this.contacts = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'contacts' field has been set.
      * @return True if the 'contacts' field has been set, false otherwise.
      */
    public boolean hasContacts() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'contacts' field.
      * @return This builder.
      */
    public com.fretron.Model.BuisnessPartner.Builder clearContacts() {
      contacts = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'location' field.
      * @return The value.
      */
    public com.fretron.Model.Location getLocation() {
      return location;
    }

    /**
      * Sets the value of the 'location' field.
      * @param value The value of 'location'.
      * @return This builder.
      */
    public com.fretron.Model.BuisnessPartner.Builder setLocation(com.fretron.Model.Location value) {
      validate(fields()[5], value);
      this.locationBuilder = null;
      this.location = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'location' field has been set.
      * @return True if the 'location' field has been set, false otherwise.
      */
    public boolean hasLocation() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'location' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Location.Builder getLocationBuilder() {
      if (locationBuilder == null) {
        if (hasLocation()) {
          setLocationBuilder(com.fretron.Model.Location.newBuilder(location));
        } else {
          setLocationBuilder(com.fretron.Model.Location.newBuilder());
        }
      }
      return locationBuilder;
    }

    /**
     * Sets the Builder instance for the 'location' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.BuisnessPartner.Builder setLocationBuilder(com.fretron.Model.Location.Builder value) {
      clearLocation();
      locationBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'location' field has an active Builder instance
     * @return True if the 'location' field has an active Builder instance
     */
    public boolean hasLocationBuilder() {
      return locationBuilder != null;
    }

    /**
      * Clears the value of the 'location' field.
      * @return This builder.
      */
    public com.fretron.Model.BuisnessPartner.Builder clearLocation() {
      location = null;
      locationBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public BuisnessPartner build() {
      try {
        BuisnessPartner record = new BuisnessPartner();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.orgId = fieldSetFlags()[2] ? this.orgId : (java.lang.String) defaultValue(fields()[2]);
        if (geoFenceBuilder != null) {
          record.geoFence = this.geoFenceBuilder.build();
        } else {
          record.geoFence = fieldSetFlags()[3] ? this.geoFence : (com.fretron.Model.GeoJsonFence) defaultValue(fields()[3]);
        }
        record.contacts = fieldSetFlags()[4] ? this.contacts : (java.util.List<com.fretron.Model.Contact>) defaultValue(fields()[4]);
        if (locationBuilder != null) {
          record.location = this.locationBuilder.build();
        } else {
          record.location = fieldSetFlags()[5] ? this.location : (com.fretron.Model.Location) defaultValue(fields()[5]);
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
