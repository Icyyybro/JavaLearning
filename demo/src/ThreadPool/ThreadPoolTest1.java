package ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolTest1 {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(4), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        Runnable target = new MyRunnable();
        pool.execute(target);   //创建新线程
        pool.execute(target);   //创建新线程
        pool.execute(target);   //创建新线程
        pool.execute(target);   //加到任务队列
        pool.execute(target);   //加到任务队列
        pool.execute(target);   //加到任务队列
        pool.execute(target);   //加到任务队列
        pool.execute(target);   //任务队列满，创建临时线程
        pool.execute(target);   //任务队列满，创建临时线程
    }
}
