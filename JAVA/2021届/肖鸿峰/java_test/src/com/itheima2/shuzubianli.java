package com.itheima2;

public class shuzubianli {
    //System.out.print(),输出内容不换行
    int[] arr = {11, 22, 33, 44, 55};
    //数组的遍历
//    public static void printArray(int[] arr) {
//        for(int x=0; x<arr.length; x++) {
//            System.out.println(arr[x]);

//        }
//    }
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        //调用
        //printArray(arr);
        maxArray(arr);
    }


        //遍历方法的定义
    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int x=0; x<arr.length; x++) {
            if (x == arr.length-1) {
                System.out.print(arr[x]);
            }else{
                System.out.print(arr[x] + ",");
            }
        }
        System.out.println("]");
    }
    //求最大值方法的定义
    public static void maxArray(int[] arr) {
        int max_number = 0;
        for(int x=1; x<arr.length; x++) {
            if(arr[x] > arr[x-1]) {
                max_number = arr[x];
            }else{
                max_number = arr[x-1];
            }
        }
        System.out.println("max number is :" + max_number);
    }

}
