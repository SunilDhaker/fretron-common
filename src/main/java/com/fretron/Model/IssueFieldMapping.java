/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class IssueFieldMapping extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5010399589717782198L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IssueFieldMapping\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"issueFilledId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"roleFilledId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String issueFilledId;
  @Deprecated public java.lang.String roleFilledId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public IssueFieldMapping() {}

  /**
   * All-args constructor.
   * @param issueFilledId The new value for issueFilledId
   * @param roleFilledId The new value for roleFilledId
   */
  public IssueFieldMapping(java.lang.String issueFilledId, java.lang.String roleFilledId) {
    this.issueFilledId = issueFilledId;
    this.roleFilledId = roleFilledId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return issueFilledId;
    case 1: return roleFilledId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: issueFilledId = (java.lang.String)value$; break;
    case 1: roleFilledId = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'issueFilledId' field.
   * @return The value of the 'issueFilledId' field.
   */
  public java.lang.String getIssueFilledId() {
    return issueFilledId;
  }

  /**
   * Sets the value of the 'issueFilledId' field.
   * @param value the value to set.
   */
  public void setIssueFilledId(java.lang.String value) {
    this.issueFilledId = value;
  }

  /**
   * Gets the value of the 'roleFilledId' field.
   * @return The value of the 'roleFilledId' field.
   */
  public java.lang.String getRoleFilledId() {
    return roleFilledId;
  }

  /**
   * Sets the value of the 'roleFilledId' field.
   * @param value the value to set.
   */
  public void setRoleFilledId(java.lang.String value) {
    this.roleFilledId = value;
  }

  /**
   * Creates a new IssueFieldMapping RecordBuilder.
   * @return A new IssueFieldMapping RecordBuilder
   */
  public static com.fretron.Model.IssueFieldMapping.Builder newBuilder() {
    return new com.fretron.Model.IssueFieldMapping.Builder();
  }

  /**
   * Creates a new IssueFieldMapping RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new IssueFieldMapping RecordBuilder
   */
  public static com.fretron.Model.IssueFieldMapping.Builder newBuilder(com.fretron.Model.IssueFieldMapping.Builder other) {
    return new com.fretron.Model.IssueFieldMapping.Builder(other);
  }

  /**
   * Creates a new IssueFieldMapping RecordBuilder by copying an existing IssueFieldMapping instance.
   * @param other The existing instance to copy.
   * @return A new IssueFieldMapping RecordBuilder
   */
  public static com.fretron.Model.IssueFieldMapping.Builder newBuilder(com.fretron.Model.IssueFieldMapping other) {
    return new com.fretron.Model.IssueFieldMapping.Builder(other);
  }

  /**
   * RecordBuilder for IssueFieldMapping instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IssueFieldMapping>
    implements org.apache.avro.data.RecordBuilder<IssueFieldMapping> {

    private java.lang.String issueFilledId;
    private java.lang.String roleFilledId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.IssueFieldMapping.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.issueFilledId)) {
        this.issueFilledId = data().deepCopy(fields()[0].schema(), other.issueFilledId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.roleFilledId)) {
        this.roleFilledId = data().deepCopy(fields()[1].schema(), other.roleFilledId);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing IssueFieldMapping instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.IssueFieldMapping other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.issueFilledId)) {
        this.issueFilledId = data().deepCopy(fields()[0].schema(), other.issueFilledId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.roleFilledId)) {
        this.roleFilledId = data().deepCopy(fields()[1].schema(), other.roleFilledId);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'issueFilledId' field.
      * @return The value.
      */
    public java.lang.String getIssueFilledId() {
      return issueFilledId;
    }

    /**
      * Sets the value of the 'issueFilledId' field.
      * @param value The value of 'issueFilledId'.
      * @return This builder.
      */
    public com.fretron.Model.IssueFieldMapping.Builder setIssueFilledId(java.lang.String value) {
      validate(fields()[0], value);
      this.issueFilledId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'issueFilledId' field has been set.
      * @return True if the 'issueFilledId' field has been set, false otherwise.
      */
    public boolean hasIssueFilledId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'issueFilledId' field.
      * @return This builder.
      */
    public com.fretron.Model.IssueFieldMapping.Builder clearIssueFilledId() {
      issueFilledId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'roleFilledId' field.
      * @return The value.
      */
    public java.lang.String getRoleFilledId() {
      return roleFilledId;
    }

    /**
      * Sets the value of the 'roleFilledId' field.
      * @param value The value of 'roleFilledId'.
      * @return This builder.
      */
    public com.fretron.Model.IssueFieldMapping.Builder setRoleFilledId(java.lang.String value) {
      validate(fields()[1], value);
      this.roleFilledId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'roleFilledId' field has been set.
      * @return True if the 'roleFilledId' field has been set, false otherwise.
      */
    public boolean hasRoleFilledId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'roleFilledId' field.
      * @return This builder.
      */
    public com.fretron.Model.IssueFieldMapping.Builder clearRoleFilledId() {
      roleFilledId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public IssueFieldMapping build() {
      try {
        IssueFieldMapping record = new IssueFieldMapping();
        record.issueFilledId = fieldSetFlags()[0] ? this.issueFilledId : (java.lang.String) defaultValue(fields()[0]);
        record.roleFilledId = fieldSetFlags()[1] ? this.roleFilledId : (java.lang.String) defaultValue(fields()[1]);
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