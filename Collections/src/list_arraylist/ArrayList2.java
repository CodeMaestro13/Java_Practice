package list_arraylist;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add("Cyber");
        al.add("Success");
        al.add("Training program");

        System.out.println(al);
        // printing objects
        for(Object o :al){
            // this is downcasting
            String s=(String) o;
            System.out.println(s);
        }
    }
}
