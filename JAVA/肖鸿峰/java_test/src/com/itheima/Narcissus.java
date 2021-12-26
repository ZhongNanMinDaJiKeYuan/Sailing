package com.itheima;

public class Narcissus {
    public static void main(String[] args) {
        //水仙花数：
        //1.是一个三位数
        //2.个位十位百位的数字立方和等于原数
        int temp = 0;
        for(int i =100; i <= 999; i++) {

            double i1 = i % 10;//个位
//            System.out.println("i1 :" + i1);
            double i2 = i /100;//百位
//            System.out.println("i2 :" + i2);
            double i3 = i / 10 % 10;//十位
//            System.out.println("i3 :" + i3);
            double sumi = Math.pow(i1 , 3) + Math.pow(i2 , 3) + Math.pow(i3 , 3);
//            System.out.println("sumi :" + sumi);
            int Sumi = (int)sumi;
//            System.out.println("Sumi :" + Sumi);
            if( Sumi == i ) {
                temp += 1;
                System.out.println("narcissistic number is: " + i);

            }

        }
        System.out.println("the count of narcissistic number is: " + temp);
    }
}
