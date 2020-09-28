package lic.org.alipay;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws Exception {
        // 1. 设置参数（全局只需设置一次）
        FactoryClient.setOptions("4201", FactoryClient.configMap);

        FactoryClient.Payment.getPayment("4201").FaceToFace()
                // 调用agent扩展方法，设置app_auth_token，完成第三方代调用
                .agent("ca34ea491e7146cc87d25fca24c4cD11")
                .preCreate("Apple iPhone11 128G", "2234567890", "5799.00");

    }
}
