package list_Stacks;

import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Stack s1= new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1);
        Stack s2= new Stack();
        s2.push(100);s2.push(200);s2.push(300);
        System.out.println(s2);
        System.out.println(s2.pop());
        System.out.println(s2);
    }
}

// methods
// public synchronized E pop() --> extact the data also delete the object
// public synchronized E peek()--> it extact the data and return the top object.

//