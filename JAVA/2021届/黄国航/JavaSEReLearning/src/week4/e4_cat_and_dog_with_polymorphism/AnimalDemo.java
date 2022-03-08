package week4.e4_cat_and_dog_with_polymorphism;

import java.util.ArrayList;

/*
测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Animal a1 = new Cat(5, "加菲猫", 1);
        animals.add(a1);

        Animal a2 = new Dog(5, "大黄");
        animals.add(a2);

        for (Animal a:animals) {
            a.eat();
        }

        // 向下转型并获取子类才有的变量,可见转型过来的还能完整保持了子类本身的独有属性，
        // 原因在于创建对象时，是完整地分配了一个子类的空间，只是将该空间的引用赋值给了父类，实际对分配的空间无影响。
        Cat cat = (Cat)a1;
        System.out.println(cat.getName()+cat.getTest());


    }
}
