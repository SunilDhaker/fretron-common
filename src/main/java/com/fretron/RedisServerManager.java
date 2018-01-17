package com.fretron;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by PalodRohit on 11/14/2017.
 */
public class RedisServerManager {


    static Jedis jedis ;
    private String host ;
    public RedisServerManager(String host)  {
        if(jedis == null ){
            this.host = host;
            jedis = new Jedis(host);
            System.out.println("Connection to Redis server sucessfully");
        }
    }


    public void saveInfo(String key, String  value){
        jedis.set(key,value);
    }

    public String getValueForKey(String key){
        List<String> list = jedis.mget(key);
        if (list.size() > 0) {
            return list.get(0);
        }

        return null;
    }

    public void deleteKey(String key){
        jedis.del(key);
    }



    public boolean isConnected(){
        boolean isConnected =  jedis.isConnected();

        if(isConnected == false){
            System.out.println("not connected to redis,, trying to reconnect");
            closeConnection();
            jedis =  new Jedis(host);
            System.out.println("Now connection establised "+jedis.ping());
            return jedis.isConnected();
        }
        return isConnected;
    }

    public void closeConnection(){
        jedis.close();
    }

    public static boolean isRedisServerConnected(){
        boolean isConnected = false;
        if(jedis!=null){
            isConnected = jedis.isConnected();
        }
        return isConnected;
    }

}
