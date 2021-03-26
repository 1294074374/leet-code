package test.spring.proxy.jdk;

/**
 * @author laijunlin
 * @date 2021-03-23 14:23
 */
//测试

public class Test {
    public static void main(String[] args) {
        JDKProxyTest jdkProxy = new JDKProxyTest();
        JDKProxyTestService proxy = (JDKProxyTestService) jdkProxy.newProxy(new JDKProxyTestServiceImpl());
        proxy.run();
    }
}