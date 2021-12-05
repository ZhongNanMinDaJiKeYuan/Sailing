package week4.e2_student_and_teacher;

public class Teacher extends Human{
    public Teacher() {
    }
    public Teacher(String name, int age){
        super(age, name);
    }
    public void teach(){
        System.out.println(getName()+"：春蚕到死丝方尽...");
    }
}
