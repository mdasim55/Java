class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
    }
}
public class B1_AllOperation {
    // 1. Insert Operation...
    public static Node insert(Node root, int val) {
        if(root==null) {
            root = new Node(val); 
            return root;
        } 
        if(val<root.data) {
            root.left = insert(root.left,val);
        } else {
            root.right = insert(root.right,val);
        }
        return root;
    }
    // 2. InOrder Traversal...
    public static void inOrder(Node root) {
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    // 3. Search :      Time Complexity: O(h)    h->height of the tree
    public static boolean search(Node root, int key) {
        if(root==null) {
            return false;
        }
        if(root.data==key) {
            return true;
        }
        if(key<root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    } 
    // 4. Delete node...
    public static Node delete(Node root, int key) {
        if(key<root.data) {
            root.left = delete(root.left, key);
        } else if(key>root.data) {
            root.right = delete(root.right, key);
        } else {    // root.data == key
            // case1: leaf node
            if(root.left==null && root.right==null) {
                return null;
            }
            // case2: One child...
            else if(root.left!=null) {
                return root.left;
            } else if(root.right!=null) {
                return root.right;
            }
            // Case3: two child...
            Node IS = findIS(root.left);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    // 5. InOrder Succesor....
    public static Node findIS(Node root) {
        while (root.left!=null) {
            root = root.left;
        }
        return root;
    }
    // 6. Print in a range..
    public static void printRange(Node root, int low, int high)  {
        if(root==null) return;
        if(root.data>=low && root.data<=high) {
            printRange(root.left, low, high);
            System.out.print(root.data+" ");
            printRange(root.right, low, high);
        } else if(root.data>high) {
            printRange(root.left, low, high);
        } else {
            printRange(root.right, low, high);
        }
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++) {
            root = insert(root,values[i]);
        }
        // inOrder(root);
        // System.out.println();
        // System.out.println(search(root, 7));
        // root = delete(root, 1);
        // inOrder(root);
        // System.out.println();
        printRange(root, 5, 11);
    }
}