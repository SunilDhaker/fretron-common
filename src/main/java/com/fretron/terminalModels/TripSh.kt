package com.fretron.terminalModels

import com.google.gson.GsonBuilder

//data class TripSh(
//    var uuid: String?,
//    var shipmentNumber: String?,
//    var externalId: String?,
//    var fuItemId: String?,
//    var tripId : String?,
//    var tripInfo: ResourceInfo?,
//    var containerizationType: String?
//) {
//
//}
//
//data class TripShStage(
//    var terminalInfo: ResourceInfo?,
//    var resourcePickup: List<ResourceInfo>,
//    var resourceDropped: List<ResourceInfo>,
//    var consignmentPickups: List<ResourceInfo>,
//    var consignmentDropped: List<ResourceInfo>
//
//
//) {
//
//}

data class TripSh(
    var uuid: String?,
    var shipmentNumber: String?,
    var externalId: String?,
    var fuItemId: String?,
    var pickedContainers: ResourceInfo?,
    var pickedCn: ResourceInfo?,
    var origin: ResourceInfo?,
    var destination: ResourceInfo?,
    var tripInfo: ResourceInfo?,
    var containerizationType: String?
) {

    constructor() : this(
        null, null, null, null, null, null,
        null, null, null, null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}