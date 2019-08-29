package com.fretron.Extensions

import com.fretron.Model.BuisnessPartner

fun BuisnessPartner.clean(){
    this.setUpdates(null)
    this.getGroup()?.setOrgId(null)
    this.setCustomFields(null)
}

fun BuisnessPartner.deepClean(){
    this.clean()
    this.setPlaces(null)
    this.setGeoFence(null)
    this.setRoute(null)
}