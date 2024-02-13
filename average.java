package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class average {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
       arrayList.addAll(List.of(20,30,50,40,10));
//        int[] array={10,20,30,50,40};
//        double average=Arrays.stream(array)
//                .average()
//                .orElse(0);
//        System.out.println(average);

        double average=arrayList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0);
        System.out.println(average);




    }

}
