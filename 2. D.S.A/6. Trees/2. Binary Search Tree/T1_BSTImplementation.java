class Node {
    int data;
    Node left,right;
    public Node(int data) {
        this.data=data;
    }
}
public  class T1_BSTImplementation {
    // Add nodes in BST         Time Complexity: O(height)
    public static Node insert(Node root,int value) {
        if(root==null) {
            root = new Node(value);
            return root;
        }
        if(root.data>value) {
            root.left=insert(root.left, value);
        } else {
            root.right=insert(root.right,value);
        }
        return root;
    }
    // Search nodes in BST         Time Complexity: O(height)
    public static boolean search(Node root,int value) {
        if(root==null) {
            System.out.println("The tree is empty.");
            return false;
        }
        if(root.data==value) {
            return true;
        } 
        if(value<root.data) {
            return search(root.left,value);
        } else {
            return search(root.right,value);
        }
    }
    // Delete a node...
    public static Node delete(Node root,int value) {
        if(value<root.data) {
            root.left=delete(root.left, value) 
        } else if(value>root.data) {
            root.right=delete(root.left,value);
        } else {        // (value==root.data)
            // 1. leaf node...
            if(root.left==null && root.right==null) {
                return null;
            } 
            // 2. One Child....
            if(root.left==null) {
                return root.right;
            } else {
                return root.left;
            }
            // 3. Two child.. 
            Node IS = findInOrderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, root.right);
        }
    }
    // Find inOrder Successor...
    public static Node findInOrderSuccessor(Node root) {
        while (root.left!=null) {
            root=root.left;
        }
        return root;

    }
    // InOrder Traversal....
    public static void inOrder(Node root) {       // Time Complexity: O(n)
        if(root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int values[]={5,4,9,7,1,2,6,8};
        Node root=null;
        for(int i=0;i<values.length;i++) {
            root=insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();
    
        if(search(root,3)) {
            System.out.println("The value is present int the tree.");
        } else {
            System.out.println("The value is not present int the tree.");
        }
    }
}