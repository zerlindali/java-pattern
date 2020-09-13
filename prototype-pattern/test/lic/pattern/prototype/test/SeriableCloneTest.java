package lic.pattern.prototype.test;

import lic.pattern.prototype.shallow.Student;
import lic.pattern.prototype.util.ObjectUtil;

import java.io.*;

/**
 * @author ZerlindaLi create at 2020/9/10 11:36
 * @version 1.0.0
 * @description SeriableCloneTest
 */
public class SeriableCloneTest {

    public static void main(String[] args) {
        Student s1 = ObjectUtil.buildStudent();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Student s2 = (Student)ois.readObject();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1.getSubjects() == s2.getSubjects());

            s2.getSubjects().add("英语");

            System.out.println("==============");

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
