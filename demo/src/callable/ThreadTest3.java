package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建callable对象
        Callable<String> call = new MyCallable(100);
        //将Callable对象封装成一个任务对象
        FutureTask<String> futureTask = new FutureTask<>(call);
        //启动线程
        new Thread(futureTask).start();

        String ans = futureTask.get();
        System.out.println(ans);

        FutureTask<String> futureTask2 = new FutureTask(new Callable() {
            @Override
            public String call() throws Exception {
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                return "线程求出的了1-" + 100 + "的和，答案为：" + sum;
            }
        });

        new Thread(futureTask2).start();

        System.out.println(futureTask2.get());
    }
}
