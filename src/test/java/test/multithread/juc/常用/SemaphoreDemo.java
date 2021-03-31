package test.multithread.juc.常用;

import ch.qos.logback.core.util.TimeUtil;

import java.util.concurrent.Semaphore;

/**
 * @author laijunlin
 * @date 2021-03-30 9:44
 * 场景：停车场，有停车位才能停
 * 原理：Semaphore构造设定指定的信号量数额
 * 共享资源互斥的使用！并发限流。控制最大的线程数。
 * Semaphore.acquire();该方法可以让线程获取一个信号量，当Semaphore中的信号量领取完了线程就会被挂起，直到有线程释放信号量
 * Semaphore.release();该方法可以让线程释放一个信号量。
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        //　停车场里有十个停车位
        Semaphore semaphore  = new Semaphore(5);
        for (int i = 1; i <= 10; i++) {
            new Thread(()->{
                try {
                    // 获取车位，车位减一
                    // acquire() 得到，信号量-1
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"抢到了停车位");
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName()+"离开停车位，等待下一位停车");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    // 离开车位 车位加一
                    //release() 释放 信号量+1
                    semaphore.release();
                }
            },String.valueOf(i)).start();
        }
    }
}
