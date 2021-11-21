package week3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        while (true) {
            showMenu();

            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            switch (line) {
                case "1":// 添加学生
                    addStudent(studentList);
                    break;
                case "2":// 删除学生
                    deleteStudent(studentList);
                    break;
                case "3":// 修改学生
                    updateStudent(studentList);
                    break;
                case "4":// 查看所有学生
                    showStudentList(studentList);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    return;
                default:
                    System.out.println("没有这个选项！");
            }

        }

    }

    public static void showMenu() {
        System.out.println("\n------欢迎来到学生管理系统--------");
        System.out.println("1. 添加学生 ");
        System.out.println("2. 删除学生 ");
        System.out.println("3. 修改学生 ");
        System.out.println("4. 查看所有学生 ");
        System.out.println("5. 退出 ");
        System.out.print("请输入你的选择： ");
    }

    public static void addStudent(ArrayList<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        String sid;
        String name;
        int age;
        String location;
        while (true) {
            System.out.println("请输入学生学号：");
            sid = scanner.nextLine();
            if (!isExists(studentList, sid)) {
                break;
            } else {
                System.out.println("该学号已存在！");
            }
        }
        System.out.println("请输入学生姓名：");
        name = scanner.nextLine();
        System.out.println("请输入学生年龄：");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入学生居住地：");
        location = scanner.nextLine();

        Student newStudent = new Student(sid, name, age, location);
        studentList.add(newStudent);

        System.out.println("已成功添加学生：" + newStudent);

    }

    // 判断学生学号是否已存在在学生列表之中
    public static boolean isExists(ArrayList<Student> studentArrayList, String sid) {
        for (Student student : studentArrayList) {
            if (student.getSid().equals(sid)) {
                return true;
            }
        }
        return false;
    }

    public static void showStudentList(ArrayList<Student> studentArrayList) {
        if (studentArrayList.size() == 0) {
            System.out.println("表中为空 ！");
            return;
        }
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
    }

    public static void deleteStudent(ArrayList<Student> studentArrayList) {
        System.out.println("请输入需要删除的学生的学号：");
        Scanner scanner = new Scanner(System.in);
        String sid = scanner.nextLine();
        System.out.println("确定删除学号为" + sid + "的学生？Y/N");
        String recheck = scanner.nextLine();
        Student studentRemove = null;
        if (recheck.equalsIgnoreCase("Y")) {
            for (Student student : studentArrayList) {
                if (student.getSid().equals(sid)) {
                    studentRemove = student;
                    break;
                }
            }
            if (studentRemove != null) {
                studentArrayList.remove(studentRemove);
                System.out.println("已从列表中移除学生：" + studentRemove);
            } else {
                System.out.println("未找到学号为" + sid + "的学生！");
            }
        } else {
            System.out.println("已取消操作！");
        }
    }

    public static void updateStudent(ArrayList<Student> studentArrayList) {
        System.out.println("请输入修改的学生学号：");
        Scanner scanner = new Scanner(System.in);
        String sid = scanner.nextLine();
        if (!isExists(studentArrayList, sid)) {
            System.out.println("未找到学号为" + sid + "的学生！");
            return;
        }
        System.out.println("请输入学生的新姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生的新年龄：");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入学生的新居住地：");
        String location = scanner.nextLine();


        for (Student student : studentArrayList) {
            if (student.getSid().equals(sid)) {
                student.setName(name);
                student.setAge(age);
                student.setLocation(location);
                System.out.println("已对学生信息进行更新：" + student);
                break;
            }
        }


    }

}
