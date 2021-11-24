package com.gavin.MyAspect;


import jdk.swing.interop.SwingInterOpUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class myAspect {
    public void check(JoinPoint joinPoint) throws Throwable {
        System.out.println("检查通过");
    }

    public void login(JoinPoint joinPoint) throws Throwable {
        System.out.println("记得按时归还哟");
    }

    public Object operateSocket(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("开始运行");
        Object proceed = proceedingJoinPoint.proceed();
        return proceed;
    }

    public void ifException(JoinPoint joinPoint ,Throwable e) throws Throwable {
        System.out.println(e.getMessage());
    }

    public void exitSocket(JoinPoint joinPoint) throws Throwable {
        System.out.println("退出登录");

    }
}
