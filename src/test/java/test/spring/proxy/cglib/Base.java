package test.spring.proxy.cglib;

/**
 * @author laijunlin
 * @date 2021-03-23 17:27
 * 被代理类，即目标对象target
 */

public class Base {
    /**
     * 一个模拟的add方法
     */
    public void add() {
        System.out.println("add ------------");
    }

    public void update(){
        System.out.println("update");
    }
}