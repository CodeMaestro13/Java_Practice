package list_Linkedlist;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList ll1= new LinkedList();
        ll1.add(100); ll1.add(200);
        ll1.add(300);
        System.out.println(ll1);
        ll1.add("Krishna");
        ll1.add(null);
        ll1.add(true);
        System.out.println(ll1);
    }
}
