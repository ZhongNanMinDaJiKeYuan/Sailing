package com.itheima2;

public class solution {
    /*
    方法 = 类？
    1.方法定义
    public static void 方法名() {}
    2.调用
    方法名();
    3.带参数
    定义：
    单个参数：方法名(数据类型 变量名)
    多个参数：方法名(数据类型1 变量名1，数据类型2 变量名2)
    调用：
    单个参数：方法名(变量名/常量值)
    多个参数：方法名(变量名1/常量值1，变量名2/常量值2)
    4.带返回值方法
    定义：
        public static 数据类型  方法名(参数){
             return 数据；
        }
    调用：*********************************
    boolean flag = isEvenNumber(5);
    5.方法不能嵌套定义
      void表示无返回值，可以单独写return也可以不写
    6.通用格式
    public static 数据类型 方法名(参数) {
        方法体；
        return 数据；
    7.方法重载
    多个方法在同一个类中
    多个方法具有相同的方法名
    多个方法的参数不同，类型不同或数量不同

    调用时，java虚拟机会根据参数的不同来区分方法的不同
    8.方法的参数传递

    }
     */
    public static void getMax(int a, int b) {

        if(a>b) {
            System.out.println("max: " + a);
        }else {
            System.out.println("max: " + b);
        }
    }

    //函数重载
    public static boolean compare(int a, int b) {
        return a == b;
    }

    //数量不同
    public static boolean compare(int a, int b, int c) {
        return a == b;
    }

    //类型不同
    public static boolean compare(long a, long b) {
        return a == b;
    }

    public static void main(String[] args) {

        getMax(10,20);
    }
}
