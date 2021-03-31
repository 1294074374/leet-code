package test.jdk8.function;

import test.jdk8.stream.Employee;

import java.util.function.Supplier;

/**
 * @author laijunlin
 * @date 2021-03-31 9:55
 * 供给型接口:
 *      Supplier:有一个参数 返回值<T> 供给型接口 没有参数,但有返回值,T是返回值
 *
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Person> supplier = ()->{
            Person p = new Person();
            p.setName("超人迪加");
            p.setAge("1200");
            p.setSex("公");
            System.out.println(p.toString());
            return p;
        };

        // 获取供给型函数的返回值
        Person person = supplier.get();
        System.out.println(person.toString());
        System.out.println("=========================");
        Supplier<String> st = new Employee()::toString;
        System.out.println(st.get());

    }
}
