package list_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList al= new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);
        Iterator i= al.iterator();
        while(i.hasNext()){
            Integer ii= (Integer)i.next();
            System.out.println(ii);
        }
    }
}
