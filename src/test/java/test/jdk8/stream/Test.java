package test.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author laijunlin
 * @date 2021-03-31 10:14
 * 题目要求：以分组内完成此题，只能用一行代码实现
 * 现有5个用户，筛选：
 * 1.ID必须是偶数
 * 2.年龄必须大于23岁
 * 3.用户名转换为大写字母
 * 4.用户名字母倒叙输出
 * 5.只能输出一个用户！
 */
public class Test {
    public static void main(String[] args) {
        User u1 = new User(1, "a", 21);
        User u2 = new User(2, "b", 22);
        User u3 = new User(3, "c", 23);
        User u4 = new User(4, "d", 24);
        User u5 = new User(6, "e", 25);
        //集合就是存储
        List<User> list = Arrays.asList(u1, u2, u3, u4, u5);
        list.stream()
                .filter(user ->{return user.getId()%2 ==0;})
                .filter(user -> {return user.getAge()>23;})
                .map(user -> {return user.getName().toUpperCase();})
                .sorted((uu1,uu2)->{return uu1.compareTo(uu2);})
                .limit(1)
                .forEach((user)-> System.out.println(user.toString()));
    }
}

class User {
    private int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
