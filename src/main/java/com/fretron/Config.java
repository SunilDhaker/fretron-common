package com.fretron;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import org.json.JSONObject;


public class Config {

  private final Properties properties = new Properties();

  public Config() {

  }

  public static int createTopics(String bootstrapUrl, ArrayList<String> topicList, String creatUrl,
      int replicationFactor, int partitions) throws IOException {

    JSONObject jsonObject = new JSONObject();
    jsonObject.put("topics", topicList);
    jsonObject.put("replication", replicationFactor);
    jsonObject.put("partition", partitions);
    jsonObject.put("bootstrapServer", bootstrapUrl);

    HttpRequestHepler helper = HttpRequestHepler.getInstance();
    String res = helper.makePostRequest(creatUrl, jsonObject.toString()).readEntity(String.class);
    System.out.println(res);
    return 0;

  }

  public static int createTopics(String bootstrapUrl, ArrayList<String> topicList, String creatUrl)
      throws IOException {

    JSONObject jsonObject = new JSONObject();
    jsonObject.put("topics", topicList);
    jsonObject.put("bootstrapServer", bootstrapUrl);

    HttpRequestHepler helper = HttpRequestHepler.getInstance();
    String res = helper.makePostRequest(creatUrl, jsonObject.toString()).readEntity(String.class);
    System.out.println(res);

    return 0;

  }

  public void load(String file) throws IOException {

    try (InputStream inputStream = new FileInputStream(file)) {
      Properties pTemp = new Properties();
      pTemp.loadFromXML(inputStream);
      for (Object a : pTemp.keySet()) {
        properties.put(a, pTemp.get(a));
      }
    }
  }

  public boolean hasKey(String key) {
    return properties.containsKey(key);
  }

  public String getString(String key) {
    if (properties.containsKey(key)) {
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

  public void put(String key, Object value) {
    properties.put(key, value);
  }
}
