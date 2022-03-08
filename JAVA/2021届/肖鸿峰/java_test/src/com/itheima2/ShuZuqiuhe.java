package com.itheima2;

public class ShuZuqiuhe {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int sum = 0;
        //判断元素是否满足条件
        for(int x=0; x<arr.length; x++) {
            if(arr[x]%10!=7 && arr[x]/10%10!=7 && arr[x]%2 == 0) {
                sum += arr[x];
            }
        }
        System.out.println("sum: " + sum);
    }
}
