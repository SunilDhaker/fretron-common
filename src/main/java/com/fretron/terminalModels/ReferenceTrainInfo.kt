package com.fretron.terminalModels

import com.google.gson.GsonBuilder

data class ReferenceTrainInfo(
    var trainNumber: String?,
    var tripId: String?
) {

    constructor() : this(null, null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}