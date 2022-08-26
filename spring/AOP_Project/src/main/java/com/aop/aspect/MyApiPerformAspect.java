package com.aop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiPerformAspect {


    @Before("PointcutExpression.forDAOPackageExcludeSetterGetter()")
    public void performApiLogic(){
        System.out.println("-------> performance API Operation");
    }

}
