package lic.pattern.decorator.logger;

import org.slf4j.Logger;

public class Test {

    private static Logger logger = JsonLoggerFactory.getJsonLogger(Test.class);

    public static void main(String[] args) {
        logger.info("系统错误");

    }
}
