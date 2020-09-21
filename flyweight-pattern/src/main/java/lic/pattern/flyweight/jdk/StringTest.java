package lic.pattern.flyweight.jdk;

/**
 * @author ZerlindaLi create at 2020/9/21 15:10
 * @version 1.0.0
 * @description StringTest
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = "Hello" + " World!";
        String s3 = new String("Hello") + new String(" World!");

/*        System.out.println(s1==s2);
        System.out.println(s1==s3);*/

        String ss1 = "Hello";
        String ss2 = "Hel" + "lo";
        String ss3 = new String("Hel") + new String("lo");
        String ss4 = new String("Hello");
        String ss5 = "hel";
        String ss6 = "lo";
        String ss7 = ss5 + ss6;
        String ss8 = ss4.intern();

        System.out.println(ss2==ss3);
        System.out.println(ss1==ss4);
        System.out.println(ss1==ss7);
        System.out.println(ss3==ss7);
        System.out.println(ss4==ss8);

    }
}
