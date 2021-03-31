package test.multithread.blockingqueue;

import ch.qos.logback.core.util.TimeUtil;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author laijunlin
 * @date 2021-03-30 13:56
 * 学会使用队列：四组API
 * 1. 抛出异常
 *      add: 往队列尾部添加一个元素，当队列已经满了时会抛出异常java.lang.IllegalStateException:Queue full
 *      remove: 删除队列头部的一个元素，当队列为空时会抛出异常 NoSuchElementException
 *      element: 返回队列头部的一个元素，当队列为空时会抛出异常 NoSuchElementException
 * 2. 不会抛出异常（有特殊返回值）
 *      offer:往队列尾部添加一个元素，当队列已经满了时返回false
 *      poll:返回队列头部的一个元素，并移除这个元素，当队列为空时返回null
 *      peek:返回队列头部的一个元素，但不移除这个元素，当队列为空时返回null
 * 3. 阻塞 等待
 *      put: 往队列中添加一个元素，当队列为满时则阻塞等待队列有空位时添加
 *      take: 返回队列头部的一个元素，并移除这个元素，当队列为空时则等待队列生产
 * 4. 超时等待 offer() poll
 */
public class ArrayBlockingQueueDemo {
    // 初始化一个长度为3的阻塞队列
    ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(3);

    /**
     * 抛出异常
     */
    public void test1() {
        // add: 往队列尾部添加一个元素，当队列已经满了时会抛出异常java.lang.IllegalStateException:Queue full
        arrayBlockingQueue.add(1);
        arrayBlockingQueue.add(2);
        arrayBlockingQueue.add(3);
        //arrayBlockingQueue.add(4); // 超出长度会抛异常

        // remove: 删除队列头部的一个元素，当队列为空时会抛出异常 NoSuchElementException
        arrayBlockingQueue.remove();
        arrayBlockingQueue.remove();
        arrayBlockingQueue.remove();
        // arrayBlockingQueue.remove(); // 超出长度会抛异常

        // element: 返回队列头部的一个元素，当队列为空时会抛出异常 NoSuchElementException
        System.out.println(arrayBlockingQueue.element());
    }

    /**
     * 有返回值且无异常抛出
     */
    public void test2() {
        // offer:往队列尾部添加一个元素，当队列已经满了时返回false
        System.out.println(arrayBlockingQueue.offer(1));
        System.out.println(arrayBlockingQueue.offer(2));
        System.out.println(arrayBlockingQueue.offer(3));
        System.out.println(arrayBlockingQueue.offer(4)); // 输出false但不会抛出异常

        // poll:返回队列头部的一个元素，并移除这个元素，当队列为空时返回null
        System.out.println(arrayBlockingQueue.poll());
        System.out.println(arrayBlockingQueue.poll());
        System.out.println(arrayBlockingQueue.poll());
        System.out.println(arrayBlockingQueue.poll());// 输出null但不会抛出异常

        // peek:返回队列头部的一个元素，但不移除这个元素，当队列为空时返回null
        System.out.println(arrayBlockingQueue.peek());
        System.out.println(arrayBlockingQueue.peek());
        System.out.println(arrayBlockingQueue.peek());
        System.out.println(arrayBlockingQueue.peek());// 输出null但不会抛出异常
    }

    /**
     * 等待阻塞
     */
    public static void test3() throws InterruptedException {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(3);
        // put: 往队列中添加一个元素，当队列为满时则阻塞等待队列有空位时添加
        arrayBlockingQueue.put("a");
        arrayBlockingQueue.put("b");
        arrayBlockingQueue.put("c");
        //arrayBlockingQueue.put("d");

        // take: 返回队列头部的一个元素，并移除这个元素，当队列为空时则等待队列生产
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());//没有这个元素
        System.out.println("end");
    }

    /**
     * 等待，阻塞（有计时
     */
    public void test4() throws InterruptedException {
        System.out.println(arrayBlockingQueue.offer(1));
        System.out.println(arrayBlockingQueue.offer(2));
        System.out.println(arrayBlockingQueue.offer(3));
        System.out.println(arrayBlockingQueue.offer(4,2,  TimeUnit.SECONDS));

        System.out.println("=======================================");
        arrayBlockingQueue.poll();
        arrayBlockingQueue.poll();
        arrayBlockingQueue.poll();
        arrayBlockingQueue.poll(2,TimeUnit.SECONDS);
        System.out.println("=======================================");
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueueDemo arrayBlockingQueueDemo = new ArrayBlockingQueueDemo();
        arrayBlockingQueueDemo.test4();
    }
}
