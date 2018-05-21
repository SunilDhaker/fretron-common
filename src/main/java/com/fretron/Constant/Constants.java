package com.fretron.Constant;

/**
 * Created by PalodRohit on 6/28/2017.
 */
public class Constants {



    public final static String KEY_KAFKA_METADATA_SERVICE_IP = "kafka.metadata.service.ip";
    public final static String KEY_VTS_UPDATE_TOPIC= "vts.update.topic";
    public final static String KEY_TRIP_LOG_RETENTION_TIMEPERIOD= "trip.log.retention.timeperiod";
    public final static String KEY_TRIP_LOG_CLEANUP_TIME= "trip.log.cleanup.time.period";
    public final static String KEY_LAST_PUNCTUATE_TIME_STORE= "last.punctuate.time.state.store";
    public final static String KEY_STOP_TIME_THRESHOLD= "stop.time.threshold";
    public final static String KEY_TRIP_RESPONSE_STATE_STORE="trip.response.state.store";
    //Trip related constants :
    public final static String KEY_USER_GENERATED_COMMAND="user.generated.command.topic";
    public final static String KEY_BOUNDRY_POSITION_STORE = "boundry.position.state.store";
    public final static String KEY_USER_IGNORE_COMMAND="user.ignore.command.topic";
    public final static String KEY_VTSEVENT_TOPIC="vtsevent.topic";
    public final static String KEY_TRIPEVENT_TOPIC="tripevent.topic";
    public final static String KEY_VTS_TOPIC="vts.topic";
    public final static String KEY_TRIP_SUSPENDED_TOPIC="trip.suspended.topic";
    public final static String TRIP_GENERATED_EVENT_TOPIC = "trip.generated.event.topic";

    public final static String KEY_EVENT_ACTION_STORE = "trip.event.actions.store";
    public final static String KEY_VEHICLE_TRIP_STATE_STORE = "vehicle.trip.state.store";
    public final static  String KEY_TRIP_STATE_STORE="trip.state.store";
    public final static  String KEY_VEHICLE_GPS_STATE_STORE="vehicle.gps.state.store";
    public final static  String KEY_TRIP_MANAGER_NEW_APP_ID = "trip.manager.appname";
    public final static  String KEY_TRIP_REVISTED_APP_ID = "trip.revisted.appname";
    public final static  String KEY_VEHICLE_DEVICE_IMEI_STORE="vehicle.with.device.by.imei.store";
    public final static  String KEY_VEHICLE_WITH_DEVICE_TOPIC = "vehiclewithdevice.topic";
    public final static  String KEY_SHARED_VEHICLE_TOPIC="sharedvehicle.topic";
    public final static  String KEY_EXISTINGCUSTOMERS_TOPIC="existingcustomers.topic";
    public final static  String KEY_INVITEDUSER_TOPIC="inviteduser.topic";
    public final static  String KEY_BOOTSTRAP_SERVER_URL = "bootstrap.servers";
    public final static  String KEY_SCHEMA_REGISTRY_URL = "schemaregistry";
    public final static  String KEY_CUSTOMER_TOPIC = "customer.topic";
    public final static  String KEY_COMMAND_TOPIC = "command.topic";
    public final static  String KEY_VEHICLE_SHARE_TOPIC = "vehicleshare.topic";

    public final static  String KEY_DEVICE_TOPIC = "device.topic";
    public final static  String KEY_BP_TOPIC = "buisness.partner.topic";
    public final static  String KEY_VEHICLE_CUSTOMER_SHARE = "vehicleCustomerShare.topic";
    public final static  String KEY_COMMAND_RESULT_TOPIC = "commandresult.topic";
    public final static  String MINIMUM_CONSIERABLE_DIST = "minimum.considerable.distance";
    public final static  String MAXIMUM_CONSIERABLE_DIST = "maximum.considerable.distance";
    public final static  String MINIMUM_TIME_DIFF = "minimum.time.difference";



    /*
    *****************************************************************************************************
    *                                   GPS-Processor Configs
    * **************************************************************************************************
     */

    public final static  String KEY_POSITION_TOPIC = "positions.topic";
    public final static  String KEY_TPI_POSITION_TOPIC = "tpi.positions.topic";
    public final static String KEY_DEVICE_CONNECTION_STATUS_TOPIC = "device.connection.status.topic";
    public static final java.lang.String KEY_GPS_STATE_TOPIC = "gps.state.topic";
    public final static  String KEY_VEHICLE_TOPIC = "vehicle.topic";
    public static final java.lang.String KEY_LITE_POSITION_TOPIC = "liteposition.topic";
    public final static String KEY_PROCESSED_POSITIONS_TOPIC = "processedPositions.topic";


