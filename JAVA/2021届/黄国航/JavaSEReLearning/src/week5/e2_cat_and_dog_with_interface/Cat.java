package week5.e2_cat_and_dog_with_interface;

public class Cat extends Animal implements Jumpping{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println(getName()+"猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println(getName()+"猫可以跳了");
    }


}
