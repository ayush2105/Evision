package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountStringFrequency {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.addAll(List.of("Rajesh","Shyam","Ashwin","Raju","Rajesh","Ashwin","Senorita"));
//        Stream<String> stringStream=str.stream();
        Map<String, Long> stringMap=str.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(stringMap);
    }
}
