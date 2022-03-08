package week5.e1_cat_and_dog_with_abstract;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a1 = new Cat("加菲", 5);
        a1.eat();

        Animal a2 = new Dog("大黄", 4);
        a2.eat();
    }
}
