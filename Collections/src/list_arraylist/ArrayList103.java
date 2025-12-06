package list_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList103 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(100);
        al.add(40);
        al.add(20);
        al.add(30);
//        al.add('A');
        System.out.println(al);
        // sorting the collection
        // we are using sort method from Collections-> class i.e Collections.sort
        Collections.sort(al);
        System.out.println(al);

    }
}
// I.Q how can we sort a data from collections??
//-->
// to perform sort operation on collection we have to used sort method

// the sort method in called / invoke with the help of Collections class ( it comes from java.util package)

// Whenever the sort method is called it will internally called the compareTO method of respective class who's Object is Created

//

// I.Q:- Where exactly the compareTo method in integer class is coming from.
//-> so the compareTO-> method is came from the interface comparable
