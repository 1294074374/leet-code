package test.clone.deep;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author laijunlin
 * @date 2021-01-14 14:23
 */
public class DeepDemo implements Cloneable {
    private String type = "deep";
    private Date date = new Date();

    public void getType() {
        System.out.println(type);
    }

    public void getDate() {
        System.out.println(date);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepDemo deepDemo = (DeepDemo) super.clone();
        deepDemo.date = new Date();
        return deepDemo;
    }
}
