// Stack and Queue implementation usin Deque...

import java.util.Deque;
import java.util.LinkedList;

class StackExample {
    Deque<Integer> deque = new LinkedList<>();
    // is empty Function..
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    // Add Function...
    public void push(int data) {
        deque.addLast(data);
    }
    // Remove Function...
    public int pop() {
        if(isEmpty()) {
            System.out.println("The stack is empty.");
            return -1;
        }
        int top = deque.removeLast();
        return top;
    } 
    // Peek Function...
    public int peek() {
        int top = deque.getLast();
        return top;
    } 
}
class QueueExample {
    Deque<Integer> deque = new LinkedList<>();
    // is empty Function..
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    // Add Function...
    public void add(int data) {
        deque.addLast(data);
    }
    // Remove Function...
    public int remove() {
        if(isEmpty()) {
            System.out.println("The queue is empty.");
            return -1;
        }
        int top = deque.removeFirst();
        return top;
    } 
    // Peek Function...
    public int peek() {
        int top = deque.getFirst();
        return top;
    } 
}
public class Q11_StackQueue {
    public static void main(String[] args) {
        StackExample s = new StackExample();
        QueueExample q = new QueueExample();

        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("The peek element of the stack: "+s.peek());
        System.out.print("The stack is : ");
        while(!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }

        System.out.println();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("The peek element of the queue: "+q.peek());
        System.out.print("The queue is : ");
        while(!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }    
}
