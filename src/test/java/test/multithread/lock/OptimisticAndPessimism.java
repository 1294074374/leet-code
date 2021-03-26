package test.multithread.lock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author laijunlin
 * @date 2021-03-17 10:49
 * 乐观锁和悲观锁
 */
public class OptimisticAndPessimism {
    // 悲观锁主要由synchronized关键字和Lock的实现类实现
    public synchronized void doSomething(){
        // 同步代码
    }
    ReentrantLock lock = new ReentrantLock();
    public void doSomethingByLock(){
        lock.lock();
        try {
            // 同步代码
        }finally {
            lock.unlock();
        }
    }

    // 乐观锁调用方式
    private static AtomicInteger atomicInteger = new AtomicInteger();
    public void doSomethingByOptimistic(){
        atomicInteger.incrementAndGet();//自增加一
        System.out.println(atomicInteger.get());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(()->{
                OptimisticAndPessimism optimisticAndPessimism = new OptimisticAndPessimism();
                optimisticAndPessimism.doSomethingByOptimistic();
            });
    thread.run();
        }
    }
}
