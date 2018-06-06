/*
 * Copyright 2012 - 2016 Anton Tananaev (anton@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fretron.Logger;

import com.fretron.Config;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;
import java.nio.charset.Charset;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.varia.NullAppender;


public final class Log {
    private Log() { }
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String LOGGER_NAME = "fretron-logger";
    private static final String STACK_PACKAGE = "com.fretron";
    private static final int STACK_LIMIT = 3;

    private static Logger logger = null;
    public static String getAppVersion() {
        return Log.class.getPackage().getImplementationVersion();
    }

      public static void setupLogger(Config config) throws IOException {

        Layout layout = new PatternLayout("%d{" + DATE_FORMAT + "} %5p: - %m%n");

        //file appender write logs in a file
        RollingFileAppender appender = new RollingFileAppender(layout ,config.getString("logger.file") ,true);
        appender.setMaxBackupIndex(10);
        appender.setMaxFileSize("5MB");

        //console appender write log on console
        ConsoleAppender consoleAppender = new ConsoleAppender(layout);
        consoleAppender.setTarget("System.out");

        LogManager.resetConfiguration();
        LogManager.getRootLogger().addAppender(new NullAppender());
        logger = Logger.getLogger(LOGGER_NAME);
        logger.addAppender(appender);
        logger.addAppender(consoleAppender);
        logger.setLevel(Level.toLevel(config.getString("logger.level"), Level.ALL));
        Log.logSystemInfo();

    }

    public static Logger getLogger() {
        if (logger == null) {
            logger = Logger.getLogger(LOGGER_NAME);
            logger.setLevel(Level.OFF);
        }
        return logger;
    }

    public static void logSystemInfo() {
        try {
            OperatingSystemMXBean operatingSystemBean = ManagementFactory.getOperatingSystemMXBean();
            Log.info("Operating system"
                    + " name: " + operatingSystemBean.getName()
                    + " version: " + operatingSystemBean.getVersion()
                    + " architecture: " + operatingSystemBean.getArch());

            RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
            Log.info("Java runtime"
                    + " name: " + runtimeBean.getVmName()
                    + " vendor: " + runtimeBean.getVmVendor()
                    + " version: " + runtimeBean.getVmVersion());

            MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
            Log.info("Memory limit"
                    + " heap: " + memoryBean.getHeapMemoryUsage().getMax() / (1024 * 1024) + "mb"
                    + " non-heap: " + memoryBean.getNonHeapMemoryUsage().getMax() / (1024 * 1024) + "mb");

            Log.info("Character encoding: "
                    + System.getProperty("file.encoding") + " charset: " + Charset.defaultCharset());

        } catch (Exception error) {
            Log.warning("Failed to get system info");
        }
    }

    public static void error(String msg) {
        getLogger().error(msg);
    }
    public static void error(Class clazz ,String msg){
        getLogger().error(clazz.getName() +"    "+msg);
    }


    public static void warning(String msg) {
        getLogger().warn(msg);
    }
    public static void warning(Class clazz ,String msg){
        getLogger().warn(clazz.getName() +" "+msg);
    }

    public static void warning(Throwable exception) {
        warning(null, exception);
    }

    public static void warning(String msg, Throwable exception) {
        StringBuilder s = new StringBuilder();
        if (msg != null) {
            s.append(msg);
        }
        if (exception != null) {
            if (msg != null) {
                s.append(" - ");
            }
            s.append(exceptionStack(exception));
        }
        getLogger().warn(s.toString());
    }

    public static void info(String msg) {
        getLogger().info(msg);
    }
    public static void info(Class clazz ,String msg){
        getLogger().info(clazz.getName() + "    " + msg);
    }


    public static void debug(String msg) {
        getLogger().debug(msg);
    }
    public static void debug(Class clazz ,String msg){
        getLogger().debug(clazz.getName() + "    " + msg);
    }


    public static String exceptionStack(Throwable exception) {
        StringBuilder s = new StringBuilder();
        String exceptionMsg = exception.getMessage();
        if (exceptionMsg != null) {
            s.append(exceptionMsg);
            s.append(" - ");
        }
        s.append(exception.getClass().getSimpleName());
        StackTraceElement[] stack = exception.getStackTrace();

        if (stack.length > 0) {
            int count = STACK_LIMIT;
            boolean first = true;
            boolean skip = false;
            String file = "";
            s.append(" (");
            for (StackTraceElement element : stack) {
                if (count > 0 && element.getClassName().startsWith(STACK_PACKAGE)) {
                    if (!first) {
                        s.append(" < ");
                    } else {
                        first = false;
                    }

                    if (skip) {
                        s.append("... < ");
                        skip = false;
                    }

                    if (file.equals(element.getFileName())) {
                        s.append("*");
                    } else {
                        file = element.getFileName();
                        s.append(file.substring(0, file.length() - 5)); // remove ".java"
                        count -= 1;
                    }
                    s.append(":").append(element.getLineNumber());
                } else {
                    skip = true;
                }
            }
            if (skip) {
                if (!first) {
                    s.append(" < ");
                }
                s.append("...");
            }
            s.append(")");
        }
        return s.toString();
    }


}
