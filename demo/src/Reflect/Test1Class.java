package Reflect;

import org.w3c.dom.ls.LSOutput;

public class Test1Class {
    public static void main(String[] args) {
        Class c1 = Student.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println(c2.getName() == c1.getName());
    }
}
