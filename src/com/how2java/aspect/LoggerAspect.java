package com.how2java.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
    @Around(value = "execution(* com.how2java.service.ProductService.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object obj = joinPoint.proceed();
        System.out.println("end log:" + joinPoint.getSignature().getName());
        return obj;
    }

    public  Object performance(ProceedingJoinPoint joinPoint) throws Throwable {
        long starttime = System.nanoTime();
        Object obj = joinPoint.proceed();
        long endtime = System.nanoTime();
        System.out.println("程序运行时间： " + (endtime - starttime) + "ns");
        return obj;
    }
}
