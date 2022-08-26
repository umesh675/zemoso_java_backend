package aop.advice.dao;

import aop.advice.pojo.Account;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class AccountDAO {


    private List<Account> accountList;
    public void addAccount(Account account){

        if(accountList == null)
            accountList = new LinkedList<>();

        accountList.add(account);
    }

    public List<Account> getAccountList() throws Exception {

        if(accountList == null){
            throw new Exception("Account list is empty");
        }
        return accountList;
    }

}
