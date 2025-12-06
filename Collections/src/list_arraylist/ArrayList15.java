package list_arraylist;

import java.util.ArrayList;

public class ArrayList15 {
    public static void main(String[] args) {
        // generic coll
        ArrayList<Emp> al = new ArrayList<>();
        al.add(new Emp(101,"siccess"));

        // 1 approach
        for(Emp e: al){
            System.out.println(e.empId+"--" +e.empName);
        }
        // 2 approach get method --> here we dont need any type casting because we know the the object is in emp type
        Emp ee= al.get(0);
        System.out.println(ee.empId+ "--"+ee.empName);
    }
}

// points:--
