package test.spring.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author laijunlin
 * @date 2021-03-23 14:22
 */
//代理类

public class JDKProxyTest implements InvocationHandler {

    private Object targetObject; //代理目标对象
    //构造代理对象

    public Object newProxy(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), this);

    }
    //利用反射，在原逻辑上进行逻辑增强
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        //模拟事务开始
        assumeBeginTransaction();
        //原执行逻辑
        Object ret = method.invoke(targetObject, args);
        //模拟事务提交
        assumeCommitTransaction();
        return ret;
    }


    private void assumeBeginTransaction() {
        System.out.println("模拟事务开始...");
    }


    private void assumeCommitTransaction() {
        System.out.println("模拟事务提交...");
    }

}