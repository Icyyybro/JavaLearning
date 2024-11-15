package callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        Thread t = Thread.currentThread();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return t.getName() + "线程求出的了1-" + n + "的和，答案为：" + sum;
    }
}
