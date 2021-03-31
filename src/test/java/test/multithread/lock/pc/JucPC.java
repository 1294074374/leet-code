package test.multithread.lock.pc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author laijunlin
 * @date 2021-03-26 17:19
 */
public class JucPC {
    public static void main(String[] args) throws Exception {
        final Data1 data = new Data1();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                data.increament();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                data.increament();
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                data.decrement();
            }
        }, "C").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                data.decrement();
            }
        }, "D").start();
    }
}

class Data1 {
    private int number = 0;
    Lock lock = new ReentrantLock();
    //添加锁的监视器对象
    Condition condition = lock.newCondition();

    public void increament() {
        lock.lock();
        try {//业务代码
            while (number != 0) {
                // 等待
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "=>" + number);
            // 通知其他线程我+1完毕了
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void decrement() {
        lock.lock();
        try {
            // 业务代码
            while (number == 0) {
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "=>" + number);
            // 通知其他线程我减一完毕了
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
