package com.lks.springbootdemo01.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class R {
    boolean flag;
    Object data;
    String msg;

    public R(){
    }

    public R(boolean flag){
        this.flag = flag;
    }

    public R(boolean flag, Object data){
        this.flag = flag;
        this.data = data;
    }
    public R(boolean flag, String msg){
        this.flag = flag;
        this.msg = msg;
    }
    public R(boolean flag, Object data,String msg){
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }
}
