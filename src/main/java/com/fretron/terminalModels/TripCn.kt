package com.fretron.terminalModels

import com.fretron.Model.ConsignmentLineItem
import com.fretron.Model.SalesOrderMapping
import com.fretron.Model.StandardMeasurement
import com.google.gson.GsonBuilder

data class TripCn(
    var uuid: String?,
    var consignmentId : String?,
    var orgId: String?,
    var externalId: String?,
    var tripId: String?,
    var consignmentNumber: String?,
    var consignee: LiteBusinessPartner?,
    var consigner: LiteBusinessPartner?,
    var customer : LiteBusinessPartner?,
    var originTerminal: ResourceInfo?,
    var destinationTerminal: ResourceInfo?,
    var currentTerminal: ResourceInfo?,
    var containerInfo: List<ResourceInfo>?,
    var orderMappings: MutableList<SalesOrderMapping> = mutableListOf(),
    var plannedMapping: MutableList<SalesOrderMapping> = mutableListOf(),
    var pendingQuantity: StandardMeasurement?,
    var shipmentId: String?,
    var orderNumber: String?,
    var lineItems: List<ConsignmentLineItem>?,
    var nextPossibleActions: List<String>?,
    var containerizationType: String?,
    var consignmentDate: Long?,
    var stuffingAt: String?,
    var deStuffingAt: String?,
    var scope: String?,
    var urgencyType: String?,
    var status: String?,
    var targetDeliveryDate : Long?
) {

    constructor() : this(
        null , null, null, null, null, null, null,
        null, null, null, null, null, null,
        mutableListOf(), mutableListOf(), null, null, null, null,
        null, null, null, null, null, null ,null , null , null
    )



    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}


data class LiteBusinessPartner(
    var uuid: String?, var externalId: String?, var name: String?, var placeId: String?,
    var placeExternalId: String?, var placeName: String?, var address: String?
) {
    constructor() : this(null, null, null, null, null, null, null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}


enum class TripCnStatus{
    Planned , OnTrip ,CustomerHandoff , Completed
}