package lic.pattern.composite.demo.transparent;

/**
 * @author ZerlindaLi create at 2020/9/21 17:33
 * @version 1.0.0
 * @description FileTest
 */
public class FileTest {
    public static void main(String[] args) {

        File f1 = new File("qq");
        File f2 = new File("wx");
        FileFold fileFold = new FileFold();
        fileFold.setName("娱乐");
        fileFold.setLevel(1);
        fileFold.getDir().add(f1);
        fileFold.getDir().add(f2);


        File f3 = new File("dd");
    }
}
