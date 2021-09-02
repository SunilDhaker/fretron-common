/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BillingCycle extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3333953039868853699L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BillingCycle\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"weekDays\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"int\"}],\"default\":null},{\"name\":\"dayHours\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"int\"}],\"default\":null},{\"name\":\"timesOfDay\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"long\"}],\"default\":null},{\"name\":\"monthDays\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"int\"}],\"default\":null},{\"name\":\"billingRule\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String type;
  @Deprecated public java.util.List<java.lang.Integer> weekDays;
  @Deprecated public java.util.List<java.lang.Integer> dayHours;
  @Deprecated public java.util.List<java.lang.Long> timesOfDay;
  @Deprecated public java.util.List<java.lang.Integer> monthDays;
  @Deprecated public java.lang.String billingRule;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BillingCycle() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param weekDays The new value for weekDays
   * @param dayHours The new value for dayHours
   * @param timesOfDay The new value for timesOfDay
   * @param monthDays The new value for monthDays
   * @param billingRule The new value for billingRule
   */
  public BillingCycle(java.lang.String type, java.util.List<java.lang.Integer> weekDays, java.util.List<java.lang.Integer> dayHours, java.util.List<java.lang.Long> timesOfDay, java.util.List<java.lang.Integer> monthDays, java.lang.String billingRule) {
    this.type = type;
    this.weekDays = weekDays;
    this.dayHours = dayHours;
    this.timesOfDay = timesOfDay;
    this.monthDays = monthDays;
    this.billingRule = billingRule;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return weekDays;
    case 2: return dayHours;
    case 3: return timesOfDay;
    case 4: return monthDays;
    case 5: return billingRule;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.String)value$; break;
    case 1: weekDays = (java.util.List<java.lang.Integer>)value$; break;
    case 2: dayHours = (java.util.List<java.lang.Integer>)value$; break;
    case 3: timesOfDay = (java.util.List<java.lang.Long>)value$; break;
    case 4: monthDays = (java.util.List<java.lang.Integer>)value$; break;
    case 5: billingRule = (java.lang.String)value$; break;
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
   * Gets the value of the 'weekDays' field.
   * @return The value of the 'weekDays' field.
   */
  public java.util.List<java.lang.Integer> getWeekDays() {
    return weekDays;
  }

  /**
   * Sets the value of the 'weekDays' field.
   * @param value the value to set.
   */
  public void setWeekDays(java.util.List<java.lang.Integer> value) {
    this.weekDays = value;
  }

  /**
   * Gets the value of the 'dayHours' field.
   * @return The value of the 'dayHours' field.
   */
  public java.util.List<java.lang.Integer> getDayHours() {
    return dayHours;
  }

  /**
   * Sets the value of the 'dayHours' field.
   * @param value the value to set.
   */
  public void setDayHours(java.util.List<java.lang.Integer> value) {
    this.dayHours = value;
  }

  /**
   * Gets the value of the 'timesOfDay' field.
   * @return The value of the 'timesOfDay' field.
   */
  public java.util.List<java.lang.Long> getTimesOfDay() {
    return timesOfDay;
  }

  /**
   * Sets the value of the 'timesOfDay' field.
   * @param value the value to set.
   */
  public void setTimesOfDay(java.util.List<java.lang.Long> value) {
    this.timesOfDay = value;
  }

  /**
   * Gets the value of the 'monthDays' field.
   * @return The value of the 'monthDays' field.
   */
  public java.util.List<java.lang.Integer> getMonthDays() {
    return monthDays;
  }

  /**
   * Sets the value of the 'monthDays' field.
   * @param value the value to set.
   */
  public void setMonthDays(java.util.List<java.lang.Integer> value) {
    this.monthDays = value;
  }

  /**
   * Gets the value of the 'billingRule' field.
   * @return The value of the 'billingRule' field.
   */
  public java.lang.String getBillingRule() {
    return billingRule;
  }

  /**
   * Sets the value of the 'billingRule' field.
   * @param value the value to set.
   */
  public void setBillingRule(java.lang.String value) {
    this.billingRule = value;
  }

  /**
   * Creates a new BillingCycle RecordBuilder.
   * @return A new BillingCycle RecordBuilder
   */
  public static com.fretron.Model.BillingCycle.Builder newBuilder() {
    return new com.fretron.Model.BillingCycle.Builder();
  }

  /**
   * Creates a new BillingCycle RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BillingCycle RecordBuilder
   */
  public static com.fretron.Model.BillingCycle.Builder newBuilder(com.fretron.Model.BillingCycle.Builder other) {
    return new com.fretron.Model.BillingCycle.Builder(other);
  }

  /**
   * Creates a new BillingCycle RecordBuilder by copying an existing BillingCycle instance.
   * @param other The existing instance to copy.
   * @return A new BillingCycle RecordBuilder
   */
  public static com.fretron.Model.BillingCycle.Builder newBuilder(com.fretron.Model.BillingCycle other) {
    return new com.fretron.Model.BillingCycle.Builder(other);
  }

  /**
   * RecordBuilder for BillingCycle instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BillingCycle>
    implements org.apache.avro.data.RecordBuilder<BillingCycle> {

    private java.lang.String type;
    private java.util.List<java.lang.Integer> weekDays;
    private java.util.List<java.lang.Integer> dayHours;
    private java.util.List<java.lang.Long> timesOfDay;
    private java.util.List<java.lang.Integer> monthDays;
    private java.lang.String billingRule;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.BillingCycle.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.weekDays)) {
        this.weekDays = data().deepCopy(fields()[1].schema(), other.weekDays);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dayHours)) {
        this.dayHours = data().deepCopy(fields()[2].schema(), other.dayHours);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timesOfDay)) {
        this.timesOfDay = data().deepCopy(fields()[3].schema(), other.timesOfDay);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.monthDays)) {
        this.monthDays = data().deepCopy(fields()[4].schema(), other.monthDays);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.billingRule)) {
        this.billingRule = data().deepCopy(fields()[5].schema(), other.billingRule);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BillingCycle instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.BillingCycle other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.weekDays)) {
        this.weekDays = data().deepCopy(fields()[1].schema(), other.weekDays);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dayHours)) {
        this.dayHours = data().deepCopy(fields()[2].schema(), other.dayHours);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.timesOfDay)) {
        this.timesOfDay = data().deepCopy(fields()[3].schema(), other.timesOfDay);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.monthDays)) {
        this.monthDays = data().deepCopy(fields()[4].schema(), other.monthDays);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.billingRule)) {
        this.billingRule = data().deepCopy(fields()[5].schema(), other.billingRule);
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
    public com.fretron.Model.BillingCycle.Builder setType(java.lang.String value) {
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
    public com.fretron.Model.BillingCycle.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'weekDays' field.
      * @return The value.
      */
    public java.util.List<java.lang.Integer> getWeekDays() {
      return weekDays;
    }

    /**
      * Sets the value of the 'weekDays' field.
      * @param value The value of 'weekDays'.
      * @return This builder.
      */
    public com.fretron.Model.BillingCycle.Builder setWeekDays(java.util.List<java.lang.Integer> value) {
      validate(fields()[1], value);
      this.weekDays = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'weekDays' field has been set.
      * @return True if the 'weekDays' field has been set, false otherwise.
      */
    public boolean hasWeekDays() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'weekDays' field.
      * @return This builder.
      */
    public com.fretron.Model.BillingCycle.Builder clearWeekDays() {
      weekDays = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'dayHours' field.
      * @return The value.
      */
    public java.util.List<java.lang.Integer> getDayHours() {
      return dayHours;
    }

    /**
      * Sets the value of the 'dayHours' field.
      * @param value The value of 'dayHours'.
      * @return This builder.
      */
    public com.fretron.Model.BillingCycle.Builder setDayHours(java.util.List<java.lang.Integer> value) {
      validate(fields()[2], value);
      this.dayHours = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'dayHours' field has been set.
      * @return True if the 'dayHours' field has been set, false otherwise.
      */
    public boolean hasDayHours() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'dayHours' field.
      * @return This builder.
      */
    public com.fretron.Model.BillingCycle.Builder clearDayHours() {
      dayHours = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'timesOfDay' field.
      * @return The value.
      */
    public java.util.List<java.lang.Long> getTimesOfDay() {
      return timesOfDay;
    }

    /**
      * Sets the value of the 'timesOfDay' field.
      * @param value The value of 'timesOfDay'.
      * @return This builder.
      */
    public com.fretron.Model.BillingCycle.Builder setTimesOfDay(java.util.List<java.lang.Long> value) {
      validate(fields()[3], value);
      this.timesOfDay = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'timesOfDay' field has been set.
      * @return True if the 'timesOfDay' field has been set, false otherwise.
      */
    public boolean hasTimesOfDay() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'timesOfDay' field.
      * @return This builder.
      */
    public com.fretron.Model.BillingCycle.Builder clearTimesOfDay() {
      timesOfDay = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'monthDays' field.
      * @return The value.
      */
    public java.util.List<java.lang.Integer> getMonthDays() {
      return monthDays;
    }

    /**
      * Sets the value of the 'monthDays' field.
      * @param value The value of 'monthDays'.
      * @return This builder.
      */
    public com.fretron.Model.BillingCycle.Builder setMonthDays(java.util.List<java.lang.Integer> value) {
      validate(fields()[4], value);
      this.monthDays = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'monthDays' field has been set.
      * @return True if the 'monthDays' field has been set, false otherwise.
      */
    public boolean hasMonthDays() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'monthDays' field.
      * @return This builder.
      */
    public com.fretron.Model.BillingCycle.Builder clearMonthDays() {
      monthDays = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'billingRule' field.
      * @return The value.
      */
    public java.lang.String getBillingRule() {
      return billingRule;
    }

    /**
      * Sets the value of the 'billingRule' field.
      * @param value The value of 'billingRule'.
      * @return This builder.
      */
    public com.fretron.Model.BillingCycle.Builder setBillingRule(java.lang.String value) {
      validate(fields()[5], value);
      this.billingRule = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'billingRule' field has been set.
      * @return True if the 'billingRule' field has been set, false otherwise.
      */
    public boolean hasBillingRule() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'billingRule' field.
      * @return This builder.
      */
    public com.fretron.Model.BillingCycle.Builder clearBillingRule() {
      billingRule = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public BillingCycle build() {
      try {
        BillingCycle record = new BillingCycle();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.String) defaultValue(fields()[0]);
        record.weekDays = fieldSetFlags()[1] ? this.weekDays : (java.util.List<java.lang.Integer>) defaultValue(fields()[1]);
        record.dayHours = fieldSetFlags()[2] ? this.dayHours : (java.util.List<java.lang.Integer>) defaultValue(fields()[2]);
        record.timesOfDay = fieldSetFlags()[3] ? this.timesOfDay : (java.util.List<java.lang.Long>) defaultValue(fields()[3]);
        record.monthDays = fieldSetFlags()[4] ? this.monthDays : (java.util.List<java.lang.Integer>) defaultValue(fields()[4]);
        record.billingRule = fieldSetFlags()[5] ? this.billingRule : (java.lang.String) defaultValue(fields()[5]);
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