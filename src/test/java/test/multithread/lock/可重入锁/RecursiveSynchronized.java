package test.multithread.lock.可重入锁;

/**
 * @author laijunlin
 * @date 2021-03-31 16:46
 */
public class RecursiveSynchronized {
    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(() -> {
            phone.ms();
        }, "A").start();
        new Thread(() -> {
            phone.ms();
        }, "B").start();
    }

    static class Phone {
        public synchronized void ms() {
            System.out.println(Thread.currentThread().getName() + "sms");
            call();// 这里也有锁，进入call方法 会自动获取call方法的锁
        }

        public synchronized void call() {
            System.out.println(Thread.currentThread().getName() + "call");
        }
    }
}
