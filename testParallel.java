package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testParallel {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.addAll(List.of(10,20,30,40,50,60,70,80,90,100,11,12,13,14,15,16,17,18,19,20));
//        Stream<Integer> s=integerList.parallelStream();
        List<Integer> integerList1=integerList.parallelStream()
                .map(e->e*5)
                .collect(Collectors.toList());
        System.out.println(integerList1);
    }
}
