package week5.e1_cat_and_dog_with_abstract;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println(getName()+"猫吃鱼");
    }

}
