package com.fretron

import com.fretron.Model.CustomFields
import org.json.JSONArray
import org.json.JSONObject


fun CustomFields.RecalculateIndexValue() {
    val indexedField = ArrayList<String>();
    val valueType = this.getValueType()
    try {
        when (valueType) {
            "string" -> {
                if (this.getFieldKey() != null && this.getFieldKey() != "") {
                    indexedField.add(this.getFieldKey() + "_" + this.getValue())
                    this.setIndexedValue(indexedField)
                }
            }
            "json" -> {

                if (this.getFieldKey() != null && this.getFieldKey() != "") {
                    val jsonObject = JSONObject(this.getValue())
                    val keys = jsonObject.keys()
                    keys.forEach { item ->
                        if (jsonObject.getString(item) != null && jsonObject.getString(item) != "") {
                            indexedField.add(this.getFieldKey() + "_" + item + "_" + jsonObject.getString(item))
                        }
                    }
                    this.setIndexedValue(indexedField)
                }
            }
            "arrayOfString" -> {
                if (this.getFieldKey() != null && this.getFieldKey() != "") {
                    val keys = JSONArray(this.getValue())
                    keys.forEach { item ->
                        indexedField.add(this.getFieldKey() + "_" + item)
                    }
                    this.setIndexedValue(indexedField)
                }
            }
            "arrayOfJson" -> {
                if (this.getFieldKey() != null && this.getFieldKey() != "") {
                    val keys = JSONArray(this.getValue())
                    keys.forEach { item ->
                        val jsonObject = JSONObject(item.toString())
                        val jsonkeys = jsonObject.keys()
                        jsonkeys.forEach { element ->
                            if (jsonObject.getString(element) != null && jsonObject.getString(element) != "" && jsonObject.getString(element).length < 30) {
                                indexedField.add(this.getFieldKey() + "_" + element + "_" + jsonObject.getString(element))
                            }
                        }
                    }
                    this.setIndexedValue(indexedField)
                }
            }

        }

    } catch (e: Exception) {
        println(e.message)
    }


}

