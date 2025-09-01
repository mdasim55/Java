// Calculate the height of the tree...

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
    int diam;
    int height;
    public Info(int diam,int height) {
        this.diam=diam;
        this.height=height;
    }
}
public class T2_Calculate {    
    // Calculate height...
    public static int height(Node root) {           // Time complexity: O(n)
        if(root==null) {
            return 0;
        }
        int lh = height(root.left)+1;
        int rh = height(root.left)+1;
        return Math.max(lh,rh);
    }
    // Calculate total node in a tree...
    public static int totalNode(Node root) {           // Time complexity: O(n)
        if(root==null) {
            return 0;
        }
        int leftCount = totalNode(root.left);
        int rightCount = totalNode(root.left);
        return leftCount+rightCount+1;
    }
    // Calculate sum of the total node in a tree...
    public static int totalSum(Node root) {           // Time complexity: O(n)
        if(root==null) {
            return 0;
        }
        int leftSum = totalSum(root.left);
        int rightSum = totalSum(root.left);
        return leftSum+rightSum+root.data;
    }
    // Calculate diameter in a tree...              // Approach 1
    public static int diameter(Node root) {         // Time complexity: O(n^2)
        if(root==null) {
            return 0;
        }
        int leftDiameter=diameter(root.left);
        int rightDiameter = diameter(root.right);
        int leftHt = height(root.left);
        int rightHt = height(root.left);
        int selfCount = (leftHt+rightHt+1);
        return Math.max(selfCount,Math.max(leftDiameter,rightDiameter));
    }
    // Calculate diameter in a tree...              // Approach 2
    public static Info diameter2(Node root) {         // Time complexity: O(n)
        if(root==null) {
            return new Info(0,0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);
        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.height+rightInfo.height+1);
        int height = Math.max(leftInfo.height,rightInfo.height)+1;
        
        return new Info(diam,height);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        
        System.out.println("Height: "+height(root));
        System.out.println("Total node: "+totalNode(root));
        System.out.println("Total sum: "+totalSum(root));
        System.out.println("Diameter: "+diameter(root));

        System.out.println("Diameter: "+diameter2(root).diam);
        System.out.println("Height: "+diameter2(root).height);
    }
}
