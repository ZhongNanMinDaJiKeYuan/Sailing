package Project.Project3;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {

        Collection<Student> c1 = new ArrayList<Student>();
        Student s0 = new Student("Tom",15);
        Student s1 = new Student("Jerry",14);
        Student s2 = new Student("Nack",16);

        c1.add(s0);
        c1.add(s1);
        c1.add(s2);

        Iterator<Student> I1 = c1.iterator();
        while(I1.hasNext()) {
            Student s = I1.next();
            System.out.println(s.getAge() + "岁的" + s.getName());
        }
    }
}
