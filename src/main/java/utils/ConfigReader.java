package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {
    private static Properties properties;

    static {
        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}