/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Equipment extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 583381679236110014L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Equipment\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"inventoryNo\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"catagory\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"location\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Place\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"center\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"centerCoordinates\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"suggestedRadius\",\"type\":\"double\",\"default\":null},{\"name\":\"viewport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ViewPort\",\"fields\":[{\"name\":\"northeast\",\"type\":[\"null\",\"Location\"],\"default\":null},{\"name\":\"southwest\",\"type\":[\"null\",\"Location\"],\"default\":null}]}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"addedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"hubId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"district\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"subDistrict\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"boundary\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null},{\"name\":\"places\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Place\"}],\"default\":null},{\"name\":\"accessibility\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isOwned\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"geoJsonBoundry\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Geometry\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"coordinates\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}],\"default\":null}]}],\"default\":null},{\"name\":\"shipmentNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updates\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Updates\",\"fields\":[{\"name\":\"forwardReasons\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"resourceType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resourceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sourceOfInformation\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updateType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"forwardedFrom\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"revision\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"traceID\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"changes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ChangeUpdate\",\"fields\":[{\"name\":\"currentValue\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"fieldName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastValue\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String _id;
  @Deprecated public java.lang.String inventoryNo;
  @Deprecated public java.lang.String type;
  @Deprecated public java.lang.String catagory;
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String orgId;
  @Deprecated public java.lang.String updatedBy;
  @Deprecated public com.fretron.Model.Place location;
  @Deprecated public java.lang.String shipmentNumber;
  @Deprecated public com.fretron.Model.Updates updates;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Equipment() {}

  /**
   * All-args constructor.
   * @param _id The new value for _id
   * @param inventoryNo The new value for inventoryNo
   * @param type The new value for type
   * @param catagory The new value for catagory
   * @param name The new value for name
   * @param orgId The new value for orgId
   * @param updatedBy The new value for updatedBy
   * @param location The new value for location
   * @param shipmentNumber The new value for shipmentNumber
   * @param updates The new value for updates
   */
  public Equipment(java.lang.String _id, java.lang.String inventoryNo, java.lang.String type, java.lang.String catagory, java.lang.String name, java.lang.String orgId, java.lang.String updatedBy, com.fretron.Model.Place location, java.lang.String shipmentNumber, com.fretron.Model.Updates updates) {
    this._id = _id;
    this.inventoryNo = inventoryNo;
    this.type = type;
    this.catagory = catagory;
    this.name = name;
    this.orgId = orgId;
    this.updatedBy = updatedBy;
    this.location = location;
    this.shipmentNumber = shipmentNumber;
    this.updates = updates;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _id;
    case 1: return inventoryNo;
    case 2: return type;
    case 3: return catagory;
    case 4: return name;
    case 5: return orgId;
    case 6: return updatedBy;
    case 7: return location;
    case 8: return shipmentNumber;
    case 9: return updates;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _id = (java.lang.String)value$; break;
    case 1: inventoryNo = (java.lang.String)value$; break;
    case 2: type = (java.lang.String)value$; break;
    case 3: catagory = (java.lang.String)value$; break;
    case 4: name = (java.lang.String)value$; break;
    case 5: orgId = (java.lang.String)value$; break;
    case 6: updatedBy = (java.lang.String)value$; break;
    case 7: location = (com.fretron.Model.Place)value$; break;
    case 8: shipmentNumber = (java.lang.String)value$; break;
    case 9: updates = (com.fretron.Model.Updates)value$; break;
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
   * Gets the value of the 'inventoryNo' field.
   * @return The value of the 'inventoryNo' field.
   */
  public java.lang.String getInventoryNo() {
    return inventoryNo;
  }

  /**
   * Sets the value of the 'inventoryNo' field.
   * @param value the value to set.
   */
  public void setInventoryNo(java.lang.String value) {
    this.inventoryNo = value;
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
   * Gets the value of the 'catagory' field.
   * @return The value of the 'catagory' field.
   */
  public java.lang.String getCatagory() {
    return catagory;
  }

  /**
   * Sets the value of the 'catagory' field.
   * @param value the value to set.
   */
  public void setCatagory(java.lang.String value) {
    this.catagory = value;
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
   * Gets the value of the 'location' field.
   * @return The value of the 'location' field.
   */
  public com.fretron.Model.Place getLocation() {
    return location;
  }

  /**
   * Sets the value of the 'location' field.
   * @param value the value to set.
   */
  public void setLocation(com.fretron.Model.Place value) {
    this.location = value;
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
   * Creates a new Equipment RecordBuilder.
   * @return A new Equipment RecordBuilder
   */
  public static com.fretron.Model.Equipment.Builder newBuilder() {
    return new com.fretron.Model.Equipment.Builder();
  }

  /**
   * Creates a new Equipment RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Equipment RecordBuilder
   */
  public static com.fretron.Model.Equipment.Builder newBuilder(com.fretron.Model.Equipment.Builder other) {
    return new com.fretron.Model.Equipment.Builder(other);
  }

  /**
   * Creates a new Equipment RecordBuilder by copying an existing Equipment instance.
   * @param other The existing instance to copy.
   * @return A new Equipment RecordBuilder
   */
  public static com.fretron.Model.Equipment.Builder newBuilder(com.fretron.Model.Equipment other) {
    return new com.fretron.Model.Equipment.Builder(other);
  }

  /**
   * RecordBuilder for Equipment instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Equipment>
    implements org.apache.avro.data.RecordBuilder<Equipment> {

    private java.lang.String _id;
    private java.lang.String inventoryNo;
    private java.lang.String type;
    private java.lang.String catagory;
    private java.lang.String name;
    private java.lang.String orgId;
    private java.lang.String updatedBy;
    private com.fretron.Model.Place location;
    private com.fretron.Model.Place.Builder locationBuilder;
    private java.lang.String shipmentNumber;
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
    private Builder(com.fretron.Model.Equipment.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._id)) {
        this._id = data().deepCopy(fields()[0].schema(), other._id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.inventoryNo)) {
        this.inventoryNo = data().deepCopy(fields()[1].schema(), other.inventoryNo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.catagory)) {
        this.catagory = data().deepCopy(fields()[3].schema(), other.catagory);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.name)) {
        this.name = data().deepCopy(fields()[4].schema(), other.name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.orgId)) {
        this.orgId = data().deepCopy(fields()[5].schema(), other.orgId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.updatedBy)) {
        this.updatedBy = data().deepCopy(fields()[6].schema(), other.updatedBy);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.location)) {
        this.location = data().deepCopy(fields()[7].schema(), other.location);
        fieldSetFlags()[7] = true;
      }
      if (other.hasLocationBuilder()) {
        this.locationBuilder = com.fretron.Model.Place.newBuilder(other.getLocationBuilder());
      }
      if (isValidValue(fields()[8], other.shipmentNumber)) {
        this.shipmentNumber = data().deepCopy(fields()[8].schema(), other.shipmentNumber);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.updates)) {
        this.updates = data().deepCopy(fields()[9].schema(), other.updates);
        fieldSetFlags()[9] = true;
      }
      if (other.hasUpdatesBuilder()) {
        this.updatesBuilder = com.fretron.Model.Updates.newBuilder(other.getUpdatesBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Equipment instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Equipment other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other._id)) {
        this._id = data().deepCopy(fields()[0].schema(), other._id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.inventoryNo)) {
        this.inventoryNo = data().deepCopy(fields()[1].schema(), other.inventoryNo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.catagory)) {
        this.catagory = data().deepCopy(fields()[3].schema(), other.catagory);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.name)) {
        this.name = data().deepCopy(fields()[4].schema(), other.name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.orgId)) {
        this.orgId = data().deepCopy(fields()[5].schema(), other.orgId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.updatedBy)) {
        this.updatedBy = data().deepCopy(fields()[6].schema(), other.updatedBy);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.location)) {
        this.location = data().deepCopy(fields()[7].schema(), other.location);
        fieldSetFlags()[7] = true;
      }
      this.locationBuilder = null;
      if (isValidValue(fields()[8], other.shipmentNumber)) {
        this.shipmentNumber = data().deepCopy(fields()[8].schema(), other.shipmentNumber);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.updates)) {
        this.updates = data().deepCopy(fields()[9].schema(), other.updates);
        fieldSetFlags()[9] = true;
      }
      this.updatesBuilder = null;
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
    public com.fretron.Model.Equipment.Builder setId$1(java.lang.String value) {
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
    public com.fretron.Model.Equipment.Builder clearId$1() {
      _id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'inventoryNo' field.
      * @return The value.
      */
    public java.lang.String getInventoryNo() {
      return inventoryNo;
    }

    /**
      * Sets the value of the 'inventoryNo' field.
      * @param value The value of 'inventoryNo'.
      * @return This builder.
      */
    public com.fretron.Model.Equipment.Builder setInventoryNo(java.lang.String value) {
      validate(fields()[1], value);
      this.inventoryNo = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'inventoryNo' field has been set.
      * @return True if the 'inventoryNo' field has been set, false otherwise.
      */
    public boolean hasInventoryNo() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'inventoryNo' field.
      * @return This builder.
      */
    public com.fretron.Model.Equipment.Builder clearInventoryNo() {
      inventoryNo = null;
      fieldSetFlags()[1] = false;
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
    public com.fretron.Model.Equipment.Builder setType(java.lang.String value) {
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
    public com.fretron.Model.Equipment.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'catagory' field.
      * @return The value.
      */
    public java.lang.String getCatagory() {
      return catagory;
    }

    /**
      * Sets the value of the 'catagory' field.
      * @param value The value of 'catagory'.
      * @return This builder.
      */
    public com.fretron.Model.Equipment.Builder setCatagory(java.lang.String value) {
      validate(fields()[3], value);
      this.catagory = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'catagory' field has been set.
      * @return True if the 'catagory' field has been set, false otherwise.
      */
    public boolean hasCatagory() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'catagory' field.
      * @return This builder.
      */
    public com.fretron.Model.Equipment.Builder clearCatagory() {
      catagory = null;
      fieldSetFlags()[3] = false;
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
    public com.fretron.Model.Equipment.Builder setName(java.lang.String value) {
      validate(fields()[4], value);
      this.name = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.fretron.Model.Equipment.Builder clearName() {
      name = null;
      fieldSetFlags()[4] = false;
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
    public com.fretron.Model.Equipment.Builder setOrgId(java.lang.String value) {
      validate(fields()[5], value);
      this.orgId = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'orgId' field has been set.
      * @return True if the 'orgId' field has been set, false otherwise.
      */
    public boolean hasOrgId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'orgId' field.
      * @return This builder.
      */
    public com.fretron.Model.Equipment.Builder clearOrgId() {
      orgId = null;
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
    public com.fretron.Model.Equipment.Builder setUpdatedBy(java.lang.String value) {
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
    public com.fretron.Model.Equipment.Builder clearUpdatedBy() {
      updatedBy = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'location' field.
      * @return The value.
      */
    public com.fretron.Model.Place getLocation() {
      return location;
    }

    /**
      * Sets the value of the 'location' field.
      * @param value The value of 'location'.
      * @return This builder.
      */
    public com.fretron.Model.Equipment.Builder setLocation(com.fretron.Model.Place value) {
      validate(fields()[7], value);
      this.locationBuilder = null;
      this.location = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'location' field has been set.
      * @return True if the 'location' field has been set, false otherwise.
      */
    public boolean hasLocation() {
      return fieldSetFlags()[7];
    }

    /**
     * Gets the Builder instance for the 'location' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Place.Builder getLocationBuilder() {
      if (locationBuilder == null) {
        if (hasLocation()) {
          setLocationBuilder(com.fretron.Model.Place.newBuilder(location));
        } else {
          setLocationBuilder(com.fretron.Model.Place.newBuilder());
        }
      }
      return locationBuilder;
    }

    /**
     * Sets the Builder instance for the 'location' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.Equipment.Builder setLocationBuilder(com.fretron.Model.Place.Builder value) {
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
    public com.fretron.Model.Equipment.Builder clearLocation() {
      location = null;
      locationBuilder = null;
      fieldSetFlags()[7] = false;
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
    public com.fretron.Model.Equipment.Builder setShipmentNumber(java.lang.String value) {
      validate(fields()[8], value);
      this.shipmentNumber = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'shipmentNumber' field has been set.
      * @return True if the 'shipmentNumber' field has been set, false otherwise.
      */
    public boolean hasShipmentNumber() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'shipmentNumber' field.
      * @return This builder.
      */
    public com.fretron.Model.Equipment.Builder clearShipmentNumber() {
      shipmentNumber = null;
      fieldSetFlags()[8] = false;
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
    public com.fretron.Model.Equipment.Builder setUpdates(com.fretron.Model.Updates value) {
      validate(fields()[9], value);
      this.updatesBuilder = null;
      this.updates = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'updates' field has been set.
      * @return True if the 'updates' field has been set, false otherwise.
      */
    public boolean hasUpdates() {
      return fieldSetFlags()[9];
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
    public com.fretron.Model.Equipment.Builder setUpdatesBuilder(com.fretron.Model.Updates.Builder value) {
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
    public com.fretron.Model.Equipment.Builder clearUpdates() {
      updates = null;
      updatesBuilder = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public Equipment build() {
      try {
        Equipment record = new Equipment();
        record._id = fieldSetFlags()[0] ? this._id : (java.lang.String) defaultValue(fields()[0]);
        record.inventoryNo = fieldSetFlags()[1] ? this.inventoryNo : (java.lang.String) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.String) defaultValue(fields()[2]);
        record.catagory = fieldSetFlags()[3] ? this.catagory : (java.lang.String) defaultValue(fields()[3]);
        record.name = fieldSetFlags()[4] ? this.name : (java.lang.String) defaultValue(fields()[4]);
        record.orgId = fieldSetFlags()[5] ? this.orgId : (java.lang.String) defaultValue(fields()[5]);
        record.updatedBy = fieldSetFlags()[6] ? this.updatedBy : (java.lang.String) defaultValue(fields()[6]);
        if (locationBuilder != null) {
          record.location = this.locationBuilder.build();
        } else {
          record.location = fieldSetFlags()[7] ? this.location : (com.fretron.Model.Place) defaultValue(fields()[7]);
        }
        record.shipmentNumber = fieldSetFlags()[8] ? this.shipmentNumber : (java.lang.String) defaultValue(fields()[8]);
        if (updatesBuilder != null) {
          record.updates = this.updatesBuilder.build();
        } else {
          record.updates = fieldSetFlags()[9] ? this.updates : (com.fretron.Model.Updates) defaultValue(fields()[9]);
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
