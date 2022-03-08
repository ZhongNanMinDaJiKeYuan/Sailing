package CatDog.CatDog0.CatDog1;

public class Dog extends Animal{
    public Dog() {}

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat() {
        System.out.println("狗吃肉");;
    }
}
