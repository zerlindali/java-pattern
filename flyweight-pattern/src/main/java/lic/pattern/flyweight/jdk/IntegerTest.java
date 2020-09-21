package lic.pattern.flyweight.jdk;

/**
 * @author ZerlindaLi create at 2020/9/21 15:21
 * @version 1.0.0
 * @description IntegerTest
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(100);
        Integer b = 100;
        System.out.println(a == b);

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;
        System.out.println(c == d);
    }
}
