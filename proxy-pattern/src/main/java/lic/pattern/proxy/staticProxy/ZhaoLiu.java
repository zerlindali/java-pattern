package lic.pattern.proxy.staticProxy;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * @author ZerlindaLi create at 2020/9/15 10:22
 * @version 1.0.0
 * @description ZhaoLiu
 */
public class ZhaoLiu implements IBeiPiao {
    @Override
    public void buyTicket() {
        System.out.println("为赵六买从北京到武汉的票");
    }
}
