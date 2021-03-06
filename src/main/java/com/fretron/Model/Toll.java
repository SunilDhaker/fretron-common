/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Toll extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8145543849194987553L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Toll\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"costs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Cost\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"double\"],\"default\":null}]}}],\"default\":null},{\"name\":\"isCustom\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String name;
  @Deprecated public java.util.List<com.fretron.Model.Cost> costs;
  @Deprecated public java.lang.Boolean isCustom;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Toll() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param costs The new value for costs
   * @param isCustom The new value for isCustom
   */
  public Toll(java.lang.String name, java.util.List<com.fretron.Model.Cost> costs, java.lang.Boolean isCustom) {
    this.name = name;
    this.costs = costs;
    this.isCustom = isCustom;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return costs;
    case 2: return isCustom;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: costs = (java.util.List<com.fretron.Model.Cost>)value$; break;
    case 2: isCustom = (java.lang.Boolean)value$; break;
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
   * Gets the value of the 'costs' field.
   * @return The value of the 'costs' field.
   */
  public java.util.List<com.fretron.Model.Cost> getCosts() {
    return costs;
  }

  /**
   * Sets the value of the 'costs' field.
   * @param value the value to set.
   */
  public void setCosts(java.util.List<com.fretron.Model.Cost> value) {
    this.costs = value;
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
   * Creates a new Toll RecordBuilder.
   * @return A new Toll RecordBuilder
   */
  public static com.fretron.Model.Toll.Builder newBuilder() {
    return new com.fretron.Model.Toll.Builder();
  }

  /**
   * Creates a new Toll RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Toll RecordBuilder
   */
  public static com.fretron.Model.Toll.Builder newBuilder(com.fretron.Model.Toll.Builder other) {
    return new com.fretron.Model.Toll.Builder(other);
  }

  /**
   * Creates a new Toll RecordBuilder by copying an existing Toll instance.
   * @param other The existing instance to copy.
   * @return A new Toll RecordBuilder
   */
  public static com.fretron.Model.Toll.Builder newBuilder(com.fretron.Model.Toll other) {
    return new com.fretron.Model.Toll.Builder(other);
  }

  /**
   * RecordBuilder for Toll instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Toll>
    implements org.apache.avro.data.RecordBuilder<Toll> {

    private java.lang.String name;
    private java.util.List<com.fretron.Model.Cost> costs;
    private java.lang.Boolean isCustom;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Toll.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.costs)) {
        this.costs = data().deepCopy(fields()[1].schema(), other.costs);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.isCustom)) {
        this.isCustom = data().deepCopy(fields()[2].schema(), other.isCustom);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Toll instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Toll other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.costs)) {
        this.costs = data().deepCopy(fields()[1].schema(), other.costs);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.isCustom)) {
        this.isCustom = data().deepCopy(fields()[2].schema(), other.isCustom);
        fieldSetFlags()[2] = true;
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
    public com.fretron.Model.Toll.Builder setName(java.lang.String value) {
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
    public com.fretron.Model.Toll.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'costs' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.Cost> getCosts() {
      return costs;
    }

    /**
      * Sets the value of the 'costs' field.
      * @param value The value of 'costs'.
      * @return This builder.
      */
    public com.fretron.Model.Toll.Builder setCosts(java.util.List<com.fretron.Model.Cost> value) {
      validate(fields()[1], value);
      this.costs = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'costs' field has been set.
      * @return True if the 'costs' field has been set, false otherwise.
      */
    public boolean hasCosts() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'costs' field.
      * @return This builder.
      */
    public com.fretron.Model.Toll.Builder clearCosts() {
      costs = null;
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
    public com.fretron.Model.Toll.Builder setIsCustom(java.lang.Boolean value) {
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
    public com.fretron.Model.Toll.Builder clearIsCustom() {
      isCustom = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Toll build() {
      try {
        Toll record = new Toll();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.costs = fieldSetFlags()[1] ? this.costs : (java.util.List<com.fretron.Model.Cost>) defaultValue(fields()[1]);
        record.isCustom = fieldSetFlags()[2] ? this.isCustom : (java.lang.Boolean) defaultValue(fields()[2]);
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
