package lic.pattern.proxy.dynamicProxy.v1;

/**
 * @author ZerlindaLi create at 2020/9/15 9:36
 * @version 1.0.0
 * @description ZhangSan
 */
public class ZhangSan implements IBeiPiao {

    @Override
    public void buyTicket() {
        System.out.println("为张三买从北京到武汉的票");
    }
}
