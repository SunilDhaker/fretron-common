/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OrgOffice extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7132777287067187598L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrgOffice\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"geoLocation\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"contacts\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Contact\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"mobileNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"emails\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"secondaryNumbers\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String _id;
  @Deprecated public com.fretron.Model.Location geoLocation;
  @Deprecated public java.util.List<java.lang.String> type;
  @Deprecated public java.util.List<com.fretron.Model.Contact> contacts;
  @Deprecated public java.lang.String orgId;
  @Deprecated public java.lang.String address;
  @Deprecated public java.lang.String updatedBy;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrgOffice() {}

  /**
   * All-args constructor.
   * @param _id The new value for _id
   * @param geoLocation The new value for geoLocation
   * @param type The new value for type
   * @param contacts The new value for contacts
   * @param orgId The new value for orgId
   * @param address The new value for address
   * @param updatedBy The new value for updatedBy
   */
  public OrgOffice(java.lang.String _id, com.fretron.Model.Location geoLocation, java.util.List<java.lang.String> type, java.util.List<com.fretron.Model.Contact> contacts, java.lang.String orgId, java.lang.String address, java.lang.String updatedBy) {
    this._id = _id;
    this.geoLocation = geoLocation;
    this.type = type;
    this.contacts = contacts;
    this.orgId = orgId;
    this.address = address;
    this.updatedBy = updatedBy;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _id;
    case 1: return geoLocation;
    case 2: return type;
    case 3: return contacts;
    case 4: return orgId;
    case 5: return address;
    case 6: return updatedBy;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _id = (java.lang.String)value$; break;
    case 1: geoLocation = (com.fretron.Model.Location)value$; break;
    case 2: type = (java.util.List<java.lang.String>)value$; break;
    case 3: contacts = (java.util.List<com.fretron.Model.Contact>)value$; break;
    case 4: orgId = (java.lang.String)value$; break;
    case 5: address = (java.lang.String)value$; break;
    case 6: updatedBy = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_id' field.
   * @return The value of the '_id' field.
   */
  public java.lang.String getId$1() {
    return _id;
  }

  /**
   * Sets the value of the '_id' field.
   * @param value the value to set.
   */
  public void setId$1(java.lang.String value) {
    this._id = value;
  }

  /**
   * Gets the value of the 'geoLocation' field.
   * @return The value of the 'geoLocation' field.
   */
  public com.fretron.Model.Location getGeoLocation() {
    return geoLocation;
  }

  /**
   * Sets the value of the 'geoLocation' field.
   * @param value the value to set.
   */
  public void setGeoLocation(com.fretron.Model.Location value) {
    this.geoLocation = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.util.List<java.lang.String> getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.util.List<java.lang.String> value) {
    this.type = value;
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
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.String value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'updatedBy' field.
   * @return The value of the 'updatedBy' field.
   */
  public java.lang.String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * Sets the value of the 'updatedBy' field.
   * @param value the value to set.
   */
  public void setUpdatedBy(java.lang.String value) {
    this.updatedBy = value;
  }

  /**
   * Creates a new OrgOffice RecordBuilder.
   * @return A new OrgOffice RecordBuilder
   */
  public static com.fretron.Model.OrgOffice.Builder newBuilder() {
    return new com.fretron.Model.OrgOffice.Builder();
  }

  /**
   * Creates a new OrgOffice RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrgOffice RecordBuilder
   */
  public static com.fretron.Model.OrgOffice.Builder newBuilder(com.fretron.Model.OrgOffice.Builder other) {
    return new com.fretron.Model.OrgOffice.Builder(other);
  }

  /**
   * Creates a new OrgOffice RecordBuilder by copying an existing OrgOffice instance.
   * @param other The existing instance to copy.
   * @return A new OrgOffice RecordBuilder
   */
  public static com.fretron.Model.OrgOffice.Builder newBuilder(com.fretron.Model.OrgOffice other) {
    return new com.fretron.Model.OrgOffice.Builder(other);
  }

  /**
   * RecordBuilder for OrgOffice instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrgOffice>
    implements org.apache.avro.data.RecordBuilder<OrgOffice> {

    private java.lang.String _id;
    private com.fretron.Model.Location geoLocation;
    private com.fretron.Model.Location.Builder geoLocationBuilder;
    private java.util.List<java.lang.String> type;
    private java.util.List<com.fretron.Model.Contact> contacts;
    private java.lang.String orgId;
    private java.lang.String address;
    private java.lang.String updatedBy;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.OrgOffice.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._id)) {
        this._id = data().deepCopy(fields()[0].schema(), other._id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.geoLocation)) {
        this.geoLocation = data().deepCopy(fields()[1].schema(), other.geoLocation);
        fieldSetFlags()[1] = true;
      }
      if (other.hasGeoLocationBuilder()) {
        this.geoLocationBuilder = com.fretron.Model.Location.newBuilder(other.getGeoLocationBuilder());
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contacts)) {
        this.contacts = data().deepCopy(fields()[3].schema(), other.contacts);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.orgId)) {
        this.orgId = data().deepCopy(fields()[4].schema(), other.orgId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.address)) {
        this.address = data().deepCopy(fields()[5].schema(), other.address);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.updatedBy)) {
        this.updatedBy = data().deepCopy(fields()[6].schema(), other.updatedBy);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing OrgOffice instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.OrgOffice other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other._id)) {
        this._id = data().deepCopy(fields()[0].schema(), other._id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.geoLocation)) {
        this.geoLocation = data().deepCopy(fields()[1].schema(), other.geoLocation);
        fieldSetFlags()[1] = true;
      }
      this.geoLocationBuilder = null;
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contacts)) {
        this.contacts = data().deepCopy(fields()[3].schema(), other.contacts);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.orgId)) {
        this.orgId = data().deepCopy(fields()[4].schema(), other.orgId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.address)) {
        this.address = data().deepCopy(fields()[5].schema(), other.address);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.updatedBy)) {
        this.updatedBy = data().deepCopy(fields()[6].schema(), other.updatedBy);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the '_id' field.
      * @return The value.
      */
    public java.lang.String getId$1() {
      return _id;
    }

    /**
      * Sets the value of the '_id' field.
      * @param value The value of '_id'.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder setId$1(java.lang.String value) {
      validate(fields()[0], value);
      this._id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the '_id' field has been set.
      * @return True if the '_id' field has been set, false otherwise.
      */
    public boolean hasId$1() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the '_id' field.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder clearId$1() {
      _id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'geoLocation' field.
      * @return The value.
      */
    public com.fretron.Model.Location getGeoLocation() {
      return geoLocation;
    }

    /**
      * Sets the value of the 'geoLocation' field.
      * @param value The value of 'geoLocation'.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder setGeoLocation(com.fretron.Model.Location value) {
      validate(fields()[1], value);
      this.geoLocationBuilder = null;
      this.geoLocation = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'geoLocation' field has been set.
      * @return True if the 'geoLocation' field has been set, false otherwise.
      */
    public boolean hasGeoLocation() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'geoLocation' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Location.Builder getGeoLocationBuilder() {
      if (geoLocationBuilder == null) {
        if (hasGeoLocation()) {
          setGeoLocationBuilder(com.fretron.Model.Location.newBuilder(geoLocation));
        } else {
          setGeoLocationBuilder(com.fretron.Model.Location.newBuilder());
        }
      }
      return geoLocationBuilder;
    }

    /**
     * Sets the Builder instance for the 'geoLocation' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.OrgOffice.Builder setGeoLocationBuilder(com.fretron.Model.Location.Builder value) {
      clearGeoLocation();
      geoLocationBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'geoLocation' field has an active Builder instance
     * @return True if the 'geoLocation' field has an active Builder instance
     */
    public boolean hasGeoLocationBuilder() {
      return geoLocationBuilder != null;
    }

    /**
      * Clears the value of the 'geoLocation' field.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder clearGeoLocation() {
      geoLocation = null;
      geoLocationBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder setType(java.util.List<java.lang.String> value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
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
    public com.fretron.Model.OrgOffice.Builder setContacts(java.util.List<com.fretron.Model.Contact> value) {
      validate(fields()[3], value);
      this.contacts = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'contacts' field has been set.
      * @return True if the 'contacts' field has been set, false otherwise.
      */
    public boolean hasContacts() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'contacts' field.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder clearContacts() {
      contacts = null;
      fieldSetFlags()[3] = false;
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
    public com.fretron.Model.OrgOffice.Builder setOrgId(java.lang.String value) {
      validate(fields()[4], value);
      this.orgId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'orgId' field has been set.
      * @return True if the 'orgId' field has been set, false otherwise.
      */
    public boolean hasOrgId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'orgId' field.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder clearOrgId() {
      orgId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.String getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder setAddress(java.lang.String value) {
      validate(fields()[5], value);
      this.address = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder clearAddress() {
      address = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'updatedBy' field.
      * @return The value.
      */
    public java.lang.String getUpdatedBy() {
      return updatedBy;
    }

    /**
      * Sets the value of the 'updatedBy' field.
      * @param value The value of 'updatedBy'.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder setUpdatedBy(java.lang.String value) {
      validate(fields()[6], value);
      this.updatedBy = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'updatedBy' field has been set.
      * @return True if the 'updatedBy' field has been set, false otherwise.
      */
    public boolean hasUpdatedBy() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'updatedBy' field.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder clearUpdatedBy() {
      updatedBy = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public OrgOffice build() {
      try {
        OrgOffice record = new OrgOffice();
        record._id = fieldSetFlags()[0] ? this._id : (java.lang.String) defaultValue(fields()[0]);
        if (geoLocationBuilder != null) {
          record.geoLocation = this.geoLocationBuilder.build();
        } else {
          record.geoLocation = fieldSetFlags()[1] ? this.geoLocation : (com.fretron.Model.Location) defaultValue(fields()[1]);
        }
        record.type = fieldSetFlags()[2] ? this.type : (java.util.List<java.lang.String>) defaultValue(fields()[2]);
        record.contacts = fieldSetFlags()[3] ? this.contacts : (java.util.List<com.fretron.Model.Contact>) defaultValue(fields()[3]);
        record.orgId = fieldSetFlags()[4] ? this.orgId : (java.lang.String) defaultValue(fields()[4]);
        record.address = fieldSetFlags()[5] ? this.address : (java.lang.String) defaultValue(fields()[5]);
        record.updatedBy = fieldSetFlags()[6] ? this.updatedBy : (java.lang.String) defaultValue(fields()[6]);
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
