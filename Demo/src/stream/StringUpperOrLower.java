package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUpperOrLower {
    public static void main(String[] args) {
        List<String> str=new ArrayList<String>();
        str.addAll(List.of("ameer","sOnu","RAju","JayEsh"));
//        Stream<String> stringStream=str.stream();
        List<String> newList=str.stream()
                .sorted()
                .filter(e->e.length()>3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
