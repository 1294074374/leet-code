package test.spring.proxy.cglib;

/**
 * @author laijunlin
 * @date 2021-03-24 15:40
 */
public class Test {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Base base = Factory.getInstance(cglibProxy);
        base.add();
        base.update();
    }
}
