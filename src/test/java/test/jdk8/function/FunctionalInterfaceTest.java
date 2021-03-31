package test.jdk8.function;

import test.jdk8.stream.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * 函数式接口
 * @author laijunlin
 * @date 2021-03-11 16:42
 * Consumer<T> 消费型接口
 * Supplier有一个参数 没有返回值<T> 供给型接口 没有参数有返回值,T是返回值
 * Function<T, R> 函数型接口 T是参数，R是返回值
 * Predicate<T> 断言型接口 T是参数 返回值boolean类型
 */
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("Consumer<T> 消费型接口 有一个参数 没有返回值");
        System.out.println("----------------------------------------");
        List<Double> doubleList = Arrays.asList(1.11d,2.22d,3.33d,4.44d,5.55d,6.66d);
        Consumer<Double> consumer = d -> System.out.println(d);
        consumer.accept(123d);
        Consumer<Employee> employeeConsumer = Employee::check;
        Employee employee = new Employee();
        employeeConsumer.accept(employee);
        System.out.println(employee.getSalary());

        System.out.println("----------------------------------------");
        System.out.println("Supplier<T> 供给型接口 没有参数有返回值,T是返回值");
        System.out.println("----------------------------------------");
        Supplier<Employee> supplier = FunctionalInterfaceTest::getEmployee;
        Employee supplierEmployee = supplier.get();
        System.out.println(supplierEmployee.getSalary());
        System.out.println(supplierEmployee.getAge());
        System.out.println(supplierEmployee.getName());

        System.out.println("----------------------------------------");
        System.out.println("Function<T, R> 函数型接口 T是参数，R是返回值");
        System.out.println("----------------------------------------");
        Function<Integer,String> fun = i->String.valueOf(i)+"test";
        System.out.println(fun.apply(123));

        System.out.println("----------------------------------------");
        System.out.println("Predicate<T> 断言型接口 T是参数 返回值boolean类型");
        System.out.println("----------------------------------------");
        Predicate<Employee> predicate = e-> {
            if(e.getSalary() == 123d){
                return true;
            }else{
                return false;
            }
        };
        System.out.println(predicate.test(employee));

        System.out.println("----------------------------------------");
        System.out.println("BiFunction<T, U, R>T,U是参数 返回值R");
        System.out.println("----------------------------------------");
        BiFunction<String,String,Integer> biFunction = (s1,s2) -> {
            try{
                return Integer.valueOf(s1)+Integer.valueOf(s2);
            }catch(Exception e){
               return Integer.MIN_VALUE;
            }
        };
        biFunction.apply("1","2");
        FunctionalInterfaceTest functionalInterfaceTest = new FunctionalInterfaceTest();
        biFunction = functionalInterfaceTest::add2String;
        System.out.println(biFunction.apply("1","2"));
        System.out.println(biFunction.apply("1","2sss"));

    }

    public static Employee getEmployee(){
        Employee employee = new Employee();
        employee.setSalary(123d);
        employee.setAge(12);
        employee.setName("test");
        return employee;
    }

    public  Integer add2String(String s1, String s2){
        try{
            return Integer.valueOf(s1)+Integer.valueOf(s2);
        }catch(Exception e){
            return Integer.MIN_VALUE;
        }
    }
}
