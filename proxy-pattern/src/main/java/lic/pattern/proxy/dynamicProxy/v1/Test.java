package lic.pattern.proxy.dynamicProxy.v1;

/**
 * @author ZerlindaLi create at 2020/9/15 9:57
 * @version 1.0.0
 * @description Test
 */
public class Test {
    public static void main(String[] args) {

        HuangNiu huangNiu1 = new HuangNiu(new ZhangSan());

        huangNiu1.buyTicket();

        HuangNiu huangNiu2 = new HuangNiu(new ZhaoLiu());
        huangNiu2.buyTicket();
    }
}
