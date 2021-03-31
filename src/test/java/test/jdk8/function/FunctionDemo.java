package test.jdk8.function;

import test.jdk8.stream.Employee;

import java.util.function.Function;

/**
 * @author laijunlin
 * @date 2021-03-31 10:03
 * 函数式接口：
 * function<T,R> ,两个参数，一个是函数的入参，一个是函数的返回参数
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<Person, Employee> function = (p) -> {

            return new Employee();
        };

        Function<String, String> function1 = (str) -> {
            return str;
        };
        System.out.println(function1.apply("hello"));
    }
}
