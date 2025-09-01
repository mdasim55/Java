// Circular queue using array...

public class Q2_CircularQueue {
    static class C_Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        C_Queue(int n) {
            arr=new int[n];
            size=n; 
            rear=-1;
            front=-1;
        }
        // Empty...
        public static boolean isEmpty() {
            return rear==-1 && front==-1;
        }
        public static boolean isFull() {
            return (rear+1)%size==front;
        }
        // Add function...O(1)
        public static void add(int data) {
            if(isFull()) {
                System.out.println("Queue is full.");
                return;
            }
            // Add first element...
            if(front==-1) {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        // Remove function...O(1)
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            int element=arr[front];
            // Last element delete...
            if(front==rear) {
                front=rear=-1;
            } else {
                front=(front+1)%size;
            }
            return element;
        }
        // Peek function...O(1)
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            int element=arr[front];
            return element;
        }
    }
    public static void main(String[] args) {
        C_Queue q = new C_Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }    
}