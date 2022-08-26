package com.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;


public class PointcutExpression {

    @Pointcut("execution(* com.aop.dao.*.*(..))")
    public void pointcutDAOPackage(){

    }

    @Pointcut("execution(* com.aop.dao.*.get*(..))")
    public void getter(){

    }

    @Pointcut("execution(* com.aop.dao.*.set*(..))")
    public void setter(){

    }

    @Pointcut("(pointcutDAOPackage()) && !(setter() || getter())")
    public void forDAOPackageExcludeSetterGetter(){

    }
}
