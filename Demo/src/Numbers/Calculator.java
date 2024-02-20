package Numbers;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        char ch;
        System.out.print("Enter a 1st number : ");
        x=sc.nextInt();
        System.out.print("Enter a 2nd number : ");
        y=sc.nextInt();
        System.out.println("Select any one of them");
        System.out.println("Addition -> a : Substraction -> s : Multiplication -> m : Division -> d ");
        ch=sc.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.print("Addition of two number is : ");
                System.out.println(x+y);
                break;
            case 's':
                System.out.print("Subtraction of two number is : ");
                System.out.println(x-y);
                break;
            case 'm':
                System.out.print("Multiplication of two number is : ");
                System.out.println(x*y);
                break;
            case 'd':
                System.out.print("Division of two number is : ");
                System.out.println(x/y);
                break;
            default:
                System.out.println("Invalid Input");




        }
    }
}
