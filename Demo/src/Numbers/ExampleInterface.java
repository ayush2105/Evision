package Numbers;


public class ExampleInterface {
    public static  void main(String []args){
        interface addition{
             abstract int add(int a,int b);
        }
        class a implements addition{
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        }
        addition A=new a();
        System.out.println(A.add(10,20));
    }
}
