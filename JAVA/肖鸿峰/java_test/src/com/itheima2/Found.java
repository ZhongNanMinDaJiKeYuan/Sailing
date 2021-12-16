package com.itheima2;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Found {
    public static void main(String[] args) {

        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("please enter your data: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int index = getIndex(arr, number);
        //定义一个方法用于查找指定数据在数组中的索引
        //明确返回值类型和参数
    }

    public static int getIndex(int[] arr, int number) {

        int index = 1;
        for(int x=0; x<arr.length; x++) {
            if (arr[x] == number) {
                index = x;
                break;
            }else {
                System.out.println("none of your data");
                break;
            }
        }
        return index;

    }
}
