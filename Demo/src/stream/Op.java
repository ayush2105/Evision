package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Op {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.addAll(List.of(10,20,30,40,50));
        Stream<Integer> stream=list.stream();
        List<Integer> newList=stream
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(newList);
        List<Integer> list1=new ArrayList<Integer>();
        list1.addAll(List.of(102,33,11,32,45,67));
        list1.forEach(System.out::println);

    }
}
