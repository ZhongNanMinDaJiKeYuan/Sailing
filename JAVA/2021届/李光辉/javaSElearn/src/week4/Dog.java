package week4;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println(this.getName() + "汪汪叫");
    }
}
