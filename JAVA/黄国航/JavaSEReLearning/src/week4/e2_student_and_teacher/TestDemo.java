package week4.e2_student_and_teacher;

public class TestDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setAge(30);
        t1.setName("王一");
        System.out.println("老师：" + t1.getName() + " ,年龄：" + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("蒋丽", 24);
        t2.teach();

        Student s1 = new Student(12, "姜丝");
        s1.learn();
    }
}
