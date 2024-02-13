package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ListLinked {
    public static <LinkedListList> void main(String[] args) {
        LinkedList<Integer> linkedList1= new LinkedList<Integer>();
        linkedList1.add(10);
        linkedList1.add(50);
        linkedList1.add(50);
        linkedList1.add(40);
        System.out.println(linkedList1);
        System.out.println("Insert specified element at specified position");
        linkedList1.set(2,40);
        System.out.println(linkedList1);
        System.out.println("Insert some element at specified position");
        linkedList1.add(2,100);
        linkedList1.add(5,80);
        System.out.println(linkedList1);
        System.out.println("Insert element at 1st and last posotion in linked list");
        linkedList1.addFirst(57);
        linkedList1.addLast(79);
        System.out.println(linkedList1);
        System.out.println("Insert specified element at front of the Linked list");
        linkedList1.offerFirst(999);
        System.out.println(linkedList1);
 //       System.out.println("Iterator in linked list");
        //      for(int x: linkedList1){
        //         System.out.println(x);
        //     }
        System.out.println("1st and last occurence of specified elemnets");
        System.out.println(linkedList1.getFirst());
        System.out.println(linkedList1.getLast());
        System.out.println(linkedList1.offer(5));
        linkedList1.offerLast(45);
        System.out.println(linkedList1);
        System.out.println("Iterate reverse");
        Iterator<Integer> i=linkedList1.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("Elements is exists or not ");
        System.out.println(linkedList1.contains(45));


    }
}
