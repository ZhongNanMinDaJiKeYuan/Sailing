package CatDog.CatDog0.CatDog0;

import CatDog.CatDog0.CatDog0.Animal;

public class Dog extends Animal {
    public Dog() {}

    public Dog(String name, int age) {
        super(name, age);
    }

    public void LookDoor() {
        System.out.println("看门");
    }
}
