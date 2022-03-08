package week4.e2_student_and_teacher;

public class Student extends Human{
    public Student() {
    }

    public Student(int age, String name){
        super(age, name);
    }
    public void learn(){
        System.out.println(getName()+": 好好学习，天天向上");
    }

}
