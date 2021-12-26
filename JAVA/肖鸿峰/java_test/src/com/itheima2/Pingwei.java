package com.itheima2;
import java.util.Scanner;

public class Pingwei {
    public static void main(String[] args) {

        //创建数组，动态初始化 长度为6
        double[] arr = new double[6];
        System.out.println("please enter six scores");
        Scanner sc = new Scanner(System.in);

        //将键盘录入的数据放入数组中
        double sum = 0;
        for(int x=0; x<arr.length; x++) {
            System.out.println("please enter " + (x+1) +" judge's rating: ");
            arr[x] = sc.nextDouble();
            sum += arr[x];
        }

        double max = MAXdata(arr);
        double min = MINdata(arr);

        System.out.println("the Contestants' score is :" + (sum - max - min)/4);
    }


    //求数组中最大值
    public static double MAXdata(double[] arr) {
        double num = 0;
        for(int x=1; x<arr.length; x++) {
            if (arr[x]>arr[x-1]) {
                num = arr[x];
            }else {
                num = arr[x-1];
            }
        }
        return num;
    }

    public static double MINdata(double[] arr) {
        double num = 0;
        for(int x=1; x<arr.length; x++) {
            if (arr[x]>arr[x-1]) {
                num = arr[x-1];
            }else {
                num = arr[x];
            }
        }
        return num;
    }
}
