package lic.pattern.composite.demo.transparent;

import java.util.List;

/**
 * @author ZerlindaLi create at 2020/9/21 17:31
 * @version 1.0.0
 * @description FileFold
 */
public class FileFold extends Director{

    private String name;
    private Integer level;

    private List<Director> dir;

    @Override
    void show() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<Director> getDir() {
        return dir;
    }

    public void setDir(List<Director> dir) {
        this.dir = dir;
    }
}
