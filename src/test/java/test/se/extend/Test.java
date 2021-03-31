package test.se.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * @author laijunlin
 * @date 2021-01-14 17:16
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();
        Father s = new Son();

        father.method();
        son.method();
        s.method();
        son.myMethod();

        List<?> list = new ArrayList();
        List<String> stringList = new ArrayList<>();
        list = stringList;

        System.out.println("2".hashCode());
    }
}
