package test.spring.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author laijunlin
 * @date 2021-03-23 17:29
 * 此为代理类，用于在pointcut处添加advise
 */

public class CglibProxy implements MethodInterceptor {

    public Object intercept(Object object, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        // 添加切面逻辑（advise），此处是在目标类代码执行之前，即为MethodBeforeAdviceInterceptor。
        doSomethingBefore();
        // 执行目标类add方法
        proxy.invokeSuper(object, args);
        // 添加切面逻辑（advise），此处是在目标类代码执行之后，即为MethodAfterAdviceInterceptor。
       doSomethingAfter();
        return null;
    }


    public void doSomethingBefore(){
        System.out.println("before-------------");
    }

    public void doSomethingAfter(){
        System.out.println("after--------------");
    }
}
