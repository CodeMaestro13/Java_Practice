package list_arraylist;

import java.util.ArrayList;

//points:--

public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        al.add(1);
        al.add(5);
        al.add('x');
        System.out.println(al);
        al.add(1,"kabir"); // when we want to store the object in between the index for it
        al.add(2,'k');
        System.out.println(al);
        System.out.println(al.size());
        al.remove(3);
        System.out.println(al);


        // if want to remove the object then we have to conver it to the wrapper object

        Character ch='k';
        al.remove(ch);
        System.out.println(al);
    }

    // points:-
    // add(Object) -> add method accept the argument of type object but if we enter prmitive it will perform boxing and conver it into primitive

    //add(index,Object)-> add method will always add the object at the end but it we want to add the object at the specific index then
    // we go for the  2 aru add method

    //size()--> will return the size of the no of element within the array list

    // remove() -> the remove method can remove with respect to index or wrt object
    // any premitive value enter in remove is consider as index and to represent as an object the we have to create the Wrapper class of it and then do our operation

}
