package list_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList302 {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();
        al.add("Pune");
        al.add("Mumbai");
        al.add("Kota");
        al.add("Hydrabad");
        al.add("Bangulare");
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

    }
}
// points:-- this is sorted on the bases of compareTo method

// String classes will also implement the camparable
// because of that if will able to perform the sort operation
//
