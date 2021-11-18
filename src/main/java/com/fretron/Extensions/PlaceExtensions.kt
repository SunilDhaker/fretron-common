package com.fretron.Extensions

import com.fretron.Model.Place

fun  Place.clean(){
    this.setViewport(null)
    this.setPlaces(null)
    this.setBoundary(null)
    this.setGeoJsonBoundry(null)
}
fun Place.deepClean(){
    this.setViewport(null)
    this.setPlaces(null)
    this.setBoundary(null)
    this.setGeoJsonBoundry(null)
}