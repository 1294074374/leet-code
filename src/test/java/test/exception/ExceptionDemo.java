package test.exception;

/**
 * @author laijunlin
 * @date 2021-01-14 17:28
 */
public class ExceptionDemo {
    public void test(){
        try{
            int i = 1/0;
        }catch(Exception e){
            System.out.println("catch");
        }
        System.out.println("2");
    }

    public static void main(String[] args) {
        ExceptionDemo exceptionDemo  =new ExceptionDemo();
        exceptionDemo.test();
    }

}
