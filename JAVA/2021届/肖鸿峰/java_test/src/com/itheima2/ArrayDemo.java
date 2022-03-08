package com.itheima2;

public class ArrayDemo {
    /*
     1.定义数组:
     int[] arr

     2.数组动态初始化:
     int[] arr = new int[3];

     3.数组元素访问：
          索引
       [0] [1]......注意索引超出

     4.内存分配：
     int[] arr = new int[3];
     左边“int[] arr” arr指向右边，arr保存的是地址，放入栈内存中
     右边“new int[3]”即一个地址，放入堆内存。
     System.out.println(arr);会输出地址
     System.out.println(arr[0]);输出数组中对应位置的内容
     注：数组在初始化时会为储存空间添加默认值
         int：默认值0
         double：0.0
         bool：false
         字符：空字符
         引用数据类型：null
每一个new出来的东西都有一个地址值，
使用完毕后会在垃圾回收器空闲时被回收。

    5.静态初始化
    int[] arr = new int[]{1,2,3};

    6.遍历和最大值
    int[] arr = {11,22,33,44,55};
    for(int x=0; x<arr.length; x++) {...}

    int[] arr = {12,45,98,73,60};
    int max = arr[0];
    逐个比较
    for(int x=0; x<arr.length; x++) {
        if(arr[x]>max) {
            max = arr[x];
        }
    }

    */
}
