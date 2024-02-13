package stream;

import java.util.StringJoiner;

public class JoinerString {
    public static void main(String[] args) {
        StringJoiner stringJoiner=new StringJoiner(",",",",",");
        stringJoiner.add("Ayush");
        stringJoiner.add("Gaurav");
        stringJoiner.add("Nikhil");
        stringJoiner.add("Sakshi");
        System.out.println(stringJoiner);
    }
}
