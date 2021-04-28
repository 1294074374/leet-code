package test.se.object.equal;

public class ObjectEqualsDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat("coffer","0.5");
        Cat c2 = new Cat("coffer","0.5");
        // 在没有重写equal的方法下，equals 还是比较的是地址
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);

        Dog d1 = new Dog("coffer","0.5");
        Dog d2 = new Dog("coffer","0.5");
        System.out.println(d1.equals(d2));
        System.out.println(d1 == d2);
    }



    static class Cat{
        String name;
        String age;
        Cat(String name,String age){
            this.name = name;
            this.age = age;
        }
    }

    static class Dog{
        String name;
        String age;
        Dog(String name,String age){
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof  Dog)){
                return false;
            }
            Dog o = (Dog)obj;
            if(this.name.equals(o.name) && this.age.equals(o.age)){
                return true;
            }else{
                return false;
            }
        }
    }
}
