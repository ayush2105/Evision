package ExpressionLambda;

import java.util.Scanner;
interface lambdas{
    public int add(int a,int b);
}

public class SumOfTwoLambdas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter a 1st number : ");
        x=sc.nextInt();
        System.out.println("Enter a 2nd number ");
        y=sc.nextInt();
        lambdas l=(a,b)->{
            return a+b;
        };
        System.out.println(l.add(x,y));


    }
}
