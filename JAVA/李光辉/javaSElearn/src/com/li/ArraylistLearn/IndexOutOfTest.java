package com.li.ArraylistLearn;


import java.util.ArrayList;

public class IndexOutOfTest {
    public static ArrayList list;
    private static class MyThread1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        }
    }
    private static class MyThread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        }
    }
    public static void main(String[] args) {
        list = new ArrayList(1);
//        list.add(1);
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }
}

