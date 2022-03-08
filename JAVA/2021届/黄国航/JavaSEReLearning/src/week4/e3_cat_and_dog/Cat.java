package week4.e3_cat_and_dog;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    public void catchMouse(){
        System.out.println(getName()+": 死耗子……哪里跑！！！");
    }
}
