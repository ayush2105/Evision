package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountString {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.addAll(List.of("Abhay","Shyam","Ram","Sonu","Ronit"));
//        Stream<String> stringStream=stringList.stream();
        long newList=stringList.stream()
                .filter(e->e.length()>4)
                .count();
//                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
