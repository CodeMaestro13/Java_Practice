package list_arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
            al.add('a');
            al.add('b');
            al.add('c');
        ListIterator li= al.listIterator();
        while(li.hasNext()){
            Character c=(Character)li.next();
            System.out.println(c);
        }

    }
}
// points:- Listiterator is a bidirectional
