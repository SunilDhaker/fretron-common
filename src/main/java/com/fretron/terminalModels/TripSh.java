package com.fretron.terminalModels;

import com.google.gson.GsonBuilder;

public class TripSh {

    private String uuid;
    private String shipmentNumber;
    private String externalId;
    private String fuItemId;
    private ResourceInfo pickedContainers;
    private ResourceInfo pickedCn;
    private ResourceInfo origin;
    private ResourceInfo destination;
    private ResourceInfo tripInfo;
    private String containerizationType;

    public TripSh() {

    }

    public TripSh(String uuid, String shipmentNumber, String externalId, String fuItemId, ResourceInfo pickedContainers,
                  ResourceInfo pickedCn, ResourceInfo origin, ResourceInfo destination, ResourceInfo tripInfo,
                  String containerizationType) {
        this.uuid = uuid;
        this.shipmentNumber = shipmentNumber;
        this.externalId = externalId;
        this.fuItemId = fuItemId;
        this.pickedContainers = pickedContainers;
        this.pickedCn = pickedCn;
        this.origin = origin;
        this.destination = destination;
        this.tripInfo = tripInfo;
        this.containerizationType = containerizationType;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getFuItemId() {
        return fuItemId;
    }

    public void setFuItemId(String fuItemId) {
        this.fuItemId = fuItemId;
    }

    public ResourceInfo getPickedContainers() {
        return pickedContainers;
    }

    public void setPickedContainers(ResourceInfo pickedContainers) {
        this.pickedContainers = pickedContainers;
    }

    public ResourceInfo getPickedCn() {
        return pickedCn;
    }

    public void setPickedCn(ResourceInfo pickedCn) {
        this.pickedCn = pickedCn;
    }

    public ResourceInfo getOrigin() {
        return origin;
    }

    public void setOrigin(ResourceInfo origin) {
        this.origin = origin;
    }

    public ResourceInfo getDestination() {
        return destination;
    }

    public void setDestination(ResourceInfo destination) {
        this.destination = destination;
    }

    public ResourceInfo getTripInfo() {
        return tripInfo;
    }

    public void setTripInfo(ResourceInfo tripInfo) {
        this.tripInfo = tripInfo;
    }

    public String getContainerizationType() {
        return containerizationType;
    }

    public void setContainerizationType(String containerizationType) {
        this.containerizationType = containerizationType;
    }

    @Override
    public String toString() {
        return new GsonBuilder().serializeNulls().create().toJson(this);
    }
}
