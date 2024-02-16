package collection;

import java.util.*;
import java.util.ArrayList;

public class ArrayToSet {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
       arrayList.addAll(List.of(20,30,50));
       System.out.println(arrayList);
//        Iterator<Integer> i=arrayList.iterator();
//        while(i.hasNext()){
//            i.next();
//            System.out.println(i);
//        }

        Set<Integer> hashSet=new HashSet<Integer>(arrayList);
        System.out.println(hashSet);
        Iterator<Integer> i=hashSet.iterator();
        while(i.hasNext()){
            Integer a=(Integer) i.next();
            System.out.println(a);
        }
    }
}
