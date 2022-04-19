package com.fretron.terminalModels

import com.google.gson.GsonBuilder

data class ResourceInfo(
    var resourceId: String?,
    var resourceType: String?,
    var resourceIdentifier: String?,
    var resourceExtId: String?
) {

    constructor() : this(null, null, null, null)

    override fun toString(): String {
        return GsonBuilder().serializeNulls().create().toJson(this)
    }
}