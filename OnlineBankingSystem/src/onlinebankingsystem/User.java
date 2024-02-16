package onlinebankingsystem;

import java.util.Date;

public class User{
    String userName;
    String password;
    String email;
    long mobileNumber;
    String dateOfBirth;
    char gender;
    int accountBalance;

    public User(String userName,String password,String email,long mobileNumber,String dateofBirth,char gender){
        this.userName=userName;
        this.password=password;
        this.email=email;
        this.mobileNumber=mobileNumber;
        this.dateOfBirth=dateofBirth;
        this.gender=gender;
        this.accountBalance=0;
    }
}
