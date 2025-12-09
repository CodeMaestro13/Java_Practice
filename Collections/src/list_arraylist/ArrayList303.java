package list_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList303 {
    public static void main(String[] args) {
        ArrayList<Swiggy> al= new ArrayList<>();
        al.add(new Swiggy(222,"Burger"));
        al.add(new Swiggy(111,"Pizza"));
        al.add(new Swiggy(333,"Coffee"));

        Collections.sort(al);
//      System.out.println(Thread.currentThread().getName()); --> tell us to know that which is current thread is executing
        // comparable and comparator

        // printing the elements
        for(Swiggy s:al){
            System.out.println(s.itemId+ " -- "+ s.itemName);
        }

    }
}
