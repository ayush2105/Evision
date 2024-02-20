package array;

public class SumOfArray {
    public static void main(String[] args) {
        int x[]={10,20,35,12,54,23,43,12,32,99};
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum=sum+x[i];
        }
        System.out.println("Sum of array is :"+sum);
    }
}
