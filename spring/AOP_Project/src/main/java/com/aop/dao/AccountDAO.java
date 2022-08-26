package com.aop.dao;

import com.aop.pojo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(Account account, boolean val){
        System.out.println(getClass()+" Adding Accounts");
    }

    public void setter(){
        System.out.println(getClass()+" Setter method");
    }
}
