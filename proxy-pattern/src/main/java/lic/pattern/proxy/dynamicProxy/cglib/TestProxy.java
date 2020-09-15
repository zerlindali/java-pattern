package lic.pattern.proxy.dynamicProxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author ZerlindaLi create at 2020/9/15 9:57
 * @version 1.0.0
 * @description Test
 */
public class TestProxy {
    public static void main(String[] args) {

        // 利用CGlib的代理类可以将内存中的.class文件写入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "cglib_proxy_class/");

        HuangNiu huangNiu = new HuangNiu();

        ZhaoLiu zhaoliu = (ZhaoLiu)huangNiu.getInstance(new ZhaoLiu("赵六"), new Class[]{String.class}, new Object[]{"赵六"});
        zhaoliu.buyTicket();

    }
}
