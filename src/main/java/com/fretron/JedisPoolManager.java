package com.fretron;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;

public class JedisPoolManager {

    private static JedisPool jedisPool;
    private static JedisPoolManager instance ;

    public static JedisPoolManager getInstance(String host){
        if(instance == null){
            return new JedisPoolManager(host);
        }
        else{
            return instance;
        }
    }

    private JedisPoolManager(String host){
//        JedisPoolConfig poolConfig = buildPoolConfig();
//        jedisPool = new JedisPool(poolConfig, host);
        jedisPool = Redis.getPoolInstance();
        instance = this;
    }

    private JedisPoolConfig buildPoolConfig() {
        final JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(128);
        poolConfig.setMaxIdle(128);
        poolConfig.setMinIdle(16);
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestOnReturn(true);
        poolConfig.setTestWhileIdle(true);
        poolConfig.setMinEvictableIdleTimeMillis(Duration.ofSeconds(60).toMillis());
        poolConfig.setTimeBetweenEvictionRunsMillis(Duration.ofSeconds(30).toMillis());
        poolConfig.setNumTestsPerEvictionRun(3);
        poolConfig.setBlockWhenExhausted(true);
        return poolConfig;
    }

    public Jedis getJedisInstance(){
        return Redis.getPoolInstance().getResource();
    }

}

