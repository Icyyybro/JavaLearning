package memberVariable;

public class main {
    public static void main(String[] args) {
        // 类变量可以直接按照类名赋值
        memberVariable.Student.identity = "Student";

        // 实例变量必须先创建类的对象
        Student s1 = new Student();
        s1.setName("Anny");
    }
}
