package com.fretron.terminalModels

import com.fretron.Model.BuisnessPartner
import com.fretron.Model.ResourceAlert
import com.google.gson.GsonBuilder

data class TripSh(
    var uuid: String?,
    var shipmentNumber: String?,
    var shipmentDate : Long? ,
    var externalId: String?,
    var orgId: String?,
    var fuItemId: String?,
    var stages: MutableList<TripShStage>,
    var tripInfo: ResourceInfo?,
    var containerizationType: String?,
    var partners: List<PartnerInfo>,
    var status: String?,
    var isTripDTChanged : Boolean,
    var alerts : List<ResourceAlert>,
    var shipmentCostNumber : String?
) {

    constructor() : this(
        null, null , null, null, null, null, mutableListOf(), null,
        null, emptyList(), null , false , mutableListOf(),null
    )

    fun toResourceInfo(): ResourceInfo {
        return ResourceInfo().also {
            it.resourceId = uuid
            it.resourceIdentifier = shipmentNumber
            it.resourceType = "SHIPMENT"
            it.resourceExtId = externalId
        }
    }

    fun toShipmentInfo(): ShipmentInfo {
        return ShipmentInfo().also {
            it.resourceId = uuid
            it.resourceIdentifier = shipmentNumber
            it.resourceExtId = externalId
            it.vehicleRegistrationNumber = null
            if (partners.firstOrNull()?.partner != null) {
                val p = partners.first().partner!!
                it.vendor = LiteBusinessPartner().apply {
                    this.uuid = p.getUuid()
                    this.externalId = p.getExternalId()
                    this.placeId = if (p.getPlaces().isNullOrEmpty()) null else p.getPlaces()[0]?.getPlaceId()
                    this.placeName = if (p.getPlaces().isNullOrEmpty()) null else p.getPlaces()[0]?.getName()
                    this.placeExternalId =
                        if (p.getPlaces().isNullOrEmpty()) null else p.getPlaces()[0]?.getExternalId()
                    this.name = p.getName()
                    this.address = if (p.getPlaces().isNullOrEmpty()) null else p.getPlaces()[0]?.getAddress()
                }

            }

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
