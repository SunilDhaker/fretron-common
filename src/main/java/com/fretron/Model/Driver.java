/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Driver extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2153963281877779065L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Driver\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"mobileNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"dlNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"dlExpiryTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"attachedDocs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"pincode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleRegistrationNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String mobileNumber;
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String orgId;
  @Deprecated public java.lang.String dlNumber;
  @Deprecated public java.lang.Long dlExpiryTime;
  @Deprecated public java.util.List<java.lang.String> attachedDocs;
  @Deprecated public java.lang.String address;
  @Deprecated public java.lang.String pincode;
  @Deprecated public java.lang.String vehicleId;
  @Deprecated public java.lang.String vehicleRegistrationNumber;
  @Deprecated public java.lang.String externalId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Driver() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param mobileNumber The new value for mobileNumber
   * @param uuid The new value for uuid
   * @param orgId The new value for orgId
   * @param dlNumber The new value for dlNumber
   * @param dlExpiryTime The new value for dlExpiryTime
   * @param attachedDocs The new value for attachedDocs
   * @param address The new value for address
   * @param pincode The new value for pincode
   * @param vehicleId The new value for vehicleId
   * @param vehicleRegistrationNumber The new value for vehicleRegistrationNumber
   * @param externalId The new value for externalId
   */
  public Driver(java.lang.String name, java.lang.String mobileNumber, java.lang.String uuid, java.lang.String orgId, java.lang.String dlNumber, java.lang.Long dlExpiryTime, java.util.List<java.lang.String> attachedDocs, java.lang.String address, java.lang.String pincode, java.lang.String vehicleId, java.lang.String vehicleRegistrationNumber, java.lang.String externalId) {
    this.name = name;
    this.mobileNumber = mobileNumber;
    this.uuid = uuid;
    this.orgId = orgId;
    this.dlNumber = dlNumber;
    this.dlExpiryTime = dlExpiryTime;
    this.attachedDocs = attachedDocs;
    this.address = address;
    this.pincode = pincode;
    this.vehicleId = vehicleId;
    this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    this.externalId = externalId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return mobileNumber;
    case 2: return uuid;
    case 3: return orgId;
    case 4: return dlNumber;
    case 5: return dlExpiryTime;
    case 6: return attachedDocs;
    case 7: return address;
    case 8: return pincode;
    case 9: return vehicleId;
    case 10: return vehicleRegistrationNumber;
    case 11: return externalId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: mobileNumber = (java.lang.String)value$; break;
    case 2: uuid = (java.lang.String)value$; break;
    case 3: orgId = (java.lang.String)value$; break;
    case 4: dlNumber = (java.lang.String)value$; break;
    case 5: dlExpiryTime = (java.lang.Long)value$; break;
    case 6: attachedDocs = (java.util.List<java.lang.String>)value$; break;
    case 7: address = (java.lang.String)value$; break;
    case 8: pincode = (java.lang.String)value$; break;
    case 9: vehicleId = (java.lang.String)value$; break;
    case 10: vehicleRegistrationNumber = (java.lang.String)value$; break;
    case 11: externalId = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'dlNumber' field.
   * @return The value of the 'dlNumber' field.
   */
  public java.lang.String getDlNumber() {
    return dlNumber;
  }

  /**
   * Sets the value of the 'dlNumber' field.
   * @param value the value to set.
   */
  public void setDlNumber(java.lang.String value) {
    this.dlNumber = value;
  }

  /**
   * Gets the value of the 'dlExpiryTime' field.
   * @return The value of the 'dlExpiryTime' field.
   */
  public java.lang.Long getDlExpiryTime() {
    return dlExpiryTime;
  }

  /**
   * Sets the value of the 'dlExpiryTime' field.
   * @param value the value to set.
   */
  public void setDlExpiryTime(java.lang.Long value) {
    this.dlExpiryTime = value;
  }

  /**
   * Gets the value of the 'attachedDocs' field.
   * @return The value of the 'attachedDocs' field.
   */
  public java.util.List<java.lang.String> getAttachedDocs() {
    return attachedDocs;
  }

  /**
   * Sets the value of the 'attachedDocs' field.
   * @param value the value to set.
   */
  public void setAttachedDocs(java.util.List<java.lang.String> value) {
    this.attachedDocs = value;
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
   * Gets the value of the 'pincode' field.
   * @return The value of the 'pincode' field.
   */
  public java.lang.String getPincode() {
    return pincode;
  }

  /**
   * Sets the value of the 'pincode' field.
   * @param value the value to set.
   */
  public void setPincode(java.lang.String value) {
    this.pincode = value;
  }

  /**
   * Gets the value of the 'vehicleId' field.
   * @return The value of the 'vehicleId' field.
   */
  public java.lang.String getVehicleId() {
    return vehicleId;
  }

  /**
   * Sets the value of the 'vehicleId' field.
   * @param value the value to set.
   */
  public void setVehicleId(java.lang.String value) {
    this.vehicleId = value;
  }

  /**
   * Gets the value of the 'vehicleRegistrationNumber' field.
   * @return The value of the 'vehicleRegistrationNumber' field.
   */
  public java.lang.String getVehicleRegistrationNumber() {
    return vehicleRegistrationNumber;
  }

  /**
   * Sets the value of the 'vehicleRegistrationNumber' field.
   * @param value the value to set.
   */
  public void setVehicleRegistrationNumber(java.lang.String value) {
    this.vehicleRegistrationNumber = value;
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
   * Creates a new Driver RecordBuilder.
   * @return A new Driver RecordBuilder
   */
  public static com.fretron.Model.Driver.Builder newBuilder() {
    return new com.fretron.Model.Driver.Builder();
  }

  /**
   * Creates a new Driver RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Driver RecordBuilder
   */
  public static com.fretron.Model.Driver.Builder newBuilder(com.fretron.Model.Driver.Builder other) {
    return new com.fretron.Model.Driver.Builder(other);
  }

  /**
   * Creates a new Driver RecordBuilder by copying an existing Driver instance.
   * @param other The existing instance to copy.
   * @return A new Driver RecordBuilder
   */
  public static com.fretron.Model.Driver.Builder newBuilder(com.fretron.Model.Driver other) {
    return new com.fretron.Model.Driver.Builder(other);
  }

  /**
   * RecordBuilder for Driver instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Driver>
    implements org.apache.avro.data.RecordBuilder<Driver> {

    private java.lang.String name;
    private java.lang.String mobileNumber;
    private java.lang.String uuid;
    private java.lang.String orgId;
    private java.lang.String dlNumber;
    private java.lang.Long dlExpiryTime;
    private java.util.List<java.lang.String> attachedDocs;
    private java.lang.String address;
    private java.lang.String pincode;
    private java.lang.String vehicleId;
    private java.lang.String vehicleRegistrationNumber;
    private java.lang.String externalId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Driver.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mobileNumber)) {
        this.mobileNumber = data().deepCopy(fields()[1].schema(), other.mobileNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.uuid)) {
        this.uuid = data().deepCopy(fields()[2].schema(), other.uuid);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.orgId)) {
        this.orgId = data().deepCopy(fields()[3].schema(), other.orgId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.dlNumber)) {
        this.dlNumber = data().deepCopy(fields()[4].schema(), other.dlNumber);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.dlExpiryTime)) {
        this.dlExpiryTime = data().deepCopy(fields()[5].schema(), other.dlExpiryTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.attachedDocs)) {
        this.attachedDocs = data().deepCopy(fields()[6].schema(), other.attachedDocs);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.address)) {
        this.address = data().deepCopy(fields()[7].schema(), other.address);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.pincode)) {
        this.pincode = data().deepCopy(fields()[8].schema(), other.pincode);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[9].schema(), other.vehicleId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.vehicleRegistrationNumber)) {
        this.vehicleRegistrationNumber = data().deepCopy(fields()[10].schema(), other.vehicleRegistrationNumber);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.externalId)) {
        this.externalId = data().deepCopy(fields()[11].schema(), other.externalId);
        fieldSetFlags()[11] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Driver instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Driver other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.mobileNumber)) {
        this.mobileNumber = data().deepCopy(fields()[1].schema(), other.mobileNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.uuid)) {
        this.uuid = data().deepCopy(fields()[2].schema(), other.uuid);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.orgId)) {
        this.orgId = data().deepCopy(fields()[3].schema(), other.orgId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.dlNumber)) {
        this.dlNumber = data().deepCopy(fields()[4].schema(), other.dlNumber);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.dlExpiryTime)) {
        this.dlExpiryTime = data().deepCopy(fields()[5].schema(), other.dlExpiryTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.attachedDocs)) {
        this.attachedDocs = data().deepCopy(fields()[6].schema(), other.attachedDocs);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.address)) {
        this.address = data().deepCopy(fields()[7].schema(), other.address);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.pincode)) {
        this.pincode = data().deepCopy(fields()[8].schema(), other.pincode);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[9].schema(), other.vehicleId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.vehicleRegistrationNumber)) {
        this.vehicleRegistrationNumber = data().deepCopy(fields()[10].schema(), other.vehicleRegistrationNumber);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.externalId)) {
        this.externalId = data().deepCopy(fields()[11].schema(), other.externalId);
        fieldSetFlags()[11] = true;
      }
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
    public com.fretron.Model.Driver.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder clearName() {
      name = null;
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
    public com.fretron.Model.Driver.Builder setMobileNumber(java.lang.String value) {
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
    public com.fretron.Model.Driver.Builder clearMobileNumber() {
      mobileNumber = null;
      fieldSetFlags()[1] = false;
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
    public com.fretron.Model.Driver.Builder setUuid(java.lang.String value) {
      validate(fields()[2], value);
      this.uuid = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'uuid' field has been set.
      * @return True if the 'uuid' field has been set, false otherwise.
      */
    public boolean hasUuid() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'uuid' field.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder clearUuid() {
      uuid = null;
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
    public com.fretron.Model.Driver.Builder setOrgId(java.lang.String value) {
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
    public com.fretron.Model.Driver.Builder clearOrgId() {
      orgId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'dlNumber' field.
      * @return The value.
      */
    public java.lang.String getDlNumber() {
      return dlNumber;
    }

    /**
      * Sets the value of the 'dlNumber' field.
      * @param value The value of 'dlNumber'.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder setDlNumber(java.lang.String value) {
      validate(fields()[4], value);
      this.dlNumber = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'dlNumber' field has been set.
      * @return True if the 'dlNumber' field has been set, false otherwise.
      */
    public boolean hasDlNumber() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'dlNumber' field.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder clearDlNumber() {
      dlNumber = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'dlExpiryTime' field.
      * @return The value.
      */
    public java.lang.Long getDlExpiryTime() {
      return dlExpiryTime;
    }

    /**
      * Sets the value of the 'dlExpiryTime' field.
      * @param value The value of 'dlExpiryTime'.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder setDlExpiryTime(java.lang.Long value) {
      validate(fields()[5], value);
      this.dlExpiryTime = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'dlExpiryTime' field has been set.
      * @return True if the 'dlExpiryTime' field has been set, false otherwise.
      */
    public boolean hasDlExpiryTime() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'dlExpiryTime' field.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder clearDlExpiryTime() {
      dlExpiryTime = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'attachedDocs' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getAttachedDocs() {
      return attachedDocs;
    }

    /**
      * Sets the value of the 'attachedDocs' field.
      * @param value The value of 'attachedDocs'.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder setAttachedDocs(java.util.List<java.lang.String> value) {
      validate(fields()[6], value);
      this.attachedDocs = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'attachedDocs' field has been set.
      * @return True if the 'attachedDocs' field has been set, false otherwise.
      */
    public boolean hasAttachedDocs() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'attachedDocs' field.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder clearAttachedDocs() {
      attachedDocs = null;
      fieldSetFlags()[6] = false;
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
    public com.fretron.Model.Driver.Builder setAddress(java.lang.String value) {
      validate(fields()[7], value);
      this.address = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder clearAddress() {
      address = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'pincode' field.
      * @return The value.
      */
    public java.lang.String getPincode() {
      return pincode;
    }

    /**
      * Sets the value of the 'pincode' field.
      * @param value The value of 'pincode'.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder setPincode(java.lang.String value) {
      validate(fields()[8], value);
      this.pincode = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'pincode' field has been set.
      * @return True if the 'pincode' field has been set, false otherwise.
      */
    public boolean hasPincode() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'pincode' field.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder clearPincode() {
      pincode = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'vehicleId' field.
      * @return The value.
      */
    public java.lang.String getVehicleId() {
      return vehicleId;
    }

    /**
      * Sets the value of the 'vehicleId' field.
      * @param value The value of 'vehicleId'.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder setVehicleId(java.lang.String value) {
      validate(fields()[9], value);
      this.vehicleId = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleId' field has been set.
      * @return True if the 'vehicleId' field has been set, false otherwise.
      */
    public boolean hasVehicleId() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'vehicleId' field.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder clearVehicleId() {
      vehicleId = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'vehicleRegistrationNumber' field.
      * @return The value.
      */
    public java.lang.String getVehicleRegistrationNumber() {
      return vehicleRegistrationNumber;
    }

    /**
      * Sets the value of the 'vehicleRegistrationNumber' field.
      * @param value The value of 'vehicleRegistrationNumber'.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder setVehicleRegistrationNumber(java.lang.String value) {
      validate(fields()[10], value);
      this.vehicleRegistrationNumber = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleRegistrationNumber' field has been set.
      * @return True if the 'vehicleRegistrationNumber' field has been set, false otherwise.
      */
    public boolean hasVehicleRegistrationNumber() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'vehicleRegistrationNumber' field.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder clearVehicleRegistrationNumber() {
      vehicleRegistrationNumber = null;
      fieldSetFlags()[10] = false;
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
    public com.fretron.Model.Driver.Builder setExternalId(java.lang.String value) {
      validate(fields()[11], value);
      this.externalId = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'externalId' field has been set.
      * @return True if the 'externalId' field has been set, false otherwise.
      */
    public boolean hasExternalId() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'externalId' field.
      * @return This builder.
      */
    public com.fretron.Model.Driver.Builder clearExternalId() {
      externalId = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    public Driver build() {
      try {
        Driver record = new Driver();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.mobileNumber = fieldSetFlags()[1] ? this.mobileNumber : (java.lang.String) defaultValue(fields()[1]);
        record.uuid = fieldSetFlags()[2] ? this.uuid : (java.lang.String) defaultValue(fields()[2]);
        record.orgId = fieldSetFlags()[3] ? this.orgId : (java.lang.String) defaultValue(fields()[3]);
        record.dlNumber = fieldSetFlags()[4] ? this.dlNumber : (java.lang.String) defaultValue(fields()[4]);
        record.dlExpiryTime = fieldSetFlags()[5] ? this.dlExpiryTime : (java.lang.Long) defaultValue(fields()[5]);
        record.attachedDocs = fieldSetFlags()[6] ? this.attachedDocs : (java.util.List<java.lang.String>) defaultValue(fields()[6]);
        record.address = fieldSetFlags()[7] ? this.address : (java.lang.String) defaultValue(fields()[7]);
        record.pincode = fieldSetFlags()[8] ? this.pincode : (java.lang.String) defaultValue(fields()[8]);
        record.vehicleId = fieldSetFlags()[9] ? this.vehicleId : (java.lang.String) defaultValue(fields()[9]);
        record.vehicleRegistrationNumber = fieldSetFlags()[10] ? this.vehicleRegistrationNumber : (java.lang.String) defaultValue(fields()[10]);
        record.externalId = fieldSetFlags()[11] ? this.externalId : (java.lang.String) defaultValue(fields()[11]);
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
