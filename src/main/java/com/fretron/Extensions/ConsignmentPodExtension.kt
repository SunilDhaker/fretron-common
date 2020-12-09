package com.fretron.Extensions

fun ConsignmentPod.clean(){
    this.setDeliveryItems(null)
}

fun ConsignmentPod.deepClean(){
    this.clean()
    this.setUpdates(null)
}