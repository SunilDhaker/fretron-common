package com.fretron.ExternalResponseModels

import org.json.JSONObject

data class VerifiedDriverDl(
    var driverName: String?,var dlExpiry: Long?,var dlNumber: String?,var
    dob: Long?
) {

    constructor(): this(
        driverName = null,dlExpiry = null,dlNumber = null,dob = null
    ) {
    }

    override fun toString(): String {
        return JSONObject().put("driverName",this.driverName ?: JSONObject.NULL)
            .put("dlExpiry",this.dlExpiry ?: JSONObject.NULL)
            .put("dlNumber",this.dlNumber ?: JSONObject.NULL)
            .put("dob",this.dob ?: JSONObject.NULL)
            .toString()
    }
}