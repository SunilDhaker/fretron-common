package com.fretron.terminalModels

import com.fretron.Model.BuisnessPartner
import com.google.gson.GsonBuilder

data class TripSh(
    var uuid: String?,
    var shipmentNumber: String?,
    var externalId: String?,
    var orgId : String? ,
    var fuItemId: String?,
    var stages: MutableList<TripShStage>,
    var tripInfo: ResourceInfo?,
    var containerizationType: String?,
    var partners : List<PartnerInfo>
) {

    constructor() : this(
        null, null , null, null, null, mutableListOf(), null,
        null , emptyList()
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}

data class TripShStage(
    var type: String?,
    var terminalId: String?,
    var terminalName: String?,
    var terminalExtId: String?,
    var equipmentsPickups: List<ResourceInfo>,
    var equipmentsDropped: List<ResourceInfo>,
    var consignmentPickups: List<LiteConsignment>,
    var consignmentDropped: List<LiteConsignment>

) {
    constructor() : this(null, null, null, null, emptyList(), emptyList(), emptyList(), emptyList())

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}

data class PartnerInfo(var role: String?, var partner: BuisnessPartner?) {
    constructor() : this(null, null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}
