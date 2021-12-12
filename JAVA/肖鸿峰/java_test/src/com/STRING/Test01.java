package com.STRING;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        //已知用户名与密码
        String username = "itheima";
        String password = "123456";

        //接受键盘输入
        Scanner sc = new Scanner(System.in);

        for (int i = 3; i > 0; i--) {

            //用户名提示与输入
            System.out.println("please enter your username: ");
            String name = sc.nextLine();

            //密码提示与输入
            System.out.println("please enter your password: ");
            String pass = sc.nextLine();

            if (name.equals(username) && pass.equals(password)) {
                System.out.println("SUCCESS");
                break;
            } else {
                System.out.println("error!!!");
                System.out.println("please enter one more time");
                System.out.println("You have " + (i - 1) + " more chances");
            }

            if (i == 1)
                System.out.println("You have run out of chances, please try again later");


        }
    }
}
