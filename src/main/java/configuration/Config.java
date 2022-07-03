package configuration;

import java.io.*;
import java.util.Properties;

public class Config {

    public static String BASE_URL;
    public static final Properties PROPERTIES = new Properties();
    private static final String PROPS_FILE_NAME = "configs/environments.properties";

    static {
        loadProperties();
        BASE_URL = PROPERTIES.getProperty("BASE_URL");
    }

    private static void loadProperties() {
        try (final InputStream inputStream = Config.class.getClassLoader().getResourceAsStream(PROPS_FILE_NAME)) {
            if (inputStream != null) {
                PROPERTIES.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + PROPS_FILE_NAME + "' not found in the classpath");
            }
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
    }
}
