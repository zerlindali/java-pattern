package lic.pattern.proxy.staticProxy;

/**
 * @author ZerlindaLi create at 2020/9/15 9:39
 * @version 1.0.0
 * @description ZhangSanFriends
 */
public class ZhaoLiuFriends implements IBeiPiao {

    private ZhaoLiu zhaoliu;

    public ZhaoLiuFriends(ZhaoLiu zhaoliu){
        this.zhaoliu = zhaoliu;
    }

    @Override
    public void buyTicket() {
        before();
        zhaoliu.buyTicket();
        after();
    }

    private void before(){
        System.out.println("设置信息！"+zhaoliu);
    }

    private void after(){
        System.out.println("出票成功！");
    }
}

