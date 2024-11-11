package interface_learning;

import java.util.ArrayList;

public class StudentOperatorImpl_1 implements StudentOperator {

    @Override
    public void printInfo(ArrayList<Student> students) {
        System.out.println("-------------student info-------------");
        for (Student student : students) {
            System.out.printf("name: %s\tsex: %s\n", student.getName(), student.getSex());
        }
        System.out.println("--------------------------------------");
    }

    @Override
    public void printScore(ArrayList<Student> students) {
        System.out.println("-------------student grade-------------");
        for (Student student : students) {
            System.out.printf("grade: %d\n", student.getGrade());
        }
        System.out.println("--------------------------------------");
    }
}
