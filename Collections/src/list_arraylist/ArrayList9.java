package list_arraylist;

import java.util.ArrayList;

public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        al.add(1);
        al.add(5);
        al.add('x');
        System.out.println(al);
        al.add(1,"kabir");
        al.add(2,'k');
        System.out.println(al);
        System.out.println(al.size());
        al.remove(3);
        System.out.println(al);

        Character ch='k';
        al.remove(ch);
        System.out.println(al);
    }
}
