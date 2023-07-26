/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class InventoryType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3428780067544672134L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InventoryType\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"measurementType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uom\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isHidden\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"customFields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CustomFields\",\"fields\":[{\"name\":\"fieldType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"fieldKey\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"multiple\",\"type\":\"boolean\",\"default\":false},{\"name\":\"isRemark\",\"type\":\"boolean\",\"default\":false},{\"name\":\"remark\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"required\",\"type\":\"boolean\",\"default\":false},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"options\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"indexedValue\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"valueType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"input\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"unit\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"accessType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"isSystemInventory\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"assignTo\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"assignmentType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"accessoryName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String orgId;
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String category;
  @Deprecated public java.lang.String measurementType;
  @Deprecated public java.lang.String uom;
  @Deprecated public java.lang.Boolean isHidden;
  @Deprecated public java.util.List<com.fretron.Model.CustomFields> customFields;
  @Deprecated public java.lang.Boolean isSystemInventory;
  @Deprecated public java.util.List<java.lang.String> assignTo;
  @Deprecated public java.lang.String assignmentType;
  @Deprecated public java.lang.String accessoryName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InventoryType() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param orgId The new value for orgId
   * @param name The new value for name
   * @param category The new value for category
   * @param measurementType The new value for measurementType
   * @param uom The new value for uom
   * @param isHidden The new value for isHidden
   * @param customFields The new value for customFields
   * @param isSystemInventory The new value for isSystemInventory
   * @param assignTo The new value for assignTo
   * @param assignmentType The new value for assignmentType
   * @param accessoryName The new value for accessoryName
   */
  public InventoryType(java.lang.String uuid, java.lang.String orgId, java.lang.String name, java.lang.String category, java.lang.String measurementType, java.lang.String uom, java.lang.Boolean isHidden, java.util.List<com.fretron.Model.CustomFields> customFields, java.lang.Boolean isSystemInventory, java.util.List<java.lang.String> assignTo, java.lang.String assignmentType, java.lang.String accessoryName) {
    this.uuid = uuid;
    this.orgId = orgId;
    this.name = name;
    this.category = category;
    this.measurementType = measurementType;
    this.uom = uom;
    this.isHidden = isHidden;
    this.customFields = customFields;
    this.isSystemInventory = isSystemInventory;
    this.assignTo = assignTo;
    this.assignmentType = assignmentType;
    this.accessoryName = accessoryName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return orgId;
    case 2: return name;
    case 3: return category;
    case 4: return measurementType;
    case 5: return uom;
    case 6: return isHidden;
    case 7: return customFields;
    case 8: return isSystemInventory;
    case 9: return assignTo;
    case 10: return assignmentType;
    case 11: return accessoryName;
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
    case 3: category = (java.lang.String)value$; break;
    case 4: measurementType = (java.lang.String)value$; break;
    case 5: uom = (java.lang.String)value$; break;
    case 6: isHidden = (java.lang.Boolean)value$; break;
    case 7: customFields = (java.util.List<com.fretron.Model.CustomFields>)value$; break;
    case 8: isSystemInventory = (java.lang.Boolean)value$; break;
    case 9: assignTo = (java.util.List<java.lang.String>)value$; break;
    case 10: assignmentType = (java.lang.String)value$; break;
    case 11: accessoryName = (java.lang.String)value$; break;
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
   * Gets the value of the 'category' field.
   * @return The value of the 'category' field.
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * Sets the value of the 'category' field.
   * @param value the value to set.
   */
  public void setCategory(java.lang.String value) {
    this.category = value;
  }

  /**
   * Gets the value of the 'measurementType' field.
   * @return The value of the 'measurementType' field.
   */
  public java.lang.String getMeasurementType() {
    return measurementType;
  }

  /**
   * Sets the value of the 'measurementType' field.
   * @param value the value to set.
   */
  public void setMeasurementType(java.lang.String value) {
    this.measurementType = value;
  }

  /**
   * Gets the value of the 'uom' field.
   * @return The value of the 'uom' field.
   */
  public java.lang.String getUom() {
    return uom;
  }

  /**
   * Sets the value of the 'uom' field.
   * @param value the value to set.
   */
  public void setUom(java.lang.String value) {
    this.uom = value;
  }

  /**
   * Gets the value of the 'isHidden' field.
   * @return The value of the 'isHidden' field.
   */
  public java.lang.Boolean getIsHidden() {
    return isHidden;
  }

  /**
   * Sets the value of the 'isHidden' field.
   * @param value the value to set.
   */
  public void setIsHidden(java.lang.Boolean value) {
    this.isHidden = value;
  }

  /**
   * Gets the value of the 'customFields' field.
   * @return The value of the 'customFields' field.
   */
  public java.util.List<com.fretron.Model.CustomFields> getCustomFields() {
    return customFields;
  }

  /**
   * Sets the value of the 'customFields' field.
   * @param value the value to set.
   */
  public void setCustomFields(java.util.List<com.fretron.Model.CustomFields> value) {
    this.customFields = value;
  }

  /**
   * Gets the value of the 'isSystemInventory' field.
   * @return The value of the 'isSystemInventory' field.
   */
  public java.lang.Boolean getIsSystemInventory() {
    return isSystemInventory;
  }

  /**
   * Sets the value of the 'isSystemInventory' field.
   * @param value the value to set.
   */
  public void setIsSystemInventory(java.lang.Boolean value) {
    this.isSystemInventory = value;
  }

  /**
   * Gets the value of the 'assignTo' field.
   * @return The value of the 'assignTo' field.
   */
  public java.util.List<java.lang.String> getAssignTo() {
    return assignTo;
  }

  /**
   * Sets the value of the 'assignTo' field.
   * @param value the value to set.
   */
  public void setAssignTo(java.util.List<java.lang.String> value) {
    this.assignTo = value;
  }

  /**
   * Gets the value of the 'assignmentType' field.
   * @return The value of the 'assignmentType' field.
   */
  public java.lang.String getAssignmentType() {
    return assignmentType;
  }

  /**
   * Sets the value of the 'assignmentType' field.
   * @param value the value to set.
   */
  public void setAssignmentType(java.lang.String value) {
    this.assignmentType = value;
  }

  /**
   * Gets the value of the 'accessoryName' field.
   * @return The value of the 'accessoryName' field.
   */
  public java.lang.String getAccessoryName() {
    return accessoryName;
  }

  /**
   * Sets the value of the 'accessoryName' field.
   * @param value the value to set.
   */
  public void setAccessoryName(java.lang.String value) {
    this.accessoryName = value;
  }

  /**
   * Creates a new InventoryType RecordBuilder.
   * @return A new InventoryType RecordBuilder
   */
  public static com.fretron.Model.InventoryType.Builder newBuilder() {
    return new com.fretron.Model.InventoryType.Builder();
  }

  /**
   * Creates a new InventoryType RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InventoryType RecordBuilder
   */
  public static com.fretron.Model.InventoryType.Builder newBuilder(com.fretron.Model.InventoryType.Builder other) {
    return new com.fretron.Model.InventoryType.Builder(other);
  }

  /**
   * Creates a new InventoryType RecordBuilder by copying an existing InventoryType instance.
   * @param other The existing instance to copy.
   * @return A new InventoryType RecordBuilder
   */
  public static com.fretron.Model.InventoryType.Builder newBuilder(com.fretron.Model.InventoryType other) {
    return new com.fretron.Model.InventoryType.Builder(other);
  }

  /**
   * RecordBuilder for InventoryType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InventoryType>
    implements org.apache.avro.data.RecordBuilder<InventoryType> {

    private java.lang.String uuid;
    private java.lang.String orgId;
    private java.lang.String name;
    private java.lang.String category;
    private java.lang.String measurementType;
    private java.lang.String uom;
    private java.lang.Boolean isHidden;
    private java.util.List<com.fretron.Model.CustomFields> customFields;
    private java.lang.Boolean isSystemInventory;
    private java.util.List<java.lang.String> assignTo;
    private java.lang.String assignmentType;
    private java.lang.String accessoryName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.InventoryType.Builder other) {
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
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.measurementType)) {
        this.measurementType = data().deepCopy(fields()[4].schema(), other.measurementType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.uom)) {
        this.uom = data().deepCopy(fields()[5].schema(), other.uom);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.isHidden)) {
        this.isHidden = data().deepCopy(fields()[6].schema(), other.isHidden);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.customFields)) {
        this.customFields = data().deepCopy(fields()[7].schema(), other.customFields);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.isSystemInventory)) {
        this.isSystemInventory = data().deepCopy(fields()[8].schema(), other.isSystemInventory);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.assignTo)) {
        this.assignTo = data().deepCopy(fields()[9].schema(), other.assignTo);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.assignmentType)) {
        this.assignmentType = data().deepCopy(fields()[10].schema(), other.assignmentType);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.accessoryName)) {
        this.accessoryName = data().deepCopy(fields()[11].schema(), other.accessoryName);
        fieldSetFlags()[11] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing InventoryType instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.InventoryType other) {
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
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.measurementType)) {
        this.measurementType = data().deepCopy(fields()[4].schema(), other.measurementType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.uom)) {
        this.uom = data().deepCopy(fields()[5].schema(), other.uom);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.isHidden)) {
        this.isHidden = data().deepCopy(fields()[6].schema(), other.isHidden);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.customFields)) {
        this.customFields = data().deepCopy(fields()[7].schema(), other.customFields);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.isSystemInventory)) {
        this.isSystemInventory = data().deepCopy(fields()[8].schema(), other.isSystemInventory);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.assignTo)) {
        this.assignTo = data().deepCopy(fields()[9].schema(), other.assignTo);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.assignmentType)) {
        this.assignmentType = data().deepCopy(fields()[10].schema(), other.assignmentType);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.accessoryName)) {
        this.accessoryName = data().deepCopy(fields()[11].schema(), other.accessoryName);
        fieldSetFlags()[11] = true;
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
    public com.fretron.Model.InventoryType.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.InventoryType.Builder clearUuid() {
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
    public com.fretron.Model.InventoryType.Builder setOrgId(java.lang.String value) {
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
    public com.fretron.Model.InventoryType.Builder clearOrgId() {
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
    public com.fretron.Model.InventoryType.Builder setName(java.lang.String value) {
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
    public com.fretron.Model.InventoryType.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'category' field.
      * @return The value.
      */
    public java.lang.String getCategory() {
      return category;
    }

    /**
      * Sets the value of the 'category' field.
      * @param value The value of 'category'.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder setCategory(java.lang.String value) {
      validate(fields()[3], value);
      this.category = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'category' field has been set.
      * @return True if the 'category' field has been set, false otherwise.
      */
    public boolean hasCategory() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'category' field.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder clearCategory() {
      category = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'measurementType' field.
      * @return The value.
      */
    public java.lang.String getMeasurementType() {
      return measurementType;
    }

    /**
      * Sets the value of the 'measurementType' field.
      * @param value The value of 'measurementType'.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder setMeasurementType(java.lang.String value) {
      validate(fields()[4], value);
      this.measurementType = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'measurementType' field has been set.
      * @return True if the 'measurementType' field has been set, false otherwise.
      */
    public boolean hasMeasurementType() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'measurementType' field.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder clearMeasurementType() {
      measurementType = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'uom' field.
      * @return The value.
      */
    public java.lang.String getUom() {
      return uom;
    }

    /**
      * Sets the value of the 'uom' field.
      * @param value The value of 'uom'.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder setUom(java.lang.String value) {
      validate(fields()[5], value);
      this.uom = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'uom' field has been set.
      * @return True if the 'uom' field has been set, false otherwise.
      */
    public boolean hasUom() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'uom' field.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder clearUom() {
      uom = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'isHidden' field.
      * @return The value.
      */
    public java.lang.Boolean getIsHidden() {
      return isHidden;
    }

    /**
      * Sets the value of the 'isHidden' field.
      * @param value The value of 'isHidden'.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder setIsHidden(java.lang.Boolean value) {
      validate(fields()[6], value);
      this.isHidden = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'isHidden' field has been set.
      * @return True if the 'isHidden' field has been set, false otherwise.
      */
    public boolean hasIsHidden() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'isHidden' field.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder clearIsHidden() {
      isHidden = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'customFields' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.CustomFields> getCustomFields() {
      return customFields;
    }

    /**
      * Sets the value of the 'customFields' field.
      * @param value The value of 'customFields'.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder setCustomFields(java.util.List<com.fretron.Model.CustomFields> value) {
      validate(fields()[7], value);
      this.customFields = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'customFields' field has been set.
      * @return True if the 'customFields' field has been set, false otherwise.
      */
    public boolean hasCustomFields() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'customFields' field.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder clearCustomFields() {
      customFields = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'isSystemInventory' field.
      * @return The value.
      */
    public java.lang.Boolean getIsSystemInventory() {
      return isSystemInventory;
    }

    /**
      * Sets the value of the 'isSystemInventory' field.
      * @param value The value of 'isSystemInventory'.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder setIsSystemInventory(java.lang.Boolean value) {
      validate(fields()[8], value);
      this.isSystemInventory = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'isSystemInventory' field has been set.
      * @return True if the 'isSystemInventory' field has been set, false otherwise.
      */
    public boolean hasIsSystemInventory() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'isSystemInventory' field.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder clearIsSystemInventory() {
      isSystemInventory = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'assignTo' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getAssignTo() {
      return assignTo;
    }

    /**
      * Sets the value of the 'assignTo' field.
      * @param value The value of 'assignTo'.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder setAssignTo(java.util.List<java.lang.String> value) {
      validate(fields()[9], value);
      this.assignTo = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'assignTo' field has been set.
      * @return True if the 'assignTo' field has been set, false otherwise.
      */
    public boolean hasAssignTo() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'assignTo' field.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder clearAssignTo() {
      assignTo = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'assignmentType' field.
      * @return The value.
      */
    public java.lang.String getAssignmentType() {
      return assignmentType;
    }

    /**
      * Sets the value of the 'assignmentType' field.
      * @param value The value of 'assignmentType'.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder setAssignmentType(java.lang.String value) {
      validate(fields()[10], value);
      this.assignmentType = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'assignmentType' field has been set.
      * @return True if the 'assignmentType' field has been set, false otherwise.
      */
    public boolean hasAssignmentType() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'assignmentType' field.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder clearAssignmentType() {
      assignmentType = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'accessoryName' field.
      * @return The value.
      */
    public java.lang.String getAccessoryName() {
      return accessoryName;
    }

    /**
      * Sets the value of the 'accessoryName' field.
      * @param value The value of 'accessoryName'.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder setAccessoryName(java.lang.String value) {
      validate(fields()[11], value);
      this.accessoryName = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'accessoryName' field has been set.
      * @return True if the 'accessoryName' field has been set, false otherwise.
      */
    public boolean hasAccessoryName() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'accessoryName' field.
      * @return This builder.
      */
    public com.fretron.Model.InventoryType.Builder clearAccessoryName() {
      accessoryName = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    public InventoryType build() {
      try {
        InventoryType record = new InventoryType();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.orgId = fieldSetFlags()[1] ? this.orgId : (java.lang.String) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.category = fieldSetFlags()[3] ? this.category : (java.lang.String) defaultValue(fields()[3]);
        record.measurementType = fieldSetFlags()[4] ? this.measurementType : (java.lang.String) defaultValue(fields()[4]);
        record.uom = fieldSetFlags()[5] ? this.uom : (java.lang.String) defaultValue(fields()[5]);
        record.isHidden = fieldSetFlags()[6] ? this.isHidden : (java.lang.Boolean) defaultValue(fields()[6]);
        record.customFields = fieldSetFlags()[7] ? this.customFields : (java.util.List<com.fretron.Model.CustomFields>) defaultValue(fields()[7]);
        record.isSystemInventory = fieldSetFlags()[8] ? this.isSystemInventory : (java.lang.Boolean) defaultValue(fields()[8]);
        record.assignTo = fieldSetFlags()[9] ? this.assignTo : (java.util.List<java.lang.String>) defaultValue(fields()[9]);
        record.assignmentType = fieldSetFlags()[10] ? this.assignmentType : (java.lang.String) defaultValue(fields()[10]);
        record.accessoryName = fieldSetFlags()[11] ? this.accessoryName : (java.lang.String) defaultValue(fields()[11]);
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
