package LowLevelDesign.loggingframework;

import LowLevelDesign.loggingframework.logappender.Fileappender;
import LowLevelDesign.loggingframework.logappender.LoggerConfig;

public class LoggerFrameworkDemo {
    public static void run(){
        Logger logger = Logger.getInstance();

        logger.info("This is an information message");
        logger.warning("This is a warning message");
        logger.error("This is an error message");

        LoggerConfig config = new LoggerConfig(LogLevel.DEBUG, new Fileappender("app.log"));
        logger.setConfig(config);

        logger.debug("This is a debug message");
        logger.info("This is an information message");
    }
}
