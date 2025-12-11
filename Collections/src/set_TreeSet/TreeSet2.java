package set_TreeSet;

import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet ts1=new TreeSet();
        ts1.add("Krishna");
        ts1.add("Cyber");
        ts1.add("Kabir");
        ts1.add("abc");
        ts1.add("def");
        System.out.println(ts1);

    }
}

// points:--
// I.Q :- why TreeSet store ONLY homogeneous data??

//-> Whenever we store the Wrapper Class Object or String Class Object inside TreeSet it will internally perform sort Operation.

//-> This sort operations perform internally with the help of CompareTO methods

//--> heace all wrapper classes and string classes implements the CompareTo method
