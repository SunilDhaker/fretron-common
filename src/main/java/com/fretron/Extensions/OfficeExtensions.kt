package com.fretron.Extensions

import com.fretron.Model.OrgOffice

fun OrgOffice.clean(){
    this.setUpdates(null)
    this.setGeoLocation(null)
    this.getContacts()?.forEach { contact->
            contact?.clean()
    }
    this.setUpdatedBy(null)
}

fun OrgOffice.deepClean(){
    this.clean()
    this.setMaterialServices(null)
}