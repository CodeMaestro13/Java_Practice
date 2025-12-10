package list_Stacks;

import java.util.Stack;

public class Stack4 {
    public static void main(String[] args) {
        Stack s1= new Stack();
        s1.push(100);
        s1.push(200);
        s1.push(300);
        s1.push(400);
        System.out.println(s1);
        System.out.println(s1.search(200));
        System.out.println(s1.search(400));
    }
}
// search method()
// it will consider the top of the stack as the zeroth reference and return the integer on which the element is present


