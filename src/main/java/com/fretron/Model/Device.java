/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Device extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -339222262658482059L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Device\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"imei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"mobileNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"manufacturerName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"isAssociated\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isDeleted\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"updateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"groups\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"isSuspended\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"usedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"shipmentNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String imei;
  @Deprecated public java.lang.String mobileNumber;
  @Deprecated public java.lang.String manufacturerName;
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String isAssociated;
  @Deprecated public java.lang.String isDeleted;
  @Deprecated public java.lang.Long createTime;
  @Deprecated public java.lang.Long updateTime;
  @Deprecated public java.util.List<java.lang.String> groups;
  @Deprecated public java.lang.String orgId;
  @Deprecated public java.lang.String status;
  @Deprecated public java.util.List<java.lang.String> sharedWith;
  @Deprecated public java.lang.Boolean isSuspended;
  @Deprecated public java.lang.String type;
  @Deprecated public java.lang.String usedBy;
  @Deprecated public java.lang.String shipmentNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Device() {}

  /**
   * All-args constructor.
   * @param imei The new value for imei
   * @param mobileNumber The new value for mobileNumber
   * @param manufacturerName The new value for manufacturerName
   * @param uuid The new value for uuid
   * @param isAssociated The new value for isAssociated
   * @param isDeleted The new value for isDeleted
   * @param createTime The new value for createTime
   * @param updateTime The new value for updateTime
   * @param groups The new value for groups
   * @param orgId The new value for orgId
   * @param status The new value for status
   * @param sharedWith The new value for sharedWith
   * @param isSuspended The new value for isSuspended
   * @param type The new value for type
   * @param usedBy The new value for usedBy
   * @param shipmentNumber The new value for shipmentNumber
   */
  public Device(java.lang.String imei, java.lang.String mobileNumber, java.lang.String manufacturerName, java.lang.String uuid, java.lang.String isAssociated, java.lang.String isDeleted, java.lang.Long createTime, java.lang.Long updateTime, java.util.List<java.lang.String> groups, java.lang.String orgId, java.lang.String status, java.util.List<java.lang.String> sharedWith, java.lang.Boolean isSuspended, java.lang.String type, java.lang.String usedBy, java.lang.String shipmentNumber) {
    this.imei = imei;
    this.mobileNumber = mobileNumber;
    this.manufacturerName = manufacturerName;
    this.uuid = uuid;
    this.isAssociated = isAssociated;
    this.isDeleted = isDeleted;
    this.createTime = createTime;
    this.updateTime = updateTime;
    this.groups = groups;
    this.orgId = orgId;
    this.status = status;
    this.sharedWith = sharedWith;
    this.isSuspended = isSuspended;
    this.type = type;
    this.usedBy = usedBy;
    this.shipmentNumber = shipmentNumber;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return imei;
    case 1: return mobileNumber;
    case 2: return manufacturerName;
    case 3: return uuid;
    case 4: return isAssociated;
    case 5: return isDeleted;
    case 6: return createTime;
    case 7: return updateTime;
    case 8: return groups;
    case 9: return orgId;
    case 10: return status;
    case 11: return sharedWith;
    case 12: return isSuspended;
    case 13: return type;
    case 14: return usedBy;
    case 15: return shipmentNumber;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: imei = (java.lang.String)value$; break;
    case 1: mobileNumber = (java.lang.String)value$; break;
    case 2: manufacturerName = (java.lang.String)value$; break;
    case 3: uuid = (java.lang.String)value$; break;
    case 4: isAssociated = (java.lang.String)value$; break;
    case 5: isDeleted = (java.lang.String)value$; break;
    case 6: createTime = (java.lang.Long)value$; break;
    case 7: updateTime = (java.lang.Long)value$; break;
    case 8: groups = (java.util.List<java.lang.String>)value$; break;
    case 9: orgId = (java.lang.String)value$; break;
    case 10: status = (java.lang.String)value$; break;
    case 11: sharedWith = (java.util.List<java.lang.String>)value$; break;
    case 12: isSuspended = (java.lang.Boolean)value$; break;
    case 13: type = (java.lang.String)value$; break;
    case 14: usedBy = (java.lang.String)value$; break;
    case 15: shipmentNumber = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'imei' field.
   * @return The value of the 'imei' field.
   */
  public java.lang.String getImei() {
    return imei;
  }

  /**
   * Sets the value of the 'imei' field.
   * @param value the value to set.
   */
  public void setImei(java.lang.String value) {
    this.imei = value;
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
   * Gets the value of the 'manufacturerName' field.
   * @return The value of the 'manufacturerName' field.
   */
  public java.lang.String getManufacturerName() {
    return manufacturerName;
  }

  /**
   * Sets the value of the 'manufacturerName' field.
   * @param value the value to set.
   */
  public void setManufacturerName(java.lang.String value) {
    this.manufacturerName = value;
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
   * Gets the value of the 'isAssociated' field.
   * @return The value of the 'isAssociated' field.
   */
  public java.lang.String getIsAssociated() {
    return isAssociated;
  }

  /**
   * Sets the value of the 'isAssociated' field.
   * @param value the value to set.
   */
  public void setIsAssociated(java.lang.String value) {
    this.isAssociated = value;
  }

  /**
   * Gets the value of the 'isDeleted' field.
   * @return The value of the 'isDeleted' field.
   */
  public java.lang.String getIsDeleted() {
    return isDeleted;
  }

  /**
   * Sets the value of the 'isDeleted' field.
   * @param value the value to set.
   */
  public void setIsDeleted(java.lang.String value) {
    this.isDeleted = value;
  }

  /**
   * Gets the value of the 'createTime' field.
   * @return The value of the 'createTime' field.
   */
  public java.lang.Long getCreateTime() {
    return createTime;
  }

  /**
   * Sets the value of the 'createTime' field.
   * @param value the value to set.
   */
  public void setCreateTime(java.lang.Long value) {
    this.createTime = value;
  }

  /**
   * Gets the value of the 'updateTime' field.
   * @return The value of the 'updateTime' field.
   */
  public java.lang.Long getUpdateTime() {
    return updateTime;
  }

  /**
   * Sets the value of the 'updateTime' field.
   * @param value the value to set.
   */
  public void setUpdateTime(java.lang.Long value) {
    this.updateTime = value;
  }

  /**
   * Gets the value of the 'groups' field.
   * @return The value of the 'groups' field.
   */
  public java.util.List<java.lang.String> getGroups() {
    return groups;
  }

  /**
   * Sets the value of the 'groups' field.
   * @param value the value to set.
   */
  public void setGroups(java.util.List<java.lang.String> value) {
    this.groups = value;
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
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.String value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'sharedWith' field.
   * @return The value of the 'sharedWith' field.
   */
  public java.util.List<java.lang.String> getSharedWith() {
    return sharedWith;
  }

  /**
   * Sets the value of the 'sharedWith' field.
   * @param value the value to set.
   */
  public void setSharedWith(java.util.List<java.lang.String> value) {
    this.sharedWith = value;
  }

  /**
   * Gets the value of the 'isSuspended' field.
   * @return The value of the 'isSuspended' field.
   */
  public java.lang.Boolean getIsSuspended() {
    return isSuspended;
  }

  /**
   * Sets the value of the 'isSuspended' field.
   * @param value the value to set.
   */
  public void setIsSuspended(java.lang.Boolean value) {
    this.isSuspended = value;
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
   * Gets the value of the 'usedBy' field.
   * @return The value of the 'usedBy' field.
   */
  public java.lang.String getUsedBy() {
    return usedBy;
  }

  /**
   * Sets the value of the 'usedBy' field.
   * @param value the value to set.
   */
  public void setUsedBy(java.lang.String value) {
    this.usedBy = value;
  }

  /**
   * Gets the value of the 'shipmentNumber' field.
   * @return The value of the 'shipmentNumber' field.
   */
  public java.lang.String getShipmentNumber() {
    return shipmentNumber;
  }

  /**
   * Sets the value of the 'shipmentNumber' field.
   * @param value the value to set.
   */
  public void setShipmentNumber(java.lang.String value) {
    this.shipmentNumber = value;
  }

  /**
   * Creates a new Device RecordBuilder.
   * @return A new Device RecordBuilder
   */
  public static com.fretron.Model.Device.Builder newBuilder() {
    return new com.fretron.Model.Device.Builder();
  }

  /**
   * Creates a new Device RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Device RecordBuilder
   */
  public static com.fretron.Model.Device.Builder newBuilder(com.fretron.Model.Device.Builder other) {
    return new com.fretron.Model.Device.Builder(other);
  }

  /**
   * Creates a new Device RecordBuilder by copying an existing Device instance.
   * @param other The existing instance to copy.
   * @return A new Device RecordBuilder
   */
  public static com.fretron.Model.Device.Builder newBuilder(com.fretron.Model.Device other) {
    return new com.fretron.Model.Device.Builder(other);
  }

  /**
   * RecordBuilder for Device instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Device>
    implements org.apache.avro.data.RecordBuilder<Device> {

    private java.lang.String imei;
    private java.lang.String mobileNumber;
    private java.lang.String manufacturerName;
    private java.lang.String uuid;
    private java.lang.String isAssociated;
    private java.lang.String isDeleted;
    private java.lang.Long createTime;
    private java.lang.Long updateTime;
    private java.util.List<java.lang.String> groups;
    private java.lang.String orgId;
    private java.lang.String status;
    private java.util.List<java.lang.String> sharedWith;
    private java.lang.Boolean isSuspended;
    private java.lang.String type;
    private java.lang.String usedBy;
    private java.lang.String shipmentNumber;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Device.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.imei)) {
        this.imei = data().deepCopy(fields()[0].schema(), other.imei);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mobileNumber)) {
        this.mobileNumber = data().deepCopy(fields()[1].schema(), other.mobileNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.manufacturerName)) {
        this.manufacturerName = data().deepCopy(fields()[2].schema(), other.manufacturerName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.uuid)) {
        this.uuid = data().deepCopy(fields()[3].schema(), other.uuid);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.isAssociated)) {
        this.isAssociated = data().deepCopy(fields()[4].schema(), other.isAssociated);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.isDeleted)) {
        this.isDeleted = data().deepCopy(fields()[5].schema(), other.isDeleted);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.createTime)) {
        this.createTime = data().deepCopy(fields()[6].schema(), other.createTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.updateTime)) {
        this.updateTime = data().deepCopy(fields()[7].schema(), other.updateTime);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.groups)) {
        this.groups = data().deepCopy(fields()[8].schema(), other.groups);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.orgId)) {
        this.orgId = data().deepCopy(fields()[9].schema(), other.orgId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.status)) {
        this.status = data().deepCopy(fields()[10].schema(), other.status);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.sharedWith)) {
        this.sharedWith = data().deepCopy(fields()[11].schema(), other.sharedWith);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.isSuspended)) {
        this.isSuspended = data().deepCopy(fields()[12].schema(), other.isSuspended);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.type)) {
        this.type = data().deepCopy(fields()[13].schema(), other.type);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.usedBy)) {
        this.usedBy = data().deepCopy(fields()[14].schema(), other.usedBy);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.shipmentNumber)) {
        this.shipmentNumber = data().deepCopy(fields()[15].schema(), other.shipmentNumber);
        fieldSetFlags()[15] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Device instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Device other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.imei)) {
        this.imei = data().deepCopy(fields()[0].schema(), other.imei);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mobileNumber)) {
        this.mobileNumber = data().deepCopy(fields()[1].schema(), other.mobileNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.manufacturerName)) {
        this.manufacturerName = data().deepCopy(fields()[2].schema(), other.manufacturerName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.uuid)) {
        this.uuid = data().deepCopy(fields()[3].schema(), other.uuid);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.isAssociated)) {
        this.isAssociated = data().deepCopy(fields()[4].schema(), other.isAssociated);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.isDeleted)) {
        this.isDeleted = data().deepCopy(fields()[5].schema(), other.isDeleted);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.createTime)) {
        this.createTime = data().deepCopy(fields()[6].schema(), other.createTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.updateTime)) {
        this.updateTime = data().deepCopy(fields()[7].schema(), other.updateTime);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.groups)) {
        this.groups = data().deepCopy(fields()[8].schema(), other.groups);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.orgId)) {
        this.orgId = data().deepCopy(fields()[9].schema(), other.orgId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.status)) {
        this.status = data().deepCopy(fields()[10].schema(), other.status);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.sharedWith)) {
        this.sharedWith = data().deepCopy(fields()[11].schema(), other.sharedWith);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.isSuspended)) {
        this.isSuspended = data().deepCopy(fields()[12].schema(), other.isSuspended);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.type)) {
        this.type = data().deepCopy(fields()[13].schema(), other.type);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.usedBy)) {
        this.usedBy = data().deepCopy(fields()[14].schema(), other.usedBy);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.shipmentNumber)) {
        this.shipmentNumber = data().deepCopy(fields()[15].schema(), other.shipmentNumber);
        fieldSetFlags()[15] = true;
      }
    }

    /**
      * Gets the value of the 'imei' field.
      * @return The value.
      */
    public java.lang.String getImei() {
      return imei;
    }

    /**
      * Sets the value of the 'imei' field.
      * @param value The value of 'imei'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setImei(java.lang.String value) {
      validate(fields()[0], value);
      this.imei = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'imei' field has been set.
      * @return True if the 'imei' field has been set, false otherwise.
      */
    public boolean hasImei() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'imei' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearImei() {
      imei = null;
      fieldSetFlags()[0] = false;
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
    public com.fretron.Model.Device.Builder setMobileNumber(java.lang.String value) {
      validate(fields()[1], value);
      this.mobileNumber = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'mobileNumber' field has been set.
      * @return True if the 'mobileNumber' field has been set, false otherwise.
      */
    public boolean hasMobileNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'mobileNumber' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearMobileNumber() {
      mobileNumber = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'manufacturerName' field.
      * @return The value.
      */
    public java.lang.String getManufacturerName() {
      return manufacturerName;
    }

    /**
      * Sets the value of the 'manufacturerName' field.
      * @param value The value of 'manufacturerName'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setManufacturerName(java.lang.String value) {
      validate(fields()[2], value);
      this.manufacturerName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'manufacturerName' field has been set.
      * @return True if the 'manufacturerName' field has been set, false otherwise.
      */
    public boolean hasManufacturerName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'manufacturerName' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearManufacturerName() {
      manufacturerName = null;
      fieldSetFlags()[2] = false;
      return this;
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
    public com.fretron.Model.Device.Builder setUuid(java.lang.String value) {
      validate(fields()[3], value);
      this.uuid = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'uuid' field has been set.
      * @return True if the 'uuid' field has been set, false otherwise.
      */
    public boolean hasUuid() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'uuid' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'isAssociated' field.
      * @return The value.
      */
    public java.lang.String getIsAssociated() {
      return isAssociated;
    }

    /**
      * Sets the value of the 'isAssociated' field.
      * @param value The value of 'isAssociated'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setIsAssociated(java.lang.String value) {
      validate(fields()[4], value);
      this.isAssociated = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'isAssociated' field has been set.
      * @return True if the 'isAssociated' field has been set, false otherwise.
      */
    public boolean hasIsAssociated() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'isAssociated' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearIsAssociated() {
      isAssociated = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'isDeleted' field.
      * @return The value.
      */
    public java.lang.String getIsDeleted() {
      return isDeleted;
    }

    /**
      * Sets the value of the 'isDeleted' field.
      * @param value The value of 'isDeleted'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setIsDeleted(java.lang.String value) {
      validate(fields()[5], value);
      this.isDeleted = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'isDeleted' field has been set.
      * @return True if the 'isDeleted' field has been set, false otherwise.
      */
    public boolean hasIsDeleted() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'isDeleted' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearIsDeleted() {
      isDeleted = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'createTime' field.
      * @return The value.
      */
    public java.lang.Long getCreateTime() {
      return createTime;
    }

    /**
      * Sets the value of the 'createTime' field.
      * @param value The value of 'createTime'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setCreateTime(java.lang.Long value) {
      validate(fields()[6], value);
      this.createTime = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'createTime' field has been set.
      * @return True if the 'createTime' field has been set, false otherwise.
      */
    public boolean hasCreateTime() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'createTime' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearCreateTime() {
      createTime = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'updateTime' field.
      * @return The value.
      */
    public java.lang.Long getUpdateTime() {
      return updateTime;
    }

    /**
      * Sets the value of the 'updateTime' field.
      * @param value The value of 'updateTime'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setUpdateTime(java.lang.Long value) {
      validate(fields()[7], value);
      this.updateTime = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'updateTime' field has been set.
      * @return True if the 'updateTime' field has been set, false otherwise.
      */
    public boolean hasUpdateTime() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'updateTime' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearUpdateTime() {
      updateTime = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'groups' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getGroups() {
      return groups;
    }

    /**
      * Sets the value of the 'groups' field.
      * @param value The value of 'groups'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setGroups(java.util.List<java.lang.String> value) {
      validate(fields()[8], value);
      this.groups = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'groups' field has been set.
      * @return True if the 'groups' field has been set, false otherwise.
      */
    public boolean hasGroups() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'groups' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearGroups() {
      groups = null;
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
    public com.fretron.Model.Device.Builder setOrgId(java.lang.String value) {
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
    public com.fretron.Model.Device.Builder clearOrgId() {
      orgId = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.String getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setStatus(java.lang.String value) {
      validate(fields()[10], value);
      this.status = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearStatus() {
      status = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'sharedWith' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getSharedWith() {
      return sharedWith;
    }

    /**
      * Sets the value of the 'sharedWith' field.
      * @param value The value of 'sharedWith'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setSharedWith(java.util.List<java.lang.String> value) {
      validate(fields()[11], value);
      this.sharedWith = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'sharedWith' field has been set.
      * @return True if the 'sharedWith' field has been set, false otherwise.
      */
    public boolean hasSharedWith() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'sharedWith' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearSharedWith() {
      sharedWith = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'isSuspended' field.
      * @return The value.
      */
    public java.lang.Boolean getIsSuspended() {
      return isSuspended;
    }

    /**
      * Sets the value of the 'isSuspended' field.
      * @param value The value of 'isSuspended'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setIsSuspended(java.lang.Boolean value) {
      validate(fields()[12], value);
      this.isSuspended = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'isSuspended' field has been set.
      * @return True if the 'isSuspended' field has been set, false otherwise.
      */
    public boolean hasIsSuspended() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'isSuspended' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearIsSuspended() {
      isSuspended = null;
      fieldSetFlags()[12] = false;
      return this;
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
    public com.fretron.Model.Device.Builder setType(java.lang.String value) {
      validate(fields()[13], value);
      this.type = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearType() {
      type = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /**
      * Gets the value of the 'usedBy' field.
      * @return The value.
      */
    public java.lang.String getUsedBy() {
      return usedBy;
    }

    /**
      * Sets the value of the 'usedBy' field.
      * @param value The value of 'usedBy'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setUsedBy(java.lang.String value) {
      validate(fields()[14], value);
      this.usedBy = value;
      fieldSetFlags()[14] = true;
      return this;
    }

    /**
      * Checks whether the 'usedBy' field has been set.
      * @return True if the 'usedBy' field has been set, false otherwise.
      */
    public boolean hasUsedBy() {
      return fieldSetFlags()[14];
    }


    /**
      * Clears the value of the 'usedBy' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearUsedBy() {
      usedBy = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    /**
      * Gets the value of the 'shipmentNumber' field.
      * @return The value.
      */
    public java.lang.String getShipmentNumber() {
      return shipmentNumber;
    }

    /**
      * Sets the value of the 'shipmentNumber' field.
      * @param value The value of 'shipmentNumber'.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder setShipmentNumber(java.lang.String value) {
      validate(fields()[15], value);
      this.shipmentNumber = value;
      fieldSetFlags()[15] = true;
      return this;
    }

    /**
      * Checks whether the 'shipmentNumber' field has been set.
      * @return True if the 'shipmentNumber' field has been set, false otherwise.
      */
    public boolean hasShipmentNumber() {
      return fieldSetFlags()[15];
    }


    /**
      * Clears the value of the 'shipmentNumber' field.
      * @return This builder.
      */
    public com.fretron.Model.Device.Builder clearShipmentNumber() {
      shipmentNumber = null;
      fieldSetFlags()[15] = false;
      return this;
    }

    @Override
    public Device build() {
      try {
        Device record = new Device();
        record.imei = fieldSetFlags()[0] ? this.imei : (java.lang.String) defaultValue(fields()[0]);
        record.mobileNumber = fieldSetFlags()[1] ? this.mobileNumber : (java.lang.String) defaultValue(fields()[1]);
        record.manufacturerName = fieldSetFlags()[2] ? this.manufacturerName : (java.lang.String) defaultValue(fields()[2]);
        record.uuid = fieldSetFlags()[3] ? this.uuid : (java.lang.String) defaultValue(fields()[3]);
        record.isAssociated = fieldSetFlags()[4] ? this.isAssociated : (java.lang.String) defaultValue(fields()[4]);
        record.isDeleted = fieldSetFlags()[5] ? this.isDeleted : (java.lang.String) defaultValue(fields()[5]);
        record.createTime = fieldSetFlags()[6] ? this.createTime : (java.lang.Long) defaultValue(fields()[6]);
        record.updateTime = fieldSetFlags()[7] ? this.updateTime : (java.lang.Long) defaultValue(fields()[7]);
        record.groups = fieldSetFlags()[8] ? this.groups : (java.util.List<java.lang.String>) defaultValue(fields()[8]);
        record.orgId = fieldSetFlags()[9] ? this.orgId : (java.lang.String) defaultValue(fields()[9]);
        record.status = fieldSetFlags()[10] ? this.status : (java.lang.String) defaultValue(fields()[10]);
        record.sharedWith = fieldSetFlags()[11] ? this.sharedWith : (java.util.List<java.lang.String>) defaultValue(fields()[11]);
        record.isSuspended = fieldSetFlags()[12] ? this.isSuspended : (java.lang.Boolean) defaultValue(fields()[12]);
        record.type = fieldSetFlags()[13] ? this.type : (java.lang.String) defaultValue(fields()[13]);
        record.usedBy = fieldSetFlags()[14] ? this.usedBy : (java.lang.String) defaultValue(fields()[14]);
        record.shipmentNumber = fieldSetFlags()[15] ? this.shipmentNumber : (java.lang.String) defaultValue(fields()[15]);
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