    public static  final String KEY_DEVICE_STATUS_PUNCTUATE_TIME = "device.status.punctuate.time";
    public static  final String KEY_DISCONNECTION_THRESHOLD = "disconnection.threshold";
    public static  final String KEY_GPS_STATE_PUNCTUATE_TIME = "gps.state.punctuate.time";
    public static  final String KEY_JUMP_POINT_SPEED_THRESHOLD = "jump.point.speed.threshold";
    public static  final  String KEY_MIN_WINDOW_TIME = "minimum.window.time";
    public static  final String MIN_STOPPED_STATE_TIME = "gps.stopped.state.min.time";
    public static final String MIN_MOVING_STATE_TIME = "gps.state.moving.min.time";
    public static final String WINDOW_RETENTION_TIME = "window.retention.time";
    public static final java.lang.String KEY_STOPPED_THRESHOLD = "gps.state.stopped.threshold";
    public static final String PROBABLE_MINIMUM_RECORDS = "probable.minimum.records";
    public static final String PROBABLE_MINIMUM_TIME_THRESHOLD = "probable.minimum.time.threshold";
    public static final java.lang.String PROBABLE_MINIMUM_DISTANCE_THRESHOLD = "probable.minimum.distance.threshold";
    public static final java.lang.String KEY_WINDOW_SETTLEMENT_JUMP_THRESHOLD = "window.settlement.jump.threshold";
    public static final java.lang.String KEY_MAP_MATCHING_API_JUMP_THRESHOLD = "match.map.api.max.accepted.jump";
    public static final java.lang.String KEY_MAP_MATCHING_URL = "map.match.api.url";
    public static final java.lang.String KEY_DISCONNECTED_MOVING_TIME_THRESHOLD = "disconnected.moving.time.threshold";
    public static final java.lang.String KEY_DISCONNECTED_MOVING_DISTANCE_THRESHOLD  = "disconnected.moving.distance.threshold";
    public static final java.lang.String KEY_LATEST_GPS_STATE_SERVICE_URL = "latest.gps.state.service.url";
    public static final java.lang.String KEY_LATEST_LOCATION_SERVICE_URL = "latest.position.service.url";
    public static final java.lang.String KEY_GPS_PROCESSOR_SERVICE_URL = "gps.processor.service.url";


    public static java.lang.String KEY_GPS_PROCESSOR_APP_ID = "gps.processor.app.id";
    public static java.lang.String KET_GOOGLE_GEOCODING_API_KEY = "google.geocoding.api.key";
    public static java.lang.String KEY_GPS_PROCESSOR_APP_IP = "gps.processor.rest.service.ip";
    public static java.lang.String KEY_GPS_PROCESSOR_APP_PORT = "gps.processor.rest.service.port";
    public static java.lang.String KEY_VEHICLE_ROUTE_FILLER_TOPIC = "vehicle.route.filler.topic";




 /******************************Vehicle-Route-Manager************************************************/





    //topics
    public final static  String KEY_POSITION_PROCESSER_APP_ID = "position.processor.appname";
    public static final java.lang.String KEY_VEHICLE_GPS_STATE_TOPIC = "vehiclegps.state.topic";




    //states
    public static final java.lang.String KEY_ONGOING_TEMPORARY_VEHICEL_GPS_STATE = "vehicle.ongoing.temporary.gps.state";
    public final static  String KEY_OLD_Position_Cache_State_Store ="old.position.cache.store";




    //database
    public final static  String KEY_POSITION_PROCESSOR_DATABASE_NAME = "position.processor.database.name";
    public final static  String KEY_POSITION_PROCESSOR_DATABASE_PORT = "position.processor.database.port";
    public final static  String KEY_POSITION_PROCESSOR_DATABASE_IP = "position.processor.database.ip";
    public final static  String KEY_VEHICLE_GPS_STATE_COLLECTION_NAME = "vehicle.gps.state.collectionName";



    public final static String KEY_DEVICE_DATA_BY_REMOTE_ADDRESS_STATE = "deviceDataByRemoteAddress.state";
    public final static String KEY_LAST_PROCESSED_POSITIONS_STATE = "lastprocessedpositions.state";



    public static final String MIN_STATE_TIME = "gps.state.min.time";
    public static final String  MIN_REBUILD_STATE_TIME = "rebuild.state.min.time";
    public static final String KEY_MIN_RECORD_REQUIRED = "state.min.record.required";
    public static final java.lang.String GPS_STATE_PUNCTUATE_TIME = "gps.state.punctuate.time";

    public static final java.lang.String KEY_LATEST_VEHICLE_GPS_STATE = "vehicle.gps.state";

    public static final java.lang.String STOP_SPEED_THRESHOLD = "stop.speed.threshold";

    public static final java.lang.String KEY_DISCONNECTED_THRESHOLD = "gps.state.disconnected.threshold";

    public static final java.lang.String KEY_GEOCODER = "geocoder";
    public static final String KEY_FRETRON_GEOCODER_URL = "geocoder.url";
    public static final String KEY_DEVICE_EVENT_MANGER = "device.event.manager.app.id";
    public static final String KEY_DEVICE_EVENT_TOPIC = "device.power.event.topic";
    public static java.lang.String KEY_NEW_POSITION_PROCESSER_APP_ID = "position.processor.app.id";

    public static java.lang.String KEY_GOOGLE_DIRECTION_API_KEY = "google.direction.api.key";
    public static java.lang.String KEY_SIGNUP_PREFIX = "signup.url.prefix";
    public static java.lang.String KEY_DASHBOARD_PREFIX = "dashboard.url.prefix";
    public  static java.lang.String KEY_MIN_AVOIDABLE_DISSCONNECTION_DISTANCE = "min.avoidable.disconnection.distance";


