package aop.advice.demo;

import aop.advice.config.DemoConfig;
import aop.advice.dao.AccountDAO;
import aop.advice.pojo.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class DemoClass {

    private static Logger logger =
            Logger.getLogger(DemoClass.class.getName());

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        accountDAO.addAccount(new Account("Ashok","Gold"));
        accountDAO.addAccount(new Account("Rahul","Silver"));

        List<Account> accountList = null;

        try{

             accountList = accountDAO.getAccountList();

            if(accountList != null)
                logger.info(accountList.toString());

            //System.out.println(accountDAO.getAccountList());
        }
        catch (Exception exp){

            logger.info("Exception in demo class "+exp.getMessage());

           // System.out.println("Exception in demo class "+exp.getMessage());
        }


        context.close();
    }
}
