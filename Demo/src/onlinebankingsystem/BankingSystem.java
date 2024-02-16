package onlinebankingsystem;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press : ");
        System.out.println("1 for Registration");
        System.out.println("2 for Login");
        System.out.println("3 for Exit ");
        System.out.println("Select any one : ");
        int press= sc.nextInt();
        switch(press){
            case 1:
                System.out.println("Call to Registration: ");
                Registration registration=new Registration();
                break;
            case 2:
                System.out.println("Call to Login ");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

}
