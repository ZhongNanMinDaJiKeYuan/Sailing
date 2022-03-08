package week5.e2_cat_and_dog_with_interface;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat("加菲", 5);
        j.jump();

        Animal a = (Animal) j;
        a.eat();

    }
}
