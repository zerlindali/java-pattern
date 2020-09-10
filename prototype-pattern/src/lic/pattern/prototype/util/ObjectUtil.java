package lic.pattern.prototype.util;

import lic.pattern.prototype.shallow.Student;

import java.util.ArrayList;

/**
 * @author ZerlindaLi create at 2020/9/10 11:37
 * @version 1.0.0
 * @description ObjectUtil
 */
public class ObjectUtil {

    public static Student buildStudent(){
        // 学生对象
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("语文");
        subjects.add("体育");

        Student s = new Student();
        s.setGrade("一");
        s.setClasses(2);
        s.setSubjects(subjects);

        return s;
    }
}
