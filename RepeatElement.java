package array;

public class RepeatElement {
    public static void main(String[] args) {
        int x[]={1,2,3,4,1,2,4,5,8,8};
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]==x[j]){
                    System.out.println(x[j]);
                }
            }
        }
    }
}
