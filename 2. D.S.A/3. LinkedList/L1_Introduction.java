// 1. Create a LinkedList

import java.util.LinkedList;

public class L1_Introduction {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    // Create Head node and Tail node...
    public static Node head;
    public static Node tail;

    // Methods and OPerations of LinkedList...
    // 1. Add()
    // 2. Remove()
    // 3. Print()
    public static void main(String[] args) {
        LinkedList ll=new LinkedList<>();
    }
}