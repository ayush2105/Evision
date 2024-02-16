package array;

public class LargestNumber {
    public static void main(String[] args) {
        int x[]={1,22,22,45,65,99,12,32,54,66,976};
        int largest=x[0];
        for(int i=0;i<x.length;i++){
            if(largest<x[i]){
                largest=x[i];
            }
        }
        System.out.println("Largest number in array is : "+largest);
    }
}
