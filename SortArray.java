package array;

public class SortArray {
    public static void main(String[] args) {
        int x[]={10,20,-3,50,35};
        int temp;
        System.out.println("After sorting of arrays is : ");
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]>x[j]){
                 temp=x[i];
                 x[i]=x[j];
                 x[j]=temp;
                }
            }
            System.out.println(x[i]);
        }



    }
}
