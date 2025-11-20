package list_arraylist;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {

        // shortcut of asign
        ArrayList al = new ArrayList();
        al.add(new Emp(1001,"Saloni"));
        al.add(new Emp(2002,"suhas"));
        al.add(new Emp(3003,"Eshita"));

        // printing this object
        for(Object o :al){
            Emp e =(Emp)o;
            System.out.println(e.empId+ " - "+ e.empName);
        }
    }
}
