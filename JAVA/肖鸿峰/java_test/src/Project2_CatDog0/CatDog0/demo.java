package CatDog.CatDog0.CatDog0;

public class demo {
    public static void main(String[] args) {
        Cat c1 = new Cat();//使用无参构造方法
        //子类中无该方法，调用父类中的方法
        c1.setAge(2);
        c1.setName("TOM");
        System.out.println(c1.getAge() + "岁的" + c1.getName());
        c1.CatchMouse();

        Cat c2 = new Cat("jerry", 3);//使用带参构造
        System.out.println(c2.getAge() + "岁的" + c2.getName());
        c2.CatchMouse();

        Dog d1 = new Dog();
        d1.setAge(3);
        d1.setName("HUMRY");
        System.out.println(d1.getAge() + "岁的" + d1.getName());
        d1.LookDoor();

        Dog d2 = new Dog("SAM", 4);
        System.out.println(d1.getAge() + "岁的" + d1.getName());
        d2.LookDoor();

    }
}
