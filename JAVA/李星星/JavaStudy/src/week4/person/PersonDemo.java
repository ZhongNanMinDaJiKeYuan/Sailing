package week4.person;

public class PersonDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("小李");
        t1.setAge(30);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("小河", 25);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();

        Student s1 = new Student();
        s1.setName("小星");
        s1.setAge(18);
        System.out.println(s1.getName() + "," + s1.getAge());
        s1.study();
    }
}
