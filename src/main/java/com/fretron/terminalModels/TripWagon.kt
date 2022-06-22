package com.fretron.terminalModels

import com.google.gson.GsonBuilder


data class TripWagon(
    var wagonNumber: String?,
    var wagonType: String?,
    var wagonOwner: String?,
    var wagonCapacityMT: Double?,
    var wagonCapacityCFT: Double?,
    var wagonId: String?,
    var utilization : Double,
    var originTerminal: ResourceInfo?,
    var destinationTerminal: ResourceInfo?,
    var tripInfo: ResourceInfo?,
    var consignments: MutableList<LiteConsignment>,
    var shipmentInfo: ResourceInfo?,
    var currentAssignedResource: ResourceInfo?,
    var nextPossibleActions: List<String>?,
    var isSealed: Boolean?,
    var sealNumber: String?,
    var status: String?,
    var orgId: String?
) {

    constructor() : this(
        null, null, null, null, null, null ,0.0,null, null, null,
        mutableListOf(), null, null, null, null, null, null, null

    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}


enum class TripWagonStatus {
    Active, InActive
}