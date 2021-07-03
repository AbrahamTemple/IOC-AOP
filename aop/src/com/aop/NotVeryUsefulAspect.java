package com.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.7.2
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */

@Aspect
@Component
public class NotVeryUsefulAspect {

    @Pointcut("execution(* com.dao.*.*(..))")
    private void anyOldTransfer() {}

    @Before("anyOldTransfer()")
    public void doAccessCheck() {
        System.out.println("---在执行之前---");
    }
}
