package test.jdk8.stream;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author laijunlin
 * @date 2021-03-11 11:39
 */
public class StreamTest1 {
    public static void main(String[] args) {
        //求出员工的工资总和
        List<Employee> emps = Arrays.asList(
                new Employee(102, "李四", 59, 6666.66),
                new Employee(101, "张三", 18, 9999.99),
                new Employee(103, "王五", 28, 3333.33),
                new Employee(104, "赵六1", 8, 7777.77),
                new Employee(104, "赵六2", 81, 7777.77),
                new Employee(104, "赵六3", 82, 7777.77),
                new Employee(105, "田七", 38, 5555.55)
        );

        Stream<Employee> stream = emps.stream();
        //Stream<Double> doubleStream = stream.map(ele -> ele.getSalary());
        //Double d = doubleStream.reduce(0.0,(a, b) -> a+b);
        //System.out.println(d);
        stream.distinct()
                .filter(e -> e.getAge() < 50)
                .forEach(e -> System.out.print(e.getSalary() + ","));
        System.out.println("-----------------------------------------------------");
        List<String> stringList = Arrays.asList("aa", "bb", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii");
        Stream<String> stringStream = stringList.stream();
        stringStream.distinct()
                .forEach(s -> {
                    if (s.equals(stringList.get(stringList.size() - 1))) {
                        System.out.println(s);
                    } else {
                        System.out.print(s + ",");
                    }
                });

    }


    private static Integer fun(Integer a, Integer b) {
        return a + b;
    }

    public static int fun(int a, int b, int c) {
        return a + b + c;
    }
}

