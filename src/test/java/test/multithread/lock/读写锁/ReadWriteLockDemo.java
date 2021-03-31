package test.multithread.lock.读写锁;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 独占锁 （写锁） 一次只能被一个线程占有
 * 共享锁 （读锁） 多个线程可以同时占有
 * ReadWriteLock * 读-读 可以共存
 * 读-写 不能共存 * 写-写 不能共存
 */
public class ReadWriteLockDemo {
    public static void main(String[] args) {
        MyCacheLock myCache = new MyCacheLock();
        //写入
        for (int i = 0; i < 5; i++) {
            final int temp = i;
            new Thread(() -> {
                myCache.put(temp + "", temp + "");
            }, String.valueOf(i)).start();
        }
        //读取
        for (int i = 0; i < 5; i++) {
            final int temp = i;
            new Thread(() -> {
                myCache.get(temp + "", temp + "");
            }, String.valueOf(i)).start();
        }
    }

    static class MyCacheLock{
        // volatile 关键字确保线程可见性
        private volatile Map<String, Object> map = new HashMap<>();
        // 读写锁
        private ReadWriteLock  readWriteLock = new ReentrantReadWriteLock();
        // 存写
        public void put(String key, Object value) {
            try{
                // 上写锁
                readWriteLock.writeLock().lock();
                System.out.println(Thread.currentThread().getName() + "写入" + key);
                map.put(key, value);
                System.out.println(Thread.currentThread().getName() + "写入ok");
            }catch(Exception e){
                System.out.println("写异常");
            }finally {
                // 解除写锁
                readWriteLock.writeLock().unlock();
            }
        }

        // 取读
        public void get(String key, Object value) {
            try{
                readWriteLock.readLock().lock();
                System.out.println(Thread.currentThread().getName() + "读取" + key);
                Object o = map.get(key);
                System.out.println(Thread.currentThread().getName() + "读取ok");
            }catch(Exception e){
                System.out.println("读取异常");
            }finally {
                readWriteLock.readLock().lock();
            }
        }
    }


    // 不加锁
    static class MyCache {
        // volatile 关键字确保线程可见性
        private volatile Map<String, Object> map = new HashMap<>();

        // 存写
        public void put(String key, Object value) {
            System.out.println(Thread.currentThread().getName() + "写入" + key);
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + "写入ok");
        }

        // 取读
        public void get(String key, Object value) {
            System.out.println(Thread.currentThread().getName() + "读取" + key);
            Object o = map.get(key);
            System.out.println(Thread.currentThread().getName() + "读取ok");
        }
    }
}
