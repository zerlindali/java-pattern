package lic.pattern.proxy.staticProxy;

/**
 * @author ZerlindaLi create at 2020/9/15 9:39
 * @version 1.0.0
 * @description ZhangSanFriends
 */
public class ZhangSanFriends implements IBeiPiao {

    private ZhangSan zhangsan;

    public ZhangSanFriends(ZhangSan zhangsan){
        this.zhangsan = zhangsan;
    }

    @Override
    public void buyTicket() {
        before();
        zhangsan.buyTicket();
        after();
    }

    private void before(){
        System.out.println("设置信息！"+zhangsan);
    }

    private void after(){
        System.out.println("出票成功！");
    }
}

