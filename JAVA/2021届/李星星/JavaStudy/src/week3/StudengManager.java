package week3;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentManager {
    /*
    1.:输入语句完成主界面的编写；
    2.：用Scanner实现键盘录入数据
    3：用switch语句完成操作的选择
    4：用循环完成再次返回主界面
     */
    public static void main(String[] args){
        ArrayList<Student> array = new ArrayList<Student>();

        while(true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            //用scanner实现键盘输入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
//                System.out.println("");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("");
                    findALLStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
//                break;
                    System.exit(0);//虚拟机JVN退出
            }
        }
    }

    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array){
        //键盘录入学生对象所要的数据，显示提示信息，提示要输入何种信息
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (!flag) {
                System.out.println("输入的学号重复，请重新输入");
            }else
                break;
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年纪：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        //创建学生对象，把录入的数据赋值给学生对象的成员变量
        Student s =  new Student(sid, name,age, address);
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);

        System.out.println("添加成功");

    }

    //定义一个方法，用于查看学生信息
    public static void  findALLStudent(ArrayList<Student> array){
        if(array.size()==0){
            System.out.println("无信息，请添加信息");
            //让程序不再往下执行，给出return
            return;
        }
        //显示表头信息
        System.out.println("学号\t姓名\t年龄\t居住地\t");
        //将集合中的数据取出，显示学生信息
        for(int i=0;i<array.size();i++) {
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t\t"+s.getName()+"\t\t\t"+s.getAge()+"\t\t\t"+s.getAddress());
        }
    }

    //判断学好是否重复
    public static boolean isUsed(ArrayList<Student> array,String sid){
        //如果与学号相同，返回false,不相同，返回ture
        boolean flag = true;
        for(int i=0;i<array.size();i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    //定义一个方法，用于删除学生信息
    public static void  deleteStudent(ArrayList<Student> array){
        //输入要删除的学号信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除学生的学号：");
        String sid = sc.nextLine();

        int index = -1;
        //遍历集合将学生对象从几何中删除
        for(int i=0;i<array.size();i++) {
            Student s = array.get(i);
            if(s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if(index== -1){
            System.out.println("该信息不存在，请重新输入");
        }else{
            array.remove(index);
            System.out.println("删除成功");
        }

    }

    //修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号");
        String sid = sc.nextLine();

        int index = -1;
        //遍历集合查找学号是否存在
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入");
        } else {
            System.out.println("请输入要修改的学生姓名");
            String name = sc.nextLine();
            System.out.println("请输入要修改的学生年龄");
            String age = sc.nextLine();
            System.out.println("请输入要修改的学生地址");
            String address = sc.nextLine();

            Student s = new Student(sid, name, age, address);
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);

            for (int i = 0; i < array.size(); i++) {
                Student student = array.get(i);
                if (student.getSid().equals(sid)) {
                    array.set(i, s);//将新的对象替换集合中旧的
                    break;
                }
            }
            System.out.println("修改学生信息成功");
        }
    }
}
