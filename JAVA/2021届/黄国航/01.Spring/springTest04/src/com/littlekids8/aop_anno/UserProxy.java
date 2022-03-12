package com.littlekids8.aop_anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 增强的类
@Component
@Aspect
public class UserProxy {

    // 相同切入点抽取
    @Pointcut(value = "execution(* com.littlekids8.aop_anno.User.add(..))")
    public void pointDemo(){
    }

    // 前置通知
    // @before注解表示作为前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before...");
    }
    // 后置通知
    @After(value = "execution(* com.littlekids8.aop_anno.User.add(..))")
    public void after(){
        System.out.println("after..");
    }

    // 最终通知
    @AfterReturning(value = "execution(* com.littlekids8.aop_anno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning..");
    }

    // 异常通知
    @AfterThrowing(value = "execution(* com.littlekids8.aop_anno.User.add(..))")
    public void afterThrowing(){
        System.out.println("AfterThrowing..");
    }

    // 环绕通知:会在方法
    @Around(value = "execution(* com.littlekids8.aop_anno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕的前面..");
        proceedingJoinPoint.proceed();//原方法的执行
        System.out.println("环绕的后面");
    }
}
