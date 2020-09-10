package lic.pattern.prototype.test;

import lic.pattern.prototype.shallow.Student;

import java.util.ArrayList;

/**
 * @author ZerlindaLi create at 2020/9/10 10:52
 * @version 1.0.0
 * @description StudentShallowTest
 */
public class StudentShallowTest {
    public static void main(String[] args) {

        Student s = new Student();
        s.setGrade("一");
        s.setClasses(2);

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("语文");
        subjects.add("体育");
        s.setSubjects(subjects);

        Student s2 = s.clone();
        s2.getSubjects().add("英语");
//        subjects.add("英文");
//        s2.setSubjects();
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s2 == s);
        System.out.println(s2.getSubjects() == s.getSubjects());

    }
}
