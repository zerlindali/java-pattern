package lic.pattern.proxy.dynamicProxy.cglib;

/**
 * @author ZerlindaLi create at 2020/9/15 9:36
 * @version 1.0.0
 * @description ZhangSan
 */
public class ZhangSan {

    private String name;

    public ZhangSan(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ZhangSan{" +
                "name='" + name + '\'' +
                '}';
    }

    public void buyTicket() {
        System.out.println("为张三买从北京到南宁的票");
    }
}
