package set_LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet lhs1=new LinkedHashSet();
        // interting the hetrogeneous data
        lhs1.add("Krishna");lhs1.add(10);lhs1.add(20.5f);lhs1.add('a');
        System.out.println(lhs1);
        // inserting the null value
        lhs1.add(null);
        System.out.println(lhs1);
        // inserting the Duplicate data--> it is not allowed
        lhs1.add(10);lhs1.add('a');
        System.out.println(lhs1);
    }
}
