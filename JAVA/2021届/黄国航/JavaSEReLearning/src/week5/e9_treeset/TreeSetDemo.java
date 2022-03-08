package week5.e9_treeset;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();
        Student s1 = new Student("hh", 45);
        Student s2 = new Student("hjj", 34);
        Student s3 = new Student("hgh1", 6);
        Student s4 = new Student("hgh1", 6);
        Student s5 = new Student("hgh2", 6);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s : ts){
            System.out.println(s);
        }
    }
}
