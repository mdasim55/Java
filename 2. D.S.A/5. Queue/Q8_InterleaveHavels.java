// Interleave 2 Havels of a Queue(even length)...
// Time Complexity - O(n) , Space Complexity - O(n) 

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8_InterleaveHavels {
    public static void interleave(Queue<Integer> q) {
        Queue<Integer> q1 = new LinkedList<>();
        int size=q.size()/2;

        for(int i=0;i<size;i++) {
            q1.add(q.remove());
        }
        while(!q1.isEmpty()) {
            q.add(q1.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q= new LinkedList<>();
        System.out.print("Plesee enter the size of even elements: ");
        int n = sc.nextInt();
        if(n%2 != 0) {
            System.out.println("Sorry, You have entered odd number: ");
            sc.close();
            return ;
        }
        System.out.println("Please enter the "+n+" elments: ");
        for(int i=0;i<n;i++) {
            q.add(sc.nextInt());
        }
        interleave(q);
        System.out.println("Interleaved Queue:");
        while(!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
        System.out.println(); 
        sc.close();
    }
}