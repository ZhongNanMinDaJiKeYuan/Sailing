package com.itheima;

public class ZhuFeng {
    public static void main(String[] args) {
//while与do while
        int count = 0;
        double paper = 0.1;
        int zf = 8844430;

        while(paper <= zf) {
            paper *= 2;
            count += 1;
        }
        System.out.println("count: " + count);
        System.out.println("------------");
        do {
            System.out.println("count: " + count);
            paper *= 2;
            count += 1;
        }while(paper <= zf);

        //continue and break

    }
}
