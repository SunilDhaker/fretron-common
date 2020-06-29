/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ConsignmentPod extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5386606638065806733L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ConsignmentPod\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"documents\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Document\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"isExpirable\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"expireDate\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"resourceType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resourceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"docPath\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"downloadUrl\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"previewString\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"receiveDate\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"submissionDate\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"expectedSubmissionDate\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"issues\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"receivedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"remarks\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"submissionPlace\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"consignmentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"deliveryItems\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PodDeliveryItem\",\"fields\":[{\"name\":\"orderMapping\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"SalesOrderMapping\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orderId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lineItemId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"legType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"consignmentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"quantity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"StandardMeasurement\",\"fields\":[{\"name\":\"weight\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Measurement\",\"fields\":[{\"name\":\"measurmentType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"unitOfMeasurment\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"plannedLoadQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"actualLoadedQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"netQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"grossQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"standardQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"actualDeliveredQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"shortage\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"frieghtDeductableQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"claimQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"temperature\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"density\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"moisture\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null},{\"name\":\"volume\",\"type\":[\"null\",\"Measurement\"],\"default\":null},{\"name\":\"packageMeasurement\",\"type\":[\"null\",\"Measurement\"],\"default\":null},{\"name\":\"trucks\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null},{\"name\":\"fuMappings\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LegWiseFuMapping\",\"fields\":[{\"name\":\"legId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"legType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"fuLineItemId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"executionPlanId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"legStatus\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}],\"default\":null},{\"name\":\"issues\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"remarks\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String status;
  @Deprecated public java.util.List<com.fretron.Model.Document> documents;
  @Deprecated public java.lang.Long receiveDate;
  @Deprecated public java.lang.Long submissionDate;
  @Deprecated public java.lang.Long expectedSubmissionDate;
  @Deprecated public java.util.List<java.lang.String> issues;
  @Deprecated public java.lang.String receivedBy;
  @Deprecated public java.lang.String remarks;
  @Deprecated public java.lang.String submissionPlace;
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String externalId;
  @Deprecated public java.lang.String consignmentId;
  @Deprecated public java.util.List<com.fretron.Model.PodDeliveryItem> deliveryItems;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ConsignmentPod() {}

  /**
   * All-args constructor.
   * @param status The new value for status
   * @param documents The new value for documents
   * @param receiveDate The new value for receiveDate
   * @param submissionDate The new value for submissionDate
   * @param expectedSubmissionDate The new value for expectedSubmissionDate
   * @param issues The new value for issues
   * @param receivedBy The new value for receivedBy
   * @param remarks The new value for remarks
   * @param submissionPlace The new value for submissionPlace
   * @param uuid The new value for uuid
   * @param externalId The new value for externalId
   * @param consignmentId The new value for consignmentId
   * @param deliveryItems The new value for deliveryItems
   */
  public ConsignmentPod(java.lang.String status, java.util.List<com.fretron.Model.Document> documents, java.lang.Long receiveDate, java.lang.Long submissionDate, java.lang.Long expectedSubmissionDate, java.util.List<java.lang.String> issues, java.lang.String receivedBy, java.lang.String remarks, java.lang.String submissionPlace, java.lang.String uuid, java.lang.String externalId, java.lang.String consignmentId, java.util.List<com.fretron.Model.PodDeliveryItem> deliveryItems) {
    this.status = status;
    this.documents = documents;
    this.receiveDate = receiveDate;
    this.submissionDate = submissionDate;
    this.expectedSubmissionDate = expectedSubmissionDate;
    this.issues = issues;
    this.receivedBy = receivedBy;
    this.remarks = remarks;
    this.submissionPlace = submissionPlace;
    this.uuid = uuid;
    this.externalId = externalId;
    this.consignmentId = consignmentId;
    this.deliveryItems = deliveryItems;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return status;
    case 1: return documents;
    case 2: return receiveDate;
    case 3: return submissionDate;
    case 4: return expectedSubmissionDate;
    case 5: return issues;
    case 6: return receivedBy;
    case 7: return remarks;
    case 8: return submissionPlace;
    case 9: return uuid;
    case 10: return externalId;
    case 11: return consignmentId;
    case 12: return deliveryItems;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: status = (java.lang.String)value$; break;
    case 1: documents = (java.util.List<com.fretron.Model.Document>)value$; break;
    case 2: receiveDate = (java.lang.Long)value$; break;
    case 3: submissionDate = (java.lang.Long)value$; break;
    case 4: expectedSubmissionDate = (java.lang.Long)value$; break;
    case 5: issues = (java.util.List<java.lang.String>)value$; break;
    case 6: receivedBy = (java.lang.String)value$; break;
    case 7: remarks = (java.lang.String)value$; break;
    case 8: submissionPlace = (java.lang.String)value$; break;
    case 9: uuid = (java.lang.String)value$; break;
    case 10: externalId = (java.lang.String)value$; break;
    case 11: consignmentId = (java.lang.String)value$; break;
    case 12: deliveryItems = (java.util.List<com.fretron.Model.PodDeliveryItem>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.String value) {
    this.status = value;
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
   * Gets the value of the 'receiveDate' field.
   * @return The value of the 'receiveDate' field.
   */
  public java.lang.Long getReceiveDate() {
    return receiveDate;
  }

  /**
   * Sets the value of the 'receiveDate' field.
   * @param value the value to set.
   */
  public void setReceiveDate(java.lang.Long value) {
    this.receiveDate = value;
  }

  /**
   * Gets the value of the 'submissionDate' field.
   * @return The value of the 'submissionDate' field.
   */
  public java.lang.Long getSubmissionDate() {
    return submissionDate;
  }

  /**
   * Sets the value of the 'submissionDate' field.
   * @param value the value to set.
   */
  public void setSubmissionDate(java.lang.Long value) {
    this.submissionDate = value;
  }

  /**
   * Gets the value of the 'expectedSubmissionDate' field.
   * @return The value of the 'expectedSubmissionDate' field.
   */
  public java.lang.Long getExpectedSubmissionDate() {
    return expectedSubmissionDate;
  }

  /**
   * Sets the value of the 'expectedSubmissionDate' field.
   * @param value the value to set.
   */
  public void setExpectedSubmissionDate(java.lang.Long value) {
    this.expectedSubmissionDate = value;
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
   * Gets the value of the 'receivedBy' field.
   * @return The value of the 'receivedBy' field.
   */
  public java.lang.String getReceivedBy() {
    return receivedBy;
  }

  /**
   * Sets the value of the 'receivedBy' field.
   * @param value the value to set.
   */
  public void setReceivedBy(java.lang.String value) {
    this.receivedBy = value;
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
   * Gets the value of the 'submissionPlace' field.
   * @return The value of the 'submissionPlace' field.
   */
  public java.lang.String getSubmissionPlace() {
    return submissionPlace;
  }

  /**
   * Sets the value of the 'submissionPlace' field.
   * @param value the value to set.
   */
  public void setSubmissionPlace(java.lang.String value) {
    this.submissionPlace = value;
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
   * Gets the value of the 'externalId' field.
   * @return The value of the 'externalId' field.
   */
  public java.lang.String getExternalId() {
    return externalId;
  }

  /**
   * Sets the value of the 'externalId' field.
   * @param value the value to set.
   */
  public void setExternalId(java.lang.String value) {
    this.externalId = value;
  }

  /**
   * Gets the value of the 'consignmentId' field.
   * @return The value of the 'consignmentId' field.
   */
  public java.lang.String getConsignmentId() {
    return consignmentId;
  }

  /**
   * Sets the value of the 'consignmentId' field.
   * @param value the value to set.
   */
  public void setConsignmentId(java.lang.String value) {
    this.consignmentId = value;
  }

  /**
   * Gets the value of the 'deliveryItems' field.
   * @return The value of the 'deliveryItems' field.
   */
  public java.util.List<com.fretron.Model.PodDeliveryItem> getDeliveryItems() {
    return deliveryItems;
  }

  /**
   * Sets the value of the 'deliveryItems' field.
   * @param value the value to set.
   */
  public void setDeliveryItems(java.util.List<com.fretron.Model.PodDeliveryItem> value) {
    this.deliveryItems = value;
  }

  /**
   * Creates a new ConsignmentPod RecordBuilder.
   * @return A new ConsignmentPod RecordBuilder
   */
  public static com.fretron.Model.ConsignmentPod.Builder newBuilder() {
    return new com.fretron.Model.ConsignmentPod.Builder();
  }

  /**
   * Creates a new ConsignmentPod RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ConsignmentPod RecordBuilder
   */
  public static com.fretron.Model.ConsignmentPod.Builder newBuilder(com.fretron.Model.ConsignmentPod.Builder other) {
    return new com.fretron.Model.ConsignmentPod.Builder(other);
  }

  /**
   * Creates a new ConsignmentPod RecordBuilder by copying an existing ConsignmentPod instance.
   * @param other The existing instance to copy.
   * @return A new ConsignmentPod RecordBuilder
   */
  public static com.fretron.Model.ConsignmentPod.Builder newBuilder(com.fretron.Model.ConsignmentPod other) {
    return new com.fretron.Model.ConsignmentPod.Builder(other);
  }

  /**
   * RecordBuilder for ConsignmentPod instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ConsignmentPod>
    implements org.apache.avro.data.RecordBuilder<ConsignmentPod> {

    private java.lang.String status;
    private java.util.List<com.fretron.Model.Document> documents;
    private java.lang.Long receiveDate;
    private java.lang.Long submissionDate;
    private java.lang.Long expectedSubmissionDate;
    private java.util.List<java.lang.String> issues;
    private java.lang.String receivedBy;
    private java.lang.String remarks;
    private java.lang.String submissionPlace;
    private java.lang.String uuid;
    private java.lang.String externalId;
    private java.lang.String consignmentId;
    private java.util.List<com.fretron.Model.PodDeliveryItem> deliveryItems;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.ConsignmentPod.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.status)) {
        this.status = data().deepCopy(fields()[0].schema(), other.status);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.documents)) {
        this.documents = data().deepCopy(fields()[1].schema(), other.documents);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.receiveDate)) {
        this.receiveDate = data().deepCopy(fields()[2].schema(), other.receiveDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.submissionDate)) {
        this.submissionDate = data().deepCopy(fields()[3].schema(), other.submissionDate);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.expectedSubmissionDate)) {
        this.expectedSubmissionDate = data().deepCopy(fields()[4].schema(), other.expectedSubmissionDate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.issues)) {
        this.issues = data().deepCopy(fields()[5].schema(), other.issues);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.receivedBy)) {
        this.receivedBy = data().deepCopy(fields()[6].schema(), other.receivedBy);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.remarks)) {
        this.remarks = data().deepCopy(fields()[7].schema(), other.remarks);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.submissionPlace)) {
        this.submissionPlace = data().deepCopy(fields()[8].schema(), other.submissionPlace);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.uuid)) {
        this.uuid = data().deepCopy(fields()[9].schema(), other.uuid);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.externalId)) {
        this.externalId = data().deepCopy(fields()[10].schema(), other.externalId);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.consignmentId)) {
        this.consignmentId = data().deepCopy(fields()[11].schema(), other.consignmentId);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.deliveryItems)) {
        this.deliveryItems = data().deepCopy(fields()[12].schema(), other.deliveryItems);
        fieldSetFlags()[12] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ConsignmentPod instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.ConsignmentPod other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.status)) {
        this.status = data().deepCopy(fields()[0].schema(), other.status);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.documents)) {
        this.documents = data().deepCopy(fields()[1].schema(), other.documents);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.receiveDate)) {
        this.receiveDate = data().deepCopy(fields()[2].schema(), other.receiveDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.submissionDate)) {
        this.submissionDate = data().deepCopy(fields()[3].schema(), other.submissionDate);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.expectedSubmissionDate)) {
        this.expectedSubmissionDate = data().deepCopy(fields()[4].schema(), other.expectedSubmissionDate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.issues)) {
        this.issues = data().deepCopy(fields()[5].schema(), other.issues);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.receivedBy)) {
        this.receivedBy = data().deepCopy(fields()[6].schema(), other.receivedBy);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.remarks)) {
        this.remarks = data().deepCopy(fields()[7].schema(), other.remarks);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.submissionPlace)) {
        this.submissionPlace = data().deepCopy(fields()[8].schema(), other.submissionPlace);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.uuid)) {
        this.uuid = data().deepCopy(fields()[9].schema(), other.uuid);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.externalId)) {
        this.externalId = data().deepCopy(fields()[10].schema(), other.externalId);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.consignmentId)) {
        this.consignmentId = data().deepCopy(fields()[11].schema(), other.consignmentId);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.deliveryItems)) {
        this.deliveryItems = data().deepCopy(fields()[12].schema(), other.deliveryItems);
        fieldSetFlags()[12] = true;
      }
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.String getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder setStatus(java.lang.String value) {
      validate(fields()[0], value);
      this.status = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearStatus() {
      status = null;
      fieldSetFlags()[0] = false;
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
    public com.fretron.Model.ConsignmentPod.Builder setDocuments(java.util.List<com.fretron.Model.Document> value) {
      validate(fields()[1], value);
      this.documents = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'documents' field has been set.
      * @return True if the 'documents' field has been set, false otherwise.
      */
    public boolean hasDocuments() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'documents' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearDocuments() {
      documents = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'receiveDate' field.
      * @return The value.
      */
    public java.lang.Long getReceiveDate() {
      return receiveDate;
    }

    /**
      * Sets the value of the 'receiveDate' field.
      * @param value The value of 'receiveDate'.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder setReceiveDate(java.lang.Long value) {
      validate(fields()[2], value);
      this.receiveDate = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'receiveDate' field has been set.
      * @return True if the 'receiveDate' field has been set, false otherwise.
      */
    public boolean hasReceiveDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'receiveDate' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearReceiveDate() {
      receiveDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'submissionDate' field.
      * @return The value.
      */
    public java.lang.Long getSubmissionDate() {
      return submissionDate;
    }

    /**
      * Sets the value of the 'submissionDate' field.
      * @param value The value of 'submissionDate'.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder setSubmissionDate(java.lang.Long value) {
      validate(fields()[3], value);
      this.submissionDate = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'submissionDate' field has been set.
      * @return True if the 'submissionDate' field has been set, false otherwise.
      */
    public boolean hasSubmissionDate() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'submissionDate' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearSubmissionDate() {
      submissionDate = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'expectedSubmissionDate' field.
      * @return The value.
      */
    public java.lang.Long getExpectedSubmissionDate() {
      return expectedSubmissionDate;
    }

    /**
      * Sets the value of the 'expectedSubmissionDate' field.
      * @param value The value of 'expectedSubmissionDate'.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder setExpectedSubmissionDate(java.lang.Long value) {
      validate(fields()[4], value);
      this.expectedSubmissionDate = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'expectedSubmissionDate' field has been set.
      * @return True if the 'expectedSubmissionDate' field has been set, false otherwise.
      */
    public boolean hasExpectedSubmissionDate() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'expectedSubmissionDate' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearExpectedSubmissionDate() {
      expectedSubmissionDate = null;
      fieldSetFlags()[4] = false;
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
    public com.fretron.Model.ConsignmentPod.Builder setIssues(java.util.List<java.lang.String> value) {
      validate(fields()[5], value);
      this.issues = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'issues' field has been set.
      * @return True if the 'issues' field has been set, false otherwise.
      */
    public boolean hasIssues() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'issues' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearIssues() {
      issues = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'receivedBy' field.
      * @return The value.
      */
    public java.lang.String getReceivedBy() {
      return receivedBy;
    }

    /**
      * Sets the value of the 'receivedBy' field.
      * @param value The value of 'receivedBy'.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder setReceivedBy(java.lang.String value) {
      validate(fields()[6], value);
      this.receivedBy = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'receivedBy' field has been set.
      * @return True if the 'receivedBy' field has been set, false otherwise.
      */
    public boolean hasReceivedBy() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'receivedBy' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearReceivedBy() {
      receivedBy = null;
      fieldSetFlags()[6] = false;
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
    public com.fretron.Model.ConsignmentPod.Builder setRemarks(java.lang.String value) {
      validate(fields()[7], value);
      this.remarks = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'remarks' field has been set.
      * @return True if the 'remarks' field has been set, false otherwise.
      */
    public boolean hasRemarks() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'remarks' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearRemarks() {
      remarks = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'submissionPlace' field.
      * @return The value.
      */
    public java.lang.String getSubmissionPlace() {
      return submissionPlace;
    }

    /**
      * Sets the value of the 'submissionPlace' field.
      * @param value The value of 'submissionPlace'.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder setSubmissionPlace(java.lang.String value) {
      validate(fields()[8], value);
      this.submissionPlace = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'submissionPlace' field has been set.
      * @return True if the 'submissionPlace' field has been set, false otherwise.
      */
    public boolean hasSubmissionPlace() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'submissionPlace' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearSubmissionPlace() {
      submissionPlace = null;
      fieldSetFlags()[8] = false;
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
    public com.fretron.Model.ConsignmentPod.Builder setUuid(java.lang.String value) {
      validate(fields()[9], value);
      this.uuid = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'uuid' field has been set.
      * @return True if the 'uuid' field has been set, false otherwise.
      */
    public boolean hasUuid() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'uuid' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'externalId' field.
      * @return The value.
      */
    public java.lang.String getExternalId() {
      return externalId;
    }

    /**
      * Sets the value of the 'externalId' field.
      * @param value The value of 'externalId'.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder setExternalId(java.lang.String value) {
      validate(fields()[10], value);
      this.externalId = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'externalId' field has been set.
      * @return True if the 'externalId' field has been set, false otherwise.
      */
    public boolean hasExternalId() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'externalId' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearExternalId() {
      externalId = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'consignmentId' field.
      * @return The value.
      */
    public java.lang.String getConsignmentId() {
      return consignmentId;
    }

    /**
      * Sets the value of the 'consignmentId' field.
      * @param value The value of 'consignmentId'.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder setConsignmentId(java.lang.String value) {
      validate(fields()[11], value);
      this.consignmentId = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'consignmentId' field has been set.
      * @return True if the 'consignmentId' field has been set, false otherwise.
      */
    public boolean hasConsignmentId() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'consignmentId' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearConsignmentId() {
      consignmentId = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'deliveryItems' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.PodDeliveryItem> getDeliveryItems() {
      return deliveryItems;
    }

    /**
      * Sets the value of the 'deliveryItems' field.
      * @param value The value of 'deliveryItems'.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder setDeliveryItems(java.util.List<com.fretron.Model.PodDeliveryItem> value) {
      validate(fields()[12], value);
      this.deliveryItems = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'deliveryItems' field has been set.
      * @return True if the 'deliveryItems' field has been set, false otherwise.
      */
    public boolean hasDeliveryItems() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'deliveryItems' field.
      * @return This builder.
      */
    public com.fretron.Model.ConsignmentPod.Builder clearDeliveryItems() {
      deliveryItems = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    @Override
    public ConsignmentPod build() {
      try {
        ConsignmentPod record = new ConsignmentPod();
        record.status = fieldSetFlags()[0] ? this.status : (java.lang.String) defaultValue(fields()[0]);
        record.documents = fieldSetFlags()[1] ? this.documents : (java.util.List<com.fretron.Model.Document>) defaultValue(fields()[1]);
        record.receiveDate = fieldSetFlags()[2] ? this.receiveDate : (java.lang.Long) defaultValue(fields()[2]);
        record.submissionDate = fieldSetFlags()[3] ? this.submissionDate : (java.lang.Long) defaultValue(fields()[3]);
        record.expectedSubmissionDate = fieldSetFlags()[4] ? this.expectedSubmissionDate : (java.lang.Long) defaultValue(fields()[4]);
        record.issues = fieldSetFlags()[5] ? this.issues : (java.util.List<java.lang.String>) defaultValue(fields()[5]);
        record.receivedBy = fieldSetFlags()[6] ? this.receivedBy : (java.lang.String) defaultValue(fields()[6]);
        record.remarks = fieldSetFlags()[7] ? this.remarks : (java.lang.String) defaultValue(fields()[7]);
        record.submissionPlace = fieldSetFlags()[8] ? this.submissionPlace : (java.lang.String) defaultValue(fields()[8]);
        record.uuid = fieldSetFlags()[9] ? this.uuid : (java.lang.String) defaultValue(fields()[9]);
        record.externalId = fieldSetFlags()[10] ? this.externalId : (java.lang.String) defaultValue(fields()[10]);
        record.consignmentId = fieldSetFlags()[11] ? this.consignmentId : (java.lang.String) defaultValue(fields()[11]);
        record.deliveryItems = fieldSetFlags()[12] ? this.deliveryItems : (java.util.List<com.fretron.Model.PodDeliveryItem>) defaultValue(fields()[12]);
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
