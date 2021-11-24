package com.gavin.MyAspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Aspect
@Component("myAspect")
public class myAspect {
    @Pointcut("execution(* com.gavin.dao.UserDaoImp.*(..))")
    public void pointCut(){}
    @Before(value = "pointCut()")
    public void check(JoinPoint joinPoint) throws Throwable {
        System.out.println("检查通过");
    }
@AfterReturning(value = "pointCut()" ,returning = "joinPoint")
    public void login(JoinPoint joinPoint) throws Throwable {
        System.out.println("记得按时归还哟");
    }
@Around(value = "pointCut()")
    public Object operateSocket(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("开始运行");
        Object proceed = proceedingJoinPoint.proceed();
        return proceed;
    }
@AfterThrowing(value = "pointCut()",throwing = "e")
    public void ifException(JoinPoint joinPoint ,Throwable e) throws Throwable {
        System.out.println(e.getMessage());
    }
@After(value = "pointCut()")
    public void exitSocket(JoinPoint joinPoint) throws Throwable {
        System.out.println("退出登录");

    }
}
