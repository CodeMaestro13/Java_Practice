package list_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList19 {

    public static void main(String[] args) {
        //Generic Collection
        ArrayList<String> al1= new ArrayList<String>();
        al1.add("Krishna");al1.add("Shekhar");al1.add("Narade");al1.add("Bhavsar");

        // normal iterator
        Iterator i1= al1.iterator();
        while(i1.hasNext()){
            String ss=(String) i1.next();
            // we are removing the word narade
            if(ss.equals("Narade")){
                i1.remove();
                // this remove method is of iterator
            }
        }
        // printing
        for(String sss:al1){
            System.out.println(sss);
        }
    }
}
// points:--

