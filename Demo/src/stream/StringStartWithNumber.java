package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStartWithNumber {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.addAll(List.of("Ayush1","1Aush","Somesh","2Vikas","Suyash"));
//        Stream<String> stringStream=stringList.stream();
        List<String> s=stringList.stream()
                .filter(e->Character.isDigit(e.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(s);
    }
}
