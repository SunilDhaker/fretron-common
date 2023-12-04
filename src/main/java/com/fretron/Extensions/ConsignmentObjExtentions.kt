package com.fretron.Extensions

import com.fretron.Model.Consignment
import com.fretron.Model.EnrichedConsignment
import com.fretron.Model.Updates

fun Consignment.clean(){
    this.getConsignee()?.clean()
    this.getConsigner()?.clean()
    this.getBillToParty()?.clean()
    this.getContractToParty()?.clean()
    this.getSalesOffice()?.clean()
    this.getPod()?.deepClean()
}

fun  Consignment.deepClean(){
     this.clean()
     this.getBillToParty()?.deepClean()
     this.getContractToParty()?.deepClean()
     this.getConsignee()?.clean()
     this.getConsignee()?.cleanWithBoundary()
     this.getConsigner()?.cleanWithBoundary()
     this.getUpdates()?.clean()
}

fun Updates.clean(){
    this.setChanges(null)
}


fun EnrichedConsignment.clean(){
    this.getConsignment()?.clean()
    this.getConsignment()?.setLineItems(mutableListOf())
    this.getConsignment()?.getContractToParty()?.cleanWithBoundary()
    this.getConsignment()?.getBillToParty()?.cleanWithBoundary()
    this.getConsignment()?.getConsignee()?.cleanWithBoundary()
    this.getConsignment()?.getConsigner()?.cleanWithBoundary()
    this.getConsignment()?.setOrderMappings(mutableListOf())
    this.getConsignment()?.getPod()?.setDeliveryItems(mutableListOf())
    this.getAssociatedShipments()?.forEach {
        it?.clean()
    }
}