package com.littlekids8.bean;

// 部门
public class Department {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDname() {
        return dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
