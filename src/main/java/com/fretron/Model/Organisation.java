/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Organisation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6367512182619566269L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Organisation\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"organisationName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"OrganisationType\",\"symbols\":[\"FLEET_OWNER\",\"TRANSPORTER\",\"FLEET_OWNER_AGENT\"]}},{\"name\":\"addedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String orgId;
  @Deprecated public java.lang.String organisationName;
  @Deprecated public com.fretron.Model.OrganisationType type;
  @Deprecated public java.lang.String addedBy;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Organisation() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param orgId The new value for orgId
   * @param organisationName The new value for organisationName
   * @param type The new value for type
   * @param addedBy The new value for addedBy
   */
  public Organisation(java.lang.String uuid, java.lang.String orgId, java.lang.String organisationName, com.fretron.Model.OrganisationType type, java.lang.String addedBy) {
    this.uuid = uuid;
    this.orgId = orgId;
    this.organisationName = organisationName;
    this.type = type;
    this.addedBy = addedBy;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return orgId;
    case 2: return organisationName;
    case 3: return type;
    case 4: return addedBy;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: orgId = (java.lang.String)value$; break;
    case 2: organisationName = (java.lang.String)value$; break;
    case 3: type = (com.fretron.Model.OrganisationType)value$; break;
    case 4: addedBy = (java.lang.String)value$; break;
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
   * Gets the value of the 'organisationName' field.
   * @return The value of the 'organisationName' field.
   */
  public java.lang.String getOrganisationName() {
    return organisationName;
  }

  /**
   * Sets the value of the 'organisationName' field.
   * @param value the value to set.
   */
  public void setOrganisationName(java.lang.String value) {
    this.organisationName = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public com.fretron.Model.OrganisationType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(com.fretron.Model.OrganisationType value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'addedBy' field.
   * @return The value of the 'addedBy' field.
   */
  public java.lang.String getAddedBy() {
    return addedBy;
  }

  /**
   * Sets the value of the 'addedBy' field.
   * @param value the value to set.
   */
  public void setAddedBy(java.lang.String value) {
    this.addedBy = value;
  }

  /**
   * Creates a new Organisation RecordBuilder.
   * @return A new Organisation RecordBuilder
   */
  public static com.fretron.Model.Organisation.Builder newBuilder() {
    return new com.fretron.Model.Organisation.Builder();
  }

  /**
   * Creates a new Organisation RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Organisation RecordBuilder
   */
  public static com.fretron.Model.Organisation.Builder newBuilder(com.fretron.Model.Organisation.Builder other) {
    return new com.fretron.Model.Organisation.Builder(other);
  }

  /**
   * Creates a new Organisation RecordBuilder by copying an existing Organisation instance.
   * @param other The existing instance to copy.
   * @return A new Organisation RecordBuilder
   */
  public static com.fretron.Model.Organisation.Builder newBuilder(com.fretron.Model.Organisation other) {
    return new com.fretron.Model.Organisation.Builder(other);
  }

  /**
   * RecordBuilder for Organisation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Organisation>
    implements org.apache.avro.data.RecordBuilder<Organisation> {

    private java.lang.String uuid;
    private java.lang.String orgId;
    private java.lang.String organisationName;
    private com.fretron.Model.OrganisationType type;
    private java.lang.String addedBy;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Organisation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orgId)) {
        this.orgId = data().deepCopy(fields()[1].schema(), other.orgId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.organisationName)) {
        this.organisationName = data().deepCopy(fields()[2].schema(), other.organisationName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.addedBy)) {
        this.addedBy = data().deepCopy(fields()[4].schema(), other.addedBy);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Organisation instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Organisation other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orgId)) {
        this.orgId = data().deepCopy(fields()[1].schema(), other.orgId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.organisationName)) {
        this.organisationName = data().deepCopy(fields()[2].schema(), other.organisationName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.addedBy)) {
        this.addedBy = data().deepCopy(fields()[4].schema(), other.addedBy);
        fieldSetFlags()[4] = true;
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
    public com.fretron.Model.Organisation.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.Organisation.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
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
    public com.fretron.Model.Organisation.Builder setOrgId(java.lang.String value) {
      validate(fields()[1], value);
      this.orgId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'orgId' field has been set.
      * @return True if the 'orgId' field has been set, false otherwise.
      */
    public boolean hasOrgId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'orgId' field.
      * @return This builder.
      */
    public com.fretron.Model.Organisation.Builder clearOrgId() {
      orgId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'organisationName' field.
      * @return The value.
      */
    public java.lang.String getOrganisationName() {
      return organisationName;
    }

    /**
      * Sets the value of the 'organisationName' field.
      * @param value The value of 'organisationName'.
      * @return This builder.
      */
    public com.fretron.Model.Organisation.Builder setOrganisationName(java.lang.String value) {
      validate(fields()[2], value);
      this.organisationName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'organisationName' field has been set.
      * @return True if the 'organisationName' field has been set, false otherwise.
      */
    public boolean hasOrganisationName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'organisationName' field.
      * @return This builder.
      */
    public com.fretron.Model.Organisation.Builder clearOrganisationName() {
      organisationName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public com.fretron.Model.OrganisationType getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.fretron.Model.Organisation.Builder setType(com.fretron.Model.OrganisationType value) {
      validate(fields()[3], value);
      this.type = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.fretron.Model.Organisation.Builder clearType() {
      type = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'addedBy' field.
      * @return The value.
      */
    public java.lang.String getAddedBy() {
      return addedBy;
    }

    /**
      * Sets the value of the 'addedBy' field.
      * @param value The value of 'addedBy'.
      * @return This builder.
      */
    public com.fretron.Model.Organisation.Builder setAddedBy(java.lang.String value) {
      validate(fields()[4], value);
      this.addedBy = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'addedBy' field has been set.
      * @return True if the 'addedBy' field has been set, false otherwise.
      */
    public boolean hasAddedBy() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'addedBy' field.
      * @return This builder.
      */
    public com.fretron.Model.Organisation.Builder clearAddedBy() {
      addedBy = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Organisation build() {
      try {
        Organisation record = new Organisation();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.orgId = fieldSetFlags()[1] ? this.orgId : (java.lang.String) defaultValue(fields()[1]);
        record.organisationName = fieldSetFlags()[2] ? this.organisationName : (java.lang.String) defaultValue(fields()[2]);
        record.type = fieldSetFlags()[3] ? this.type : (com.fretron.Model.OrganisationType) defaultValue(fields()[3]);
        record.addedBy = fieldSetFlags()[4] ? this.addedBy : (java.lang.String) defaultValue(fields()[4]);
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
