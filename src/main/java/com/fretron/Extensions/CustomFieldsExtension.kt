package com.fretron.Extensions

import com.fretron.Model.CustomFields
import com.fretron.Model.LiteCustomFields
import com.fretron.RecalculateIndexValue

fun CustomFields.toLite(){
    val liteCf = LiteCustomFields()
    liteCf.setDefinitionId(this.getUuid())
    liteCf.setIndexedValue(this.getIndexedValue())
    liteCf.setValueType(this.getValueType())
    liteCf.setValue(this.getValue())
    liteCf.setFieldKey(this.getFieldKey())
    liteCf.setFieldType(this.getFieldType())
}

fun LiteCustomFields.RecalculateIndexValue(){
    val cf  = CustomFields()
    cf.setValue(this.getValue())
    cf.setFieldKey(this.getFieldKey())
    cf.setFieldType(this.getFieldType())
    cf.setValueType(this.getValueType())
    cf.RecalculateIndexValue()
    this.setIndexedValue(cf.getIndexedValue())
}