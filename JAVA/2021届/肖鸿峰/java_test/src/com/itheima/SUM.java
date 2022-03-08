package com.itheima;

public class SUM {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("sum: " + sum);
        //求偶数和
        int sum1 = 0;
        for(int i =1; i <= 100; i++) {
            if(i % 2 == 0) {
                sum1 += i;
            }
        }
        System.out.println("sum1: " + sum1);
    }
}
