package com.fretron.terminalModels;

import com.google.gson.GsonBuilder;

public class ResourceInfo {

    private String resourceId;
    private String resourceType;
    private String resourceIdentifier;
    private String resourceExtId;

    public ResourceInfo() {

    }

    public ResourceInfo(String resourceId, String resourceType, String resourceIdentifier, String resourceExtId) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.resourceIdentifier = resourceIdentifier;
        this.resourceExtId = resourceExtId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceIdentifier() {
        return resourceIdentifier;
    }

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    public String getResourceExtId() {
        return resourceExtId;
    }

    public void setResourceExtId(String resourceExtId) {
        this.resourceExtId = resourceExtId;
    }

    @Override
    public String toString() {
        return new GsonBuilder().serializeNulls().create().toJson(this);
    }

}
