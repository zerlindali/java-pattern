package lic.pattern.proxy.dynamicProxy.v1;

/**
 * @author ZerlindaLi create at 2020/9/15 9:57
 * @version 1.0.0
 * @description Test
 */
public class Test {
    public static void main(String[] args) {

        ZhangSanFriends zhangSanFriends = new ZhangSanFriends(new ZhangSan());
        zhangSanFriends.buyTicket();

        ZhangSanFriends zhaoLiuFriends = new ZhangSanFriends(new ZhaoLiu());
        zhaoLiuFriends.buyTicket();
    }
}
