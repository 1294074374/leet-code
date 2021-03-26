package test.spring.proxy.cglib;

/**
 * @author laijunlin
 * @date 2021-03-24 15:54
 */
public class DataBaseOperation extends Base{

    public void delete(){
        System.out.println("delete");
    }

    public void update(){
        System.out.println("update");
    }
}
