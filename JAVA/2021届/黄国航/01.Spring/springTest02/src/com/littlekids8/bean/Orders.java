package com.littlekids8.bean;

public class Orders {
    private String ordersName;

    public Orders() {
        System.out.println("执行无参数构造创建bean实例");
    }

    public void setOrdersName(String ordersName) {
        this.ordersName = ordersName;
        System.out.println("调用set方法");
    }
    // 执行初始化方法
    public void init(){
        System.out.println("调用初始化方法");
    }
    // 销毁的方法
    public void destroy(){
        System.out.println("销毁");
    }
}
