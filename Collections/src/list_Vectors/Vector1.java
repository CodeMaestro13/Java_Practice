package list_Vectors;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        // vector creation
        Vector v1=new Vector();
        v1.add(100);
        v1.add(200);
        v1.add('x');
        v1.add(null);
        v1.add(200);
        v1.add('X');
        v1.add("xtream");
        System.out.println(v1);
    }
}
