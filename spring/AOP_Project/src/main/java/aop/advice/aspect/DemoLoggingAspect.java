package aop.advice.aspect;

import aop.advice.pojo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Locale;
import java.util.logging.Logger;


@Aspect
//we have to add @component to scan project
@Component
@Order(2)
public class DemoLoggingAspect {


    private final Logger logger = Logger.getLogger(DemoLoggingAspect.class.getName());

    @Around("execution(* aop.advice.dao.AccountDAO.getAccountList(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("-------> @Around Advice\n");

        //System.out.println("-------> @Around Advice");
        long begin = System.currentTimeMillis();

        Object result = null;

        try {
            result = joinPoint.proceed();
            logger.info(result.toString());
        }
        catch (Exception exp){
            logger.info("@Around advice find the exception "+exp.getMessage()+"\n");
        }
        long end = System.currentTimeMillis();

        long duration = end-begin;

        logger.info("Duration of execute getAcoountList method "+duration+" in milli seconds\n");

        //System.out.println("Duration of execute getAcoountList method "+duration+" in milli seconds");


        return result;
    }
    @After("execution(* aop.advice.dao.AccountDAO.getAccountList(..))")
    public void afterFinallyExpr(JoinPoint joinPoint){

        logger.info("\n-----> @After advice execute in exception/success\n");

        //System.out.println("\n-----> @After advice execute in exception/success\n");
    }

    @AfterThrowing(value = "execution(* aop.advice.dao.AccountDAO.getAccountList(..))",
            throwing = "exp")
    public void afterThrowingExc(JoinPoint joinPoint, Exception exp){

        logger.info("After Throwing Exception");
        logger.info("Exception is "+exp.getMessage()+"\n\n");

//        System.out.println("After Throwing Exception");
//        System.out.println("Exception is "+exp.getMessage()+"\n\n");

    }

    @AfterReturning(value = "execution(* aop.advice.dao.AccountDAO.getAccountList(..))",
    returning = "result")
    public void afterSuccessMethod(JoinPoint joinPoint , LinkedList<Account> result){

        logger.info("----> @After Returning Advice");

        logger.info(result.toString()+"\n");

//        System.out.println("After success getAccountList method");
//
//        System.out.println(result);
//
//        System.out.println("your data has been modified");

        for (Account account : result){
            account.setName(account.getName().toUpperCase(Locale.ROOT));
        }

    }




}
