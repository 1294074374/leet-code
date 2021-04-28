package test.multithread.lock.死锁;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author laijunlin
 * @date 2021-03-31 17:05
 */
public class DeadLockDemo {

    public static void main(String[] args) {

        Lock lockA = new ReentrantLock();
        Lock lockB = new ReentrantLock();
        new MyThreadA(lockA, lockB).start();
        new MyThreadA(lockB, lockA).start();
    }
}

class MyThreadA extends Thread {
    Lock lockA;
    Lock lockB;

    MyThreadA(Lock lockA, Lock lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + "lock：" + lockA + "=>get" + lockB);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "lock：" + lockB + "=>get" + lockA);
            }
        }
    }
}

class MyThreadB extends Thread {
    Lock lockA;
    Lock lockB;

    MyThreadB(Lock lockA, Lock lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        lockB.lock();
        lockA.lock();
        System.out.println("B");
        lockB.unlock();
        lockA.unlock();
    }
}