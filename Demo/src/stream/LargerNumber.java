package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LargerNumber {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<Integer>();
        arrayList.addAll(List.of(10,12,12,40,50,99));
//        Stream<Integer> stream=arrayList.stream();
        int a=arrayList.stream()
//                .map(Integer::intValue)
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println(a);

    }
}
