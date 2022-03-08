package com.itheima3;


public class Student {
    //成员变量
    private String name;
    private int age;

    //构造方法
    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
    //成员方法
    public void setName(String name) {
        //用this修饰代表成员变量，用于成员变量与局部变量重名时
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + ',' + age);
    }


}
