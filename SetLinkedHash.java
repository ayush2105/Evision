package collection;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetLinkedHash {
    public static void main(String[] args) {
        Set linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(23);
        linkedHashSet.add(35);
        linkedHashSet.add(5);
        linkedHashSet.add(12);
        linkedHashSet.add("Ayush");
        linkedHashSet.add("Suresh");
        linkedHashSet.add(12);
        linkedHashSet.add("Aakash");
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains(23));
        System.out.println(linkedHashSet.toString());
        System.out.println(linkedHashSet.toArray());
        System.out.println(linkedHashSet.isEmpty());
        System.out.println(linkedHashSet.add(null));
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.add(null));
        System.out.println(linkedHashSet);
        linkedHashSet.addAll(List.of("Kiran",101,105,"Shyam"));
        System.out.println(linkedHashSet);


    }
}
