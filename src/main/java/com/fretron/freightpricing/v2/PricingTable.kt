package com.fretron.freightpricing.v2


import com.fretron.Logger.Log
import com.google.gson.GsonBuilder
import org.json.JSONObject
import javax.ws.rs.NotAllowedException


data class Field(
    var displayName: String?,
    var key: String?, //path
    var keyType: String?, //exp
    var valueType: String?, //text,number,date
    var entity: String?, //system, custom, scripted
    var target: String?,
    var supportedTypes : List<String>  //Text,FixedRange,NamedRange
)

data class PricingTable(
    var uuid: String?,
    var name: String?,
    var orgId: String?,
    var target: String?,
    var secondaryTargets: MutableList<String>, //new
    var validFrom: Long?, //new
    var validTill: Long?, //new
    var queryFormat: TableConditions?,
    var fallbackFieldId: String?,
    var applicableCharges: MutableList<ResultantCharge>?,
    var segments: List<Segment>
) {

    constructor() : this(
        uuid = null,
        name = null,
        orgId = null,
        target = null,
        secondaryTargets = mutableListOf(),
        validFrom = null,
        validTill = null,
        queryFormat = null,
        fallbackFieldId = null,
        applicableCharges = null,
        segments = mutableListOf()
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
    var conditionValues: List<ConditionField>?, // values in query format(table conditions)
    var fieldValueIndex: List<String>?, //indexed values
    var fixedRanges: List<FixedRanges>?, // Ask
    var uuid: String?,
    var orgId: String?,
    var chargeTypes: List<ResultantCharge>?, // charge types values defined while declaring pricing table
    var validFrom: Long?,
    var validTill: Long?,
    var segmentId: String?
) {

    constructor() : this(null, null, null, null, null, null, null, null, null, null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}



data class ConditionField(
    var key: String?, // fleetInfo.vehicle.vehicleRegistrationNumber
    var keyType: String?,
    var valueType: String?, //text/number/date
    var entity: String?, //system,custom(treat as custom field), expression
    var fieldName: String?, //name
    var target: String?,
    var valueSelectionType: String?, //single, multiple
    var type: String?, // field/FixedRange/Range (field=textValue, FixedRange: User Input like date & number., Range: Single Range Selection from predefined ranges while define table  )
    var uuid: String?,
    var allowMissing: Boolean?,
    var values: List<String>?, // condition value.
    var valueDisplayNames: List<String>?, // used to display value on UI, Field Name will be mapped here...
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
    var baseValueRule: String?,
    var isDeleted: Boolean,
    var scaleApplicable: Boolean?, //only allowed when charge type is fixed
    var capValue: Double?,
    var scaleConditionId: String?, //Used to select condition capValue
    var scaleValue: Double? //
) {
    constructor() : this(
        uuid = null,
        name = null,
        isCalculated = false,
        rate = null, rateUnit = null,
        amount = null,
        baseValue = null,
        baseValueRule = null,
        isDeleted = false,
        scaleApplicable = null,
        capValue = null,
        scaleConditionId = null,
        scaleValue = null
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



