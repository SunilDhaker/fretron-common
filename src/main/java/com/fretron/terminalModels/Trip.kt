package com.fretron.terminalModels

import com.fretron.Model.StandardMeasurement
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
    var fNRNumber: String?,
    var referenceTrainInfo: ReferenceTrainInfo?,
    var containers: List<TripContainer>?,
    var consignments: List<TripCn>?,
    var shipments: List<TripSh>?
) {

    constructor() : this(
        null, null, null, null, null, null, null, null,
        null, null, null, null, null,
        null, null, null, null, null,
        null, null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}