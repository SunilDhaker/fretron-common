package com.fretron.Extensions

import com.fretron.Model.Contact

fun Contact.clean(){
    this.setAddress(null)
    this.setType(null)
}