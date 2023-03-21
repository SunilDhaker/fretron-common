/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ShipmentCostLineItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 43807612114887236L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShipmentCostLineItem\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"amount\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"consignmentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"charge\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ChartsOfAccountLite\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"accountGroup\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"accountPath\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}],\"default\":null},{\"name\":\"billId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"billItemId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"billStatus\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Double amount;
  @Deprecated public java.lang.String consignmentId;
  @Deprecated public com.fretron.Model.ChartsOfAccountLite charge;
  @Deprecated public java.lang.String billId;
  @Deprecated public java.lang.String billItemId;
  @Deprecated public java.lang.String billStatus;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ShipmentCostLineItem() {}

  /**
   * All-args constructor.
   * @param amount The new value for amount
   * @param consignmentId The new value for consignmentId
   * @param charge The new value for charge
   * @param billId The new value for billId
   * @param billItemId The new value for billItemId
   * @param billStatus The new value for billStatus
   */
  public ShipmentCostLineItem(java.lang.Double amount, java.lang.String consignmentId, com.fretron.Model.ChartsOfAccountLite charge, java.lang.String billId, java.lang.String billItemId, java.lang.String billStatus) {
    this.amount = amount;
    this.consignmentId = consignmentId;
    this.charge = charge;
    this.billId = billId;
    this.billItemId = billItemId;
    this.billStatus = billStatus;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return amount;
    case 1: return consignmentId;
    case 2: return charge;
    case 3: return billId;
    case 4: return billItemId;
    case 5: return billStatus;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: amount = (java.lang.Double)value$; break;
    case 1: consignmentId = (java.lang.String)value$; break;
    case 2: charge = (com.fretron.Model.ChartsOfAccountLite)value$; break;
    case 3: billId = (java.lang.String)value$; break;
    case 4: billItemId = (java.lang.String)value$; break;
    case 5: billStatus = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public java.lang.Double getAmount() {
    return amount;
  }

  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(java.lang.Double value) {
    this.amount = value;
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
   * Gets the value of the 'charge' field.
   * @return The value of the 'charge' field.
   */
  public com.fretron.Model.ChartsOfAccountLite getCharge() {
    return charge;
  }

  /**
   * Sets the value of the 'charge' field.
   * @param value the value to set.
   */
  public void setCharge(com.fretron.Model.ChartsOfAccountLite value) {
    this.charge = value;
  }

  /**
   * Gets the value of the 'billId' field.
   * @return The value of the 'billId' field.
   */
  public java.lang.String getBillId() {
    return billId;
  }

  /**
   * Sets the value of the 'billId' field.
   * @param value the value to set.
   */
  public void setBillId(java.lang.String value) {
    this.billId = value;
  }

  /**
   * Gets the value of the 'billItemId' field.
   * @return The value of the 'billItemId' field.
   */
  public java.lang.String getBillItemId() {
    return billItemId;
  }

  /**
   * Sets the value of the 'billItemId' field.
   * @param value the value to set.
   */
  public void setBillItemId(java.lang.String value) {
    this.billItemId = value;
  }

  /**
   * Gets the value of the 'billStatus' field.
   * @return The value of the 'billStatus' field.
   */
  public java.lang.String getBillStatus() {
    return billStatus;
  }

  /**
   * Sets the value of the 'billStatus' field.
   * @param value the value to set.
   */
  public void setBillStatus(java.lang.String value) {
    this.billStatus = value;
  }

  /**
   * Creates a new ShipmentCostLineItem RecordBuilder.
   * @return A new ShipmentCostLineItem RecordBuilder
   */
  public static com.fretron.Model.ShipmentCostLineItem.Builder newBuilder() {
    return new com.fretron.Model.ShipmentCostLineItem.Builder();
  }

  /**
   * Creates a new ShipmentCostLineItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ShipmentCostLineItem RecordBuilder
   */
  public static com.fretron.Model.ShipmentCostLineItem.Builder newBuilder(com.fretron.Model.ShipmentCostLineItem.Builder other) {
    return new com.fretron.Model.ShipmentCostLineItem.Builder(other);
  }

  /**
   * Creates a new ShipmentCostLineItem RecordBuilder by copying an existing ShipmentCostLineItem instance.
   * @param other The existing instance to copy.
   * @return A new ShipmentCostLineItem RecordBuilder
   */
  public static com.fretron.Model.ShipmentCostLineItem.Builder newBuilder(com.fretron.Model.ShipmentCostLineItem other) {
    return new com.fretron.Model.ShipmentCostLineItem.Builder(other);
  }

  /**
   * RecordBuilder for ShipmentCostLineItem instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ShipmentCostLineItem>
    implements org.apache.avro.data.RecordBuilder<ShipmentCostLineItem> {

    private java.lang.Double amount;
    private java.lang.String consignmentId;
    private com.fretron.Model.ChartsOfAccountLite charge;
    private com.fretron.Model.ChartsOfAccountLite.Builder chargeBuilder;
    private java.lang.String billId;
    private java.lang.String billItemId;
    private java.lang.String billStatus;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.ShipmentCostLineItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.amount)) {
        this.amount = data().deepCopy(fields()[0].schema(), other.amount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.consignmentId)) {
        this.consignmentId = data().deepCopy(fields()[1].schema(), other.consignmentId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.charge)) {
        this.charge = data().deepCopy(fields()[2].schema(), other.charge);
        fieldSetFlags()[2] = true;
      }
      if (other.hasChargeBuilder()) {
        this.chargeBuilder = com.fretron.Model.ChartsOfAccountLite.newBuilder(other.getChargeBuilder());
      }
      if (isValidValue(fields()[3], other.billId)) {
        this.billId = data().deepCopy(fields()[3].schema(), other.billId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.billItemId)) {
        this.billItemId = data().deepCopy(fields()[4].schema(), other.billItemId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.billStatus)) {
        this.billStatus = data().deepCopy(fields()[5].schema(), other.billStatus);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ShipmentCostLineItem instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.ShipmentCostLineItem other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.amount)) {
        this.amount = data().deepCopy(fields()[0].schema(), other.amount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.consignmentId)) {
        this.consignmentId = data().deepCopy(fields()[1].schema(), other.consignmentId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.charge)) {
        this.charge = data().deepCopy(fields()[2].schema(), other.charge);
        fieldSetFlags()[2] = true;
      }
      this.chargeBuilder = null;
      if (isValidValue(fields()[3], other.billId)) {
        this.billId = data().deepCopy(fields()[3].schema(), other.billId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.billItemId)) {
        this.billItemId = data().deepCopy(fields()[4].schema(), other.billItemId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.billStatus)) {
        this.billStatus = data().deepCopy(fields()[5].schema(), other.billStatus);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public java.lang.Double getAmount() {
      return amount;
    }

    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentCostLineItem.Builder setAmount(java.lang.Double value) {
      validate(fields()[0], value);
      this.amount = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentCostLineItem.Builder clearAmount() {
      amount = null;
      fieldSetFlags()[0] = false;
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
    public com.fretron.Model.ShipmentCostLineItem.Builder setConsignmentId(java.lang.String value) {
      validate(fields()[1], value);
      this.consignmentId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'consignmentId' field has been set.
      * @return True if the 'consignmentId' field has been set, false otherwise.
      */
    public boolean hasConsignmentId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'consignmentId' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentCostLineItem.Builder clearConsignmentId() {
      consignmentId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'charge' field.
      * @return The value.
      */
    public com.fretron.Model.ChartsOfAccountLite getCharge() {
      return charge;
    }

    /**
      * Sets the value of the 'charge' field.
      * @param value The value of 'charge'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentCostLineItem.Builder setCharge(com.fretron.Model.ChartsOfAccountLite value) {
      validate(fields()[2], value);
      this.chargeBuilder = null;
      this.charge = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'charge' field has been set.
      * @return True if the 'charge' field has been set, false otherwise.
      */
    public boolean hasCharge() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'charge' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.ChartsOfAccountLite.Builder getChargeBuilder() {
      if (chargeBuilder == null) {
        if (hasCharge()) {
          setChargeBuilder(com.fretron.Model.ChartsOfAccountLite.newBuilder(charge));
        } else {
          setChargeBuilder(com.fretron.Model.ChartsOfAccountLite.newBuilder());
        }
      }
      return chargeBuilder;
    }

    /**
     * Sets the Builder instance for the 'charge' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.ShipmentCostLineItem.Builder setChargeBuilder(com.fretron.Model.ChartsOfAccountLite.Builder value) {
      clearCharge();
      chargeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'charge' field has an active Builder instance
     * @return True if the 'charge' field has an active Builder instance
     */
    public boolean hasChargeBuilder() {
      return chargeBuilder != null;
    }

    /**
      * Clears the value of the 'charge' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentCostLineItem.Builder clearCharge() {
      charge = null;
      chargeBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'billId' field.
      * @return The value.
      */
    public java.lang.String getBillId() {
      return billId;
    }

    /**
      * Sets the value of the 'billId' field.
      * @param value The value of 'billId'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentCostLineItem.Builder setBillId(java.lang.String value) {
      validate(fields()[3], value);
      this.billId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'billId' field has been set.
      * @return True if the 'billId' field has been set, false otherwise.
      */
    public boolean hasBillId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'billId' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentCostLineItem.Builder clearBillId() {
      billId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'billItemId' field.
      * @return The value.
      */
    public java.lang.String getBillItemId() {
      return billItemId;
    }

    /**
      * Sets the value of the 'billItemId' field.
      * @param value The value of 'billItemId'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentCostLineItem.Builder setBillItemId(java.lang.String value) {
      validate(fields()[4], value);
      this.billItemId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'billItemId' field has been set.
      * @return True if the 'billItemId' field has been set, false otherwise.
      */
    public boolean hasBillItemId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'billItemId' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentCostLineItem.Builder clearBillItemId() {
      billItemId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'billStatus' field.
      * @return The value.
      */
    public java.lang.String getBillStatus() {
      return billStatus;
    }

    /**
      * Sets the value of the 'billStatus' field.
      * @param value The value of 'billStatus'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentCostLineItem.Builder setBillStatus(java.lang.String value) {
      validate(fields()[5], value);
      this.billStatus = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'billStatus' field has been set.
      * @return True if the 'billStatus' field has been set, false otherwise.
      */
    public boolean hasBillStatus() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'billStatus' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentCostLineItem.Builder clearBillStatus() {
      billStatus = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public ShipmentCostLineItem build() {
      try {
        ShipmentCostLineItem record = new ShipmentCostLineItem();
        record.amount = fieldSetFlags()[0] ? this.amount : (java.lang.Double) defaultValue(fields()[0]);
        record.consignmentId = fieldSetFlags()[1] ? this.consignmentId : (java.lang.String) defaultValue(fields()[1]);
        if (chargeBuilder != null) {
          record.charge = this.chargeBuilder.build();
        } else {
          record.charge = fieldSetFlags()[2] ? this.charge : (com.fretron.Model.ChartsOfAccountLite) defaultValue(fields()[2]);
        }
        record.billId = fieldSetFlags()[3] ? this.billId : (java.lang.String) defaultValue(fields()[3]);
        record.billItemId = fieldSetFlags()[4] ? this.billItemId : (java.lang.String) defaultValue(fields()[4]);
        record.billStatus = fieldSetFlags()[5] ? this.billStatus : (java.lang.String) defaultValue(fields()[5]);
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
