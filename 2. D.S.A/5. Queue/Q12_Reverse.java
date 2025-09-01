//  Reversing the first K elements of a Queue.
//  We have an integer k and a queue of integers, we need to reverse the order of the first k
//  elements of the queue, leaving the other elements in the same relative order.

//  Sample Input 1 : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] ,k=5
//  Sample Output 1 : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class Q12_Reverse {
    public static void reverseElements(Queue<Integer> q, int k) {
        if (q == null || k > q.size() || k < 0) {
            throw new IllegalArgumentException("Invalid value of k");
        }
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<k;i++) {
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
        for(int i=0;i<q.size()-k;i++) {
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> q= new LinkedList<>();

        System.out.print("Plesee enter the size of elements: ");
        int n = sc.nextInt();
        System.out.println("Please enter the "+n+" elments: ");
        for(int i=0;i<n;i++) {
            q.add(sc.nextInt());
        }
        System.out.println("Please enter the number of elements to be reverse: ");
        int k = sc.nextInt();

        System.out.println("Normal Queue is :"+ q);
        reverseElements(q,k);
        System.out.println("Reverse Queue is :"+ q);

        sc.close();
        

    }
}
