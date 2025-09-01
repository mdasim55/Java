// 1. Add First & Last in LinkedList....Time Complexity -> O(1)
// 2. Add Middle in LinkedList....Time Complexity -> O(n)
// 3. Remove Firts node in a LinkedList...Time Complexity -> O(1)
// 4. Remove Last node in a LinkedList...Time Complexity -> O(n)
// 5. Print a linkedList...Time Complexity -> O(n)
// 6. Size of a LinkedList...Time Complexity -> O(1)
// 7. Search (Iterative) :- Search for a 'key' in a LinkedList. Return the position where it is found. If not found then return -1.   Time complexity -> O(n)
// 8. Search (Recursive) :- Search for a 'key' in a LinkedList. Return the position where it is found. If not found then return -1. Use Recursive.   Time complexity -> O(n)

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data=data;
        this.next=null;
    }
}
class LinkedList1 {
    Node head;
    Node tail;
    int size;
    // 1.Add First of the LinkedList
    public void addFirst(int data) {
        // Step1 -> Create new node
        Node newNode=new Node(data);
        size++;
        // If head == null..
        if(head==null) {
            head=tail=newNode;
            return;
        }
        // Step2 -> newNode next = head
        newNode.next=head;
        // Step3 -> head = new node
        head = newNode;
    }

    // 2.Add last of the LinkedList
    public void addLast(int data) {
        Node newNode=new Node(data);
        size++;
        if(head==null) {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    // 3.Add middle of the LinkedList....Time Complexity -> O(n) 
    public void addMiddle(int index,int data) {
        if(index<0 || index>size) {         // To ensure thet index is valid..
            System.out.println("Index out of bounds exception.");
            return;
        }
        if(index==0) {
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1) {
            temp=temp.next;
            i++;
        }
        if(temp==null) {
            System.out.println("Index out of bounds exception.");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    // 4.Remove first in the LinkedList...
    public int removeFirst() {
        if(size==0) {
            System.out.println("The LL is empty.");
            return Integer.MIN_VALUE;
        } else if(size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    // 5.Remove Last in the LinkedList...
    public int removeLast() {
        if(size==0) {
            System.out.println("The LL is empty.");
            return Integer.MIN_VALUE;
        } else if(size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++) {
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        size--;
        tail=temp;
        return val;
    }

    // 6. Print a linkedList...Time Complexity -> O(n)
    public void print() {
        if(head==null) {
            System.out.println("LL is empty.");
            return;
        }
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // 7.Iterative Search : key search...Time Complexity -> O(n)
    public int itrSearch(int key) {
        Node temp=head;
        int i=0;
        while(temp!=null) {
            if(temp.data==key) {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;          // If key is not found 
    }
    // 8.Recursive Search : key search...Time Complexity -> O(n)
    public int helper(Node head, int key) {
        if(head==null) {
            return -1;
        }
        if(head.data==key) {
            return 0;
        }
        int indx=helper(head.next, key);
        if(indx==-1) {
            return -1;
        }
        return indx+1;
    }
    public int recSearch(int key) {
        return helper(head,key);
    }
}
public class L2_AddNode {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1(); 
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.print();
        list.addMiddle(1, 11);
        list.print();
        list.addMiddle(10, 12);          // Throw an exception.. 
        list.print();
        System.out.println("The size of the linkedList is : "+list.size);
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
        System.out.println("The size of the linkedList is : "+list.size);
        System.out.println("The value is found at index no: "+list.itrSearch(4));
        System.out.println("The value is found at index no: "+list.itrSearch(14));
        System.out.println("The value is found at index no: "+list.recSearch(4));
        System.out.println("The value is found at index no: "+list.recSearch(14));
    }
} 
