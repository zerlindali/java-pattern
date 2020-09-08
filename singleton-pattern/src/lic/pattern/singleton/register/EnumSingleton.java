package lic.pattern.singleton.register;

/**
 * @author ZerlindaLi create at 2020/9/4 17:39
 * @version 1.0.0
 * @description EnumSingleton
 */
public enum EnumSingleton{
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
