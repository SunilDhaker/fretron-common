package com.fretron.terminalModels

import com.fretron.Model.ConsignmentLineItem
import com.fretron.Model.SalesOrderMapping
import com.google.gson.GsonBuilder

data class TripCn(
    var uuid: String?,
    var orgId: String?,
    var externalId: String?,
    var consignmentNumber: String?,
    var consignee: ResourceInfo?,
    var consigner: ResourceInfo?,
    var originTerminal: ResourceInfo?,
    var destinationTerminal: ResourceInfo?,
    var currentTerminal: ResourceInfo?,
    var tripInfo: ResourceInfo?,
    var containerInfo: List<ResourceInfo>?,
    var orderMappings: List<SalesOrderMapping>?,
    var assosiatedShipments: List<String>?,
    var orderNumber: String?,
    var lineItems: List<ConsignmentLineItem>?,
    var currentAssignedResource: ResourceInfo?,
    var nextPossibleActions: List<String>?,
    var containerizationType: String?
) {

    constructor() : this(
        null, null, null, null, null, null,
        null, null, null, null, null, null,
        null, null, null, null, null, null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}