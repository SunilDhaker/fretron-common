/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Document extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -128436922636268349L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Document\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"isExpirable\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"expireDate\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"resourceType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resourceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"docPath\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"downloadUrl\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.Boolean isExpirable;
  @Deprecated public java.lang.Long expireDate;
  @Deprecated public java.lang.String resourceType;
  @Deprecated public java.lang.String resourceId;
  @Deprecated public java.lang.String docPath;
  @Deprecated public java.lang.String downloadUrl;
  @Deprecated public java.lang.String orgId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Document() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param isExpirable The new value for isExpirable
   * @param expireDate The new value for expireDate
   * @param resourceType The new value for resourceType
   * @param resourceId The new value for resourceId
   * @param docPath The new value for docPath
   * @param downloadUrl The new value for downloadUrl
   * @param orgId The new value for orgId
   */
  public Document(java.lang.String uuid, java.lang.Boolean isExpirable, java.lang.Long expireDate, java.lang.String resourceType, java.lang.String resourceId, java.lang.String docPath, java.lang.String downloadUrl, java.lang.String orgId) {
    this.uuid = uuid;
    this.isExpirable = isExpirable;
    this.expireDate = expireDate;
    this.resourceType = resourceType;
    this.resourceId = resourceId;
    this.docPath = docPath;
    this.downloadUrl = downloadUrl;
    this.orgId = orgId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return isExpirable;
    case 2: return expireDate;
    case 3: return resourceType;
    case 4: return resourceId;
    case 5: return docPath;
    case 6: return downloadUrl;
    case 7: return orgId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: isExpirable = (java.lang.Boolean)value$; break;
    case 2: expireDate = (java.lang.Long)value$; break;
    case 3: resourceType = (java.lang.String)value$; break;
    case 4: resourceId = (java.lang.String)value$; break;
    case 5: docPath = (java.lang.String)value$; break;
    case 6: downloadUrl = (java.lang.String)value$; break;
    case 7: orgId = (java.lang.String)value$; break;
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
   * Gets the value of the 'isExpirable' field.
   * @return The value of the 'isExpirable' field.
   */
  public java.lang.Boolean getIsExpirable() {
    return isExpirable;
  }

  /**
   * Sets the value of the 'isExpirable' field.
   * @param value the value to set.
   */
  public void setIsExpirable(java.lang.Boolean value) {
    this.isExpirable = value;
  }

  /**
   * Gets the value of the 'expireDate' field.
   * @return The value of the 'expireDate' field.
   */
  public java.lang.Long getExpireDate() {
    return expireDate;
  }

  /**
   * Sets the value of the 'expireDate' field.
   * @param value the value to set.
   */
  public void setExpireDate(java.lang.Long value) {
    this.expireDate = value;
  }

  /**
   * Gets the value of the 'resourceType' field.
   * @return The value of the 'resourceType' field.
   */
  public java.lang.String getResourceType() {
    return resourceType;
  }

  /**
   * Sets the value of the 'resourceType' field.
   * @param value the value to set.
   */
  public void setResourceType(java.lang.String value) {
    this.resourceType = value;
  }

  /**
   * Gets the value of the 'resourceId' field.
   * @return The value of the 'resourceId' field.
   */
  public java.lang.String getResourceId() {
    return resourceId;
  }

  /**
   * Sets the value of the 'resourceId' field.
   * @param value the value to set.
   */
  public void setResourceId(java.lang.String value) {
    this.resourceId = value;
  }

  /**
   * Gets the value of the 'docPath' field.
   * @return The value of the 'docPath' field.
   */
  public java.lang.String getDocPath() {
    return docPath;
  }

  /**
   * Sets the value of the 'docPath' field.
   * @param value the value to set.
   */
  public void setDocPath(java.lang.String value) {
    this.docPath = value;
  }

  /**
   * Gets the value of the 'downloadUrl' field.
   * @return The value of the 'downloadUrl' field.
   */
  public java.lang.String getDownloadUrl() {
    return downloadUrl;
  }

  /**
   * Sets the value of the 'downloadUrl' field.
   * @param value the value to set.
   */
  public void setDownloadUrl(java.lang.String value) {
    this.downloadUrl = value;
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
   * Creates a new Document RecordBuilder.
   * @return A new Document RecordBuilder
   */
  public static com.fretron.Model.Document.Builder newBuilder() {
    return new com.fretron.Model.Document.Builder();
  }

  /**
   * Creates a new Document RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Document RecordBuilder
   */
  public static com.fretron.Model.Document.Builder newBuilder(com.fretron.Model.Document.Builder other) {
    return new com.fretron.Model.Document.Builder(other);
  }

  /**
   * Creates a new Document RecordBuilder by copying an existing Document instance.
   * @param other The existing instance to copy.
   * @return A new Document RecordBuilder
   */
  public static com.fretron.Model.Document.Builder newBuilder(com.fretron.Model.Document other) {
    return new com.fretron.Model.Document.Builder(other);
  }

  /**
   * RecordBuilder for Document instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Document>
    implements org.apache.avro.data.RecordBuilder<Document> {

    private java.lang.String uuid;
    private java.lang.Boolean isExpirable;
    private java.lang.Long expireDate;
    private java.lang.String resourceType;
    private java.lang.String resourceId;
    private java.lang.String docPath;
    private java.lang.String downloadUrl;
    private java.lang.String orgId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Document.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.isExpirable)) {
        this.isExpirable = data().deepCopy(fields()[1].schema(), other.isExpirable);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.expireDate)) {
        this.expireDate = data().deepCopy(fields()[2].schema(), other.expireDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[3].schema(), other.resourceType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.resourceId)) {
        this.resourceId = data().deepCopy(fields()[4].schema(), other.resourceId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.docPath)) {
        this.docPath = data().deepCopy(fields()[5].schema(), other.docPath);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.downloadUrl)) {
        this.downloadUrl = data().deepCopy(fields()[6].schema(), other.downloadUrl);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.orgId)) {
        this.orgId = data().deepCopy(fields()[7].schema(), other.orgId);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Document instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Document other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.isExpirable)) {
        this.isExpirable = data().deepCopy(fields()[1].schema(), other.isExpirable);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.expireDate)) {
        this.expireDate = data().deepCopy(fields()[2].schema(), other.expireDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[3].schema(), other.resourceType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.resourceId)) {
        this.resourceId = data().deepCopy(fields()[4].schema(), other.resourceId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.docPath)) {
        this.docPath = data().deepCopy(fields()[5].schema(), other.docPath);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.downloadUrl)) {
        this.downloadUrl = data().deepCopy(fields()[6].schema(), other.downloadUrl);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.orgId)) {
        this.orgId = data().deepCopy(fields()[7].schema(), other.orgId);
        fieldSetFlags()[7] = true;
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
    public com.fretron.Model.Document.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.Document.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'isExpirable' field.
      * @return The value.
      */
    public java.lang.Boolean getIsExpirable() {
      return isExpirable;
    }

    /**
      * Sets the value of the 'isExpirable' field.
      * @param value The value of 'isExpirable'.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder setIsExpirable(java.lang.Boolean value) {
      validate(fields()[1], value);
      this.isExpirable = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'isExpirable' field has been set.
      * @return True if the 'isExpirable' field has been set, false otherwise.
      */
    public boolean hasIsExpirable() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'isExpirable' field.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder clearIsExpirable() {
      isExpirable = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'expireDate' field.
      * @return The value.
      */
    public java.lang.Long getExpireDate() {
      return expireDate;
    }

    /**
      * Sets the value of the 'expireDate' field.
      * @param value The value of 'expireDate'.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder setExpireDate(java.lang.Long value) {
      validate(fields()[2], value);
      this.expireDate = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'expireDate' field has been set.
      * @return True if the 'expireDate' field has been set, false otherwise.
      */
    public boolean hasExpireDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'expireDate' field.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder clearExpireDate() {
      expireDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'resourceType' field.
      * @return The value.
      */
    public java.lang.String getResourceType() {
      return resourceType;
    }

    /**
      * Sets the value of the 'resourceType' field.
      * @param value The value of 'resourceType'.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder setResourceType(java.lang.String value) {
      validate(fields()[3], value);
      this.resourceType = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'resourceType' field has been set.
      * @return True if the 'resourceType' field has been set, false otherwise.
      */
    public boolean hasResourceType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'resourceType' field.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder clearResourceType() {
      resourceType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'resourceId' field.
      * @return The value.
      */
    public java.lang.String getResourceId() {
      return resourceId;
    }

    /**
      * Sets the value of the 'resourceId' field.
      * @param value The value of 'resourceId'.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder setResourceId(java.lang.String value) {
      validate(fields()[4], value);
      this.resourceId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'resourceId' field has been set.
      * @return True if the 'resourceId' field has been set, false otherwise.
      */
    public boolean hasResourceId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'resourceId' field.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder clearResourceId() {
      resourceId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'docPath' field.
      * @return The value.
      */
    public java.lang.String getDocPath() {
      return docPath;
    }

    /**
      * Sets the value of the 'docPath' field.
      * @param value The value of 'docPath'.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder setDocPath(java.lang.String value) {
      validate(fields()[5], value);
      this.docPath = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'docPath' field has been set.
      * @return True if the 'docPath' field has been set, false otherwise.
      */
    public boolean hasDocPath() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'docPath' field.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder clearDocPath() {
      docPath = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'downloadUrl' field.
      * @return The value.
      */
    public java.lang.String getDownloadUrl() {
      return downloadUrl;
    }

    /**
      * Sets the value of the 'downloadUrl' field.
      * @param value The value of 'downloadUrl'.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder setDownloadUrl(java.lang.String value) {
      validate(fields()[6], value);
      this.downloadUrl = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'downloadUrl' field has been set.
      * @return True if the 'downloadUrl' field has been set, false otherwise.
      */
    public boolean hasDownloadUrl() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'downloadUrl' field.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder clearDownloadUrl() {
      downloadUrl = null;
      fieldSetFlags()[6] = false;
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
    public com.fretron.Model.Document.Builder setOrgId(java.lang.String value) {
      validate(fields()[7], value);
      this.orgId = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'orgId' field has been set.
      * @return True if the 'orgId' field has been set, false otherwise.
      */
    public boolean hasOrgId() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'orgId' field.
      * @return This builder.
      */
    public com.fretron.Model.Document.Builder clearOrgId() {
      orgId = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public Document build() {
      try {
        Document record = new Document();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.isExpirable = fieldSetFlags()[1] ? this.isExpirable : (java.lang.Boolean) defaultValue(fields()[1]);
        record.expireDate = fieldSetFlags()[2] ? this.expireDate : (java.lang.Long) defaultValue(fields()[2]);
        record.resourceType = fieldSetFlags()[3] ? this.resourceType : (java.lang.String) defaultValue(fields()[3]);
        record.resourceId = fieldSetFlags()[4] ? this.resourceId : (java.lang.String) defaultValue(fields()[4]);
        record.docPath = fieldSetFlags()[5] ? this.docPath : (java.lang.String) defaultValue(fields()[5]);
        record.downloadUrl = fieldSetFlags()[6] ? this.downloadUrl : (java.lang.String) defaultValue(fields()[6]);
        record.orgId = fieldSetFlags()[7] ? this.orgId : (java.lang.String) defaultValue(fields()[7]);
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