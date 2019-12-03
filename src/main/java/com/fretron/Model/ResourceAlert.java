/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ResourceAlert extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7328594038851023369L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ResourceAlert\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"closedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"snoozTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"createdAt\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"updatedAt\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String description;
  @Deprecated public java.lang.String type;
  @Deprecated public java.lang.String status;
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String closedBy;
  @Deprecated public java.lang.Long snoozTime;
  @Deprecated public java.lang.Long createdAt;
  @Deprecated public java.lang.Long updatedAt;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ResourceAlert() {}

  /**
   * All-args constructor.
   * @param description The new value for description
   * @param type The new value for type
   * @param status The new value for status
   * @param uuid The new value for uuid
   * @param closedBy The new value for closedBy
   * @param snoozTime The new value for snoozTime
   * @param createdAt The new value for createdAt
   * @param updatedAt The new value for updatedAt
   */
  public ResourceAlert(java.lang.String description, java.lang.String type, java.lang.String status, java.lang.String uuid, java.lang.String closedBy, java.lang.Long snoozTime, java.lang.Long createdAt, java.lang.Long updatedAt) {
    this.description = description;
    this.type = type;
    this.status = status;
    this.uuid = uuid;
    this.closedBy = closedBy;
    this.snoozTime = snoozTime;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return description;
    case 1: return type;
    case 2: return status;
    case 3: return uuid;
    case 4: return closedBy;
    case 5: return snoozTime;
    case 6: return createdAt;
    case 7: return updatedAt;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: description = (java.lang.String)value$; break;
    case 1: type = (java.lang.String)value$; break;
    case 2: status = (java.lang.String)value$; break;
    case 3: uuid = (java.lang.String)value$; break;
    case 4: closedBy = (java.lang.String)value$; break;
    case 5: snoozTime = (java.lang.Long)value$; break;
    case 6: createdAt = (java.lang.Long)value$; break;
    case 7: updatedAt = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'closedBy' field.
   * @return The value of the 'closedBy' field.
   */
  public java.lang.String getClosedBy() {
    return closedBy;
  }

  /**
   * Sets the value of the 'closedBy' field.
   * @param value the value to set.
   */
  public void setClosedBy(java.lang.String value) {
    this.closedBy = value;
  }

  /**
   * Gets the value of the 'snoozTime' field.
   * @return The value of the 'snoozTime' field.
   */
  public java.lang.Long getSnoozTime() {
    return snoozTime;
  }

  /**
   * Sets the value of the 'snoozTime' field.
   * @param value the value to set.
   */
  public void setSnoozTime(java.lang.Long value) {
    this.snoozTime = value;
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
   * Gets the value of the 'updatedAt' field.
   * @return The value of the 'updatedAt' field.
   */
  public java.lang.Long getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the value of the 'updatedAt' field.
   * @param value the value to set.
   */
  public void setUpdatedAt(java.lang.Long value) {
    this.updatedAt = value;
  }

  /**
   * Creates a new ResourceAlert RecordBuilder.
   * @return A new ResourceAlert RecordBuilder
   */
  public static com.fretron.Model.ResourceAlert.Builder newBuilder() {
    return new com.fretron.Model.ResourceAlert.Builder();
  }

  /**
   * Creates a new ResourceAlert RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ResourceAlert RecordBuilder
   */
  public static com.fretron.Model.ResourceAlert.Builder newBuilder(com.fretron.Model.ResourceAlert.Builder other) {
    return new com.fretron.Model.ResourceAlert.Builder(other);
  }

  /**
   * Creates a new ResourceAlert RecordBuilder by copying an existing ResourceAlert instance.
   * @param other The existing instance to copy.
   * @return A new ResourceAlert RecordBuilder
   */
  public static com.fretron.Model.ResourceAlert.Builder newBuilder(com.fretron.Model.ResourceAlert other) {
    return new com.fretron.Model.ResourceAlert.Builder(other);
  }

  /**
   * RecordBuilder for ResourceAlert instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ResourceAlert>
    implements org.apache.avro.data.RecordBuilder<ResourceAlert> {

    private java.lang.String description;
    private java.lang.String type;
    private java.lang.String status;
    private java.lang.String uuid;
    private java.lang.String closedBy;
    private java.lang.Long snoozTime;
    private java.lang.Long createdAt;
    private java.lang.Long updatedAt;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.ResourceAlert.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.description)) {
        this.description = data().deepCopy(fields()[0].schema(), other.description);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.uuid)) {
        this.uuid = data().deepCopy(fields()[3].schema(), other.uuid);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.closedBy)) {
        this.closedBy = data().deepCopy(fields()[4].schema(), other.closedBy);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.snoozTime)) {
        this.snoozTime = data().deepCopy(fields()[5].schema(), other.snoozTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[6].schema(), other.createdAt);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.updatedAt)) {
        this.updatedAt = data().deepCopy(fields()[7].schema(), other.updatedAt);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ResourceAlert instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.ResourceAlert other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.description)) {
        this.description = data().deepCopy(fields()[0].schema(), other.description);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.uuid)) {
        this.uuid = data().deepCopy(fields()[3].schema(), other.uuid);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.closedBy)) {
        this.closedBy = data().deepCopy(fields()[4].schema(), other.closedBy);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.snoozTime)) {
        this.snoozTime = data().deepCopy(fields()[5].schema(), other.snoozTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[6].schema(), other.createdAt);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.updatedAt)) {
        this.updatedAt = data().deepCopy(fields()[7].schema(), other.updatedAt);
        fieldSetFlags()[7] = true;
      }
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
    public com.fretron.Model.ResourceAlert.Builder setDescription(java.lang.String value) {
      validate(fields()[0], value);
      this.description = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public com.fretron.Model.ResourceAlert.Builder clearDescription() {
      description = null;
      fieldSetFlags()[0] = false;
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
    public com.fretron.Model.ResourceAlert.Builder setType(java.lang.String value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.fretron.Model.ResourceAlert.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
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
    public com.fretron.Model.ResourceAlert.Builder setStatus(java.lang.String value) {
      validate(fields()[2], value);
      this.status = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.fretron.Model.ResourceAlert.Builder clearStatus() {
      status = null;
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
    public com.fretron.Model.ResourceAlert.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.ResourceAlert.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'closedBy' field.
      * @return The value.
      */
    public java.lang.String getClosedBy() {
      return closedBy;
    }

    /**
      * Sets the value of the 'closedBy' field.
      * @param value The value of 'closedBy'.
      * @return This builder.
      */
    public com.fretron.Model.ResourceAlert.Builder setClosedBy(java.lang.String value) {
      validate(fields()[4], value);
      this.closedBy = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'closedBy' field has been set.
      * @return True if the 'closedBy' field has been set, false otherwise.
      */
    public boolean hasClosedBy() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'closedBy' field.
      * @return This builder.
      */
    public com.fretron.Model.ResourceAlert.Builder clearClosedBy() {
      closedBy = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'snoozTime' field.
      * @return The value.
      */
    public java.lang.Long getSnoozTime() {
      return snoozTime;
    }

    /**
      * Sets the value of the 'snoozTime' field.
      * @param value The value of 'snoozTime'.
      * @return This builder.
      */
    public com.fretron.Model.ResourceAlert.Builder setSnoozTime(java.lang.Long value) {
      validate(fields()[5], value);
      this.snoozTime = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'snoozTime' field has been set.
      * @return True if the 'snoozTime' field has been set, false otherwise.
      */
    public boolean hasSnoozTime() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'snoozTime' field.
      * @return This builder.
      */
    public com.fretron.Model.ResourceAlert.Builder clearSnoozTime() {
      snoozTime = null;
      fieldSetFlags()[5] = false;
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
    public com.fretron.Model.ResourceAlert.Builder setCreatedAt(java.lang.Long value) {
      validate(fields()[6], value);
      this.createdAt = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'createdAt' field has been set.
      * @return True if the 'createdAt' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'createdAt' field.
      * @return This builder.
      */
    public com.fretron.Model.ResourceAlert.Builder clearCreatedAt() {
      createdAt = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'updatedAt' field.
      * @return The value.
      */
    public java.lang.Long getUpdatedAt() {
      return updatedAt;
    }

    /**
      * Sets the value of the 'updatedAt' field.
      * @param value The value of 'updatedAt'.
      * @return This builder.
      */
    public com.fretron.Model.ResourceAlert.Builder setUpdatedAt(java.lang.Long value) {
      validate(fields()[7], value);
      this.updatedAt = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'updatedAt' field has been set.
      * @return True if the 'updatedAt' field has been set, false otherwise.
      */
    public boolean hasUpdatedAt() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'updatedAt' field.
      * @return This builder.
      */
    public com.fretron.Model.ResourceAlert.Builder clearUpdatedAt() {
      updatedAt = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public ResourceAlert build() {
      try {
        ResourceAlert record = new ResourceAlert();
        record.description = fieldSetFlags()[0] ? this.description : (java.lang.String) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.String) defaultValue(fields()[1]);
        record.status = fieldSetFlags()[2] ? this.status : (java.lang.String) defaultValue(fields()[2]);
        record.uuid = fieldSetFlags()[3] ? this.uuid : (java.lang.String) defaultValue(fields()[3]);
        record.closedBy = fieldSetFlags()[4] ? this.closedBy : (java.lang.String) defaultValue(fields()[4]);
        record.snoozTime = fieldSetFlags()[5] ? this.snoozTime : (java.lang.Long) defaultValue(fields()[5]);
        record.createdAt = fieldSetFlags()[6] ? this.createdAt : (java.lang.Long) defaultValue(fields()[6]);
        record.updatedAt = fieldSetFlags()[7] ? this.updatedAt : (java.lang.Long) defaultValue(fields()[7]);
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
