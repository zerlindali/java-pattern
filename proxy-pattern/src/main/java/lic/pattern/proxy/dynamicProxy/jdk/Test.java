package lic.pattern.proxy.dynamicProxy.jdk;

/**
 * @author ZerlindaLi create at 2020/9/15 9:57
 * @version 1.0.0
 * @description Test
 */
public class Test {
    public static void main(String[] args) {

        HuangNiu huangNiu = new HuangNiu();

        IBeiPiao zhangSan = (IBeiPiao)huangNiu.getInstance(new ZhangSan("张三"));
        zhangSan.buyTicket();

        IBeiPiao zhaoliu = (IBeiPiao)huangNiu.getInstance(new ZhaoLiu("赵六"));
        zhaoliu.buyTicket();

        ZhaoLiu zhaoliu1 = (ZhaoLiu)huangNiu.getInstance(new ZhaoLiu("赵六"));

        zhaoliu1.buyTicket();
    }
}
