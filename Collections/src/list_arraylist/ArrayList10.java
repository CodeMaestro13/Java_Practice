package list_arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayList10 {
    public static void main(String[] args) {
        // methods isEmpty() / contains / clear

        ArrayList al= new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);

        // contains
        System.out.println(al.contains(20)); // return true if that is contains in it.
        System.out.println(al.contains(100.5f));
        System.out.println(al.isEmpty()); // it will return boolean value (true)  if the array list is empty else return false

        al.clear(); // clear our entire arraylist --> clear k li list

        System.out.println(al.isEmpty());

    }
}
