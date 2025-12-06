package list_arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList21 {
    public static void main(String[] args) {
        System.out.println("Start");
        ArrayList<Emp> al = new ArrayList<Emp>();
        al.add(new Emp(1001,"Krishna")); // this gets add my collection add method
        al.add(new Emp(2002,"Kabir"));
        al.add(new Emp(3003,"Singh"));
        ListIterator<Emp> li= al.listIterator();
        li.add(new Emp(403,"nitin")); // this gets add by cursor add method

        // we are going to remove the kabir name
        while(li.hasNext()){
            Emp e= li.next();
            // remove method
            if(e.empName.equals("Kabir")){
                li.remove();
            }

            // set method
            if(e.empName.equals("Singh")){
                li.set(new Emp(505,"New KRish"));
            }
        }
        // extracting
        for(Emp e:al){
            System.out.println(e.empId+ " -- "+e.empName);
        }
    }
}
