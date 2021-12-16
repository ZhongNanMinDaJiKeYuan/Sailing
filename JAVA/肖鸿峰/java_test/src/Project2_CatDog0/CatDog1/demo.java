package CatDog.CatDog0.CatDog1;

public class demo {
    public static void main(String[] args) {
        //以多态形式
        Animal c1 = new Cat();
        c1.setName("TOM");
        c1.setName("3");
        System.out.println(c1.getAge() + "岁的" + c1.getName());
        c1.Eat();

        Animal c2 = new Cat("TOM",3);
        System.out.println(c2.getAge() + "岁的" + c2.getName());
        c2.Eat();
    }
}
