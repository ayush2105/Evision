package array;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int x[]={1,23,11,43,45,65,12,76,55,95};
        int temp;
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]>x[j]){
                 temp=x[i];
                 x[i]=x[j];
                 x[j]=temp;
                }
            }
        }
        System.out.println("Second smallest number is : "+x[1]);
    }
}
