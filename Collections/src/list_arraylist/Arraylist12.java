package list_arraylist;

import java.util.ArrayList;

public class Arraylist12 {
    public static void main(String[] args) {

        // containsAll -->
        // removeAll--> remove all the elements from the list

        ArrayList al1= new ArrayList();
        al1.add(10);
        al1.add(20);
        System.out.println(al1);
        // new arraylist
        ArrayList al2= new ArrayList();
        al2.add('A');
        al2.add('B');
        al2.addAll(al1);
        System.out.println(al2);
        System.out.println(al2.containsAll(al1));
        al2.removeAll(al1);
        System.out.println(al2.containsAll(al1));

    }

    //containsAll()--> will check the complete coll or respective coll is present or not and based on which rethrn boolean value
    //removeAll()--> it will be responsible to remove completeAll specific collection
}
