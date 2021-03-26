package test.multithread.thread.serial;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author laijunlin
 * @date 2021-03-22 16:55
 * 使用单一线程池
 */
public class SingleThreadTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            System.out.println("1");
        });

        Thread thread2 = new Thread(()->{
            System.out.println("2");
        });

        Thread thread3 = new Thread(()->{
            System.out.println("3");
        });

        ExecutorService executor  =  Executors.newSingleThreadExecutor();
        executor.submit(thread1);
        executor.submit(thread2);
        executor.submit(thread3);

        executor.shutdown();
    }
}
