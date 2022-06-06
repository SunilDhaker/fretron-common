package com.fretron.terminalModels

import com.google.gson.GsonBuilder

//status : Active , InActive , Pending , Deposited
/*
      currentAssignedResource : Order , Shipment , Terminal
 */
data class TripContainer(
    var containerNumber: String?,
    var containerType: String?,
    var containerOwner: String?,
    var containerSize: Int?,
    var containerOrganisedBy: String?,
    var containerId: String?,
    var originTerminal: ResourceInfo?,
    var destinationTerminal: ResourceInfo?,
    var tripInfo: ResourceInfo?,
    var consignments: List<LiteConsignment>?,
    var shipmentInfo: ResourceInfo?,
    var currentAssignedResource: ResourceInfo?,
    var nextPossibleActions: List<String>?,
    var urgencyType: String?,
    var isSealed: Boolean?,
    var sealNumber: String?,
    var status: String?,
    var expectedReceiveDate: Long?,
    var customerHandoffDate: Long?,
    var depositDate: Long?,
    var assignedOn: Long?,
    var targetDeliveryDate: Long?
) {

    constructor() : this(
        null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null, null, null, null,
        null, null, null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}


enum class TripContainerStatus {
    Active, InActive, Pending, Deposited
}