/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CommandOfAcceptOffer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3879493043535103352L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommandOfAcceptOffer\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"acceptOffer\",\"type\":{\"type\":\"record\",\"name\":\"AcceptOffer\",\"fields\":[{\"name\":\"salesEnquiryID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"status\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"offerRate\",\"type\":[\"null\",\"int\"]},{\"name\":\"fleetOwnerID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"noOfVehicle\",\"type\":\"int\"},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}},{\"name\":\"startTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"statusCode\",\"type\":[\"null\",\"int\"]},{\"name\":\"errorMessage\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String type;
  @Deprecated public java.lang.String id;
  @Deprecated public com.fretron.Model.AcceptOffer acceptOffer;
  @Deprecated public java.lang.Long startTime;
  @Deprecated public java.lang.Integer statusCode;
  @Deprecated public java.lang.String errorMessage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CommandOfAcceptOffer() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param id The new value for id
   * @param acceptOffer The new value for acceptOffer
   * @param startTime The new value for startTime
   * @param statusCode The new value for statusCode
   * @param errorMessage The new value for errorMessage
   */
  public CommandOfAcceptOffer(java.lang.String type, java.lang.String id, com.fretron.Model.AcceptOffer acceptOffer, java.lang.Long startTime, java.lang.Integer statusCode, java.lang.String errorMessage) {
    this.type = type;
    this.id = id;
    this.acceptOffer = acceptOffer;
    this.startTime = startTime;
    this.statusCode = statusCode;
    this.errorMessage = errorMessage;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return id;
    case 2: return acceptOffer;
    case 3: return startTime;
    case 4: return statusCode;
    case 5: return errorMessage;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.String)value$; break;
    case 1: id = (java.lang.String)value$; break;
    case 2: acceptOffer = (com.fretron.Model.AcceptOffer)value$; break;
    case 3: startTime = (java.lang.Long)value$; break;
    case 4: statusCode = (java.lang.Integer)value$; break;
    case 5: errorMessage = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.String value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'acceptOffer' field.
   * @return The value of the 'acceptOffer' field.
   */
  public com.fretron.Model.AcceptOffer getAcceptOffer() {
    return acceptOffer;
  }

  /**
   * Sets the value of the 'acceptOffer' field.
   * @param value the value to set.
   */
  public void setAcceptOffer(com.fretron.Model.AcceptOffer value) {
    this.acceptOffer = value;
  }

  /**
   * Gets the value of the 'startTime' field.
   * @return The value of the 'startTime' field.
   */
  public java.lang.Long getStartTime() {
    return startTime;
  }

  /**
   * Sets the value of the 'startTime' field.
   * @param value the value to set.
   */
  public void setStartTime(java.lang.Long value) {
    this.startTime = value;
  }

  /**
   * Gets the value of the 'statusCode' field.
   * @return The value of the 'statusCode' field.
   */
  public java.lang.Integer getStatusCode() {
    return statusCode;
  }

  /**
   * Sets the value of the 'statusCode' field.
   * @param value the value to set.
   */
  public void setStatusCode(java.lang.Integer value) {
    this.statusCode = value;
  }

  /**
   * Gets the value of the 'errorMessage' field.
   * @return The value of the 'errorMessage' field.
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Sets the value of the 'errorMessage' field.
   * @param value the value to set.
   */
  public void setErrorMessage(java.lang.String value) {
    this.errorMessage = value;
  }

  /**
   * Creates a new CommandOfAcceptOffer RecordBuilder.
   * @return A new CommandOfAcceptOffer RecordBuilder
   */
  public static com.fretron.Model.CommandOfAcceptOffer.Builder newBuilder() {
    return new com.fretron.Model.CommandOfAcceptOffer.Builder();
  }

  /**
   * Creates a new CommandOfAcceptOffer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CommandOfAcceptOffer RecordBuilder
   */
  public static com.fretron.Model.CommandOfAcceptOffer.Builder newBuilder(com.fretron.Model.CommandOfAcceptOffer.Builder other) {
    return new com.fretron.Model.CommandOfAcceptOffer.Builder(other);
  }

  /**
   * Creates a new CommandOfAcceptOffer RecordBuilder by copying an existing CommandOfAcceptOffer instance.
   * @param other The existing instance to copy.
   * @return A new CommandOfAcceptOffer RecordBuilder
   */
  public static com.fretron.Model.CommandOfAcceptOffer.Builder newBuilder(com.fretron.Model.CommandOfAcceptOffer other) {
    return new com.fretron.Model.CommandOfAcceptOffer.Builder(other);
  }

  /**
   * RecordBuilder for CommandOfAcceptOffer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommandOfAcceptOffer>
    implements org.apache.avro.data.RecordBuilder<CommandOfAcceptOffer> {

    private java.lang.String type;
    private java.lang.String id;
    private com.fretron.Model.AcceptOffer acceptOffer;
    private com.fretron.Model.AcceptOffer.Builder acceptOfferBuilder;
    private java.lang.Long startTime;
    private java.lang.Integer statusCode;
    private java.lang.String errorMessage;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.CommandOfAcceptOffer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.acceptOffer)) {
        this.acceptOffer = data().deepCopy(fields()[2].schema(), other.acceptOffer);
        fieldSetFlags()[2] = true;
      }
      if (other.hasAcceptOfferBuilder()) {
        this.acceptOfferBuilder = com.fretron.Model.AcceptOffer.newBuilder(other.getAcceptOfferBuilder());
      }
      if (isValidValue(fields()[3], other.startTime)) {
        this.startTime = data().deepCopy(fields()[3].schema(), other.startTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.statusCode)) {
        this.statusCode = data().deepCopy(fields()[4].schema(), other.statusCode);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.errorMessage)) {
        this.errorMessage = data().deepCopy(fields()[5].schema(), other.errorMessage);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CommandOfAcceptOffer instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.CommandOfAcceptOffer other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.acceptOffer)) {
        this.acceptOffer = data().deepCopy(fields()[2].schema(), other.acceptOffer);
        fieldSetFlags()[2] = true;
      }
      this.acceptOfferBuilder = null;
      if (isValidValue(fields()[3], other.startTime)) {
        this.startTime = data().deepCopy(fields()[3].schema(), other.startTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.statusCode)) {
        this.statusCode = data().deepCopy(fields()[4].schema(), other.statusCode);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.errorMessage)) {
        this.errorMessage = data().deepCopy(fields()[5].schema(), other.errorMessage);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.String getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder setType(java.lang.String value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder setId(java.lang.String value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'acceptOffer' field.
      * @return The value.
      */
    public com.fretron.Model.AcceptOffer getAcceptOffer() {
      return acceptOffer;
    }

    /**
      * Sets the value of the 'acceptOffer' field.
      * @param value The value of 'acceptOffer'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder setAcceptOffer(com.fretron.Model.AcceptOffer value) {
      validate(fields()[2], value);
      this.acceptOfferBuilder = null;
      this.acceptOffer = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'acceptOffer' field has been set.
      * @return True if the 'acceptOffer' field has been set, false otherwise.
      */
    public boolean hasAcceptOffer() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'acceptOffer' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.AcceptOffer.Builder getAcceptOfferBuilder() {
      if (acceptOfferBuilder == null) {
        if (hasAcceptOffer()) {
          setAcceptOfferBuilder(com.fretron.Model.AcceptOffer.newBuilder(acceptOffer));
        } else {
          setAcceptOfferBuilder(com.fretron.Model.AcceptOffer.newBuilder());
        }
      }
      return acceptOfferBuilder;
    }

    /**
     * Sets the Builder instance for the 'acceptOffer' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CommandOfAcceptOffer.Builder setAcceptOfferBuilder(com.fretron.Model.AcceptOffer.Builder value) {
      clearAcceptOffer();
      acceptOfferBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'acceptOffer' field has an active Builder instance
     * @return True if the 'acceptOffer' field has an active Builder instance
     */
    public boolean hasAcceptOfferBuilder() {
      return acceptOfferBuilder != null;
    }

    /**
      * Clears the value of the 'acceptOffer' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder clearAcceptOffer() {
      acceptOffer = null;
      acceptOfferBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'startTime' field.
      * @return The value.
      */
    public java.lang.Long getStartTime() {
      return startTime;
    }

    /**
      * Sets the value of the 'startTime' field.
      * @param value The value of 'startTime'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder setStartTime(java.lang.Long value) {
      validate(fields()[3], value);
      this.startTime = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'startTime' field has been set.
      * @return True if the 'startTime' field has been set, false otherwise.
      */
    public boolean hasStartTime() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'startTime' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder clearStartTime() {
      startTime = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'statusCode' field.
      * @return The value.
      */
    public java.lang.Integer getStatusCode() {
      return statusCode;
    }

    /**
      * Sets the value of the 'statusCode' field.
      * @param value The value of 'statusCode'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder setStatusCode(java.lang.Integer value) {
      validate(fields()[4], value);
      this.statusCode = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'statusCode' field has been set.
      * @return True if the 'statusCode' field has been set, false otherwise.
      */
    public boolean hasStatusCode() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'statusCode' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder clearStatusCode() {
      statusCode = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'errorMessage' field.
      * @return The value.
      */
    public java.lang.String getErrorMessage() {
      return errorMessage;
    }

    /**
      * Sets the value of the 'errorMessage' field.
      * @param value The value of 'errorMessage'.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder setErrorMessage(java.lang.String value) {
      validate(fields()[5], value);
      this.errorMessage = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'errorMessage' field has been set.
      * @return True if the 'errorMessage' field has been set, false otherwise.
      */
    public boolean hasErrorMessage() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'errorMessage' field.
      * @return This builder.
      */
    public com.fretron.Model.CommandOfAcceptOffer.Builder clearErrorMessage() {
      errorMessage = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public CommandOfAcceptOffer build() {
      try {
        CommandOfAcceptOffer record = new CommandOfAcceptOffer();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.String) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.String) defaultValue(fields()[1]);
        if (acceptOfferBuilder != null) {
          record.acceptOffer = this.acceptOfferBuilder.build();
        } else {
          record.acceptOffer = fieldSetFlags()[2] ? this.acceptOffer : (com.fretron.Model.AcceptOffer) defaultValue(fields()[2]);
        }
        record.startTime = fieldSetFlags()[3] ? this.startTime : (java.lang.Long) defaultValue(fields()[3]);
        record.statusCode = fieldSetFlags()[4] ? this.statusCode : (java.lang.Integer) defaultValue(fields()[4]);
        record.errorMessage = fieldSetFlags()[5] ? this.errorMessage : (java.lang.String) defaultValue(fields()[5]);
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
