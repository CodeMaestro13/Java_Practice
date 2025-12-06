package list_arraylist;

import java.util.ArrayList;

// convert a collection to an array
public class Arraylist101 {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        al.add("Kabir");al.add("Success");al.add("Bhetnar");al.add("for sure");
        System.out.println(al);

        // converting collection to any array
        String[] a = al.toArray(new String[al.size()]);
        System.out.println(a.length);
        // printing it
        for(String ss:a){
            System.out.println(ss);
        }

    }
}
// pints:- here we are using method toArray this methid takes t[]a i.e type[] array

