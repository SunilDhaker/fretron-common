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
  private static final long serialVersionUID = -899318790461114652L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrgOffice\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"geoLocation\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"contacts\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Contact\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"mobileNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"emails\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"mobileNumbers\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String _id;
  @Deprecated public java.util.List<java.lang.Double> geoLocation;
  @Deprecated public java.util.List<java.lang.String> type;
  @Deprecated public java.util.List<com.fretron.Model.Contact> contacts;
  @Deprecated public java.lang.String orgId;
  @Deprecated public java.lang.String address;
  @Deprecated public java.lang.String updatedBy;
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String externalId;

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
   * @param name The new value for name
   * @param externalId The new value for externalId
   */
  public OrgOffice(java.lang.String _id, java.util.List<java.lang.Double> geoLocation, java.util.List<java.lang.String> type, java.util.List<com.fretron.Model.Contact> contacts, java.lang.String orgId, java.lang.String address, java.lang.String updatedBy, java.lang.String name, java.lang.String externalId) {
    this._id = _id;
    this.geoLocation = geoLocation;
    this.type = type;
    this.contacts = contacts;
    this.orgId = orgId;
    this.address = address;
    this.updatedBy = updatedBy;
    this.name = name;
    this.externalId = externalId;
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
    case 7: return name;
    case 8: return externalId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _id = (java.lang.String)value$; break;
    case 1: geoLocation = (java.util.List<java.lang.Double>)value$; break;
    case 2: type = (java.util.List<java.lang.String>)value$; break;
    case 3: contacts = (java.util.List<com.fretron.Model.Contact>)value$; break;
    case 4: orgId = (java.lang.String)value$; break;
    case 5: address = (java.lang.String)value$; break;
    case 6: updatedBy = (java.lang.String)value$; break;
    case 7: name = (java.lang.String)value$; break;
    case 8: externalId = (java.lang.String)value$; break;
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
  public java.util.List<java.lang.Double> getGeoLocation() {
    return geoLocation;
  }

  /**
   * Sets the value of the 'geoLocation' field.
   * @param value the value to set.
   */
  public void setGeoLocation(java.util.List<java.lang.Double> value) {
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
   * Gets the value of the 'externalId' field.
   * @return The value of the 'externalId' field.
   */
  public java.lang.String getExternalId() {
    return externalId;
  }

  /**
   * Sets the value of the 'externalId' field.
   * @param value the value to set.
   */
  public void setExternalId(java.lang.String value) {
    this.externalId = value;
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
    private java.util.List<java.lang.Double> geoLocation;
    private java.util.List<java.lang.String> type;
    private java.util.List<com.fretron.Model.Contact> contacts;
    private java.lang.String orgId;
    private java.lang.String address;
    private java.lang.String updatedBy;
    private java.lang.String name;
    private java.lang.String externalId;

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
      if (isValidValue(fields()[7], other.name)) {
        this.name = data().deepCopy(fields()[7].schema(), other.name);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.externalId)) {
        this.externalId = data().deepCopy(fields()[8].schema(), other.externalId);
        fieldSetFlags()[8] = true;
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
      if (isValidValue(fields()[7], other.name)) {
        this.name = data().deepCopy(fields()[7].schema(), other.name);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.externalId)) {
        this.externalId = data().deepCopy(fields()[8].schema(), other.externalId);
        fieldSetFlags()[8] = true;
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
    public java.util.List<java.lang.Double> getGeoLocation() {
      return geoLocation;
    }

    /**
      * Sets the value of the 'geoLocation' field.
      * @param value The value of 'geoLocation'.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder setGeoLocation(java.util.List<java.lang.Double> value) {
      validate(fields()[1], value);
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
      * Clears the value of the 'geoLocation' field.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder clearGeoLocation() {
      geoLocation = null;
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
    public com.fretron.Model.OrgOffice.Builder setName(java.lang.String value) {
      validate(fields()[7], value);
      this.name = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder clearName() {
      name = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'externalId' field.
      * @return The value.
      */
    public java.lang.String getExternalId() {
      return externalId;
    }

    /**
      * Sets the value of the 'externalId' field.
      * @param value The value of 'externalId'.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder setExternalId(java.lang.String value) {
      validate(fields()[8], value);
      this.externalId = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'externalId' field has been set.
      * @return True if the 'externalId' field has been set, false otherwise.
      */
    public boolean hasExternalId() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'externalId' field.
      * @return This builder.
      */
    public com.fretron.Model.OrgOffice.Builder clearExternalId() {
      externalId = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public OrgOffice build() {
      try {
        OrgOffice record = new OrgOffice();
        record._id = fieldSetFlags()[0] ? this._id : (java.lang.String) defaultValue(fields()[0]);
        record.geoLocation = fieldSetFlags()[1] ? this.geoLocation : (java.util.List<java.lang.Double>) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.util.List<java.lang.String>) defaultValue(fields()[2]);
        record.contacts = fieldSetFlags()[3] ? this.contacts : (java.util.List<com.fretron.Model.Contact>) defaultValue(fields()[3]);
        record.orgId = fieldSetFlags()[4] ? this.orgId : (java.lang.String) defaultValue(fields()[4]);
        record.address = fieldSetFlags()[5] ? this.address : (java.lang.String) defaultValue(fields()[5]);
        record.updatedBy = fieldSetFlags()[6] ? this.updatedBy : (java.lang.String) defaultValue(fields()[6]);
        record.name = fieldSetFlags()[7] ? this.name : (java.lang.String) defaultValue(fields()[7]);
        record.externalId = fieldSetFlags()[8] ? this.externalId : (java.lang.String) defaultValue(fields()[8]);
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
