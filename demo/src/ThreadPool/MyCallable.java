package ThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    public int Calculate() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName() + ": 计算1-" + n + "的和为: " + Calculate();
    }
}
