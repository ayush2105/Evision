package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartWith1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.addAll(List.of(10,20,1320,45,11,32,3,1,99));
//        Stream<Integer> stream=list.stream();
        List<String> newList=list.stream()
                .map(s->s+"")
                .filter(value->value.startsWith("3"))
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
