// Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the
// same structure and node values of subRoot and false otherwise..
// 5. Lowest Common Ancestor...with space complexity...
// 6. Lowest Common Ancestor...without space complexity...
// 7. Minimum distance between 2 nodes...
// 8. Find Kth Ancestor...

import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.ArrayList;

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
    // 1: 
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
    // 2: 
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

    // 3: Calculate the top view of the tree....
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

    // 4. Print all the node of k-th level....
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

    // 5. Lowest common ancestor...Space complexity: O(n)
    public static Node lCA(Node root, int a, int b) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // Step 1: Find the path left and rigfht
        getPath(root,a,path1);
        getPath(root,b,path2);

        // Step 2: Compare the path...
        int i = 0;
        for(;i<path1.size() && i<path2.size();i++) {
            if(path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }
    // 5.1: get path of node...
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if(root==null) return false;
        path.add(root);
        if(root.data==n) return true;
        boolean left = getPath(root.left, n, path);
        boolean right = getPath(root.right, n, path);
        if(left || right) return true;
        path.remove(path.size()-1);
        return false;
    }

    // 6. Lowest common ancestor... Space complexity: O(1)
    public static Node lCA2(Node root, int a, int b) {
        if(root==null || root.data==a || root.data==b) {
            return root;
        }
        Node left = lCA2(root.left, a, b);
        Node right = lCA2(root.right, a, b);
        // step2: both values lies 1 side...
        if(left==null) return right;
        if(right==null) return left;
        // step3: both values lies 2 side..
        return root;
    }

    // 7. Minimum distance between 2 nodes...
    public static int minDistance(Node root, int n1, int n2) {
        Node lca = lCA2(root, n1, n2);
        int leftDist = lcaDist(lca,n1);
        int rightDist = lcaDist(lca,n2);
        return leftDist + rightDist;
    }
    // 7.1: lca to node distance...
    private static int lcaDist(Node lca, int n) {
        if(lca==null) return -1;
        if(lca.data==n) return 0;
        int leftDist = lcaDist(lca.left, n);
        int rightDist = lcaDist(lca.right, n);
        if(leftDist==-1 && rightDist==-1) return -1;
        else if(leftDist==-1) return rightDist+1;
        else return leftDist+1;
    }

    // 8. Kth Ancestor...
    public static int kthAncestor(Node root, int n, int k) {

        if(root==null) return -1;
        if(root.data==n) return 0;

        int leftDist = kthAncestor(root.left, n, k);
        int rightDist = kthAncestor(root.right, n, k);

        int max = Math.max(leftDist, rightDist);
        if(max+1==k) {
            System.out.println(root.data);
        }
        return max+1;
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

        // if(isSubtree(root, subRoot)) {
        //     System.out.println("Subtree is here");
        // } else {
        //     System.out.println("Subtree is not here");
        
        //topView(root);

        // kLevel(root, 01, 2);

        // int a = 4, b = 5;
        // System.out.println(lCA2(root, a, b).data); 

        // System.out.println(minDistance(root,4,6));

        kthAncestor(root,4,1);
    }
}
