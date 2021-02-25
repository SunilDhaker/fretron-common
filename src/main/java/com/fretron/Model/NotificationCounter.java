/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class NotificationCounter extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 503646293081400151L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NotificationCounter\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"subscriber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"event\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"startTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"emailCount\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"smsCount\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"isEmailThrottled\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"isSmsThrottled\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"emailThrottledTill\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"smsThrottledTill\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.String subscriber;
  @Deprecated public java.lang.String event;
  @Deprecated public java.lang.Long startTime;
  @Deprecated public java.lang.Long emailCount;
  @Deprecated public java.lang.Long smsCount;
  @Deprecated public java.lang.Boolean isEmailThrottled;
  @Deprecated public java.lang.Boolean isSmsThrottled;
  @Deprecated public java.lang.Long emailThrottledTill;
  @Deprecated public java.lang.Long smsThrottledTill;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NotificationCounter() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param subscriber The new value for subscriber
   * @param event The new value for event
   * @param startTime The new value for startTime
   * @param emailCount The new value for emailCount
   * @param smsCount The new value for smsCount
   * @param isEmailThrottled The new value for isEmailThrottled
   * @param isSmsThrottled The new value for isSmsThrottled
   * @param emailThrottledTill The new value for emailThrottledTill
   * @param smsThrottledTill The new value for smsThrottledTill
   */
  public NotificationCounter(java.lang.String uuid, java.lang.String subscriber, java.lang.String event, java.lang.Long startTime, java.lang.Long emailCount, java.lang.Long smsCount, java.lang.Boolean isEmailThrottled, java.lang.Boolean isSmsThrottled, java.lang.Long emailThrottledTill, java.lang.Long smsThrottledTill) {
    this.uuid = uuid;
    this.subscriber = subscriber;
    this.event = event;
    this.startTime = startTime;
    this.emailCount = emailCount;
    this.smsCount = smsCount;
    this.isEmailThrottled = isEmailThrottled;
    this.isSmsThrottled = isSmsThrottled;
    this.emailThrottledTill = emailThrottledTill;
    this.smsThrottledTill = smsThrottledTill;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return subscriber;
    case 2: return event;
    case 3: return startTime;
    case 4: return emailCount;
    case 5: return smsCount;
    case 6: return isEmailThrottled;
    case 7: return isSmsThrottled;
    case 8: return emailThrottledTill;
    case 9: return smsThrottledTill;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: subscriber = (java.lang.String)value$; break;
    case 2: event = (java.lang.String)value$; break;
    case 3: startTime = (java.lang.Long)value$; break;
    case 4: emailCount = (java.lang.Long)value$; break;
    case 5: smsCount = (java.lang.Long)value$; break;
    case 6: isEmailThrottled = (java.lang.Boolean)value$; break;
    case 7: isSmsThrottled = (java.lang.Boolean)value$; break;
    case 8: emailThrottledTill = (java.lang.Long)value$; break;
    case 9: smsThrottledTill = (java.lang.Long)value$; break;
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
   * Gets the value of the 'subscriber' field.
   * @return The value of the 'subscriber' field.
   */
  public java.lang.String getSubscriber() {
    return subscriber;
  }

  /**
   * Sets the value of the 'subscriber' field.
   * @param value the value to set.
   */
  public void setSubscriber(java.lang.String value) {
    this.subscriber = value;
  }

  /**
   * Gets the value of the 'event' field.
   * @return The value of the 'event' field.
   */
  public java.lang.String getEvent() {
    return event;
  }

  /**
   * Sets the value of the 'event' field.
   * @param value the value to set.
   */
  public void setEvent(java.lang.String value) {
    this.event = value;
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
   * Gets the value of the 'emailCount' field.
   * @return The value of the 'emailCount' field.
   */
  public java.lang.Long getEmailCount() {
    return emailCount;
  }

  /**
   * Sets the value of the 'emailCount' field.
   * @param value the value to set.
   */
  public void setEmailCount(java.lang.Long value) {
    this.emailCount = value;
  }

  /**
   * Gets the value of the 'smsCount' field.
   * @return The value of the 'smsCount' field.
   */
  public java.lang.Long getSmsCount() {
    return smsCount;
  }

  /**
   * Sets the value of the 'smsCount' field.
   * @param value the value to set.
   */
  public void setSmsCount(java.lang.Long value) {
    this.smsCount = value;
  }

  /**
   * Gets the value of the 'isEmailThrottled' field.
   * @return The value of the 'isEmailThrottled' field.
   */
  public java.lang.Boolean getIsEmailThrottled() {
    return isEmailThrottled;
  }

  /**
   * Sets the value of the 'isEmailThrottled' field.
   * @param value the value to set.
   */
  public void setIsEmailThrottled(java.lang.Boolean value) {
    this.isEmailThrottled = value;
  }

  /**
   * Gets the value of the 'isSmsThrottled' field.
   * @return The value of the 'isSmsThrottled' field.
   */
  public java.lang.Boolean getIsSmsThrottled() {
    return isSmsThrottled;
  }

  /**
   * Sets the value of the 'isSmsThrottled' field.
   * @param value the value to set.
   */
  public void setIsSmsThrottled(java.lang.Boolean value) {
    this.isSmsThrottled = value;
  }

  /**
   * Gets the value of the 'emailThrottledTill' field.
   * @return The value of the 'emailThrottledTill' field.
   */
  public java.lang.Long getEmailThrottledTill() {
    return emailThrottledTill;
  }

  /**
   * Sets the value of the 'emailThrottledTill' field.
   * @param value the value to set.
   */
  public void setEmailThrottledTill(java.lang.Long value) {
    this.emailThrottledTill = value;
  }

  /**
   * Gets the value of the 'smsThrottledTill' field.
   * @return The value of the 'smsThrottledTill' field.
   */
  public java.lang.Long getSmsThrottledTill() {
    return smsThrottledTill;
  }

  /**
   * Sets the value of the 'smsThrottledTill' field.
   * @param value the value to set.
   */
  public void setSmsThrottledTill(java.lang.Long value) {
    this.smsThrottledTill = value;
  }

  /**
   * Creates a new NotificationCounter RecordBuilder.
   * @return A new NotificationCounter RecordBuilder
   */
  public static com.fretron.Model.NotificationCounter.Builder newBuilder() {
    return new com.fretron.Model.NotificationCounter.Builder();
  }

  /**
   * Creates a new NotificationCounter RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NotificationCounter RecordBuilder
   */
  public static com.fretron.Model.NotificationCounter.Builder newBuilder(com.fretron.Model.NotificationCounter.Builder other) {
    return new com.fretron.Model.NotificationCounter.Builder(other);
  }

  /**
   * Creates a new NotificationCounter RecordBuilder by copying an existing NotificationCounter instance.
   * @param other The existing instance to copy.
   * @return A new NotificationCounter RecordBuilder
   */
  public static com.fretron.Model.NotificationCounter.Builder newBuilder(com.fretron.Model.NotificationCounter other) {
    return new com.fretron.Model.NotificationCounter.Builder(other);
  }

  /**
   * RecordBuilder for NotificationCounter instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NotificationCounter>
    implements org.apache.avro.data.RecordBuilder<NotificationCounter> {

    private java.lang.String uuid;
    private java.lang.String subscriber;
    private java.lang.String event;
    private java.lang.Long startTime;
    private java.lang.Long emailCount;
    private java.lang.Long smsCount;
    private java.lang.Boolean isEmailThrottled;
    private java.lang.Boolean isSmsThrottled;
    private java.lang.Long emailThrottledTill;
    private java.lang.Long smsThrottledTill;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.NotificationCounter.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.subscriber)) {
        this.subscriber = data().deepCopy(fields()[1].schema(), other.subscriber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.event)) {
        this.event = data().deepCopy(fields()[2].schema(), other.event);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.startTime)) {
        this.startTime = data().deepCopy(fields()[3].schema(), other.startTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.emailCount)) {
        this.emailCount = data().deepCopy(fields()[4].schema(), other.emailCount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.smsCount)) {
        this.smsCount = data().deepCopy(fields()[5].schema(), other.smsCount);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.isEmailThrottled)) {
        this.isEmailThrottled = data().deepCopy(fields()[6].schema(), other.isEmailThrottled);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.isSmsThrottled)) {
        this.isSmsThrottled = data().deepCopy(fields()[7].schema(), other.isSmsThrottled);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.emailThrottledTill)) {
        this.emailThrottledTill = data().deepCopy(fields()[8].schema(), other.emailThrottledTill);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.smsThrottledTill)) {
        this.smsThrottledTill = data().deepCopy(fields()[9].schema(), other.smsThrottledTill);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing NotificationCounter instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.NotificationCounter other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.subscriber)) {
        this.subscriber = data().deepCopy(fields()[1].schema(), other.subscriber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.event)) {
        this.event = data().deepCopy(fields()[2].schema(), other.event);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.startTime)) {
        this.startTime = data().deepCopy(fields()[3].schema(), other.startTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.emailCount)) {
        this.emailCount = data().deepCopy(fields()[4].schema(), other.emailCount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.smsCount)) {
        this.smsCount = data().deepCopy(fields()[5].schema(), other.smsCount);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.isEmailThrottled)) {
        this.isEmailThrottled = data().deepCopy(fields()[6].schema(), other.isEmailThrottled);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.isSmsThrottled)) {
        this.isSmsThrottled = data().deepCopy(fields()[7].schema(), other.isSmsThrottled);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.emailThrottledTill)) {
        this.emailThrottledTill = data().deepCopy(fields()[8].schema(), other.emailThrottledTill);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.smsThrottledTill)) {
        this.smsThrottledTill = data().deepCopy(fields()[9].schema(), other.smsThrottledTill);
        fieldSetFlags()[9] = true;
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
    public com.fretron.Model.NotificationCounter.Builder setUuid(java.lang.String value) {
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
    public com.fretron.Model.NotificationCounter.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'subscriber' field.
      * @return The value.
      */
    public java.lang.String getSubscriber() {
      return subscriber;
    }

    /**
      * Sets the value of the 'subscriber' field.
      * @param value The value of 'subscriber'.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder setSubscriber(java.lang.String value) {
      validate(fields()[1], value);
      this.subscriber = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'subscriber' field has been set.
      * @return True if the 'subscriber' field has been set, false otherwise.
      */
    public boolean hasSubscriber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'subscriber' field.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder clearSubscriber() {
      subscriber = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'event' field.
      * @return The value.
      */
    public java.lang.String getEvent() {
      return event;
    }

    /**
      * Sets the value of the 'event' field.
      * @param value The value of 'event'.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder setEvent(java.lang.String value) {
      validate(fields()[2], value);
      this.event = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'event' field has been set.
      * @return True if the 'event' field has been set, false otherwise.
      */
    public boolean hasEvent() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'event' field.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder clearEvent() {
      event = null;
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
    public com.fretron.Model.NotificationCounter.Builder setStartTime(java.lang.Long value) {
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
    public com.fretron.Model.NotificationCounter.Builder clearStartTime() {
      startTime = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'emailCount' field.
      * @return The value.
      */
    public java.lang.Long getEmailCount() {
      return emailCount;
    }

    /**
      * Sets the value of the 'emailCount' field.
      * @param value The value of 'emailCount'.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder setEmailCount(java.lang.Long value) {
      validate(fields()[4], value);
      this.emailCount = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'emailCount' field has been set.
      * @return True if the 'emailCount' field has been set, false otherwise.
      */
    public boolean hasEmailCount() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'emailCount' field.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder clearEmailCount() {
      emailCount = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'smsCount' field.
      * @return The value.
      */
    public java.lang.Long getSmsCount() {
      return smsCount;
    }

    /**
      * Sets the value of the 'smsCount' field.
      * @param value The value of 'smsCount'.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder setSmsCount(java.lang.Long value) {
      validate(fields()[5], value);
      this.smsCount = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'smsCount' field has been set.
      * @return True if the 'smsCount' field has been set, false otherwise.
      */
    public boolean hasSmsCount() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'smsCount' field.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder clearSmsCount() {
      smsCount = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'isEmailThrottled' field.
      * @return The value.
      */
    public java.lang.Boolean getIsEmailThrottled() {
      return isEmailThrottled;
    }

    /**
      * Sets the value of the 'isEmailThrottled' field.
      * @param value The value of 'isEmailThrottled'.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder setIsEmailThrottled(java.lang.Boolean value) {
      validate(fields()[6], value);
      this.isEmailThrottled = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'isEmailThrottled' field has been set.
      * @return True if the 'isEmailThrottled' field has been set, false otherwise.
      */
    public boolean hasIsEmailThrottled() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'isEmailThrottled' field.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder clearIsEmailThrottled() {
      isEmailThrottled = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'isSmsThrottled' field.
      * @return The value.
      */
    public java.lang.Boolean getIsSmsThrottled() {
      return isSmsThrottled;
    }

    /**
      * Sets the value of the 'isSmsThrottled' field.
      * @param value The value of 'isSmsThrottled'.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder setIsSmsThrottled(java.lang.Boolean value) {
      validate(fields()[7], value);
      this.isSmsThrottled = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'isSmsThrottled' field has been set.
      * @return True if the 'isSmsThrottled' field has been set, false otherwise.
      */
    public boolean hasIsSmsThrottled() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'isSmsThrottled' field.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder clearIsSmsThrottled() {
      isSmsThrottled = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'emailThrottledTill' field.
      * @return The value.
      */
    public java.lang.Long getEmailThrottledTill() {
      return emailThrottledTill;
    }

    /**
      * Sets the value of the 'emailThrottledTill' field.
      * @param value The value of 'emailThrottledTill'.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder setEmailThrottledTill(java.lang.Long value) {
      validate(fields()[8], value);
      this.emailThrottledTill = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'emailThrottledTill' field has been set.
      * @return True if the 'emailThrottledTill' field has been set, false otherwise.
      */
    public boolean hasEmailThrottledTill() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'emailThrottledTill' field.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder clearEmailThrottledTill() {
      emailThrottledTill = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'smsThrottledTill' field.
      * @return The value.
      */
    public java.lang.Long getSmsThrottledTill() {
      return smsThrottledTill;
    }

    /**
      * Sets the value of the 'smsThrottledTill' field.
      * @param value The value of 'smsThrottledTill'.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder setSmsThrottledTill(java.lang.Long value) {
      validate(fields()[9], value);
      this.smsThrottledTill = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'smsThrottledTill' field has been set.
      * @return True if the 'smsThrottledTill' field has been set, false otherwise.
      */
    public boolean hasSmsThrottledTill() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'smsThrottledTill' field.
      * @return This builder.
      */
    public com.fretron.Model.NotificationCounter.Builder clearSmsThrottledTill() {
      smsThrottledTill = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public NotificationCounter build() {
      try {
        NotificationCounter record = new NotificationCounter();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.subscriber = fieldSetFlags()[1] ? this.subscriber : (java.lang.String) defaultValue(fields()[1]);
        record.event = fieldSetFlags()[2] ? this.event : (java.lang.String) defaultValue(fields()[2]);
        record.startTime = fieldSetFlags()[3] ? this.startTime : (java.lang.Long) defaultValue(fields()[3]);
        record.emailCount = fieldSetFlags()[4] ? this.emailCount : (java.lang.Long) defaultValue(fields()[4]);
        record.smsCount = fieldSetFlags()[5] ? this.smsCount : (java.lang.Long) defaultValue(fields()[5]);
        record.isEmailThrottled = fieldSetFlags()[6] ? this.isEmailThrottled : (java.lang.Boolean) defaultValue(fields()[6]);
        record.isSmsThrottled = fieldSetFlags()[7] ? this.isSmsThrottled : (java.lang.Boolean) defaultValue(fields()[7]);
        record.emailThrottledTill = fieldSetFlags()[8] ? this.emailThrottledTill : (java.lang.Long) defaultValue(fields()[8]);
        record.smsThrottledTill = fieldSetFlags()[9] ? this.smsThrottledTill : (java.lang.Long) defaultValue(fields()[9]);
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
