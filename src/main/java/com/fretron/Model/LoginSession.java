/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LoginSession extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7548249217491002032L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LoginSession\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"token\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userAgent\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isValid\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"createdAt\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"lastUsed\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"updatedOn\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"location\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"parentOrgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"pushToken\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"pushTokenService\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"app\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String userId;
  @Deprecated public java.lang.String token;
  @Deprecated public java.lang.String userAgent;
  @Deprecated public java.lang.Boolean isValid;
  @Deprecated public java.lang.Long createdAt;
  @Deprecated public java.lang.Long lastUsed;
  @Deprecated public java.lang.Long updatedOn;
  @Deprecated public java.lang.String location;
  @Deprecated public java.lang.String orgId;
  @Deprecated public java.lang.String parentOrgId;
  @Deprecated public java.lang.String pushToken;
  @Deprecated public java.lang.String pushTokenService;
  @Deprecated public java.lang.String app;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LoginSession() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param userId The new value for userId
   * @param token The new value for token
   * @param userAgent The new value for userAgent
   * @param isValid The new value for isValid
   * @param createdAt The new value for createdAt
   * @param lastUsed The new value for lastUsed
   * @param updatedOn The new value for updatedOn
   * @param location The new value for location
   * @param orgId The new value for orgId
   * @param parentOrgId The new value for parentOrgId
   * @param pushToken The new value for pushToken
   * @param pushTokenService The new value for pushTokenService
   * @param app The new value for app
   */
  public LoginSession(java.lang.String uuid, java.lang.String userId, java.lang.String token, java.lang.String userAgent, java.lang.Boolean isValid, java.lang.Long createdAt, java.lang.Long lastUsed, java.lang.Long updatedOn, java.lang.String location, java.lang.String orgId, java.lang.String parentOrgId, java.lang.String pushToken, java.lang.String pushTokenService, java.lang.String app) {
    this.uuid = uuid;
    this.userId = userId;
    this.token = token;
    this.userAgent = userAgent;
    this.isValid = isValid;
    this.createdAt = createdAt;
    this.lastUsed = lastUsed;
    this.updatedOn = updatedOn;
    this.location = location;
    this.orgId = orgId;
    this.parentOrgId = parentOrgId;
    this.pushToken = pushToken;
    this.pushTokenService = pushTokenService;
    this.app = app;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return userId;
    case 2: return token;
    case 3: return userAgent;
    case 4: return isValid;
    case 5: return createdAt;
    case 6: return lastUsed;
    case 7: return updatedOn;
    case 8: return location;
    case 9: return orgId;
    case 10: return parentOrgId;
    case 11: return pushToken;
    case 12: return pushTokenService;
    case 13: return app;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: userId = (java.lang.String)value$; break;
    case 2: token = (java.lang.String)value$; break;
    case 3: userAgent = (java.lang.String)value$; break;
    case 4: isValid = (java.lang.Boolean)value$; break;
    case 5: createdAt = (java.lang.Long)value$; break;
    case 6: lastUsed = (java.lang.Long)value$; break;
    case 7: updatedOn = (java.lang.Long)value$; break;
    case 8: location = (java.lang.String)value$; break;
    case 9: orgId = (java.lang.String)value$; break;
    case 10: parentOrgId = (java.lang.String)value$; break;
    case 11: pushToken = (java.lang.String)value$; break;
    case 12: pushTokenService = (java.lang.String)value$; break;
    case 13: app = (java.lang.String)value$; break;
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
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.String value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'token' field.
   * @return The value of the 'token' field.
   */
  public java.lang.String getToken() {
    return token;
  }

  /**
   * Sets the value of the 'token' field.
   * @param value the value to set.
   */
  public void setToken(java.lang.String value) {
    this.token = value;
  }

  /**
   * Gets the value of the 'userAgent' field.
   * @return The value of the 'userAgent' field.
   */
  public java.lang.String getUserAgent() {
    return userAgent;
  }

  /**
   * Sets the value of the 'userAgent' field.
   * @param value the value to set.
   */
  public void setUserAgent(java.lang.String value) {
    this.userAgent = value;
  }

  /**
   * Gets the value of the 'isValid' field.
   * @return The value of the 'isValid' field.
   */
  public java.lang.Boolean getIsValid() {
    return isValid;
  }

  /**
   * Sets the value of the 'isValid' field.
   * @param value the value to set.
   */
  public void setIsValid(java.lang.Boolean value) {
    this.isValid = value;
  }

  /**
   * Gets the value of the 'createdAt' field.
   * @return The value of the 'createdAt' field.
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the value of the 'createdAt' field.
   * @param value the value to set.
   */
  public void setCreatedAt(java.lang.Long value) {
    this.createdAt = value;
  }

  /**
   * Gets the value of the 'lastUsed' field.
   * @return The value of the 'lastUsed' field.
   */
  public java.lang.Long getLastUsed() {
    return lastUsed;
  }

  /**
   * Sets the value of the 'lastUsed' field.
   * @param value the value to set.
   */
  public void setLastUsed(java.lang.Long value) {
    this.lastUsed = value;
  }

  /**
   * Gets the value of the 'updatedOn' field.
   * @return The value of the 'updatedOn' field.
   */
  public java.lang.Long getUpdatedOn() {
    return updatedOn;
  }

  /**
   * Sets the value of the 'updatedOn' field.
   * @param value the value to set.
   */
  public void setUpdatedOn(java.lang.Long value) {
    this.updatedOn = value;
  }

  /**
   * Gets the value of the 'location' field.
   * @return The value of the 'location' field.
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Sets the value of the 'location' field.
   * @param value the value to set.
   */
  public void setLocation(java.lang.String value) {
    this.location = value;
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
   * Gets the value of the 'parentOrgId' field.
   * @return The value of the 'parentOrgId' field.
   */
  public java.lang.String getParentOrgId() {
    return parentOrgId;
  }

  /**
   * Sets the value of the 'parentOrgId' field.
   * @param value the value to set.
   */
  public void setParentOrgId(java.lang.String value) {
    this.parentOrgId = value;
  }

  /**
   * Gets the value of the 'pushToken' field.
   * @return The value of the 'pushToken' field.
   */
  public java.lang.String getPushToken() {
    return pushToken;
  }

  /**
   * Sets the value of the 'pushToken' field.
   * @param value the value to set.
   */
  public void setPushToken(java.lang.String value) {
    this.pushToken = value;
  }

  /**
   * Gets the value of the 'pushTokenService' field.
   * @return The value of the 'pushTokenService' field.
   */
  public java.lang.String getPushTokenService() {
    return pushTokenService;
  }

  /**
   * Sets the value of the 'pushTokenService' field.
   * @param value the value to set.
   */
  public void setPushTokenService(java.lang.String value) {
    this.pushTokenService = value;
  }

  /**
   * Gets the value of the 'app' field.
   * @return The value of the 'app' field.
   */
  public java.lang.String getApp() {
    return app;
  }

  /**
   * Sets the value of the 'app' field.
   * @param value the value to set.
   */
  public void setApp(java.lang.String value) {
    this.app = value;
  }

  /**
   * Creates a new LoginSession RecordBuilder.
   * @return A new LoginSession RecordBuilder
   */
  public static com.fretron.Model.LoginSession.Builder newBuilder() {
    return new com.fretron.Model.LoginSession.Builder();
  }

  /**
   * Creates a new LoginSession RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LoginSession RecordBuilder
   */
  public static com.fretron.Model.LoginSession.Builder newBuilder(com.fretron.Model.LoginSession.Builder other) {
    return new com.fretron.Model.LoginSession.Builder(other);
  }

  /**
   * Creates a new LoginSession RecordBuilder by copying an existing LoginSession instance.
   * @param other The existing instance to copy.
   * @return A new LoginSession RecordBuilder
   */
  public static com.fretron.Model.LoginSession.Builder newBuilder(com.fretron.Model.LoginSession other) {
    return new com.fretron.Model.LoginSession.Builder(other);
  }

  /**
   * RecordBuilder for LoginSession instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LoginSession>
    implements org.apache.avro.data.RecordBuilder<LoginSession> {

    private java.lang.String uuid;
    private java.lang.String userId;
    private java.lang.String token;
    private java.lang.String userAgent;
    private java.lang.Boolean isValid;
    private java.lang.Long createdAt;
    private java.lang.Long lastUsed;
    private java.lang.Long updatedOn;
    private java.lang.String location;
    private java.lang.String orgId;
    private java.lang.String parentOrgId;
    private java.lang.String pushToken;
    private java.lang.String pushTokenService;
    private java.lang.String app;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.LoginSession.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userId)) {
        this.userId = data().deepCopy(fields()[1].schema(), other.userId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.token)) {
        this.token = data().deepCopy(fields()[2].schema(), other.token);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.userAgent)) {
        this.userAgent = data().deepCopy(fields()[3].schema(), other.userAgent);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.isValid)) {
        this.isValid = data().deepCopy(fields()[4].schema(), other.isValid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[5].schema(), other.createdAt);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.lastUsed)) {
        this.lastUsed = data().deepCopy(fields()[6].schema(), other.lastUsed);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.updatedOn)) {
        this.updatedOn = data().deepCopy(fields()[7].schema(), other.updatedOn);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.location)) {
        this.location = data().deepCopy(fields()[8].schema(), other.location);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.orgId)) {
        this.orgId = data().deepCopy(fields()[9].schema(), other.orgId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.parentOrgId)) {
        this.parentOrgId = data().deepCopy(fields()[10].schema(), other.parentOrgId);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.pushToken)) {
        this.pushToken = data().deepCopy(fields()[11].schema(), other.pushToken);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.pushTokenService)) {
        this.pushTokenService = data().deepCopy(fields()[12].schema(), other.pushTokenService);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.app)) {
        this.app = data().deepCopy(fields()[13].schema(), other.app);
        fieldSetFlags()[13] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing LoginSession instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.LoginSession other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userId)) {
        this.userId = data().deepCopy(fields()[1].schema(), other.userId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.token)) {
        this.token = data().deepCopy(fields()[2].schema(), other.token);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.userAgent)) {
        this.userAgent = data().deepCopy(fields()[3].schema(), other.userAgent);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.isValid)) {
        this.isValid = data().deepCopy(fields()[4].schema(), other.isValid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[5].schema(), other.createdAt);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.lastUsed)) {
        this.lastUsed = data().deepCopy(fields()[6].schema(), other.lastUsed);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.updatedOn)) {
        this.updatedOn = data().deepCopy(fields()[7].schema(), other.updatedOn);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.location)) {
        this.location = data().deepCopy(fields()[8].schema(), other.location);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.orgId)) {
        this.orgId = data().deepCopy(fields()[9].schema(), other.orgId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.parentOrgId)) {
        this.parentOrgId = data().deepCopy(fields()[10].schema(), other.parentOrgId);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.pushToken)) {
        this.pushToken = data().deepCopy(fields()[11].schema(), other.pushToken);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.pushTokenService)) {
        this.pushTokenService = data().deepCopy(fields()[12].schema(), other.pushTokenService);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.app)) {
        this.app = data().deepCopy(fields()[13].schema(), other.app);
        fieldSetFlags()[13] = true;
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
    public com.fretron.Model.LoginSession.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.LoginSession.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.lang.String getUserId() {
      return userId;
    }

    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setUserId(java.lang.String value) {
      validate(fields()[1], value);
      this.userId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'token' field.
      * @return The value.
      */
    public java.lang.String getToken() {
      return token;
    }

    /**
      * Sets the value of the 'token' field.
      * @param value The value of 'token'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setToken(java.lang.String value) {
      validate(fields()[2], value);
      this.token = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'token' field has been set.
      * @return True if the 'token' field has been set, false otherwise.
      */
    public boolean hasToken() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'token' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearToken() {
      token = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'userAgent' field.
      * @return The value.
      */
    public java.lang.String getUserAgent() {
      return userAgent;
    }

    /**
      * Sets the value of the 'userAgent' field.
      * @param value The value of 'userAgent'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setUserAgent(java.lang.String value) {
      validate(fields()[3], value);
      this.userAgent = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'userAgent' field has been set.
      * @return True if the 'userAgent' field has been set, false otherwise.
      */
    public boolean hasUserAgent() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'userAgent' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearUserAgent() {
      userAgent = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'isValid' field.
      * @return The value.
      */
    public java.lang.Boolean getIsValid() {
      return isValid;
    }

    /**
      * Sets the value of the 'isValid' field.
      * @param value The value of 'isValid'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setIsValid(java.lang.Boolean value) {
      validate(fields()[4], value);
      this.isValid = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'isValid' field has been set.
      * @return True if the 'isValid' field has been set, false otherwise.
      */
    public boolean hasIsValid() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'isValid' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearIsValid() {
      isValid = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdAt' field.
      * @return The value.
      */
    public java.lang.Long getCreatedAt() {
      return createdAt;
    }

    /**
      * Sets the value of the 'createdAt' field.
      * @param value The value of 'createdAt'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setCreatedAt(java.lang.Long value) {
      validate(fields()[5], value);
      this.createdAt = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'createdAt' field has been set.
      * @return True if the 'createdAt' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'createdAt' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearCreatedAt() {
      createdAt = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastUsed' field.
      * @return The value.
      */
    public java.lang.Long getLastUsed() {
      return lastUsed;
    }

    /**
      * Sets the value of the 'lastUsed' field.
      * @param value The value of 'lastUsed'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setLastUsed(java.lang.Long value) {
      validate(fields()[6], value);
      this.lastUsed = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'lastUsed' field has been set.
      * @return True if the 'lastUsed' field has been set, false otherwise.
      */
    public boolean hasLastUsed() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'lastUsed' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearLastUsed() {
      lastUsed = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'updatedOn' field.
      * @return The value.
      */
    public java.lang.Long getUpdatedOn() {
      return updatedOn;
    }

    /**
      * Sets the value of the 'updatedOn' field.
      * @param value The value of 'updatedOn'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setUpdatedOn(java.lang.Long value) {
      validate(fields()[7], value);
      this.updatedOn = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'updatedOn' field has been set.
      * @return True if the 'updatedOn' field has been set, false otherwise.
      */
    public boolean hasUpdatedOn() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'updatedOn' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearUpdatedOn() {
      updatedOn = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'location' field.
      * @return The value.
      */
    public java.lang.String getLocation() {
      return location;
    }

    /**
      * Sets the value of the 'location' field.
      * @param value The value of 'location'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setLocation(java.lang.String value) {
      validate(fields()[8], value);
      this.location = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'location' field has been set.
      * @return True if the 'location' field has been set, false otherwise.
      */
    public boolean hasLocation() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'location' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearLocation() {
      location = null;
      fieldSetFlags()[8] = false;
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
    public com.fretron.Model.LoginSession.Builder setOrgId(java.lang.String value) {
      validate(fields()[9], value);
      this.orgId = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'orgId' field has been set.
      * @return True if the 'orgId' field has been set, false otherwise.
      */
    public boolean hasOrgId() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'orgId' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearOrgId() {
      orgId = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'parentOrgId' field.
      * @return The value.
      */
    public java.lang.String getParentOrgId() {
      return parentOrgId;
    }

    /**
      * Sets the value of the 'parentOrgId' field.
      * @param value The value of 'parentOrgId'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setParentOrgId(java.lang.String value) {
      validate(fields()[10], value);
      this.parentOrgId = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'parentOrgId' field has been set.
      * @return True if the 'parentOrgId' field has been set, false otherwise.
      */
    public boolean hasParentOrgId() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'parentOrgId' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearParentOrgId() {
      parentOrgId = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'pushToken' field.
      * @return The value.
      */
    public java.lang.String getPushToken() {
      return pushToken;
    }

    /**
      * Sets the value of the 'pushToken' field.
      * @param value The value of 'pushToken'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setPushToken(java.lang.String value) {
      validate(fields()[11], value);
      this.pushToken = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'pushToken' field has been set.
      * @return True if the 'pushToken' field has been set, false otherwise.
      */
    public boolean hasPushToken() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'pushToken' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearPushToken() {
      pushToken = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'pushTokenService' field.
      * @return The value.
      */
    public java.lang.String getPushTokenService() {
      return pushTokenService;
    }

    /**
      * Sets the value of the 'pushTokenService' field.
      * @param value The value of 'pushTokenService'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setPushTokenService(java.lang.String value) {
      validate(fields()[12], value);
      this.pushTokenService = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'pushTokenService' field has been set.
      * @return True if the 'pushTokenService' field has been set, false otherwise.
      */
    public boolean hasPushTokenService() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'pushTokenService' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearPushTokenService() {
      pushTokenService = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'app' field.
      * @return The value.
      */
    public java.lang.String getApp() {
      return app;
    }

    /**
      * Sets the value of the 'app' field.
      * @param value The value of 'app'.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder setApp(java.lang.String value) {
      validate(fields()[13], value);
      this.app = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'app' field has been set.
      * @return True if the 'app' field has been set, false otherwise.
      */
    public boolean hasApp() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'app' field.
      * @return This builder.
      */
    public com.fretron.Model.LoginSession.Builder clearApp() {
      app = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    public LoginSession build() {
      try {
        LoginSession record = new LoginSession();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.userId = fieldSetFlags()[1] ? this.userId : (java.lang.String) defaultValue(fields()[1]);
        record.token = fieldSetFlags()[2] ? this.token : (java.lang.String) defaultValue(fields()[2]);
        record.userAgent = fieldSetFlags()[3] ? this.userAgent : (java.lang.String) defaultValue(fields()[3]);
        record.isValid = fieldSetFlags()[4] ? this.isValid : (java.lang.Boolean) defaultValue(fields()[4]);
        record.createdAt = fieldSetFlags()[5] ? this.createdAt : (java.lang.Long) defaultValue(fields()[5]);
        record.lastUsed = fieldSetFlags()[6] ? this.lastUsed : (java.lang.Long) defaultValue(fields()[6]);
        record.updatedOn = fieldSetFlags()[7] ? this.updatedOn : (java.lang.Long) defaultValue(fields()[7]);
        record.location = fieldSetFlags()[8] ? this.location : (java.lang.String) defaultValue(fields()[8]);
        record.orgId = fieldSetFlags()[9] ? this.orgId : (java.lang.String) defaultValue(fields()[9]);
        record.parentOrgId = fieldSetFlags()[10] ? this.parentOrgId : (java.lang.String) defaultValue(fields()[10]);
        record.pushToken = fieldSetFlags()[11] ? this.pushToken : (java.lang.String) defaultValue(fields()[11]);
        record.pushTokenService = fieldSetFlags()[12] ? this.pushTokenService : (java.lang.String) defaultValue(fields()[12]);
        record.app = fieldSetFlags()[13] ? this.app : (java.lang.String) defaultValue(fields()[13]);
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
