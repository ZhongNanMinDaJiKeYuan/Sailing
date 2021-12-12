package week4.animal;

/*
测试类
 */
public class AnimalDemo {
    public static void main(String[] args){
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat("加菲猫",5);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.catchMouse();

        Dog d1 = new Dog();
        d1.setName("柯基");
        d1.setAge(6);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.lookDoor();

        Dog d2 = new Dog("德牧",3);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.lookDoor();

        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        //a.catchMouse();
        a.eat();

        a = new Cat("加菲",6);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        // b.catchMouse();
    }

}
