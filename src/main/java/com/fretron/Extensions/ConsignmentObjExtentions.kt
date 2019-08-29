package com.fretron.Extensions

import com.fretron.Model.Consignment

fun  Consignment.clean(){
    this.getConsignee()?.clean()
    this.getConsigner()?.clean()
    this.getBillToParty()?.clean()
    this.getContractToParty()?.clean()
}

fun  Consignment.deepClean(){
     this.clean()
     this.getBillToParty()?.deepClean()
     this.getContractToParty()?.deepClean()

}