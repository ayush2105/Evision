package ExpressionLambda;
interface num{
    public int aray(int a);
}
public class lagrestNum {
    public static void main(String[] args) {
        int []arr={10,20,30,10,99};
        int y=arr[0];
        num n=(a)->{
            int p=0;
            for(int i=0;i<arr.length;i++){
                if(y<arr[i]) {
                    p = arr[i];
                }
            }
            return p;
        };

    }
}
