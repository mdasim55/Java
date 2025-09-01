// Double ended queue   --> Deque

import java.util.Deque;
import java.util.LinkedList;

public class Q10_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        
        deque.addFirst(1);      // [ 1 ]
        deque.addFirst(2);      // [ 2,1 ]
        deque.addFirst(3);      // [ 3,2,1 ]
        deque.addLast(4);       // [ 3,2,1,4 ]
        deque.addLast(5);       // [ 3,2,1,4,5 ]
        deque.addLast(6);       // [ 3,2,1,4,5,6 ]

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        deque.removeFirst();       // [ 2,1,4,5,6 ]
        deque.removeLast();        // [ 2,1,4,5 ]
        deque.removeFirst();       // [ 1,4,5 ]
        deque.removeLast();        // [ 1,4]
        
        System.out.println(deque);
    }
}
