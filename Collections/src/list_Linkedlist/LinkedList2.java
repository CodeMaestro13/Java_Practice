package list_Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

// generic linkedlist creation
// in this example we are creating generic linkedlist
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<String>();
        ll1.add("Cyber");
        ll1.add("Success");
        ll1.add("Training");
        System.out.println(ll1);

        // extraction of the linkedlist
        // by using the iterator
        System.out.println("Extraction of data:---");
        Iterator<String> i=ll1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

}

//poits:-
//I.Q how many ways of adding one Liinkedlist to another the data in linkedlist ==> 2 ways
// 1) by addAll() method  2) by constructor based approach

