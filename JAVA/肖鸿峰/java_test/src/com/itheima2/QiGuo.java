package com.itheima2;

public class QiGuo {
    public static void main(String[] args) {
        //数据处于1-100间，逢七过
        System.out.print("[");
        for(int x=1; x<=100; x++) {
            if(x%7 == 0) {

                System.out.print(x + " ");
            }

        }
        System.out.print("]");
    }
}
