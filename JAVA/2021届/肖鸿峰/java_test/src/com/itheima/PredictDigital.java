package com.itheima;
import java.util.Random;
import java.util.Scanner;

public class PredictDigital {
    public static void main(String[] args) {


        Random r = new Random();
        int number = r.nextInt(100)+1;

        System.out.println("please enter your number: ");

        while(true) {
            Scanner sc = new Scanner(System.in);
            //System.out.println("number:" + number);
            int ipt = sc.nextInt();

            if (ipt > number) {
                System.out.println("too many");
                continue;
            }else if(ipt < number){
                System.out.println("too small");
                continue;
            }else{
                System.out.println("get it");
                break;
            }

        }
    }
}
