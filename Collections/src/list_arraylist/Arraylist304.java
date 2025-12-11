package list_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist304 {
    public static void main(String[] args) {
        ArrayList<Flipkart> al= new ArrayList<Flipkart>();
        al.add(new Flipkart(1001,"Laptop"));
        al.add(new Flipkart(2002,"MObile"));
        al.add(new Flipkart(102,"playstation"));
        al.add(new Flipkart(3003,"Earbuds"));

        //Collections.sort(al,comparator);
        // sorting by id
      // Collections.sort(al,new ProdIdComp());

        //sorting by name
        Collections.sort(al,new ProdNameComp());
        // in ProdNameComp class we have implemented the comparator

        // printing the objects
        // extractions of data
        for(Flipkart f :al){
            System.out.println(f.prodId+ " -- "+ f.prodName);
        }


    }
}
