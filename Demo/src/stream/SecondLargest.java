package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.addAll(List.of(10,20,30,11,50));
//        Stream<Integer> s=l.stream();
        Optional<Integer> l1=l.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(l1);
    }
}
