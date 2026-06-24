package com.qa.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Properties prop;

    static {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    public static String getProperty(String key){
        return prop.getProperty(key);
    }
}