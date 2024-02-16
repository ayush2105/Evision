package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CubeOfElement {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.addAll(List.of(1,2,3,4,5));
        List<Integer> list1=list.stream()
                .map(e->e*e*e)
                .filter(i->i>50)
                .collect(Collectors.toList());
        System.out.println(list1);



    }
}
