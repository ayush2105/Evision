package array;

public class FrequencyOfArray {
    public static void main(String[] args) {
        int x[]={1,23,43,12,1,22,23,43};
        int temp;
        for(int i=0;i<x.length;i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.println(" ");
        for(int i=0;i<x.length;i++){
            int flag=0;
            int count=0;
            for(int j=i+1;j<x.length;j++){
                if(x[i]==x[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==1) continue;


            for(int j=0;j<=i;j++){
                if(x[i]==x[j]){
                    count++;
                }
            }
            System.out.println(x[i]+" : "+count);

        }


    }
}
