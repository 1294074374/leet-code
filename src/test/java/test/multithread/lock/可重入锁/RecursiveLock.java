package test.multithread.lock.可重入锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author laijunlin
 * @date 2021-03-31 16:50
 */
public class RecursiveLock {
    public static void main(String[] args) {
        Phone2 phone = new Phone2();
        new Thread(() -> {
            phone.ms();
        }, "A").start();
        System.out.println("============");
        new Thread(() -> {
            phone.ms();
        }, "B").start();
        System.out.println("============");
    }
}

class Phone2 {
    Lock lock = new ReentrantLock();
    ReadWriteLock lock2 = new ReentrantReadWriteLock();

    public void ms() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "sms");
            call();// 这里也有锁
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void call() {
        //锁必须配对
        lock2.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "call");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock2.writeLock().unlock();
        }
    }
}