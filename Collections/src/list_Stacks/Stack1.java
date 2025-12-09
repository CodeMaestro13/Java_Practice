package list_Stacks;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack s1= new Stack();
        // in stack we use push method for adding data
        s1.push(10);
        s1.push('A');
        s1.push("Krishna");
        s1.push(null);
        s1.push('A');
        System.out.println(s1);
    }
}

//method within the stack
// public E push(E) -->
