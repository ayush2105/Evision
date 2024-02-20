import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.addAll(List.of(100,10,20,30,40,40,10,50,20,99));
        Stream<Integer> integerStream=arr.stream();
        List<Integer> l= integerStream
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(l);
    }
}
