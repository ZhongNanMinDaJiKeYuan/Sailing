package com.itheima2;

public class ShuZuneirongxiangtong {
    //比较两个数组是否相同
    public static void main(String[] args) {


        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};

        //调用方法
        boolean bl = compare(arr1, arr2);
        System.out.println(bl);
    }

    public static boolean compare(int[] arr1, int[] arr2) {
        //先比较两个数组的长度
        if (arr1.length != arr2.length) {
            return false;
        }
        //再遍历数组中元素进行比较
        for (int x = 0; x < arr1.length; x++) {
            if (arr1[x] == arr2[x]) {
                return true;
            }
        }


        return false;
    }
}