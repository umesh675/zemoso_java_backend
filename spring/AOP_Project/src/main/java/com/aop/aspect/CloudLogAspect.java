package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CloudLogAspect {


    @Before("PointcutExpression.forDAOPackageExcludeSetterGetter()")
    public void cloudLogAspect(){
        System.out.println("-------> perform cloud log aspect");
    }
}
