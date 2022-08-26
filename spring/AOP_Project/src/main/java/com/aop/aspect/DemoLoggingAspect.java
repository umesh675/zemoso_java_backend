package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.LinkedList;


@Aspect
//we have to add @component to scan project
@Component
@Order(2)
public class DemoLoggingAspect {

    //this advice execute when it found any method addAccount in any class match with return type access-modifier
//    @Before("execution(public void addAccount())") //pointcut expression
//    public void beforeAddAccountAdvise(){
//        System.out.println("-------> Executing @Before advice on addAccount()");
//    }

    //this advice execute when it found any method start with add in any class but match with return type access-modifier
//    @Before("execution(public void add*())") //pointcut expression
//    public void beforeAddAccountAdvise(){
//        System.out.println("-------> Executing @Before advice on addAccount()");
//    }

    //this advice execute when it found any method start with add in any class
//    @Before("execution( void add*())") //pointcut expression
//    public void beforeAddAccountAdvise(){
//        System.out.println("-------> Executing @Before advice on addAccount()");
//    }

    //this advice execute when it found any method start with add & have void return type in any class
//    @Before("execution( * add*())") //pointcut expression
//    public void beforeAddAccountAdvise(){
//        System.out.println("-------> Executing @Before advice on addAccount()");
//    }

//    @Before("execution(public void com.aop.dao.AccountDAO.addAccount())") //pointcut expression
//    public void beforeAddAccountAdvise(){
//        System.out.println("-------> Executing @Before advice on addAccount()");
//    }

    //this advice execute when it found any method addAccount in any class match with return type access-modifier
    //with single account object parameter
//    @Before("execution(public void addAccount(com.aop.pojo.Account))") //pointcut expression
//    public void addAccountAdvise(){
//        System.out.println("-------> Executing @Before advice on addAccount()");
//    }

//    @Before("execution(public void addAccount(com.aop.pojo.Account, .. ))") //pointcut expression
//    public void addAccountAdviseP(){
//        System.out.println("-------> Executing @Before advice on addAccount()");
//    }

//    @Before("execution(public void addAccount(com.aop.pojo.Account,boolean))") //pointcut expression
//    public void addAccountAdviseT(){
//        System.out.println("-------> Executing @Before advice on addAccount()");
//    }


//      @Before("execution(* com.aop.dao.*.*(..))")
//      public void addAccountAdviseForAll(){
//          System.out.println("-------> Executing @Before advice on addAccount()");
//      }


      @Before("PointcutExpression.forDAOPackageExcludeSetterGetter()")
      public void beforeAddAccountAdvice(JoinPoint joinPoint){
          System.out.println("-------> Executing @Before advice on addAccount()");

          MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

          System.out.println(methodSignature);

          Object[] args = joinPoint.getArgs();

          for(Object object : args){
              System.out.print(object+"    ");
          }

          System.out.println();
      }


}
