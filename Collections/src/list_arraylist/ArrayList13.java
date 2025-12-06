package list_arraylist;

import java.util.ArrayList;

public class ArrayList13 {
    public static void main(String[] args) {

        ArrayList al1= new ArrayList();
        al1.add(10); al1.add(20);
        System.out.println(al1);
        ArrayList al2= new ArrayList();
        al2.addAll(al1);
        al2.add('A');al2.add('B');
        System.out.println(al2);
        al2.removeAll(al1);
        System.out.println(al2);
        al2.retainAll(al1); // it will give us empty because in al2 al1 is empty so it retaiins al1 and remove the rest collection
        System.out.println(al2);
        System.out.println(al2.isEmpty());

    }
}

//retailAll --> perform 2 operation as below
// 1-->retain a part of collection
// 2--> remove the raminng part of the collecton



