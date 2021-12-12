package week4.animal;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("狗吃骨头");
    }

    public void lookDoor(){
        System.out.println("看门");
    }
}
