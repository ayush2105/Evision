package collection;

import java.util.Collections;
import java.util.List;

public class ArrayList123<E> {
    public static void main(String[] args) {
        List<String> arrayList=new java.util.ArrayList<String>();
        arrayList.add("Ayush");
        arrayList.add("A");
        arrayList.add("111");
        System.out.println(arrayList);
        for(String x:arrayList){
            System.out.println(x);
        }
        arrayList.add(0,"Gourav");
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        arrayList.set(2,"Rahul");
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Nikhil"));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        List<Integer> arrayList1=new java.util.ArrayList<>();
        arrayList1.add(100);
        arrayList1.add(300);
        arrayList1.add(200);
        arrayList1.add(500);
        arrayList1.add(800);
        arrayList1.add(250);
        List<Integer> sub_list;
        sub_list=arrayList1.subList(0,3);
        System.out.println(sub_list);
        Collections.sort(sub_list);
        System.out.println(sub_list);
        sub_list=arrayList1.subList(3,6);
        System.out.println(sub_list);
        Collections.sort(sub_list,Collections.reverseOrder());
        System.out.println(sub_list);









//        System.out.println(arrayList1);
//        Collections.copy(arrayList,arrayList1);
//        System.out.println("After copy :");
//        System.out.println(arrayList);
//        System.out.println("---------------------");
//        List<Character> arrayList2=new java.util.ArrayList<Character>();
//        arrayList2.add('A');
//        arrayList2.add('B');
//        arrayList2.add('X');
//        arrayList2.add('1');
//        arrayList2.add('5');
//        System.out.println(arrayList2);
//        Collections.shuffle(arrayList2);
//        System.out.println(arrayList2);
//        Collections.reverse(arrayList2);
//        System.out.println(arrayList2);
//        System.out.println(arrayList1.equals(arrayList1));



    }
}
