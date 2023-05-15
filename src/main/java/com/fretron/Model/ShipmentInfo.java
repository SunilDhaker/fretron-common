/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ShipmentInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -765495106118449461L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShipmentInfo\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"shipmentNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String shipmentNumber;
  @Deprecated public java.lang.String externalId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ShipmentInfo() {}

  /**
   * All-args constructor.
   * @param shipmentNumber The new value for shipmentNumber
   * @param externalId The new value for externalId
   */
  public ShipmentInfo(java.lang.String shipmentNumber, java.lang.String externalId) {
    this.shipmentNumber = shipmentNumber;
    this.externalId = externalId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return shipmentNumber;
    case 1: return externalId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: shipmentNumber = (java.lang.String)value$; break;
    case 1: externalId = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'shipmentNumber' field.
   * @return The value of the 'shipmentNumber' field.
   */
  public java.lang.String getShipmentNumber() {
    return shipmentNumber;
  }

  /**
   * Sets the value of the 'shipmentNumber' field.
   * @param value the value to set.
   */
  public void setShipmentNumber(java.lang.String value) {
    this.shipmentNumber = value;
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
   * Creates a new ShipmentInfo RecordBuilder.
   * @return A new ShipmentInfo RecordBuilder
   */
  public static com.fretron.Model.ShipmentInfo.Builder newBuilder() {
    return new com.fretron.Model.ShipmentInfo.Builder();
  }

  /**
   * Creates a new ShipmentInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ShipmentInfo RecordBuilder
   */
  public static com.fretron.Model.ShipmentInfo.Builder newBuilder(com.fretron.Model.ShipmentInfo.Builder other) {
    return new com.fretron.Model.ShipmentInfo.Builder(other);
  }

  /**
   * Creates a new ShipmentInfo RecordBuilder by copying an existing ShipmentInfo instance.
   * @param other The existing instance to copy.
   * @return A new ShipmentInfo RecordBuilder
   */
  public static com.fretron.Model.ShipmentInfo.Builder newBuilder(com.fretron.Model.ShipmentInfo other) {
    return new com.fretron.Model.ShipmentInfo.Builder(other);
  }

  /**
   * RecordBuilder for ShipmentInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ShipmentInfo>
    implements org.apache.avro.data.RecordBuilder<ShipmentInfo> {

    private java.lang.String shipmentNumber;
    private java.lang.String externalId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.ShipmentInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.shipmentNumber)) {
        this.shipmentNumber = data().deepCopy(fields()[0].schema(), other.shipmentNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.externalId)) {
        this.externalId = data().deepCopy(fields()[1].schema(), other.externalId);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ShipmentInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.ShipmentInfo other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.shipmentNumber)) {
        this.shipmentNumber = data().deepCopy(fields()[0].schema(), other.shipmentNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.externalId)) {
        this.externalId = data().deepCopy(fields()[1].schema(), other.externalId);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'shipmentNumber' field.
      * @return The value.
      */
    public java.lang.String getShipmentNumber() {
      return shipmentNumber;
    }

    /**
      * Sets the value of the 'shipmentNumber' field.
      * @param value The value of 'shipmentNumber'.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentInfo.Builder setShipmentNumber(java.lang.String value) {
      validate(fields()[0], value);
      this.shipmentNumber = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'shipmentNumber' field has been set.
      * @return True if the 'shipmentNumber' field has been set, false otherwise.
      */
    public boolean hasShipmentNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'shipmentNumber' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentInfo.Builder clearShipmentNumber() {
      shipmentNumber = null;
      fieldSetFlags()[0] = false;
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
    public com.fretron.Model.ShipmentInfo.Builder setExternalId(java.lang.String value) {
      validate(fields()[1], value);
      this.externalId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'externalId' field has been set.
      * @return True if the 'externalId' field has been set, false otherwise.
      */
    public boolean hasExternalId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'externalId' field.
      * @return This builder.
      */
    public com.fretron.Model.ShipmentInfo.Builder clearExternalId() {
      externalId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public ShipmentInfo build() {
      try {
        ShipmentInfo record = new ShipmentInfo();
        record.shipmentNumber = fieldSetFlags()[0] ? this.shipmentNumber : (java.lang.String) defaultValue(fields()[0]);
        record.externalId = fieldSetFlags()[1] ? this.externalId : (java.lang.String) defaultValue(fields()[1]);
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