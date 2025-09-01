// Queue Implementation in Java using Java Collections Framework...

import java.util.Queue;
import java.util.LinkedList;

public class Q4_Implementation {
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();      // Queue is a interface that is implemented by the 1.linkedList and 2.ArrayDequeu
        Queue<Integer> q = new LinkedList<>();      // Queue is a interface that is implemented by the 1.linkedList and 2.ArrayDequeu
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()) {
            System.out.println("Removed element: "+q.remove());
        }
    }
}
