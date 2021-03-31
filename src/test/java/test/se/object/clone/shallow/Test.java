package test.se.object.clone.shallow;

/**
 * @author laijunlin
 * @date 2021-01-14 14:16
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        ShallowDemo shallowDemo = new ShallowDemo();
        shallowDemo.getType();
        shallowDemo.getDate();

        Thread.sleep(3000);
        ShallowDemo cloneShallowDemo  = (ShallowDemo) shallowDemo.clone();
        cloneShallowDemo.getType();
        cloneShallowDemo.getDate();
    }

}
