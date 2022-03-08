package CatDog.CatDog0.project1;

public class Teacher extends Person{
    public Teacher() {}

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("用爱鞭挞每一个学生");
    }
}
