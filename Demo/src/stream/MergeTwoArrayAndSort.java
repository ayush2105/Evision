package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrayAndSort {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        list1.addAll(List.of(1,22,13,41,11));
        list2.addAll(List.of(32,12,1,44,65));
//        Stream<Integer> s1=list1.stream();
//        Stream<Integer> s2=list2.stream();
        List<Integer>newList=Stream
                .concat(list1.stream(),list2.stream())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
