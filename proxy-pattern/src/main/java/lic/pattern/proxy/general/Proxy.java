package lic.pattern.proxy.general;

/**
 * @author ZerlindaLi create at 2020/9/15 10:14
 * @version 1.0.0
 * @description Proxy
 * 代理模式：方法前后加强
 */
public class Proxy implements ISubject {

    private ISubject subject;

    public Proxy(ISubject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before(){}

    private void after(){}
}

