package ThreadSafety;

public class WithDrawThread extends Thread {
    private Account acc;
    private double money;

    public WithDrawThread(String name, Account acc, double money) {
        super(name);
        this.acc = acc;
        this.money = money;
    }

    @Override
    public void run() {
        super.run();
        acc.withdrawMoney(money);
    }
}
