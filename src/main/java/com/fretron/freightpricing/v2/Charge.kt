package com.fretron.freightpricing.v2

import com.fretron.Model.Materials
import com.fretron.terminalModels.ResourceInfo
import com.google.gson.GsonBuilder


data class ChartsOfAccountLite(
    var uuid : String?,
    var name : String?,
    var accountGroup : String?,
    var type : String?,
    var accountPath : List<String>?
) {
    constructor() : this(null,null,null,null, mutableListOf())

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}

data class Charge(
    var uuid: String?,
    var orgId: String?,
    var name: String?,
    var isCalculated: Boolean,
    var rate: Double?,
    var rateUnit: String?,
    var amount: Double?,
    var baseValue: Double?,
    var baseValueRule: String?,
    var status: String?,
    var chartsOfAccount: ChartsOfAccountLite?,
    var chargeCode : String?,
    var postingType : String?,
    var category : String?,
    var applicableFor:String?,
    var billingType:MutableList<String>, // not mentioned in story
    var roundingRule : String?,
    var postingNature : String, //Positive, Negative
    var allowedServices : MutableList<Materials>,
    var gmLevel : String?,// not know right now
    var arAPChargeType: ResourceInfo?,
    var reimbursementChargeType: ResourceInfo?
){
    constructor(): this(
        uuid=null,
        orgId=null,
        name=null,
        isCalculated=false,
        rate=null,
        rateUnit=null,
        amount=null,
        baseValue=null,
        baseValueRule=null,
        status=null,
        chartsOfAccount=null,
        chargeCode=null,
        postingType=null,
        category=null,
        applicableFor=null,
        billingType= mutableListOf(),
        roundingRule=null,
        postingNature= "Positive",
        allowedServices= mutableListOf(),
        gmLevel=null,
        arAPChargeType=null,
        reimbursementChargeType=null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}
