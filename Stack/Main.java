// STACK : LIFO data structure.  Last in First Out
//         stores object into a sort of "Vertical Tower"
//         push() to add to the top.
//         pop() to remove from the top.


// Uses of Stack ?
// 1. undo/redo features in text editors
// 2. moving back/forward through browser history
// 3. baktracking algorithms (maze, file directories)
// 4. calling functions (call stack)


import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Stack<String> stack = new Stack<String>();   // Syntax to declare stack

        // System.out.println(stack.empty());  // stack.empty checks if stack is empty or not. Gives boolean value.
        // if stack is empty => true; if stack is not empty => false

        stack.push("Lionel Messi");          // stack.push() is used to add elements in stack.
        stack.push("Cristiano Ronaldo");
        stack.push("Neymar Jr");
        stack.push("Luis Suarez");

        // System.out.println(stack.empty());  // this time stack has elements hence true is returned

        //  System.out.println(stack);    // O/P : [Lionel Messi, Cristiano Ronaldo, Neymar jr, Luis Suarez]

        // stack.pop();       // stack.pop() is used to remove top most element of stack.  
        // O/P : [Lionel Messi, Cristiano Ronaldo, Neymar Jr]
        
        // stack.pop();       // O/P : [Lionel Messi, Cristiano Ronaldo]
        // stack.pop();       // O/P : [Lionel Messi]
        // stack.pop();       // O/P : []
        // stack.pop();       // O/P : Error : EmptyStackException

        // String Footballer = stack.pop();

        // System.out.println(Footballer);    // O/P : Luis Suarez

        // System.out.println(stack.peek());    // stack.peek() is used to check top most element of stack.  O/P : Neymar Jr

        // System.out.println(stack.search("Luis Suarez"));    // stack.search() is used to find position of the object.
        // Here Luis Suarez is at 1.  
        // Top most element has postion 1.

        // System.out.println(stack.search("Paulo Maldini"));  // here we get -1 as Paulo Maldini is not present in stack.
        // -1 position is given when the element does not belong to the stack.
        
        
        System.out.println(stack);


        // for(int i = 0; i < 1000000000; i++) {           

        //    stack.push("Lionel Messi");
        // }

        // Here we get an exception of OutofMemoryError as stack memory is limitted.
    }
}