package lic.pattern.proxy.dynamicProxy.cglib;

/**
 * @author ZerlindaLi create at 2020/9/15 10:22
 * @version 1.0.0
 * @description ZhaoLiu
 */
public class ZhaoLiu {

    private String name;

    public ZhaoLiu(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ZhaoLiu{" +
                "name='" + name + '\'' +
                '}';
    }

    public void buyTicket() {
        System.out.println("为赵六买从深圳到武汉的票");
    }
}
