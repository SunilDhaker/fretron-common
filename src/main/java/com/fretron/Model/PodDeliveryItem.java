/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PodDeliveryItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7813911816494959713L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PodDeliveryItem\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"orderMapping\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"SalesOrderMapping\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orderId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lineItemId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"legType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"consignmentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"quantity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"StandardMeasurement\",\"fields\":[{\"name\":\"weight\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Measurement\",\"fields\":[{\"name\":\"measurmentType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"unitOfMeasurment\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"plannedLoadQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"actualLoadedQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"netQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"grossQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"standardQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"actualDeliveredQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"shortage\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"frieghtDeductableQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"claimQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"temperature\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"density\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"moisture\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null},{\"name\":\"volume\",\"type\":[\"null\",\"Measurement\"],\"default\":null},{\"name\":\"packageMeasurement\",\"type\":[\"null\",\"Measurement\"],\"default\":null},{\"name\":\"trucks\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null},{\"name\":\"fuMappings\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LegWiseFuMapping\",\"fields\":[{\"name\":\"legId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"legType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"fuLineItemId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"executionPlanId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"legStatus\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"consignmentLineItemId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"issues\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"remarks\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"documents\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Document\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"isExpirable\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"expireDate\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"resourceType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resourceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"docPath\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"downloadUrl\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"previewString\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"customFields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LiteCustomFields\",\"fields\":[{\"name\":\"fieldType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"fieldKey\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"indexedValue\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"valueType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"definitionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.fretron.Model.SalesOrderMapping orderMapping;
  @Deprecated public java.util.List<java.lang.String> issues;
  @Deprecated public java.lang.String remarks;
  @Deprecated public java.util.List<com.fretron.Model.Document> documents;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PodDeliveryItem() {}

  /**
   * All-args constructor.
   * @param orderMapping The new value for orderMapping
   * @param issues The new value for issues
   * @param remarks The new value for remarks
   * @param documents The new value for documents
   */
  public PodDeliveryItem(com.fretron.Model.SalesOrderMapping orderMapping, java.util.List<java.lang.String> issues, java.lang.String remarks, java.util.List<com.fretron.Model.Document> documents) {
    this.orderMapping = orderMapping;
    this.issues = issues;
    this.remarks = remarks;
    this.documents = documents;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return orderMapping;
    case 1: return issues;
    case 2: return remarks;
    case 3: return documents;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: orderMapping = (com.fretron.Model.SalesOrderMapping)value$; break;
    case 1: issues = (java.util.List<java.lang.String>)value$; break;
    case 2: remarks = (java.lang.String)value$; break;
    case 3: documents = (java.util.List<com.fretron.Model.Document>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'orderMapping' field.
   * @return The value of the 'orderMapping' field.
   */
  public com.fretron.Model.SalesOrderMapping getOrderMapping() {
    return orderMapping;
  }

  /**
   * Sets the value of the 'orderMapping' field.
   * @param value the value to set.
   */
  public void setOrderMapping(com.fretron.Model.SalesOrderMapping value) {
    this.orderMapping = value;
  }

  /**
   * Gets the value of the 'issues' field.
   * @return The value of the 'issues' field.
   */
  public java.util.List<java.lang.String> getIssues() {
    return issues;
  }

  /**
   * Sets the value of the 'issues' field.
   * @param value the value to set.
   */
  public void setIssues(java.util.List<java.lang.String> value) {
    this.issues = value;
  }

  /**
   * Gets the value of the 'remarks' field.
   * @return The value of the 'remarks' field.
   */
  public java.lang.String getRemarks() {
    return remarks;
  }

  /**
   * Sets the value of the 'remarks' field.
   * @param value the value to set.
   */
  public void setRemarks(java.lang.String value) {
    this.remarks = value;
  }

  /**
   * Gets the value of the 'documents' field.
   * @return The value of the 'documents' field.
   */
  public java.util.List<com.fretron.Model.Document> getDocuments() {
    return documents;
  }

  /**
   * Sets the value of the 'documents' field.
   * @param value the value to set.
   */
  public void setDocuments(java.util.List<com.fretron.Model.Document> value) {
    this.documents = value;
  }

  /**
   * Creates a new PodDeliveryItem RecordBuilder.
   * @return A new PodDeliveryItem RecordBuilder
   */
  public static com.fretron.Model.PodDeliveryItem.Builder newBuilder() {
    return new com.fretron.Model.PodDeliveryItem.Builder();
  }

  /**
   * Creates a new PodDeliveryItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PodDeliveryItem RecordBuilder
   */
  public static com.fretron.Model.PodDeliveryItem.Builder newBuilder(com.fretron.Model.PodDeliveryItem.Builder other) {
    return new com.fretron.Model.PodDeliveryItem.Builder(other);
  }

  /**
   * Creates a new PodDeliveryItem RecordBuilder by copying an existing PodDeliveryItem instance.
   * @param other The existing instance to copy.
   * @return A new PodDeliveryItem RecordBuilder
   */
  public static com.fretron.Model.PodDeliveryItem.Builder newBuilder(com.fretron.Model.PodDeliveryItem other) {
    return new com.fretron.Model.PodDeliveryItem.Builder(other);
  }

  /**
   * RecordBuilder for PodDeliveryItem instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PodDeliveryItem>
    implements org.apache.avro.data.RecordBuilder<PodDeliveryItem> {

    private com.fretron.Model.SalesOrderMapping orderMapping;
    private com.fretron.Model.SalesOrderMapping.Builder orderMappingBuilder;
    private java.util.List<java.lang.String> issues;
    private java.lang.String remarks;
    private java.util.List<com.fretron.Model.Document> documents;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.PodDeliveryItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.orderMapping)) {
        this.orderMapping = data().deepCopy(fields()[0].schema(), other.orderMapping);
        fieldSetFlags()[0] = true;
      }
      if (other.hasOrderMappingBuilder()) {
        this.orderMappingBuilder = com.fretron.Model.SalesOrderMapping.newBuilder(other.getOrderMappingBuilder());
      }
      if (isValidValue(fields()[1], other.issues)) {
        this.issues = data().deepCopy(fields()[1].schema(), other.issues);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.remarks)) {
        this.remarks = data().deepCopy(fields()[2].schema(), other.remarks);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.documents)) {
        this.documents = data().deepCopy(fields()[3].schema(), other.documents);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PodDeliveryItem instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.PodDeliveryItem other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.orderMapping)) {
        this.orderMapping = data().deepCopy(fields()[0].schema(), other.orderMapping);
        fieldSetFlags()[0] = true;
      }
      this.orderMappingBuilder = null;
      if (isValidValue(fields()[1], other.issues)) {
        this.issues = data().deepCopy(fields()[1].schema(), other.issues);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.remarks)) {
        this.remarks = data().deepCopy(fields()[2].schema(), other.remarks);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.documents)) {
        this.documents = data().deepCopy(fields()[3].schema(), other.documents);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'orderMapping' field.
      * @return The value.
      */
    public com.fretron.Model.SalesOrderMapping getOrderMapping() {
      return orderMapping;
    }

    /**
      * Sets the value of the 'orderMapping' field.
      * @param value The value of 'orderMapping'.
      * @return This builder.
      */
    public com.fretron.Model.PodDeliveryItem.Builder setOrderMapping(com.fretron.Model.SalesOrderMapping value) {
      validate(fields()[0], value);
      this.orderMappingBuilder = null;
      this.orderMapping = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'orderMapping' field has been set.
      * @return True if the 'orderMapping' field has been set, false otherwise.
      */
    public boolean hasOrderMapping() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'orderMapping' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.SalesOrderMapping.Builder getOrderMappingBuilder() {
      if (orderMappingBuilder == null) {
        if (hasOrderMapping()) {
          setOrderMappingBuilder(com.fretron.Model.SalesOrderMapping.newBuilder(orderMapping));
        } else {
          setOrderMappingBuilder(com.fretron.Model.SalesOrderMapping.newBuilder());
        }
      }
      return orderMappingBuilder;
    }

    /**
     * Sets the Builder instance for the 'orderMapping' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.PodDeliveryItem.Builder setOrderMappingBuilder(com.fretron.Model.SalesOrderMapping.Builder value) {
      clearOrderMapping();
      orderMappingBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'orderMapping' field has an active Builder instance
     * @return True if the 'orderMapping' field has an active Builder instance
     */
    public boolean hasOrderMappingBuilder() {
      return orderMappingBuilder != null;
    }

    /**
      * Clears the value of the 'orderMapping' field.
      * @return This builder.
      */
    public com.fretron.Model.PodDeliveryItem.Builder clearOrderMapping() {
      orderMapping = null;
      orderMappingBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'issues' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getIssues() {
      return issues;
    }

    /**
      * Sets the value of the 'issues' field.
      * @param value The value of 'issues'.
      * @return This builder.
      */
    public com.fretron.Model.PodDeliveryItem.Builder setIssues(java.util.List<java.lang.String> value) {
      validate(fields()[1], value);
      this.issues = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'issues' field has been set.
      * @return True if the 'issues' field has been set, false otherwise.
      */
    public boolean hasIssues() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'issues' field.
      * @return This builder.
      */
    public com.fretron.Model.PodDeliveryItem.Builder clearIssues() {
      issues = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'remarks' field.
      * @return The value.
      */
    public java.lang.String getRemarks() {
      return remarks;
    }

    /**
      * Sets the value of the 'remarks' field.
      * @param value The value of 'remarks'.
      * @return This builder.
      */
    public com.fretron.Model.PodDeliveryItem.Builder setRemarks(java.lang.String value) {
      validate(fields()[2], value);
      this.remarks = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'remarks' field has been set.
      * @return True if the 'remarks' field has been set, false otherwise.
      */
    public boolean hasRemarks() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'remarks' field.
      * @return This builder.
      */
    public com.fretron.Model.PodDeliveryItem.Builder clearRemarks() {
      remarks = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'documents' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.Document> getDocuments() {
      return documents;
    }

    /**
      * Sets the value of the 'documents' field.
      * @param value The value of 'documents'.
      * @return This builder.
      */
    public com.fretron.Model.PodDeliveryItem.Builder setDocuments(java.util.List<com.fretron.Model.Document> value) {
      validate(fields()[3], value);
      this.documents = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'documents' field has been set.
      * @return True if the 'documents' field has been set, false otherwise.
      */
    public boolean hasDocuments() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'documents' field.
      * @return This builder.
      */
    public com.fretron.Model.PodDeliveryItem.Builder clearDocuments() {
      documents = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public PodDeliveryItem build() {
      try {
        PodDeliveryItem record = new PodDeliveryItem();
        if (orderMappingBuilder != null) {
          record.orderMapping = this.orderMappingBuilder.build();
        } else {
          record.orderMapping = fieldSetFlags()[0] ? this.orderMapping : (com.fretron.Model.SalesOrderMapping) defaultValue(fields()[0]);
        }
        record.issues = fieldSetFlags()[1] ? this.issues : (java.util.List<java.lang.String>) defaultValue(fields()[1]);
        record.remarks = fieldSetFlags()[2] ? this.remarks : (java.lang.String) defaultValue(fields()[2]);
        record.documents = fieldSetFlags()[3] ? this.documents : (java.util.List<com.fretron.Model.Document>) defaultValue(fields()[3]);
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
