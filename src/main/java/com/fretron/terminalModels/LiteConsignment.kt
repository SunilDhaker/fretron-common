package com.fretron.terminalModels

import com.fretron.Model.ConsignmentLineItem
import com.fretron.Model.LoadInfo
import com.fretron.Model.SalesOrderMapping
import com.fretron.Model.StandardMeasurement
import com.fretron.terminalModels.LiteBusinessPartner
import org.json.JSONArray
import org.json.JSONObject
//Standard Measurement (orderMappings)
data class LiteConsignment(
    var uuid : String?,
    var consignmentNo : String?,
    var contractToParty : LiteBusinessPartner?,
    var consignee : LiteBusinessPartner?,
    var consignor : LiteBusinessPartner?,
    var orderMappings : List<SalesOrderMapping>,
    var lineItems : List<ConsignmentLineItem>,
    var loadInfo: LoadInfo?,
    var consignmentDate : Long?,
    var orderNo : String?,
    var quantity:StandardMeasurement?=null
){
    constructor():this(uuid = null,consignmentNo = null,contractToParty = null,orderMappings = emptyList(), lineItems = emptyList(), loadInfo = null,consignmentDate = null,orderNo = null , consignee = null , consignor = null)


    override fun toString(): String {
        return JSONObject()
            .put("uuid",this.uuid ?: JSONObject.NULL)
            .put("consignmentNo",this.consignmentNo ?: JSONObject.NULL)
            .put("contractToParty",if(this.contractToParty != null) JSONObject(this.contractToParty.toString()) else JSONObject.NULL)
            .put("consignee",if(this.consignee != null) JSONObject(this.consignee.toString()) else JSONObject.NULL)
            .put("consignor",if(this.consignor != null) JSONObject(this.consignor.toString()) else JSONObject.NULL)
            .put("orderMappings",JSONArray(this.orderMappings.toString()))
            .put("lineItems",JSONArray(this.lineItems.toString()))
            .put("loadInfo",if(this.loadInfo != null) JSONObject(this.loadInfo.toString()) else JSONObject.NULL)
            .put("consignmentDate",this.consignmentDate ?: JSONObject.NULL)
            .put("orderNo",this.orderNo ?: JSONObject.NULL)
            .put("quantity",if(this.quantity!=null) JSONObject(this.quantity.toString()) else  JSONObject.NULL)
            .toString()
    }
}
