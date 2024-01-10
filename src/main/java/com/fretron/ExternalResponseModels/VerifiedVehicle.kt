package com.fretron.ExternalResponseModels

import org.json.JSONObject

data class VerifiedVehicle(
    var rcNumber: String?,
    var chassisNumber: String?,
    var engineNumber: String?,
    var ownerName: String?,
    var insuranceNumber: String?,
    var insuranceExpiryDate: Long?,
    var nationalPermitNumber: String?,
    var nationalPermitValidUpto: Long?,
    var permitNumber: String?,
    var permitValidUpto: Long?,
    var pollutionNumber: String?,
    var pollutionExpiryDate: Long?,
    var rcExpiryDate: Long?
) {

    constructor() : this(
        rcNumber = null,
        chassisNumber = null,
        engineNumber = null,
        ownerName = null,
        insuranceNumber = null,
        insuranceExpiryDate = null,
        nationalPermitNumber = null,
        nationalPermitValidUpto = null,
        permitNumber = null,
        permitValidUpto = null,
        pollutionNumber = null,
        pollutionExpiryDate = null,
        rcExpiryDate = null
    ) {
    }

    override fun toString(): String {
        return JSONObject().put("chassisNumber", this.chassisNumber ?: JSONObject.NULL)
            .put("rcNumber", this.rcNumber ?: JSONObject.NULL)
            .put("insuranceNumber", this.insuranceNumber ?: JSONObject.NULL)
            .put("engineNumber", this.engineNumber ?: JSONObject.NULL)
            .put("ownerName", this.ownerName ?: JSONObject.NULL)
            .put("insuranceExpiryDate", this.insuranceExpiryDate ?: JSONObject.NULL)
            .put("nationalPermitNumber", this.nationalPermitNumber ?: JSONObject.NULL)
            .put("nationalPermitValidUpto", this.nationalPermitValidUpto ?: JSONObject.NULL)
            .put("permitNumber", this.permitNumber ?: JSONObject.NULL)
            .put("permitValidUpto", this.permitValidUpto ?: JSONObject.NULL)
            .put("pollutionNumber", this.pollutionNumber ?: JSONObject.NULL)
            .put("pollutionExpiryDate", this.pollutionExpiryDate ?: JSONObject.NULL)
            .put("rcExpiryDate", this.rcExpiryDate ?: JSONObject.NULL)
            .toString()
    }
}