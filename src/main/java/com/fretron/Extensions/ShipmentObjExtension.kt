package com.fretron.Extensions

import com.fretron.Model.ShipmentObject


fun ShipmentObject.clean(){

    this.getConsignments()?.forEach { cn->
        cn.deepClean()
    }
    this.getShipmentStages()?.forEach { stage->
        stage.getTripPoint()?.clean()
    }
    this.getBranch()?.clean()
    this.getFleetInfo()?.getVehicle()?.clean()
    this.getFleetInfo()?.getForwardingAgent()?.deepClean()
    this.getFleetInfo()?.getBroker()?.deepClean()
    this.getFleetInfo()?.getFleetOwner()?.deepClean()

    this.getIssues()?.forEach { issue->
        issue.clean()
    }
}