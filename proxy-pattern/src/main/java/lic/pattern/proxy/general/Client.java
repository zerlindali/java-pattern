package lic.pattern.proxy.general;

/**
 * @author ZerlindaLi create at 2020/9/15 10:17
 * @version 1.0.0
 * @description Client
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