  // Alert Related Constants


    public static String KEY_ALERT_MANAGER_APP_IP = "alert.manager.restservice.ip";
    public static String KEY_ALERT_MANAGER_APP_PORT = "alert.manager.restservice.port";
    public static String KEY_STATE_DETECTOR_APP_NAME = "state.detector.app.name";
    public static String STATE_FENCE_API_URL = "state.fence.api.url";
    public static String KEY_CHECKPOINT_APP_NAME = "check.point.manager.app.name";
    public static String CHECK_POINT_TOPIC = "check.point.topic";
    public static String CHECK_POINT_EVENT_TOPIC = "check.point.event.topic";
    public static String CHECK_POINT_MANAGER_IP = "check.point.manager.ip";
    public static String CHECK_POINT_MANAGER_PORT = "check.point.manager.port";
    public static String INDIAN_STATE_TOPIC = "indian.state.topic";
    public static String ALERT_INCIDENT_TOPIC = "alert.incident.topic";





    public final static  String KEY_DEVIE_STATE_TOPIC = "devicestate.topic";
    public final static  String KEY_CUSTOMER_APP_ID = "customer.manager.appname";
    public final static  String KEY_DEVICE_APP_ID = "device.manager.appname";

    public final static  String KEY_VEHICLE_APP_ID = "vehicle.manager.appname";
    public final static  String KEY_VEHICLE_SHARE_APP_ID = "vehicleShare.manager.appname";
    public final static  String KEY_CUSTOMER_UUID_STORE="customer.by.uuid.store";
    public final static  String KEY_CUSTOMER_EMAIL_STORE="customer.by.email.store";
    public final static  String KEY_CUSTOMER_MOBILE_STORE="customer.by.mobile.store";
    public final static  String KEY_DEVICE_UUID_STORE="device.by.uuid.store";
    public final static  String KEY_DEVICE_IMEI_STORE="device.by.imei.store";
    public final static  String KEY_VEHICLE_UUID_STORE="vehicle.by.uuid.store";
    public final static  String KEY_VEHICLE_REGISTRATION_STORE="vehicle.by.registration.store";
    public final static  String KEY_VEHICLE_IMEI_STORE="vehicle.by.imei";

    public final static  String KEY_APPLICATION_SERVER="application.server.config";
    public final static  String KEY_AUTO_OFFSET_RESET_CONFIG="auto.offset.reset.config";
    //    public final static  int KEY_COMMIT_INTERVAL_AUTO_CONFIG="commit.interval.auto.config";
    public final static  String KEY_COMMIT_INTERVAL_AUTO_CONFIG="commit.interval.auto.config";
    public final static  String KEY_COMMANDER_HOST_IP="commander.host.ip";
    public final static  String KEY_COMMANDER_HOST_PORT="commander.host.port";
    public final static  String KEY_POSITION_ROCESSOR_STATE_HOST="position.processor.querablestate.host";
    public final static  String KEY_POSITION_ROCESSOR_STATE_PORT="position.processor.querablestate.port";
    public static final java.lang.String KEY_OVERSPEED_THRESHOLD = "overspeed.threshold";
    public static final java.lang.String KEY_PUNCTUATE_TIME = "position.transformer.punctuate.time";
    public static final java.lang.String KEY_OFFLINE_TIMEOUT = "offline.timeout";
    public static final String KEY_GET_TYPE="type";
    public static final String KEY_GET_ERROR="errorMessage";
    public static final String KEY_GET_STATUS="statusCode";
    public static final String KEY_EMAIL_TOPIC="email.topic";


    public final static  String KEY_UNEXPECTED_SPEED_THRESHOLD = "unexpectedspeed.threshold";
    public final static  String KEY_MAX_DEVICETIME_DIFF = "max.difference.device.time";


    public final static  String KEY_SALESENQUIRY_TOPIC = "salesenquiry.topic";
    public final static  String KEY_SALESORDER_TOPIC = "salesorder.topic";
    public final static  String KEY_BID_TOPIC = "bid.topic";
    public final static String KEY_ACCEPTOFFER_TOPIC = "acceptoffer.topic";
    public final static String KEY_TRIP_TOPIC = "trip.topic";
//    public final static String KEY_VEHICLE_TRIP_STATE_TOPIC = "vehicletripstate.topic";
//    public final static String KEY_LOADED_POSITION_TOPIC = "loadedposition.topic";
//    public final static String KEY_ACTIVE_TRIP_TOPIC = "activetrip.topic";
//    public final static String KEY_PLANNED_TRIP_TOPIC = "plannedtrip.topic";
//
//
//    public final static String KEY_VEHICLESATE_BY_VEHICLE_STORE = "vehicletripState.by.vehicle.store";
//    public final static String KEY_ACTIVE_TRIP_BY_VEHICLE_STORE = "activetrip.by.vehicle.store";
//    public final static String KEY_PLANNED_TRIP_BY_VEHICLE_STORE = "plannedtrip.by.vehicle.store";
//    public final static String KEY_VEHICLE_BY_DEVICE_ID_STORE = "vehicle.by.deviceId.store";

    public final static String KEY_ENVIRNOMNET = "environment";




