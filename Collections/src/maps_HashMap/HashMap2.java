package maps_HashMap;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap hm1= new HashMap();
        hm1.put(1,'a');
        hm1.put(2,'b');
        System.out.println(hm1);
        hm1.put(null,null);
        System.out.println(hm1);
    }
}
// points :-- it is possible to enter null key and null value just in key we can enter only one null value
