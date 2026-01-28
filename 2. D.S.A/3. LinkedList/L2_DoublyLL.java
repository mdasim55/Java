// 1. Add First
// 2. Add Last
// 3. Remove First
// 4. Remove Last
// 5. Print 
// 6. Reverse

class Node1 {
    int data;
    Node1 next;
    Node1 prev;
    public Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DLL {
    Node1 head;
    Node1 tail;
    int size;

    // 1. Add First...
    public void addFirst(int data) {
        Node1 newNode = new Node1(data); 
        size++;
        if(head==null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // 2. Add Last...
    public void addLast(int data) {
        Node1 newNode = new Node1(data);
        size++;
        if(head==null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    // 3. Remove first...
    public int removeFirst() {
        int val = -1;
        if(head==null) {
            return -1;
        }
        if(head==tail) {
            val = head.data;
            head = tail = null;
        } else {
            val = head.data;
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }
    // 4. Remove Last...
    public int removeLast() {
        int val = -1;
        if(head==null) {
            return val;
        }
        if(head==tail) {
            val = head.data;
            head = tail = null;
        } else {
            val = tail.data;
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;
    }
    // 5. Print the LL...
    public void print() {
        Node1 temp = head;
        System.out.print("null <-> ");
        while(temp!=null) {
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // 6. Reverse DLL...
    public void reverse() {
        Node1 curr = head;
        Node1 prev = null;
        Node1 next = null;
        tail = head;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
public class L2_DoublyLL {
    public static void main(String[] args) {
        DLL dl = new DLL();

        dl.addFirst(1);
        dl.addFirst(2);
        dl.addFirst(3);
        dl.addLast(1);
        dl.addLast(2);
        dl.addLast(3);
        dl.print();
        System.out.println("Size: "+dl.size);

        // System.out.println(dl.removeFirst());
        // System.out.println(dl.removeLast());
        dl.reverse();

        dl.print();
        System.out.println("Size: "+dl.size);
    }
}