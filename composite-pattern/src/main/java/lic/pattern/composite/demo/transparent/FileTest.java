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
        Folder fileFold = new Folder("娱乐",1);
        fileFold.put(f1);
        fileFold.put(f2);


        File f3 = new File("dd");

        Folder root = new Folder("D盘",0);
        root.put(fileFold);
        root.put(f3);

        root.show();
    }
}
