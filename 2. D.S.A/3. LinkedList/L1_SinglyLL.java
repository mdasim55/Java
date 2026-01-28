// 1. Add First & Last in LinkedList....Time Complexity -> O(1)
// 2. Add Middle in LinkedList....Time Complexity -> O(n)
// 3. Remove Firts node in a LinkedList...Time Complexity -> O(1)
// 4. Remove Last node in a LinkedList...Time Complexity -> O(n)
// 5. Print a linkedList...Time Complexity -> O(n)
// 6. Size of a LinkedList...Time Complexity -> O(1)
// 7. Search (Iterative) :- Search for a 'key' in a LinkedList. Return the position where it is found. If not found then return -1.   Time complexity -> O(n)
// 8. Search (Recursive) :- Search for a 'key' in a LinkedList. Return the position where it is found. If not found then return -1. Use Recursive.   Time complexity -> O(n)
// 9. Finding the middle element of the LinkedList...
// 10. check if the linkedlist is palindrome or not...
// 11. Calculate the size of the linkedList....
// 12. Detect Cycle or loop in a LL.
// 13. Remove Cycle in LL.
// 14. Merge Sort in a linked List...
// 18. Zifzag on a linked list... 

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

    // 9. Finding the middle element of the LinkedList....Slow & fast Approach...
    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null) {      // even case && odd case
            slow=slow.next;                  // +1
            fast=fast.next.next;             // +2
        }
        return slow;                         // now slow is mid element...
    }

    // 10. Check the LinkedList is palindrome or not...
    public boolean ispalindrome() {
        // Base case: 
        if(head==null || head.next==null) {
            return true;
        }
        // Step 1: find the mid node
        Node midNode=findMiddle(head);
        // step 2: Reverse the LL of left part...
        Node prev = null;
        Node curr= midNode;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }     
        Node left = head;
        Node right = prev;
        // Step 3: Compare the left part and right part...  
        while(right!=null) {
            if(left.data!=right.data) {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    // 11. Calculate size...
    public int clacSize() { 
        int size = 0;
        while(head!=null) {
            head=head.next;
            size++;
        }
        return size;
    }
    // 12. Delete n node from last...Using Iterative approach...
    public void removeNthNode(int n) {
        int size = clacSize();
        if(size==n) {
            head = head.next;
            return;
        }
        // For size()-n nodes
        Node prev = head;
        int i = 1;
        int idx = size-n;
        while(i<idx) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;   
    }
    // 13. Cycle detection...
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;           // +1
            fast = fast.next.next;      // +2
            if(slow==fast) {
                return true;
            }
        } 
        return false;
    } 
    // 14. Remove cycle in a LL
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        Node prev = null;
        boolean cycle = false;
        // Step 1: Detect Cycle...
        while(fast!=null && fast.next!=null) {
            slow = slow.next;           // +1
            fast = fast.next.next;      // +2
            if(slow==fast) {
                cycle = true;
                break;
            }
        } 
        if(!cycle) return;
        // Step 2: find meeting point...
        slow = head;
        while(slow!=fast) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        // Step 3: remove cycle...
        prev.next = null;
    }
    // 14. MergeSort...
    public Node mergeSort(Node head) {
        if(head==null || head.next==null) {
            return head;
        }
        // step1: Find mid     --> first half last node foe even...
        Node mid = getMid(head);
        
        // step 2: devide 2 parts ...left part and right part..
        Node rightPart = mid.next;
        mid.next = null;
        Node leftPart = mergeSort(head);
        rightPart = mergeSort(rightPart);

        // step 3: merge two sorted LL
        return merge(leftPart,rightPart);
    }
    // 16. Find mid element...
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // 17. Merge two LL.... 
    private Node merge(Node left, Node right) {
        Node head = new Node(-1);
        Node temp = head;
        while(right!=null && left!=null) {
            if(left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        while(left!=null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while(right!=null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return head.next;
    }

    // 18. Zigzag on a LL
    public void zigZag() {

        // Step1: find mid...
        Node mid = getMid(head);
        
        // Step2: reverse the left part...
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next = null;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step3: merge in zigzag order...
        Node left = head;
        Node right = prev;
        Node nextLeft, nextRight;
        while(left!=null && right!=null) {
            nextLeft = left.next;
            nextRight = right.next;
            left.next = right;
            right.next = nextLeft;
            left = nextLeft;
            right = nextRight; 
        }
    }
}
public class L1_SinglyLL {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1(); 
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        // list.tail.next = list.head.next;
        list.print();
        // list.addMiddle(1, 11);
        // list.print();
        // list.addMiddle(10, 12);          // Throw an exception.. 
        // list.print();
        // System.out.println("The size of the linkedList is : "+list.size);
        // list.removeFirst();
        // list.print();
        // list.removeLast();
        // list.print();
        // System.out.println("The size of the linkedList is : "+list.size);
        // System.out.println("The value is found at index no: "+list.itrSearch(4));
        // System.out.println("The value is found at index no: "+list.itrSearch(14));
        // System.out.println("The value is found at index no: "+list.recSearch(4));
        // System.out.println("The value is found at index no: "+list.recSearch(14));
        // System.out.println(list.ispalindrome());
        // list.removeNthNode(3);
        // System.out.println(list.isCycle());
        // list.removeCycle();
        // System.err.println(list.isCycle());
        // list.head = list.mergeSort(list.head);
        list.zigZag();
        list.print();
    }
} 
