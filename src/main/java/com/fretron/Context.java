package com.fretron;

/**
 * Created by sdhaker on 28/06/17.
 */


import com.fretron.Constant.Constants;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sharable things should be shared by this class
 * This context should be use to share resources between classes
 */
public final class Context {

    final static String ENVIRONMENT = "test";
    private Context() {

    }

    private static Config config;


    public static String getProp(String prop){

        return getConfig().getString(prop);
    }

    public static Config getConfig() {
        return config;
    }

    public static void init(String[] arguments) throws Exception {

        if(config == null){
            config = new Config();
        }
        if (arguments.length <= 0) {
            throw new RuntimeException("Configuration file is not provided");
        }
        for (String s : arguments) {
            try {
                config.load(s);
            } catch (IOException e) {
                Logger.getGlobal().log(Level.WARNING, "Some execption while loading property file "+e.getMessage());
            }
        }

        setSystemEnvironmentVariables(config);
    }


    public static void setSystemEnvironmentVariables(Config config){

        if (config == null) config = new Config();

        System.out.println("\n\n Environment Variables \n\n");

        Map<String ,String> map = System.getenv();
        if (!map.isEmpty()){
            if (map.containsKey(Constants.KEY_KAFKA_METADATA_SERVICE_IP) && config.hasKey(Constants.KEY_APPLICATION_SERVER)){

                String url = config.getString(Constants.KEY_APPLICATION_SERVER);
                String [] params = url.split(":");
                params[0] = map.getOrDefault(Constants.KEY_KAFKA_METADATA_SERVICE_IP ,params[0]);
                url = params[0] + ":" + params[1];
                config.put(Constants.KEY_APPLICATION_SERVER ,url);
            }

            for (Map.Entry<String, String> entry : map.entrySet()){
                config.put(entry.getKey() ,entry.getValue());
                System.out.println(entry.getKey() + " : "+entry.getValue());
            }

        }



    }

    public static String getEnvironmnet(){
        if(getConfig().getString("environment") != null){
            return getConfig().getString("environment");
        }
        else{
            return ENVIRONMENT;
        }
    }
}
