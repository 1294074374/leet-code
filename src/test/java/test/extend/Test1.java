package test.extend;

/**
 * @author laijunlin
 * @date 2021-03-12 15:59
 */
public class Test1 {
    public static void main(String[] args) {
        class A{
            public int i = 3;
        }
        Object o = (Object)new A();
        A a = (A)o;
        System.out.println(a.i);
    }
}

