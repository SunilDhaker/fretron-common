package com.fretron.Extensions

import com.fretron.Model.TripPoint

fun TripPoint.clean(){
//    this.setUpdates(null)
    this.getPlace()?.clean()
    this.getHub()?.clean()

}

fun TripPoint.deepClean(){
    this.clean()
    this.getPlace()?.setBoundary(null)
    this.getPlace()?.setGeoJsonBoundry(null)
    this.getPlace()?.setViewport(null)
    this.getHub()?.setBoundary(null)
    this.getHub()?.setGeoJsonBoundry(null)
}