package com.itheima;

import java.util.Scanner;
//scanner类表示 简单的文本扫描器
/*
1.导入对应的包
2.创建Scanner对象，new创建一个对象
 */
public class DataCin {
    public static void main(String[] args){

        //创建对象
        Scanner sc = new Scanner(System.in);
        //接受数据
        int x = sc.nextInt();//nextInt()接受int类型
        String str = sc.next();//next()接受一个字符串
        //输出数据
        System.out.println("x: " + x);
    }
}
