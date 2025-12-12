package maps_HashMap;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap hm1= new HashMap();
        // adding the data in maps new method --> put method
        hm1.put(101,'X');
        hm1.put(303,'Z');
        hm1.put(202,'Y');
        System.out.println(hm1);
        hm1.put("Krishna","Narde");
        hm1.put(null,"kri");
        System.out.println(hm1);
        hm1.put(111,null);
        hm1.put(121,null);
        System.out.println(hm1);
        hm1.put(null,121); // here we are only able to intert null in key only one time.
        System.out.println(hm1);

    }
}
