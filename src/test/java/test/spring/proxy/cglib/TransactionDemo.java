package test.spring.proxy.cglib;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author laijunlin
 * @date 2021-03-24 16:53
 */
public class TransactionDemo {
    @Pointcut(value = "execution(* com.yangxin.core.service.*.*.*(..))")
    public void point() {
    }

    @Before(value = "point()")
    public void before() {
        System.out.println("transaction begin");
    }

    @AfterReturning(value = "point()")
    public void after() {
        System.out.println("transaction commit");
    }

    @Around("point()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("transaction begin");
        joinPoint.proceed();
        System.out.println("transaction commit");
    }
}
