package com.springmvc.springaopdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingClass {

    public static final Logger LOGGER = LoggerFactory.getLogger(LoggingClass.class);

    @Before(value = "execution(* com.springmvc.springaopdemo.service.JobService.getAllJobs()))" )
    public void loggerMethod(JoinPoint jp){
        LOGGER.info("Logger method called! " + jp.getSignature().getName());
    }

    @After(value = "execution(* com.springmvc.springaopdemo.service.JobService.getAllJobs()))" )
    public void loggerMethodExecuted(JoinPoint jp){
        LOGGER.info("Logger method executed! " + jp.getSignature().getName());
    }

    @AfterThrowing(value = "execution(* com.springmvc.springaopdemo.service.JobService.getAllJobs()))" )
    public void loggerMethodCrash(JoinPoint jp){
        LOGGER.info("Logger method crashed! " + jp.getSignature().getName());
    }

    @AfterReturning(value = "execution(* com.springmvc.springaopdemo.service.JobService.getAllJobs()))" )
    public void loggerMethodExecutedSuccessfully(JoinPoint jp){
        LOGGER.info("Logger method returned a value! " + jp.getSignature().getName());
    }

}
