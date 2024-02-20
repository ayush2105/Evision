package option;

import java.util.Optional;
import java.util.function.Consumer;

public class check {
    public static void main(String[] args) {
        String[] s =new String[10];
        s[5]="Ayush";
        s[4]="Sameer";
        Optional<String> optionalS=Optional.ofNullable(s[5]);
        if (optionalS.isPresent()) {
        String toLowerCase=s[4].toLowerCase();
        System.out.println(toLowerCase);
        } else {
            System.out.println("String not present");
        }
    }
}
