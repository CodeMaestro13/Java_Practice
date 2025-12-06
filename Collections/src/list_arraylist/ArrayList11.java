package list_arraylist;

import java.util.ArrayList;

public class ArrayList11 {
    public static void main(String[] args) {
        ArrayList al1= new ArrayList();
        al1.add(10);
        al1.add(20);

        System.out.println(al1);
        // 2nd array list
        ArrayList al2= new ArrayList();

        // addAll method ->>used to add all the contain from one collection to another
        al2.addAll(al1);
        al2.add('A');
        al2.add('B');

        System.out.println(al2);
        al2.containsAll(al1);
    }

    // que:- how do we add the one collection to another //--> using addAll() method

}
