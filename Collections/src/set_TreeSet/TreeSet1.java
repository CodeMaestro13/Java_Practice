package set_TreeSet;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet ts1= new TreeSet();
        ts1.add(10);
        ts1.add(8);
        ts1.add(30);
        ts1.add(20);
        ts1.add(35);
        ts1.add(15);
        System.out.println(ts1);
//        ts1.add("krishna"); --> gives error because internally sorting happens for same data type.
        System.out.println(ts1);
    }
    // by default it is sorted why:- because it is coming from  the sorted set in which all the data is sorted and sort mechanisme is working on the compareTo method.
    // in compareTo method we are have the same type of data ---so theare for it accepts the homogeneous data
}

// treeset characters :--





