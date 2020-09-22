package lic.pattern.composite.demo.transparent;

/**
 * @author ZerlindaLi create at 2020/9/21 17:31
 * @version 1.0.0
 * @description File
 */
public class File extends Director {
    private String name;

    public File(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void show() {
        System.out.println(name);
    }
}
