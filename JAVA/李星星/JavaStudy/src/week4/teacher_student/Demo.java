package week4.teacher_student;



public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("小李");
        t1.setAge(30);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("小何", 25);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();
    }
}