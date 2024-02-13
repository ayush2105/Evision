package array;

public class CountEvenOrOdd {
    public static void main(String[] args) {
        int x[]={10,20,21,23,40,10,45};
        int count=0;
        int o_count=0;
        for(int i=0;i<x.length;i++){
            if(x[i]%2==0){
                count++;
            }
            else{
                o_count++;
            }
        }
        System.out.println("Total even number is : "+count);
        System.out.println("Total odd number is : "+o_count);
    }

}
