package set_TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {
    public static void main(String[] args) {
        TreeSet ts1= new TreeSet();
        ts1.add(20);
        ts1.add(10);
        ts1.add(30);
        ts1.add(40);
        ts1.add(5);
        System.out.println(ts1);

        // generating the sorted set
        SortedSet hs=ts1.headSet(20);
        System.out.println(hs);

        SortedSet ts=ts1.tailSet(20);
        System.out.println(ts);
    }
}
// points:--
// it is possible to store the object of child class in to the parent class interface
// it is not possbile to have a object of interface is it does not allowed to create its object.

