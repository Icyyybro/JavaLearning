package javabean;

public class StudentOperator {
    private Student student;

    public StudentOperator() {}

    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Sex: " + student.getSex());
    }
}
