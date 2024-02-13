package array;

public class NonRepeatElement {
    public static void main(String[] gg){
        int x[]={1,2,1,2,3,4,5,1};
        System.out.println("Non Repeating elements is :");
        findNonRepeatElement(x);
    }
    static void findNonRepeatElement(int x[]){
        boolean check;
        for(int i=0;i<x.length;i++){
            check=false;
            for(int j=0;j<x.length;j++){
                if(i!=j && x[i]==x[j]){
                    check=true;
                    break;
                }
            }
            if(!check) {
                System.out.print(x[i]+",");
            }
        }

    }


}
