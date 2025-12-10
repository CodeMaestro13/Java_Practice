package set_Hashset;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet hs1= new HashSet();
        hs1.add(5);
        hs1.add(20);
        hs1.add(15);
        hs1.add(30);
        hs1.add(25);
        System.out.println(hs1);

        // allowed the heterogeneous data
        hs1.add("Krisha");
        hs1.add('X');
        System.out.println(hs1);
        // allow null
        hs1.add(null);
        System.out.println(hs1);
        // dont allow duplicates
        hs1.add(25);
        hs1.add(30);
        System.out.println(hs1);
    }
}

// it is not maintain the insertion order