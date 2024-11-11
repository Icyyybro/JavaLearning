package Exception;

import java.util.Scanner;

public class ExceptionTest2 {
    public static void main(String[] args) {
        System.out.println("请输入年龄: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        try {
            saveAge(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveAge(int age) {
        if (age > 0 && age < 150) {
            System.out.println("年龄保存成功");
        } else {
            throw new AgeIllegalRuntimeException("年龄不合法");
        }
    }
}
