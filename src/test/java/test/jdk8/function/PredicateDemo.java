package test.jdk8.function;

import java.util.function.Predicate;

/**
 * @author laijunlin
 * @date 2021-03-31 10:11
 * Predicate<T> 断言型接口 T是参数 返回值boolean类型
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = (str) -> {
            return str.isEmpty();
        };
        System.out.println(predicate.test("asd"));
    }
}
