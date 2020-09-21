package lic.pattern.decorator.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonLoggerFactory {

    public static JsonLogger getJsonLogger(Class clazz){
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}
