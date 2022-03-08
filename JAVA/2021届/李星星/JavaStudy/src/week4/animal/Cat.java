package week4.animal;

public class Cat extends Animal {
    public Cat(){

    }
    public Cat(String name, int age){
        super(name,age);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
