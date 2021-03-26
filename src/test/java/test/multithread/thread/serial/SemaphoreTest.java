package test.multithread.thread.serial;

import java.util.concurrent.CountDownLatch;

/**
 * @author laijunlin
 * @date 2021-03-22 16:19
 * 使用信号量 让ABC三个线程顺序执行
 * await() 当信号量非0时阻塞
 */
public class SemaphoreTest {


    public static void main(String[] args) {
        // 设置线程 1 的信号量为 0
        CountDownLatch cOne = new CountDownLatch(0);
        // 设置线程 2 的信号量为 1
        CountDownLatch cTwo = new CountDownLatch(1);
        // 设置线程 3 的信号量为 1
        CountDownLatch cThree = new CountDownLatch(1);

        // 因为 cOne 为 0 ,故 t1 可以直接执行
        Thread t1 = new Thread(new Work(cOne,cTwo));
        // 线程 t1 执行完毕之后,此时的 cTwo 为 0 , t2 开始执行
        Thread t2 = new Thread(new Work(cTwo,cThree));
        // 线程 t2 执行完毕,此时 cThree 为 0 , t3 开始执行
        Thread t3 = new Thread(new Work(cThree,cThree));

        t1.start();
        t2.start();
        t3.start();
    }


    static class Work implements Runnable{
        CountDownLatch cOne;
        CountDownLatch cTwo;

        public Work(CountDownLatch cOne, CountDownLatch cTwo){
            super();
            this.cOne = cOne;
            this.cTwo = cTwo;
        }
        @Override
        public void run() {
            try {
                cOne.await();
                System.out.println(Thread.currentThread().getName());
                cTwo.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
