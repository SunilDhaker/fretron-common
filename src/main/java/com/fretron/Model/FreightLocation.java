/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FreightLocation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7671540420740880419L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FreightLocation\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":null},{\"name\":\"geofence\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Geofence\",\"fields\":[{\"name\":\"center\",\"type\":{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}},{\"name\":\"boundry\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Location\"}],\"default\":null},{\"name\":\"circle\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Circle\",\"fields\":[{\"name\":\"center\",\"type\":\"Location\"},{\"name\":\"radius\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"GeofenceType\",\"symbols\":[\"Proximity\",\"Polygon\"]}],\"default\":null}]}],\"default\":null},{\"name\":\"material\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"favouriteOf\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"FreightLocType\",\"symbols\":[\"Private\",\"Public\"]}],\"default\":null},{\"name\":\"isDeleted\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String name;
  @Deprecated public com.fretron.Model.Geofence geofence;
  @Deprecated public java.util.List<java.lang.String> material;
  @Deprecated public java.lang.String address;
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String orgId;
  @Deprecated public java.util.List<java.lang.String> favouriteOf;
  @Deprecated public com.fretron.Model.FreightLocType type;
  @Deprecated public java.lang.Boolean isDeleted;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FreightLocation() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param geofence The new value for geofence
   * @param material The new value for material
   * @param address The new value for address
   * @param uuid The new value for uuid
   * @param orgId The new value for orgId
   * @param favouriteOf The new value for favouriteOf
   * @param type The new value for type
   * @param isDeleted The new value for isDeleted
   */
  public FreightLocation(java.lang.String name, com.fretron.Model.Geofence geofence, java.util.List<java.lang.String> material, java.lang.String address, java.lang.String uuid, java.lang.String orgId, java.util.List<java.lang.String> favouriteOf, com.fretron.Model.FreightLocType type, java.lang.Boolean isDeleted) {
    this.name = name;
    this.geofence = geofence;
    this.material = material;
    this.address = address;
    this.uuid = uuid;
    this.orgId = orgId;
    this.favouriteOf = favouriteOf;
    this.type = type;
    this.isDeleted = isDeleted;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return geofence;
    case 2: return material;
    case 3: return address;
    case 4: return uuid;
    case 5: return orgId;
    case 6: return favouriteOf;
    case 7: return type;
    case 8: return isDeleted;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: geofence = (com.fretron.Model.Geofence)value$; break;
    case 2: material = (java.util.List<java.lang.String>)value$; break;
    case 3: address = (java.lang.String)value$; break;
    case 4: uuid = (java.lang.String)value$; break;
    case 5: orgId = (java.lang.String)value$; break;
    case 6: favouriteOf = (java.util.List<java.lang.String>)value$; break;
    case 7: type = (com.fretron.Model.FreightLocType)value$; break;
    case 8: isDeleted = (java.lang.Boolean)value$; break;
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
   * Gets the value of the 'geofence' field.
   * @return The value of the 'geofence' field.
   */
  public com.fretron.Model.Geofence getGeofence() {
    return geofence;
  }

  /**
   * Sets the value of the 'geofence' field.
   * @param value the value to set.
   */
  public void setGeofence(com.fretron.Model.Geofence value) {
    this.geofence = value;
  }

  /**
   * Gets the value of the 'material' field.
   * @return The value of the 'material' field.
   */
  public java.util.List<java.lang.String> getMaterial() {
    return material;
  }

  /**
   * Sets the value of the 'material' field.
   * @param value the value to set.
   */
  public void setMaterial(java.util.List<java.lang.String> value) {
    this.material = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.String value) {
    this.address = value;
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
   * Gets the value of the 'favouriteOf' field.
   * @return The value of the 'favouriteOf' field.
   */
  public java.util.List<java.lang.String> getFavouriteOf() {
    return favouriteOf;
  }

  /**
   * Sets the value of the 'favouriteOf' field.
   * @param value the value to set.
   */
  public void setFavouriteOf(java.util.List<java.lang.String> value) {
    this.favouriteOf = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public com.fretron.Model.FreightLocType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(com.fretron.Model.FreightLocType value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'isDeleted' field.
   * @return The value of the 'isDeleted' field.
   */
  public java.lang.Boolean getIsDeleted() {
    return isDeleted;
  }

  /**
   * Sets the value of the 'isDeleted' field.
   * @param value the value to set.
   */
  public void setIsDeleted(java.lang.Boolean value) {
    this.isDeleted = value;
  }

  /**
   * Creates a new FreightLocation RecordBuilder.
   * @return A new FreightLocation RecordBuilder
   */
  public static com.fretron.Model.FreightLocation.Builder newBuilder() {
    return new com.fretron.Model.FreightLocation.Builder();
  }

  /**
   * Creates a new FreightLocation RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FreightLocation RecordBuilder
   */
  public static com.fretron.Model.FreightLocation.Builder newBuilder(com.fretron.Model.FreightLocation.Builder other) {
    return new com.fretron.Model.FreightLocation.Builder(other);
  }

  /**
   * Creates a new FreightLocation RecordBuilder by copying an existing FreightLocation instance.
   * @param other The existing instance to copy.
   * @return A new FreightLocation RecordBuilder
   */
  public static com.fretron.Model.FreightLocation.Builder newBuilder(com.fretron.Model.FreightLocation other) {
    return new com.fretron.Model.FreightLocation.Builder(other);
  }

  /**
   * RecordBuilder for FreightLocation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FreightLocation>
    implements org.apache.avro.data.RecordBuilder<FreightLocation> {

    private java.lang.String name;
    private com.fretron.Model.Geofence geofence;
    private com.fretron.Model.Geofence.Builder geofenceBuilder;
    private java.util.List<java.lang.String> material;
    private java.lang.String address;
    private java.lang.String uuid;
    private java.lang.String orgId;
    private java.util.List<java.lang.String> favouriteOf;
    private com.fretron.Model.FreightLocType type;
    private java.lang.Boolean isDeleted;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.FreightLocation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.geofence)) {
        this.geofence = data().deepCopy(fields()[1].schema(), other.geofence);
        fieldSetFlags()[1] = true;
      }
      if (other.hasGeofenceBuilder()) {
        this.geofenceBuilder = com.fretron.Model.Geofence.newBuilder(other.getGeofenceBuilder());
      }
      if (isValidValue(fields()[2], other.material)) {
        this.material = data().deepCopy(fields()[2].schema(), other.material);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.address)) {
        this.address = data().deepCopy(fields()[3].schema(), other.address);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.uuid)) {
        this.uuid = data().deepCopy(fields()[4].schema(), other.uuid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.orgId)) {
        this.orgId = data().deepCopy(fields()[5].schema(), other.orgId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.favouriteOf)) {
        this.favouriteOf = data().deepCopy(fields()[6].schema(), other.favouriteOf);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.type)) {
        this.type = data().deepCopy(fields()[7].schema(), other.type);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.isDeleted)) {
        this.isDeleted = data().deepCopy(fields()[8].schema(), other.isDeleted);
        fieldSetFlags()[8] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing FreightLocation instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.FreightLocation other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.geofence)) {
        this.geofence = data().deepCopy(fields()[1].schema(), other.geofence);
        fieldSetFlags()[1] = true;
      }
      this.geofenceBuilder = null;
      if (isValidValue(fields()[2], other.material)) {
        this.material = data().deepCopy(fields()[2].schema(), other.material);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.address)) {
        this.address = data().deepCopy(fields()[3].schema(), other.address);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.uuid)) {
        this.uuid = data().deepCopy(fields()[4].schema(), other.uuid);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.orgId)) {
        this.orgId = data().deepCopy(fields()[5].schema(), other.orgId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.favouriteOf)) {
        this.favouriteOf = data().deepCopy(fields()[6].schema(), other.favouriteOf);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.type)) {
        this.type = data().deepCopy(fields()[7].schema(), other.type);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.isDeleted)) {
        this.isDeleted = data().deepCopy(fields()[8].schema(), other.isDeleted);
        fieldSetFlags()[8] = true;
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
    public com.fretron.Model.FreightLocation.Builder setName(java.lang.String value) {
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
    public com.fretron.Model.FreightLocation.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'geofence' field.
      * @return The value.
      */
    public com.fretron.Model.Geofence getGeofence() {
      return geofence;
    }

    /**
      * Sets the value of the 'geofence' field.
      * @param value The value of 'geofence'.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder setGeofence(com.fretron.Model.Geofence value) {
      validate(fields()[1], value);
      this.geofenceBuilder = null;
      this.geofence = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'geofence' field has been set.
      * @return True if the 'geofence' field has been set, false otherwise.
      */
    public boolean hasGeofence() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'geofence' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Geofence.Builder getGeofenceBuilder() {
      if (geofenceBuilder == null) {
        if (hasGeofence()) {
          setGeofenceBuilder(com.fretron.Model.Geofence.newBuilder(geofence));
        } else {
          setGeofenceBuilder(com.fretron.Model.Geofence.newBuilder());
        }
      }
      return geofenceBuilder;
    }

    /**
     * Sets the Builder instance for the 'geofence' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.FreightLocation.Builder setGeofenceBuilder(com.fretron.Model.Geofence.Builder value) {
      clearGeofence();
      geofenceBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'geofence' field has an active Builder instance
     * @return True if the 'geofence' field has an active Builder instance
     */
    public boolean hasGeofenceBuilder() {
      return geofenceBuilder != null;
    }

    /**
      * Clears the value of the 'geofence' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder clearGeofence() {
      geofence = null;
      geofenceBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'material' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getMaterial() {
      return material;
    }

    /**
      * Sets the value of the 'material' field.
      * @param value The value of 'material'.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder setMaterial(java.util.List<java.lang.String> value) {
      validate(fields()[2], value);
      this.material = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'material' field has been set.
      * @return True if the 'material' field has been set, false otherwise.
      */
    public boolean hasMaterial() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'material' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder clearMaterial() {
      material = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.String getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder setAddress(java.lang.String value) {
      validate(fields()[3], value);
      this.address = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder clearAddress() {
      address = null;
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
    public com.fretron.Model.FreightLocation.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.FreightLocation.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[4] = false;
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
    public com.fretron.Model.FreightLocation.Builder setOrgId(java.lang.String value) {
      validate(fields()[5], value);
      this.orgId = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'orgId' field has been set.
      * @return True if the 'orgId' field has been set, false otherwise.
      */
    public boolean hasOrgId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'orgId' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder clearOrgId() {
      orgId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'favouriteOf' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getFavouriteOf() {
      return favouriteOf;
    }

    /**
      * Sets the value of the 'favouriteOf' field.
      * @param value The value of 'favouriteOf'.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder setFavouriteOf(java.util.List<java.lang.String> value) {
      validate(fields()[6], value);
      this.favouriteOf = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'favouriteOf' field has been set.
      * @return True if the 'favouriteOf' field has been set, false otherwise.
      */
    public boolean hasFavouriteOf() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'favouriteOf' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder clearFavouriteOf() {
      favouriteOf = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public com.fretron.Model.FreightLocType getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder setType(com.fretron.Model.FreightLocType value) {
      validate(fields()[7], value);
      this.type = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder clearType() {
      type = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'isDeleted' field.
      * @return The value.
      */
    public java.lang.Boolean getIsDeleted() {
      return isDeleted;
    }

    /**
      * Sets the value of the 'isDeleted' field.
      * @param value The value of 'isDeleted'.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder setIsDeleted(java.lang.Boolean value) {
      validate(fields()[8], value);
      this.isDeleted = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'isDeleted' field has been set.
      * @return True if the 'isDeleted' field has been set, false otherwise.
      */
    public boolean hasIsDeleted() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'isDeleted' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightLocation.Builder clearIsDeleted() {
      isDeleted = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public FreightLocation build() {
      try {
        FreightLocation record = new FreightLocation();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        if (geofenceBuilder != null) {
          record.geofence = this.geofenceBuilder.build();
        } else {
          record.geofence = fieldSetFlags()[1] ? this.geofence : (com.fretron.Model.Geofence) defaultValue(fields()[1]);
        }
        record.material = fieldSetFlags()[2] ? this.material : (java.util.List<java.lang.String>) defaultValue(fields()[2]);
        record.address = fieldSetFlags()[3] ? this.address : (java.lang.String) defaultValue(fields()[3]);
        record.uuid = fieldSetFlags()[4] ? this.uuid : (java.lang.String) defaultValue(fields()[4]);
        record.orgId = fieldSetFlags()[5] ? this.orgId : (java.lang.String) defaultValue(fields()[5]);
        record.favouriteOf = fieldSetFlags()[6] ? this.favouriteOf : (java.util.List<java.lang.String>) defaultValue(fields()[6]);
        record.type = fieldSetFlags()[7] ? this.type : (com.fretron.Model.FreightLocType) defaultValue(fields()[7]);
        record.isDeleted = fieldSetFlags()[8] ? this.isDeleted : (java.lang.Boolean) defaultValue(fields()[8]);
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
