package set_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

// addint
public class LinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs1=new LinkedHashSet<String>();
        lhs1.add("Krishna");
        lhs1.add("Shekhar");
        lhs1.add("Narade");
        lhs1.add("Software");
        lhs1.add("Enginerr");

        // extracting the data from the collections
        // iterator
        Iterator<String> i = lhs1.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
