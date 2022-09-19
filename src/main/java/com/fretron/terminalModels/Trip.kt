package com.fretron.terminalModels

import com.fretron.Model.LitePosition
import com.fretron.Model.StandardMeasurement
import com.fretron.Model.Updates
import com.google.gson.GsonBuilder

data class Trip(
    var uuid: String?,
    var orgId: String?,
    var status: String?,
    var tripType: String?,
    var containerizationType: String?,
    var tripNumber: String?,
    var etd: Long?,
    var originalEtd: Long?,
    var stages: List<TripStage>?,
    var trainNumber: String?,
    var trainOwner: String?,
    var capacityUtilizationType: List<String>?,
    var trainActualCapacity: StandardMeasurement?,
    var trainPossibleUtilization: StandardMeasurement?,
    var rRNumber: String?,
    var rrDate: Long?,
    var fNRNumber: String?,
    var referenceTrainInfo: ReferenceTrainInfo?,
    var containers: List<TripContainer>?,
    var consignments: List<TripCn>?,
    var shipments: List<TripSh>?,
    var tripCreationDate: Long?,
    var imei: String?,
    var currentLocation: LitePosition?,
    var trackingStatus: String?,
    var updates: Updates?,
    var utilizedQuantity:StandardMeasurement?=null,
    var remarks : List<String>
) {

    constructor() : this(
        null, null, null, null, null, null, null, null,
        null, null, null, null, null,
        null, null, null, null, null,
        null, null, null, null, null, null, null, null , null , mutableListOf<String>()
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }

    fun toResourceInfo() : ResourceInfo{
        return ResourceInfo().also {
            it.resourceId = this.uuid
            it.resourceIdentifier = this.tripNumber
            it.resourceType = "Trip"
            it.resourceExtId = this.tripNumber
        }
    }
}