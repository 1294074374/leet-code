package test.multithread.thread.serial;

import java.util.concurrent.CompletableFuture;

/**
 * @author laijunlin
 * @date 2021-03-22 17:20
 */
public class CompletableFutureTest {
    public static void main(String[] args)  {
        Thread t1 = new Thread(new Work());
        Thread t2 = new Thread(new Work());
        Thread t3 = new Thread(new Work());

        CompletableFuture.runAsync(()-> t1.start())
                .thenRun(()->t2.start())
                .thenRun(()->t3.start());
    }

    static class Work implements Runnable{
        @Override
        public void run() {
            System.out.println("thread start : " + Thread.currentThread().getName());
        }
    }
}
