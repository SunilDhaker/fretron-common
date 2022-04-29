package com.fretron.terminalModels

import com.google.gson.GsonBuilder

data class TripContainer(
    var containerNumber: String?,
    var containerType : String?,
    var containerOwner:String?,
    var containerSize:Int?,
    var containerId: String?,
    var originTerminal: ResourceInfo?,
    var destinationTerminal: ResourceInfo?,
    var tripInfo: ResourceInfo?,
    var consignments: List<ResourceInfo>?,
    var shipmentInfo: ResourceInfo?,
    var currentAssignedResource: ResourceInfo?,
    var nextPossibleActions: List<String>?,
    var urgencyType: String?,
    var isSealed : Boolean?,
    var sealNumber : String?
) {

    constructor() : this(
        null , null ,null, null, null, null, null, null, null,
        null, null, null, null , null ,null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}