package ThreadSafety;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String carId;
    private double money;
    private final Lock lock = new ReentrantLock();

    public Account(String carId, double money) {
        this.carId = carId;
        this.money = money;
    }

    public void withdrawMoney(double money) {
        try {
            lock.lock();
            String name = Thread.currentThread().getName();
            if (this.money >= money) {
                this.money -= money;
                System.out.println(name + "取款" + money + "元成功，余额为：" + this.money);
            } else {
                System.out.println(name + "取款失败，余额为：" + this.money);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
