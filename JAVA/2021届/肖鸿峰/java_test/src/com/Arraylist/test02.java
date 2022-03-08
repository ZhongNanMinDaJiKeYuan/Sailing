package com.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
//        //创建集合对象
//        ArrayList<Student> array = new ArrayList<Student>();
//
//        //键盘接受学生信息
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("请输入学生姓名: ");
//        String name = sc.nextLine();
//        System.out.println("请输入学生年龄: ");
//        int age = sc.nextInt();
//
//        //创建学生类对象接受键盘录入数据
//        Student s = new Student();
//        s.setName(name);
//        s.setAge(age);
//
//        array.add(s);
        ArrayList<Student> array = new ArrayList<Student>();
        addStudent(array);
        addStudent(array);
        addStudent(array);


        for(int i=0; i<array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getAge() + " , " + s.getName());
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        //创建集合对象


        //键盘接受学生信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名: ");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄: ");
        int age = sc.nextInt();

        //创建学生类对象接受键盘录入数据
        Student s = new Student();
        s.setName(name);
        s.setAge(age);


        array.add(s);
    }
}
