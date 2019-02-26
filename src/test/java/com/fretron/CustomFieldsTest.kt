package com.fretron

import com.fretron.Model.CustomFields
import org.json.JSONObject

fun main(args: Array<String>) {
//    @todo case1
    val customFields1=CustomFields()
    customFields1.setFieldKey("name")
    customFields1.setValue("Akash")
    customFields1.setValueType("string")
    customFields1.RecalculateIndexValue()
    println("String Value :${customFields1.getIndexedValue().toString()}")

//    @todo case2
    val json=JSONObject()
    json.put("line1","CJDarcl Logistics")
    json.put("line2","Darcl House Plot No 55")
    json.put("city","gurgram")
    json.put("state","Haryana")
    json.put("pincode","221100")
    val customFields2=CustomFields()
    customFields2.setFieldKey("address")
    customFields2.setValue(json.toString())
    customFields2.setValueType("json")
    customFields2.RecalculateIndexValue()
    println("JSON Value :${customFields2.getIndexedValue().toString()}")

    //    @todo case3
    val list =ArrayList<String>()
    list.add("Rope")
    list.add("Tripal")
    list.add("Wier")
    val customFields3=CustomFields()
    customFields3.setFieldKey("equipment")
    customFields3.setValue(list.toString())
    customFields3.setValueType("arrayOfString")
    customFields3.RecalculateIndexValue()
    println("Array Of String Value :${customFields3.getIndexedValue().toString()}")

//    @todo case4
    val json1=JSONObject()
    json1.put("line1","CJDarcl Logistics")
    json1.put("line2","Darcl House Plot No 55")
    json1.put("city","gurgram")
    json1.put("state","Haryana")
    json1.put("pincode","221100")
    val json2=JSONObject()
    json2.put("line1","huda metro station,sector 29, gurugram, haryana")
    json2.put("line2","Darcl House Plot No 55")
    json2.put("city","gurugram")
    json2.put("state","Haryana")
    json2.put("pincode","221100")
    val list2 =ArrayList<JSONObject>()
    list2.add(json1)
    list2.add(json2)

    val customFields4=CustomFields()
    customFields4.setFieldKey("docoment")
    customFields4.setValue(list2.toString())
    customFields4.setValueType("arrayOfJson")
    customFields4.RecalculateIndexValue()
    println("Array Of JSON Value :${customFields4.getIndexedValue().toString()}")
}