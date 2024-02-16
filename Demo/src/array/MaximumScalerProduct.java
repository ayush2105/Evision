package array;

public class MaximumScalerProduct {
    public static void main(String[] args) {
        int x[]={21,12,32,12,44,32};
        int x1[]={1,20,21,31,12,45};
        int temp=0;
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]>x[j]){
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        for(int i=0;i<x1.length;i++){
            for(int j=i+1;j<x1.length;j++){
                if(x1[i]>x1[j]){
                    temp=x1[i];
                    x1[i]=x1[j];
                    x1[j]=temp;
                }
            }
        }
        int product=0;
        for(int i=0;i<x.length;i++){
            product=product+(x[i]*x1[i]);
        }
        System.out.println("Maximum scalar Product is : "+product);

    }

}
