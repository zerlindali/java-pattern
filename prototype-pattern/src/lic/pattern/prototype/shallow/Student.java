package lic.pattern.prototype.shallow;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author ZerlindaLi create at 2020/9/10 10:43
 * @version 1.0.0
 * @description ListPrototye
 */
public class Student implements Cloneable, Serializable {

    private String grade;

    private int classes;

    private ArrayList<String> subjects;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public Student clone(){
        try {
            return (Student)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                ", classes=" + classes +
                ", subjects=" + subjects +
                '}';
    }
}
