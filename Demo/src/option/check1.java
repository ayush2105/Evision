package option;

import com.sun.security.jgss.GSSUtil;

import java.util.Optional;

public class check1 {
    public static void main(String[] args) {
        String s1[]=new String[10];
        s1[3]="Hello";
        Optional<String> op=Optional.ofNullable((s1[3]));
//        if(op.isPresent()){
//            System.out.println("Value present ");
//        }
//        else {
//            System.out.println("No Value");
//        }
        op.ifPresent(System.out::println);

    }
}
