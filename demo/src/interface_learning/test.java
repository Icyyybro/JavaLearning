package interface_learning;

public class test {
    public static void main(String[] args) {
        ClassManager classManager = new ClassManager();
        classManager.addStudent("wyc", "male", 100);
        classManager.addStudent("wya", "male", 99);
        classManager.addStudent("wyb", "female", 80);
        classManager.addStudent("wyd", "female", 12);

        classManager.printInfo();
        classManager.printScore();
    }
}