    public static java.lang.String KEY_DEVICE_MANAGER_IGNORE_COMMAND =  "device.manager.ignore.comnad";
    public static java.lang.String KEY_VEHICLE_MANAGER_IGNORE_COMMAND =  "vehicle.manager.ignore.comnad";


    public static final java.lang.String KEY_MODEL_CLASS = "model.class";


    public static final java.lang.String KEY_GPS_EVENT_TOPIC = "gps.events.topic";
    public static final java.lang.String KEY_TRIP_RELATED_EVENT_INPUT_TOPIC = "trip.related.event.input.topic";
    public static final java.lang.String EXPECTED_DESTINATION_TOPIC = "expected.destination.topic";



//    ======================================================
    // Tracker Related Constants

    public final static String KEY_TRACKER_TRIP_TOPIC = "tracker.trip.topic";

    public final static String KEY_TRACKER_TRIP_RELATED_EVENT_INPUT_TOPIC = "tracker.trip.related.event.input.topic";
    public final static String KEY_TRACKER_VTSEVENT_TOPIC="tracker.vtsevent.topic";
    public final static String KEY_TRACKER_TRIPEVENT_TOPIC="tracker.tripevent.topic";
    public final static String KEY_TRACKER_VTS_TOPIC="tracker.vts.topic";
    public final static String KEY_TRACKER_VTS_UPDATE_TOPIC= "tracker.vts.update.topic";

    public final static  String KEY_TRACKER_VEHICLE_GPS_STATE_STORE="tracker.vehicle.gps.state.store";
    public final static  String TRACKER_TRIP_STORE = "tracker.trip.store";
    public final static String VTS_BY_TRACKER_TRIP_STORE = "vts.by.tracker.trip.store";
    public final static String TRIP_BY_TRACKER_TRIP_STORE = "tracker.trip.by.tracker.trip.store";
    public final static  String KEY_TRACKER_MANAGER_APP_ID = "tracker.manager.appname";
    public final static String KEY_TRACKER_BOUNDRY_POSITION_STORE = "tracker.boundry.position.state.store";
    public final static String KEY_TRACKER_EVENT_ACTION_STORE = "tracker.event.actions.store";
    public final static String KEY_TRACKER_VEHICLE_TRIP_STATE_STORE = "tracker.vehicle.trip.state.store";
    //============================================================
    //Shipment Constants
    public final static  String KEY_SHIPMENT_MANAGER_NEW_APP_ID = "shipment.manager.appname";
    public final static String SHIPMENT_COMANDER_APP_NAME = "shipment.command.handler.app.name";
    public final static String SHIPMENT_OLDTONEWSTREAM_APP = "shipment.oldtonew.stream.app.name";

    public final static  String KEY_SHIPMENT_TOPIC  = "shiment.topic";
    public final static  String KEY_SHIPMENT_STOPAGE_TOPIC  = "shiment.added.stop.topic";
    public final static  String KEY_ADDED_SHIPMENT_TRACKING_STATE_TOPIC  = "added.shiment.tracking.state.topic";
    public final static  String KEY_UPDATED_SHIPMENT_TRACKING_STATE_TOPIC  = "updated.shiment.tracking.state.topic";
    public final static String SHIPMENT_TRACKING_REQUEST_TOPIC="shipment.tracking.request.topic";
    public final static  String KEY_SHIPMENT_STATE_UPDATED_TOPIC  = "shipment.state.updated.topic";
    public final static  String SHIPMENT_REALTED_EVENT_TOPIC = "shipment.related.event.topic";

    public final static String SHIPMENT_TRACKING_STATE_STORE="shipment.tracking.state.store";
    public final static String SHIPMENT_BY_TRIPID_STORE="shipment.by.tripid.state.store";
    public final static String SHIPMENT_BY_SHIPMENT_ID_STORE = "shiment.by.shipment.id.store";
    public final static String MANUALLY_ADDED_SHIPMENT_STOP_STORE = "manully.added.shipment.state.store";
    public final static String VEHICLE_BY_VEHICLE_ID_STORE="vehicle.by.vehicleId.store.for.shipment";
    public final static String SHIPMENT_BY_IMEI_STORE="shipmentId.by.imei.store";

    //=========================================
    public final static String MANUAL_TRACKING_APP_NAME = "manual.tracking.app.name";
    public final static String MANUAL_TRIP_EVENTS_TOPIC = "manual.trip.event.topic";
    public final static String MANUAL_TRIP_VTS_TOPIC = "manual.trip.vts.topic";
    //=========================================

    public final static String REGISTRY_MANAGER_APPID= "registry.manager.appId";
    public final static String LATEST_COMMAND_TOPIC= "latest.command.topic";
    public static java.lang.String KEY_COMMAND_TYPE = "filter";

    //========================================
    public static final String KEY_HOUR_WISE_STATE_PROCESSORE_APP_ID = "hour.wise.state.processor.appid";
    public static final String KEY_EVALUATE_TIME="evaluate.time";
    public final static String KEY_HOUR_WISE_MOV_TOPIC="hour.mov.topic";
    public static final String KEY_HOUR_WISE_GPS_STATE_STORE= "vehicle.hour.log";
    public static final String KEY_LATEST_VEHICLE_MOVMENT_LOG="latest.vehicle.mov.log";
    //=========================================

