package array;

public class LargestAndSmallestNumberInArray {
    public static void main(String[] args) {
        int x[]={1,23,43,5,12,88,976,32,-98,12,98};
        int largest=x[0];
        int smallest=x[0];
        for(int i=0;i<x.length;i++){
            if(largest<x[i]){
                largest=x[i];
            }
            if(smallest>x[i]){
                smallest=x[i];
            }
        }
        System.out.println("Largest element is :"+largest);
        System.out.println("Smallest element is :"+smallest);
    }
}
