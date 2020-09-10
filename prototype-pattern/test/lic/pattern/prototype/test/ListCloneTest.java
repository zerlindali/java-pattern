package lic.pattern.prototype.test;

import lic.pattern.prototype.shallow.Student;

import java.util.ArrayList;

/**
 * @author ZerlindaLi create at 2020/9/10 10:44
 * @version 1.0.0
 * @description ListCloneTest
 */
public class ListCloneTest {
    public static void main(String[] args) {


        // 学生对象
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("语文");
        subjects.add("体育");

        Student s = new Student();
        s.setGrade("一");
        s.setClasses(2);
        s.setSubjects(subjects);

        // 为原型ArrayList赋值
        ArrayList prototype = new ArrayList();
        prototype.add("张三");
        prototype.add("李四");
        prototype.add(s);

        // 克隆一个ArrayList
        ArrayList clone = (ArrayList) prototype.clone();
        // 为克隆对象添加新的元素
        clone.add("王五");
        printTest(prototype, clone);

        // 为克隆对象的Student重新赋值
        Student shallowStudent = (Student) clone.get(2);
        clone.set(2,shallowStudent.clone());

        shallowStudent.setGrade("二");
        printTest(prototype, clone);
    }

    private static void printTest(ArrayList prototype, ArrayList clone){
        System.out.println("prototype:"+prototype);
        System.out.println("clone:"+clone);
        System.out.println("prototype.get(2) == clone.get(2):"+prototype.get(2) == clone.get(2));
    }
}