    //=======================ALERT_MANAGER=================
    public static final String KEY_ALERT_MANAGER_APP_ID = "alert.manager.app.id";
    public static final String KEY_ALERT_TOPIC = "alert.topic";

    //=========================USER_MANAGER================
    public static final String KEY_USER_MANAGER_APP_ID = "user.manager.app.id";
    public static final String KEY_USER_TOPIC = "user.topic";

    //========================ORGANISATION_MANAGER=================

    public static final String KEY_ORGANISATION_MANAGER_APP_ID = "organisation.manager.app.id";
    public static final String KEY_ORGANISATION_TOPIC = "organisation.topic";
    public static final String KEY_USERS_BY_ORGANISATION_TOPIC = "usersbyorganisation.topic";
    public static final String KEY_ORGANISAIONS_BY_USER_TOPIC = "organisationsbyuser.topic";
    public static final String KEY_ORG_USER_ACL_TOPIC = "orguseracl.topic";

    //==========================TRIP_TEMPLATE_MANAGER===============

    public static final String KEY_TRIP_TEMPLATE_MANAGER_APP_ID = "trip.tamplate.manager.app.id";
    public static final String KEY_TRIP_TEMPLATE_TOPIC = "trip.tamplate.topic";

    //========================ORGANISATION_GROUP_MANAGER=================

    public static final String KEY_ORGANISATION_GROUP_MANAGER_APP_ID = "org.group.manager.app.id";
    public static final String KEY_ORGANISATION_GROUP_TOPIC = "org.group.topic";

    //======================KAFKA-TOPICS===================
    public static final String KEY_KAFKA_TOPIC_PARTITION = "kafka.topic.partition";
    public static final String KEY_KAFKA_TOPIC_REPLICATION_FACTOR= "kafka.topic.replication.factor";
    public static final String KEY_TOPIC_CREATE_SERVICE_URL ="kafka.topic.create.service.url";

    //    ======================FREIGHT-LOCATION-MANAGER========================

    public static final String FRIGHT_MANAGER_SERVICE_PORT = "freight.manager.service.port";
    public static final String FRIGHT_LOCATION_TOPIC = "freight.location.topic";
    public static final String FRIGHT_LOCATION_DB_NAME = "freight.location.db.name";
    public static final String FR_LOC_ALL_COLLECTION_NAME = "freight.location.all.collection.name";
    public static final String FR_LOC_FAV_COLLECTION_NAME = "freight.location.fav.collection.name";
    public static final String FR_LOC_RECENT_COLLECTION_NAME = "freight.location.recent.collection.name";
            //*************NEW**************//
    public static final String GEOFENCE_MANAGER_SERVICE_PORT = "geofence.service.port";
    public static final String ADMIN_BOUNDARY_MANAGER_SERVICE_PORT = "adminboundary.service.port";
    public static final String ADMIN_GEOFENCE_DB_NAME = "admin.geofence.db.name";
    public static final String GEOFENCE_COLLECTION_NAME = "geofence.collection.name";
    public static final String ADMIN_BOUNDARY_COLLECTION_NAME = "admin.boundary.collection.name";

    public static final String ADMIN_STATES_COLLECTION_NAME = "admin.states.collection.name";
    public static final String ADMIN_SUB_DISTS_COLLECTION_NAME = "admin.subdists.collection.name";
    public static final String ADMIN_VILLAGES_COLLECTION_NAME = "admin.villages.collection.name";


    //=======================IP AND PORTS ===============

    public static final String REGISTRY_SERVICE_URL = "registry.manager.service.url";
    public static final String REGISTRY_APP_IP = "registry.manager.restservice.ip";
    public static final String REGISTRY_APP_PORT = "registry.manager.restservice.port";

    public static final String ORGANIZATION_SERVICE_URL = "organization.manager.service.url";
    public static final String ORGANIZATION_APP_IP = "organization.manager.restservice.ip";
    public static final String ORGANIZATION_APP_PORT = "organization.manager.restservice.port";

    public static final String GROUP_APP_IP = "group.manager.restservice.ip";
    public static final String GROUP_APP_PORT = "group.manager.restservice.port";

    public static final String TRIPTEMP_APP_IP = "triptemplate.manager.restservice.ip";
    public static final String TRIPTEMP_APP_PORT = "triptemplate.manager.restservice.port";

    public static final String UTURN_PREDICTOR_APP_IP = "uturn.detector.restservice.ip";
    public static final String UTURN_PREDICTOR_APP_PORT = "uturn.detector.restservice.port";

    public static final String USER_APP_IP = "user.manager.restservice.ip";
    public static final String USER_APP_PORT = "user.manager.restservice.port";
    public static final String MONGO_DB_IP = "mongodb.server.ip";
    public static final String MONGO_DB_PORT = "mongodb.server.port";
    public static final String REDIS_SERVER_IP = "redis.server.ip";
    public static final String MONGO_DB_NAME = "mongodb.database.name";
    public static final String POSTION_SERVICE_URL = "position.processor.service.url";
    public static final String POSTION_APP_IP = "position.processor.restservice.ip";
    public static final String POSITION_APP_PORT = "position.processor.restservice.port";

