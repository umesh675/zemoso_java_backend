package pract3;

import pract2.Account;

public class Main1 extends Account{

    public static void main(String[] args) {

        Account account1 = new Account(); // you can not access protected method parent name in other package class
        Account account2 = new Main1(); // you also can not access protected method via account(parent) reference

        Main1  account = new Main1(); // you only access protected method via child reference

        account.setAccountNo("1234455667");

        System.out.println(account.getAccountNo());
    }
}
