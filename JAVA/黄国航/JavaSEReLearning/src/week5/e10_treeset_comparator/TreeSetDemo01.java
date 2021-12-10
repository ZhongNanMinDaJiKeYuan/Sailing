package week5.e10_treeset_comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                return num == 0 ? s1.getName().compareTo(s2.getName()) : num;
            }
        });
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
