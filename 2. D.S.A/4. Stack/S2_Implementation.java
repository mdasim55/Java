// Stack implementation using linkedList...

public class S2_Implementation {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    static class Stack {
        static Node head = null;

        // Check the list is null or not...
        public static boolean isEmpty() {
            return head==null;
        }
        // Push Fiunction...
        public static void push(int data) {
            Node newNode = new Node(5);
            if(isEmpty()) {
                head=newNode;
                return;
            } 
            newNode.next=head;
            head=newNode;
        }
        // Pop function...
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int pop = head.data;
            head=head.next;
            return pop;
        } 
        // Peek Function...
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            int pop = head.data;
            return pop;
        } 
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        //System.out.println(s);
        while(! s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
