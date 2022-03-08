package week4;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println(this.getName() + "喵喵叫");
    }
}
