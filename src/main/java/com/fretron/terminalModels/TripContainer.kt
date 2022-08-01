package com.fretron.terminalModels

import com.google.gson.GsonBuilder
import javax.ws.rs.NotAllowedException

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
    var consignments: MutableList<LiteConsignment>,
    var shipmentInfo: ShipmentInfo?,
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
    var targetDeliveryDate: Long?,
    var stuffingAt: String?,
    var deStuffingAt: String?,
    var orgId: String?

) {

    constructor() : this(
        null, null, null, null, null, null, null, null, null,
        mutableListOf(), null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }

    fun toResourceInfo(): ResourceInfo {
        return ResourceInfo().also {
            it.resourceId = containerId
            it.resourceIdentifier = containerNumber
            it.resourceType = "CONTAINER"
        }
    }
}


enum class TripContainerStatus {
    Draft, Active, InActive, Pending, Deposited
}


data class ShipmentInfo(
    var resourceId: String?,
    var resourceIdentifier: String?,
    var resourceExtId: String?,
    var vendor : LiteBusinessPartner? ,
    var vehicleRegistrationNumber : String?
) {
    constructor() : this(null,  null, null , null , null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }

    @Throws(NotAllowedException::class)
    fun validateOrThrow() {
        if (resourceId.isNullOrBlank()  || resourceIdentifier.isNullOrBlank()) {
            throw NotAllowedException("Bad Request, Invalid resource info.")
        }
    }

    fun isValid(): Boolean {
        return !(resourceId.isNullOrBlank()  || resourceIdentifier.isNullOrBlank())
    }

}