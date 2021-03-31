package test.se.object.clone.deep;

/**
 * @author laijunlin
 * @date 2021-01-14 14:16
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        DeepDemo deepDemo = new DeepDemo();
        deepDemo.getType();
        deepDemo.getDate();

        Thread.sleep(1000);
        DeepDemo cloneDeepDemo  = (DeepDemo) deepDemo.clone();
        cloneDeepDemo.getType();
        cloneDeepDemo.getDate();
    }

}
