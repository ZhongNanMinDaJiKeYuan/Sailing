package com.itheima2;

public class RobbyRelive {
    /*用数组模拟
    1.     arr[0]
    2.     arr[1]
    3.     arr[2] = arr[0] + arr[1]
    4.     arr[3] = arr[1] + arr[2]

    */
    public static void main(String[] args) {

        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;

        for (int x = 2; x <arr.length; x++) {
            arr[x] = arr[x - 2] + arr[x - 1];
        }
        System.out.print("the Logarithm of the twentieth month rabbit is: " + arr[19]);

    }
}
