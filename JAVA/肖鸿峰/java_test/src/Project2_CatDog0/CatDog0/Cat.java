package CatDog.CatDog0.CatDog0;

import CatDog.CatDog0.CatDog0.Animal;

//继承一定要记得用extend
public class Cat extends Animal {
    //记得若使用了带参构造方法，要自己写无参构造方法。
    //这里建议在定义类时就自己写无参构造方法。
    public Cat() {}

    public Cat(String name, int age) {
        super(name, age);
    }

    public void CatchMouse(){
        System.out.println("抓老鼠");
    }
}
