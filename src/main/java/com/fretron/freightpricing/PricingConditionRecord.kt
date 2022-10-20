package com.fretron.freightpricing

import com.google.gson.GsonBuilder
import org.json.JSONObject

data class FreightChargeMaster(
    var charges: MutableList<FreightCharges>?,
    var orgId: String?,
    var uuid: String?
) {
    constructor() : this(null, null, null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}

data class FreightCharges(
    var name: String?, //name
    var chargeBasisCategory: String?,// rateUnit
    var chargeBasis: String?,
    var chargeBaseValue: Double?, // baseValue
    var calculatedValue: Double? // amount
) {
    constructor() : this(null, null, null, null, null)

    override fun toString(): String {
        return JSONObject()
            .put("name", this.name ?: JSONObject.NULL)
            .put("chargeBasisCategory", this.chargeBasisCategory ?: JSONObject.NULL)
            .put("chargeBasis", this.chargeBasis ?: JSONObject.NULL)
            .put("chargeBaseValue", this.chargeBaseValue ?: JSONObject.NULL)
            .put("calculatedValue", this.calculatedValue ?: JSONObject.NULL)
            .toString()
    }
}

data class PairData(
    var id: String?,
    var key: String?,
    var value: String?,
    var vehicleType: String?,
    var vendor: String?,
    var price: String?
) {
    constructor() : this(null, null, null, null, null, null)

    override fun toString(): String {
        return JSONObject()
            .put("key", this.id ?: JSONObject.NULL)
            .put("key", this.key ?: JSONObject.NULL)
            .put("value", this.value ?: JSONObject.NULL)
            .put("vehicleType", this.vehicleType ?: JSONObject.NULL)
            .put("vendor", this.vendor ?: JSONObject.NULL)
            .put("price", this.price ?: JSONObject.NULL)
            .toString()
    }
}

data class ChargeType(
    var uuid: String?,
    var orgId: String?,
    var name: String?,
    var isCalculated: Boolean,
    var rate: Double?,
    var rateUnit: String?,
    var amount: Double?,
    var baseValue: Double?,
    var baseValueRule: String?,
    var isDeleted: Boolean
) {
    constructor() : this(
        null,null,null,false,null,null,null,null,null,false)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}

