package lic.pattern.proxy.dynamicProxy.jdk;

/**
 * @author ZerlindaLi create at 2020/9/15 10:22
 * @version 1.0.0
 * @description ZhaoLiu
 */
public class ZhaoLiu implements IBeiPiao {

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

    @Override
    public void buyTicket() {
        System.out.println("为赵六买从深圳到武汉的票");
    }
}
