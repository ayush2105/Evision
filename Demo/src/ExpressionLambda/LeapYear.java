package ExpressionLambda;

import java.util.Scanner;

interface check1{
    public void leapyear(int a);
}

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter a number : ");
        x=sc.nextInt();
        check1 c=(y)->{
            if(x%400==0){
                System.out.println("Leap Year : "+x);
            }
            else if (x%4==0 && x%100!=0) {
                System.out.println("Leap Year : "+x);

                }
            else{
                System.out.println("Not Leap year : "+x);
            }
        };
        c.leapyear(x);

    }
}
