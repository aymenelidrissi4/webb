package com.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class StepValidationAspect {
    public Object validate(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("hello from here");
        return joinPoint.proceed();
    }
}