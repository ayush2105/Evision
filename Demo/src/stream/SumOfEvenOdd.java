package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.addAll(List.of(5,102,35,21,20,10));
//        Stream<Integer> integerStream=list.stream();
        int integerList=list.stream()
                .filter(e->e%2==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("All even numbers in list : "+integerList);
//        Stream<Integer> integerStream1=list.stream();
        int integerList1=list.stream()
                .filter(e->e%2!=0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("All odd number in list : "+integerList1);
    }
}
