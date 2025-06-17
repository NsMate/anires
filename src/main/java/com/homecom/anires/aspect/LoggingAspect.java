package com.homecom.anires.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(@org.springframework.web.bind.annotation.GetMapping * com.homecom.anires.controller..*(..))")
    public void getMappingMethods() {}


    @AfterReturning(pointcut = "getMappingMethods()", returning = "result")
    public void logAfterReturning(Object result) {
        System.out.println("Returned value: " + result);
    }
}
