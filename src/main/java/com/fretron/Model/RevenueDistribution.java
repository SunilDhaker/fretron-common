/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RevenueDistribution extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3172312979045013089L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RevenueDistribution\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"contractSupportBranchShareRule\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CostRule\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"uom\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isApplicable\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null},{\"name\":\"businessSupportBranchShareRule\",\"type\":[\"null\",\"CostRule\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public com.fretron.Model.CostRule contractSupportBranchShareRule;
  @Deprecated public com.fretron.Model.CostRule businessSupportBranchShareRule;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RevenueDistribution() {}

  /**
   * All-args constructor.
   * @param contractSupportBranchShareRule The new value for contractSupportBranchShareRule
   * @param businessSupportBranchShareRule The new value for businessSupportBranchShareRule
   */
  public RevenueDistribution(com.fretron.Model.CostRule contractSupportBranchShareRule, com.fretron.Model.CostRule businessSupportBranchShareRule) {
    this.contractSupportBranchShareRule = contractSupportBranchShareRule;
    this.businessSupportBranchShareRule = businessSupportBranchShareRule;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return contractSupportBranchShareRule;
    case 1: return businessSupportBranchShareRule;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: contractSupportBranchShareRule = (com.fretron.Model.CostRule)value$; break;
    case 1: businessSupportBranchShareRule = (com.fretron.Model.CostRule)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'contractSupportBranchShareRule' field.
   * @return The value of the 'contractSupportBranchShareRule' field.
   */
  public com.fretron.Model.CostRule getContractSupportBranchShareRule() {
    return contractSupportBranchShareRule;
  }

  /**
   * Sets the value of the 'contractSupportBranchShareRule' field.
   * @param value the value to set.
   */
  public void setContractSupportBranchShareRule(com.fretron.Model.CostRule value) {
    this.contractSupportBranchShareRule = value;
  }

  /**
   * Gets the value of the 'businessSupportBranchShareRule' field.
   * @return The value of the 'businessSupportBranchShareRule' field.
   */
  public com.fretron.Model.CostRule getBusinessSupportBranchShareRule() {
    return businessSupportBranchShareRule;
  }

  /**
   * Sets the value of the 'businessSupportBranchShareRule' field.
   * @param value the value to set.
   */
  public void setBusinessSupportBranchShareRule(com.fretron.Model.CostRule value) {
    this.businessSupportBranchShareRule = value;
  }

  /**
   * Creates a new RevenueDistribution RecordBuilder.
   * @return A new RevenueDistribution RecordBuilder
   */
  public static com.fretron.Model.RevenueDistribution.Builder newBuilder() {
    return new com.fretron.Model.RevenueDistribution.Builder();
  }

  /**
   * Creates a new RevenueDistribution RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RevenueDistribution RecordBuilder
   */
  public static com.fretron.Model.RevenueDistribution.Builder newBuilder(com.fretron.Model.RevenueDistribution.Builder other) {
    return new com.fretron.Model.RevenueDistribution.Builder(other);
  }

  /**
   * Creates a new RevenueDistribution RecordBuilder by copying an existing RevenueDistribution instance.
   * @param other The existing instance to copy.
   * @return A new RevenueDistribution RecordBuilder
   */
  public static com.fretron.Model.RevenueDistribution.Builder newBuilder(com.fretron.Model.RevenueDistribution other) {
    return new com.fretron.Model.RevenueDistribution.Builder(other);
  }

  /**
   * RecordBuilder for RevenueDistribution instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RevenueDistribution>
    implements org.apache.avro.data.RecordBuilder<RevenueDistribution> {

    private com.fretron.Model.CostRule contractSupportBranchShareRule;
    private com.fretron.Model.CostRule.Builder contractSupportBranchShareRuleBuilder;
    private com.fretron.Model.CostRule businessSupportBranchShareRule;
    private com.fretron.Model.CostRule.Builder businessSupportBranchShareRuleBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.RevenueDistribution.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.contractSupportBranchShareRule)) {
        this.contractSupportBranchShareRule = data().deepCopy(fields()[0].schema(), other.contractSupportBranchShareRule);
        fieldSetFlags()[0] = true;
      }
      if (other.hasContractSupportBranchShareRuleBuilder()) {
        this.contractSupportBranchShareRuleBuilder = com.fretron.Model.CostRule.newBuilder(other.getContractSupportBranchShareRuleBuilder());
      }
      if (isValidValue(fields()[1], other.businessSupportBranchShareRule)) {
        this.businessSupportBranchShareRule = data().deepCopy(fields()[1].schema(), other.businessSupportBranchShareRule);
        fieldSetFlags()[1] = true;
      }
      if (other.hasBusinessSupportBranchShareRuleBuilder()) {
        this.businessSupportBranchShareRuleBuilder = com.fretron.Model.CostRule.newBuilder(other.getBusinessSupportBranchShareRuleBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing RevenueDistribution instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.RevenueDistribution other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.contractSupportBranchShareRule)) {
        this.contractSupportBranchShareRule = data().deepCopy(fields()[0].schema(), other.contractSupportBranchShareRule);
        fieldSetFlags()[0] = true;
      }
      this.contractSupportBranchShareRuleBuilder = null;
      if (isValidValue(fields()[1], other.businessSupportBranchShareRule)) {
        this.businessSupportBranchShareRule = data().deepCopy(fields()[1].schema(), other.businessSupportBranchShareRule);
        fieldSetFlags()[1] = true;
      }
      this.businessSupportBranchShareRuleBuilder = null;
    }

    /**
      * Gets the value of the 'contractSupportBranchShareRule' field.
      * @return The value.
      */
    public com.fretron.Model.CostRule getContractSupportBranchShareRule() {
      return contractSupportBranchShareRule;
    }

    /**
      * Sets the value of the 'contractSupportBranchShareRule' field.
      * @param value The value of 'contractSupportBranchShareRule'.
      * @return This builder.
      */
    public com.fretron.Model.RevenueDistribution.Builder setContractSupportBranchShareRule(com.fretron.Model.CostRule value) {
      validate(fields()[0], value);
      this.contractSupportBranchShareRuleBuilder = null;
      this.contractSupportBranchShareRule = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'contractSupportBranchShareRule' field has been set.
      * @return True if the 'contractSupportBranchShareRule' field has been set, false otherwise.
      */
    public boolean hasContractSupportBranchShareRule() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'contractSupportBranchShareRule' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.CostRule.Builder getContractSupportBranchShareRuleBuilder() {
      if (contractSupportBranchShareRuleBuilder == null) {
        if (hasContractSupportBranchShareRule()) {
          setContractSupportBranchShareRuleBuilder(com.fretron.Model.CostRule.newBuilder(contractSupportBranchShareRule));
        } else {
          setContractSupportBranchShareRuleBuilder(com.fretron.Model.CostRule.newBuilder());
        }
      }
      return contractSupportBranchShareRuleBuilder;
    }

    /**
     * Sets the Builder instance for the 'contractSupportBranchShareRule' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.RevenueDistribution.Builder setContractSupportBranchShareRuleBuilder(com.fretron.Model.CostRule.Builder value) {
      clearContractSupportBranchShareRule();
      contractSupportBranchShareRuleBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'contractSupportBranchShareRule' field has an active Builder instance
     * @return True if the 'contractSupportBranchShareRule' field has an active Builder instance
     */
    public boolean hasContractSupportBranchShareRuleBuilder() {
      return contractSupportBranchShareRuleBuilder != null;
    }

    /**
      * Clears the value of the 'contractSupportBranchShareRule' field.
      * @return This builder.
      */
    public com.fretron.Model.RevenueDistribution.Builder clearContractSupportBranchShareRule() {
      contractSupportBranchShareRule = null;
      contractSupportBranchShareRuleBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'businessSupportBranchShareRule' field.
      * @return The value.
      */
    public com.fretron.Model.CostRule getBusinessSupportBranchShareRule() {
      return businessSupportBranchShareRule;
    }

    /**
      * Sets the value of the 'businessSupportBranchShareRule' field.
      * @param value The value of 'businessSupportBranchShareRule'.
      * @return This builder.
      */
    public com.fretron.Model.RevenueDistribution.Builder setBusinessSupportBranchShareRule(com.fretron.Model.CostRule value) {
      validate(fields()[1], value);
      this.businessSupportBranchShareRuleBuilder = null;
      this.businessSupportBranchShareRule = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'businessSupportBranchShareRule' field has been set.
      * @return True if the 'businessSupportBranchShareRule' field has been set, false otherwise.
      */
    public boolean hasBusinessSupportBranchShareRule() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'businessSupportBranchShareRule' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.CostRule.Builder getBusinessSupportBranchShareRuleBuilder() {
      if (businessSupportBranchShareRuleBuilder == null) {
        if (hasBusinessSupportBranchShareRule()) {
          setBusinessSupportBranchShareRuleBuilder(com.fretron.Model.CostRule.newBuilder(businessSupportBranchShareRule));
        } else {
          setBusinessSupportBranchShareRuleBuilder(com.fretron.Model.CostRule.newBuilder());
        }
      }
      return businessSupportBranchShareRuleBuilder;
    }

    /**
     * Sets the Builder instance for the 'businessSupportBranchShareRule' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.RevenueDistribution.Builder setBusinessSupportBranchShareRuleBuilder(com.fretron.Model.CostRule.Builder value) {
      clearBusinessSupportBranchShareRule();
      businessSupportBranchShareRuleBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'businessSupportBranchShareRule' field has an active Builder instance
     * @return True if the 'businessSupportBranchShareRule' field has an active Builder instance
     */
    public boolean hasBusinessSupportBranchShareRuleBuilder() {
      return businessSupportBranchShareRuleBuilder != null;
    }

    /**
      * Clears the value of the 'businessSupportBranchShareRule' field.
      * @return This builder.
      */
    public com.fretron.Model.RevenueDistribution.Builder clearBusinessSupportBranchShareRule() {
      businessSupportBranchShareRule = null;
      businessSupportBranchShareRuleBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public RevenueDistribution build() {
      try {
        RevenueDistribution record = new RevenueDistribution();
        if (contractSupportBranchShareRuleBuilder != null) {
          record.contractSupportBranchShareRule = this.contractSupportBranchShareRuleBuilder.build();
        } else {
          record.contractSupportBranchShareRule = fieldSetFlags()[0] ? this.contractSupportBranchShareRule : (com.fretron.Model.CostRule) defaultValue(fields()[0]);
        }
        if (businessSupportBranchShareRuleBuilder != null) {
          record.businessSupportBranchShareRule = this.businessSupportBranchShareRuleBuilder.build();
        } else {
          record.businessSupportBranchShareRule = fieldSetFlags()[1] ? this.businessSupportBranchShareRule : (com.fretron.Model.CostRule) defaultValue(fields()[1]);
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
