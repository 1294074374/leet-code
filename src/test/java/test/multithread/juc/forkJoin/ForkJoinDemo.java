package test.multithread.juc.forkJoin;

import java.util.concurrent.RecursiveTask;

/**
 * @author laijunlin
 * @date 2021-03-31 14:07
 * 求和计算的任务
 * 1. forkjoinPool 通过它来执行
 * 2. 计算任务 forkjoinPool.execute(ForkJoinTask tak)
 * 3. 计算类要继承 ForkJoinTask
 */
public class ForkJoinDemo extends RecursiveTask<Long> {
    private Long start;//1
    private Long end;//1990900000
    // 临界值
    private Long temp = 10000L;

    public ForkJoinDemo(Long star, Long end) {
        this.start = star;
        this.end = end;
    }

    //普通算法
    public void test() {
        if ((end - start) > temp) {
            //分支合并计算
        } else {
            int sum = 0;
            for (int i = 0; i < 10_0000_0000; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }

    @Override
    protected Long compute() {
        if ((end - start) < temp) {
            Long sum = 0L;
            for (Long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {//forkjoin 递归
            long middle = (start + end) / 2;// 中间值
            ForkJoinDemo task1 = new ForkJoinDemo(start, middle);
            task1.fork();//拆分任务，把任务压入线程队列
            ForkJoinDemo task2 = new ForkJoinDemo(middle + 1, end);
            task2.fork();//拆分任务，把任务压入线程队列
            return task1.join() + task2.join();
        }
    }
}
