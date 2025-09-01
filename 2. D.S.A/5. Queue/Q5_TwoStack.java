// Queue implementation using two stack...

import java.util.Stack;

class Queue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    // isEmpty
    public static boolean isEmpty() {
        return s1.isEmpty();
    }
    // Add function...O(n)
    public static void add(int data) {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    // Remove function...O(1)
    public static int remove() {
        if(isEmpty()) {
            System.out.println("The stack is empty.");
            return -1;
        } 
        int element=s1.pop();
        return element;
    }
            // Remove function...O(1)
    public static int peek() {
        if(isEmpty()) {
            System.out.println("The stack is empty.");
            return -1;
        } 
        int element=s1.peek();
        return element;
    }
}
public class Q5_TwoStack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()) {
            System.out.println("Peek element is: "+q.peek());
            System.out.println("Removed element is: "+q.remove());
        }
    }
}
