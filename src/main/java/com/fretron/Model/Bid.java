/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Bid extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2358052897193472872L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Bid\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"businessPartnerId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"partnerName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"numberOfVehicles\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"amount\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"rank\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"contacts\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"vehicleType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"purchaseOrderId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String status;
  @Deprecated public java.lang.String businessPartnerId;
  @Deprecated public java.lang.String partnerName;
  @Deprecated public java.lang.Integer numberOfVehicles;
  @Deprecated public java.lang.Double amount;
  @Deprecated public java.lang.Double rank;
  @Deprecated public java.util.List<java.lang.String> contacts;
  @Deprecated public java.lang.String vehicleType;
  @Deprecated public java.lang.String purchaseOrderId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Bid() {}

  /**
   * All-args constructor.
   * @param status The new value for status
   * @param businessPartnerId The new value for businessPartnerId
   * @param partnerName The new value for partnerName
   * @param numberOfVehicles The new value for numberOfVehicles
   * @param amount The new value for amount
   * @param rank The new value for rank
   * @param contacts The new value for contacts
   * @param vehicleType The new value for vehicleType
   * @param purchaseOrderId The new value for purchaseOrderId
   */
  public Bid(java.lang.String status, java.lang.String businessPartnerId, java.lang.String partnerName, java.lang.Integer numberOfVehicles, java.lang.Double amount, java.lang.Double rank, java.util.List<java.lang.String> contacts, java.lang.String vehicleType, java.lang.String purchaseOrderId) {
    this.status = status;
    this.businessPartnerId = businessPartnerId;
    this.partnerName = partnerName;
    this.numberOfVehicles = numberOfVehicles;
    this.amount = amount;
    this.rank = rank;
    this.contacts = contacts;
    this.vehicleType = vehicleType;
    this.purchaseOrderId = purchaseOrderId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return status;
    case 1: return businessPartnerId;
    case 2: return partnerName;
    case 3: return numberOfVehicles;
    case 4: return amount;
    case 5: return rank;
    case 6: return contacts;
    case 7: return vehicleType;
    case 8: return purchaseOrderId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: status = (java.lang.String)value$; break;
    case 1: businessPartnerId = (java.lang.String)value$; break;
    case 2: partnerName = (java.lang.String)value$; break;
    case 3: numberOfVehicles = (java.lang.Integer)value$; break;
    case 4: amount = (java.lang.Double)value$; break;
    case 5: rank = (java.lang.Double)value$; break;
    case 6: contacts = (java.util.List<java.lang.String>)value$; break;
    case 7: vehicleType = (java.lang.String)value$; break;
    case 8: purchaseOrderId = (java.lang.String)value$; break;
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
   * Gets the value of the 'businessPartnerId' field.
   * @return The value of the 'businessPartnerId' field.
   */
  public java.lang.String getBusinessPartnerId() {
    return businessPartnerId;
  }

  /**
   * Sets the value of the 'businessPartnerId' field.
   * @param value the value to set.
   */
  public void setBusinessPartnerId(java.lang.String value) {
    this.businessPartnerId = value;
  }

  /**
   * Gets the value of the 'partnerName' field.
   * @return The value of the 'partnerName' field.
   */
  public java.lang.String getPartnerName() {
    return partnerName;
  }

  /**
   * Sets the value of the 'partnerName' field.
   * @param value the value to set.
   */
  public void setPartnerName(java.lang.String value) {
    this.partnerName = value;
  }

  /**
   * Gets the value of the 'numberOfVehicles' field.
   * @return The value of the 'numberOfVehicles' field.
   */
  public java.lang.Integer getNumberOfVehicles() {
    return numberOfVehicles;
  }

  /**
   * Sets the value of the 'numberOfVehicles' field.
   * @param value the value to set.
   */
  public void setNumberOfVehicles(java.lang.Integer value) {
    this.numberOfVehicles = value;
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
   * Gets the value of the 'rank' field.
   * @return The value of the 'rank' field.
   */
  public java.lang.Double getRank() {
    return rank;
  }

  /**
   * Sets the value of the 'rank' field.
   * @param value the value to set.
   */
  public void setRank(java.lang.Double value) {
    this.rank = value;
  }

  /**
   * Gets the value of the 'contacts' field.
   * @return The value of the 'contacts' field.
   */
  public java.util.List<java.lang.String> getContacts() {
    return contacts;
  }

  /**
   * Sets the value of the 'contacts' field.
   * @param value the value to set.
   */
  public void setContacts(java.util.List<java.lang.String> value) {
    this.contacts = value;
  }

  /**
   * Gets the value of the 'vehicleType' field.
   * @return The value of the 'vehicleType' field.
   */
  public java.lang.String getVehicleType() {
    return vehicleType;
  }

  /**
   * Sets the value of the 'vehicleType' field.
   * @param value the value to set.
   */
  public void setVehicleType(java.lang.String value) {
    this.vehicleType = value;
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
   * Creates a new Bid RecordBuilder.
   * @return A new Bid RecordBuilder
   */
  public static com.fretron.Model.Bid.Builder newBuilder() {
    return new com.fretron.Model.Bid.Builder();
  }

  /**
   * Creates a new Bid RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Bid RecordBuilder
   */
  public static com.fretron.Model.Bid.Builder newBuilder(com.fretron.Model.Bid.Builder other) {
    return new com.fretron.Model.Bid.Builder(other);
  }

  /**
   * Creates a new Bid RecordBuilder by copying an existing Bid instance.
   * @param other The existing instance to copy.
   * @return A new Bid RecordBuilder
   */
  public static com.fretron.Model.Bid.Builder newBuilder(com.fretron.Model.Bid other) {
    return new com.fretron.Model.Bid.Builder(other);
  }

  /**
   * RecordBuilder for Bid instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Bid>
    implements org.apache.avro.data.RecordBuilder<Bid> {

    private java.lang.String status;
    private java.lang.String businessPartnerId;
    private java.lang.String partnerName;
    private java.lang.Integer numberOfVehicles;
    private java.lang.Double amount;
    private java.lang.Double rank;
    private java.util.List<java.lang.String> contacts;
    private java.lang.String vehicleType;
    private java.lang.String purchaseOrderId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Bid.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.status)) {
        this.status = data().deepCopy(fields()[0].schema(), other.status);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.businessPartnerId)) {
        this.businessPartnerId = data().deepCopy(fields()[1].schema(), other.businessPartnerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.partnerName)) {
        this.partnerName = data().deepCopy(fields()[2].schema(), other.partnerName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.numberOfVehicles)) {
        this.numberOfVehicles = data().deepCopy(fields()[3].schema(), other.numberOfVehicles);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.amount)) {
        this.amount = data().deepCopy(fields()[4].schema(), other.amount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.rank)) {
        this.rank = data().deepCopy(fields()[5].schema(), other.rank);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.contacts)) {
        this.contacts = data().deepCopy(fields()[6].schema(), other.contacts);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.vehicleType)) {
        this.vehicleType = data().deepCopy(fields()[7].schema(), other.vehicleType);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.purchaseOrderId)) {
        this.purchaseOrderId = data().deepCopy(fields()[8].schema(), other.purchaseOrderId);
        fieldSetFlags()[8] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Bid instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Bid other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.status)) {
        this.status = data().deepCopy(fields()[0].schema(), other.status);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.businessPartnerId)) {
        this.businessPartnerId = data().deepCopy(fields()[1].schema(), other.businessPartnerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.partnerName)) {
        this.partnerName = data().deepCopy(fields()[2].schema(), other.partnerName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.numberOfVehicles)) {
        this.numberOfVehicles = data().deepCopy(fields()[3].schema(), other.numberOfVehicles);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.amount)) {
        this.amount = data().deepCopy(fields()[4].schema(), other.amount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.rank)) {
        this.rank = data().deepCopy(fields()[5].schema(), other.rank);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.contacts)) {
        this.contacts = data().deepCopy(fields()[6].schema(), other.contacts);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.vehicleType)) {
        this.vehicleType = data().deepCopy(fields()[7].schema(), other.vehicleType);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.purchaseOrderId)) {
        this.purchaseOrderId = data().deepCopy(fields()[8].schema(), other.purchaseOrderId);
        fieldSetFlags()[8] = true;
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
    public com.fretron.Model.Bid.Builder setStatus(java.lang.String value) {
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
    public com.fretron.Model.Bid.Builder clearStatus() {
      status = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'businessPartnerId' field.
      * @return The value.
      */
    public java.lang.String getBusinessPartnerId() {
      return businessPartnerId;
    }

    /**
      * Sets the value of the 'businessPartnerId' field.
      * @param value The value of 'businessPartnerId'.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder setBusinessPartnerId(java.lang.String value) {
      validate(fields()[1], value);
      this.businessPartnerId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'businessPartnerId' field has been set.
      * @return True if the 'businessPartnerId' field has been set, false otherwise.
      */
    public boolean hasBusinessPartnerId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'businessPartnerId' field.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder clearBusinessPartnerId() {
      businessPartnerId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'partnerName' field.
      * @return The value.
      */
    public java.lang.String getPartnerName() {
      return partnerName;
    }

    /**
      * Sets the value of the 'partnerName' field.
      * @param value The value of 'partnerName'.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder setPartnerName(java.lang.String value) {
      validate(fields()[2], value);
      this.partnerName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'partnerName' field has been set.
      * @return True if the 'partnerName' field has been set, false otherwise.
      */
    public boolean hasPartnerName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'partnerName' field.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder clearPartnerName() {
      partnerName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'numberOfVehicles' field.
      * @return The value.
      */
    public java.lang.Integer getNumberOfVehicles() {
      return numberOfVehicles;
    }

    /**
      * Sets the value of the 'numberOfVehicles' field.
      * @param value The value of 'numberOfVehicles'.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder setNumberOfVehicles(java.lang.Integer value) {
      validate(fields()[3], value);
      this.numberOfVehicles = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'numberOfVehicles' field has been set.
      * @return True if the 'numberOfVehicles' field has been set, false otherwise.
      */
    public boolean hasNumberOfVehicles() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'numberOfVehicles' field.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder clearNumberOfVehicles() {
      numberOfVehicles = null;
      fieldSetFlags()[3] = false;
      return this;
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
    public com.fretron.Model.Bid.Builder setAmount(java.lang.Double value) {
      validate(fields()[4], value);
      this.amount = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder clearAmount() {
      amount = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'rank' field.
      * @return The value.
      */
    public java.lang.Double getRank() {
      return rank;
    }

    /**
      * Sets the value of the 'rank' field.
      * @param value The value of 'rank'.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder setRank(java.lang.Double value) {
      validate(fields()[5], value);
      this.rank = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'rank' field has been set.
      * @return True if the 'rank' field has been set, false otherwise.
      */
    public boolean hasRank() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'rank' field.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder clearRank() {
      rank = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'contacts' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getContacts() {
      return contacts;
    }

    /**
      * Sets the value of the 'contacts' field.
      * @param value The value of 'contacts'.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder setContacts(java.util.List<java.lang.String> value) {
      validate(fields()[6], value);
      this.contacts = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'contacts' field has been set.
      * @return True if the 'contacts' field has been set, false otherwise.
      */
    public boolean hasContacts() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'contacts' field.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder clearContacts() {
      contacts = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'vehicleType' field.
      * @return The value.
      */
    public java.lang.String getVehicleType() {
      return vehicleType;
    }

    /**
      * Sets the value of the 'vehicleType' field.
      * @param value The value of 'vehicleType'.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder setVehicleType(java.lang.String value) {
      validate(fields()[7], value);
      this.vehicleType = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleType' field has been set.
      * @return True if the 'vehicleType' field has been set, false otherwise.
      */
    public boolean hasVehicleType() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'vehicleType' field.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder clearVehicleType() {
      vehicleType = null;
      fieldSetFlags()[7] = false;
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
    public com.fretron.Model.Bid.Builder setPurchaseOrderId(java.lang.String value) {
      validate(fields()[8], value);
      this.purchaseOrderId = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'purchaseOrderId' field has been set.
      * @return True if the 'purchaseOrderId' field has been set, false otherwise.
      */
    public boolean hasPurchaseOrderId() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'purchaseOrderId' field.
      * @return This builder.
      */
    public com.fretron.Model.Bid.Builder clearPurchaseOrderId() {
      purchaseOrderId = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public Bid build() {
      try {
        Bid record = new Bid();
        record.status = fieldSetFlags()[0] ? this.status : (java.lang.String) defaultValue(fields()[0]);
        record.businessPartnerId = fieldSetFlags()[1] ? this.businessPartnerId : (java.lang.String) defaultValue(fields()[1]);
        record.partnerName = fieldSetFlags()[2] ? this.partnerName : (java.lang.String) defaultValue(fields()[2]);
        record.numberOfVehicles = fieldSetFlags()[3] ? this.numberOfVehicles : (java.lang.Integer) defaultValue(fields()[3]);
        record.amount = fieldSetFlags()[4] ? this.amount : (java.lang.Double) defaultValue(fields()[4]);
        record.rank = fieldSetFlags()[5] ? this.rank : (java.lang.Double) defaultValue(fields()[5]);
        record.contacts = fieldSetFlags()[6] ? this.contacts : (java.util.List<java.lang.String>) defaultValue(fields()[6]);
        record.vehicleType = fieldSetFlags()[7] ? this.vehicleType : (java.lang.String) defaultValue(fields()[7]);
        record.purchaseOrderId = fieldSetFlags()[8] ? this.purchaseOrderId : (java.lang.String) defaultValue(fields()[8]);
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
