package ExpressionLambda;

import java.util.Scanner;
interface number{
    public void pn(int a);
}

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter a number : ");
        x=sc.nextInt();
        number a=(y)->{
            int n;
            n=x/2;
            for(int i=2;i<=n;i++){
                if(x%i==0){
                    System.out.println("Not Prime");
                    break;
                }
                else{
                    System.out.println("Prime");
                }
            }
        };
        a.pn(x);
    }
}
