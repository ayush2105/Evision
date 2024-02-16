package Numbers;

public class HCF {
    public static void main(String[] args) {
        int num=15,num1=30,hcf=0;
        for(int i=1;i<=num || i<=num1;i++){
            if(num%i==0 && num1%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF is : "+hcf);
    }
}
