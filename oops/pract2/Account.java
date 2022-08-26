package pract2;

public class Account {

    private String accountNo;

    protected void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }

    protected String getAccountNo(){
        return this.accountNo;
    }

    public void printMessage(){
        System.out.println("Hello World");
    }
}
