package com.fretron.freightpricing.v2


import com.fretron.Logger.Log
import com.google.gson.GsonBuilder
import org.json.JSONObject
import javax.ws.rs.NotAllowedException


data class Field(
    var name: String?,
    var valueType: String?,
    var fieldPath: String?,
    var keyType: String?,
    var fieldType: String?,
    var target: String?
)

data class PricingTable(
    var uuid: String?,
    var name: String?,
    var orgId: String?,
    var targetType: String?,
    var secondaryTargets: MutableList<String>, //new
    var validFrom: Long?, //new
    var validTill: Long?, //new
    var queryFormat: TableConditions?,
    var fallbackFieldId: String?,
    var applicableChargeTypes: MutableList<ResultantCharge>?,
    var segments: List<Segment>,
    var status : String?
) {

    constructor() : this(
        uuid = null,
        name = null,
        orgId = null,
        targetType = null,
        secondaryTargets = mutableListOf(),
        validFrom = null,
        validTill = null,
        queryFormat = null,
        fallbackFieldId = null,
        applicableChargeTypes = null,
        segments = mutableListOf(),
        status = PricingTableStatus.Active.toString()
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }

}


data class Segment(
    var uuid: String?,
    var validFrom: Long?,
    var validTill: Long?
) {
    constructor() : this(
        uuid = null,
        validFrom = null,
        validTill = null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }

    fun validateOrThrow() {
        try {
            if (this.uuid == null) {
                throw NotAllowedException("Invalid Segment")
            }

            if (this.validFrom!! < 0 || this.validTill!! < 0) {
                throw NotAllowedException("date value cannot be negative")
            }
            if (this.validFrom!! >= this.validTill!!) {
                throw NotAllowedException("Valid from should be less than valid till")
            }
        } catch (e: Exception) {
            Log.error(Log.exceptionStack(e))
            throw e
        }
    }
}

//segmentNo
data class PricingConditionRecord(
    var priceTableId: String?, // pricing table to which this is linked
    var conditionValues: MutableList<ConditionField>?, // values in query format(table conditions)
    var fieldValueIndex: MutableList<String>?, //indexed values
    var fixedRanges: MutableList<FixedRanges>?, // Ask
    var uuid: String?,
    var orgId: String?,
    var chargeTypes: MutableList<ResultantCharge>?, // charge types values defined while declaring pricing table
    var validFrom: Long?,
    var validTill: Long?,
    var segmentId: String?,
    var status : String?
) {

    constructor() : this(null, null, null, null, null, null, null, null, null, null ,ConditionRecordStatus.Active.toString())

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}

fun MutableList<ConditionField>.ensureDisplayValue() {
    this.forEach {
        if (it.displayValue.isNullOrEmpty() && it.value.isNullOrEmpty().not()) {
            it.displayValue = mutableListOf()
            it.displayValue?.addAll(it.value!!)
            Log.info("after ensure display value ${it.displayValue}")
        }
    }
}

data class ConditionField(
    var valueType: String?, //text/number/date
    var fieldPath: String?, // fleetInfo.vehicle.vehicleRegistrationNumber
    var keyType: String?, //path ??
    var fieldType: String?, //system,custom(treat as custom field), expression
    var fieldName: String?, //name
    var target: String?,
    var valueSelectionType: String?, //single, multiple
    var type: String?, // field/FixedRange/Range (field=textValue, FixedRange: User Input like date & number., Range: Single Range Selection from predefined ranges while define table  )
    var uuid: String?,
    var allowMissing: Boolean?,
    var value: List<String>?, // condition value.
    var displayValue: MutableList<String>?, // used to display value on UI, Field Name will be mapped here...
    var ranges: List<NamedRanges>?  // In case of dynamic continues ranges.(lessThanX, graterThanX, equalToZ) FieldPath == RouteKm  ->  (name , min , max)

) {
    constructor() : this(null, null, null, null, null, null, null, null, null, null, null, null, null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}


data class FixedRanges(
    var uuid: String?,
    var min: Any?,
    var max: Any?,
    var includeMin: Boolean?,
    var excludeMax: Boolean?
) {
    constructor() : this(null, null, null, null, null)

    override fun toString(): String {
        return JSONObject()
            .put("uuid", this.uuid ?: JSONObject.NULL)
            .put("min", this.min ?: JSONObject.NULL)
            .put("max", this.max ?: JSONObject.NULL)
            .put("includeMin", this.includeMin ?: JSONObject.NULL)
            .put("excludeMax", this.excludeMax ?: JSONObject.NULL)
            .toString()
    }
}

data class NamedRanges(
    var name: String?,
    var minValue: String?,
    var maxValue: String?,
    var includeMin: Boolean,
    var excludeMax: Boolean

) {

    constructor() : this(
        name = null,
        minValue = null,
        maxValue = null,
        includeMin = true,
        excludeMax = true
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}

data class TableConditions(
    var type: String?, // AND , OR ,NIN, FIELD  -> FIELD -> subCondition == null/[] , AND/OR -> field ==null , subCondition!=null || != []
    var subCondition: List<TableConditions>?,
    var field: ConditionField?
) {
    constructor() : this(
        type = null,
        subCondition = null,
        field = null
    )

    override fun toString(): String {
        return JSONObject()
            .put("type", this.type ?: JSONObject.NULL)
            .put("subCondition", this.subCondition ?: JSONObject.NULL)
            .put("field", this.field ?: JSONObject.NULL)
            .toString()
    }
}


data class ResultantCharge(
    var uuid: String?,
    var name: String?,
    var isCalculated: Boolean,
    var rate: Double?,
    var rateUnit: String?,
    var amount: Double?,
    var baseValue: Double?,
    var baseUnit : String?,
    var type: String?
) {
    constructor() : this(
        uuid = null,
        name = null,
        isCalculated = false,
        rate = null,
        rateUnit = null,
        amount = null,
        baseValue = null,
        baseUnit = null,
        type = null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}


data class PricingTableMeta(
    var uuid: String?,
    var targets: List<String>,
    var segment: Segment?,
    var fields: List<ConditionField>,
    var fallbackFieldId: String?
) {
    constructor() : this(
        uuid = null,
        targets = mutableListOf(),
        segment = null,
        fields = mutableListOf(),
        fallbackFieldId = null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}


enum class PricingTableStatus{
    Active ,InActive , Deleted
}
enum class ConditionRecordStatus{
    Active ,InActive , Deleted
}


