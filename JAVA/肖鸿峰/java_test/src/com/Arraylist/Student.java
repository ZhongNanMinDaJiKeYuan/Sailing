package com.Arraylist;
/*
学生类
 */
public class Student {

    private String name;
    private  int age;

    public Student() {}

    public Student(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public void setName(String name) {
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
}
