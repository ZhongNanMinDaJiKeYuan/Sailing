package week5.e1_cat_and_dog_with_abstract;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println(getName()+"狗吃……");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
