package com.fretron;

/**
 * Created by sdhaker on 28/06/17.
 */


import com.fretron.Logger.Log;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sharable things should be shared by this class This context should be use to share resources
 * between classes
 */

public final class Context {

  final static String ENVIRONMENT = "test";
  private static Config config;
  private static boolean loggerEnabled;

  private Context() {

  }

  public static boolean isLoggerEnabled() {
    return loggerEnabled;
  }


  public static String getProp(String prop) {
    return getConfig().getString(prop);
  }

  public static Config getConfig() {
    return config;
  }

  public static Context init(String[] arguments) {

    if (config == null) {
      config = new Config();
    }
    if (arguments.length <= 0) {
      throw new RuntimeException("Configuration file is not provided");
    }
    for (String s : arguments) {
      try {
        config.load(s);
      } catch (IOException e) {
        Logger.getGlobal()
            .log(Level.WARNING, "Some execption while loading property file " + e.getMessage());
      }
    }

    loggerEnabled = config.getBoolean("logger.enable");
    if (loggerEnabled) {
      try {
        Log.setupLogger(config);
      } catch (IOException e) {
        Logger.getGlobal().log(Level.WARNING, "Some exception while setup logging tool.");
        e.printStackTrace();
      }
    }

    setSystemEnvironmentVariables(config);
    return new Context();
  }

  public static void setSystemEnvironmentVariables(Config config) {

    if (config == null) {
      config = new Config();
    }

    //   System.out.println("\n\n Environment Variables \n\n");

    Map<String, String> map = System.getenv();

    for (Map.Entry<String, String> entry : map.entrySet()) {
      config.put(entry.getKey(), entry.getValue());
      //   System.out.println(entry.getKey() + " : "+entry.getValue());
    }

  }

  public static String getEnvironmnet() {
    if (getConfig().getString("environment") != null) {
      return getConfig().getString("environment");
    } else {
      return ENVIRONMENT;
    }
  }
}
