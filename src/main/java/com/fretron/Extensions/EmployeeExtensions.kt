package com.fretron.Extensions

import com.fretron.Model.Employee

fun Employee.clean(){
    this.setUpdates(null)
}

fun Employee.deepClean(){
    this.clean()
}