package list_arraylist;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);
        // printing objects for it
        for(Object o :al){
            System.out.println(o);
        }
    }
}
