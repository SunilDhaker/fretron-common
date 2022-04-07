package com.fretron.terminalModels

import com.google.gson.GsonBuilder

data class TrainContainer(
    var containerNumber: String?,
    var containerId: String?,
    var originTerminal: ResourceInfo?,
    var destinationTerminal: ResourceInfo?,
    var tripInfo: ResourceInfo?,
    var consignments: List<ResourceInfo>?,
    var shipmentInfo: ResourceInfo?,
    var currentAssignedResource: ResourceInfo?,
    var nextPossibleActions: List<String>?,
    var urgencyType: String?
) {

    constructor() : this(
        null, null, null, null, null, null,
        null, null, null, null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}