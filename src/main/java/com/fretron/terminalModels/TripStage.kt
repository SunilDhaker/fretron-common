package com.fretron.terminalModels

import com.google.gson.GsonBuilder

data class TripStage(
    var terminalId: String?,
    var terminalName: String?,
    var terminalExternalId: String?,
    var etd: Long?,
    var originalETD: Long?,
    var type: String?,
    var arrivalTime: Long?,
    var departureTime: Long?,
    var status: String?
) {

    constructor() : this(
        terminalId = null,
        terminalName = null,
        terminalExternalId = null,
        etd = null,
        originalETD = null,
        type = null,
        arrivalTime = null,
        departureTime = null,
        status = null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}