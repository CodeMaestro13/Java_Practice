package set_Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet<Stud> hs1= new HashSet<Stud>();
        hs1.add(new Stud(101,"Kabir"));
        hs1.add(new Stud(202,"Trisha"));
        hs1.add(new Stud(303,"smriti"));

        // extracting data
        Iterator<Stud> i=hs1.iterator();

        while(i.hasNext()){
            Stud s= i.next();
            System.out.println(s.studId+ "--"+s.studName);
        }
    }
}

// extractiong the data with iterator concept

//constructors:--
// public java.util.HashSet(); default capacity is -> 16
//  public java.util.HashSet(int); User Define Capacity-->
//  public java.util.HashSet(Collection);
//  public java.util.HashSet(int, float);

