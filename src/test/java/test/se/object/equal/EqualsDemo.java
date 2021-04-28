package test.se.object.equal;

import java.util.Objects;

/**
 * @author laijunlin
 * @date 2021-03-19 17:15
 * 实现equals
 *
 * 检查是否为同一个对象的引用,如果是直接返回true
 * 检查是否是同一个类型,如果不是,直接返回false
 * 将Object对象进行转型
 * 判断每个关键域是否相等
 */
public class EqualsDemo {
    private int x;
    private int y;
    private int z;

    public EqualsDemo(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        // 1.检查是否为同一个对象的引用,如果是直接返回true
        if(this == o) {
            return true;
        }
        // 2.检查是否是同一个类型,如果不是,直接返回false(判断是否是同一个类加载器加载)
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        // 3.将Object对象进行转型
        EqualsDemo e = (EqualsDemo) o;
        return this.x == e.x &&
                this.y == e.y &&
                this.z == e.z;
    }
    // 必须重写hashCode方法，不然到时候，调用Hashset的时候，会显示是同一个
    @Override
    public int hashCode() {
        return Objects.hash(x,y,z);
    }

    public static void main(String[] args) {
        System.out.println(2>>1);
    }
}
