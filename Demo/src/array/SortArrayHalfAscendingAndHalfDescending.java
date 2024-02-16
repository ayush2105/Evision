package array;

public class SortArrayHalfAscendingAndHalfDescending {
    public static void main(String[] args) {
        int x[]={23,12,43,4,66,45};
        int temp;
        System.out.println("Sort of Half Array Ascending and Descending :");
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                if(x[i]>x[j]){
                 temp=x[i];
                 x[i]=x[j];
                 x[j]=temp;
                }
            }
            System.out.print(x[i]+",");
        }

        for(int i=3;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]<x[j]){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
            System.out.print(x[i]+",");
        }
    }
}
