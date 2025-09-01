// Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the
// same structure and node values of subRoot and false otherwise..

import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;

class Node {
    int data;
    Node left,right;
    public Node(int data) {
        this.data=data;
        this.left=null;
        this.right=null;
    }   
}
class Info {
    Node node;
    int hd;     // horizontal distance
    public Info(Node node, int hd) {
        this.node=node;
        this.hd=hd;
    }
}
public class T3_SubTree {
    public static boolean isIdentical(Node root, Node subRoot) {
        if(root==null && subRoot==null) {
            return true;
        } else if(root==null || subRoot==null || root.data!=subRoot.data) {
            return false;
        }
        if(!isIdentical(root.left, subRoot.left)) {
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)) {
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node subRoot) {
        if(root==null) {
            return false;
        }
        if(root.data==subRoot.data) {
            if(isIdentical(root,subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Calculate the top view of the tree....
    public static void topView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int max=0,min=0;
        q.add(new Info(root,0));
        q.add(null);
        
        while(!q.isEmpty()) {
            Info currInfo=q.remove();
            if(currInfo==null) {
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(currInfo.hd)) {      // First time my hd is occuring 
                    map.put(currInfo.hd, currInfo.node);
                }
                if(currInfo.node.left != null) {
                    q.add(new Info(currInfo.node.left,currInfo.hd-1));
                    min=Math.min(min,currInfo.hd-1);
                }
                if(currInfo.node.right != null) {
                    q.add(new Info(currInfo.node.right,currInfo.hd+1));
                    max=Math.max(max,currInfo.hd+1);
                } 
            }
        }
        for(int i=min;i<=max;i++) {
            System.out.println(map.get(i).data);
        }
    }

    // Print all the node of k-th level....
    public static void kLevel(Node root, int level, int k) {
        if(root==null) {
            return;
        }
        if(k==level) {
            System.out.print(root.data+" ");
            return;
        }
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        if(isSubtree(root, subRoot)) {
            System.out.println("Subtree is here");
        } else {
            System.out.println("Subtree is not here");
        }

        //topView(root);

        kLevel(root, 01, 2);
    }
}
