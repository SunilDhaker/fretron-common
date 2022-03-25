package com.fretron.terminalModels;

import com.google.gson.GsonBuilder;

import java.util.List;

public class TrainContainer {

    private String containerNumber;
    private String containerId;
    private ResourceInfo originTerminal;
    private ResourceInfo destinationTerminal;
    private ResourceInfo tripInfo;
    private List<ResourceInfo> consignments;
    private ResourceInfo shipmentInfo;
    private ResourceInfo currentAssignedResource;
    private List<String> nextPossibleActions;
    private String urgencyType;

    public TrainContainer() {
    }

    public TrainContainer(String containerNumber, String containerId, ResourceInfo originTerminal,
                          ResourceInfo destinationTerminal, ResourceInfo tripInfo,
                          List<ResourceInfo> consignments, ResourceInfo shipmentInfo,
                          ResourceInfo currentAssignedResource, List<String> nextPossibleActions,
                          String urgencyType) {
        this.containerNumber = containerNumber;
        this.containerId = containerId;
        this.originTerminal = originTerminal;
        this.destinationTerminal = destinationTerminal;
        this.tripInfo = tripInfo;
        this.consignments = consignments;
        this.shipmentInfo = shipmentInfo;
        this.currentAssignedResource = currentAssignedResource;
        this.nextPossibleActions = nextPossibleActions;
        this.urgencyType = urgencyType;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ResourceInfo getOriginTerminal() {
        return originTerminal;
    }

    public void setOriginTerminal(ResourceInfo originTerminal) {
        this.originTerminal = originTerminal;
    }

    public ResourceInfo getDestinationTerminal() {
        return destinationTerminal;
    }

    public void setDestinationTerminal(ResourceInfo destinationTerminal) {
        this.destinationTerminal = destinationTerminal;
    }

    public ResourceInfo getTripInfo() {
        return tripInfo;
    }

    public void setTripInfo(ResourceInfo tripInfo) {
        this.tripInfo = tripInfo;
    }

    public List<ResourceInfo> getConsignments() {
        return consignments;
    }

    public void setConsignments(List<ResourceInfo> consignments) {
        this.consignments = consignments;
    }

    public ResourceInfo getShipmentInfo() {
        return shipmentInfo;
    }

    public void setShipmentInfo(ResourceInfo shipmentInfo) {
        this.shipmentInfo = shipmentInfo;
    }

    public ResourceInfo getCurrentAssignedResource() {
        return currentAssignedResource;
    }

    public void setCurrentAssignedResource(ResourceInfo currentAssignedResource) {
        this.currentAssignedResource = currentAssignedResource;
    }

    public List<String> getNextPossibleActions() {
        return nextPossibleActions;
    }

    public void setNextPossibleActions(List<String> nextPossibleActions) {
        this.nextPossibleActions = nextPossibleActions;
    }

    public String getUrgencyType() {
        return urgencyType;
    }

    public void setUrgencyType(String urgencyType) {
        this.urgencyType = urgencyType;
    }

    @Override
    public String toString() {
        return new GsonBuilder().serializeNulls().create().toJson(this);
    }
}
