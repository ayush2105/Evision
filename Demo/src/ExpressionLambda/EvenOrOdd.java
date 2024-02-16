package ExpressionLambda;

import java.util.Scanner;

interface check{
    public void evenOrOdd(int a);
}
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter a number : ");
        x=sc.nextInt();
        check c=(p)->{
            if(x%2==0){
                System.out.println("Even number : "+p);
            }
            else{
                System.out.println("odd number : "+p);
            }
        };
        c.evenOrOdd(x);


    }
}
