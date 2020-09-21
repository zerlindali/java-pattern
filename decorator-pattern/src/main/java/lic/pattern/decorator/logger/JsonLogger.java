package lic.pattern.decorator.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JsonLogger extends LoggerDecorator{

    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void error(String s) {
        super.error(s);
    }

    @Override
    public void info(String s) {
        JSONObject result = newJsonObject();
        result.put("messge", s);
        logger.info(result.toString());
    }

    public void error(Exception e) {
        JSONObject result = newJsonObject();
        result.put("execption", e.getClass().getName());
        String trace = Arrays.toString(e.getStackTrace());
        result.put("starckTrace", trace);
        logger.error(result.toString());
    }

    private JSONObject newJsonObject(){
        return new JSONObject();
    }
}
