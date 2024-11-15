package ThreadSafety;

public class ThreadTest {
    public static void main(String[] args) {
        Account account = new Account("WYC", 100000);
        new WithDrawThread("小红", account, 100000).start();
        new WithDrawThread("小明", account, 100000).start();
    }
}
