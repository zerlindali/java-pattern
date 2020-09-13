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
        System.out.println("change before prototype:"+s);
        System.out.println("change before clone:"+s2);
        System.out.println("change before s2 == s :"+(s2 == s));
        System.out.println("change before s2.getSubjects() == s.getSubjects() :" + (s2.getSubjects() == s.getSubjects()));
        s2.setClasses(5);
        s2.getSubjects().add("英语");
        System.out.println("=======================");
        System.out.println("change after prototype:"+s);
        System.out.println("change after clone:"+s2);
        System.out.println("change after s2 == s :"+(s2 == s));
        System.out.println("change after s2.getSubjects() == s.getSubjects() :" + (s2.getSubjects() == s.getSubjects()));

    }
}
