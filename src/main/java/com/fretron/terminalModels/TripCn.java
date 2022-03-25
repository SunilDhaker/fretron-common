package com.fretron.terminalModels;

import com.fretron.Model.ConsignmentLineItem;
import com.fretron.Model.SalesOrderMapping;
import com.google.gson.GsonBuilder;

import java.util.List;

public class TripCn {

    private String uuid;
    private String orgId;
    private String externalId;
    private String consignmentNumber;
    private ResourceInfo consignee;
    private ResourceInfo consigner;
    private ResourceInfo originTerminal;
    private ResourceInfo destinationTerminal;
    private ResourceInfo currentTerminal;
    private ResourceInfo tripInfo;
    private List<ResourceInfo> containerInfo;
    private List<SalesOrderMapping> orderMappings;
    private List<String> assosiatedShipments;
    private String orderNumber;
    private List<ConsignmentLineItem> lineItems;
    private ResourceInfo currentAssignedResource;
    private List<String> nextPossibleActions;
    private String containerizationType;

    public TripCn() {
    }

    public TripCn(String uuid, String orgId, String externalId, String consignmentNumber, ResourceInfo consignee,
                  ResourceInfo consigner, ResourceInfo originTerminal, ResourceInfo destinationTerminal,
                  ResourceInfo currentTerminal, ResourceInfo tripInfo, List<ResourceInfo> containerInfo,
                  List<SalesOrderMapping> orderMappings, List<String> assosiatedShipments, String orderNumber,
                  List<ConsignmentLineItem> lineItems, ResourceInfo currentAssignedResource,
                  List<String> nextPossibleActions, String containerizationType) {
        this.uuid = uuid;
        this.orgId = orgId;
        this.externalId = externalId;
        this.consignmentNumber = consignmentNumber;
        this.consignee = consignee;
        this.consigner = consigner;
        this.originTerminal = originTerminal;
        this.destinationTerminal = destinationTerminal;
        this.currentTerminal = currentTerminal;
        this.tripInfo = tripInfo;
        this.containerInfo = containerInfo;
        this.orderMappings = orderMappings;
        this.assosiatedShipments = assosiatedShipments;
        this.orderNumber = orderNumber;
        this.lineItems = lineItems;
        this.currentAssignedResource = currentAssignedResource;
        this.nextPossibleActions = nextPossibleActions;
        this.containerizationType = containerizationType;
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getConsignmentNumber() {
        return consignmentNumber;
    }

    public void setConsignmentNumber(String consignmentNumber) {
        this.consignmentNumber = consignmentNumber;
    }

    public ResourceInfo getConsignee() {
        return consignee;
    }

    public void setConsignee(ResourceInfo consignee) {
        this.consignee = consignee;
    }

    public ResourceInfo getConsigner() {
        return consigner;
    }

    public void setConsigner(ResourceInfo consigner) {
        this.consigner = consigner;
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

    public ResourceInfo getCurrentTerminal() {
        return currentTerminal;
    }

    public void setCurrentTerminal(ResourceInfo currentTerminal) {
        this.currentTerminal = currentTerminal;
    }

    public ResourceInfo getTripInfo() {
        return tripInfo;
    }

    public void setTripInfo(ResourceInfo tripInfo) {
        this.tripInfo = tripInfo;
    }

    public List<ResourceInfo> getContainerInfo() {
        return containerInfo;
    }

    public void setContainerInfo(List<ResourceInfo> containerInfo) {
        this.containerInfo = containerInfo;
    }

    public List<SalesOrderMapping> getOrderMappings() {
        return orderMappings;
    }

    public void setOrderMappings(List<SalesOrderMapping> orderMappings) {
        this.orderMappings = orderMappings;
    }

    public List<String> getAssosiatedShipments() {
        return assosiatedShipments;
    }

    public void setAssosiatedShipments(List<String> assosiatedShipments) {
        this.assosiatedShipments = assosiatedShipments;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<ConsignmentLineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<ConsignmentLineItem> lineItems) {
        this.lineItems = lineItems;
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
