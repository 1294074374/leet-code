package test.multithread.thread.pool;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author laijunlin
 * @date 2021-03-30 16:25
 * 三大种类的线程池
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) throws Exception{
        //  单个线程
        ExecutorService singlePool = Executors.newSingleThreadExecutor();
        // 固定大小的线程池
        ExecutorService fixedTheadPool = Executors.newFixedThreadPool(5);
        // 可伸缩的线程池
        ExecutorService cachedTheadPool = Executors.newCachedThreadPool();

        //单线程池
        Thread single1 = new Thread(()->{ System.out.println("single1"); });
        Thread single2 = new Thread(()->{ System.out.println("single2"); });
        Thread single3 = new Thread(()->{ System.out.println("single3"); });
        singlePool.submit(single1);
        singlePool.submit(single2);
        singlePool.submit(single3);
        Thread.sleep(100);
        System.out.println("==================================");
        // 固定大小的线程池
        for (int i = 0; i < 10; i++) {
            fixedTheadPool.execute(new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"线程执行");
            }));
        }
        Thread.sleep(100);
        System.out.println("==================================");
        // 可伸缩的线程池
        for (int i = 0; i < 10; i++) {
            cachedTheadPool.execute(new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"线程执行");
            }));
        }

        // 程序运行完关闭线程池
        singlePool.shutdown();
        fixedTheadPool.shutdown();
        cachedTheadPool.shutdown();
    }
}
