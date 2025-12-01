package list_arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayList14 {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        al.add(new Emp(101,"krishna"));
        al.add(new Emp(202,"kabir"));

        // 1 approach
        for(Object o :al){
            Emp e=(Emp)o;
            System.out.println(e.empId+ " - "+e.empName);
        }
        // 2 approach
        Object o =al.get(0);
        Object o1=al.get(1);
        Emp e=(Emp) o;
        Emp e1=(Emp) o1;
        System.out.println(e.empId+ " - "+ e.empName);
        System.out.println(e1.empId+ "- "+ e1.empName);

    }

}
