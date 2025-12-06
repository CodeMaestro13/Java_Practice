package list_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

// cursors topic --> 2 types of cursors are applicable 1) iterator 2) list_iterator
public class ArrayList16 {
    public static void main(String[] args) {
        //Normal Collection
        ArrayList al1= new ArrayList();
        al1.add(100);al1.add(200);al1.add(300);
        // normal cursor
        Iterator i1 = al1.iterator();
        while(i1.hasNext()){
            Integer ii=(Integer)i1.next();
            System.out.println(ii);
        }
        // generic cursor
        Iterator<Integer> i2=al1.iterator();
        //step1-condition check
        while(i2.hasNext()){
            Integer i=i2.next();
            System.out.println(i);

        }
    }

}

// points:- cursors can be categories into 2 types [ normal cursor and generic cursor ]

