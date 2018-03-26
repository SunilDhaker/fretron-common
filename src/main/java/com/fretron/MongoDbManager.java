package com.fretron;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.bson.Document;

import java.util.HashMap;

/**
 * Created by PalodRohit on 11/13/2017.
 */
public class MongoDbManager {

    public static MongoDbManager instance;

    public MongoDatabase database ;
    public MongoClient client;

    //
//    public static MongoDbManager getInstance(String host, int port , String databaseName){
//
//        if(instance == null){
//            instance = new MongoDbManager(host,port,databaseName);
//        }
//        return instance;
//    }
//
//    private MongoDbManager(String host, int port , String databaseName){
////        MongoClientURI connectionString = new MongoClientURI("mongodb://localhost");        client = new MongoClient(host,port);
//        client = new MongoClient(host  , port);
//        database = client.getDatabase(databaseName);
//    }
    public static HashMap<String, MongoDbManager> instanceMap;
    public static MongoDbManager getInstance(String host, int port , String databaseName){

//        if(instance == null){
//            instance = new MongoDbManager(host,port,databaseName);
//        }
//        return instance;

        String mapKey;
        if (databaseName!=null) {
            mapKey = host+"#"+port+"#"+databaseName;
        } else {
            mapKey = host+"#"+port;
        }
        if(instanceMap!=null){
            if(instanceMap.get(mapKey)==null){
                if (databaseName!=null) {
                    instanceMap.put(mapKey,new MongoDbManager(host,port,databaseName));
                }
                else{
                    instanceMap.put(mapKey,new MongoDbManager(host,port));
                }
            }
            return instanceMap.get(mapKey);
        }
        else{
            if (databaseName!=null) {
                return new MongoDbManager(host,port,databaseName);
            } else {
                return new MongoDbManager(host,port);
            }
        }
    }

    private MongoDbManager(String host, int port , String databaseName){
//        MongoClientURI connectionString = new MongoClientURI("mongodb://localhost");        client = new MongoClient(host,port);
        String instanceMapKey = host+"#"+port+"#"+databaseName;
        System.out.println("Mongo manager instance created for :: "+ instanceMapKey);
        if(instanceMap == null) {
            instanceMap = new HashMap<>();
        }
        instanceMap.put(instanceMapKey,this);
        client = new MongoClient(host  , port);
        database = client.getDatabase(databaseName);
    }

    private MongoDbManager(String host, int port ){
        String instanceMapKey = host+"#"+port;
        System.out.println("Mongo manager instance created for :: "+ instanceMapKey);
        if(instanceMap == null) {
            instanceMap = new HashMap<>();
        }
        instanceMap.put(instanceMapKey,this);
        client = new MongoClient(host  , port);
    }

    public MongoCollection<Document>  getCollectionFromDb(String databaseName, String collectionName){
        return  client.getDatabase(databaseName).getCollection(collectionName);
    }

    public MongoCollection<Document> getCollection(String collectionName){
        return  database.getCollection(collectionName);
    }


    public static boolean isMongoServerConnected(String host, int port, String dbName){
        boolean isConnected =  false;
        if(instanceMap!=null){
            try {
                MongoDatabase db = instanceMap.get(host+"#"+port+"#"+dbName).database;
                MongoIterable<String> iterator =  db.listCollectionNames();
                isConnected = iterator.iterator().hasNext();
            } catch (Exception e) {
                isConnected = false;
            }
        }
        return isConnected;
    }
}
