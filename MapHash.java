package collection;

import java.util.*;
import java.util.ArrayList;

public class MapHash {
    public static void main(String[] args) {
        Map<Integer,String> hashMap1=new HashMap<Integer,String>();
        hashMap1.put(1,"Ayush");
        hashMap1.put(2,"Ashish");
        hashMap1.put(3,"Shyam");
//        hashMap1.put(1,"Raghu");
//        hashMap1.put(null,"Avantika");
//        hashMap1.put(null,"Raman");
        hashMap1.put(5,"Mayank");
        hashMap1.put(6,"Sachin");
        hashMap1.put(4,"Gaurav");
        System.out.println(hashMap1);
//        hashMap1=Map.of(10,"Sarthak",11,"Anubhav",12,"Abhijeet");
        System.out.println(hashMap1);
        System.out.println(hashMap1.size());
        System.out.println("Copy one hashmap to another hashmap");
        Map<Integer,String> hashMap2=new HashMap<Integer,String>(hashMap1);
        System.out.println(hashMap2);
        System.out.println("Remove all the mapping elements in map");
        hashMap2.clear();
        System.out.println(hashMap2);
        System.out.println(hashMap2.isEmpty());
        System.out.println(hashMap1.containsValue("Ayush"));
        System.out.println(hashMap1.entrySet());
//        Map<Integer,Integer> hashMap3=new HashMap<Integer,Integer>((Map<? extends Integer, ? extends Integer>) arrayList);
//        System.out.println(hashMap3);
//        hashMap1.remove(4);
//        System.out.println(hashMap1);
//        hashMap1.replace(3,"Ramesh");
//        System.out.println(hashMap1);
        List<Integer> arrayList=new ArrayList<Integer>();
        arrayList.addAll(List.of(10,20,30,40,10,20,30,10,20,50,50,90,10,20,100));
        System.out.println(arrayList);
//        Set<Integer> hashSet=new HashSet<Integer>(arrayList);
//        System.out.println(hashSet);
//        Iterator<Integer> i= arrayList.iterator();
//        while(i.hasNext()){
//            i.next();
//        }
//        Iterator<Integer> i=hashMap1.keySet().iterator();
//        while(i.hasNext()){
//            System.out.print(i.next()+" ");
//            System.out.println(hashMap1.get(i.next()));
//        }
//        Map<Integer,Integer> hashMap3=new HashMap<Integer,Integer>();
//        for(int element : arrayList){
//            hashMap3.put(element,hashMap3.getOrDefault(element,0)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry : hashMap3.entrySet()){
//            if(entry.getValue()>1) {
//                System.out.println("Number is  : " + entry.getKey() + ", Count is : " + entry.getValue());
//            }
//        }
        System.out.println(hashMap1.values());
        System.out.println(hashMap1.size());
        System.out.println(hashMap1.containsKey(1));
        System.out.println(hashMap1.containsValue("Ayush"));
        Map<Object,Object> treeMap=new TreeMap<>();
        treeMap.put(1,"Hello");
        treeMap.put(2,"Hii");
        treeMap.put(3,11);
        System.out.println(treeMap);




    }
}
