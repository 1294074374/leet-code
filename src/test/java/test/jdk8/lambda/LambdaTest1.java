package test.jdk8.lambda;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

/**
 * @author laijunlin
 * @date 2021-03-11 10:20
 */
public class LambdaTest1 {
    public static void main(String[] args) {
        MyLambdaInterface myLambdaInterface1 = new MyLambdaInterface() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };
        System.out.println("1+2="+ myLambdaInterface1.operation(1,2));

        MyLambdaInterface myLambdaInterface2 = (int a1,int b1) -> {return a1 + b1;};

    }
}

interface MyLambdaInterface{
    int operation(int a,int b);
}
