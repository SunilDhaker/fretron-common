package com.fretron;


import com.fretron.Constant.Constants;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import redis.clients.jedis.Jedis;

/**
 * Created by PalodRohit on 11/14/2017.
 */
public class RedisServerManager {

    private JedisPoolManager poolManager;
    private static RedisServerManager instance ;

    private RedisServerManager() {
         poolManager = JedisPoolManager.getInstance();
    }

    public static RedisServerManager getInstance(String host){
        if(instance == null){
            return new RedisServerManager();
        }
        else{
            return instance;
        }
    }

    public void saveInfo(String key, String value) {
        Jedis jedis = null;
        try {
            jedis = poolManager.getJedisInstance();
            jedis.set(key, value);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.WARNING, "ERROR IN SET KEY-VALUE JEDIS-- " + e.getMessage());
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public String getValueForKey(String key) {
        Jedis jedis = null;
        String value = null;
        try {
            jedis = poolManager.getJedisInstance();
            value = jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getGlobal().log(Level.WARNING, "ERROR IN GET VALUE FROM JEDIS-- " + e.getMessage());
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return value;
    }

    public static  boolean isRedisServerConnected() {
        boolean isConnected = false;
        Jedis jedis = null;

        try {
            jedis = JedisPoolManager.getInstance().getJedisInstance();
            isConnected = jedis.isConnected();
        } catch (Exception e) {
            Logger.getGlobal().log(Level.WARNING, "ERROR IN CHECKING CONNECTION WITH JEDIS-- " + e.getMessage());
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return isConnected;
    }

    public void deleteKey(String key) {
        Jedis jedis = null;
        try {
            jedis = poolManager.getJedisInstance();
            jedis.del(key);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.WARNING, "ERROR IN DELETE KEY FROM JEDIS--  " + e.getMessage());
        }
        finally {
            if(jedis!=null){
                jedis.close();
            }
        }
    }

    public boolean isConnected(){
        return poolManager.isConnected();
    }

    public Boolean tokenExist(String key) {
        Jedis jedis = null;
        boolean exist = false;
        try {
            jedis = poolManager.getJedisInstance();
            String value  = jedis.get(key);
            if(value!=null){
                exist =  true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getGlobal().log(Level.WARNING, "ERROR IN GET VALUE FROM JEDIS-- " + e.getMessage());
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return exist;
    }

    public void saveInfo(String key, Object value , int dbIndex) {
        Jedis jedis = null;
        try {
            jedis = poolManager.getJedisInstance();
            jedis.select(dbIndex);
            jedis.set(key, value.toString());
        } catch (Exception e) {
            Logger.getGlobal().log(Level.WARNING, "ERROR IN SET KEY-VALUE JEDIS-- " + e.getMessage());
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public String getValueForKey(String key , int dbIndex) {
        Jedis jedis = null;
        String value = null;
        try {
            jedis = poolManager.getJedisInstance();
            jedis.select(dbIndex);
            value = jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getGlobal().log(Level.WARNING, "ERROR IN GET VALUE FROM JEDIS-- " + e.getMessage());
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return value;
    }
}
