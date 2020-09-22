package lic.pattern.composite.demo.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZerlindaLi create at 2020/9/21 17:31
 * @version 1.0.0
 * @description FileFold
 */
public class Folder extends Director{

    private String name;
    private Integer level;

    private List<Director> dir = new ArrayList<>();

    public Folder(String name, Integer level) {
        super(name);
        this.name = name;
        this.level = level;
    }

    @Override
    void show() {
        System.out.println(this.name);
        for(Director director : dir){
            if(this.level != null){
                for(int i = 0; i<= this.level; i++){
                    System.out.print(" ");
                }
                for(int i = 0; i<= this.level; i++){
                    if(i==0)  System.out.print("+");
                    System.out.print("-");
                }
             director.show();
            }
        }
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

    public void put(Director dir) {
        this.dir.add(dir);
    }

    public void remove(Director dir) {
        this.dir.add(dir);
    }

}

