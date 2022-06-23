package com.fretron.terminalModels

import com.fretron.Model.BuisnessPartner
import com.google.gson.GsonBuilder

data class TripSh(
    var uuid: String?,
    var shipmentNumber: String?,
    var externalId: String?,
    var orgId: String?,
    var fuItemId: String?,
    var stages: MutableList<TripShStage>,
    var tripInfo: ResourceInfo?,
    var containerizationType: String?,
    var partners: List<PartnerInfo>
) {

    constructor() : this(
        null, null, null, null, null, mutableListOf(), null,
        null, emptyList()
    )

    fun toResourceInfo() : ResourceInfo{
        return ResourceInfo().also {
            it.resourceId = uuid
            it.resourceIdentifier = shipmentNumber
            it.resourceType = "SHIPMENT"
            it.resourceExtId = externalId
        }
    }

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}

data class TripShStage(
    var type: String?,
    var terminalId: String?,
    var terminalName: String?,
    var terminalExtId: String?,
    var equipmentsPickups: MutableList<ResourceInfo>,
    var equipmentsDropped: MutableList<ResourceInfo>,
    var consignmentPickups: MutableList<LiteConsignment>,
    var consignmentDropped: MutableList<LiteConsignment>

) {
    constructor() : this(null, null, null, null, mutableListOf(), mutableListOf(), mutableListOf(), mutableListOf())

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
