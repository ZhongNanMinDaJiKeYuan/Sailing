package com.littlekids8.autowire;

public class Employee {
    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                '}';
    }
    public void test(){
        System.out.println(department);
    }
}
