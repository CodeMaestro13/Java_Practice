package list_Stacks;

import java.util.Stack;

public class Stack3 {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(100);
        System.out.println(s1);
        System.out.println(s1.empty());
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.empty());
        System.out.println(s1.isEmpty());
    }
}

// method
//empty() --> return false if it is empty else return true.