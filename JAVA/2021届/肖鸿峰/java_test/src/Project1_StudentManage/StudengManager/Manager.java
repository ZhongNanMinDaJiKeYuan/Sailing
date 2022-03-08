package StudentManage.StudengManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {

        ArrayList<Student> array = new ArrayList<Student>();

        //用循环重复该界面
        while(true) {

            //打印主界面：
            System.out.println("---------欢迎来到学生管理系统---------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("\n" + "请输入你的选择: ");
            //接收键盘输入数据（1，2，3，4，5，若为其他则打印未输入有效字符！！！）

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    //重复添加操作：
                    String input1 = "y";
                    System.out.println("------添加学生------");
                    AddStudent(array);

                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("是否再进行添加？（y）: ");
                    String s1 = sc1.nextLine();

                    //选择y则继续执行，其他任意键退回主界面
                    do {
                        AddStudent(array);
                        System.out.println("是否再进行添加？（y）: ");
                    }while(s1 == input1);
                    break;

                case 2:
                    System.out.println("------删除学生------");
                    DelStudent(array);
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("请按任意键退回主界面: ");
                    String s2 = sc2.nextLine();
                    break;

                case 3:
                    System.out.println("------修改学生------");
                    UpdateStudent(array);
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("请按任意键退回主界面: ");
                    String s3 = sc3.nextLine();
                    break;

                case 4:
                    System.out.println("------查看所有学生------");

                    //判断集合内是否有数据，返回提示
                    if(array.size() == 0){
                        System.out.println("暂无学生信息，请添加学生信息");
                        Scanner sc4 = new Scanner(System.in);
                        System.out.println("请按任意键退回主界面: ");
                        String s4 = sc4.nextLine();
                        continue;
                    }

                    findStudent(array);
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("请按任意键退回主界面: ");
                    String s4 = sc4.nextLine();
                    break;

                case 5:
                    System.out.println("谢谢使用");
//                    break;
                    System.exit(0); //JVM退出

                default:
                    System.out.println("输入有误，请重新输入");
                    //break;


            }

        }
    }

    //定义添加学生的方法：
    public static void AddStudent(ArrayList<Student> array) {
        //键盘录入添加学生的信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入需要添加学生的学号： ");
        String sid = sc.nextLine();
        boolean flag = isUsed(array,sid);
        if(flag) {
            System.out.println("该学号已被使用，请重新输入");
        }

        System.out.println("请输入需要添加学生的姓名： ");
        String name = sc.nextLine();
        System.out.println("请输入需要添加学生的年龄： ");
        String age = sc.nextLine();
        System.out.println("请输入需要添加学生的家庭住址： ");
        String address = sc.nextLine();

        //使用学生对象接受学生信息
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);
        System.out.println("添加成功！");
    }

    //定义删除学生的方法：
    public static void DelStudent(ArrayList<Student> array) {
        //键盘录入需要删除学生的学号：
        System.out.println("请输入删除学生的学号：");
        Scanner sc = new Scanner(System.in);
        String si = sc.nextLine();

        //在删除/修改学生操作前，对学号是否存在进行判断
        //若不存在显示提示信息
        //如果存在，执行对应操作
        int index = -1;
        //循环遍历集合将对应学生信息删除
        for(int i=0; i<array.size(); i++) {
            Student s = array.get(i);
            if(s.getSid().equals(si)) {
//                array.remove(s);
//                System.out.println("删除成功！");
//                int index = i;
                index = i;
                break;
            }
        }
        //索引为-1说明上面循环里无符合条件的学生对象
        if(index == -1) {
            System.out.println("该信息不存在");
        }else {
            array.remove(index);
            System.out.println("删除成功");
        }

    }

    //定义修改学生信息的方法
    public static void UpdateStudent(ArrayList<Student> array) {
        //键盘录入需要更改信息的学生学号
        System.out.println("请输入修改学生的学号：");
        Scanner sc = new Scanner(System.in);
        String si = sc.nextLine();


        int index = -1;
        //遍历集合查找对应条件的学生对象，并修改对应信息
        for(int i=0; i<array.size(); i++) {
            Student s = array.get(i);
            if(s.getSid().equals(si)) {
                index = i;
                break;
            }
        }
        //若index=-1说明集合中的没有与输入学号相符合的对象
        if(index == -1) {
            System.out.println("该对象不存在");
        }else {
            System.out.println("------请输入您希望修改学生的信息------");
            Scanner sc1 = new Scanner(System.in);
            System.out.println("学号：");
            String sid = sc1.nextLine();
            System.out.println("姓名：");
            String name = sc1.nextLine();
            System.out.println("年龄：");
            String age = sc1.nextLine();
            System.out.println("住址：");
            String address = sc1.nextLine();

            //创建学生对象以修改学生对象中的相关信息，sid；name；age；address
            Student student = new Student();
            student.setAddress(address);
            student.setSid(sid);
            student.setName(name);
            student.setAge(age);

            array.set(index,student);
            System.out.println("修改成功");
        }

    }

    //定义查看学生信息的方法
    public static void findStudent(ArrayList<Student> array) {
        //显示表头信息
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");

        //打印集合中学生对象的相应数据
        for(int i=0; i<array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t\t"+s.getAddress());
        }
    }

    //定义判断学号是否重复的方法
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        //如果与集合中某一个学生学号相同，返回true；都不同则返回false
        boolean flag = false;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
