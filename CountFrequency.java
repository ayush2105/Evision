package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountFrequency {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.addAll(List.of(100,10,20,30,40,40,10,50,20,99));
        Map<Integer, Long> frequency=arr.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(frequency);

    }
}
