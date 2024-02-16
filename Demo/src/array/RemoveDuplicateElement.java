package array;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int x[]={1,1,2,2,3,3,4,5,7,7,7};
        int temp[]=new int[x.length];
        int a=x.length,j=0;
        for(int i=0;i<a-1;i++){
            if(x[i]!=x[i+1]){
                temp[j++]=x[i];
            }
        }
        temp[j++]=x[a-1];
        for(int i=0;i<j;i++){
            x[i]=temp[i];
        }
        for(int y:x){
            System.out.println(y);
        }


    }

}
