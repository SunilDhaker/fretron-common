/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class IssueExtensionReason extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2868361010817747111L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IssueExtensionReason\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"reason\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"extensionTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"isCustom\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String reason;
  @Deprecated public java.lang.Long extensionTime;
  @Deprecated public java.lang.Boolean isCustom;
  @Deprecated public java.lang.String userId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public IssueExtensionReason() {}

  /**
   * All-args constructor.
   * @param reason The new value for reason
   * @param extensionTime The new value for extensionTime
   * @param isCustom The new value for isCustom
   * @param userId The new value for userId
   */
  public IssueExtensionReason(java.lang.String reason, java.lang.Long extensionTime, java.lang.Boolean isCustom, java.lang.String userId) {
    this.reason = reason;
    this.extensionTime = extensionTime;
    this.isCustom = isCustom;
    this.userId = userId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return reason;
    case 1: return extensionTime;
    case 2: return isCustom;
    case 3: return userId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: reason = (java.lang.String)value$; break;
    case 1: extensionTime = (java.lang.Long)value$; break;
    case 2: isCustom = (java.lang.Boolean)value$; break;
    case 3: userId = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'reason' field.
   * @return The value of the 'reason' field.
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * Sets the value of the 'reason' field.
   * @param value the value to set.
   */
  public void setReason(java.lang.String value) {
    this.reason = value;
  }

  /**
   * Gets the value of the 'extensionTime' field.
   * @return The value of the 'extensionTime' field.
   */
  public java.lang.Long getExtensionTime() {
    return extensionTime;
  }

  /**
   * Sets the value of the 'extensionTime' field.
   * @param value the value to set.
   */
  public void setExtensionTime(java.lang.Long value) {
    this.extensionTime = value;
  }

  /**
   * Gets the value of the 'isCustom' field.
   * @return The value of the 'isCustom' field.
   */
  public java.lang.Boolean getIsCustom() {
    return isCustom;
  }

  /**
   * Sets the value of the 'isCustom' field.
   * @param value the value to set.
   */
  public void setIsCustom(java.lang.Boolean value) {
    this.isCustom = value;
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
   * Creates a new IssueExtensionReason RecordBuilder.
   * @return A new IssueExtensionReason RecordBuilder
   */
  public static com.fretron.Model.IssueExtensionReason.Builder newBuilder() {
    return new com.fretron.Model.IssueExtensionReason.Builder();
  }

  /**
   * Creates a new IssueExtensionReason RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new IssueExtensionReason RecordBuilder
   */
  public static com.fretron.Model.IssueExtensionReason.Builder newBuilder(com.fretron.Model.IssueExtensionReason.Builder other) {
    return new com.fretron.Model.IssueExtensionReason.Builder(other);
  }

  /**
   * Creates a new IssueExtensionReason RecordBuilder by copying an existing IssueExtensionReason instance.
   * @param other The existing instance to copy.
   * @return A new IssueExtensionReason RecordBuilder
   */
  public static com.fretron.Model.IssueExtensionReason.Builder newBuilder(com.fretron.Model.IssueExtensionReason other) {
    return new com.fretron.Model.IssueExtensionReason.Builder(other);
  }

  /**
   * RecordBuilder for IssueExtensionReason instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IssueExtensionReason>
    implements org.apache.avro.data.RecordBuilder<IssueExtensionReason> {

    private java.lang.String reason;
    private java.lang.Long extensionTime;
    private java.lang.Boolean isCustom;
    private java.lang.String userId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.IssueExtensionReason.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.reason)) {
        this.reason = data().deepCopy(fields()[0].schema(), other.reason);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.extensionTime)) {
        this.extensionTime = data().deepCopy(fields()[1].schema(), other.extensionTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.isCustom)) {
        this.isCustom = data().deepCopy(fields()[2].schema(), other.isCustom);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.userId)) {
        this.userId = data().deepCopy(fields()[3].schema(), other.userId);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing IssueExtensionReason instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.IssueExtensionReason other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.reason)) {
        this.reason = data().deepCopy(fields()[0].schema(), other.reason);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.extensionTime)) {
        this.extensionTime = data().deepCopy(fields()[1].schema(), other.extensionTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.isCustom)) {
        this.isCustom = data().deepCopy(fields()[2].schema(), other.isCustom);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.userId)) {
        this.userId = data().deepCopy(fields()[3].schema(), other.userId);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'reason' field.
      * @return The value.
      */
    public java.lang.String getReason() {
      return reason;
    }

    /**
      * Sets the value of the 'reason' field.
      * @param value The value of 'reason'.
      * @return This builder.
      */
    public com.fretron.Model.IssueExtensionReason.Builder setReason(java.lang.String value) {
      validate(fields()[0], value);
      this.reason = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'reason' field has been set.
      * @return True if the 'reason' field has been set, false otherwise.
      */
    public boolean hasReason() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'reason' field.
      * @return This builder.
      */
    public com.fretron.Model.IssueExtensionReason.Builder clearReason() {
      reason = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'extensionTime' field.
      * @return The value.
      */
    public java.lang.Long getExtensionTime() {
      return extensionTime;
    }

    /**
      * Sets the value of the 'extensionTime' field.
      * @param value The value of 'extensionTime'.
      * @return This builder.
      */
    public com.fretron.Model.IssueExtensionReason.Builder setExtensionTime(java.lang.Long value) {
      validate(fields()[1], value);
      this.extensionTime = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'extensionTime' field has been set.
      * @return True if the 'extensionTime' field has been set, false otherwise.
      */
    public boolean hasExtensionTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'extensionTime' field.
      * @return This builder.
      */
    public com.fretron.Model.IssueExtensionReason.Builder clearExtensionTime() {
      extensionTime = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'isCustom' field.
      * @return The value.
      */
    public java.lang.Boolean getIsCustom() {
      return isCustom;
    }

    /**
      * Sets the value of the 'isCustom' field.
      * @param value The value of 'isCustom'.
      * @return This builder.
      */
    public com.fretron.Model.IssueExtensionReason.Builder setIsCustom(java.lang.Boolean value) {
      validate(fields()[2], value);
      this.isCustom = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'isCustom' field has been set.
      * @return True if the 'isCustom' field has been set, false otherwise.
      */
    public boolean hasIsCustom() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'isCustom' field.
      * @return This builder.
      */
    public com.fretron.Model.IssueExtensionReason.Builder clearIsCustom() {
      isCustom = null;
      fieldSetFlags()[2] = false;
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
    public com.fretron.Model.IssueExtensionReason.Builder setUserId(java.lang.String value) {
      validate(fields()[3], value);
      this.userId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public com.fretron.Model.IssueExtensionReason.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public IssueExtensionReason build() {
      try {
        IssueExtensionReason record = new IssueExtensionReason();
        record.reason = fieldSetFlags()[0] ? this.reason : (java.lang.String) defaultValue(fields()[0]);
        record.extensionTime = fieldSetFlags()[1] ? this.extensionTime : (java.lang.Long) defaultValue(fields()[1]);
        record.isCustom = fieldSetFlags()[2] ? this.isCustom : (java.lang.Boolean) defaultValue(fields()[2]);
        record.userId = fieldSetFlags()[3] ? this.userId : (java.lang.String) defaultValue(fields()[3]);
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
