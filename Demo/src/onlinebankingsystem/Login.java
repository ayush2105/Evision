package onlinebankingsystem;

public class Login extends BankingSystem{
    int accountBalance=0;
    public void depositMoney(int amount){
        accountBalance=accountBalance+amount;
        System.out.println("Account balance is : "+accountBalance);

    }
    public void withdrawMoney(int amount){
        accountBalance=accountBalance-amount;
        System.out.println("Account balance is : "+accountBalance);
    }





}
