package interface_learning;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperatorImpl_1();

    public ClassManager() {
    }

    public void addStudent(String name, String sex, int grade) {
        Student student = new Student();
        student.setName(name);
        student.setSex(sex);
        student.setGrade(grade);
        this.students.add(student);
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

    public void printInfo() {
        studentOperator.printInfo(students);
    }

    public void printScore() {
        studentOperator.printScore(students);
    }
}
