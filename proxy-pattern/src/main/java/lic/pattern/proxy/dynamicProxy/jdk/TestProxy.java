package lic.pattern.proxy.dynamicProxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author ZerlindaLi create at 2020/9/15 9:57
 * @version 1.0.0
 * @description Test
 */
public class TestProxy {
    public static void main(String[] args) throws Exception {

        HuangNiu huangNiu = new HuangNiu();

        IBeiPiao zhangSan = (IBeiPiao)huangNiu.getInstance(new ZhangSan("张三"));
        zhangSan.buyTicket();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IBeiPiao.class});
        FileOutputStream fos = new FileOutputStream("e://ZhangSan.class");
        fos.write(bytes);
        fos.flush();
        fos.close();

    }
}
