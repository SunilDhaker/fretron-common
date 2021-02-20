package com.fretron.Extensions

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
//     this.getCustomFields()?.forEach { field->
//         field.setAccessType(null)
//     }
}