package com.littlekids8.bean;

// 员工
public class Employee {
    private String eName;
    private String gender;
    private Department department;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eName='" + eName + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                '}';
    }
}
