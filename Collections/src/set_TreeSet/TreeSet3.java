package set_TreeSet;

import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {

        // now here are are using this constructor which is taking comparator as input
//        public java.util.TreeSet(java.util.Comparator<? super E>);

        // Treeset generic of Stud type
        TreeSet<Stud> ts1= new TreeSet<Stud>(new CompStudId());
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

// when we use the comparator internally we need to create 2 seperate classes
//1 for id and 2 for name
// whenever we perform compersion using comparator we always override the method called as compare method


