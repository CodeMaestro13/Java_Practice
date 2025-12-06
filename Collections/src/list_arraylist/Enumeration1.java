package list_arraylist;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {
    public static void main(String[] args) {
        Vector v= new Vector();
        //adding elements into enumeration
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println(v);
        Enumeration e= v.elements();
        while(e.hasMoreElements()){
            Integer i= (Integer)e.nextElement();
            System.out.println(i );
        }
    }
}
//points:- we are extraction the elements based on the enumeration cursor

