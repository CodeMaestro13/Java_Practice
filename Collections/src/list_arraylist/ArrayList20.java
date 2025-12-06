package list_arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList20 {
    public static void main(String[] args) {
        System.out.println("Start");
        ArrayList al = new ArrayList();
        al.add('A');al.add('B');al.add('C');
        al.add('D');al.add('E');al.add('F');
        al.add('G');

        ListIterator<Character> li =al.listIterator();

        while(li.hasNext()){
            System.out.println(li.next());
        }

        // this has_previous gives us previous one but our iterations starts with the top so the previous is not knows
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println("End");

    }
}
// point:- whenever we create  cursor it will always points to the top of the collections
// hence if we tell the cursor to go prvious it will not know and nither will able to extract tje previous object
// sol--> go till the end of the collection and then move to the previous directions
