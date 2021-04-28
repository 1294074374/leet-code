package test.multithread.juc.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author laijunlin
 * @date 2021-03-31 16:03
 * CAS: 比较当前工作内存中的值，如果这个值是期望的，那么则执行操作！如果不是就一直循环！
 * 缺点：
 * 1. 自旋锁比较耗时
 * 2. 一次性只能保证一个共享变量的原子性
 * 3. 存在ABA问题
 */
public class CASDemo {
    AtomicInteger atomicInteger = new AtomicInteger(2020);

    //CAS compareAndSet：比较并交换!
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2020);
        //如果我期望的值达到了就更新，否则就不更新 CAS 是CPU的并发原语！
        System.out.println(atomicInteger.compareAndSet(2020, 2021));
        System.out.println(atomicInteger.get());
        atomicInteger.getAndIncrement();
        System.out.println(atomicInteger.compareAndSet(2020, 2021));
        System.out.println(atomicInteger.get());
    }
}
