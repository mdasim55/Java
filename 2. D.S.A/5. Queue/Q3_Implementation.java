// Queue implementation using LinkedList...

public class Q3_Implementation {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;
        // isEmpty Condition...
        public static boolean isEmpty() {
            return head==null && tail==null;
        }
        // Add function...O(1)
        public static void add(int data) {
            Node newNode = new Node(data);
            if(head==null) {
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        // Remove Function...O(1)
        public static int remove() {
            if(isEmpty()) {
                System.out.println("The queue is empty.");
                return -1;
            }
            int element=head.data;
            // Remove last node...
            if(head==tail) {
                head=tail=null;
            } else {
                head=head.next;
            }
            return element;
        }
        // Peek function...O(1)
        public static int peek() {
            if(isEmpty()) {
                System.out.println("The queue is empty.");
                return -1;
            }
            int element=head.data;
            return element;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Removed: "+q.remove());
        q.add(6);
        System.out.println("Removed: "+q.remove());
        q.add(7);
        System.out.println("Reamining queue elements: ");
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
