package maps_HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap hs1= new HashMap();
        hs1.put(1,'A');
        hs1.put(2,'B');
        hs1.put(3,'C');
        System.out.println(hs1);

        //if i want to return the keys then use keyset() method
        Set s=hs1.keySet();
        System.out.println(s);

        // que?? why it is requiring the set data==> because in set only it is we can store unique values and keys are unique doesnot allow duplicate keys to store.

        // for displaying  the values from the maps--> we can use values() method
        System.out.println(hs1.values());
    }
}

// I>Q: How do we display keys and values from a map.
//-> with the help of keyset() method and values () method
