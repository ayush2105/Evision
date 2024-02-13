package collection;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTree {
    public static void main(String[] args) {
        SortedSet treeSet=new TreeSet();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(50);
//        treeSet.add("Hello");
        treeSet.addAll(List.of(50,20,30));
        System.out.println(treeSet);
       System.out.println(treeSet.headSet(30));
//        System.out.println(treeSet.add(null));
        System.out.println(treeSet);
    }
}
