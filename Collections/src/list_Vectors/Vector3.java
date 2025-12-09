package list_Vectors;

import java.util.Vector;

public class Vector3 {
    public static void main(String[] args) {
        Vector v1= new Vector();
        v1.add(100);v1.add(200);v1.add(300);v1.add(400);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        v1.add(100);v1.add(200);v1.add(300);v1.add(400);
        v1.add(100);v1.add(200);v1.add(300);v1.add(400);
        System.out.println(v1.size());
        System.out.println(v1.capacity());


    }
}

// points:-
// default capacity in vector is 10 but when we cross the capacity then the new capacity gets double of default capacity
// if default is 10 then 20 , or if default is 20 then 40 etc .



// 4 constructor


//  public java.util.Vector(); default capacity->10
//  public java.util.Vector(int, int);
//  public java.util.Vector(int);
//  public java.util.Vector(java.util.Collection<? extends E>);

