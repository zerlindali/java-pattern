package lic.org.alipay;


import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.kernel.AlipayConstants;
import com.alipay.easysdk.kernel.Client;
import com.alipay.easysdk.kernel.Config;
import com.alipay.easysdk.kernel.Context;
import com.alipay.easysdk.kms.aliyun.AliyunKMSClient;
import com.alipay.easysdk.kms.aliyun.AliyunKMSSigner;
import com.aliyun.tea.TeaModel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZerlindaLi create at 2020/9/26 17:49
 * @version 1.0.0
 * @description FactoryClient
 */
public class FactoryClient extends Factory {

    public static Map<String, Config> configMap;
    public static Map<String, Context> contextMap;

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
        Config options = configMap.get(cityCode);
        Context context;
        try {
            context = new Context(options, SDK_VERSION);
            contextMap.put(cityCode, context);
            if (AlipayConstants.AliyunKMS.equals(context.getConfig(AlipayConstants.SIGN_PROVIDER_CONFIG_KEY))) {
                context.setSigner(new AliyunKMSSigner(new AliyunKMSClient(TeaModel.buildMap(options))));
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /**
     * 支付能力相关
     */
    public static class Payment {

        private String cityCode;

        private static HashMap<String, Context> ContextMap;

        private static HashMap<String, Payment> paymentMap;

        private Payment(){}

        private Payment(String cityCode){
            new Payment();
            this.cityCode = cityCode;
            ContextMap.put(cityCode, contextMap.get(cityCode));
        }

        public static Payment getPayment(String cityCode){
            if(paymentMap.get(cityCode) == null){
                new Payment(cityCode);
            }
            return paymentMap.get(cityCode);
        }



        /**
         * 获取当面付相关API Client
         *
         * @return 当面付相关API Client
         */
        public  com.alipay.easysdk.payment.facetoface.Client FaceToFace() throws Exception {
            return new com.alipay.easysdk.payment.facetoface.Client(new Client(ContextMap.get(cityCode)));
        }

    }


}
