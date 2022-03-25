package com.fretron.terminalModels;

import com.google.gson.GsonBuilder;

public class ReferenceTrainInfo {

    private String trainNumber;
    private String tripId;

    public ReferenceTrainInfo() {
    }

    public ReferenceTrainInfo(String trainNumber, String tripId) {
        this.trainNumber = trainNumber;
        this.tripId = tripId;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    @Override
    public String toString() {
        return new GsonBuilder().serializeNulls().create().toJson(this);
    }
}
