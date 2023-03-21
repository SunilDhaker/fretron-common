package com.fretron.terminalModels

import com.fretron.Model.StandardMeasurement
import com.google.gson.GsonBuilder

data class OtherTrainBooking(
    var operatorName: String?,
    var quantity: StandardMeasurement?,
    var tripId : String? ,
    var terminalId : String?,
    var uuid: String?
) {

    constructor() : this(operatorName = null, quantity =  null , tripId = null , terminalId = null,
    uuid = null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}