package lic.pattern.prototype.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lic.pattern.prototype.shallow.Student;
import lic.pattern.prototype.util.ObjectUtil;

/**
 * @author ZerlindaLi create at 2020/9/10 17:39
 * @version 1.0.0
 * @description DeepCloneTest
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        Student s1 = ObjectUtil.buildStudent();
        String studentStr = JSON.toJSON(s1).toString();
        System.out.println(studentStr);

        Student s2 = JSON.parseObject(studentStr, Student.class);
        System.out.println(s2);

        s2.getSubjects().add("数学");

        System.out.println(s1.getSubjects());
        System.out.println(s2.getSubjects());
        System.out.println(s1.getSubjects() == s2.getSubjects());
    }
}