    public static final String KAFKATOPIC_APP_IP = "kafkatopics.app.ip";
    public static final String KAFKATOPIC_APP_PORT = "kafkatopics.app.port";

    public static final String TRIPMANAGER_SERVICE_URL = "trip.manager.new.service.url";
    public static final String TRIPMANAGER_APP_IP = "trip.manager.new.restservice.ip";
    public static final String TRIPMANAGER_APP_PORT = "trip.manager.new.restservice.port";


    public static final String QUERY_SERVER_GEOADD_SERVICE_URL = "query.server.service.url";
    public static final String QUERY_SERVER_GEOADD_IP = "query.server.service.ip";
    public static final String QUERY_SERVER_GEOADD_PORT = "query.server.service.port";

    public static final String VEHICLE_STATE_MONGO_DB_HOST = "vehicle.state.mongodb.host";
    public static final String VEHICLE_STATE_MONGO_DB_PORT = "vehicle.state.mongodb.port";
    public static final String VEHICLE_STATE_MONGO_DB_NAME = "vehicle.state.mongodb.name";



    public static final String SHIPMENT_MANAGER_APP_IP = "shipment.manager.restservice.ip";
    public static final String SHIPMENT_MANAGER_APP_PORT = "shipment.manager.restservice.port";
    public static final String SHIPMENT_MANAGER_SERVICE_URL = "shipment.manager.service.url";

    public static final String MANUAL_SHIPMENT_MANAGER_SERVICE_URL = "manual.tracking.manager.service.url";
    public static final String MANUAL_SHIPMENT_MANAGER_APP_IP = "manual.tracking.manager.restservice.ip";
    public static final String MANUAL_SHIPMENT_MANAGER_APP_PORT = "manual.tracking.manager.restservice.port";

    public static final String TRACKER_MANAGER_SERVICE_URL = "tracker.manager.service.url";
    public static final String TRACKER_MANAGER_APP_IP = "tracker.manager.restservice.ip";
    public static final String TRACKER_MANAGER_APP_PORT = "tracker.manager.restservice.port";

    public static final String GPS_LOG_MONGO_HOST = "gps.log.mongo.server.ip";
    public static final String GPS_LOG_MONGO_PORT = "gps.log.mongo.server.port";
    public static final String GPS_LOG_MONGO_DBNAME = "gps.log.mongo.db.name";
    public static final String VEHICLE_ACTIVITY_DB_NAME= "vehicle.activity.log.db";
    public static final String VEHICLE_ACTIVITY_COLLECTION_NAME = "vehicle.hourwise.movement.activity.collaction";
    public static final String GPS_MIS_COLLECTION_NAME = "gps.mis.collaction";


    public static final String TRIP_MONGO_HOST = "trip.mongo.server.ip";
    public static final String TRIP_MONGO_PORT = "trip.mongo.server.port";
    public static final String TRIP_MONGO_DBNAME = "trip.mongo.db.name";
    public static final String TRIP_MONGO_COLLECTION_NAME = "trip.mongo.collection.name";

    //=========================================



    public static final String GOD_USER_SECRET = "fretron.god.user.secret";
    public static final String FRETRON_GOD_FO = "fretron.god.fo";
    public static final String FRETRON_GOD_TRANS = "fretron.god.transporter";
    public static final String FRETRON_GOD_SHIP = "fretron.god.shipper";
    public static final String FRETRON_GOD_FO_AGENT = "fretron.god.fo.agent";


    //======================================================

    public static final String SHIPMENT_COLLECTION_NAME = "shipment.collection.name";
    public static final String SHIPMENT_DB_NAME = "shipment.db.name";
    public static final String SHIPMENT_DB_PORT = "shipment.db.port";
    public static final String SHIPMENT_DB_HOST = "shipment.db.host";

    public static final String KEY_DRIVER_TOPIC = "driver.topic";
    public static final String DRIVER_DB_NAME = "driver.db.name";
    public static final String DRIVER_DB_HOST = "driver.db.host";
    public static final String DRIVER_DB_PORT = "driver.db.port";
    public static final String DRIVER_DB_COLLECTION_NAME = "driver.db.collection.name";

    public static final String VEHICLE_DB_NAME = "vehicle.db.name";
    public static final String VEHICLE_DB_HOST = "vehicle.db.host";
    public static final String VEHICLE_DB_PORT = "vehicle.db.port";
    public static final String VEHICLE_DB_COLLECTION_NAME = "vehicle.db.collection.name";
    public static final String GROUP_DB_COLLECTION_NAME = "group.db.collection.name";

    public static final String DEVICE_DB_NAME = "device.db.name";
    public static final String DEVICE_DB_HOST = "device.db.host";
    public static final String DEVICE_DB_PORT = "device.db.port";
    public static final String DEVICE_DB_COLLECTION_NAME = "device.db.collection.name";

    public static final String BPARTNER_DB_NAME = "buisness.partner.db.name";
    public static final String BPARTNER_DB_HOST = "buisness.partner.db.host";
    public static final String BPARTNER_DB_PORT = "buisness.partner.db.port";
    public static final String BPARTNER_DB_COLLECTION_NAME = "buisness.partner.db.collection.name";

