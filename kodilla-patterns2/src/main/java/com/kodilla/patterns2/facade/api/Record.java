package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Record {

    private static final Logger LOGGER = LoggerFactory.getLogger(Record.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(order, userId)")
    public void logEvent(OrderDto order, Long userId){
        LOGGER.info("The user " +  userId + " has started the ordering process.");
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Duration of the process order: " + (end - begin) + "ms");
        } catch (Throwable throwable){
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
