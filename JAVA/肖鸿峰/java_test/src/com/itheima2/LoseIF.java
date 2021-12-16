package com.itheima2;
import java.util.Scanner;

public class LoseIF {
    public static void main(String[] args) {
        //cin
        System.out.println("please enter the day: ");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
//        if(week == 1) {
//            System.out.println("you need to run");
//        }else if(week == 2) {
//            System.out.println("you need to swim");
//        }else if(week == 3) {
//            System.out.println("you need to walk");
//        }else if(week == 4) {
//            System.out.println("you need Dynamic Cycling");
//        }else if(week == 5) {
//            System.out.println("you need to Boxing");
//        }else if(week == 6) {
//            System.out.println("you need to climb a mountain");
//        }else if(week == 7) {
//            System.out.println("you need to relax");
//        } else {
//            System.out.println("number error!");
//        }
        switch (week) {
            case 1:
                System.out.println("you need to run");
                break;
            case 2:
                System.out.println("you need to swim");
                break;
            case 3:
                System.out.println("you need to walk");
                break;
            case 4:
                System.out.println("you need to Cycling");
                break;
            case 5:
                System.out.println("you need to Boxing");
                break;
            case 6:
                System.out.println("you need to climb a mountain");
                break;
            case 7:
                System.out.println("you need to relax");
                break;
            default:
                System.out.println("number error!!!");
        }
    }
}
