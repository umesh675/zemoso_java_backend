package com.aop.demo;

import com.aop.config.DemoConfig;
import com.aop.dao.AccountDAO;
import com.aop.dao.MembershipDAO;
import com.aop.pojo.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClass {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO",MembershipDAO.class);

        System.out.println("AccountDAO class");
        accountDAO.addAccount(new Account(),true);

        System.out.println("\n\n MembershipDAO class");
        membershipDAO.addAccount();

        System.out.println("\n\n Setter method");
        accountDAO.setter();

        context.close();
    }
}
