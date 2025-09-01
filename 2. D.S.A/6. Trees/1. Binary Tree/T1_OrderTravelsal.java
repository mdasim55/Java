// Build a pre-order, in-order, post-order tree...

import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree {          // Time Complexity: O(n)
    int idx=-1;
    public Node buildTree(int nodes[]) {
        idx++;
        if(idx >= nodes.length ||nodes[idx]==-1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
    // Pre-Order Traversal...
    public void preOrder(Node root) {       // Time Complexity: O(n)
        if(root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    // In-Order Traversal...
    public void inOrder(Node root) {       // Time Complexity: O(n)
        if(root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    // Post-Order Traversal...
    public void postOrder(Node root) {       // Time Complexity: O(n)
        if(root==null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    // Level-Order Traversal...
    public void levelOrder(Node root) {       // Time Complexity: O(n)
        if(root==null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node newNode = q.remove();
            if(newNode==null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(newNode.data+" ");
                if(newNode.left!=null) {
                    q.add(newNode.left);
                }
                if(newNode.right!=null) {
                    q.add(newNode.right);
                }
            }
        }

    }
}

public class T1_OrderTravelsal { 
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Root: "+root.data);

        System.out.print("PreOrder Traversal: ");
        tree.preOrder(root);
        System.out.println();
        System.out.print("InOrder Traversal: ");
        tree.inOrder(root);
        System.out.println();
        System.out.print("PostOrder Traversal: ");
        tree.postOrder(root);
        System.out.println();
        System.out.println("LevelOrder Traversal: ");
        tree.levelOrder(root);
    }
}