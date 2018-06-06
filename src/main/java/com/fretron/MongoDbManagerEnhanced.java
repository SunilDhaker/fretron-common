package com.fretron;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.HashMap;
import org.bson.Document;

/**
 * Created by PalodRohit on 12/26/2017.
 */
public class MongoDbManagerEnhanced {

    public HashMap<String, MongoClient> clientMap;

    private static HashMap<String, MongoDbManagerEnhanced> instanceMap;

    public static MongoDbManagerEnhanced getInstance(String host, int port){
        String mapKey = host+"#"+port;
       if(instanceMap!=null){
            if(instanceMap.get(mapKey)==null){
                instanceMap.put(mapKey,new MongoDbManagerEnhanced(host,port));
            }
           return instanceMap.get(mapKey);
       }
       else{
           return new MongoDbManagerEnhanced(host,port);
       }
    }

    private MongoDbManagerEnhanced(String host, int port){
        String instanceMapKey = host+"#"+port;

        instanceMap = new HashMap<>();
        clientMap = new HashMap<>();

        instanceMap.put(instanceMapKey,this);
        clientMap.put( instanceMapKey,new MongoClient(host  , port));

    }

    public MongoClient getMongoClientFor(String host, int port){
        String instanceMapKey = host+"#"+port;
        return clientMap.get(instanceMapKey);
    }

    public MongoDatabase getDatabaseForClient(MongoClient client, String databaseName){
        if(client!=null){
            return client.getDatabase(databaseName);
        }
        return null;
    }

    public MongoCollection<Document> getCollectionForClient(MongoClient client, String databaseName, String collectionName){
        if(client!=null){
              return   client.getDatabase(databaseName).getCollection(collectionName);
        }
        return null;
    }


}
