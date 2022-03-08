package Project.Project3;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        //创建List对象
        List<Student> L1 = new ArrayList<Student>();
        List<String> L2 = new ArrayList<String>();

        //创建学生类对象
        Student s0 = new Student("Tom",15);
        Student s1 = new Student("Jerry",14);
        Student s2 = new Student("Nack",16);

        //将学生类对象添加入list集合中
        L1.add(s0);
        L1.add(s0);
        L1.add(s1);
        L1.add(s2);

        L2.add("i");
        L2.add("love");
        L2.add("you");


        //使用for循环遍历
        for(int i=0; i<L1.size(); i++) {
            Student student = L1.get(i);
            System.out.println(student.getAge() + "岁的" + student.getName());
        }

        System.out.println("---------------------------");

        //用iterator遍历,
        Iterator<Student> it = L1.iterator();
        while(it.hasNext()) {
            Student student = it.next();
            System.out.println(student.getAge() + "岁的" + student.getName());
        }

        System.out.println("---------------------------");

        //用ListIterator遍历
        ListIterator<String> it1 = L2.listIterator();
        while (it1.hasNext()) {
            String s = it1.next();
            System.out.println(s);
        }

        System.out.println("---------------------------");

        //逆向遍历
        while(it1.hasPrevious()) {
            String s = it1.previous();
            System.out.println(s);
        }

        //增强for循环
        for(String s : L2) {
            System.out.println(s);
        }

    }
}
