/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SchedulerTask extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2108568359521080257L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SchedulerTask\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"taskId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resourceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resourceType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"action\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"actionData\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"scheduleTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"isAutoSchedulable\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"scheduleType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"timeOfDay\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"weekDays\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"int\"}],\"default\":null},{\"name\":\"interval\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"dayHours\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"int\"}],\"default\":null},{\"name\":\"timesOfDay\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"long\"}],\"default\":null},{\"name\":\"registeredTopics\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String taskId;
  @Deprecated public java.lang.String resourceId;
  @Deprecated public java.lang.String resourceType;
  @Deprecated public java.lang.String action;
  @Deprecated public java.lang.String actionData;
  @Deprecated public java.lang.Long scheduleTime;
  @Deprecated public java.lang.Boolean isAutoSchedulable;
  @Deprecated public java.lang.String scheduleType;
  @Deprecated public java.lang.Long timeOfDay;
  @Deprecated public java.util.List<java.lang.Integer> weekDays;
  @Deprecated public java.lang.Long interval;
  @Deprecated public java.util.List<java.lang.Integer> dayHours;
  @Deprecated public java.util.List<java.lang.Long> timesOfDay;
  @Deprecated public java.util.List<java.lang.String> registeredTopics;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SchedulerTask() {}

  /**
   * All-args constructor.
   * @param taskId The new value for taskId
   * @param resourceId The new value for resourceId
   * @param resourceType The new value for resourceType
   * @param action The new value for action
   * @param actionData The new value for actionData
   * @param scheduleTime The new value for scheduleTime
   * @param isAutoSchedulable The new value for isAutoSchedulable
   * @param scheduleType The new value for scheduleType
   * @param timeOfDay The new value for timeOfDay
   * @param weekDays The new value for weekDays
   * @param interval The new value for interval
   * @param dayHours The new value for dayHours
   * @param timesOfDay The new value for timesOfDay
   * @param registeredTopics The new value for registeredTopics
   */
  public SchedulerTask(java.lang.String taskId, java.lang.String resourceId, java.lang.String resourceType, java.lang.String action, java.lang.String actionData, java.lang.Long scheduleTime, java.lang.Boolean isAutoSchedulable, java.lang.String scheduleType, java.lang.Long timeOfDay, java.util.List<java.lang.Integer> weekDays, java.lang.Long interval, java.util.List<java.lang.Integer> dayHours, java.util.List<java.lang.Long> timesOfDay, java.util.List<java.lang.String> registeredTopics) {
    this.taskId = taskId;
    this.resourceId = resourceId;
    this.resourceType = resourceType;
    this.action = action;
    this.actionData = actionData;
    this.scheduleTime = scheduleTime;
    this.isAutoSchedulable = isAutoSchedulable;
    this.scheduleType = scheduleType;
    this.timeOfDay = timeOfDay;
    this.weekDays = weekDays;
    this.interval = interval;
    this.dayHours = dayHours;
    this.timesOfDay = timesOfDay;
    this.registeredTopics = registeredTopics;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return taskId;
    case 1: return resourceId;
    case 2: return resourceType;
    case 3: return action;
    case 4: return actionData;
    case 5: return scheduleTime;
    case 6: return isAutoSchedulable;
    case 7: return scheduleType;
    case 8: return timeOfDay;
    case 9: return weekDays;
    case 10: return interval;
    case 11: return dayHours;
    case 12: return timesOfDay;
    case 13: return registeredTopics;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: taskId = (java.lang.String)value$; break;
    case 1: resourceId = (java.lang.String)value$; break;
    case 2: resourceType = (java.lang.String)value$; break;
    case 3: action = (java.lang.String)value$; break;
    case 4: actionData = (java.lang.String)value$; break;
    case 5: scheduleTime = (java.lang.Long)value$; break;
    case 6: isAutoSchedulable = (java.lang.Boolean)value$; break;
    case 7: scheduleType = (java.lang.String)value$; break;
    case 8: timeOfDay = (java.lang.Long)value$; break;
    case 9: weekDays = (java.util.List<java.lang.Integer>)value$; break;
    case 10: interval = (java.lang.Long)value$; break;
    case 11: dayHours = (java.util.List<java.lang.Integer>)value$; break;
    case 12: timesOfDay = (java.util.List<java.lang.Long>)value$; break;
    case 13: registeredTopics = (java.util.List<java.lang.String>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'taskId' field.
   * @return The value of the 'taskId' field.
   */
  public java.lang.String getTaskId() {
    return taskId;
  }

  /**
   * Sets the value of the 'taskId' field.
   * @param value the value to set.
   */
  public void setTaskId(java.lang.String value) {
    this.taskId = value;
  }

  /**
   * Gets the value of the 'resourceId' field.
   * @return The value of the 'resourceId' field.
   */
  public java.lang.String getResourceId() {
    return resourceId;
  }

  /**
   * Sets the value of the 'resourceId' field.
   * @param value the value to set.
   */
  public void setResourceId(java.lang.String value) {
    this.resourceId = value;
  }

  /**
   * Gets the value of the 'resourceType' field.
   * @return The value of the 'resourceType' field.
   */
  public java.lang.String getResourceType() {
    return resourceType;
  }

  /**
   * Sets the value of the 'resourceType' field.
   * @param value the value to set.
   */
  public void setResourceType(java.lang.String value) {
    this.resourceType = value;
  }

  /**
   * Gets the value of the 'action' field.
   * @return The value of the 'action' field.
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Sets the value of the 'action' field.
   * @param value the value to set.
   */
  public void setAction(java.lang.String value) {
    this.action = value;
  }

  /**
   * Gets the value of the 'actionData' field.
   * @return The value of the 'actionData' field.
   */
  public java.lang.String getActionData() {
    return actionData;
  }

  /**
   * Sets the value of the 'actionData' field.
   * @param value the value to set.
   */
  public void setActionData(java.lang.String value) {
    this.actionData = value;
  }

  /**
   * Gets the value of the 'scheduleTime' field.
   * @return The value of the 'scheduleTime' field.
   */
  public java.lang.Long getScheduleTime() {
    return scheduleTime;
  }

  /**
   * Sets the value of the 'scheduleTime' field.
   * @param value the value to set.
   */
  public void setScheduleTime(java.lang.Long value) {
    this.scheduleTime = value;
  }

  /**
   * Gets the value of the 'isAutoSchedulable' field.
   * @return The value of the 'isAutoSchedulable' field.
   */
  public java.lang.Boolean getIsAutoSchedulable() {
    return isAutoSchedulable;
  }

  /**
   * Sets the value of the 'isAutoSchedulable' field.
   * @param value the value to set.
   */
  public void setIsAutoSchedulable(java.lang.Boolean value) {
    this.isAutoSchedulable = value;
  }

  /**
   * Gets the value of the 'scheduleType' field.
   * @return The value of the 'scheduleType' field.
   */
  public java.lang.String getScheduleType() {
    return scheduleType;
  }

  /**
   * Sets the value of the 'scheduleType' field.
   * @param value the value to set.
   */
  public void setScheduleType(java.lang.String value) {
    this.scheduleType = value;
  }

  /**
   * Gets the value of the 'timeOfDay' field.
   * @return The value of the 'timeOfDay' field.
   */
  public java.lang.Long getTimeOfDay() {
    return timeOfDay;
  }

  /**
   * Sets the value of the 'timeOfDay' field.
   * @param value the value to set.
   */
  public void setTimeOfDay(java.lang.Long value) {
    this.timeOfDay = value;
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
   * Gets the value of the 'interval' field.
   * @return The value of the 'interval' field.
   */
  public java.lang.Long getInterval() {
    return interval;
  }

  /**
   * Sets the value of the 'interval' field.
   * @param value the value to set.
   */
  public void setInterval(java.lang.Long value) {
    this.interval = value;
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
   * Gets the value of the 'registeredTopics' field.
   * @return The value of the 'registeredTopics' field.
   */
  public java.util.List<java.lang.String> getRegisteredTopics() {
    return registeredTopics;
  }

  /**
   * Sets the value of the 'registeredTopics' field.
   * @param value the value to set.
   */
  public void setRegisteredTopics(java.util.List<java.lang.String> value) {
    this.registeredTopics = value;
  }

  /**
   * Creates a new SchedulerTask RecordBuilder.
   * @return A new SchedulerTask RecordBuilder
   */
  public static com.fretron.Model.SchedulerTask.Builder newBuilder() {
    return new com.fretron.Model.SchedulerTask.Builder();
  }

  /**
   * Creates a new SchedulerTask RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SchedulerTask RecordBuilder
   */
  public static com.fretron.Model.SchedulerTask.Builder newBuilder(com.fretron.Model.SchedulerTask.Builder other) {
    return new com.fretron.Model.SchedulerTask.Builder(other);
  }

  /**
   * Creates a new SchedulerTask RecordBuilder by copying an existing SchedulerTask instance.
   * @param other The existing instance to copy.
   * @return A new SchedulerTask RecordBuilder
   */
  public static com.fretron.Model.SchedulerTask.Builder newBuilder(com.fretron.Model.SchedulerTask other) {
    return new com.fretron.Model.SchedulerTask.Builder(other);
  }

  /**
   * RecordBuilder for SchedulerTask instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SchedulerTask>
    implements org.apache.avro.data.RecordBuilder<SchedulerTask> {

    private java.lang.String taskId;
    private java.lang.String resourceId;
    private java.lang.String resourceType;
    private java.lang.String action;
    private java.lang.String actionData;
    private java.lang.Long scheduleTime;
    private java.lang.Boolean isAutoSchedulable;
    private java.lang.String scheduleType;
    private java.lang.Long timeOfDay;
    private java.util.List<java.lang.Integer> weekDays;
    private java.lang.Long interval;
    private java.util.List<java.lang.Integer> dayHours;
    private java.util.List<java.lang.Long> timesOfDay;
    private java.util.List<java.lang.String> registeredTopics;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.SchedulerTask.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.taskId)) {
        this.taskId = data().deepCopy(fields()[0].schema(), other.taskId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.resourceId)) {
        this.resourceId = data().deepCopy(fields()[1].schema(), other.resourceId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[2].schema(), other.resourceType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.action)) {
        this.action = data().deepCopy(fields()[3].schema(), other.action);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.actionData)) {
        this.actionData = data().deepCopy(fields()[4].schema(), other.actionData);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.scheduleTime)) {
        this.scheduleTime = data().deepCopy(fields()[5].schema(), other.scheduleTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.isAutoSchedulable)) {
        this.isAutoSchedulable = data().deepCopy(fields()[6].schema(), other.isAutoSchedulable);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.scheduleType)) {
        this.scheduleType = data().deepCopy(fields()[7].schema(), other.scheduleType);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.timeOfDay)) {
        this.timeOfDay = data().deepCopy(fields()[8].schema(), other.timeOfDay);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.weekDays)) {
        this.weekDays = data().deepCopy(fields()[9].schema(), other.weekDays);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.interval)) {
        this.interval = data().deepCopy(fields()[10].schema(), other.interval);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.dayHours)) {
        this.dayHours = data().deepCopy(fields()[11].schema(), other.dayHours);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.timesOfDay)) {
        this.timesOfDay = data().deepCopy(fields()[12].schema(), other.timesOfDay);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.registeredTopics)) {
        this.registeredTopics = data().deepCopy(fields()[13].schema(), other.registeredTopics);
        fieldSetFlags()[13] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing SchedulerTask instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.SchedulerTask other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.taskId)) {
        this.taskId = data().deepCopy(fields()[0].schema(), other.taskId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.resourceId)) {
        this.resourceId = data().deepCopy(fields()[1].schema(), other.resourceId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[2].schema(), other.resourceType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.action)) {
        this.action = data().deepCopy(fields()[3].schema(), other.action);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.actionData)) {
        this.actionData = data().deepCopy(fields()[4].schema(), other.actionData);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.scheduleTime)) {
        this.scheduleTime = data().deepCopy(fields()[5].schema(), other.scheduleTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.isAutoSchedulable)) {
        this.isAutoSchedulable = data().deepCopy(fields()[6].schema(), other.isAutoSchedulable);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.scheduleType)) {
        this.scheduleType = data().deepCopy(fields()[7].schema(), other.scheduleType);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.timeOfDay)) {
        this.timeOfDay = data().deepCopy(fields()[8].schema(), other.timeOfDay);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.weekDays)) {
        this.weekDays = data().deepCopy(fields()[9].schema(), other.weekDays);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.interval)) {
        this.interval = data().deepCopy(fields()[10].schema(), other.interval);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.dayHours)) {
        this.dayHours = data().deepCopy(fields()[11].schema(), other.dayHours);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.timesOfDay)) {
        this.timesOfDay = data().deepCopy(fields()[12].schema(), other.timesOfDay);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.registeredTopics)) {
        this.registeredTopics = data().deepCopy(fields()[13].schema(), other.registeredTopics);
        fieldSetFlags()[13] = true;
      }
    }

    /**
      * Gets the value of the 'taskId' field.
      * @return The value.
      */
    public java.lang.String getTaskId() {
      return taskId;
    }

    /**
      * Sets the value of the 'taskId' field.
      * @param value The value of 'taskId'.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder setTaskId(java.lang.String value) {
      validate(fields()[0], value);
      this.taskId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'taskId' field has been set.
      * @return True if the 'taskId' field has been set, false otherwise.
      */
    public boolean hasTaskId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'taskId' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearTaskId() {
      taskId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'resourceId' field.
      * @return The value.
      */
    public java.lang.String getResourceId() {
      return resourceId;
    }

    /**
      * Sets the value of the 'resourceId' field.
      * @param value The value of 'resourceId'.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder setResourceId(java.lang.String value) {
      validate(fields()[1], value);
      this.resourceId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'resourceId' field has been set.
      * @return True if the 'resourceId' field has been set, false otherwise.
      */
    public boolean hasResourceId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'resourceId' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearResourceId() {
      resourceId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'resourceType' field.
      * @return The value.
      */
    public java.lang.String getResourceType() {
      return resourceType;
    }

    /**
      * Sets the value of the 'resourceType' field.
      * @param value The value of 'resourceType'.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder setResourceType(java.lang.String value) {
      validate(fields()[2], value);
      this.resourceType = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'resourceType' field has been set.
      * @return True if the 'resourceType' field has been set, false otherwise.
      */
    public boolean hasResourceType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'resourceType' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearResourceType() {
      resourceType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'action' field.
      * @return The value.
      */
    public java.lang.String getAction() {
      return action;
    }

    /**
      * Sets the value of the 'action' field.
      * @param value The value of 'action'.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder setAction(java.lang.String value) {
      validate(fields()[3], value);
      this.action = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'action' field has been set.
      * @return True if the 'action' field has been set, false otherwise.
      */
    public boolean hasAction() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'action' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearAction() {
      action = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'actionData' field.
      * @return The value.
      */
    public java.lang.String getActionData() {
      return actionData;
    }

    /**
      * Sets the value of the 'actionData' field.
      * @param value The value of 'actionData'.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder setActionData(java.lang.String value) {
      validate(fields()[4], value);
      this.actionData = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'actionData' field has been set.
      * @return True if the 'actionData' field has been set, false otherwise.
      */
    public boolean hasActionData() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'actionData' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearActionData() {
      actionData = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'scheduleTime' field.
      * @return The value.
      */
    public java.lang.Long getScheduleTime() {
      return scheduleTime;
    }

    /**
      * Sets the value of the 'scheduleTime' field.
      * @param value The value of 'scheduleTime'.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder setScheduleTime(java.lang.Long value) {
      validate(fields()[5], value);
      this.scheduleTime = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'scheduleTime' field has been set.
      * @return True if the 'scheduleTime' field has been set, false otherwise.
      */
    public boolean hasScheduleTime() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'scheduleTime' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearScheduleTime() {
      scheduleTime = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'isAutoSchedulable' field.
      * @return The value.
      */
    public java.lang.Boolean getIsAutoSchedulable() {
      return isAutoSchedulable;
    }

    /**
      * Sets the value of the 'isAutoSchedulable' field.
      * @param value The value of 'isAutoSchedulable'.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder setIsAutoSchedulable(java.lang.Boolean value) {
      validate(fields()[6], value);
      this.isAutoSchedulable = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'isAutoSchedulable' field has been set.
      * @return True if the 'isAutoSchedulable' field has been set, false otherwise.
      */
    public boolean hasIsAutoSchedulable() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'isAutoSchedulable' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearIsAutoSchedulable() {
      isAutoSchedulable = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'scheduleType' field.
      * @return The value.
      */
    public java.lang.String getScheduleType() {
      return scheduleType;
    }

    /**
      * Sets the value of the 'scheduleType' field.
      * @param value The value of 'scheduleType'.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder setScheduleType(java.lang.String value) {
      validate(fields()[7], value);
      this.scheduleType = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'scheduleType' field has been set.
      * @return True if the 'scheduleType' field has been set, false otherwise.
      */
    public boolean hasScheduleType() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'scheduleType' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearScheduleType() {
      scheduleType = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'timeOfDay' field.
      * @return The value.
      */
    public java.lang.Long getTimeOfDay() {
      return timeOfDay;
    }

    /**
      * Sets the value of the 'timeOfDay' field.
      * @param value The value of 'timeOfDay'.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder setTimeOfDay(java.lang.Long value) {
      validate(fields()[8], value);
      this.timeOfDay = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'timeOfDay' field has been set.
      * @return True if the 'timeOfDay' field has been set, false otherwise.
      */
    public boolean hasTimeOfDay() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'timeOfDay' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearTimeOfDay() {
      timeOfDay = null;
      fieldSetFlags()[8] = false;
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
    public com.fretron.Model.SchedulerTask.Builder setWeekDays(java.util.List<java.lang.Integer> value) {
      validate(fields()[9], value);
      this.weekDays = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'weekDays' field has been set.
      * @return True if the 'weekDays' field has been set, false otherwise.
      */
    public boolean hasWeekDays() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'weekDays' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearWeekDays() {
      weekDays = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'interval' field.
      * @return The value.
      */
    public java.lang.Long getInterval() {
      return interval;
    }

    /**
      * Sets the value of the 'interval' field.
      * @param value The value of 'interval'.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder setInterval(java.lang.Long value) {
      validate(fields()[10], value);
      this.interval = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'interval' field has been set.
      * @return True if the 'interval' field has been set, false otherwise.
      */
    public boolean hasInterval() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'interval' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearInterval() {
      interval = null;
      fieldSetFlags()[10] = false;
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
    public com.fretron.Model.SchedulerTask.Builder setDayHours(java.util.List<java.lang.Integer> value) {
      validate(fields()[11], value);
      this.dayHours = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'dayHours' field has been set.
      * @return True if the 'dayHours' field has been set, false otherwise.
      */
    public boolean hasDayHours() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'dayHours' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearDayHours() {
      dayHours = null;
      fieldSetFlags()[11] = false;
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
    public com.fretron.Model.SchedulerTask.Builder setTimesOfDay(java.util.List<java.lang.Long> value) {
      validate(fields()[12], value);
      this.timesOfDay = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'timesOfDay' field has been set.
      * @return True if the 'timesOfDay' field has been set, false otherwise.
      */
    public boolean hasTimesOfDay() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'timesOfDay' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearTimesOfDay() {
      timesOfDay = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'registeredTopics' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getRegisteredTopics() {
      return registeredTopics;
    }

    /**
      * Sets the value of the 'registeredTopics' field.
      * @param value The value of 'registeredTopics'.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder setRegisteredTopics(java.util.List<java.lang.String> value) {
      validate(fields()[13], value);
      this.registeredTopics = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'registeredTopics' field has been set.
      * @return True if the 'registeredTopics' field has been set, false otherwise.
      */
    public boolean hasRegisteredTopics() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'registeredTopics' field.
      * @return This builder.
      */
    public com.fretron.Model.SchedulerTask.Builder clearRegisteredTopics() {
      registeredTopics = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    public SchedulerTask build() {
      try {
        SchedulerTask record = new SchedulerTask();
        record.taskId = fieldSetFlags()[0] ? this.taskId : (java.lang.String) defaultValue(fields()[0]);
        record.resourceId = fieldSetFlags()[1] ? this.resourceId : (java.lang.String) defaultValue(fields()[1]);
        record.resourceType = fieldSetFlags()[2] ? this.resourceType : (java.lang.String) defaultValue(fields()[2]);
        record.action = fieldSetFlags()[3] ? this.action : (java.lang.String) defaultValue(fields()[3]);
        record.actionData = fieldSetFlags()[4] ? this.actionData : (java.lang.String) defaultValue(fields()[4]);
        record.scheduleTime = fieldSetFlags()[5] ? this.scheduleTime : (java.lang.Long) defaultValue(fields()[5]);
        record.isAutoSchedulable = fieldSetFlags()[6] ? this.isAutoSchedulable : (java.lang.Boolean) defaultValue(fields()[6]);
        record.scheduleType = fieldSetFlags()[7] ? this.scheduleType : (java.lang.String) defaultValue(fields()[7]);
        record.timeOfDay = fieldSetFlags()[8] ? this.timeOfDay : (java.lang.Long) defaultValue(fields()[8]);
        record.weekDays = fieldSetFlags()[9] ? this.weekDays : (java.util.List<java.lang.Integer>) defaultValue(fields()[9]);
        record.interval = fieldSetFlags()[10] ? this.interval : (java.lang.Long) defaultValue(fields()[10]);
        record.dayHours = fieldSetFlags()[11] ? this.dayHours : (java.util.List<java.lang.Integer>) defaultValue(fields()[11]);
        record.timesOfDay = fieldSetFlags()[12] ? this.timesOfDay : (java.util.List<java.lang.Long>) defaultValue(fields()[12]);
        record.registeredTopics = fieldSetFlags()[13] ? this.registeredTopics : (java.util.List<java.lang.String>) defaultValue(fields()[13]);
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
