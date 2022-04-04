package com.fretron.terminalModels

import com.fretron.Model.StandardMeasurement
import com.google.gson.GsonBuilder

data class OtherTrainBooking(
    var operatorName: String?,
    var quantity: StandardMeasurement?
) {

    constructor() : this(null, null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}