package list_Linkedlist;

import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList ll1= new LinkedList();

        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(400);

        System.out.println(ll1);
        ll1.addFirst('A');
        ll1.addLast('Z');
        System.out.println(ll1);
    }
}
