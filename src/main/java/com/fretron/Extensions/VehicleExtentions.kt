package com.fretron.Extensions

import com.fretron.Model.Vehicle

fun Vehicle.clean(){
    this.setUpdates(null)
//    this.setAttachedDocs(null)
    this.getGroupsExtended()?.forEach { grp->
        grp.setOrgId(null)
    }
    this.setGroups(null)
    this.getBranch()?.clean()
    this.setCreateTime(null)
}

fun Vehicle.deepClean(){
    this.clean()
}