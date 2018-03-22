/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MetaData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3302232649409211889L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MetaData\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"clazz\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"addedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"accessibility\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String clazz;
  @Deprecated public java.lang.String addedBy;
  @Deprecated public java.lang.String source;
  @Deprecated public java.lang.String accessibility;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MetaData() {}

  /**
   * All-args constructor.
   * @param clazz The new value for clazz
   * @param addedBy The new value for addedBy
   * @param source The new value for source
   * @param accessibility The new value for accessibility
   */
  public MetaData(java.lang.String clazz, java.lang.String addedBy, java.lang.String source, java.lang.String accessibility) {
    this.clazz = clazz;
    this.addedBy = addedBy;
    this.source = source;
    this.accessibility = accessibility;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return clazz;
    case 1: return addedBy;
    case 2: return source;
    case 3: return accessibility;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: clazz = (java.lang.String)value$; break;
    case 1: addedBy = (java.lang.String)value$; break;
    case 2: source = (java.lang.String)value$; break;
    case 3: accessibility = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'clazz' field.
   * @return The value of the 'clazz' field.
   */
  public java.lang.String getClazz() {
    return clazz;
  }

  /**
   * Sets the value of the 'clazz' field.
   * @param value the value to set.
   */
  public void setClazz(java.lang.String value) {
    this.clazz = value;
  }

  /**
   * Gets the value of the 'addedBy' field.
   * @return The value of the 'addedBy' field.
   */
  public java.lang.String getAddedBy() {
    return addedBy;
  }

  /**
   * Sets the value of the 'addedBy' field.
   * @param value the value to set.
   */
  public void setAddedBy(java.lang.String value) {
    this.addedBy = value;
  }

  /**
   * Gets the value of the 'source' field.
   * @return The value of the 'source' field.
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Sets the value of the 'source' field.
   * @param value the value to set.
   */
  public void setSource(java.lang.String value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'accessibility' field.
   * @return The value of the 'accessibility' field.
   */
  public java.lang.String getAccessibility() {
    return accessibility;
  }

  /**
   * Sets the value of the 'accessibility' field.
   * @param value the value to set.
   */
  public void setAccessibility(java.lang.String value) {
    this.accessibility = value;
  }

  /**
   * Creates a new MetaData RecordBuilder.
   * @return A new MetaData RecordBuilder
   */
  public static com.fretron.Model.MetaData.Builder newBuilder() {
    return new com.fretron.Model.MetaData.Builder();
  }

  /**
   * Creates a new MetaData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MetaData RecordBuilder
   */
  public static com.fretron.Model.MetaData.Builder newBuilder(com.fretron.Model.MetaData.Builder other) {
    return new com.fretron.Model.MetaData.Builder(other);
  }

  /**
   * Creates a new MetaData RecordBuilder by copying an existing MetaData instance.
   * @param other The existing instance to copy.
   * @return A new MetaData RecordBuilder
   */
  public static com.fretron.Model.MetaData.Builder newBuilder(com.fretron.Model.MetaData other) {
    return new com.fretron.Model.MetaData.Builder(other);
  }

  /**
   * RecordBuilder for MetaData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MetaData>
    implements org.apache.avro.data.RecordBuilder<MetaData> {

    private java.lang.String clazz;
    private java.lang.String addedBy;
    private java.lang.String source;
    private java.lang.String accessibility;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.MetaData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.clazz)) {
        this.clazz = data().deepCopy(fields()[0].schema(), other.clazz);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.addedBy)) {
        this.addedBy = data().deepCopy(fields()[1].schema(), other.addedBy);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.source)) {
        this.source = data().deepCopy(fields()[2].schema(), other.source);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.accessibility)) {
        this.accessibility = data().deepCopy(fields()[3].schema(), other.accessibility);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing MetaData instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.MetaData other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.clazz)) {
        this.clazz = data().deepCopy(fields()[0].schema(), other.clazz);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.addedBy)) {
        this.addedBy = data().deepCopy(fields()[1].schema(), other.addedBy);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.source)) {
        this.source = data().deepCopy(fields()[2].schema(), other.source);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.accessibility)) {
        this.accessibility = data().deepCopy(fields()[3].schema(), other.accessibility);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'clazz' field.
      * @return The value.
      */
    public java.lang.String getClazz() {
      return clazz;
    }

    /**
      * Sets the value of the 'clazz' field.
      * @param value The value of 'clazz'.
      * @return This builder.
      */
    public com.fretron.Model.MetaData.Builder setClazz(java.lang.String value) {
      validate(fields()[0], value);
      this.clazz = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'clazz' field has been set.
      * @return True if the 'clazz' field has been set, false otherwise.
      */
    public boolean hasClazz() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'clazz' field.
      * @return This builder.
      */
    public com.fretron.Model.MetaData.Builder clearClazz() {
      clazz = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'addedBy' field.
      * @return The value.
      */
    public java.lang.String getAddedBy() {
      return addedBy;
    }

    /**
      * Sets the value of the 'addedBy' field.
      * @param value The value of 'addedBy'.
      * @return This builder.
      */
    public com.fretron.Model.MetaData.Builder setAddedBy(java.lang.String value) {
      validate(fields()[1], value);
      this.addedBy = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'addedBy' field has been set.
      * @return True if the 'addedBy' field has been set, false otherwise.
      */
    public boolean hasAddedBy() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'addedBy' field.
      * @return This builder.
      */
    public com.fretron.Model.MetaData.Builder clearAddedBy() {
      addedBy = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'source' field.
      * @return The value.
      */
    public java.lang.String getSource() {
      return source;
    }

    /**
      * Sets the value of the 'source' field.
      * @param value The value of 'source'.
      * @return This builder.
      */
    public com.fretron.Model.MetaData.Builder setSource(java.lang.String value) {
      validate(fields()[2], value);
      this.source = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'source' field has been set.
      * @return True if the 'source' field has been set, false otherwise.
      */
    public boolean hasSource() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'source' field.
      * @return This builder.
      */
    public com.fretron.Model.MetaData.Builder clearSource() {
      source = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'accessibility' field.
      * @return The value.
      */
    public java.lang.String getAccessibility() {
      return accessibility;
    }

    /**
      * Sets the value of the 'accessibility' field.
      * @param value The value of 'accessibility'.
      * @return This builder.
      */
    public com.fretron.Model.MetaData.Builder setAccessibility(java.lang.String value) {
      validate(fields()[3], value);
      this.accessibility = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'accessibility' field has been set.
      * @return True if the 'accessibility' field has been set, false otherwise.
      */
    public boolean hasAccessibility() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'accessibility' field.
      * @return This builder.
      */
    public com.fretron.Model.MetaData.Builder clearAccessibility() {
      accessibility = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public MetaData build() {
      try {
        MetaData record = new MetaData();
        record.clazz = fieldSetFlags()[0] ? this.clazz : (java.lang.String) defaultValue(fields()[0]);
        record.addedBy = fieldSetFlags()[1] ? this.addedBy : (java.lang.String) defaultValue(fields()[1]);
        record.source = fieldSetFlags()[2] ? this.source : (java.lang.String) defaultValue(fields()[2]);
        record.accessibility = fieldSetFlags()[3] ? this.accessibility : (java.lang.String) defaultValue(fields()[3]);
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