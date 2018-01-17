/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CustomerVehicle extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2450923121704582557L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CustomerVehicle\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"email\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"vehicleId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"from\",\"type\":[\"null\",\"long\"]},{\"name\":\"to\",\"type\":[\"null\",\"long\"]},{\"name\":\"AccessLevel\",\"type\":{\"type\":\"enum\",\"name\":\"AccessLevel\",\"symbols\":[\"DASHBOARD\",\"REPORTS\",\"TRIPS\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String email;
  @Deprecated public java.lang.String vehicleId;
  @Deprecated public java.lang.Long from;
  @Deprecated public java.lang.Long to;
  @Deprecated public com.fretron.Model.AccessLevel AccessLevel;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CustomerVehicle() {}

  /**
   * All-args constructor.
   * @param email The new value for email
   * @param vehicleId The new value for vehicleId
   * @param from The new value for from
   * @param to The new value for to
   * @param AccessLevel The new value for AccessLevel
   */
  public CustomerVehicle(java.lang.String email, java.lang.String vehicleId, java.lang.Long from, java.lang.Long to, com.fretron.Model.AccessLevel AccessLevel) {
    this.email = email;
    this.vehicleId = vehicleId;
    this.from = from;
    this.to = to;
    this.AccessLevel = AccessLevel;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return email;
    case 1: return vehicleId;
    case 2: return from;
    case 3: return to;
    case 4: return AccessLevel;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: email = (java.lang.String)value$; break;
    case 1: vehicleId = (java.lang.String)value$; break;
    case 2: from = (java.lang.Long)value$; break;
    case 3: to = (java.lang.Long)value$; break;
    case 4: AccessLevel = (com.fretron.Model.AccessLevel)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.String value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'vehicleId' field.
   * @return The value of the 'vehicleId' field.
   */
  public java.lang.String getVehicleId() {
    return vehicleId;
  }

  /**
   * Sets the value of the 'vehicleId' field.
   * @param value the value to set.
   */
  public void setVehicleId(java.lang.String value) {
    this.vehicleId = value;
  }

  /**
   * Gets the value of the 'from' field.
   * @return The value of the 'from' field.
   */
  public java.lang.Long getFrom() {
    return from;
  }

  /**
   * Sets the value of the 'from' field.
   * @param value the value to set.
   */
  public void setFrom(java.lang.Long value) {
    this.from = value;
  }

  /**
   * Gets the value of the 'to' field.
   * @return The value of the 'to' field.
   */
  public java.lang.Long getTo() {
    return to;
  }

  /**
   * Sets the value of the 'to' field.
   * @param value the value to set.
   */
  public void setTo(java.lang.Long value) {
    this.to = value;
  }

  /**
   * Gets the value of the 'AccessLevel' field.
   * @return The value of the 'AccessLevel' field.
   */
  public com.fretron.Model.AccessLevel getAccessLevel() {
    return AccessLevel;
  }

  /**
   * Sets the value of the 'AccessLevel' field.
   * @param value the value to set.
   */
  public void setAccessLevel(com.fretron.Model.AccessLevel value) {
    this.AccessLevel = value;
  }

  /**
   * Creates a new CustomerVehicle RecordBuilder.
   * @return A new CustomerVehicle RecordBuilder
   */
  public static com.fretron.Model.CustomerVehicle.Builder newBuilder() {
    return new com.fretron.Model.CustomerVehicle.Builder();
  }

  /**
   * Creates a new CustomerVehicle RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CustomerVehicle RecordBuilder
   */
  public static com.fretron.Model.CustomerVehicle.Builder newBuilder(com.fretron.Model.CustomerVehicle.Builder other) {
    return new com.fretron.Model.CustomerVehicle.Builder(other);
  }

  /**
   * Creates a new CustomerVehicle RecordBuilder by copying an existing CustomerVehicle instance.
   * @param other The existing instance to copy.
   * @return A new CustomerVehicle RecordBuilder
   */
  public static com.fretron.Model.CustomerVehicle.Builder newBuilder(com.fretron.Model.CustomerVehicle other) {
    return new com.fretron.Model.CustomerVehicle.Builder(other);
  }

  /**
   * RecordBuilder for CustomerVehicle instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CustomerVehicle>
    implements org.apache.avro.data.RecordBuilder<CustomerVehicle> {

    private java.lang.String email;
    private java.lang.String vehicleId;
    private java.lang.Long from;
    private java.lang.Long to;
    private com.fretron.Model.AccessLevel AccessLevel;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.CustomerVehicle.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.email)) {
        this.email = data().deepCopy(fields()[0].schema(), other.email);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[1].schema(), other.vehicleId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.from)) {
        this.from = data().deepCopy(fields()[2].schema(), other.from);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.to)) {
        this.to = data().deepCopy(fields()[3].schema(), other.to);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.AccessLevel)) {
        this.AccessLevel = data().deepCopy(fields()[4].schema(), other.AccessLevel);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CustomerVehicle instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.CustomerVehicle other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.email)) {
        this.email = data().deepCopy(fields()[0].schema(), other.email);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vehicleId)) {
        this.vehicleId = data().deepCopy(fields()[1].schema(), other.vehicleId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.from)) {
        this.from = data().deepCopy(fields()[2].schema(), other.from);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.to)) {
        this.to = data().deepCopy(fields()[3].schema(), other.to);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.AccessLevel)) {
        this.AccessLevel = data().deepCopy(fields()[4].schema(), other.AccessLevel);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.String getEmail() {
      return email;
    }

    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public com.fretron.Model.CustomerVehicle.Builder setEmail(java.lang.String value) {
      validate(fields()[0], value);
      this.email = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public com.fretron.Model.CustomerVehicle.Builder clearEmail() {
      email = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'vehicleId' field.
      * @return The value.
      */
    public java.lang.String getVehicleId() {
      return vehicleId;
    }

    /**
      * Sets the value of the 'vehicleId' field.
      * @param value The value of 'vehicleId'.
      * @return This builder.
      */
    public com.fretron.Model.CustomerVehicle.Builder setVehicleId(java.lang.String value) {
      validate(fields()[1], value);
      this.vehicleId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleId' field has been set.
      * @return True if the 'vehicleId' field has been set, false otherwise.
      */
    public boolean hasVehicleId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'vehicleId' field.
      * @return This builder.
      */
    public com.fretron.Model.CustomerVehicle.Builder clearVehicleId() {
      vehicleId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'from' field.
      * @return The value.
      */
    public java.lang.Long getFrom() {
      return from;
    }

    /**
      * Sets the value of the 'from' field.
      * @param value The value of 'from'.
      * @return This builder.
      */
    public com.fretron.Model.CustomerVehicle.Builder setFrom(java.lang.Long value) {
      validate(fields()[2], value);
      this.from = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'from' field has been set.
      * @return True if the 'from' field has been set, false otherwise.
      */
    public boolean hasFrom() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'from' field.
      * @return This builder.
      */
    public com.fretron.Model.CustomerVehicle.Builder clearFrom() {
      from = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'to' field.
      * @return The value.
      */
    public java.lang.Long getTo() {
      return to;
    }

    /**
      * Sets the value of the 'to' field.
      * @param value The value of 'to'.
      * @return This builder.
      */
    public com.fretron.Model.CustomerVehicle.Builder setTo(java.lang.Long value) {
      validate(fields()[3], value);
      this.to = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'to' field has been set.
      * @return True if the 'to' field has been set, false otherwise.
      */
    public boolean hasTo() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'to' field.
      * @return This builder.
      */
    public com.fretron.Model.CustomerVehicle.Builder clearTo() {
      to = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'AccessLevel' field.
      * @return The value.
      */
    public com.fretron.Model.AccessLevel getAccessLevel() {
      return AccessLevel;
    }

    /**
      * Sets the value of the 'AccessLevel' field.
      * @param value The value of 'AccessLevel'.
      * @return This builder.
      */
    public com.fretron.Model.CustomerVehicle.Builder setAccessLevel(com.fretron.Model.AccessLevel value) {
      validate(fields()[4], value);
      this.AccessLevel = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'AccessLevel' field has been set.
      * @return True if the 'AccessLevel' field has been set, false otherwise.
      */
    public boolean hasAccessLevel() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'AccessLevel' field.
      * @return This builder.
      */
    public com.fretron.Model.CustomerVehicle.Builder clearAccessLevel() {
      AccessLevel = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public CustomerVehicle build() {
      try {
        CustomerVehicle record = new CustomerVehicle();
        record.email = fieldSetFlags()[0] ? this.email : (java.lang.String) defaultValue(fields()[0]);
        record.vehicleId = fieldSetFlags()[1] ? this.vehicleId : (java.lang.String) defaultValue(fields()[1]);
        record.from = fieldSetFlags()[2] ? this.from : (java.lang.Long) defaultValue(fields()[2]);
        record.to = fieldSetFlags()[3] ? this.to : (java.lang.Long) defaultValue(fields()[3]);
        record.AccessLevel = fieldSetFlags()[4] ? this.AccessLevel : (com.fretron.Model.AccessLevel) defaultValue(fields()[4]);
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
