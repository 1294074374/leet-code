package test.jvm.volatil;

/**
 * @author laijunlin
 * @date 2021-03-31 15:50
 */
public class VolatileDemo {
    //volatile 不保证原子性
    private volatile static int num = 0;

    public static void add() {
        num++;
    }

    public static void main(String[] args) throws Exception{
        //理论上结果应该为2W
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    add();
                }
            }).start();
        }
        // while (Thread.activeCount() > 2) {
        //     Thread.yield();
        // }
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " " + num);
    }
}
