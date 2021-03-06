/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class GroupedCheckPoint extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1614761280317497064L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GroupedCheckPoint\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"checkPoints\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CheckPoint\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"coordinate\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"accessiblity\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<com.fretron.Model.CheckPoint> checkPoints;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GroupedCheckPoint() {}

  /**
   * All-args constructor.
   * @param checkPoints The new value for checkPoints
   */
  public GroupedCheckPoint(java.util.List<com.fretron.Model.CheckPoint> checkPoints) {
    this.checkPoints = checkPoints;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return checkPoints;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: checkPoints = (java.util.List<com.fretron.Model.CheckPoint>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'checkPoints' field.
   * @return The value of the 'checkPoints' field.
   */
  public java.util.List<com.fretron.Model.CheckPoint> getCheckPoints() {
    return checkPoints;
  }

  /**
   * Sets the value of the 'checkPoints' field.
   * @param value the value to set.
   */
  public void setCheckPoints(java.util.List<com.fretron.Model.CheckPoint> value) {
    this.checkPoints = value;
  }

  /**
   * Creates a new GroupedCheckPoint RecordBuilder.
   * @return A new GroupedCheckPoint RecordBuilder
   */
  public static com.fretron.Model.GroupedCheckPoint.Builder newBuilder() {
    return new com.fretron.Model.GroupedCheckPoint.Builder();
  }

  /**
   * Creates a new GroupedCheckPoint RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GroupedCheckPoint RecordBuilder
   */
  public static com.fretron.Model.GroupedCheckPoint.Builder newBuilder(com.fretron.Model.GroupedCheckPoint.Builder other) {
    return new com.fretron.Model.GroupedCheckPoint.Builder(other);
  }

  /**
   * Creates a new GroupedCheckPoint RecordBuilder by copying an existing GroupedCheckPoint instance.
   * @param other The existing instance to copy.
   * @return A new GroupedCheckPoint RecordBuilder
   */
  public static com.fretron.Model.GroupedCheckPoint.Builder newBuilder(com.fretron.Model.GroupedCheckPoint other) {
    return new com.fretron.Model.GroupedCheckPoint.Builder(other);
  }

  /**
   * RecordBuilder for GroupedCheckPoint instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GroupedCheckPoint>
    implements org.apache.avro.data.RecordBuilder<GroupedCheckPoint> {

    private java.util.List<com.fretron.Model.CheckPoint> checkPoints;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.GroupedCheckPoint.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.checkPoints)) {
        this.checkPoints = data().deepCopy(fields()[0].schema(), other.checkPoints);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing GroupedCheckPoint instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.GroupedCheckPoint other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.checkPoints)) {
        this.checkPoints = data().deepCopy(fields()[0].schema(), other.checkPoints);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'checkPoints' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.CheckPoint> getCheckPoints() {
      return checkPoints;
    }

    /**
      * Sets the value of the 'checkPoints' field.
      * @param value The value of 'checkPoints'.
      * @return This builder.
      */
    public com.fretron.Model.GroupedCheckPoint.Builder setCheckPoints(java.util.List<com.fretron.Model.CheckPoint> value) {
      validate(fields()[0], value);
      this.checkPoints = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'checkPoints' field has been set.
      * @return True if the 'checkPoints' field has been set, false otherwise.
      */
    public boolean hasCheckPoints() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'checkPoints' field.
      * @return This builder.
      */
    public com.fretron.Model.GroupedCheckPoint.Builder clearCheckPoints() {
      checkPoints = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public GroupedCheckPoint build() {
      try {
        GroupedCheckPoint record = new GroupedCheckPoint();
        record.checkPoints = fieldSetFlags()[0] ? this.checkPoints : (java.util.List<com.fretron.Model.CheckPoint>) defaultValue(fields()[0]);
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
