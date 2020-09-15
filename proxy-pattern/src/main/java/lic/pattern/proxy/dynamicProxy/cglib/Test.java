package lic.pattern.proxy.dynamicProxy.cglib;

/**
 * @author ZerlindaLi create at 2020/9/15 9:57
 * @version 1.0.0
 * @description Test
 */
public class Test {
    public static void main(String[] args) {

        HuangNiu huangNiu = new HuangNiu();

        ZhaoLiu zhaoliu1 = (ZhaoLiu)huangNiu.getInstance(new ZhaoLiu("赵六"), new Class[]{String.class}, new Object[]{"赵六"});
        zhaoliu1.buyTicket();

        WangMaZi wangMaZi = (WangMaZi)huangNiu.getInstance(new WangMaZi(), new Class[]{}, new Object[]{});
        wangMaZi.buyTicket();
    }
}
