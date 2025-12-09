package list_Vectors;

import java.util.Vector;

public class Vector4 {
    public static void main(String[] args) {
        // 3 constructor
        // java.util.Vector(int,int) [user defined capacity, incremental capacity value]
        Vector v1= new Vector(5,3);
        v1.add(2);v1.add(3);v1.add(6);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        v1.add(2);v1.add(3);v1.add(6);
        System.out.println(v1.size());
        System.out.println(v1.capacity());

    }
}
//point:--
// in this we are using 2nd constructor
