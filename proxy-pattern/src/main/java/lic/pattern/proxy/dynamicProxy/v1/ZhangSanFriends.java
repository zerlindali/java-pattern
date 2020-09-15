package lic.pattern.proxy.dynamicProxy.v1;

/**
 * @author ZerlindaLi create at 2020/9/15 9:39
 * @version 1.0.0
 * @description ZhangSanFriends
 */
public class ZhangSanFriends implements IBeiPiao {

    private IBeiPiao beiPiao;

    public ZhangSanFriends(IBeiPiao beiPiao){
        this.beiPiao = beiPiao;
    }

    @Override
    public void buyTicket() {
        before();
        beiPiao.buyTicket();
        after();
    }

    private void before(){
        System.out.println("设置信息！"+beiPiao);
    }

    private void after(){
        System.out.println("出票成功！");
    }
}

