/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Role extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5110256447059453929L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Role\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"permissions\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DomainPermission\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"entity\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"canView\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"canEdit\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"canDelete\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"filteredDataAccess\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"filters\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"morePermissions\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String orgId;
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String description;
  @Deprecated public java.lang.Double version;
  @Deprecated public java.util.List<com.fretron.Model.DomainPermission> permissions;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Role() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param orgId The new value for orgId
   * @param name The new value for name
   * @param description The new value for description
   * @param version The new value for version
   * @param permissions The new value for permissions
   */
  public Role(java.lang.String uuid, java.lang.String orgId, java.lang.String name, java.lang.String description, java.lang.Double version, java.util.List<com.fretron.Model.DomainPermission> permissions) {
    this.uuid = uuid;
    this.orgId = orgId;
    this.name = name;
    this.description = description;
    this.version = version;
    this.permissions = permissions;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return orgId;
    case 2: return name;
    case 3: return description;
    case 4: return version;
    case 5: return permissions;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: orgId = (java.lang.String)value$; break;
    case 2: name = (java.lang.String)value$; break;
    case 3: description = (java.lang.String)value$; break;
    case 4: version = (java.lang.Double)value$; break;
    case 5: permissions = (java.util.List<com.fretron.Model.DomainPermission>)value$; break;
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
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public java.lang.Double getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.Double value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'permissions' field.
   * @return The value of the 'permissions' field.
   */
  public java.util.List<com.fretron.Model.DomainPermission> getPermissions() {
    return permissions;
  }

  /**
   * Sets the value of the 'permissions' field.
   * @param value the value to set.
   */
  public void setPermissions(java.util.List<com.fretron.Model.DomainPermission> value) {
    this.permissions = value;
  }

  /**
   * Creates a new Role RecordBuilder.
   * @return A new Role RecordBuilder
   */
  public static com.fretron.Model.Role.Builder newBuilder() {
    return new com.fretron.Model.Role.Builder();
  }

  /**
   * Creates a new Role RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Role RecordBuilder
   */
  public static com.fretron.Model.Role.Builder newBuilder(com.fretron.Model.Role.Builder other) {
    return new com.fretron.Model.Role.Builder(other);
  }

  /**
   * Creates a new Role RecordBuilder by copying an existing Role instance.
   * @param other The existing instance to copy.
   * @return A new Role RecordBuilder
   */
  public static com.fretron.Model.Role.Builder newBuilder(com.fretron.Model.Role other) {
    return new com.fretron.Model.Role.Builder(other);
  }

  /**
   * RecordBuilder for Role instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Role>
    implements org.apache.avro.data.RecordBuilder<Role> {

    private java.lang.String uuid;
    private java.lang.String orgId;
    private java.lang.String name;
    private java.lang.String description;
    private java.lang.Double version;
    private java.util.List<com.fretron.Model.DomainPermission> permissions;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Role.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orgId)) {
        this.orgId = data().deepCopy(fields()[1].schema(), other.orgId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.version)) {
        this.version = data().deepCopy(fields()[4].schema(), other.version);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.permissions)) {
        this.permissions = data().deepCopy(fields()[5].schema(), other.permissions);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Role instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Role other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orgId)) {
        this.orgId = data().deepCopy(fields()[1].schema(), other.orgId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.version)) {
        this.version = data().deepCopy(fields()[4].schema(), other.version);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.permissions)) {
        this.permissions = data().deepCopy(fields()[5].schema(), other.permissions);
        fieldSetFlags()[5] = true;
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
    public com.fretron.Model.Role.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.Role.Builder clearUuid() {
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
    public com.fretron.Model.Role.Builder setOrgId(java.lang.String value) {
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
    public com.fretron.Model.Role.Builder clearOrgId() {
      orgId = null;
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
    public com.fretron.Model.Role.Builder setName(java.lang.String value) {
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
    public com.fretron.Model.Role.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.String getDescription() {
      return description;
    }

    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public com.fretron.Model.Role.Builder setDescription(java.lang.String value) {
      validate(fields()[3], value);
      this.description = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public com.fretron.Model.Role.Builder clearDescription() {
      description = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public java.lang.Double getVersion() {
      return version;
    }

    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public com.fretron.Model.Role.Builder setVersion(java.lang.Double value) {
      validate(fields()[4], value);
      this.version = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public com.fretron.Model.Role.Builder clearVersion() {
      version = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'permissions' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.DomainPermission> getPermissions() {
      return permissions;
    }

    /**
      * Sets the value of the 'permissions' field.
      * @param value The value of 'permissions'.
      * @return This builder.
      */
    public com.fretron.Model.Role.Builder setPermissions(java.util.List<com.fretron.Model.DomainPermission> value) {
      validate(fields()[5], value);
      this.permissions = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'permissions' field has been set.
      * @return True if the 'permissions' field has been set, false otherwise.
      */
    public boolean hasPermissions() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'permissions' field.
      * @return This builder.
      */
    public com.fretron.Model.Role.Builder clearPermissions() {
      permissions = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Role build() {
      try {
        Role record = new Role();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.orgId = fieldSetFlags()[1] ? this.orgId : (java.lang.String) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.description = fieldSetFlags()[3] ? this.description : (java.lang.String) defaultValue(fields()[3]);
        record.version = fieldSetFlags()[4] ? this.version : (java.lang.Double) defaultValue(fields()[4]);
        record.permissions = fieldSetFlags()[5] ? this.permissions : (java.util.List<com.fretron.Model.DomainPermission>) defaultValue(fields()[5]);
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
