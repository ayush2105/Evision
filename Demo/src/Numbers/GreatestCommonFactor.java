package Numbers;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int x=36,y=60,hcf=1;
        for(int i=1;i<=x ||i<=y;i++ ){
            if(x%i==0 && y%i==0){
                hcf=i;
            }
        }
        System.out.println("Greatest common factor is : "+hcf);
    }
}
