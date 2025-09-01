// stack implementation using two queue...

import java.util.Queue;
import java.util.LinkedList;

class Stack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    // isEmpty function....
    public boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }
    // Push function...O(1)
    public void push(int data) {
        if(!q1.isEmpty()) {
            q1.add(data);
        } else {
            q2.add(data);
        }
    }
    // Pop function...O(n)
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = -1;
        if(!q1.isEmpty()) {
            while(!q1.isEmpty()) {
                top=q1.remove();
                if(q1.isEmpty()) {
                    break;
                }
                q2.add(top);
            }
        } else {
            while(!q2.isEmpty()) {
                top=q2.remove();
                if(q2.isEmpty()) {
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }
        // Peek function...O(n)
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = -1;
        if(!q1.isEmpty()) {
            while(!q1.isEmpty()) {
                top=q1.remove();
                q2.add(top);
            }
        } else {
            while(!q2.isEmpty()) {
                top=q2.remove();
                q1.add(top);
            }
        }
        return top;
    }
}


public class Q6_StackImplementation {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()) {
            System.out.println("Peek elemets is: "+s.peek());
            System.out.println("Poped elemets is: "+s.pop());
        }
        s.pop();
    }
}
