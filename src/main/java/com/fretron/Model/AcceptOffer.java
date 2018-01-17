/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AcceptOffer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -672865112537705822L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AcceptOffer\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"salesEnquiryID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"status\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"offerRate\",\"type\":[\"null\",\"int\"]},{\"name\":\"fleetOwnerID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"noOfVehicle\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String salesEnquiryID;
  @Deprecated public java.lang.String status;
  @Deprecated public java.lang.Integer offerRate;
  @Deprecated public java.lang.String fleetOwnerID;
  @Deprecated public int noOfVehicle;
  @Deprecated public java.lang.String uuid;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AcceptOffer() {}

  /**
   * All-args constructor.
   * @param salesEnquiryID The new value for salesEnquiryID
   * @param status The new value for status
   * @param offerRate The new value for offerRate
   * @param fleetOwnerID The new value for fleetOwnerID
   * @param noOfVehicle The new value for noOfVehicle
   * @param uuid The new value for uuid
   */
  public AcceptOffer(java.lang.String salesEnquiryID, java.lang.String status, java.lang.Integer offerRate, java.lang.String fleetOwnerID, java.lang.Integer noOfVehicle, java.lang.String uuid) {
    this.salesEnquiryID = salesEnquiryID;
    this.status = status;
    this.offerRate = offerRate;
    this.fleetOwnerID = fleetOwnerID;
    this.noOfVehicle = noOfVehicle;
    this.uuid = uuid;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return salesEnquiryID;
    case 1: return status;
    case 2: return offerRate;
    case 3: return fleetOwnerID;
    case 4: return noOfVehicle;
    case 5: return uuid;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: salesEnquiryID = (java.lang.String)value$; break;
    case 1: status = (java.lang.String)value$; break;
    case 2: offerRate = (java.lang.Integer)value$; break;
    case 3: fleetOwnerID = (java.lang.String)value$; break;
    case 4: noOfVehicle = (java.lang.Integer)value$; break;
    case 5: uuid = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'salesEnquiryID' field.
   * @return The value of the 'salesEnquiryID' field.
   */
  public java.lang.String getSalesEnquiryID() {
    return salesEnquiryID;
  }

  /**
   * Sets the value of the 'salesEnquiryID' field.
   * @param value the value to set.
   */
  public void setSalesEnquiryID(java.lang.String value) {
    this.salesEnquiryID = value;
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
   * Gets the value of the 'offerRate' field.
   * @return The value of the 'offerRate' field.
   */
  public java.lang.Integer getOfferRate() {
    return offerRate;
  }

  /**
   * Sets the value of the 'offerRate' field.
   * @param value the value to set.
   */
  public void setOfferRate(java.lang.Integer value) {
    this.offerRate = value;
  }

  /**
   * Gets the value of the 'fleetOwnerID' field.
   * @return The value of the 'fleetOwnerID' field.
   */
  public java.lang.String getFleetOwnerID() {
    return fleetOwnerID;
  }

  /**
   * Sets the value of the 'fleetOwnerID' field.
   * @param value the value to set.
   */
  public void setFleetOwnerID(java.lang.String value) {
    this.fleetOwnerID = value;
  }

  /**
   * Gets the value of the 'noOfVehicle' field.
   * @return The value of the 'noOfVehicle' field.
   */
  public java.lang.Integer getNoOfVehicle() {
    return noOfVehicle;
  }

  /**
   * Sets the value of the 'noOfVehicle' field.
   * @param value the value to set.
   */
  public void setNoOfVehicle(java.lang.Integer value) {
    this.noOfVehicle = value;
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
   * Creates a new AcceptOffer RecordBuilder.
   * @return A new AcceptOffer RecordBuilder
   */
  public static com.fretron.Model.AcceptOffer.Builder newBuilder() {
    return new com.fretron.Model.AcceptOffer.Builder();
  }

  /**
   * Creates a new AcceptOffer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AcceptOffer RecordBuilder
   */
  public static com.fretron.Model.AcceptOffer.Builder newBuilder(com.fretron.Model.AcceptOffer.Builder other) {
    return new com.fretron.Model.AcceptOffer.Builder(other);
  }

  /**
   * Creates a new AcceptOffer RecordBuilder by copying an existing AcceptOffer instance.
   * @param other The existing instance to copy.
   * @return A new AcceptOffer RecordBuilder
   */
  public static com.fretron.Model.AcceptOffer.Builder newBuilder(com.fretron.Model.AcceptOffer other) {
    return new com.fretron.Model.AcceptOffer.Builder(other);
  }

  /**
   * RecordBuilder for AcceptOffer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AcceptOffer>
    implements org.apache.avro.data.RecordBuilder<AcceptOffer> {

    private java.lang.String salesEnquiryID;
    private java.lang.String status;
    private java.lang.Integer offerRate;
    private java.lang.String fleetOwnerID;
    private int noOfVehicle;
    private java.lang.String uuid;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.AcceptOffer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.salesEnquiryID)) {
        this.salesEnquiryID = data().deepCopy(fields()[0].schema(), other.salesEnquiryID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.offerRate)) {
        this.offerRate = data().deepCopy(fields()[2].schema(), other.offerRate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.fleetOwnerID)) {
        this.fleetOwnerID = data().deepCopy(fields()[3].schema(), other.fleetOwnerID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.noOfVehicle)) {
        this.noOfVehicle = data().deepCopy(fields()[4].schema(), other.noOfVehicle);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.uuid)) {
        this.uuid = data().deepCopy(fields()[5].schema(), other.uuid);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AcceptOffer instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.AcceptOffer other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.salesEnquiryID)) {
        this.salesEnquiryID = data().deepCopy(fields()[0].schema(), other.salesEnquiryID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.offerRate)) {
        this.offerRate = data().deepCopy(fields()[2].schema(), other.offerRate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.fleetOwnerID)) {
        this.fleetOwnerID = data().deepCopy(fields()[3].schema(), other.fleetOwnerID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.noOfVehicle)) {
        this.noOfVehicle = data().deepCopy(fields()[4].schema(), other.noOfVehicle);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.uuid)) {
        this.uuid = data().deepCopy(fields()[5].schema(), other.uuid);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'salesEnquiryID' field.
      * @return The value.
      */
    public java.lang.String getSalesEnquiryID() {
      return salesEnquiryID;
    }

    /**
      * Sets the value of the 'salesEnquiryID' field.
      * @param value The value of 'salesEnquiryID'.
      * @return This builder.
      */
    public com.fretron.Model.AcceptOffer.Builder setSalesEnquiryID(java.lang.String value) {
      validate(fields()[0], value);
      this.salesEnquiryID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'salesEnquiryID' field has been set.
      * @return True if the 'salesEnquiryID' field has been set, false otherwise.
      */
    public boolean hasSalesEnquiryID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'salesEnquiryID' field.
      * @return This builder.
      */
    public com.fretron.Model.AcceptOffer.Builder clearSalesEnquiryID() {
      salesEnquiryID = null;
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
    public com.fretron.Model.AcceptOffer.Builder setStatus(java.lang.String value) {
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
    public com.fretron.Model.AcceptOffer.Builder clearStatus() {
      status = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'offerRate' field.
      * @return The value.
      */
    public java.lang.Integer getOfferRate() {
      return offerRate;
    }

    /**
      * Sets the value of the 'offerRate' field.
      * @param value The value of 'offerRate'.
      * @return This builder.
      */
    public com.fretron.Model.AcceptOffer.Builder setOfferRate(java.lang.Integer value) {
      validate(fields()[2], value);
      this.offerRate = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'offerRate' field has been set.
      * @return True if the 'offerRate' field has been set, false otherwise.
      */
    public boolean hasOfferRate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'offerRate' field.
      * @return This builder.
      */
    public com.fretron.Model.AcceptOffer.Builder clearOfferRate() {
      offerRate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'fleetOwnerID' field.
      * @return The value.
      */
    public java.lang.String getFleetOwnerID() {
      return fleetOwnerID;
    }

    /**
      * Sets the value of the 'fleetOwnerID' field.
      * @param value The value of 'fleetOwnerID'.
      * @return This builder.
      */
    public com.fretron.Model.AcceptOffer.Builder setFleetOwnerID(java.lang.String value) {
      validate(fields()[3], value);
      this.fleetOwnerID = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'fleetOwnerID' field has been set.
      * @return True if the 'fleetOwnerID' field has been set, false otherwise.
      */
    public boolean hasFleetOwnerID() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'fleetOwnerID' field.
      * @return This builder.
      */
    public com.fretron.Model.AcceptOffer.Builder clearFleetOwnerID() {
      fleetOwnerID = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'noOfVehicle' field.
      * @return The value.
      */
    public java.lang.Integer getNoOfVehicle() {
      return noOfVehicle;
    }

    /**
      * Sets the value of the 'noOfVehicle' field.
      * @param value The value of 'noOfVehicle'.
      * @return This builder.
      */
    public com.fretron.Model.AcceptOffer.Builder setNoOfVehicle(int value) {
      validate(fields()[4], value);
      this.noOfVehicle = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'noOfVehicle' field has been set.
      * @return True if the 'noOfVehicle' field has been set, false otherwise.
      */
    public boolean hasNoOfVehicle() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'noOfVehicle' field.
      * @return This builder.
      */
    public com.fretron.Model.AcceptOffer.Builder clearNoOfVehicle() {
      fieldSetFlags()[4] = false;
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
    public com.fretron.Model.AcceptOffer.Builder setUuid(java.lang.String value) {
      validate(fields()[5], value);
      this.uuid = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'uuid' field has been set.
      * @return True if the 'uuid' field has been set, false otherwise.
      */
    public boolean hasUuid() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'uuid' field.
      * @return This builder.
      */
    public com.fretron.Model.AcceptOffer.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public AcceptOffer build() {
      try {
        AcceptOffer record = new AcceptOffer();
        record.salesEnquiryID = fieldSetFlags()[0] ? this.salesEnquiryID : (java.lang.String) defaultValue(fields()[0]);
        record.status = fieldSetFlags()[1] ? this.status : (java.lang.String) defaultValue(fields()[1]);
        record.offerRate = fieldSetFlags()[2] ? this.offerRate : (java.lang.Integer) defaultValue(fields()[2]);
        record.fleetOwnerID = fieldSetFlags()[3] ? this.fleetOwnerID : (java.lang.String) defaultValue(fields()[3]);
        record.noOfVehicle = fieldSetFlags()[4] ? this.noOfVehicle : (java.lang.Integer) defaultValue(fields()[4]);
        record.uuid = fieldSetFlags()[5] ? this.uuid : (java.lang.String) defaultValue(fields()[5]);
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
