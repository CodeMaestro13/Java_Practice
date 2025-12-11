package set_TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet5 {
    public static void main(String[] args) {
        TreeSet ts1= new TreeSet();
        ts1.add('A');ts1.add('B');
        ts1.add('C');ts1.add('D');
        ts1.add('E');ts1.add('F');

        SortedSet ss1=ts1.headSet('C');
        SortedSet ss2=ts1.tailSet('C');

        System.out.println(ss1);
        System.out.println(ss2);

        // constructor
//        public java.util.TreeSet(SortedSet<E>);

        TreeSet t11= new TreeSet(ss1);
        TreeSet t22= new TreeSet(ss2);

        System.out.println(t11);
        System.out.println(t22);
    }
}
