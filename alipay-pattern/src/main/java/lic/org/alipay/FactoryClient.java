package lic.org.alipay;


import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.kernel.Config;

import java.util.Map;

/**
 * @author ZerlindaLi create at 2020/9/26 17:49
 * @version 1.0.0
 * @description FactoryClient
 */
public class FactoryClient extends Factory {

    public static Map<String, Config> configMap;

    public void init(){
        Config config = new Config();
        config.protocol = "https";
        config.gatewayHost = "openapi.alipay.com";
        config.signType = "RSA2";
        configMap.put("4201", config);

        Config config2 = new Config();
        config2.protocol = "https";
        config2.gatewayHost = "openapi.alipay.com";
        config2.signType = "RSA2";
        configMap.put("4202", config);
    }

    public static void setOptions(String cityCode, Map<String, Config> configMap){
        Factory.setOptions(configMap.get(cityCode));
    }
}
