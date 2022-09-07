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
    var loadingStartTime: Long?,
    var loadingEndTime: Long?,
    var unloadingStartTime: Long?,
    var unloadingEndTime: Long?,
    var status: String?,
    var incomingStatus : String?,
    var eta:Long?,
    var inspectionEndTime:Long?,
    var completedOn : Long?,
    var outgoingStatus : String?=null

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
        status = null,
        loadingEndTime = null,
        loadingStartTime = null,
        unloadingEndTime = null,
        unloadingStartTime = null,
        incomingStatus = null,
        eta = null,
        inspectionEndTime =null , completedOn=null
    )

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}