package test.jdk8.function;

import java.util.function.Consumer;

/**
 * @author laijunlin
 * @date 2021-03-31 9:47
 * 消费型接口:
 *      Consumer<T>有一个参数 没有返回值
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Person> consumer = (p) ->{
            p.setName("超人迪加");
            p.setAge("1200");
            p.setSex("公");
            System.out.println(p.toString());
        };
        // 调用函数
        consumer.accept(new Person());
    }
}
