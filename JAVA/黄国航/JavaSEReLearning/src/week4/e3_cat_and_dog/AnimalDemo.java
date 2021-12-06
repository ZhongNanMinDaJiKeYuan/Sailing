package week4.e3_cat_and_dog;
/*
测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setAge(5);
        c1.setName("加菲猫");
        c1.catchMouse();

        Cat c2 = new Cat(4, "穿靴子的猫");
        c2.catchMouse();

        Dog d1 = new Dog(5, "大黄");
        d1.lookDoor();
    }
}
