package test.multithread.lock.自旋锁;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author laijunlin
 * @date 2021-03-31 16:59
 * 自旋锁
 */
public class SpinLockMyDemo {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();

        // 底层是自旋锁实现
        //SpinLockDemo lock = new SpinLockDemo();
        //new Thread(() -> {
        //    lock.myLock();
        //    try {
        //        TimeUnit.SECONDS.sleep(3);
        //    } catch (Exception e) {
        //        e.printStackTrace();
        //    } finally {
        //        lock.myUnLock();
        //    }
        //}, "T1").start();
        //TimeUnit.SECONDS.sleep(1);
        //new Thread(() -> {
        //    lock.myLock();
        //    try {
        //        TimeUnit.SECONDS.sleep(1);
        //    } catch (Exception e) {
        //        e.printStackTrace();
        //    } finally {
        //        lock.myUnLock();
        //    }
        //}, "T2").start();
    }
}
