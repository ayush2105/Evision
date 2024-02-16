package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetHash {
    public static void main(String[] args) {
        Set<String> hashSet1=new HashSet<String>();
        hashSet1.add("Ayush");
        hashSet1.add("Gaurav");
        hashSet1.add("Nikhil");
        hashSet1.add("Mayank");
        System.out.println(hashSet1);
//        System.out.println("Remove all element in set");
//        hashSet.removeAll(hashSet);
//        System.out.println(hashSet);
        System.out.println(hashSet1.size());
        Set<String> hashSet2=new HashSet<String>();
        hashSet2.add("Hey");
        hashSet2.add("Hiii");
        hashSet2.add("Hello");
        hashSet2.add("Ayush");
        hashSet2.add("Nikhil");
        System.out.println(hashSet2.add(null));
//        System.out.println(hashSet2.add(null));
        hashSet2.add("Null");
        System.out.println(hashSet2);
//        for(String s:hashSet2){
//            System.out.println(hashSet1.contains(s));
//        }
        List<String> arrayList=new ArrayList<String>(hashSet1);
        System.out.println(arrayList);







    }
}
