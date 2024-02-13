package stream;

import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.addAll(List.of(100,10,20,30,40,40,10,50,20,99));
//        Stream<Integer> integerStream=arr.stream();
        Set<Integer> set=new HashSet<Integer>();
        arr.stream()
                .filter(integer -> !set.add(integer))
                .forEach(System.out::println);
    }
}
