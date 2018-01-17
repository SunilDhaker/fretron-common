package com.fretron;

/**
 * Created by sdhaker on 28/06/17.
 */


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


        config = new Config();
        if (arguments.length <= 0) {
            throw new RuntimeException("Configuration file is not provided");
        }
        config.load(arguments[0]);
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
