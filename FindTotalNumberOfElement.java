package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FindTotalNumberOfElement {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.addAll(List.of(100,10,20,30,40,40,10,50,20,99));
//        Stream<Integer> integerStream=arr.stream();
        long integerList=arr.stream()
                .count();
        System.out.println(integerList);

    }
}
