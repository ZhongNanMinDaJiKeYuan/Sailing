package com.itheima;

//求最高
import java.util.Scanner;
public class ThreeBonzes{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个和尚的身高：");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高：");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高：");
        int height3 = sc.nextInt();

        int tempHeight = height1 > height2 ? height1 : height2;
        int lastHeight = tempHeight > height3 ? tempHeight : height3;
        System.out.println("the highest bonze is :" + lastHeight);
    }
}
