package com.fretron.Extensions

import com.fretron.Model.ContractLineItem
import com.fretron.Model.Materials


fun Contract.clean() {
    if (this.getSalesOffice() != null) {
        this.getSalesOffice().clean()
    }
    if (this.getCustomer() != null) {
        this.getCustomer().clean()
    }

    this.getAllowedBillToParties()?.forEach { it.clean() }
    this.getAllowedConsignee()?.forEach { it.clean() }
    this.getAllowedConsigner()?.forEach { it.clean() }
    this.getAllowedBillingBranches()?.forEach { it.deepClean() }
    this.getAllowedConsignmentBranches()?.forEach { it.deepClean() }
    this.getAllowedBillingBranches()?.forEach { it.deepClean() }
    this.getAllowedPayers()?.forEach { it.clean() }
    this.getAllowedPaymentCollectionBranches()?.forEach { it.deepClean() }
    this.getAllowedOrderBranches()?.forEach { it.deepClean() }
}



fun ContractLineItem.clean(){
    this.getContractBranch()?.clean()
    this.getConsignee()?.clean()
    this.getConsignor()?.clean()
    this.getConsignmentBranch()?.clean()
    this.getBillToParty()?.clean()
    this.getBillingBranch()?.clean()
    this.getDeliveryBranch()?.clean()
    this.getPayer()?.clean()
    this.getMaterial()?.clean()
    this.getMaterialService()?.clean()
}


fun Materials.clean(){
    this.setUpdates(null)
}