/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fretron.Model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class JobExecutionResult extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1947081330754375325L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"JobExecutionResult\",\"namespace\":\"com.fretron.Model\",\"fields\":[{\"name\":\"status\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"error\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"response\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TpiDataPacket\",\"fields\":[{\"name\":\"vehicle\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Vehicle\",\"fields\":[{\"name\":\"customerId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleModel\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleMake\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vtsDeviceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"vehicleRegistrationNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"associatedWith\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isDeleted\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"updateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"groups\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"driverId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"attachedDocs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isTrackingEnabled\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"groupsExtended\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OrganisationGroup\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"groupName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"groupType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null}]}}],\"default\":null},{\"name\":\"truckLength\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"loadCapacity\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"floorType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"kmDriven\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"mileageLoaded\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"mileageEmpty\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updates\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Updates\",\"fields\":[{\"name\":\"forwardReasons\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"userId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"resourceType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"resourceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sourceOfInformation\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updateType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"forwardedFrom\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"revision\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"traceID\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"changes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ChangeUpdate\",\"fields\":[{\"name\":\"currentValue\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"fieldName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"lastValue\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}],\"default\":null},{\"name\":\"branch\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"OrgOffice\",\"fields\":[{\"name\":\"_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"geoLocation\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"double\"}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"contacts\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Contact\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"mobileNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"emails\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"mobileNumbers\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updatedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"branchName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"regionName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"zoneName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updates\",\"type\":[\"null\",\"Updates\"],\"default\":null},{\"name\":\"regionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"zoneId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"officeType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"materialServices\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Materials\",\"fields\":[{\"name\":\"uuid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"measurementType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"unitOfMeasurement\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"pricePerUnit\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"updates\",\"type\":[\"null\",\"Updates\"],\"default","\":null},{\"name\":\"materialType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"materialGroup\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"controlCode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"division\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"taxCode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"partnerId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"linkedMaterialId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"materialGroupId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"materialDescription\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"partnerName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"customFields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LiteCustomFields\",\"fields\":[{\"name\":\"fieldType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"fieldKey\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"indexedValue\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"valueType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"definitionId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}],\"default\":null},{\"name\":\"chassisNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleLoadType\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"LoadType\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"partnerId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"partnerName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"partnerExternalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"vehicleCategory\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"numberOfWheels\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"passingCapacityMT\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"passingCapacityCFT\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"bodyType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"chassisType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"dimensionString\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"minLength\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"includeMinLength\",\"type\":\"boolean\",\"default\":false},{\"name\":\"maxLength\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"includeMaxLength\",\"type\":\"boolean\",\"default\":false},{\"name\":\"minHeight\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"includeMinHeight\",\"type\":\"boolean\",\"default\":false},{\"name\":\"maxHeight\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"includeMaxHeight\",\"type\":\"boolean\",\"default\":false},{\"name\":\"bodyTypes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"chassisTypes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"updates\",\"type\":[\"null\",\"Updates\"],\"default\":null}]}],\"default\":null},{\"name\":\"customFields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"LiteCustomFields\"}],\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"secondaryDriverId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"device\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Device\",\"fields\":[{\"name\":\"imei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"mobileNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"manufacturerName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"isAssociated\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"isDeleted\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"createTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"updateTime\",\"type\":[\"null\",\"long\"],\"default\":null,\"logicalType\":\"timestamp-millis\"},{\"name\":\"groups\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"orgId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"status\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sharedWith\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"isSuspended\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"usedBy\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"attachedResourceId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"attachedResourceNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"externalId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"updates\",\"type\":[\"null\",\"Updates\"],\"default\":null},{\"name\":\"branchId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"serviceProvider\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"default\":null},{\"name\":\"position\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Position\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"]},{\"name\":\"attributes\",\"type\":{\"type\":\"record\",\"name\":\"Attributes\",\"fields\":[{\"name\":\"battery\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"alarm\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ip\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"distance\",\"type\":[\"null\",\"double\"]},{\"name\":\"totalDistance\",\"type\":[\"null\",\"double\"]},{\"name\":\"isCharge\",\"type\":\"boolean\",\"default\":false},{\"name\":\"chargingValue\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"ignition\",\"type\":\"boolean\",\"default\":false},{\"name\":\"ignitionValue\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"isOilElectricityConnected\",\"type\":\"boolean\",\"default\":false},{\"name\":\"oilElectricityValue\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"isGpsTrackingOn\",\"type\":\"boolean\",\"default\":false},{\"name\":\"acc\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"satellitesGpsQualityInfo\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"uploadReason\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"uploadMode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"signalStrength\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"commandResult\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"serialNumber\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"sleepMode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"gpsStatus\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ioReadings\",\"type\":[\"null\",{\"typ","e\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IOReading\",\"fields\":[{\"name\":\"pinNumber\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"unit\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"valueType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}},{\"name\":\"deviceId\",\"type\":[\"null\",\"int\"]},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"imei\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"protocol\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"serverTime\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"deviceTime\",\"type\":[\"null\",\"double\"]},{\"name\":\"fixTime\",\"type\":[\"null\",\"double\"]},{\"name\":\"decoder\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"outdated\",\"type\":\"boolean\"},{\"name\":\"valid\",\"type\":\"boolean\"},{\"name\":\"latitude\",\"type\":[\"null\",\"double\"]},{\"name\":\"longitude\",\"type\":[\"null\",\"double\"]},{\"name\":\"altitude\",\"type\":[\"null\",\"double\"]},{\"name\":\"speed\",\"type\":[\"null\",\"double\"]},{\"name\":\"course\",\"type\":[\"null\",\"double\"]},{\"name\":\"address\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"accuracy\",\"type\":[\"null\",\"int\"]},{\"name\":\"network\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"movemetState\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"totalDistance\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"obdAttributes\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"OBDAttributes\",\"fields\":[{\"name\":\"numberOfDTC\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"engineLoad\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"coolantTemperature\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"fuelPressure\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"engineRPM\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"intakeTemp\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"vehicleSpeed\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"throttlePosition\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"runTimeSinceEngineStart\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"fuelLevel\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"totalOdometer\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"distanceTravelledMILOn\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"timeRunWithMILOn\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"engineOilTemp\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"engineFuelRate\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"movement\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"axisX\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"axisY\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"axisZ\",\"type\":[\"null\",\"double\"],\"default\":null}]}],\"default\":null}]}],\"default\":null}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Integer status;
  @Deprecated public java.lang.String error;
  @Deprecated public java.util.List<com.fretron.Model.TpiDataPacket> response;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public JobExecutionResult() {}

  /**
   * All-args constructor.
   * @param status The new value for status
   * @param error The new value for error
   * @param response The new value for response
   */
  public JobExecutionResult(java.lang.Integer status, java.lang.String error, java.util.List<com.fretron.Model.TpiDataPacket> response) {
    this.status = status;
    this.error = error;
    this.response = response;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return status;
    case 1: return error;
    case 2: return response;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: status = (java.lang.Integer)value$; break;
    case 1: error = (java.lang.String)value$; break;
    case 2: response = (java.util.List<com.fretron.Model.TpiDataPacket>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.Integer getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.Integer value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'error' field.
   * @return The value of the 'error' field.
   */
  public java.lang.String getError() {
    return error;
  }

  /**
   * Sets the value of the 'error' field.
   * @param value the value to set.
   */
  public void setError(java.lang.String value) {
    this.error = value;
  }

  /**
   * Gets the value of the 'response' field.
   * @return The value of the 'response' field.
   */
  public java.util.List<com.fretron.Model.TpiDataPacket> getResponse() {
    return response;
  }

  /**
   * Sets the value of the 'response' field.
   * @param value the value to set.
   */
  public void setResponse(java.util.List<com.fretron.Model.TpiDataPacket> value) {
    this.response = value;
  }

  /**
   * Creates a new JobExecutionResult RecordBuilder.
   * @return A new JobExecutionResult RecordBuilder
   */
  public static com.fretron.Model.JobExecutionResult.Builder newBuilder() {
    return new com.fretron.Model.JobExecutionResult.Builder();
  }

  /**
   * Creates a new JobExecutionResult RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new JobExecutionResult RecordBuilder
   */
  public static com.fretron.Model.JobExecutionResult.Builder newBuilder(com.fretron.Model.JobExecutionResult.Builder other) {
    return new com.fretron.Model.JobExecutionResult.Builder(other);
  }

  /**
   * Creates a new JobExecutionResult RecordBuilder by copying an existing JobExecutionResult instance.
   * @param other The existing instance to copy.
   * @return A new JobExecutionResult RecordBuilder
   */
  public static com.fretron.Model.JobExecutionResult.Builder newBuilder(com.fretron.Model.JobExecutionResult other) {
    return new com.fretron.Model.JobExecutionResult.Builder(other);
  }

  /**
   * RecordBuilder for JobExecutionResult instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<JobExecutionResult>
    implements org.apache.avro.data.RecordBuilder<JobExecutionResult> {

    private java.lang.Integer status;
    private java.lang.String error;
    private java.util.List<com.fretron.Model.TpiDataPacket> response;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fretron.Model.JobExecutionResult.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.status)) {
        this.status = data().deepCopy(fields()[0].schema(), other.status);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.error)) {
        this.error = data().deepCopy(fields()[1].schema(), other.error);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.response)) {
        this.response = data().deepCopy(fields()[2].schema(), other.response);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing JobExecutionResult instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fretron.Model.JobExecutionResult other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.status)) {
        this.status = data().deepCopy(fields()[0].schema(), other.status);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.error)) {
        this.error = data().deepCopy(fields()[1].schema(), other.error);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.response)) {
        this.response = data().deepCopy(fields()[2].schema(), other.response);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.Integer getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.fretron.Model.JobExecutionResult.Builder setStatus(java.lang.Integer value) {
      validate(fields()[0], value);
      this.status = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.fretron.Model.JobExecutionResult.Builder clearStatus() {
      status = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'error' field.
      * @return The value.
      */
    public java.lang.String getError() {
      return error;
    }

    /**
      * Sets the value of the 'error' field.
      * @param value The value of 'error'.
      * @return This builder.
      */
    public com.fretron.Model.JobExecutionResult.Builder setError(java.lang.String value) {
      validate(fields()[1], value);
      this.error = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'error' field has been set.
      * @return True if the 'error' field has been set, false otherwise.
      */
    public boolean hasError() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'error' field.
      * @return This builder.
      */
    public com.fretron.Model.JobExecutionResult.Builder clearError() {
      error = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'response' field.
      * @return The value.
      */
    public java.util.List<com.fretron.Model.TpiDataPacket> getResponse() {
      return response;
    }

    /**
      * Sets the value of the 'response' field.
      * @param value The value of 'response'.
      * @return This builder.
      */
    public com.fretron.Model.JobExecutionResult.Builder setResponse(java.util.List<com.fretron.Model.TpiDataPacket> value) {
      validate(fields()[2], value);
      this.response = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'response' field has been set.
      * @return True if the 'response' field has been set, false otherwise.
      */
    public boolean hasResponse() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'response' field.
      * @return This builder.
      */
    public com.fretron.Model.JobExecutionResult.Builder clearResponse() {
      response = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public JobExecutionResult build() {
      try {
        JobExecutionResult record = new JobExecutionResult();
        record.status = fieldSetFlags()[0] ? this.status : (java.lang.Integer) defaultValue(fields()[0]);
        record.error = fieldSetFlags()[1] ? this.error : (java.lang.String) defaultValue(fields()[1]);
        record.response = fieldSetFlags()[2] ? this.response : (java.util.List<com.fretron.Model.TpiDataPacket>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
