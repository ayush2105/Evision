package onlinebankingsystem;

import java.util.Date;

public class Registration extends BankingSystem {
    String username;
    String password;
    String email;
    long mobileNumber;
    Date dateOfBirth;
    char gender;
    Registration(){
        this.username="";
        this.password="";
        this.email="";
        this.mobileNumber=0;
        this.gender=' ';
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername(){
       return this.username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public long getMobileNumber(){
        return this.mobileNumber;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return this.gender;
    }
}
