package com.fretron.Extensions

import com.fretron.Model.OrgOffice

fun OrgOffice.clean(){
    this.setUpdates(null)
    this.setGeoLocation(null)
}

fun OrgOffice.deepClean(){
    this.clean()
}