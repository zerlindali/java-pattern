package lic.pattern.proxy.dynamicProxy.jdk;

/**
 * @author ZerlindaLi create at 2020/9/15 9:36
 * @version 1.0.0
 * @description ZhangSan
 */
public class ZhangSan implements IBeiPiao {

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

    @Override
    public void buyTicket() {
        System.out.println("为张三买从北京到武汉的票");
    }
}
