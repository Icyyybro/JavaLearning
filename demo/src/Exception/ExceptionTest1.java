package Exception;

public class ExceptionTest1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            System.out.println(num1 / num2);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        System.out.println("process over.\n");
    }
}
