package lambda;

public class test {
    public static void main(String[] args) {
        Swimming s = (String name) -> {
            System.out.println(name);
            System.out.println("test swimming");
        };
        s.swim("wyc");
    }
}


