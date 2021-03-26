package test.multithread.lock;

/**
 * @author laijunlin
 * @date 2021-03-17 14:38
 * 可重入锁和非重入锁
 */
public class Reentrant {
    public synchronized  void doSomethingAfter(){
        // 代码
        doSomethingBefore();
    }

    public synchronized  void doSomethingBefore(){
        System.out.println("doSomethingBefore");
    }


}
