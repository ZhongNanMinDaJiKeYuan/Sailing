package week4.e3_cat_and_dog;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    public void lookDoor(){
        System.out.println(getName()+": 看家护院中……");

    }
}
