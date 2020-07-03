package com.fretron.Extensions

import com.fretron.Model.ConsignmentPod

fun ConsignmentPod.clean(){
    this.setDeliveryItems(null)
}