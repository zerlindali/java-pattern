package lic.pattern.proxy.staticProxy;

/**
 * @author ZerlindaLi create at 2020/9/15 9:57
 * @version 1.0.0
 * @description Test
 */
public class Test {
    public static void main(String[] args) {

        ZhangSanFriends zhangSanFriends = new ZhangSanFriends(new ZhangSan());
        zhangSanFriends.buyTicket();

        ZhaoLiuFriends zhaoLiuFriends = new ZhaoLiuFriends(new ZhaoLiu());
        zhaoLiuFriends.buyTicket();
    }
}
