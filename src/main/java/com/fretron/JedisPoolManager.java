package com.fretron;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;

public class JedisPoolManager {

    private static JedisPool jedisPool;
    private static JedisPoolManager instance ;

    public static JedisPoolManager getInstance(){
        if(instance == null){
            return new JedisPoolManager();
        }
        else{
            return instance;
        }
    }

    private JedisPoolManager(){
        jedisPool = Redis.getPoolInstance();
        instance = this;
    }


    public Jedis getJedisInstance(){
        return jedisPool.getResource();
    }

    public boolean isConnected(){
        return !jedisPool.isClosed();
    }

    public void closeConnectionPool(){
        jedisPool.close();
    }
}

