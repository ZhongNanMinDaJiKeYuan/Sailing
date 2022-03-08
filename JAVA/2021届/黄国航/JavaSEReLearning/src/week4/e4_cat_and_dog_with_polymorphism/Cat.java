package week4.e4_cat_and_dog_with_polymorphism;

public class Cat extends Animal{
    int test;
    public Cat(int age, String name, int test) {
        super(age, name);
        this.test =test;
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println(getName()+"这只猫在吃饭");
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }
}
