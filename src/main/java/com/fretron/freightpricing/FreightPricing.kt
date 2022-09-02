package com.fretron.freightpricing

import com.google.gson.GsonBuilder
import org.json.JSONArray
import org.json.JSONObject

data class  FreightPricing(
    var uuid: String?,
    var queryFormat: FreightCondition?,
    var name: String?,
    var orgId: String?,
    var targetTypes: String?,
    var applicableChargeType: MutableList<FreightCharges>?,
    var allowAnyExceptForField:String?,
    var applicableChargeTypes: MutableList<ChargeType>?
) {

    constructor(): this(null,null,null,null,null,null,null,null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }

}

data class PricingConditionRecord(
    var priceTableId: String?,
    var conditionValues: MutableList<ConditionField>?,
    var fieldValueIndex: MutableList<String>?,
    var fixedRanges : MutableList<FixedRanges>?,
    var charges: MutableList<FreightCharges>?,
    var uuid: String?,
    var orgId: String?,
    var chargeTypes : MutableList<ChargeType>?
) {

    constructor(): this(null,null,null,null,null,null,null,null)

    override fun toString(): String {
        return JSONObject()
            .put("priceTableId",this.priceTableId ?: JSONObject.NULL)
            .put("conditionValues",if(this.conditionValues != null) JSONArray(this.conditionValues.toString()) else JSONArray())
            .put("fieldValueIndex",this.fieldValueIndex ?: JSONObject.NULL)
            .put("fixedRanges",if(this.fixedRanges!=null) JSONArray(this.fixedRanges.toString()) else JSONArray())
            .put("charges",if(this.charges!=null) JSONArray(this.charges.toString())  else JSONArray())
            .put("uuid",this.uuid ?: JSONObject.NULL)
            .put("orgId",this.orgId ?: JSONObject.NULL)
            .put("chargeTypes",if(this.chargeTypes!=null) JSONArray(this.chargeTypes.toString()) else JSONArray())
            .toString()
    }
}

data class ConditionField
    (
    var type: String?, // Fixed
    var fieldPath: String?, // Origin  , Destination , RouteKm
    var uuid: String?,
    var allowMissing: Boolean?,
    var value: List<String>?, // null
    var displayValue: MutableList<String>?, // null
    var ranges: List<NamedRanges>?  // In case FieldPath == RouteKm  ->  (name , min , max)
) {

    constructor(): this(null,null,null,null,null,null,null)

    override fun toString(): String {
        return JSONObject()
            .put("type",this.type ?: JSONObject.NULL)
            .put("fieldPath",this.fieldPath ?: JSONObject.NULL)
            .put("uuid",this.uuid ?: JSONObject.NULL)
            .put("allowMissing",this.allowMissing ?: JSONObject.NULL)
            .put("value",this.value ?: JSONObject.NULL)
            .put("displayValue",if(this.displayValue != null) JSONArray(this.displayValue.toString()) else JSONArray())
            .put("ranges",this.ranges ?: JSONObject.NULL)
            .toString()
    }
}
data class FixedRanges(
    var uuid: String?,
    var min: Any?,
    var max: Any?
){
    constructor():this(null,null,null)
    override fun toString(): String {
        return JSONObject()
            .put("uuid",this.uuid ?: JSONObject.NULL)
            .put("min",this.min ?: JSONObject.NULL)
            .put("max",this.max ?: JSONObject.NULL)
            .toString()
    }
}
data class NamedRanges(
    var name: String?,
    var minValue: String?,
    var maxValue: String?
) {

    constructor(): this(null,null,null)

    override fun toString(): String {
        return JSONObject()
            .put("name",this.name ?: JSONObject.NULL)
            .put("minValue",this.minValue ?: JSONObject.NULL)
            .put("maxValue",this.maxValue ?: JSONObject.NULL)
            .toString()
    }
}

data class FreightCondition(
    var type: String?, // AND , OR , FIELD  -> FIELD -> subCondition == null/[] , AND/OR -> field ==null , subCondition!=null || != []
    var subCondition: List<FreightCondition>?,
    var field: ConditionField?
) {
    constructor(): this(null,null,null)

    override fun toString(): String {
        return JSONObject()
            .put("type",this.type ?: JSONObject.NULL)
            .put("subCondition",this.subCondition ?: JSONObject.NULL)
            .put("field",this.field ?: JSONObject.NULL)
            .toString()
    }
}

