package set_TreeSet;

import java.util.TreeSet;

public class TreeSet4 {
    public static void main(String[] args) {

        // using below constructor
//        public java.util.TreeSet(java.util.Comparator<? super E>);

        // Treeset generic of Stud type
        TreeSet<Stud> ts1= new TreeSet<Stud>(new CompStudName());
        ts1.add(new Stud(102,"karina"));
        ts1.add(new Stud(303,"Aparna"));
        ts1.add(new Stud(202,"Pooja"));

        // extracting the data from this treeset ts1
        for (Stud s:ts1){
            System.out.println(s.studId+ "--"+s.studName);

        }
    }
}

// points :--

// total constructor of TreeSet:-

//  public java.util.TreeSet();
//  public java.util.TreeSet(java.util.Comparator<? super E>); --> comparator wala constructor
//  public java.util.TreeSet(java.util.Collection<? extends E>); --> one collection into another wala constructor

//  public java.util.TreeSet(java.util.SortedSet<E>);



