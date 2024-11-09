package com.example.foyer_5se3.AOP;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//La classe : Aspect
@Component
@Aspect
@Slf4j
public class FoyerAspect {
   /*
    @Before("execution(* com.example.foyer_5se3.Services..*.*(..))")
    public void method(JoinPoint jp){
        log.info("hello "+jp.getSignature().getName());
    }
    @After("execution(* com.example.foyer_5se3.Services..*.*(..))")
    public void methoAfter(JoinPoint jp){
        log.info("Bye bye "+jp.getSignature().getName());
    }

    @Around("execution(* com.example.foyer_5se3.Services..*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable
    {
        long start = System.currentTimeMillis();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return null;
    }*/
}