package onlinebankingsystem;
//ayush.p, 88811911
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
//annu,123abc
public class BankingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press : ");
            System.out.println("1 for Registration");
            System.out.println("2 for Login");
            System.out.println("3 for Exit ");
            System.out.println("Select any one : ");
            int press = sc.nextInt();
            sc.nextLine();
            switch (press) {
                case 1:
                    System.out.println("Call to Registration: ");
//                Registration registration=new Registration();
                    registration(sc);
                    break;
                case 2:
                    System.out.println("Call to Login ");
                    login(sc);
                    break;
                case 3:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    private static void registration(Scanner sc) {
        System.out.println("Fill all the details mention in below : ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String userName, password, email;
        long mobile;
        char gender;
        System.out.println("Enter a username : ");
        userName = sc.nextLine();

        System.out.println("Enter a password : ");
        password = sc.nextLine();

        System.out.println("Enter a email : ");
        email = sc.nextLine();

        System.out.println("Enter a Mobile number(Only Int) : ");
        mobile = sc.nextLong();
        System.out.println("Enter a Date Of Birth(YYYY-MM-DD) : ");
        String date = sc.next();
        try {
            Date dateOfBirth = dateFormat.parse(date);
//            System.out.println("You entered  :"+dateOfBirth);
        } catch (ParseException pe) {
            System.out.println("Invalid date format.");
        }
        System.out.println("Enter a Gender(M/F) : ");
        gender = sc.next().charAt(0);
        UserManager.registerUser(userName, password, email, mobile, date, gender);
    }

    private static void login(Scanner sc) {
        System.out.println("Enter a Username : ");
        String userName = sc.nextLine();
        System.out.println("Enter a Password : ");
        String password = sc.nextLine();
        User loggedInUser = UserManager.loginUser(userName, password);
        if (loggedInUser != null) {
            showOptions(sc,loggedInUser);
        } else {
            System.out.println("Username and Password is invalid");
        }
    }
    private static void showOptions(Scanner sc,User loginInUser){
        while(true){
            System.out.println("Choose any one Option : ");
            System.out.println("1 for Transaction");
            System.out.println("2 for Transaction History");
            System.out.println("3 for Back");
//            System.out.println("1 for Deposit Money");
//            System.out.println("2 for Withdraw Money");
//            System.out.println("3 for Return to Main Menu");
            int press=sc.nextInt();
                switch(press){
                case 1:
                    System.out.println("Call to Transaction");
                    System.out.println("Select any one : ");
                    System.out.println("1 for Transaction using Saving Account");
                    System.out.println("2 for Transaction using Current Account");
                    System.out.println("3 for Back");
                    int y=sc.nextInt();
                    switch (y){
                        case 1:
                            System.out.println("Calling to saving account");
                            System.out.println("1 for deposit money");
                            System.out.println("2 for withdraw money");
                            System.out.println("3 for back");
                            int a= sc.nextInt();
                            switch (a) {
                                case 1:
                                    depositMoneySaving(sc, loginInUser);
                                    break;
                                case 2:
                                    withdrawMoneySaving(sc,loginInUser);
                                    break;
                                case 3:
                                    System.out.println("Back");
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Calling to Current account");
                            System.out.println("1 for deposit money");
                            System.out.println("2 for withdraw money");
                            System.out.println("3 for back");
                            int b=sc.nextInt();
                            switch (b){
                                case 1:
                                    depositMoneyCurrent(sc, loginInUser);
                                case 2:
                                    withdrawMoneyCurrent(sc, loginInUser);
                                case 3:
                                    System.out.println("Back");
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Back");
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;





//                    System.out.println("1 for deposit money");
//                    System.out.println("2 for withdraw money");
//                    System.out.println("Call to Main menu");
//                    int x=sc.nextInt();
 //                   switch (x){
 //                       case 1:
 //                           depositMoney(sc,loginInUser);
 //                           break;
 //                       case 2:
//                            withdrawMoney(sc,loginInUser);
//                            break;
//                        case 3:
//                            System.out.println("Call to main menu");
//                            break;
//                        default:
//                            System.out.println("Invalid choice");


//                    }
//                    depositMoney(sc,loginInUser);
                case 2:
                    System.out.println("Call to Transaction history");
                    TransactionHistory.displayHistory();
//                    withdrawMoney(sc,loginInUser);
                    break;
                case 3:
                    System.out.println("Call to Return to Main Menu");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
//    static int accountBalance=0;
    private static void depositMoneySaving(Scanner sc,User user){
        System.out.println("Enter a Deposit Amount : ");
        int depositAmount=sc.nextInt();
        sc.nextLine();
        TransactionHistory.addHistory("Deposit amount in saving account: "+depositAmount);
        user.accountBalance= user.accountBalance+depositAmount;
        System.out.println("Deposit Successfully.Your account balance is :"+user.accountBalance);
    }

    private static void depositMoneyCurrent(Scanner sc,User user){
        System.out.println("Enter a Deposit Amount : ");
        int depositAmount=sc.nextInt();
        sc.nextLine();
        TransactionHistory.addHistory("Deposit amount in current account : "+depositAmount);
        user.accountBalance= user.accountBalance+depositAmount;
        System.out.println("Deposit Successfully.Your account balance is :"+user.accountBalance);
    }





    private static void withdrawMoneySaving(Scanner sc,User user){
        System.out.println("Enter a withdraw amount : ");
        int withDrawAmount=sc.nextInt();
        if(user.accountBalance<withDrawAmount){
            System.out.println("Insufficient Account Balance");
            return;
        }
        TransactionHistory.addHistory("Withdraw amount in saving account: "+withDrawAmount);
        user.accountBalance=user.accountBalance-withDrawAmount;
        System.out.println("WithDraw Successfully.Your account balance is :"+user.accountBalance);

    }
    private static void withdrawMoneyCurrent(Scanner sc,User user){
        System.out.println("Enter a withdraw amount : ");
        int withDrawAmount=sc.nextInt();
        if(user.accountBalance<withDrawAmount){
            System.out.println("Insufficient Account Balance");
            return;
        }
        TransactionHistory.addHistory("Withdraw amount in current account: "+withDrawAmount);
        user.accountBalance=user.accountBalance-withDrawAmount;
        System.out.println("WithDraw Successfully.Your account balance is :"+user.accountBalance);

    }





}
