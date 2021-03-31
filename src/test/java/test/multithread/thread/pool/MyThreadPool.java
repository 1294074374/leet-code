package test.multithread.thread.pool;

import java.util.concurrent.*;

/**
 * @author laijunlin
 * @date 2021-03-30 23:33
 * 自定义线程池
 */
public class MyThreadPool {
    public static void main(String[] args) {
        /** 最大线程到底该如何定义 
         *  1.CPU： 密集型，几核，就是几。可以保持CPU的效率最高 
         *  2.IO 密集型->判断你的程序十分耗IO的线程 
         *  程序: 15个大型任务,io 十分占用资源！ 
         */
        //获取CPU的核数 
        System.out.println(Runtime.getRuntime().availableProcessors());
        // 自定义线程池的七大参数
        ExecutorService threadPool = new ThreadPoolExecutor(2, //核心线程池大小
                5,//最大线程池大小
                3,//超时没有人调用就会释放
                TimeUnit.SECONDS,//超时单位
                new LinkedBlockingDeque<>(10),//阻塞队列
                Executors.defaultThreadFactory(),//线程工厂：创建线程，一般不用动
                new ThreadPoolExecutor.AbortPolicy());//拒绝策略 jdk封装有4种拒绝策略
        //程序结束要关闭线程池
        try {
            for (int i = 1; i < 50; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "ok");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
