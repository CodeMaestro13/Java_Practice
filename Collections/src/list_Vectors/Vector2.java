package list_Vectors;

import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {
        Vector v1=new Vector();
        v1.add(10);
        v1.add(20);
        System.out.println(v1);
        // 2nd vector creation by constructor adding approach
        Vector v2= new Vector(v1);
        v2.add('X');
        v2.add('Y');
        System.out.println(v2);

        // 3rd vector creation by addAll() method
        Vector v3= new Vector();
        v3.addAll(v2); // this is adding one collection into another
        v3.add("Krishna");
        v3.add("Singh");
        v3.add("SDE");
        System.out.println(v3);

    }
}
// this is the example in which show that we can add one collection into another by 2 ways
// 1 way--> by constructor approach
// 2 way --> by addAll() method

