package com.fretron.terminalModels;

import com.fretron.Model.StandardMeasurement;
import com.google.gson.GsonBuilder;

public class OtherTrainBooking {

    private String operatorName;
    private StandardMeasurement quantity;

    public OtherTrainBooking() {
    }

    public OtherTrainBooking(String operatorName, StandardMeasurement quantity) {
        this.operatorName = operatorName;
        this.quantity = quantity;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setQuantity(StandardMeasurement quantity) {
        this.quantity = quantity;
    }

    public StandardMeasurement getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return new GsonBuilder().serializeNulls().create().toJson(this);
    }
}
