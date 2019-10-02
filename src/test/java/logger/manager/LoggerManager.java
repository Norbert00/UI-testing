package logger.manager;

import configuration.PropertiesLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerManager {

    private static Logger logger = LogManager.getRootLogger();

    public static void setLoggerInfo(String newInfo) {
        logger.info(newInfo);
    }

    public static void setLoggerInfo(String newInfo, String secondParameter) {
        logger.info(newInfo, secondParameter);
    }

    public static void setLoggerInfo(String newInfo, boolean booleanParameter){
        logger.info(newInfo,booleanParameter);
    }

    public static void setLoggerInfo(Class<PropertiesLoader> propertiesLoaderClass) {
        logger.info(propertiesLoaderClass);

    }
}
