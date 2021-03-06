/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Command extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1717343232468509582L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Command\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"data\",\"type\":\"bytes\"},{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"statusCode\",\"type\":[\"null\",\"int\"]},{\"name\":\"errorMessage\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"startTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"processTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"topic\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"valueType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"generatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String type;
  @Deprecated public java.nio.ByteBuffer data;
  @Deprecated public java.lang.String id;
  @Deprecated public java.lang.Integer statusCode;
  @Deprecated public java.lang.String errorMessage;
  @Deprecated public java.lang.Long startTime;
  @Deprecated public java.lang.Long processTime;
  @Deprecated public java.lang.String topic;
  @Deprecated public java.lang.String valueType;
  @Deprecated public java.lang.String generatedBy;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Command() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param data The new value for data
   * @param id The new value for id
   * @param statusCode The new value for statusCode
   * @param errorMessage The new value for errorMessage
   * @param startTime The new value for startTime
   * @param processTime The new value for processTime
   * @param topic The new value for topic
   * @param valueType The new value for valueType
   * @param generatedBy The new value for generatedBy
   */
  public Command(java.lang.String type, java.nio.ByteBuffer data, java.lang.String id, java.lang.Integer statusCode, java.lang.String errorMessage, java.lang.Long startTime, java.lang.Long processTime, java.lang.String topic, java.lang.String valueType, java.lang.String generatedBy) {
    this.type = type;
    this.data = data;
    this.id = id;
    this.statusCode = statusCode;
    this.errorMessage = errorMessage;
    this.startTime = startTime;
    this.processTime = processTime;
    this.topic = topic;
    this.valueType = valueType;
    this.generatedBy = generatedBy;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return data;
    case 2: return id;
    case 3: return statusCode;
    case 4: return errorMessage;
    case 5: return startTime;
    case 6: return processTime;
    case 7: return topic;
    case 8: return valueType;
    case 9: return generatedBy;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.String)value$; break;
    case 1: data = (java.nio.ByteBuffer)value$; break;
    case 2: id = (java.lang.String)value$; break;
    case 3: statusCode = (java.lang.Integer)value$; break;
    case 4: errorMessage = (java.lang.String)value$; break;
    case 5: startTime = (java.lang.Long)value$; break;
    case 6: processTime = (java.lang.Long)value$; break;
    case 7: topic = (java.lang.String)value$; break;
    case 8: valueType = (java.lang.String)value$; break;
    case 9: generatedBy = (java.lang.String)value$; break;
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
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public java.nio.ByteBuffer getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.nio.ByteBuffer value) {
    this.data = value;
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
   * Gets the value of the 'processTime' field.
   * @return The value of the 'processTime' field.
   */
  public java.lang.Long getProcessTime() {
    return processTime;
  }

  /**
   * Sets the value of the 'processTime' field.
   * @param value the value to set.
   */
  public void setProcessTime(java.lang.Long value) {
    this.processTime = value;
  }

  /**
   * Gets the value of the 'topic' field.
   * @return The value of the 'topic' field.
   */
  public java.lang.String getTopic() {
    return topic;
  }

  /**
   * Sets the value of the 'topic' field.
   * @param value the value to set.
   */
  public void setTopic(java.lang.String value) {
    this.topic = value;
  }

  /**
   * Gets the value of the 'valueType' field.
   * @return The value of the 'valueType' field.
   */
  public java.lang.String getValueType() {
    return valueType;
  }

  /**
   * Sets the value of the 'valueType' field.
   * @param value the value to set.
   */
  public void setValueType(java.lang.String value) {
    this.valueType = value;
  }

  /**
   * Gets the value of the 'generatedBy' field.
   * @return The value of the 'generatedBy' field.
   */
  public java.lang.String getGeneratedBy() {
    return generatedBy;
  }

  /**
   * Sets the value of the 'generatedBy' field.
   * @param value the value to set.
   */
  public void setGeneratedBy(java.lang.String value) {
    this.generatedBy = value;
  }

  /**
   * Creates a new Command RecordBuilder.
   * @return A new Command RecordBuilder
   */
  public static com.fretron.Model.Command.Builder newBuilder() {
    return new com.fretron.Model.Command.Builder();
  }

  /**
   * Creates a new Command RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Command RecordBuilder
   */
  public static com.fretron.Model.Command.Builder newBuilder(com.fretron.Model.Command.Builder other) {
    return new com.fretron.Model.Command.Builder(other);
  }

  /**
   * Creates a new Command RecordBuilder by copying an existing Command instance.
   * @param other The existing instance to copy.
   * @return A new Command RecordBuilder
   */
  public static com.fretron.Model.Command.Builder newBuilder(com.fretron.Model.Command other) {
    return new com.fretron.Model.Command.Builder(other);
  }

  /**
   * RecordBuilder for Command instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Command>
    implements org.apache.avro.data.RecordBuilder<Command> {

    private java.lang.String type;
    private java.nio.ByteBuffer data;
    private java.lang.String id;
    private java.lang.Integer statusCode;
    private java.lang.String errorMessage;
    private java.lang.Long startTime;
    private java.lang.Long processTime;
    private java.lang.String topic;
    private java.lang.String valueType;
    private java.lang.String generatedBy;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Command.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.data)) {
        this.data = data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.id)) {
        this.id = data().deepCopy(fields()[2].schema(), other.id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.statusCode)) {
        this.statusCode = data().deepCopy(fields()[3].schema(), other.statusCode);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.errorMessage)) {
        this.errorMessage = data().deepCopy(fields()[4].schema(), other.errorMessage);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.startTime)) {
        this.startTime = data().deepCopy(fields()[5].schema(), other.startTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.processTime)) {
        this.processTime = data().deepCopy(fields()[6].schema(), other.processTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.topic)) {
        this.topic = data().deepCopy(fields()[7].schema(), other.topic);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.valueType)) {
        this.valueType = data().deepCopy(fields()[8].schema(), other.valueType);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.generatedBy)) {
        this.generatedBy = data().deepCopy(fields()[9].schema(), other.generatedBy);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Command instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Command other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.data)) {
        this.data = data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.id)) {
        this.id = data().deepCopy(fields()[2].schema(), other.id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.statusCode)) {
        this.statusCode = data().deepCopy(fields()[3].schema(), other.statusCode);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.errorMessage)) {
        this.errorMessage = data().deepCopy(fields()[4].schema(), other.errorMessage);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.startTime)) {
        this.startTime = data().deepCopy(fields()[5].schema(), other.startTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.processTime)) {
        this.processTime = data().deepCopy(fields()[6].schema(), other.processTime);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.topic)) {
        this.topic = data().deepCopy(fields()[7].schema(), other.topic);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.valueType)) {
        this.valueType = data().deepCopy(fields()[8].schema(), other.valueType);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.generatedBy)) {
        this.generatedBy = data().deepCopy(fields()[9].schema(), other.generatedBy);
        fieldSetFlags()[9] = true;
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
    public com.fretron.Model.Command.Builder setType(java.lang.String value) {
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
    public com.fretron.Model.Command.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getData() {
      return data;
    }

    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder setData(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.data = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder clearData() {
      data = null;
      fieldSetFlags()[1] = false;
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
    public com.fretron.Model.Command.Builder setId(java.lang.String value) {
      validate(fields()[2], value);
      this.id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder clearId() {
      id = null;
      fieldSetFlags()[2] = false;
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
    public com.fretron.Model.Command.Builder setStatusCode(java.lang.Integer value) {
      validate(fields()[3], value);
      this.statusCode = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'statusCode' field has been set.
      * @return True if the 'statusCode' field has been set, false otherwise.
      */
    public boolean hasStatusCode() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'statusCode' field.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder clearStatusCode() {
      statusCode = null;
      fieldSetFlags()[3] = false;
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
    public com.fretron.Model.Command.Builder setErrorMessage(java.lang.String value) {
      validate(fields()[4], value);
      this.errorMessage = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'errorMessage' field has been set.
      * @return True if the 'errorMessage' field has been set, false otherwise.
      */
    public boolean hasErrorMessage() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'errorMessage' field.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder clearErrorMessage() {
      errorMessage = null;
      fieldSetFlags()[4] = false;
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
    public com.fretron.Model.Command.Builder setStartTime(java.lang.Long value) {
      validate(fields()[5], value);
      this.startTime = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'startTime' field has been set.
      * @return True if the 'startTime' field has been set, false otherwise.
      */
    public boolean hasStartTime() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'startTime' field.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder clearStartTime() {
      startTime = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'processTime' field.
      * @return The value.
      */
    public java.lang.Long getProcessTime() {
      return processTime;
    }

    /**
      * Sets the value of the 'processTime' field.
      * @param value The value of 'processTime'.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder setProcessTime(java.lang.Long value) {
      validate(fields()[6], value);
      this.processTime = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'processTime' field has been set.
      * @return True if the 'processTime' field has been set, false otherwise.
      */
    public boolean hasProcessTime() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'processTime' field.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder clearProcessTime() {
      processTime = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'topic' field.
      * @return The value.
      */
    public java.lang.String getTopic() {
      return topic;
    }

    /**
      * Sets the value of the 'topic' field.
      * @param value The value of 'topic'.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder setTopic(java.lang.String value) {
      validate(fields()[7], value);
      this.topic = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'topic' field has been set.
      * @return True if the 'topic' field has been set, false otherwise.
      */
    public boolean hasTopic() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'topic' field.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder clearTopic() {
      topic = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'valueType' field.
      * @return The value.
      */
    public java.lang.String getValueType() {
      return valueType;
    }

    /**
      * Sets the value of the 'valueType' field.
      * @param value The value of 'valueType'.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder setValueType(java.lang.String value) {
      validate(fields()[8], value);
      this.valueType = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'valueType' field has been set.
      * @return True if the 'valueType' field has been set, false otherwise.
      */
    public boolean hasValueType() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'valueType' field.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder clearValueType() {
      valueType = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'generatedBy' field.
      * @return The value.
      */
    public java.lang.String getGeneratedBy() {
      return generatedBy;
    }

    /**
      * Sets the value of the 'generatedBy' field.
      * @param value The value of 'generatedBy'.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder setGeneratedBy(java.lang.String value) {
      validate(fields()[9], value);
      this.generatedBy = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'generatedBy' field has been set.
      * @return True if the 'generatedBy' field has been set, false otherwise.
      */
    public boolean hasGeneratedBy() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'generatedBy' field.
      * @return This builder.
      */
    public com.fretron.Model.Command.Builder clearGeneratedBy() {
      generatedBy = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public Command build() {
      try {
        Command record = new Command();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.String) defaultValue(fields()[0]);
        record.data = fieldSetFlags()[1] ? this.data : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        record.id = fieldSetFlags()[2] ? this.id : (java.lang.String) defaultValue(fields()[2]);
        record.statusCode = fieldSetFlags()[3] ? this.statusCode : (java.lang.Integer) defaultValue(fields()[3]);
        record.errorMessage = fieldSetFlags()[4] ? this.errorMessage : (java.lang.String) defaultValue(fields()[4]);
        record.startTime = fieldSetFlags()[5] ? this.startTime : (java.lang.Long) defaultValue(fields()[5]);
        record.processTime = fieldSetFlags()[6] ? this.processTime : (java.lang.Long) defaultValue(fields()[6]);
        record.topic = fieldSetFlags()[7] ? this.topic : (java.lang.String) defaultValue(fields()[7]);
        record.valueType = fieldSetFlags()[8] ? this.valueType : (java.lang.String) defaultValue(fields()[8]);
        record.generatedBy = fieldSetFlags()[9] ? this.generatedBy : (java.lang.String) defaultValue(fields()[9]);
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
