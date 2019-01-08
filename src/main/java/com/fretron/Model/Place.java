/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Place extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8768803593314066044L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Place\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"center\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}],\"default\":null},{\"name\":\"suggestedRadius\",\"type\":\"double\",\"default\":null},{\"name\":\"viewport\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ViewPort\",\"fields\":[{\"name\":\"northeast\",\"type\":[\"null\",\"Location\"],\"default\":null},{\"name\":\"southwest\",\"type\":[\"null\",\"Location\"],\"default\":null}]}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"addedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"placeId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"boundary\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String name;
  @Deprecated public java.lang.String address;
  @Deprecated public java.lang.String category;
  @Deprecated public com.fretron.Model.Location center;
  @Deprecated public double suggestedRadius;
  @Deprecated public com.fretron.Model.ViewPort viewport;
  @Deprecated public java.lang.String source;
  @Deprecated public java.lang.String addedBy;
  @Deprecated public java.lang.String placeId;
  @Deprecated public java.util.List<java.util.List<java.util.List<java.lang.Double>>> boundary;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Place() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param address The new value for address
   * @param category The new value for category
   * @param center The new value for center
   * @param suggestedRadius The new value for suggestedRadius
   * @param viewport The new value for viewport
   * @param source The new value for source
   * @param addedBy The new value for addedBy
   * @param placeId The new value for placeId
   * @param boundary The new value for boundary
   */
  public Place(java.lang.String name, java.lang.String address, java.lang.String category, com.fretron.Model.Location center, java.lang.Double suggestedRadius, com.fretron.Model.ViewPort viewport, java.lang.String source, java.lang.String addedBy, java.lang.String placeId, java.util.List<java.util.List<java.util.List<java.lang.Double>>> boundary) {
    this.name = name;
    this.address = address;
    this.category = category;
    this.center = center;
    this.suggestedRadius = suggestedRadius;
    this.viewport = viewport;
    this.source = source;
    this.addedBy = addedBy;
    this.placeId = placeId;
    this.boundary = boundary;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return address;
    case 2: return category;
    case 3: return center;
    case 4: return suggestedRadius;
    case 5: return viewport;
    case 6: return source;
    case 7: return addedBy;
    case 8: return placeId;
    case 9: return boundary;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: address = (java.lang.String)value$; break;
    case 2: category = (java.lang.String)value$; break;
    case 3: center = (com.fretron.Model.Location)value$; break;
    case 4: suggestedRadius = (java.lang.Double)value$; break;
    case 5: viewport = (com.fretron.Model.ViewPort)value$; break;
    case 6: source = (java.lang.String)value$; break;
    case 7: addedBy = (java.lang.String)value$; break;
    case 8: placeId = (java.lang.String)value$; break;
    case 9: boundary = (java.util.List<java.util.List<java.util.List<java.lang.Double>>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.String value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'category' field.
   * @return The value of the 'category' field.
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * Sets the value of the 'category' field.
   * @param value the value to set.
   */
  public void setCategory(java.lang.String value) {
    this.category = value;
  }

  /**
   * Gets the value of the 'center' field.
   * @return The value of the 'center' field.
   */
  public com.fretron.Model.Location getCenter() {
    return center;
  }

  /**
   * Sets the value of the 'center' field.
   * @param value the value to set.
   */
  public void setCenter(com.fretron.Model.Location value) {
    this.center = value;
  }

  /**
   * Gets the value of the 'suggestedRadius' field.
   * @return The value of the 'suggestedRadius' field.
   */
  public java.lang.Double getSuggestedRadius() {
    return suggestedRadius;
  }

  /**
   * Sets the value of the 'suggestedRadius' field.
   * @param value the value to set.
   */
  public void setSuggestedRadius(java.lang.Double value) {
    this.suggestedRadius = value;
  }

  /**
   * Gets the value of the 'viewport' field.
   * @return The value of the 'viewport' field.
   */
  public com.fretron.Model.ViewPort getViewport() {
    return viewport;
  }

  /**
   * Sets the value of the 'viewport' field.
   * @param value the value to set.
   */
  public void setViewport(com.fretron.Model.ViewPort value) {
    this.viewport = value;
  }

  /**
   * Gets the value of the 'source' field.
   * @return The value of the 'source' field.
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Sets the value of the 'source' field.
   * @param value the value to set.
   */
  public void setSource(java.lang.String value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'addedBy' field.
   * @return The value of the 'addedBy' field.
   */
  public java.lang.String getAddedBy() {
    return addedBy;
  }

  /**
   * Sets the value of the 'addedBy' field.
   * @param value the value to set.
   */
  public void setAddedBy(java.lang.String value) {
    this.addedBy = value;
  }

  /**
   * Gets the value of the 'placeId' field.
   * @return The value of the 'placeId' field.
   */
  public java.lang.String getPlaceId() {
    return placeId;
  }

  /**
   * Sets the value of the 'placeId' field.
   * @param value the value to set.
   */
  public void setPlaceId(java.lang.String value) {
    this.placeId = value;
  }

  /**
   * Gets the value of the 'boundary' field.
   * @return The value of the 'boundary' field.
   */
  public java.util.List<java.util.List<java.util.List<java.lang.Double>>> getBoundary() {
    return boundary;
  }

  /**
   * Sets the value of the 'boundary' field.
   * @param value the value to set.
   */
  public void setBoundary(java.util.List<java.util.List<java.util.List<java.lang.Double>>> value) {
    this.boundary = value;
  }

  /**
   * Creates a new Place RecordBuilder.
   * @return A new Place RecordBuilder
   */
  public static com.fretron.Model.Place.Builder newBuilder() {
    return new com.fretron.Model.Place.Builder();
  }

  /**
   * Creates a new Place RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Place RecordBuilder
   */
  public static com.fretron.Model.Place.Builder newBuilder(com.fretron.Model.Place.Builder other) {
    return new com.fretron.Model.Place.Builder(other);
  }

  /**
   * Creates a new Place RecordBuilder by copying an existing Place instance.
   * @param other The existing instance to copy.
   * @return A new Place RecordBuilder
   */
  public static com.fretron.Model.Place.Builder newBuilder(com.fretron.Model.Place other) {
    return new com.fretron.Model.Place.Builder(other);
  }

  /**
   * RecordBuilder for Place instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Place>
    implements org.apache.avro.data.RecordBuilder<Place> {

    private java.lang.String name;
    private java.lang.String address;
    private java.lang.String category;
    private com.fretron.Model.Location center;
    private com.fretron.Model.Location.Builder centerBuilder;
    private double suggestedRadius;
    private com.fretron.Model.ViewPort viewport;
    private com.fretron.Model.ViewPort.Builder viewportBuilder;
    private java.lang.String source;
    private java.lang.String addedBy;
    private java.lang.String placeId;
    private java.util.List<java.util.List<java.util.List<java.lang.Double>>> boundary;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.Place.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.address)) {
        this.address = data().deepCopy(fields()[1].schema(), other.address);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.category)) {
        this.category = data().deepCopy(fields()[2].schema(), other.category);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.center)) {
        this.center = data().deepCopy(fields()[3].schema(), other.center);
        fieldSetFlags()[3] = true;
      }
      if (other.hasCenterBuilder()) {
        this.centerBuilder = com.fretron.Model.Location.newBuilder(other.getCenterBuilder());
      }
      if (isValidValue(fields()[4], other.suggestedRadius)) {
        this.suggestedRadius = data().deepCopy(fields()[4].schema(), other.suggestedRadius);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.viewport)) {
        this.viewport = data().deepCopy(fields()[5].schema(), other.viewport);
        fieldSetFlags()[5] = true;
      }
      if (other.hasViewportBuilder()) {
        this.viewportBuilder = com.fretron.Model.ViewPort.newBuilder(other.getViewportBuilder());
      }
      if (isValidValue(fields()[6], other.source)) {
        this.source = data().deepCopy(fields()[6].schema(), other.source);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.addedBy)) {
        this.addedBy = data().deepCopy(fields()[7].schema(), other.addedBy);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.placeId)) {
        this.placeId = data().deepCopy(fields()[8].schema(), other.placeId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.boundary)) {
        this.boundary = data().deepCopy(fields()[9].schema(), other.boundary);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Place instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.Place other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.address)) {
        this.address = data().deepCopy(fields()[1].schema(), other.address);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.category)) {
        this.category = data().deepCopy(fields()[2].schema(), other.category);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.center)) {
        this.center = data().deepCopy(fields()[3].schema(), other.center);
        fieldSetFlags()[3] = true;
      }
      this.centerBuilder = null;
      if (isValidValue(fields()[4], other.suggestedRadius)) {
        this.suggestedRadius = data().deepCopy(fields()[4].schema(), other.suggestedRadius);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.viewport)) {
        this.viewport = data().deepCopy(fields()[5].schema(), other.viewport);
        fieldSetFlags()[5] = true;
      }
      this.viewportBuilder = null;
      if (isValidValue(fields()[6], other.source)) {
        this.source = data().deepCopy(fields()[6].schema(), other.source);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.addedBy)) {
        this.addedBy = data().deepCopy(fields()[7].schema(), other.addedBy);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.placeId)) {
        this.placeId = data().deepCopy(fields()[8].schema(), other.placeId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.boundary)) {
        this.boundary = data().deepCopy(fields()[9].schema(), other.boundary);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.String getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder setAddress(java.lang.String value) {
      validate(fields()[1], value);
      this.address = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder clearAddress() {
      address = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'category' field.
      * @return The value.
      */
    public java.lang.String getCategory() {
      return category;
    }

    /**
      * Sets the value of the 'category' field.
      * @param value The value of 'category'.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder setCategory(java.lang.String value) {
      validate(fields()[2], value);
      this.category = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'category' field has been set.
      * @return True if the 'category' field has been set, false otherwise.
      */
    public boolean hasCategory() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'category' field.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder clearCategory() {
      category = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'center' field.
      * @return The value.
      */
    public com.fretron.Model.Location getCenter() {
      return center;
    }

    /**
      * Sets the value of the 'center' field.
      * @param value The value of 'center'.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder setCenter(com.fretron.Model.Location value) {
      validate(fields()[3], value);
      this.centerBuilder = null;
      this.center = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'center' field has been set.
      * @return True if the 'center' field has been set, false otherwise.
      */
    public boolean hasCenter() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'center' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.Location.Builder getCenterBuilder() {
      if (centerBuilder == null) {
        if (hasCenter()) {
          setCenterBuilder(com.fretron.Model.Location.newBuilder(center));
        } else {
          setCenterBuilder(com.fretron.Model.Location.newBuilder());
        }
      }
      return centerBuilder;
    }

    /**
     * Sets the Builder instance for the 'center' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.Place.Builder setCenterBuilder(com.fretron.Model.Location.Builder value) {
      clearCenter();
      centerBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'center' field has an active Builder instance
     * @return True if the 'center' field has an active Builder instance
     */
    public boolean hasCenterBuilder() {
      return centerBuilder != null;
    }

    /**
      * Clears the value of the 'center' field.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder clearCenter() {
      center = null;
      centerBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'suggestedRadius' field.
      * @return The value.
      */
    public java.lang.Double getSuggestedRadius() {
      return suggestedRadius;
    }

    /**
      * Sets the value of the 'suggestedRadius' field.
      * @param value The value of 'suggestedRadius'.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder setSuggestedRadius(double value) {
      validate(fields()[4], value);
      this.suggestedRadius = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'suggestedRadius' field has been set.
      * @return True if the 'suggestedRadius' field has been set, false otherwise.
      */
    public boolean hasSuggestedRadius() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'suggestedRadius' field.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder clearSuggestedRadius() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'viewport' field.
      * @return The value.
      */
    public com.fretron.Model.ViewPort getViewport() {
      return viewport;
    }

    /**
      * Sets the value of the 'viewport' field.
      * @param value The value of 'viewport'.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder setViewport(com.fretron.Model.ViewPort value) {
      validate(fields()[5], value);
      this.viewportBuilder = null;
      this.viewport = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'viewport' field has been set.
      * @return True if the 'viewport' field has been set, false otherwise.
      */
    public boolean hasViewport() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'viewport' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.fretron.Model.ViewPort.Builder getViewportBuilder() {
      if (viewportBuilder == null) {
        if (hasViewport()) {
          setViewportBuilder(com.fretron.Model.ViewPort.newBuilder(viewport));
        } else {
          setViewportBuilder(com.fretron.Model.ViewPort.newBuilder());
        }
      }
      return viewportBuilder;
    }

    /**
     * Sets the Builder instance for the 'viewport' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.fretron.Model.Place.Builder setViewportBuilder(com.fretron.Model.ViewPort.Builder value) {
      clearViewport();
      viewportBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'viewport' field has an active Builder instance
     * @return True if the 'viewport' field has an active Builder instance
     */
    public boolean hasViewportBuilder() {
      return viewportBuilder != null;
    }

    /**
      * Clears the value of the 'viewport' field.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder clearViewport() {
      viewport = null;
      viewportBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'source' field.
      * @return The value.
      */
    public java.lang.String getSource() {
      return source;
    }

    /**
      * Sets the value of the 'source' field.
      * @param value The value of 'source'.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder setSource(java.lang.String value) {
      validate(fields()[6], value);
      this.source = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'source' field has been set.
      * @return True if the 'source' field has been set, false otherwise.
      */
    public boolean hasSource() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'source' field.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder clearSource() {
      source = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'addedBy' field.
      * @return The value.
      */
    public java.lang.String getAddedBy() {
      return addedBy;
    }

    /**
      * Sets the value of the 'addedBy' field.
      * @param value The value of 'addedBy'.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder setAddedBy(java.lang.String value) {
      validate(fields()[7], value);
      this.addedBy = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'addedBy' field has been set.
      * @return True if the 'addedBy' field has been set, false otherwise.
      */
    public boolean hasAddedBy() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'addedBy' field.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder clearAddedBy() {
      addedBy = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'placeId' field.
      * @return The value.
      */
    public java.lang.String getPlaceId() {
      return placeId;
    }

    /**
      * Sets the value of the 'placeId' field.
      * @param value The value of 'placeId'.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder setPlaceId(java.lang.String value) {
      validate(fields()[8], value);
      this.placeId = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'placeId' field has been set.
      * @return True if the 'placeId' field has been set, false otherwise.
      */
    public boolean hasPlaceId() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'placeId' field.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder clearPlaceId() {
      placeId = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'boundary' field.
      * @return The value.
      */
    public java.util.List<java.util.List<java.util.List<java.lang.Double>>> getBoundary() {
      return boundary;
    }

    /**
      * Sets the value of the 'boundary' field.
      * @param value The value of 'boundary'.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder setBoundary(java.util.List<java.util.List<java.util.List<java.lang.Double>>> value) {
      validate(fields()[9], value);
      this.boundary = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'boundary' field has been set.
      * @return True if the 'boundary' field has been set, false otherwise.
      */
    public boolean hasBoundary() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'boundary' field.
      * @return This builder.
      */
    public com.fretron.Model.Place.Builder clearBoundary() {
      boundary = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public Place build() {
      try {
        Place record = new Place();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.address = fieldSetFlags()[1] ? this.address : (java.lang.String) defaultValue(fields()[1]);
        record.category = fieldSetFlags()[2] ? this.category : (java.lang.String) defaultValue(fields()[2]);
        if (centerBuilder != null) {
          record.center = this.centerBuilder.build();
        } else {
          record.center = fieldSetFlags()[3] ? this.center : (com.fretron.Model.Location) defaultValue(fields()[3]);
        }
        record.suggestedRadius = fieldSetFlags()[4] ? this.suggestedRadius : (java.lang.Double) defaultValue(fields()[4]);
        if (viewportBuilder != null) {
          record.viewport = this.viewportBuilder.build();
        } else {
          record.viewport = fieldSetFlags()[5] ? this.viewport : (com.fretron.Model.ViewPort) defaultValue(fields()[5]);
        }
        record.source = fieldSetFlags()[6] ? this.source : (java.lang.String) defaultValue(fields()[6]);
        record.addedBy = fieldSetFlags()[7] ? this.addedBy : (java.lang.String) defaultValue(fields()[7]);
        record.placeId = fieldSetFlags()[8] ? this.placeId : (java.lang.String) defaultValue(fields()[8]);
        record.boundary = fieldSetFlags()[9] ? this.boundary : (java.util.List<java.util.List<java.util.List<java.lang.Double>>>) defaultValue(fields()[9]);
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
