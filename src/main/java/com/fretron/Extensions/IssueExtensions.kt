package com.fretron.Extensions

import com.fretron.Model.Issue

fun Issue.clean(){
    this.getBpartnerFollowers()?.forEach { partner->
        partner.deepClean()
    }
    this.getBpartnerWatchers()?.forEach { partner->
        partner.deepClean()
    }
    this.getBranch()?.clean()
    this.getAssignee()?.clean()
    this.getCreator()?.clean()
    this.setUpdates(null)

}

fun Issue.deepClean(){
    this.clean()
    this.setCustomeFields(null)
    this.setCustomFields(null)
}