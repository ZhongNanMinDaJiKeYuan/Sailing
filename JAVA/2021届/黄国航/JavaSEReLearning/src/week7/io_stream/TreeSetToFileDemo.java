package week7.io_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 键盘录入5个学生信息(姓名语文成绩,数学成绩,英语成绩),要求按照成绩总分从高到低写入文本文件
 */
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num2 = num == 0 ? s2.getChinese() - s1.getChinese() : num;
                int num3 = num2 == 0 ? s2.getMath() - s1.getMath() : num2;
                int num4 = num3 == 0 ? s2.getName().compareTo(s1.getName()) : num3;
                return num4;
            }
        });
        // 键盘录入学生数据
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第" + (i+1) + "个学生的信息：");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            Student s = new Student(name, chinese, math, english);

            ts.add(s);

        }
        // 创建字符缓冲流输出对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("JAVA/黄国航/JavaSEReLearning/src/week7/io_stream/out.txt"));

        for (Student s : ts) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",")
                    .append(s.getChinese()).append(",")
                    .append(s.getMath()).append(",")
                    .append(s.getEnglish()).append(",")
                    .append(s.getSum());
            // 写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();

        }
        // 释放资源
        bw.close();


    }
}
