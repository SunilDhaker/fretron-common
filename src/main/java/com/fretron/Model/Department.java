/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Department extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8681379210390802546L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Department\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updates\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Updates\",\"fields\":[{\"name\":\"forwardReasons\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"resourceType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resourceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sourceOfInformation\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updateType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"forwardedFrom\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String externalId;
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String orgId;
  @Deprecated public com.fretron.Model.Updates updates;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Department() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param externalId The new value for externalId
   * @param name The new value for name
   * @param orgId The new value for orgId
   * @param updates The new value for updates
   */
  public Department(java.lang.String uuid, java.lang.String externalId, java.lang.String name, java.lang.String orgId, com.fretron.Model.Updates updates) {
    this.uuid = uuid;
    this.externalId = externalId;
    this.name = name;
    this.orgId = orgId;
    this.updates = updates;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return externalId;
    case 2: return name;
    case 3: return orgId;
    case 4: return updates;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: externalId = (java.lang.String)value$; break;
    case 2: name = (java.lang.String)value$; break;
    case 3: orgId = (java.lang.String)value$; break;
    case 4: updates = (com.fretron.Model.Updates)value$; break;
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
   * Gets the value of the 'updates' field.
   * @return The value of the 'updates' field.
   */
  public com.fretron.Model.Updates getUpdates() {
    return updates;
  }

  /**
   * Sets the value of the 'updates' field.
   * @param value the value to set.
   */
  public void setUpdates(com.fretron.Model.Updates value) {
    this.updates = value;
  }

  /**
   * Creates a new Department RecordBuilder.
   * @return A new Department RecordBuilder
   */
  public static com.fretron.Model.Department.Builder newBuilder() {
    return new com.fretron.Model.Department.Builder();
  }

  /**
   * Creates a new Department RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Department RecordBuilder
   */
  public static com.fretron.Model.Department.Builder newBuilder(com.fretron.Model.Department.Builder other) {
    return new com.fretron.Model.Department.Builder(other);
  }

  /**
   * Creates a new Department RecordBuilder by copying an existing Department instance.
   * @param other The existing instance to copy.
   * @return A new Department RecordBuilder
   */
  public static com.fretron.Model.Department.Builder newBuilder(com.fretron.Model.Department other) {
    return new com.fretron.Model.Department.Builder(other);
  }

  /**
   * RecordBuilder for Department instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Department>
    implements org.apache.avro.data.RecordBuilder<Department> {

    private java.lang.String uuid;
    private java.lang.String externalId;
    private java.lang.String name;
    private java.lang.String orgId;
    private com.fretron.Model.Updates updates;
    private com.fretron.Model.Updates.Builder updatesBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Department.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.externalId)) {
        this.externalId = data().deepCopy(fields()[1].schema(), other.externalId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.orgId)) {
        this.orgId = data().deepCopy(fields()[3].schema(), other.orgId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.updates)) {
        this.updates = data().deepCopy(fields()[4].schema(), other.updates);
        fieldSetFlags()[4] = true;
      }
      if (other.hasUpdatesBuilder()) {
        this.updatesBuilder = com.fretron.Model.Updates.newBuilder(other.getUpdatesBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Department instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Department other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.externalId)) {
        this.externalId = data().deepCopy(fields()[1].schema(), other.externalId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.orgId)) {
        this.orgId = data().deepCopy(fields()[3].schema(), other.orgId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.updates)) {
        this.updates = data().deepCopy(fields()[4].schema(), other.updates);
        fieldSetFlags()[4] = true;
      }
      this.updatesBuilder = null;
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
    public com.fretron.Model.Department.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.Department.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
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
    public com.fretron.Model.Department.Builder setExternalId(java.lang.String value) {
      validate(fields()[1], value);
      this.externalId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'externalId' field has been set.
      * @return True if the 'externalId' field has been set, false otherwise.
      */
    public boolean hasExternalId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'externalId' field.
      * @return This builder.
      */
    public com.fretron.Model.Department.Builder clearExternalId() {
      externalId = null;
      fieldSetFlags()[1] = false;
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
    public com.fretron.Model.Department.Builder setName(java.lang.String value) {
      validate(fields()[2], value);
      this.name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.fretron.Model.Department.Builder clearName() {
      name = null;
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
    public com.fretron.Model.Department.Builder setOrgId(java.lang.String value) {
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
    public com.fretron.Model.Department.Builder clearOrgId() {
      orgId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'updates' field.
      * @return The value.
      */
    public com.fretron.Model.Updates getUpdates() {
      return updates;
    }

    /**
      * Sets the value of the 'updates' field.
      * @param value The value of 'updates'.
      * @return This builder.
      */
    public com.fretron.Model.Department.Builder setUpdates(com.fretron.Model.Updates value) {
      validate(fields()[4], value);
      this.updatesBuilder = null;
      this.updates = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'updates' field has been set.
      * @return True if the 'updates' field has been set, false otherwise.
      */
    public boolean hasUpdates() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'updates' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Updates.Builder getUpdatesBuilder() {
      if (updatesBuilder == null) {
        if (hasUpdates()) {
          setUpdatesBuilder(com.fretron.Model.Updates.newBuilder(updates));
        } else {
          setUpdatesBuilder(com.fretron.Model.Updates.newBuilder());
        }
      }
      return updatesBuilder;
    }

    /**
     * Sets the Builder instance for the 'updates' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.Department.Builder setUpdatesBuilder(com.fretron.Model.Updates.Builder value) {
      clearUpdates();
      updatesBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'updates' field has an active Builder instance
     * @return True if the 'updates' field has an active Builder instance
     */
    public boolean hasUpdatesBuilder() {
      return updatesBuilder != null;
    }

    /**
      * Clears the value of the 'updates' field.
      * @return This builder.
      */
    public com.fretron.Model.Department.Builder clearUpdates() {
      updates = null;
      updatesBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Department build() {
      try {
        Department record = new Department();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.externalId = fieldSetFlags()[1] ? this.externalId : (java.lang.String) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.orgId = fieldSetFlags()[3] ? this.orgId : (java.lang.String) defaultValue(fields()[3]);
        if (updatesBuilder != null) {
          record.updates = this.updatesBuilder.build();
        } else {
          record.updates = fieldSetFlags()[4] ? this.updates : (com.fretron.Model.Updates) defaultValue(fields()[4]);
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