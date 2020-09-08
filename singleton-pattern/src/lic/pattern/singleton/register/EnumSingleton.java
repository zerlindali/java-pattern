package lic.pattern.singleton.register;

/**
 * @author ZerlindaLi create at 2020/9/4 17:39
 * @version 1.0.0
 * @description EnumSingleton
 * 枚举式单例：
 * 反射：在newInstance()方法里面，我们可以看到官方禁止了通过反射实例化枚举
 *
 * 序列化：我们在readObject方法里面还是可以看到实际调用的是Enum的valueOf方法。而这个方法是通过map来取值的。
 *     public static <T extends Enum<T>> T valueOf(Class<T> enumType,
 *                                                 String name) {
 *         T result = enumType.enumConstantDirectory().get(name);
 *         if (result != null)
 *             return result;
 *         if (name == null)
 *             throw new NullPointerException("Name is null");
 *         throw new IllegalArgumentException(
 *             "No enum constant " + enumType.getCanonicalName() + "." + name);
 *     }
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
