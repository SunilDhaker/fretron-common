package com.fretron.terminalModels

import com.fretron.Model.Place
import com.fretron.Model.StandardMeasurement
import com.google.gson.GsonBuilder

data class TrainTrip(
    var uuid: String?,
    var orgId: String?,
    var status: String?,
    var tripType: String?,
    var tripCategory: String?,
    var tripNumber: String?,
    var etd: Long?,
    var originalEtd: Long?,
    var trainOriginTerminal: Place?,
    var trainDestinationTerminal: Place?,
    var viaTerminals: List<Place>?,
    var trainNumber: String?,
    var trainOwner: String?,
    var capacityUtilizationType: List<String>?,
    var trainActualCapacity: StandardMeasurement?,
    var trainPossibleUtilization: StandardMeasurement?,
    var rRNumber: String?,
    var fNRNumber: String?,
    var otherBooking: OtherTrainBooking?,
    var referenceTrainInfo: ReferenceTrainInfo?,
    var containers: List<TrainContainer>?,
    var consignments: List<TripCn>?,
    var shipments: List<TripSh>?
) {

    constructor() : this(
        null, null, null, null, null, null, null, null,
        null, null, null, null, null,
        null, null, null, null, null,
        null, null, null, null, null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}