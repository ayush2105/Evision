package array;

public class SmallestNumberInArray {
    public static void main(String[] args) {
                int x[]={1,-12,22,45,65,99,12,23,4,66,96};
                int smallest=x[0];
                for(int i=0;i<x.length;i++){
                    if(smallest>x[i]){
                        smallest=x[i];
                    }
                }
                System.out.println("Smallest number in array is : "+smallest);
    }

}
