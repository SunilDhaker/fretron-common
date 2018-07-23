/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class GeoJsonFence extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2190156475990168331L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GeoJsonFence\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"properties\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Properties\",\"fields\":[{\"name\":\"catagory\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"level\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"customeFields\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"geometry\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Geometry\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"coordinates\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}],\"default\":null},{\"name\":\"metadata\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"MetaData\",\"fields\":[{\"name\":\"clazz\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"addedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"accessibility\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isFavorite\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String type;
  @Deprecated public com.fretron.Model.Properties properties;
  @Deprecated public com.fretron.Model.Geometry geometry;
  @Deprecated public com.fretron.Model.MetaData metadata;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GeoJsonFence() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param type The new value for type
   * @param properties The new value for properties
   * @param geometry The new value for geometry
   * @param metadata The new value for metadata
   */
  public GeoJsonFence(java.lang.String uuid, java.lang.String type, com.fretron.Model.Properties properties, com.fretron.Model.Geometry geometry, com.fretron.Model.MetaData metadata) {
    this.uuid = uuid;
    this.type = type;
    this.properties = properties;
    this.geometry = geometry;
    this.metadata = metadata;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return type;
    case 2: return properties;
    case 3: return geometry;
    case 4: return metadata;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: type = (java.lang.String)value$; break;
    case 2: properties = (com.fretron.Model.Properties)value$; break;
    case 3: geometry = (com.fretron.Model.Geometry)value$; break;
    case 4: metadata = (com.fretron.Model.MetaData)value$; break;
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
   * Gets the value of the 'properties' field.
   * @return The value of the 'properties' field.
   */
  public com.fretron.Model.Properties getProperties() {
    return properties;
  }

  /**
   * Sets the value of the 'properties' field.
   * @param value the value to set.
   */
  public void setProperties(com.fretron.Model.Properties value) {
    this.properties = value;
  }

  /**
   * Gets the value of the 'geometry' field.
   * @return The value of the 'geometry' field.
   */
  public com.fretron.Model.Geometry getGeometry() {
    return geometry;
  }

  /**
   * Sets the value of the 'geometry' field.
   * @param value the value to set.
   */
  public void setGeometry(com.fretron.Model.Geometry value) {
    this.geometry = value;
  }

  /**
   * Gets the value of the 'metadata' field.
   * @return The value of the 'metadata' field.
   */
  public com.fretron.Model.MetaData getMetadata() {
    return metadata;
  }

  /**
   * Sets the value of the 'metadata' field.
   * @param value the value to set.
   */
  public void setMetadata(com.fretron.Model.MetaData value) {
    this.metadata = value;
  }

  /**
   * Creates a new GeoJsonFence RecordBuilder.
   * @return A new GeoJsonFence RecordBuilder
   */
  public static com.fretron.Model.GeoJsonFence.Builder newBuilder() {
    return new com.fretron.Model.GeoJsonFence.Builder();
  }

  /**
   * Creates a new GeoJsonFence RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GeoJsonFence RecordBuilder
   */
  public static com.fretron.Model.GeoJsonFence.Builder newBuilder(com.fretron.Model.GeoJsonFence.Builder other) {
    return new com.fretron.Model.GeoJsonFence.Builder(other);
  }

  /**
   * Creates a new GeoJsonFence RecordBuilder by copying an existing GeoJsonFence instance.
   * @param other The existing instance to copy.
   * @return A new GeoJsonFence RecordBuilder
   */
  public static com.fretron.Model.GeoJsonFence.Builder newBuilder(com.fretron.Model.GeoJsonFence other) {
    return new com.fretron.Model.GeoJsonFence.Builder(other);
  }

  /**
   * RecordBuilder for GeoJsonFence instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GeoJsonFence>
    implements org.apache.avro.data.RecordBuilder<GeoJsonFence> {

    private java.lang.String uuid;
    private java.lang.String type;
    private com.fretron.Model.Properties properties;
    private com.fretron.Model.Properties.Builder propertiesBuilder;
    private com.fretron.Model.Geometry geometry;
    private com.fretron.Model.Geometry.Builder geometryBuilder;
    private com.fretron.Model.MetaData metadata;
    private com.fretron.Model.MetaData.Builder metadataBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.GeoJsonFence.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.properties)) {
        this.properties = data().deepCopy(fields()[2].schema(), other.properties);
        fieldSetFlags()[2] = true;
      }
      if (other.hasPropertiesBuilder()) {
        this.propertiesBuilder = com.fretron.Model.Properties.newBuilder(other.getPropertiesBuilder());
      }
      if (isValidValue(fields()[3], other.geometry)) {
        this.geometry = data().deepCopy(fields()[3].schema(), other.geometry);
        fieldSetFlags()[3] = true;
      }
      if (other.hasGeometryBuilder()) {
        this.geometryBuilder = com.fretron.Model.Geometry.newBuilder(other.getGeometryBuilder());
      }
      if (isValidValue(fields()[4], other.metadata)) {
        this.metadata = data().deepCopy(fields()[4].schema(), other.metadata);
        fieldSetFlags()[4] = true;
      }
      if (other.hasMetadataBuilder()) {
        this.metadataBuilder = com.fretron.Model.MetaData.newBuilder(other.getMetadataBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing GeoJsonFence instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.GeoJsonFence other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.properties)) {
        this.properties = data().deepCopy(fields()[2].schema(), other.properties);
        fieldSetFlags()[2] = true;
      }
      this.propertiesBuilder = null;
      if (isValidValue(fields()[3], other.geometry)) {
        this.geometry = data().deepCopy(fields()[3].schema(), other.geometry);
        fieldSetFlags()[3] = true;
      }
      this.geometryBuilder = null;
      if (isValidValue(fields()[4], other.metadata)) {
        this.metadata = data().deepCopy(fields()[4].schema(), other.metadata);
        fieldSetFlags()[4] = true;
      }
      this.metadataBuilder = null;
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
    public com.fretron.Model.GeoJsonFence.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.GeoJsonFence.Builder clearUuid() {
      uuid = null;
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
    public com.fretron.Model.GeoJsonFence.Builder setType(java.lang.String value) {
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
    public com.fretron.Model.GeoJsonFence.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'properties' field.
      * @return The value.
      */
    public com.fretron.Model.Properties getProperties() {
      return properties;
    }

    /**
      * Sets the value of the 'properties' field.
      * @param value The value of 'properties'.
      * @return This builder.
      */
    public com.fretron.Model.GeoJsonFence.Builder setProperties(com.fretron.Model.Properties value) {
      validate(fields()[2], value);
      this.propertiesBuilder = null;
      this.properties = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'properties' field has been set.
      * @return True if the 'properties' field has been set, false otherwise.
      */
    public boolean hasProperties() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'properties' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Properties.Builder getPropertiesBuilder() {
      if (propertiesBuilder == null) {
        if (hasProperties()) {
          setPropertiesBuilder(com.fretron.Model.Properties.newBuilder(properties));
        } else {
          setPropertiesBuilder(com.fretron.Model.Properties.newBuilder());
        }
      }
      return propertiesBuilder;
    }

    /**
     * Sets the Builder instance for the 'properties' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.GeoJsonFence.Builder setPropertiesBuilder(com.fretron.Model.Properties.Builder value) {
      clearProperties();
      propertiesBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'properties' field has an active Builder instance
     * @return True if the 'properties' field has an active Builder instance
     */
    public boolean hasPropertiesBuilder() {
      return propertiesBuilder != null;
    }

    /**
      * Clears the value of the 'properties' field.
      * @return This builder.
      */
    public com.fretron.Model.GeoJsonFence.Builder clearProperties() {
      properties = null;
      propertiesBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'geometry' field.
      * @return The value.
      */
    public com.fretron.Model.Geometry getGeometry() {
      return geometry;
    }

    /**
      * Sets the value of the 'geometry' field.
      * @param value The value of 'geometry'.
      * @return This builder.
      */
    public com.fretron.Model.GeoJsonFence.Builder setGeometry(com.fretron.Model.Geometry value) {
      validate(fields()[3], value);
      this.geometryBuilder = null;
      this.geometry = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'geometry' field has been set.
      * @return True if the 'geometry' field has been set, false otherwise.
      */
    public boolean hasGeometry() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'geometry' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Geometry.Builder getGeometryBuilder() {
      if (geometryBuilder == null) {
        if (hasGeometry()) {
          setGeometryBuilder(com.fretron.Model.Geometry.newBuilder(geometry));
        } else {
          setGeometryBuilder(com.fretron.Model.Geometry.newBuilder());
        }
      }
      return geometryBuilder;
    }

    /**
     * Sets the Builder instance for the 'geometry' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.GeoJsonFence.Builder setGeometryBuilder(com.fretron.Model.Geometry.Builder value) {
      clearGeometry();
      geometryBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'geometry' field has an active Builder instance
     * @return True if the 'geometry' field has an active Builder instance
     */
    public boolean hasGeometryBuilder() {
      return geometryBuilder != null;
    }

    /**
      * Clears the value of the 'geometry' field.
      * @return This builder.
      */
    public com.fretron.Model.GeoJsonFence.Builder clearGeometry() {
      geometry = null;
      geometryBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'metadata' field.
      * @return The value.
      */
    public com.fretron.Model.MetaData getMetadata() {
      return metadata;
    }

    /**
      * Sets the value of the 'metadata' field.
      * @param value The value of 'metadata'.
      * @return This builder.
      */
    public com.fretron.Model.GeoJsonFence.Builder setMetadata(com.fretron.Model.MetaData value) {
      validate(fields()[4], value);
      this.metadataBuilder = null;
      this.metadata = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'metadata' field has been set.
      * @return True if the 'metadata' field has been set, false otherwise.
      */
    public boolean hasMetadata() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'metadata' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.MetaData.Builder getMetadataBuilder() {
      if (metadataBuilder == null) {
        if (hasMetadata()) {
          setMetadataBuilder(com.fretron.Model.MetaData.newBuilder(metadata));
        } else {
          setMetadataBuilder(com.fretron.Model.MetaData.newBuilder());
        }
      }
      return metadataBuilder;
    }

    /**
     * Sets the Builder instance for the 'metadata' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.GeoJsonFence.Builder setMetadataBuilder(com.fretron.Model.MetaData.Builder value) {
      clearMetadata();
      metadataBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'metadata' field has an active Builder instance
     * @return True if the 'metadata' field has an active Builder instance
     */
    public boolean hasMetadataBuilder() {
      return metadataBuilder != null;
    }

    /**
      * Clears the value of the 'metadata' field.
      * @return This builder.
      */
    public com.fretron.Model.GeoJsonFence.Builder clearMetadata() {
      metadata = null;
      metadataBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public GeoJsonFence build() {
      try {
        GeoJsonFence record = new GeoJsonFence();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.String) defaultValue(fields()[1]);
        if (propertiesBuilder != null) {
          record.properties = this.propertiesBuilder.build();
        } else {
          record.properties = fieldSetFlags()[2] ? this.properties : (com.fretron.Model.Properties) defaultValue(fields()[2]);
        }
        if (geometryBuilder != null) {
          record.geometry = this.geometryBuilder.build();
        } else {
          record.geometry = fieldSetFlags()[3] ? this.geometry : (com.fretron.Model.Geometry) defaultValue(fields()[3]);
        }
        if (metadataBuilder != null) {
          record.metadata = this.metadataBuilder.build();
        } else {
          record.metadata = fieldSetFlags()[4] ? this.metadata : (com.fretron.Model.MetaData) defaultValue(fields()[4]);
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
