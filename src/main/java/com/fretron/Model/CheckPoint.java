/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CheckPoint extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4311355479106413873L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CheckPoint\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"coordinate\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"accessiblity\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String type;
  @Deprecated public java.lang.String orgId;
  @Deprecated public com.fretron.Model.Location coordinate;
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String accessiblity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CheckPoint() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param type The new value for type
   * @param orgId The new value for orgId
   * @param coordinate The new value for coordinate
   * @param uuid The new value for uuid
   * @param accessiblity The new value for accessiblity
   */
  public CheckPoint(java.lang.String name, java.lang.String type, java.lang.String orgId, com.fretron.Model.Location coordinate, java.lang.String uuid, java.lang.String accessiblity) {
    this.name = name;
    this.type = type;
    this.orgId = orgId;
    this.coordinate = coordinate;
    this.uuid = uuid;
    this.accessiblity = accessiblity;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return type;
    case 2: return orgId;
    case 3: return coordinate;
    case 4: return uuid;
    case 5: return accessiblity;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: type = (java.lang.String)value$; break;
    case 2: orgId = (java.lang.String)value$; break;
    case 3: coordinate = (com.fretron.Model.Location)value$; break;
    case 4: uuid = (java.lang.String)value$; break;
    case 5: accessiblity = (java.lang.String)value$; break;
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
   * Gets the value of the 'coordinate' field.
   * @return The value of the 'coordinate' field.
   */
  public com.fretron.Model.Location getCoordinate() {
    return coordinate;
  }

  /**
   * Sets the value of the 'coordinate' field.
   * @param value the value to set.
   */
  public void setCoordinate(com.fretron.Model.Location value) {
    this.coordinate = value;
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
   * Gets the value of the 'accessiblity' field.
   * @return The value of the 'accessiblity' field.
   */
  public java.lang.String getAccessiblity() {
    return accessiblity;
  }

  /**
   * Sets the value of the 'accessiblity' field.
   * @param value the value to set.
   */
  public void setAccessiblity(java.lang.String value) {
    this.accessiblity = value;
  }

  /**
   * Creates a new CheckPoint RecordBuilder.
   * @return A new CheckPoint RecordBuilder
   */
  public static com.fretron.Model.CheckPoint.Builder newBuilder() {
    return new com.fretron.Model.CheckPoint.Builder();
  }

  /**
   * Creates a new CheckPoint RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CheckPoint RecordBuilder
   */
  public static com.fretron.Model.CheckPoint.Builder newBuilder(com.fretron.Model.CheckPoint.Builder other) {
    return new com.fretron.Model.CheckPoint.Builder(other);
  }

  /**
   * Creates a new CheckPoint RecordBuilder by copying an existing CheckPoint instance.
   * @param other The existing instance to copy.
   * @return A new CheckPoint RecordBuilder
   */
  public static com.fretron.Model.CheckPoint.Builder newBuilder(com.fretron.Model.CheckPoint other) {
    return new com.fretron.Model.CheckPoint.Builder(other);
  }

  /**
   * RecordBuilder for CheckPoint instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CheckPoint>
    implements org.apache.avro.data.RecordBuilder<CheckPoint> {

    private java.lang.String name;
    private java.lang.String type;
    private java.lang.String orgId;
    private com.fretron.Model.Location coordinate;
    private com.fretron.Model.Location.Builder coordinateBuilder;
    private java.lang.String uuid;
    private java.lang.String accessiblity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.CheckPoint.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.orgId)) {
        this.orgId = data().deepCopy(fields()[2].schema(), other.orgId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.coordinate)) {
        this.coordinate = data().deepCopy(fields()[3].schema(), other.coordinate);
        fieldSetFlags()[3] = true;
      }
      if (other.hasCoordinateBuilder()) {
        this.coordinateBuilder = com.fretron.Model.Location.newBuilder(other.getCoordinateBuilder());
      }
      if (isValidValue(fields()[4], other.uuid)) {
        this.uuid = data().deepCopy(fields()[4].schema(), other.uuid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.accessiblity)) {
        this.accessiblity = data().deepCopy(fields()[5].schema(), other.accessiblity);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CheckPoint instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.CheckPoint other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.orgId)) {
        this.orgId = data().deepCopy(fields()[2].schema(), other.orgId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.coordinate)) {
        this.coordinate = data().deepCopy(fields()[3].schema(), other.coordinate);
        fieldSetFlags()[3] = true;
      }
      this.coordinateBuilder = null;
      if (isValidValue(fields()[4], other.uuid)) {
        this.uuid = data().deepCopy(fields()[4].schema(), other.uuid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.accessiblity)) {
        this.accessiblity = data().deepCopy(fields()[5].schema(), other.accessiblity);
        fieldSetFlags()[5] = true;
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
    public com.fretron.Model.CheckPoint.Builder setName(java.lang.String value) {
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
    public com.fretron.Model.CheckPoint.Builder clearName() {
      name = null;
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
    public com.fretron.Model.CheckPoint.Builder setType(java.lang.String value) {
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
    public com.fretron.Model.CheckPoint.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
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
    public com.fretron.Model.CheckPoint.Builder setOrgId(java.lang.String value) {
      validate(fields()[2], value);
      this.orgId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'orgId' field has been set.
      * @return True if the 'orgId' field has been set, false otherwise.
      */
    public boolean hasOrgId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'orgId' field.
      * @return This builder.
      */
    public com.fretron.Model.CheckPoint.Builder clearOrgId() {
      orgId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'coordinate' field.
      * @return The value.
      */
    public com.fretron.Model.Location getCoordinate() {
      return coordinate;
    }

    /**
      * Sets the value of the 'coordinate' field.
      * @param value The value of 'coordinate'.
      * @return This builder.
      */
    public com.fretron.Model.CheckPoint.Builder setCoordinate(com.fretron.Model.Location value) {
      validate(fields()[3], value);
      this.coordinateBuilder = null;
      this.coordinate = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'coordinate' field has been set.
      * @return True if the 'coordinate' field has been set, false otherwise.
      */
    public boolean hasCoordinate() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'coordinate' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Location.Builder getCoordinateBuilder() {
      if (coordinateBuilder == null) {
        if (hasCoordinate()) {
          setCoordinateBuilder(com.fretron.Model.Location.newBuilder(coordinate));
        } else {
          setCoordinateBuilder(com.fretron.Model.Location.newBuilder());
        }
      }
      return coordinateBuilder;
    }

    /**
     * Sets the Builder instance for the 'coordinate' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CheckPoint.Builder setCoordinateBuilder(com.fretron.Model.Location.Builder value) {
      clearCoordinate();
      coordinateBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'coordinate' field has an active Builder instance
     * @return True if the 'coordinate' field has an active Builder instance
     */
    public boolean hasCoordinateBuilder() {
      return coordinateBuilder != null;
    }

    /**
      * Clears the value of the 'coordinate' field.
      * @return This builder.
      */
    public com.fretron.Model.CheckPoint.Builder clearCoordinate() {
      coordinate = null;
      coordinateBuilder = null;
      fieldSetFlags()[3] = false;
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
    public com.fretron.Model.CheckPoint.Builder setUuid(java.lang.String value) {
      validate(fields()[4], value);
      this.uuid = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'uuid' field has been set.
      * @return True if the 'uuid' field has been set, false otherwise.
      */
    public boolean hasUuid() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'uuid' field.
      * @return This builder.
      */
    public com.fretron.Model.CheckPoint.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'accessiblity' field.
      * @return The value.
      */
    public java.lang.String getAccessiblity() {
      return accessiblity;
    }

    /**
      * Sets the value of the 'accessiblity' field.
      * @param value The value of 'accessiblity'.
      * @return This builder.
      */
    public com.fretron.Model.CheckPoint.Builder setAccessiblity(java.lang.String value) {
      validate(fields()[5], value);
      this.accessiblity = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'accessiblity' field has been set.
      * @return True if the 'accessiblity' field has been set, false otherwise.
      */
    public boolean hasAccessiblity() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'accessiblity' field.
      * @return This builder.
      */
    public com.fretron.Model.CheckPoint.Builder clearAccessiblity() {
      accessiblity = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public CheckPoint build() {
      try {
        CheckPoint record = new CheckPoint();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.String) defaultValue(fields()[1]);
        record.orgId = fieldSetFlags()[2] ? this.orgId : (java.lang.String) defaultValue(fields()[2]);
        if (coordinateBuilder != null) {
          record.coordinate = this.coordinateBuilder.build();
        } else {
          record.coordinate = fieldSetFlags()[3] ? this.coordinate : (com.fretron.Model.Location) defaultValue(fields()[3]);
        }
        record.uuid = fieldSetFlags()[4] ? this.uuid : (java.lang.String) defaultValue(fields()[4]);
        record.accessiblity = fieldSetFlags()[5] ? this.accessiblity : (java.lang.String) defaultValue(fields()[5]);
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