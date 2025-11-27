package list_arraylist;

import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<Emp> al= new ArrayList<Emp>();
        al.add(new Emp(1001,"A"));
        al.add(new Emp(1002,"B"));
        al.add(new Emp(1003,"C"));
        al.add(new Emp(1004,"D"));
        al.add(new Emp(1005,"E"));

        // for getting responce
        for(Emp e :al){
            System.out.println(e.empId+"--"+e.empName);
        }

    }
}