    public static final String KEY_DOCUMENT_TOPIC = "document.topic";
    public static final String DOCUMENT_DB_NAME = "document.db.name";
    public static final String DOCUMENT_DB_HOST = "document.db.host";
    public static final String DOCUMENT_DB_PORT = "document.db.port";
    public static final String DOCUMENT_DB_COLLECTION_NAME = "document.db.collection.name";

    public static final String ORGANISATION_DB_NAME = "organisation.db.name";
    public static final String ORGANISATION_DB_HOST = "organisation.db.host";
    public static final String ORGANISATION_DB_PORT = "organisation.db.port";
    public static final String ORGANISATION_DB_COLLECTION_NAME = "organisation.db.collection.name";
    public static final String USER_COLLECTION_NAME = "user.db.collection.name";

    public static final String USER_ORG_DB_NAME = "user.org.db.name";
    public static final String USER_ORG_DB_HOST = "user.org.db.host";
    public static final String USER_ORG_DB_PORT = "user.org.db.port";
    public static final String USER_ORG_DB_COLLECTION_NAME = "user.org.db.collection.name";

    public static final String USER_DB_NAME = "user.db.name";
    public static final String USER_DB_HOST = "user.db.host";
    public static final String USER_DB_PORT = "user.db.port";

    public static final String ALERT_MONGODB_NAME = "alert.mongo.db.name" ;
    //========================================= TracementManager========================================

    public static final String KEY_INTEGRATION_MANAGER_APP_ID = "integration.manager.app.id";
    public static final String KEY_JOB_EVENTS_TOPIC = "integration.job.events.topic";
    public static final String KEY_JOB_EXECUTION_EVENTS_TOPIC = "integration.job.execution.topic";
    public static final String KEY_JOB_RAW_RESPONSE_TOPIC = "integration.job.raw.response.topic";
    public static final String KEY_INTEGRATION_MANAGER_IP = "integration.manager.restservices.ip";
    public static final String KEY_INTEGRATION_MANAGER_PORT = "integration.manager.restservices.port";



    public final static String KEY_INTEGRATION_MANAGER_DATABASE_IP = "integration.manager.mongodb.server.ip";
    public final static String KEY_INTEGRATION_MANAGER_DATABASE_PORT = "integration.manager.mongodb.server.port";

    public final static String KEY_INTEGRATION_MANAGER_DATABASE_NAME = "integration.manager.mongodb.server.database";
    public final static String KEY_MONGODB_JOB_COLLECTION_NAME = "mongodb.server.integration.job.collection.name";
    public final static String KEY_MONGODB_RESPONSE_COLLECTION_NAME = "mongodb.server.response.collection.name";


    public final static String KEY_TF_TOKEN_API_URL = "tatafleetman.getToken";
    public  final static String KEY_TF_TRACK_VEHICLE_API_URL = "tatafleetman.track.vehicle";
    public  final static String KEY_TRACK_YOUR_FLEET_API_URL = "track.your.fleet.api.url";
    public  final static String KEY_TRUCK_SUVIDHA_API_URL = "truck.suvidha.api.url";
    public  final static String KEY_ALLEY_TRACK_POINT_API_URL = "alley.track.point.api.url";
    public  final static String KEY_ETRANS_SOLUTIONS_LOGIN_SESSION_API_URL = "etrans.solutions.login.session.api.url";
    public  final static String KEY_ETRANS_SOLUTIONS_VEHICLE_TRACKING_API_URL = "etrans.solutions.vehicle.tracking.api.url";
    public final static String KEY_JOB_SCHEDULE_TIME = "integration.job.schedule.time";
    public final static String KEY_ETRANS_API_URL = "etrans.login.url";
    public final  static String KEY_WEBHOOK_INTEGRATION_API_URL = "integrations.webhook.api.url";
    public final  static String KEY_ROOSTER_INTEGRATION_API_URL = "integrations.roosterInfo.api.url";

     public final static double ep = 0.0001;


    //******************************Protocol-eventproducer*****************************************************
    public final static  String KEY_TRACKER_SERVER_IP = "tracker.server.ip";
    public final static  String KEY_TRACKER_SERVER_PORT = "tracker.server.port";
    public final static String KEY_PROTOCOL_EVENT_TOPIC = "protocol.events.topic";
   public final static  String KEY_PROTOCOL_HANDLER_APP_ID = "protocol.handler.appname";
   public final static String KEY_CONCOX_PROCESSED_POSITIONS_TOPIC = "concox.processed.positions.topic";




   public final  static String KEY_PROTOCOL_TIMEZONE = "protocolTimezoneOffsetKey";
    public final static String KEY_DEVICE_IMEI = "deviceIMEIKEY";

    public final static String KEY_PROTOCOL_NAME = "protocol.name";

    public final static String KEY_DEVICE_SESSION_TOPIC = "device.session.topic";
    public final static String KEY_DEVICE_DATA_TOPIC = "deviceData.topic";
    public final static String KEY_VEHICLE_STATUS_DATA_TOPIC = "vehicle.statusData.topic";
    public final static String KEY_DEVICE_DATA_BY_REMOTE_ADDRESS_STORE = "deviceDataByRemoteAddress.store";
    public final static String KEY_RAW_POSITIONS_TOPIC = "rawpositions.topic";
    public final static String KEY_LAST_PROCESSED_POSITIONS_STORE = "lastprocessedpositions.store";

