package com.fretron;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by PalodRohit on 11/14/2017.
 */
public class RedisServerManager {


    static Jedis jedis ;
    private String host ;
    public RedisServerManager(String host)  {
        try {
            if(jedis == null ){
                this.host = host;
                jedis = new Jedis(host);
                System.out.println("Connection to Redis server sucessfully "+jedis.ping());
            }
        } catch (Exception e) {
            Logger.getGlobal().log(Level.WARNING,"Error in connecting with redis "+e.getMessage());
        }
    }


    public void saveInfo(String key, String  value){
        try {
            jedis.set(key,value);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.WARNING,"Error :: "+e.getMessage());
        }
    }

    public String getValueForKey(String key){
        try {
            List<String> list = jedis.mget(key);
            if (list.size() > 0) {
                return list.get(0);
            }
        } catch (Exception e) {
            Logger.getGlobal().log(Level.WARNING,"Error :: "+e.getMessage());
        }

        return null;
    }

    public void deleteKey(String key){
        try {
            jedis.del(key);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.WARNING,"Error :: "+e.getMessage());
        }
    }



    public boolean isConnected(){
        boolean isConnected = false;
        try {
            isConnected = jedis.isConnected();
        } catch (Exception e) {
            Logger.getGlobal().log(Level.WARNING,"Error :: "+e.getMessage());
        }

//        if(isConnected == false){
//            System.out.println("not connected to redis,, trying to reconnect");
//            closeConnection();
//            jedis =  new Jedis(host);
//            System.out.println("Now connection establised "+jedis.ping());
//            return jedis.isConnected();
//        }
        return isConnected;
    }

    public void closeConnection(){
        jedis.close();
    }

    public static boolean isRedisServerConnected(){
        boolean isConnected = false;
        if(jedis!=null){
            try {
                isConnected = jedis.isConnected();
            } catch (Exception e) {
                Logger.getGlobal().log(Level.WARNING,"Error :: "+e.getMessage());
            }
        }
        return isConnected;
    }

}
