package lic.pattern.prototype.shallow;

import java.util.ArrayList;

/**
 * @author ZerlindaLi create at 2020/9/10 11:04
 * @version 1.0.0
 * @description ArrayListClone
 */
public class ArrayListClone extends ArrayList implements Cloneable {

    public Object clone() {
        ArrayList<?> v = (ArrayList<?>) super.clone();
        return v;
    }
}