    //**********************Token Manager ******************************************************************************/
    public final static String KEY_TOKEN_MANAGER_APP_ID = "token.manager.app.id";

    public final static String KEY_QUEUE_TOPIC="queue.topic";
    public final static String KEY_QUEUE_TOKEN_TOPIC="queue.tokon.topic";
    public final static String KEY_VLR_TOPIC="vlr.topic";

    public final static String KEY_TOKEN_MANAGER_IP="token.manager.restservice.ip";
    public final static String KEY_TOKEN_MANAGER_PORT="token.manager.restservice.port";

    public final static String KEY_TOKEN_MANAGER_MONGODB_NAME="token.manager.db.name";
    public final static String KEY_TOKEN_MANAGER_MONGODB_HOST="token.manager.db.host";
    public final static String KEY_TOKEN_MANAGER_MONGODB_PORT="token.manager.db.port";
    public final static String KEY_TOKEN_MONGODB_COLLECTION_NAME="token.db.collection.name";
    public final static String KEY_QUEUE_MONGODB_COLLECTION_NAME="queue.db.collection.name";
    public final static String KEY_VLR_MONGODB_COLLECTION_NAME="vlr.db.collection.name";

    //========================DASHBOARD_MANAGER=================

    public static final String KEY_DASHBOARD_MANAGER_APP_ID = "dashboard.manager.app.id";
    public static final String KEY_VEHICLE_ACCESSIBLE_DB_NAME ="vehicle.accessible.db.name";
    public static final String DASHBOARD_APP_IP = "dashboard.manager.restservice.ip";
    public static final String DASHBOARD_APP_PORT = "dashbaord.manager.restservice.port";
    public static final String DASHBOARD_TOPIC = "dashboard.topic";
    public final static String KEY_VEHICLE_ACCESSIBLE_COLLECTION ="vehicle.accessible.db.collection.name";
    public final static String KEY_DASHBOARD_STATE_STORE_BY_UUID = "dashboard.state.store";
    public final static String KEY_DASHBOARD_SOCKET_HOST =  "socket.server.host";
    public final static String KEY_DASHBOARD_SOCKET_PORT =  "socket.server.port";
    public final static String KEY_VGS_CHANGELOG_TOPIC = "vgs.changelog.topic";
    public final static String GET_DEVIECE_STATUS_URL = "device.status.url";
    public final static String GET_VILLAGE_NAME_URL = "get.village.name.url";
    //==================TRIP-MIS===============================

    public static final String KEY_TRIP_MIS_REPORT_APP_ID="trip.mis.report.app.id";
    public static final String KEY_TRIP_MIS_TOPIC="tripmis.topic";
    public static final String KEY_VGS_MIS_TOPIC="vgsmis.topic";

    public static final String STOP_CLASSIFIER_DB_NAME = "stop.classifier.db.name";
    public static final String STOP_CLASSIFIER_COLLECTION_NAME = "stop.classifier.collection.name";


   public static final String TRIP_UPLOAD_JOB_COLLECTION_NAME = "trip.upload.job.collection.name";
   public static final String UPLOADED_TRIPS_COLLECTION_NAME = "uploaded.trips.collection.name";
    public static final String CITY_WISE_GEOFENCE_DB_NAME = "city.geofence.db.name";
    public static final String CITY_WISE_GEOFENCE_COLLECTION_NAME = "city.geofence.collection.name";
    public static final String CITY_WISE_GEOFENCE_DB_HOST = "city.geofence.db.host";
    public static final String CITY_WISE_GEOFENCE_DB_PORT= "city.geofence.db.port";
    public static final String UNIQUE_FLS_COLLECTION_NAME = "unique.fls.collection.name";




    /*
     *****************************************************************************************************
     *                                   vehicle-activity-manager-configs
     * **************************************************************************************************
     */
    public static java.lang.String KEY_VEHICLE_ACTIVITY_MANAGER_APP_ID = "vehicle.activity.manager.app.id";
    public static java.lang.String KEY_VEHICLE_ACTIVITY_TOPIC = "vehicle.activity.topic";
    public static final String VEHICLE_ACTIVITY_LOG_DB_HOST = "vehicle.activity.log.mongo.server.ip";
    public static final String VEHICLE_ACTIVITY_LOG_DB_PORT = "vehicle.activity.log.mongo.server.port";
    public static final String VEHICLE_ACTIVITY_LOG_DB_NAME = "vehicle.activity.log.mongo.db.name";
    public static final String VEHICLE_ACTIVITY_SERVICE_IP = "vehicle.activity.rest.service.ip";
    public static final String VEHICLE_ACTIVITY_SERVICE_PORT = "vehicle.activity.rest.service.port";


    public static final String TRIP_MIS_SERVICE_PORT = "trip.mis.restservices.port";
    public static final String TRIP_MIS_APP_IP = "trip.mis.restservices.ip";


    private Constants(){

    }
}
