package list_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList17 {
    public static void main(String[] args) {
        //Generic  Collection
        ArrayList<Character> al1= new ArrayList<Character>();
        al1.add('X');al1.add('y');al1.add('Z');
        // normal cursor
        Iterator i1 = al1.iterator();
        while(i1.hasNext()){
            Character c1=(Character) i1.next();
            System.out.println(c1);
        }

        // Generic cursor
        Iterator<Character> i2=al1.iterator();
        while(i2.hasNext()){
            Character c1=i2.next();
            System.out.println(c1);
        }
    }
}
