package test.multithread.thread.serial;

/**
 * @author laijunlin
 * @date 2021-03-22 16:03
 * 使用join() 让ABC三个线程顺序执行
 */
public class JoinTest {
    static class A extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A");
        }
    }

    static class B extends Thread {
        A a;
        B (A a){
            this.a  = a;
        }
        @Override
        public void run() {
            try {
                a.join();
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    static class C extends Thread {
        B b;
        C(B b){
            this.b = b;
        }
        @Override
        public void run() {
            try {
                b.join();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("C");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        C c = new C(b);
        a.start();
        b.start();
        c.start();
    }
}
