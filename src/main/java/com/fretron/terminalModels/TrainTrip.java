package com.fretron.terminalModels;

import com.fretron.Model.Place;
import com.fretron.Model.StandardMeasurement;
import com.google.gson.GsonBuilder;

import java.util.List;

public class TrainTrip {

    private String uuid;
    private String orgId;
    private String status;
    private String tripType;
    private String tripCategory;
    private String tripNumber;
    private Long etd;
    private Long originalEtd;
    private Place trainOriginTerminal;
    private Place trainDestinationTerminal;
    private List<Place> viaTerminals;
    private String trainNumber;
    private String trainOwner;
    private List<String> capacityUtilizationType;
    private StandardMeasurement trainActualCapacity;
    private StandardMeasurement trainPossibleUtilization;
    private String RRNumber;
    private String FNRNumber;
    private OtherTrainBooking otherBooking;
    private ReferenceTrainInfo referenceTrainInfo;
    private List<TrainContainer> containers;
    private List<TripCn> consignments;
    private List<TripSh> shipments;


    public TrainTrip() {
    }

    public TrainTrip(String uuid, String orgId, String status, String tripType, String tripCategory,
                     String tripNumber, Long etd, Long originalEtd, Place trainOriginTerminal,
                     Place trainDestinationTerminal, List<Place> viaTerminals, String trainNumber,
                     String trainOwner, List<String> capacityUtilizationType, StandardMeasurement trainActualCapacity,
                     StandardMeasurement trainPossibleUtilization, String RRNumber, String FNRNumber,
                     OtherTrainBooking otherBooking, ReferenceTrainInfo referenceTrainInfo, List<TrainContainer> containers,
                     List<TripCn> consignments, List<TripSh> shipments) {
        this.uuid = uuid;
        this.orgId = orgId;
        this.status = status;
        this.tripType = tripType;
        this.tripCategory = tripCategory;
        this.tripNumber = tripNumber;
        this.etd = etd;
        this.originalEtd = originalEtd;
        this.trainOriginTerminal = trainOriginTerminal;
        this.trainDestinationTerminal = trainDestinationTerminal;
        this.viaTerminals = viaTerminals;
        this.trainNumber = trainNumber;
        this.trainOwner = trainOwner;
        this.capacityUtilizationType = capacityUtilizationType;
        this.trainActualCapacity = trainActualCapacity;
        this.trainPossibleUtilization = trainPossibleUtilization;
        this.RRNumber = RRNumber;
        this.FNRNumber = FNRNumber;
        this.otherBooking = otherBooking;
        this.referenceTrainInfo = referenceTrainInfo;
        this.containers = containers;
        this.consignments = consignments;
        this.shipments = shipments;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getTripCategory() {
        return tripCategory;
    }

    public void setTripCategory(String tripCategory) {
        this.tripCategory = tripCategory;
    }

    public String getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public Long getEtd() {
        return etd;
    }

    public void setEtd(Long etd) {
        this.etd = etd;
    }

    public Long getOriginalEtd() {
        return originalEtd;
    }

    public void setOriginalEtd(Long originalEtd) {
        this.originalEtd = originalEtd;
    }

    public Place getTrainOriginTerminal() {
        return trainOriginTerminal;
    }

    public void setTrainOriginTerminal(Place trainOriginTerminal) {
        this.trainOriginTerminal = trainOriginTerminal;
    }

    public Place getTrainDestinationTerminal() {
        return trainDestinationTerminal;
    }

    public void setTrainDestinationTerminal(Place trainDestinationTerminal) {
        this.trainDestinationTerminal = trainDestinationTerminal;
    }

    public List<Place> getViaTerminals() {
        return viaTerminals;
    }

    public void setViaTerminals(List<Place> viaTerminals) {
        this.viaTerminals = viaTerminals;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainOwner() {
        return trainOwner;
    }

    public void setTrainOwner(String trainOwner) {
        this.trainOwner = trainOwner;
    }

    public List<String> getCapacityUtilizationType() {
        return capacityUtilizationType;
    }

    public void setCapacityUtilizationType(List<String> capacityUtilizationType) {
        this.capacityUtilizationType = capacityUtilizationType;
    }

    public StandardMeasurement getTrainActualCapacity() {
        return trainActualCapacity;
    }

    public void setTrainActualCapacity(StandardMeasurement trainActualCapacity) {
        this.trainActualCapacity = trainActualCapacity;
    }

    public StandardMeasurement getTrainPossibleUtilization() {
        return trainPossibleUtilization;
    }

    public void setTrainPossibleUtilization(StandardMeasurement trainPossibleUtilization) {
        this.trainPossibleUtilization = trainPossibleUtilization;
    }

    public String getRRNumber() {
        return RRNumber;
    }

    public void setRRNumber(String RRNumber) {
        this.RRNumber = RRNumber;
    }

    public String getFNRNumber() {
        return FNRNumber;
    }

    public void setFNRNumber(String FNRNumber) {
        this.FNRNumber = FNRNumber;
    }

    public OtherTrainBooking getOtherBooking() {
        return otherBooking;
    }

    public void setOtherBooking(OtherTrainBooking otherBooking) {
        this.otherBooking = otherBooking;
    }

    public ReferenceTrainInfo getReferenceTrainInfo() {
        return referenceTrainInfo;
    }

    public void setReferenceTrainInfo(ReferenceTrainInfo referenceTrainInfo) {
        this.referenceTrainInfo = referenceTrainInfo;
    }

    public List<TrainContainer> getContainers() {
        return containers;
    }

    public void setContainers(List<TrainContainer> containers) {
        this.containers = containers;
    }

    public List<TripCn> getConsignments() {
        return consignments;
    }

    public void setConsignments(List<TripCn> consignments) {
        this.consignments = consignments;
    }

    public List<TripSh> getShipments() {
        return shipments;
    }

    public void setShipments(List<TripSh> shipments) {
        this.shipments = shipments;
    }

    @Override
    public String toString() {
        return new GsonBuilder().serializeNulls().create().toJson(this);
    }
}
