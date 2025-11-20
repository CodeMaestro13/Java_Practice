package list_arraylist;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        // arraylist creation
        Emp ep1= new Emp(101,"krishna");
        Emp ep2= new Emp(103,"neha");
        Emp ep3= new Emp(105,"kabir");

        ArrayList al = new ArrayList();
        al.add(ep1);
        al.add(ep2);
        al.add(ep3);

        //printing the data
        System.out.println("this list is"+ al);

        // printing the each data from the arraylist
        for(Object o :al){
            Emp e=(Emp) o;
            System.out.println(e.empId+ " "+ e.empName);
        }
    }
}
