package list_Linkedlist;

import java.util.LinkedList;

// adding the one linkedlist into another by addAll() method
public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        System.out.println(ll1);
        // adding one linkedlist to another by constructor based approach
        LinkedList ll2=new LinkedList(ll1);
        ll2.add('x');
        ll2.add('y');

        System.out.println(ll2);
        LinkedList ll3= new LinkedList();

        // by addAll() method
        ll3.addAll(ll2);
        ll3.add("Krishna");
        ll3.add("Narade");
        System.out.println(ll3);
    }
}

// I.Q when to use the arraylist and linkedlist??
// -> arraylist:-- when to do extensive read operation
// -> linkeslist:-- when to  intert the data in the middle of intertion
