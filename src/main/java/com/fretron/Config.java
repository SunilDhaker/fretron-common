package com.fretron;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;


public class Config {

    private final Properties properties = new Properties();

    public void load(String file) throws IOException {
        try (InputStream inputStream = new FileInputStream(file)) {
            properties.loadFromXML(inputStream);
        }
    }

    public boolean hasKey(String key) {
        return properties.containsKey(key) ;
    }

    public String getString(String key) {
        if (properties.containsKey(key) ) {
            return properties.getProperty(key);
        }
        return null;
    }

    public String getString(String key, String defaultValue) {
        if (hasKey(key)) {
            return getString(key);
        } else {
            return defaultValue;
        }
    }

    public boolean getBoolean(String key) {
        return Boolean.parseBoolean(getString(key));
    }

    public int getInteger(String key) {
        return getInteger(key, 0);
    }

    public int getInteger(String key, int defaultValue) {
        if (hasKey(key)) {
            return Integer.parseInt(getString(key));
        } else {
            return defaultValue;
        }
    }

    public long getLong(String key) {
        return getLong(key, 0);
    }

    public long getLong(String key, long defaultValue) {
        if (hasKey(key)) {
            return Long.parseLong(getString(key));
        } else {
            return defaultValue;
        }
    }

    public double getDouble(String key) {
        return getDouble(key, 0.0);
    }

    public double getDouble(String key, double defaultValue) {
        if (hasKey(key)) {
            return Double.parseDouble(getString(key));
        } else {
            return defaultValue;
        }
    }


    public void put(String key , Object value){
        properties.put(key , value);
    }

    public static int createTopics(String bootstrapUrl,ArrayList<String> topicList,String creatUrl,int replicationFactor, int partitions ) throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("topics",topicList);
        jsonObject.put("replication",replicationFactor);
        jsonObject.put("partition",partitions);
        jsonObject.put("bootstrapServer",bootstrapUrl);

        //todo change IP --> write in config
        DefaultHttpClient httpClient = new DefaultHttpClient();

        HttpPost post = new HttpPost(creatUrl);
        post.setHeader("Content-type", "application/json");

        StringEntity stringEntity = new StringEntity(jsonObject.toString());
        post.setEntity(stringEntity);
        try {
            HttpResponse response =  httpClient.execute(post);
            String entity = EntityUtils.toString(response.getEntity());
            JSONObject recievedObject = new JSONObject(entity);
            if(recievedObject.has("statusCode")){
                return recievedObject.getInt("statusCode");
            }
            System.out.println(response.getEntity().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;

    }

    public static int createTopics(String bootstrapUrl,ArrayList<String> topicList,String creatUrl) throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("topics",topicList);
        jsonObject.put("bootstrapServer",bootstrapUrl);

        //todo change IP --> write in config
        DefaultHttpClient httpClient = new DefaultHttpClient();

        HttpPost post = new HttpPost(creatUrl);
        post.setHeader("Content-type", "application/json");

        StringEntity stringEntity = new StringEntity(jsonObject.toString());
        post.setEntity(stringEntity);
        try {
            HttpResponse response =  httpClient.execute(post);
            String entity = EntityUtils.toString(response.getEntity());
            JSONObject recievedObject = new JSONObject(entity);
            if(recievedObject.has("statusCode")){
                return recievedObject.getInt("statusCode");
            }
            System.out.println(response.getEntity().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;

    }
}
