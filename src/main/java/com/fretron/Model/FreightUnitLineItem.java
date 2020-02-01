/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FreightUnitLineItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2399991385647900151L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FreightUnitLineItem\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"salesOrderMappings\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SalesOrderMapping\",\"fields\":[{\"name\":\"orderId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lineItemId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"legType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"consignmentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"quantity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"StandardMeasurement\",\"fields\":[{\"name\":\"weight\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Measurement\",\"fields\":[{\"name\":\"measurmentType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"unitOfMeasurment\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"plannedLoadQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"actualLoadedQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"netQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"grossQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"standardQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"actualDeliveredQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"shortage\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"frieghtDeductableQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"claimQuantity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"temperature\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"density\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"moisture\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null},{\"name\":\"volume\",\"type\":[\"null\",\"Measurement\"],\"default\":null},{\"name\":\"packageMeasurement\",\"type\":[\"null\",\"Measurement\"],\"default\":null}]}],\"default\":null}]}}],\"default\":null},{\"name\":\"purchaseOrderId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"purchaseLineItemId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"auctionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"optimisationBasis\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"utilization\",\"type\":[\"null\",\"double\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String status;
  @Deprecated public java.util.List<com.fretron.Model.SalesOrderMapping> salesOrderMappings;
  @Deprecated public java.lang.String purchaseOrderId;
  @Deprecated public java.lang.String purchaseLineItemId;
  @Deprecated public java.lang.String auctionId;
  @Deprecated public java.lang.String optimisationBasis;
  @Deprecated public java.lang.Double utilization;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FreightUnitLineItem() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param status The new value for status
   * @param salesOrderMappings The new value for salesOrderMappings
   * @param purchaseOrderId The new value for purchaseOrderId
   * @param purchaseLineItemId The new value for purchaseLineItemId
   * @param auctionId The new value for auctionId
   * @param optimisationBasis The new value for optimisationBasis
   * @param utilization The new value for utilization
   */
  public FreightUnitLineItem(java.lang.String uuid, java.lang.String status, java.util.List<com.fretron.Model.SalesOrderMapping> salesOrderMappings, java.lang.String purchaseOrderId, java.lang.String purchaseLineItemId, java.lang.String auctionId, java.lang.String optimisationBasis, java.lang.Double utilization) {
    this.uuid = uuid;
    this.status = status;
    this.salesOrderMappings = salesOrderMappings;
    this.purchaseOrderId = purchaseOrderId;
    this.purchaseLineItemId = purchaseLineItemId;
    this.auctionId = auctionId;
    this.optimisationBasis = optimisationBasis;
    this.utilization = utilization;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return status;
    case 2: return salesOrderMappings;
    case 3: return purchaseOrderId;
    case 4: return purchaseLineItemId;
    case 5: return auctionId;
    case 6: return optimisationBasis;
    case 7: return utilization;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: status = (java.lang.String)value$; break;
    case 2: salesOrderMappings = (java.util.List<com.fretron.Model.SalesOrderMapping>)value$; break;
    case 3: purchaseOrderId = (java.lang.String)value$; break;
    case 4: purchaseLineItemId = (java.lang.String)value$; break;
    case 5: auctionId = (java.lang.String)value$; break;
    case 6: optimisationBasis = (java.lang.String)value$; break;
    case 7: utilization = (java.lang.Double)value$; break;
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
   * Gets the value of the 'salesOrderMappings' field.
   * @return The value of the 'salesOrderMappings' field.
   */
  public java.util.List<com.fretron.Model.SalesOrderMapping> getSalesOrderMappings() {
    return salesOrderMappings;
  }

  /**
   * Sets the value of the 'salesOrderMappings' field.
   * @param value the value to set.
   */
  public void setSalesOrderMappings(java.util.List<com.fretron.Model.SalesOrderMapping> value) {
    this.salesOrderMappings = value;
  }

  /**
   * Gets the value of the 'purchaseOrderId' field.
   * @return The value of the 'purchaseOrderId' field.
   */
  public java.lang.String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  /**
   * Sets the value of the 'purchaseOrderId' field.
   * @param value the value to set.
   */
  public void setPurchaseOrderId(java.lang.String value) {
    this.purchaseOrderId = value;
  }

  /**
   * Gets the value of the 'purchaseLineItemId' field.
   * @return The value of the 'purchaseLineItemId' field.
   */
  public java.lang.String getPurchaseLineItemId() {
    return purchaseLineItemId;
  }

  /**
   * Sets the value of the 'purchaseLineItemId' field.
   * @param value the value to set.
   */
  public void setPurchaseLineItemId(java.lang.String value) {
    this.purchaseLineItemId = value;
  }

  /**
   * Gets the value of the 'auctionId' field.
   * @return The value of the 'auctionId' field.
   */
  public java.lang.String getAuctionId() {
    return auctionId;
  }

  /**
   * Sets the value of the 'auctionId' field.
   * @param value the value to set.
   */
  public void setAuctionId(java.lang.String value) {
    this.auctionId = value;
  }

  /**
   * Gets the value of the 'optimisationBasis' field.
   * @return The value of the 'optimisationBasis' field.
   */
  public java.lang.String getOptimisationBasis() {
    return optimisationBasis;
  }

  /**
   * Sets the value of the 'optimisationBasis' field.
   * @param value the value to set.
   */
  public void setOptimisationBasis(java.lang.String value) {
    this.optimisationBasis = value;
  }

  /**
   * Gets the value of the 'utilization' field.
   * @return The value of the 'utilization' field.
   */
  public java.lang.Double getUtilization() {
    return utilization;
  }

  /**
   * Sets the value of the 'utilization' field.
   * @param value the value to set.
   */
  public void setUtilization(java.lang.Double value) {
    this.utilization = value;
  }

  /**
   * Creates a new FreightUnitLineItem RecordBuilder.
   * @return A new FreightUnitLineItem RecordBuilder
   */
  public static com.fretron.Model.FreightUnitLineItem.Builder newBuilder() {
    return new com.fretron.Model.FreightUnitLineItem.Builder();
  }

  /**
   * Creates a new FreightUnitLineItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FreightUnitLineItem RecordBuilder
   */
  public static com.fretron.Model.FreightUnitLineItem.Builder newBuilder(com.fretron.Model.FreightUnitLineItem.Builder other) {
    return new com.fretron.Model.FreightUnitLineItem.Builder(other);
  }

  /**
   * Creates a new FreightUnitLineItem RecordBuilder by copying an existing FreightUnitLineItem instance.
   * @param other The existing instance to copy.
   * @return A new FreightUnitLineItem RecordBuilder
   */
  public static com.fretron.Model.FreightUnitLineItem.Builder newBuilder(com.fretron.Model.FreightUnitLineItem other) {
    return new com.fretron.Model.FreightUnitLineItem.Builder(other);
  }

  /**
   * RecordBuilder for FreightUnitLineItem instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FreightUnitLineItem>
    implements org.apache.avro.data.RecordBuilder<FreightUnitLineItem> {

    private java.lang.String uuid;
    private java.lang.String status;
    private java.util.List<com.fretron.Model.SalesOrderMapping> salesOrderMappings;
    private java.lang.String purchaseOrderId;
    private java.lang.String purchaseLineItemId;
    private java.lang.String auctionId;
    private java.lang.String optimisationBasis;
    private java.lang.Double utilization;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.FreightUnitLineItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.salesOrderMappings)) {
        this.salesOrderMappings = data().deepCopy(fields()[2].schema(), other.salesOrderMappings);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.purchaseOrderId)) {
        this.purchaseOrderId = data().deepCopy(fields()[3].schema(), other.purchaseOrderId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.purchaseLineItemId)) {
        this.purchaseLineItemId = data().deepCopy(fields()[4].schema(), other.purchaseLineItemId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.auctionId)) {
        this.auctionId = data().deepCopy(fields()[5].schema(), other.auctionId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.optimisationBasis)) {
        this.optimisationBasis = data().deepCopy(fields()[6].schema(), other.optimisationBasis);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.utilization)) {
        this.utilization = data().deepCopy(fields()[7].schema(), other.utilization);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing FreightUnitLineItem instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.FreightUnitLineItem other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.salesOrderMappings)) {
        this.salesOrderMappings = data().deepCopy(fields()[2].schema(), other.salesOrderMappings);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.purchaseOrderId)) {
        this.purchaseOrderId = data().deepCopy(fields()[3].schema(), other.purchaseOrderId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.purchaseLineItemId)) {
        this.purchaseLineItemId = data().deepCopy(fields()[4].schema(), other.purchaseLineItemId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.auctionId)) {
        this.auctionId = data().deepCopy(fields()[5].schema(), other.auctionId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.optimisationBasis)) {
        this.optimisationBasis = data().deepCopy(fields()[6].schema(), other.optimisationBasis);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.utilization)) {
        this.utilization = data().deepCopy(fields()[7].schema(), other.utilization);
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
    public com.fretron.Model.FreightUnitLineItem.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.FreightUnitLineItem.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
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
    public com.fretron.Model.FreightUnitLineItem.Builder setStatus(java.lang.String value) {
      validate(fields()[1], value);
      this.status = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder clearStatus() {
      status = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'salesOrderMappings' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.SalesOrderMapping> getSalesOrderMappings() {
      return salesOrderMappings;
    }

    /**
      * Sets the value of the 'salesOrderMappings' field.
      * @param value The value of 'salesOrderMappings'.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder setSalesOrderMappings(java.util.List<com.fretron.Model.SalesOrderMapping> value) {
      validate(fields()[2], value);
      this.salesOrderMappings = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'salesOrderMappings' field has been set.
      * @return True if the 'salesOrderMappings' field has been set, false otherwise.
      */
    public boolean hasSalesOrderMappings() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'salesOrderMappings' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder clearSalesOrderMappings() {
      salesOrderMappings = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'purchaseOrderId' field.
      * @return The value.
      */
    public java.lang.String getPurchaseOrderId() {
      return purchaseOrderId;
    }

    /**
      * Sets the value of the 'purchaseOrderId' field.
      * @param value The value of 'purchaseOrderId'.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder setPurchaseOrderId(java.lang.String value) {
      validate(fields()[3], value);
      this.purchaseOrderId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'purchaseOrderId' field has been set.
      * @return True if the 'purchaseOrderId' field has been set, false otherwise.
      */
    public boolean hasPurchaseOrderId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'purchaseOrderId' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder clearPurchaseOrderId() {
      purchaseOrderId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'purchaseLineItemId' field.
      * @return The value.
      */
    public java.lang.String getPurchaseLineItemId() {
      return purchaseLineItemId;
    }

    /**
      * Sets the value of the 'purchaseLineItemId' field.
      * @param value The value of 'purchaseLineItemId'.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder setPurchaseLineItemId(java.lang.String value) {
      validate(fields()[4], value);
      this.purchaseLineItemId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'purchaseLineItemId' field has been set.
      * @return True if the 'purchaseLineItemId' field has been set, false otherwise.
      */
    public boolean hasPurchaseLineItemId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'purchaseLineItemId' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder clearPurchaseLineItemId() {
      purchaseLineItemId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'auctionId' field.
      * @return The value.
      */
    public java.lang.String getAuctionId() {
      return auctionId;
    }

    /**
      * Sets the value of the 'auctionId' field.
      * @param value The value of 'auctionId'.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder setAuctionId(java.lang.String value) {
      validate(fields()[5], value);
      this.auctionId = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'auctionId' field has been set.
      * @return True if the 'auctionId' field has been set, false otherwise.
      */
    public boolean hasAuctionId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'auctionId' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder clearAuctionId() {
      auctionId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'optimisationBasis' field.
      * @return The value.
      */
    public java.lang.String getOptimisationBasis() {
      return optimisationBasis;
    }

    /**
      * Sets the value of the 'optimisationBasis' field.
      * @param value The value of 'optimisationBasis'.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder setOptimisationBasis(java.lang.String value) {
      validate(fields()[6], value);
      this.optimisationBasis = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'optimisationBasis' field has been set.
      * @return True if the 'optimisationBasis' field has been set, false otherwise.
      */
    public boolean hasOptimisationBasis() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'optimisationBasis' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder clearOptimisationBasis() {
      optimisationBasis = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'utilization' field.
      * @return The value.
      */
    public java.lang.Double getUtilization() {
      return utilization;
    }

    /**
      * Sets the value of the 'utilization' field.
      * @param value The value of 'utilization'.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder setUtilization(java.lang.Double value) {
      validate(fields()[7], value);
      this.utilization = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'utilization' field has been set.
      * @return True if the 'utilization' field has been set, false otherwise.
      */
    public boolean hasUtilization() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'utilization' field.
      * @return This builder.
      */
    public com.fretron.Model.FreightUnitLineItem.Builder clearUtilization() {
      utilization = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public FreightUnitLineItem build() {
      try {
        FreightUnitLineItem record = new FreightUnitLineItem();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.status = fieldSetFlags()[1] ? this.status : (java.lang.String) defaultValue(fields()[1]);
        record.salesOrderMappings = fieldSetFlags()[2] ? this.salesOrderMappings : (java.util.List<com.fretron.Model.SalesOrderMapping>) defaultValue(fields()[2]);
        record.purchaseOrderId = fieldSetFlags()[3] ? this.purchaseOrderId : (java.lang.String) defaultValue(fields()[3]);
        record.purchaseLineItemId = fieldSetFlags()[4] ? this.purchaseLineItemId : (java.lang.String) defaultValue(fields()[4]);
        record.auctionId = fieldSetFlags()[5] ? this.auctionId : (java.lang.String) defaultValue(fields()[5]);
        record.optimisationBasis = fieldSetFlags()[6] ? this.optimisationBasis : (java.lang.String) defaultValue(fields()[6]);
        record.utilization = fieldSetFlags()[7] ? this.utilization : (java.lang.Double) defaultValue(fields()[7]);
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