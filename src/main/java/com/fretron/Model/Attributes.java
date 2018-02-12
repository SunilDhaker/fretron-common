/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Attributes extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5971316817845655656L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Attributes\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"battery\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"alarm\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ip\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"distance\",\"type\":[\"null\",\"double\"]},{\"name\":\"totalDistance\",\"type\":[\"null\",\"double\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String battery;
  @Deprecated public java.lang.String alarm;
  @Deprecated public java.lang.String ip;
  @Deprecated public java.lang.Double distance;
  @Deprecated public java.lang.Double totalDistance;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Attributes() {}

  /**
   * All-args constructor.
   * @param battery The new value for battery
   * @param alarm The new value for alarm
   * @param ip The new value for ip
   * @param distance The new value for distance
   * @param totalDistance The new value for totalDistance
   */
  public Attributes(java.lang.String battery, java.lang.String alarm, java.lang.String ip, java.lang.Double distance, java.lang.Double totalDistance) {
    this.battery = battery;
    this.alarm = alarm;
    this.ip = ip;
    this.distance = distance;
    this.totalDistance = totalDistance;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return battery;
    case 1: return alarm;
    case 2: return ip;
    case 3: return distance;
    case 4: return totalDistance;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: battery = (java.lang.String)value$; break;
    case 1: alarm = (java.lang.String)value$; break;
    case 2: ip = (java.lang.String)value$; break;
    case 3: distance = (java.lang.Double)value$; break;
    case 4: totalDistance = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'battery' field.
   * @return The value of the 'battery' field.
   */
  public java.lang.String getBattery() {
    return battery;
  }

  /**
   * Sets the value of the 'battery' field.
   * @param value the value to set.
   */
  public void setBattery(java.lang.String value) {
    this.battery = value;
  }

  /**
   * Gets the value of the 'alarm' field.
   * @return The value of the 'alarm' field.
   */
  public java.lang.String getAlarm() {
    return alarm;
  }

  /**
   * Sets the value of the 'alarm' field.
   * @param value the value to set.
   */
  public void setAlarm(java.lang.String value) {
    this.alarm = value;
  }

  /**
   * Gets the value of the 'ip' field.
   * @return The value of the 'ip' field.
   */
  public java.lang.String getIp() {
    return ip;
  }

  /**
   * Sets the value of the 'ip' field.
   * @param value the value to set.
   */
  public void setIp(java.lang.String value) {
    this.ip = value;
  }

  /**
   * Gets the value of the 'distance' field.
   * @return The value of the 'distance' field.
   */
  public java.lang.Double getDistance() {
    return distance;
  }

  /**
   * Sets the value of the 'distance' field.
   * @param value the value to set.
   */
  public void setDistance(java.lang.Double value) {
    this.distance = value;
  }

  /**
   * Gets the value of the 'totalDistance' field.
   * @return The value of the 'totalDistance' field.
   */
  public java.lang.Double getTotalDistance() {
    return totalDistance;
  }

  /**
   * Sets the value of the 'totalDistance' field.
   * @param value the value to set.
   */
  public void setTotalDistance(java.lang.Double value) {
    this.totalDistance = value;
  }

  /**
   * Creates a new Attributes RecordBuilder.
   * @return A new Attributes RecordBuilder
   */
  public static com.fretron.Model.Attributes.Builder newBuilder() {
    return new com.fretron.Model.Attributes.Builder();
  }

  /**
   * Creates a new Attributes RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Attributes RecordBuilder
   */
  public static com.fretron.Model.Attributes.Builder newBuilder(com.fretron.Model.Attributes.Builder other) {
    return new com.fretron.Model.Attributes.Builder(other);
  }

  /**
   * Creates a new Attributes RecordBuilder by copying an existing Attributes instance.
   * @param other The existing instance to copy.
   * @return A new Attributes RecordBuilder
   */
  public static com.fretron.Model.Attributes.Builder newBuilder(com.fretron.Model.Attributes other) {
    return new com.fretron.Model.Attributes.Builder(other);
  }

  /**
   * RecordBuilder for Attributes instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Attributes>
    implements org.apache.avro.data.RecordBuilder<Attributes> {

    private java.lang.String battery;
    private java.lang.String alarm;
    private java.lang.String ip;
    private java.lang.Double distance;
    private java.lang.Double totalDistance;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Attributes.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.battery)) {
        this.battery = data().deepCopy(fields()[0].schema(), other.battery);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.alarm)) {
        this.alarm = data().deepCopy(fields()[1].schema(), other.alarm);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ip)) {
        this.ip = data().deepCopy(fields()[2].schema(), other.ip);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.distance)) {
        this.distance = data().deepCopy(fields()[3].schema(), other.distance);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.totalDistance)) {
        this.totalDistance = data().deepCopy(fields()[4].schema(), other.totalDistance);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Attributes instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Attributes other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.battery)) {
        this.battery = data().deepCopy(fields()[0].schema(), other.battery);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.alarm)) {
        this.alarm = data().deepCopy(fields()[1].schema(), other.alarm);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ip)) {
        this.ip = data().deepCopy(fields()[2].schema(), other.ip);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.distance)) {
        this.distance = data().deepCopy(fields()[3].schema(), other.distance);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.totalDistance)) {
        this.totalDistance = data().deepCopy(fields()[4].schema(), other.totalDistance);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'battery' field.
      * @return The value.
      */
    public java.lang.String getBattery() {
      return battery;
    }

    /**
      * Sets the value of the 'battery' field.
      * @param value The value of 'battery'.
      * @return This builder.
      */
    public com.fretron.Model.Attributes.Builder setBattery(java.lang.String value) {
      validate(fields()[0], value);
      this.battery = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'battery' field has been set.
      * @return True if the 'battery' field has been set, false otherwise.
      */
    public boolean hasBattery() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'battery' field.
      * @return This builder.
      */
    public com.fretron.Model.Attributes.Builder clearBattery() {
      battery = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'alarm' field.
      * @return The value.
      */
    public java.lang.String getAlarm() {
      return alarm;
    }

    /**
      * Sets the value of the 'alarm' field.
      * @param value The value of 'alarm'.
      * @return This builder.
      */
    public com.fretron.Model.Attributes.Builder setAlarm(java.lang.String value) {
      validate(fields()[1], value);
      this.alarm = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'alarm' field has been set.
      * @return True if the 'alarm' field has been set, false otherwise.
      */
    public boolean hasAlarm() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'alarm' field.
      * @return This builder.
      */
    public com.fretron.Model.Attributes.Builder clearAlarm() {
      alarm = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'ip' field.
      * @return The value.
      */
    public java.lang.String getIp() {
      return ip;
    }

    /**
      * Sets the value of the 'ip' field.
      * @param value The value of 'ip'.
      * @return This builder.
      */
    public com.fretron.Model.Attributes.Builder setIp(java.lang.String value) {
      validate(fields()[2], value);
      this.ip = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'ip' field has been set.
      * @return True if the 'ip' field has been set, false otherwise.
      */
    public boolean hasIp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'ip' field.
      * @return This builder.
      */
    public com.fretron.Model.Attributes.Builder clearIp() {
      ip = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'distance' field.
      * @return The value.
      */
    public java.lang.Double getDistance() {
      return distance;
    }

    /**
      * Sets the value of the 'distance' field.
      * @param value The value of 'distance'.
      * @return This builder.
      */
    public com.fretron.Model.Attributes.Builder setDistance(java.lang.Double value) {
      validate(fields()[3], value);
      this.distance = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'distance' field has been set.
      * @return True if the 'distance' field has been set, false otherwise.
      */
    public boolean hasDistance() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'distance' field.
      * @return This builder.
      */
    public com.fretron.Model.Attributes.Builder clearDistance() {
      distance = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'totalDistance' field.
      * @return The value.
      */
    public java.lang.Double getTotalDistance() {
      return totalDistance;
    }

    /**
      * Sets the value of the 'totalDistance' field.
      * @param value The value of 'totalDistance'.
      * @return This builder.
      */
    public com.fretron.Model.Attributes.Builder setTotalDistance(java.lang.Double value) {
      validate(fields()[4], value);
      this.totalDistance = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'totalDistance' field has been set.
      * @return True if the 'totalDistance' field has been set, false otherwise.
      */
    public boolean hasTotalDistance() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'totalDistance' field.
      * @return This builder.
      */
    public com.fretron.Model.Attributes.Builder clearTotalDistance() {
      totalDistance = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Attributes build() {
      try {
        Attributes record = new Attributes();
        record.battery = fieldSetFlags()[0] ? this.battery : (java.lang.String) defaultValue(fields()[0]);
        record.alarm = fieldSetFlags()[1] ? this.alarm : (java.lang.String) defaultValue(fields()[1]);
        record.ip = fieldSetFlags()[2] ? this.ip : (java.lang.String) defaultValue(fields()[2]);
        record.distance = fieldSetFlags()[3] ? this.distance : (java.lang.Double) defaultValue(fields()[3]);
        record.totalDistance = fieldSetFlags()[4] ? this.totalDistance : (java.lang.Double) defaultValue(fields()[4]);
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
