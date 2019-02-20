/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserOrgACL extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1245611337967296715L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserOrgACL\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"orgUuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userUuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"email\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"mobileNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"accessLevel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"relationType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"role\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Role\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"permissions\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DomainPermission\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"entity\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String orgUuid;
  @Deprecated public java.lang.String userUuid;
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String email;
  @Deprecated public java.lang.String mobileNumber;
  @Deprecated public java.lang.String accessLevel;
  @Deprecated public java.lang.String relationType;
  @Deprecated public com.fretron.Model.Role role;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserOrgACL() {}

  /**
   * All-args constructor.
   * @param orgUuid The new value for orgUuid
   * @param userUuid The new value for userUuid
   * @param name The new value for name
   * @param email The new value for email
   * @param mobileNumber The new value for mobileNumber
   * @param accessLevel The new value for accessLevel
   * @param relationType The new value for relationType
   * @param role The new value for role
   */
  public UserOrgACL(java.lang.String orgUuid, java.lang.String userUuid, java.lang.String name, java.lang.String email, java.lang.String mobileNumber, java.lang.String accessLevel, java.lang.String relationType, com.fretron.Model.Role role) {
    this.orgUuid = orgUuid;
    this.userUuid = userUuid;
    this.name = name;
    this.email = email;
    this.mobileNumber = mobileNumber;
    this.accessLevel = accessLevel;
    this.relationType = relationType;
    this.role = role;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return orgUuid;
    case 1: return userUuid;
    case 2: return name;
    case 3: return email;
    case 4: return mobileNumber;
    case 5: return accessLevel;
    case 6: return relationType;
    case 7: return role;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: orgUuid = (java.lang.String)value$; break;
    case 1: userUuid = (java.lang.String)value$; break;
    case 2: name = (java.lang.String)value$; break;
    case 3: email = (java.lang.String)value$; break;
    case 4: mobileNumber = (java.lang.String)value$; break;
    case 5: accessLevel = (java.lang.String)value$; break;
    case 6: relationType = (java.lang.String)value$; break;
    case 7: role = (com.fretron.Model.Role)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'orgUuid' field.
   * @return The value of the 'orgUuid' field.
   */
  public java.lang.String getOrgUuid() {
    return orgUuid;
  }

  /**
   * Sets the value of the 'orgUuid' field.
   * @param value the value to set.
   */
  public void setOrgUuid(java.lang.String value) {
    this.orgUuid = value;
  }

  /**
   * Gets the value of the 'userUuid' field.
   * @return The value of the 'userUuid' field.
   */
  public java.lang.String getUserUuid() {
    return userUuid;
  }

  /**
   * Sets the value of the 'userUuid' field.
   * @param value the value to set.
   */
  public void setUserUuid(java.lang.String value) {
    this.userUuid = value;
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
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.String value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'mobileNumber' field.
   * @return The value of the 'mobileNumber' field.
   */
  public java.lang.String getMobileNumber() {
    return mobileNumber;
  }

  /**
   * Sets the value of the 'mobileNumber' field.
   * @param value the value to set.
   */
  public void setMobileNumber(java.lang.String value) {
    this.mobileNumber = value;
  }

  /**
   * Gets the value of the 'accessLevel' field.
   * @return The value of the 'accessLevel' field.
   */
  public java.lang.String getAccessLevel() {
    return accessLevel;
  }

  /**
   * Sets the value of the 'accessLevel' field.
   * @param value the value to set.
   */
  public void setAccessLevel(java.lang.String value) {
    this.accessLevel = value;
  }

  /**
   * Gets the value of the 'relationType' field.
   * @return The value of the 'relationType' field.
   */
  public java.lang.String getRelationType() {
    return relationType;
  }

  /**
   * Sets the value of the 'relationType' field.
   * @param value the value to set.
   */
  public void setRelationType(java.lang.String value) {
    this.relationType = value;
  }

  /**
   * Gets the value of the 'role' field.
   * @return The value of the 'role' field.
   */
  public com.fretron.Model.Role getRole() {
    return role;
  }

  /**
   * Sets the value of the 'role' field.
   * @param value the value to set.
   */
  public void setRole(com.fretron.Model.Role value) {
    this.role = value;
  }

  /**
   * Creates a new UserOrgACL RecordBuilder.
   * @return A new UserOrgACL RecordBuilder
   */
  public static com.fretron.Model.UserOrgACL.Builder newBuilder() {
    return new com.fretron.Model.UserOrgACL.Builder();
  }

  /**
   * Creates a new UserOrgACL RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserOrgACL RecordBuilder
   */
  public static com.fretron.Model.UserOrgACL.Builder newBuilder(com.fretron.Model.UserOrgACL.Builder other) {
    return new com.fretron.Model.UserOrgACL.Builder(other);
  }

  /**
   * Creates a new UserOrgACL RecordBuilder by copying an existing UserOrgACL instance.
   * @param other The existing instance to copy.
   * @return A new UserOrgACL RecordBuilder
   */
  public static com.fretron.Model.UserOrgACL.Builder newBuilder(com.fretron.Model.UserOrgACL other) {
    return new com.fretron.Model.UserOrgACL.Builder(other);
  }

  /**
   * RecordBuilder for UserOrgACL instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserOrgACL>
    implements org.apache.avro.data.RecordBuilder<UserOrgACL> {

    private java.lang.String orgUuid;
    private java.lang.String userUuid;
    private java.lang.String name;
    private java.lang.String email;
    private java.lang.String mobileNumber;
    private java.lang.String accessLevel;
    private java.lang.String relationType;
    private com.fretron.Model.Role role;
    private com.fretron.Model.Role.Builder roleBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.UserOrgACL.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.orgUuid)) {
        this.orgUuid = data().deepCopy(fields()[0].schema(), other.orgUuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userUuid)) {
        this.userUuid = data().deepCopy(fields()[1].schema(), other.userUuid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.email)) {
        this.email = data().deepCopy(fields()[3].schema(), other.email);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.mobileNumber)) {
        this.mobileNumber = data().deepCopy(fields()[4].schema(), other.mobileNumber);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.accessLevel)) {
        this.accessLevel = data().deepCopy(fields()[5].schema(), other.accessLevel);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.relationType)) {
        this.relationType = data().deepCopy(fields()[6].schema(), other.relationType);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.role)) {
        this.role = data().deepCopy(fields()[7].schema(), other.role);
        fieldSetFlags()[7] = true;
      }
      if (other.hasRoleBuilder()) {
        this.roleBuilder = com.fretron.Model.Role.newBuilder(other.getRoleBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing UserOrgACL instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.UserOrgACL other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.orgUuid)) {
        this.orgUuid = data().deepCopy(fields()[0].schema(), other.orgUuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userUuid)) {
        this.userUuid = data().deepCopy(fields()[1].schema(), other.userUuid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.email)) {
        this.email = data().deepCopy(fields()[3].schema(), other.email);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.mobileNumber)) {
        this.mobileNumber = data().deepCopy(fields()[4].schema(), other.mobileNumber);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.accessLevel)) {
        this.accessLevel = data().deepCopy(fields()[5].schema(), other.accessLevel);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.relationType)) {
        this.relationType = data().deepCopy(fields()[6].schema(), other.relationType);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.role)) {
        this.role = data().deepCopy(fields()[7].schema(), other.role);
        fieldSetFlags()[7] = true;
      }
      this.roleBuilder = null;
    }

    /**
      * Gets the value of the 'orgUuid' field.
      * @return The value.
      */
    public java.lang.String getOrgUuid() {
      return orgUuid;
    }

    /**
      * Sets the value of the 'orgUuid' field.
      * @param value The value of 'orgUuid'.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder setOrgUuid(java.lang.String value) {
      validate(fields()[0], value);
      this.orgUuid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'orgUuid' field has been set.
      * @return True if the 'orgUuid' field has been set, false otherwise.
      */
    public boolean hasOrgUuid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'orgUuid' field.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder clearOrgUuid() {
      orgUuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userUuid' field.
      * @return The value.
      */
    public java.lang.String getUserUuid() {
      return userUuid;
    }

    /**
      * Sets the value of the 'userUuid' field.
      * @param value The value of 'userUuid'.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder setUserUuid(java.lang.String value) {
      validate(fields()[1], value);
      this.userUuid = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userUuid' field has been set.
      * @return True if the 'userUuid' field has been set, false otherwise.
      */
    public boolean hasUserUuid() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userUuid' field.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder clearUserUuid() {
      userUuid = null;
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
    public com.fretron.Model.UserOrgACL.Builder setName(java.lang.String value) {
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
    public com.fretron.Model.UserOrgACL.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.String getEmail() {
      return email;
    }

    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder setEmail(java.lang.String value) {
      validate(fields()[3], value);
      this.email = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder clearEmail() {
      email = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'mobileNumber' field.
      * @return The value.
      */
    public java.lang.String getMobileNumber() {
      return mobileNumber;
    }

    /**
      * Sets the value of the 'mobileNumber' field.
      * @param value The value of 'mobileNumber'.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder setMobileNumber(java.lang.String value) {
      validate(fields()[4], value);
      this.mobileNumber = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'mobileNumber' field has been set.
      * @return True if the 'mobileNumber' field has been set, false otherwise.
      */
    public boolean hasMobileNumber() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'mobileNumber' field.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder clearMobileNumber() {
      mobileNumber = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'accessLevel' field.
      * @return The value.
      */
    public java.lang.String getAccessLevel() {
      return accessLevel;
    }

    /**
      * Sets the value of the 'accessLevel' field.
      * @param value The value of 'accessLevel'.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder setAccessLevel(java.lang.String value) {
      validate(fields()[5], value);
      this.accessLevel = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'accessLevel' field has been set.
      * @return True if the 'accessLevel' field has been set, false otherwise.
      */
    public boolean hasAccessLevel() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'accessLevel' field.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder clearAccessLevel() {
      accessLevel = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'relationType' field.
      * @return The value.
      */
    public java.lang.String getRelationType() {
      return relationType;
    }

    /**
      * Sets the value of the 'relationType' field.
      * @param value The value of 'relationType'.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder setRelationType(java.lang.String value) {
      validate(fields()[6], value);
      this.relationType = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'relationType' field has been set.
      * @return True if the 'relationType' field has been set, false otherwise.
      */
    public boolean hasRelationType() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'relationType' field.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder clearRelationType() {
      relationType = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'role' field.
      * @return The value.
      */
    public com.fretron.Model.Role getRole() {
      return role;
    }

    /**
      * Sets the value of the 'role' field.
      * @param value The value of 'role'.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder setRole(com.fretron.Model.Role value) {
      validate(fields()[7], value);
      this.roleBuilder = null;
      this.role = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'role' field has been set.
      * @return True if the 'role' field has been set, false otherwise.
      */
    public boolean hasRole() {
      return fieldSetFlags()[7];
    }

    /**
     * Gets the Builder instance for the 'role' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Role.Builder getRoleBuilder() {
      if (roleBuilder == null) {
        if (hasRole()) {
          setRoleBuilder(com.fretron.Model.Role.newBuilder(role));
        } else {
          setRoleBuilder(com.fretron.Model.Role.newBuilder());
        }
      }
      return roleBuilder;
    }

    /**
     * Sets the Builder instance for the 'role' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.UserOrgACL.Builder setRoleBuilder(com.fretron.Model.Role.Builder value) {
      clearRole();
      roleBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'role' field has an active Builder instance
     * @return True if the 'role' field has an active Builder instance
     */
    public boolean hasRoleBuilder() {
      return roleBuilder != null;
    }

    /**
      * Clears the value of the 'role' field.
      * @return This builder.
      */
    public com.fretron.Model.UserOrgACL.Builder clearRole() {
      role = null;
      roleBuilder = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public UserOrgACL build() {
      try {
        UserOrgACL record = new UserOrgACL();
        record.orgUuid = fieldSetFlags()[0] ? this.orgUuid : (java.lang.String) defaultValue(fields()[0]);
        record.userUuid = fieldSetFlags()[1] ? this.userUuid : (java.lang.String) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.email = fieldSetFlags()[3] ? this.email : (java.lang.String) defaultValue(fields()[3]);
        record.mobileNumber = fieldSetFlags()[4] ? this.mobileNumber : (java.lang.String) defaultValue(fields()[4]);
        record.accessLevel = fieldSetFlags()[5] ? this.accessLevel : (java.lang.String) defaultValue(fields()[5]);
        record.relationType = fieldSetFlags()[6] ? this.relationType : (java.lang.String) defaultValue(fields()[6]);
        if (roleBuilder != null) {
          record.role = this.roleBuilder.build();
        } else {
          record.role = fieldSetFlags()[7] ? this.role : (com.fretron.Model.Role) defaultValue(fields()[7]);
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
