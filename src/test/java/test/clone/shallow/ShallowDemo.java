package test.clone.shallow;

import java.util.Date;

/**
 * @author laijunlin
 * @date 2021-01-14 14:15
 */
public class ShallowDemo implements Cloneable{
    private String type="shallow";
    private Date date = new Date();

    public void getType(){
        System.out.println(type);
    }

    public void getDate(){
        System.out.println(date);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
