/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CostSummary extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5373399413176455037L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CostSummary\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"consignor\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CostRule\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"uom\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isApplicable\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"consignee\",\"type\":[\"null\",\"CostRule\"],\"default\":null},{\"name\":\"origin\",\"type\":[\"null\",\"CostRule\"],\"default\":null},{\"name\":\"destination\",\"type\":[\"null\",\"CostRule\"],\"default\":null},{\"name\":\"vehicleType\",\"type\":[\"null\",\"CostRule\"],\"default\":null},{\"name\":\"sourceOfVehicle\",\"type\":[\"null\",\"CostRule\"],\"default\":null},{\"name\":\"movementCategory\",\"type\":[\"null\",\"CostRule\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.fretron.Model.CostRule consignor;
  @Deprecated public com.fretron.Model.CostRule consignee;
  @Deprecated public com.fretron.Model.CostRule origin;
  @Deprecated public com.fretron.Model.CostRule destination;
  @Deprecated public com.fretron.Model.CostRule vehicleType;
  @Deprecated public com.fretron.Model.CostRule sourceOfVehicle;
  @Deprecated public com.fretron.Model.CostRule movementCategory;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CostSummary() {}

  /**
   * All-args constructor.
   * @param consignor The new value for consignor
   * @param consignee The new value for consignee
   * @param origin The new value for origin
   * @param destination The new value for destination
   * @param vehicleType The new value for vehicleType
   * @param sourceOfVehicle The new value for sourceOfVehicle
   * @param movementCategory The new value for movementCategory
   */
  public CostSummary(com.fretron.Model.CostRule consignor, com.fretron.Model.CostRule consignee, com.fretron.Model.CostRule origin, com.fretron.Model.CostRule destination, com.fretron.Model.CostRule vehicleType, com.fretron.Model.CostRule sourceOfVehicle, com.fretron.Model.CostRule movementCategory) {
    this.consignor = consignor;
    this.consignee = consignee;
    this.origin = origin;
    this.destination = destination;
    this.vehicleType = vehicleType;
    this.sourceOfVehicle = sourceOfVehicle;
    this.movementCategory = movementCategory;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return consignor;
    case 1: return consignee;
    case 2: return origin;
    case 3: return destination;
    case 4: return vehicleType;
    case 5: return sourceOfVehicle;
    case 6: return movementCategory;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: consignor = (com.fretron.Model.CostRule)value$; break;
    case 1: consignee = (com.fretron.Model.CostRule)value$; break;
    case 2: origin = (com.fretron.Model.CostRule)value$; break;
    case 3: destination = (com.fretron.Model.CostRule)value$; break;
    case 4: vehicleType = (com.fretron.Model.CostRule)value$; break;
    case 5: sourceOfVehicle = (com.fretron.Model.CostRule)value$; break;
    case 6: movementCategory = (com.fretron.Model.CostRule)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'consignor' field.
   * @return The value of the 'consignor' field.
   */
  public com.fretron.Model.CostRule getConsignor() {
    return consignor;
  }

  /**
   * Sets the value of the 'consignor' field.
   * @param value the value to set.
   */
  public void setConsignor(com.fretron.Model.CostRule value) {
    this.consignor = value;
  }

  /**
   * Gets the value of the 'consignee' field.
   * @return The value of the 'consignee' field.
   */
  public com.fretron.Model.CostRule getConsignee() {
    return consignee;
  }

  /**
   * Sets the value of the 'consignee' field.
   * @param value the value to set.
   */
  public void setConsignee(com.fretron.Model.CostRule value) {
    this.consignee = value;
  }

  /**
   * Gets the value of the 'origin' field.
   * @return The value of the 'origin' field.
   */
  public com.fretron.Model.CostRule getOrigin() {
    return origin;
  }

  /**
   * Sets the value of the 'origin' field.
   * @param value the value to set.
   */
  public void setOrigin(com.fretron.Model.CostRule value) {
    this.origin = value;
  }

  /**
   * Gets the value of the 'destination' field.
   * @return The value of the 'destination' field.
   */
  public com.fretron.Model.CostRule getDestination() {
    return destination;
  }

  /**
   * Sets the value of the 'destination' field.
   * @param value the value to set.
   */
  public void setDestination(com.fretron.Model.CostRule value) {
    this.destination = value;
  }

  /**
   * Gets the value of the 'vehicleType' field.
   * @return The value of the 'vehicleType' field.
   */
  public com.fretron.Model.CostRule getVehicleType() {
    return vehicleType;
  }

  /**
   * Sets the value of the 'vehicleType' field.
   * @param value the value to set.
   */
  public void setVehicleType(com.fretron.Model.CostRule value) {
    this.vehicleType = value;
  }

  /**
   * Gets the value of the 'sourceOfVehicle' field.
   * @return The value of the 'sourceOfVehicle' field.
   */
  public com.fretron.Model.CostRule getSourceOfVehicle() {
    return sourceOfVehicle;
  }

  /**
   * Sets the value of the 'sourceOfVehicle' field.
   * @param value the value to set.
   */
  public void setSourceOfVehicle(com.fretron.Model.CostRule value) {
    this.sourceOfVehicle = value;
  }

  /**
   * Gets the value of the 'movementCategory' field.
   * @return The value of the 'movementCategory' field.
   */
  public com.fretron.Model.CostRule getMovementCategory() {
    return movementCategory;
  }

  /**
   * Sets the value of the 'movementCategory' field.
   * @param value the value to set.
   */
  public void setMovementCategory(com.fretron.Model.CostRule value) {
    this.movementCategory = value;
  }

  /**
   * Creates a new CostSummary RecordBuilder.
   * @return A new CostSummary RecordBuilder
   */
  public static com.fretron.Model.CostSummary.Builder newBuilder() {
    return new com.fretron.Model.CostSummary.Builder();
  }

  /**
   * Creates a new CostSummary RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CostSummary RecordBuilder
   */
  public static com.fretron.Model.CostSummary.Builder newBuilder(com.fretron.Model.CostSummary.Builder other) {
    return new com.fretron.Model.CostSummary.Builder(other);
  }

  /**
   * Creates a new CostSummary RecordBuilder by copying an existing CostSummary instance.
   * @param other The existing instance to copy.
   * @return A new CostSummary RecordBuilder
   */
  public static com.fretron.Model.CostSummary.Builder newBuilder(com.fretron.Model.CostSummary other) {
    return new com.fretron.Model.CostSummary.Builder(other);
  }

  /**
   * RecordBuilder for CostSummary instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CostSummary>
    implements org.apache.avro.data.RecordBuilder<CostSummary> {

    private com.fretron.Model.CostRule consignor;
    private com.fretron.Model.CostRule.Builder consignorBuilder;
    private com.fretron.Model.CostRule consignee;
    private com.fretron.Model.CostRule.Builder consigneeBuilder;
    private com.fretron.Model.CostRule origin;
    private com.fretron.Model.CostRule.Builder originBuilder;
    private com.fretron.Model.CostRule destination;
    private com.fretron.Model.CostRule.Builder destinationBuilder;
    private com.fretron.Model.CostRule vehicleType;
    private com.fretron.Model.CostRule.Builder vehicleTypeBuilder;
    private com.fretron.Model.CostRule sourceOfVehicle;
    private com.fretron.Model.CostRule.Builder sourceOfVehicleBuilder;
    private com.fretron.Model.CostRule movementCategory;
    private com.fretron.Model.CostRule.Builder movementCategoryBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.CostSummary.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.consignor)) {
        this.consignor = data().deepCopy(fields()[0].schema(), other.consignor);
        fieldSetFlags()[0] = true;
      }
      if (other.hasConsignorBuilder()) {
        this.consignorBuilder = com.fretron.Model.CostRule.newBuilder(other.getConsignorBuilder());
      }
      if (isValidValue(fields()[1], other.consignee)) {
        this.consignee = data().deepCopy(fields()[1].schema(), other.consignee);
        fieldSetFlags()[1] = true;
      }
      if (other.hasConsigneeBuilder()) {
        this.consigneeBuilder = com.fretron.Model.CostRule.newBuilder(other.getConsigneeBuilder());
      }
      if (isValidValue(fields()[2], other.origin)) {
        this.origin = data().deepCopy(fields()[2].schema(), other.origin);
        fieldSetFlags()[2] = true;
      }
      if (other.hasOriginBuilder()) {
        this.originBuilder = com.fretron.Model.CostRule.newBuilder(other.getOriginBuilder());
      }
      if (isValidValue(fields()[3], other.destination)) {
        this.destination = data().deepCopy(fields()[3].schema(), other.destination);
        fieldSetFlags()[3] = true;
      }
      if (other.hasDestinationBuilder()) {
        this.destinationBuilder = com.fretron.Model.CostRule.newBuilder(other.getDestinationBuilder());
      }
      if (isValidValue(fields()[4], other.vehicleType)) {
        this.vehicleType = data().deepCopy(fields()[4].schema(), other.vehicleType);
        fieldSetFlags()[4] = true;
      }
      if (other.hasVehicleTypeBuilder()) {
        this.vehicleTypeBuilder = com.fretron.Model.CostRule.newBuilder(other.getVehicleTypeBuilder());
      }
      if (isValidValue(fields()[5], other.sourceOfVehicle)) {
        this.sourceOfVehicle = data().deepCopy(fields()[5].schema(), other.sourceOfVehicle);
        fieldSetFlags()[5] = true;
      }
      if (other.hasSourceOfVehicleBuilder()) {
        this.sourceOfVehicleBuilder = com.fretron.Model.CostRule.newBuilder(other.getSourceOfVehicleBuilder());
      }
      if (isValidValue(fields()[6], other.movementCategory)) {
        this.movementCategory = data().deepCopy(fields()[6].schema(), other.movementCategory);
        fieldSetFlags()[6] = true;
      }
      if (other.hasMovementCategoryBuilder()) {
        this.movementCategoryBuilder = com.fretron.Model.CostRule.newBuilder(other.getMovementCategoryBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing CostSummary instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.CostSummary other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.consignor)) {
        this.consignor = data().deepCopy(fields()[0].schema(), other.consignor);
        fieldSetFlags()[0] = true;
      }
      this.consignorBuilder = null;
      if (isValidValue(fields()[1], other.consignee)) {
        this.consignee = data().deepCopy(fields()[1].schema(), other.consignee);
        fieldSetFlags()[1] = true;
      }
      this.consigneeBuilder = null;
      if (isValidValue(fields()[2], other.origin)) {
        this.origin = data().deepCopy(fields()[2].schema(), other.origin);
        fieldSetFlags()[2] = true;
      }
      this.originBuilder = null;
      if (isValidValue(fields()[3], other.destination)) {
        this.destination = data().deepCopy(fields()[3].schema(), other.destination);
        fieldSetFlags()[3] = true;
      }
      this.destinationBuilder = null;
      if (isValidValue(fields()[4], other.vehicleType)) {
        this.vehicleType = data().deepCopy(fields()[4].schema(), other.vehicleType);
        fieldSetFlags()[4] = true;
      }
      this.vehicleTypeBuilder = null;
      if (isValidValue(fields()[5], other.sourceOfVehicle)) {
        this.sourceOfVehicle = data().deepCopy(fields()[5].schema(), other.sourceOfVehicle);
        fieldSetFlags()[5] = true;
      }
      this.sourceOfVehicleBuilder = null;
      if (isValidValue(fields()[6], other.movementCategory)) {
        this.movementCategory = data().deepCopy(fields()[6].schema(), other.movementCategory);
        fieldSetFlags()[6] = true;
      }
      this.movementCategoryBuilder = null;
    }

    /**
      * Gets the value of the 'consignor' field.
      * @return The value.
      */
    public com.fretron.Model.CostRule getConsignor() {
      return consignor;
    }

    /**
      * Sets the value of the 'consignor' field.
      * @param value The value of 'consignor'.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder setConsignor(com.fretron.Model.CostRule value) {
      validate(fields()[0], value);
      this.consignorBuilder = null;
      this.consignor = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'consignor' field has been set.
      * @return True if the 'consignor' field has been set, false otherwise.
      */
    public boolean hasConsignor() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'consignor' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.CostRule.Builder getConsignorBuilder() {
      if (consignorBuilder == null) {
        if (hasConsignor()) {
          setConsignorBuilder(com.fretron.Model.CostRule.newBuilder(consignor));
        } else {
          setConsignorBuilder(com.fretron.Model.CostRule.newBuilder());
        }
      }
      return consignorBuilder;
    }

    /**
     * Sets the Builder instance for the 'consignor' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CostSummary.Builder setConsignorBuilder(com.fretron.Model.CostRule.Builder value) {
      clearConsignor();
      consignorBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'consignor' field has an active Builder instance
     * @return True if the 'consignor' field has an active Builder instance
     */
    public boolean hasConsignorBuilder() {
      return consignorBuilder != null;
    }

    /**
      * Clears the value of the 'consignor' field.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder clearConsignor() {
      consignor = null;
      consignorBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'consignee' field.
      * @return The value.
      */
    public com.fretron.Model.CostRule getConsignee() {
      return consignee;
    }

    /**
      * Sets the value of the 'consignee' field.
      * @param value The value of 'consignee'.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder setConsignee(com.fretron.Model.CostRule value) {
      validate(fields()[1], value);
      this.consigneeBuilder = null;
      this.consignee = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'consignee' field has been set.
      * @return True if the 'consignee' field has been set, false otherwise.
      */
    public boolean hasConsignee() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'consignee' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.CostRule.Builder getConsigneeBuilder() {
      if (consigneeBuilder == null) {
        if (hasConsignee()) {
          setConsigneeBuilder(com.fretron.Model.CostRule.newBuilder(consignee));
        } else {
          setConsigneeBuilder(com.fretron.Model.CostRule.newBuilder());
        }
      }
      return consigneeBuilder;
    }

    /**
     * Sets the Builder instance for the 'consignee' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CostSummary.Builder setConsigneeBuilder(com.fretron.Model.CostRule.Builder value) {
      clearConsignee();
      consigneeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'consignee' field has an active Builder instance
     * @return True if the 'consignee' field has an active Builder instance
     */
    public boolean hasConsigneeBuilder() {
      return consigneeBuilder != null;
    }

    /**
      * Clears the value of the 'consignee' field.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder clearConsignee() {
      consignee = null;
      consigneeBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'origin' field.
      * @return The value.
      */
    public com.fretron.Model.CostRule getOrigin() {
      return origin;
    }

    /**
      * Sets the value of the 'origin' field.
      * @param value The value of 'origin'.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder setOrigin(com.fretron.Model.CostRule value) {
      validate(fields()[2], value);
      this.originBuilder = null;
      this.origin = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'origin' field has been set.
      * @return True if the 'origin' field has been set, false otherwise.
      */
    public boolean hasOrigin() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'origin' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.CostRule.Builder getOriginBuilder() {
      if (originBuilder == null) {
        if (hasOrigin()) {
          setOriginBuilder(com.fretron.Model.CostRule.newBuilder(origin));
        } else {
          setOriginBuilder(com.fretron.Model.CostRule.newBuilder());
        }
      }
      return originBuilder;
    }

    /**
     * Sets the Builder instance for the 'origin' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CostSummary.Builder setOriginBuilder(com.fretron.Model.CostRule.Builder value) {
      clearOrigin();
      originBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'origin' field has an active Builder instance
     * @return True if the 'origin' field has an active Builder instance
     */
    public boolean hasOriginBuilder() {
      return originBuilder != null;
    }

    /**
      * Clears the value of the 'origin' field.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder clearOrigin() {
      origin = null;
      originBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'destination' field.
      * @return The value.
      */
    public com.fretron.Model.CostRule getDestination() {
      return destination;
    }

    /**
      * Sets the value of the 'destination' field.
      * @param value The value of 'destination'.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder setDestination(com.fretron.Model.CostRule value) {
      validate(fields()[3], value);
      this.destinationBuilder = null;
      this.destination = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'destination' field has been set.
      * @return True if the 'destination' field has been set, false otherwise.
      */
    public boolean hasDestination() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'destination' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.CostRule.Builder getDestinationBuilder() {
      if (destinationBuilder == null) {
        if (hasDestination()) {
          setDestinationBuilder(com.fretron.Model.CostRule.newBuilder(destination));
        } else {
          setDestinationBuilder(com.fretron.Model.CostRule.newBuilder());
        }
      }
      return destinationBuilder;
    }

    /**
     * Sets the Builder instance for the 'destination' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CostSummary.Builder setDestinationBuilder(com.fretron.Model.CostRule.Builder value) {
      clearDestination();
      destinationBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'destination' field has an active Builder instance
     * @return True if the 'destination' field has an active Builder instance
     */
    public boolean hasDestinationBuilder() {
      return destinationBuilder != null;
    }

    /**
      * Clears the value of the 'destination' field.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder clearDestination() {
      destination = null;
      destinationBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'vehicleType' field.
      * @return The value.
      */
    public com.fretron.Model.CostRule getVehicleType() {
      return vehicleType;
    }

    /**
      * Sets the value of the 'vehicleType' field.
      * @param value The value of 'vehicleType'.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder setVehicleType(com.fretron.Model.CostRule value) {
      validate(fields()[4], value);
      this.vehicleTypeBuilder = null;
      this.vehicleType = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleType' field has been set.
      * @return True if the 'vehicleType' field has been set, false otherwise.
      */
    public boolean hasVehicleType() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'vehicleType' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.CostRule.Builder getVehicleTypeBuilder() {
      if (vehicleTypeBuilder == null) {
        if (hasVehicleType()) {
          setVehicleTypeBuilder(com.fretron.Model.CostRule.newBuilder(vehicleType));
        } else {
          setVehicleTypeBuilder(com.fretron.Model.CostRule.newBuilder());
        }
      }
      return vehicleTypeBuilder;
    }

    /**
     * Sets the Builder instance for the 'vehicleType' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CostSummary.Builder setVehicleTypeBuilder(com.fretron.Model.CostRule.Builder value) {
      clearVehicleType();
      vehicleTypeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'vehicleType' field has an active Builder instance
     * @return True if the 'vehicleType' field has an active Builder instance
     */
    public boolean hasVehicleTypeBuilder() {
      return vehicleTypeBuilder != null;
    }

    /**
      * Clears the value of the 'vehicleType' field.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder clearVehicleType() {
      vehicleType = null;
      vehicleTypeBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'sourceOfVehicle' field.
      * @return The value.
      */
    public com.fretron.Model.CostRule getSourceOfVehicle() {
      return sourceOfVehicle;
    }

    /**
      * Sets the value of the 'sourceOfVehicle' field.
      * @param value The value of 'sourceOfVehicle'.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder setSourceOfVehicle(com.fretron.Model.CostRule value) {
      validate(fields()[5], value);
      this.sourceOfVehicleBuilder = null;
      this.sourceOfVehicle = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'sourceOfVehicle' field has been set.
      * @return True if the 'sourceOfVehicle' field has been set, false otherwise.
      */
    public boolean hasSourceOfVehicle() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'sourceOfVehicle' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.CostRule.Builder getSourceOfVehicleBuilder() {
      if (sourceOfVehicleBuilder == null) {
        if (hasSourceOfVehicle()) {
          setSourceOfVehicleBuilder(com.fretron.Model.CostRule.newBuilder(sourceOfVehicle));
        } else {
          setSourceOfVehicleBuilder(com.fretron.Model.CostRule.newBuilder());
        }
      }
      return sourceOfVehicleBuilder;
    }

    /**
     * Sets the Builder instance for the 'sourceOfVehicle' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CostSummary.Builder setSourceOfVehicleBuilder(com.fretron.Model.CostRule.Builder value) {
      clearSourceOfVehicle();
      sourceOfVehicleBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'sourceOfVehicle' field has an active Builder instance
     * @return True if the 'sourceOfVehicle' field has an active Builder instance
     */
    public boolean hasSourceOfVehicleBuilder() {
      return sourceOfVehicleBuilder != null;
    }

    /**
      * Clears the value of the 'sourceOfVehicle' field.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder clearSourceOfVehicle() {
      sourceOfVehicle = null;
      sourceOfVehicleBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'movementCategory' field.
      * @return The value.
      */
    public com.fretron.Model.CostRule getMovementCategory() {
      return movementCategory;
    }

    /**
      * Sets the value of the 'movementCategory' field.
      * @param value The value of 'movementCategory'.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder setMovementCategory(com.fretron.Model.CostRule value) {
      validate(fields()[6], value);
      this.movementCategoryBuilder = null;
      this.movementCategory = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'movementCategory' field has been set.
      * @return True if the 'movementCategory' field has been set, false otherwise.
      */
    public boolean hasMovementCategory() {
      return fieldSetFlags()[6];
    }

    /**
     * Gets the Builder instance for the 'movementCategory' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.CostRule.Builder getMovementCategoryBuilder() {
      if (movementCategoryBuilder == null) {
        if (hasMovementCategory()) {
          setMovementCategoryBuilder(com.fretron.Model.CostRule.newBuilder(movementCategory));
        } else {
          setMovementCategoryBuilder(com.fretron.Model.CostRule.newBuilder());
        }
      }
      return movementCategoryBuilder;
    }

    /**
     * Sets the Builder instance for the 'movementCategory' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.CostSummary.Builder setMovementCategoryBuilder(com.fretron.Model.CostRule.Builder value) {
      clearMovementCategory();
      movementCategoryBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'movementCategory' field has an active Builder instance
     * @return True if the 'movementCategory' field has an active Builder instance
     */
    public boolean hasMovementCategoryBuilder() {
      return movementCategoryBuilder != null;
    }

    /**
      * Clears the value of the 'movementCategory' field.
      * @return This builder.
      */
    public com.fretron.Model.CostSummary.Builder clearMovementCategory() {
      movementCategory = null;
      movementCategoryBuilder = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public CostSummary build() {
      try {
        CostSummary record = new CostSummary();
        if (consignorBuilder != null) {
          record.consignor = this.consignorBuilder.build();
        } else {
          record.consignor = fieldSetFlags()[0] ? this.consignor : (com.fretron.Model.CostRule) defaultValue(fields()[0]);
        }
        if (consigneeBuilder != null) {
          record.consignee = this.consigneeBuilder.build();
        } else {
          record.consignee = fieldSetFlags()[1] ? this.consignee : (com.fretron.Model.CostRule) defaultValue(fields()[1]);
        }
        if (originBuilder != null) {
          record.origin = this.originBuilder.build();
        } else {
          record.origin = fieldSetFlags()[2] ? this.origin : (com.fretron.Model.CostRule) defaultValue(fields()[2]);
        }
        if (destinationBuilder != null) {
          record.destination = this.destinationBuilder.build();
        } else {
          record.destination = fieldSetFlags()[3] ? this.destination : (com.fretron.Model.CostRule) defaultValue(fields()[3]);
        }
        if (vehicleTypeBuilder != null) {
          record.vehicleType = this.vehicleTypeBuilder.build();
        } else {
          record.vehicleType = fieldSetFlags()[4] ? this.vehicleType : (com.fretron.Model.CostRule) defaultValue(fields()[4]);
        }
        if (sourceOfVehicleBuilder != null) {
          record.sourceOfVehicle = this.sourceOfVehicleBuilder.build();
        } else {
          record.sourceOfVehicle = fieldSetFlags()[5] ? this.sourceOfVehicle : (com.fretron.Model.CostRule) defaultValue(fields()[5]);
        }
        if (movementCategoryBuilder != null) {
          record.movementCategory = this.movementCategoryBuilder.build();
        } else {
          record.movementCategory = fieldSetFlags()[6] ? this.movementCategory : (com.fretron.Model.CostRule) defaultValue(fields()[6]);
        }
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
