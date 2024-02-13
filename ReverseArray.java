package array;

public class ReverseArray {
    public static void main(String[] args) {
        int x[]={10,20,30,40,50};
        System.out.print("Reverse of array is :");
        for(int i=x.length-1;i>=0;i--){
            System.out.print(x[i]+",");
        }
    }
}
