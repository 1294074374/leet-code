package test.multithread.juc.常用;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author laijunlin
 * @date 2021-03-29 23:08
 * 场景：收集七颗龙珠召唤神龙
 * CyclicBarrier 类 可以实现凑齐足够数量的线程就开始制定任务的
 */
public class CyclicBarrierTest {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        CyclicBarrier cyclicBarrier  = new CyclicBarrier(8,()->{
            System.out.println("集齐七个龙珠了");
        });

        for (int i = 1; i <= 7; i++) {
            final  int temp = i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"收集了" + temp +"颗龙珠");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
