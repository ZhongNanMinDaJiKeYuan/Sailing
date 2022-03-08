package com.itheima3;

//类与对象
//类：对象的数据类型；
//具有相同属性和行为的一组对象的集合
//属性（对象的特性），行为（对象能干什么）

/*类定义
public class 类名{
    成员变量
            ...

    成员方法
            ...
  }
*/
public class Test0 {
    //成员变量
    String brand;
    private int price;

    //成员方法
    public void call() {
        System.out.println("phone");
    }

    public int Getre() {
        return price;
    }

    public void sendMessage() {
        System.out.println("message");
    }
}

