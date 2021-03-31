package test.multithread.juc.常用;

import java.util.concurrent.CountDownLatch;

/**
 * @author laijunlin
 * @date 2021-03-29 17:09
 * 原理：
 * countDownLatch.countDown();
 * countDownLatch.await();//等待计数器归零
 * 每次有线程调用的时候countDown()数量减一，假设计数器变为0，countDownLatch.await();就会被唤醒,继续执行！
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "go out");
            }).start();
        }
        countDownLatch.countDown();
        countDownLatch.countDown();
        countDownLatch.countDown();
        countDownLatch.countDown();
        countDownLatch.countDown();
        countDownLatch.countDown();
        System.out.println("door cloes");
    }


}
