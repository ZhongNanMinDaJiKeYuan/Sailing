package week4.e4_cat_and_dog_with_polymorphism;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("这只狗在吃饭");
    }
}
