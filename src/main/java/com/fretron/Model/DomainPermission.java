/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DomainPermission extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5801343377947843L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DomainPermission\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"entity\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String entity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DomainPermission() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param entity The new value for entity
   */
  public DomainPermission(java.lang.String uuid, java.lang.String entity) {
    this.uuid = uuid;
    this.entity = entity;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return entity;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: entity = (java.lang.String)value$; break;
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
   * Gets the value of the 'entity' field.
   * @return The value of the 'entity' field.
   */
  public java.lang.String getEntity() {
    return entity;
  }

  /**
   * Sets the value of the 'entity' field.
   * @param value the value to set.
   */
  public void setEntity(java.lang.String value) {
    this.entity = value;
  }

  /**
   * Creates a new DomainPermission RecordBuilder.
   * @return A new DomainPermission RecordBuilder
   */
  public static com.fretron.Model.DomainPermission.Builder newBuilder() {
    return new com.fretron.Model.DomainPermission.Builder();
  }

  /**
   * Creates a new DomainPermission RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DomainPermission RecordBuilder
   */
  public static com.fretron.Model.DomainPermission.Builder newBuilder(com.fretron.Model.DomainPermission.Builder other) {
    return new com.fretron.Model.DomainPermission.Builder(other);
  }

  /**
   * Creates a new DomainPermission RecordBuilder by copying an existing DomainPermission instance.
   * @param other The existing instance to copy.
   * @return A new DomainPermission RecordBuilder
   */
  public static com.fretron.Model.DomainPermission.Builder newBuilder(com.fretron.Model.DomainPermission other) {
    return new com.fretron.Model.DomainPermission.Builder(other);
  }

  /**
   * RecordBuilder for DomainPermission instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DomainPermission>
    implements org.apache.avro.data.RecordBuilder<DomainPermission> {

    private java.lang.String uuid;
    private java.lang.String entity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.DomainPermission.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.entity)) {
        this.entity = data().deepCopy(fields()[1].schema(), other.entity);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DomainPermission instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.DomainPermission other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.entity)) {
        this.entity = data().deepCopy(fields()[1].schema(), other.entity);
        fieldSetFlags()[1] = true;
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
    public com.fretron.Model.DomainPermission.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.DomainPermission.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'entity' field.
      * @return The value.
      */
    public java.lang.String getEntity() {
      return entity;
    }

    /**
      * Sets the value of the 'entity' field.
      * @param value The value of 'entity'.
      * @return This builder.
      */
    public com.fretron.Model.DomainPermission.Builder setEntity(java.lang.String value) {
      validate(fields()[1], value);
      this.entity = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'entity' field has been set.
      * @return True if the 'entity' field has been set, false otherwise.
      */
    public boolean hasEntity() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'entity' field.
      * @return This builder.
      */
    public com.fretron.Model.DomainPermission.Builder clearEntity() {
      entity = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public DomainPermission build() {
      try {
        DomainPermission record = new DomainPermission();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.entity = fieldSetFlags()[1] ? this.entity : (java.lang.String) defaultValue(fields()[1]);
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
