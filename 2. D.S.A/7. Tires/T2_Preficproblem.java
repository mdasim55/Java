class Node {
    Node children[]=new Node[26];
    boolean eow=false;
    int freq;
    public Node() {
        for(int i=0;i<26;i++) {
            children[i]=null;
        }
        freq=1;
    }
}

public class T2_Preficproblem {
    public static Node root = new Node();

    // Insertion Function...
    public static void insert(String word) {        // Time complexity: O(L) --> L menas largest string...
        Node curr = root;
        for(int i=0;i<word.length();i++) {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null) {
                curr.children[idx] = new Node();
            } else {
                curr.freq++;
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    // Search Function...
    public static String search(String word) {        // Time complexity: O(L) --> L menas largest string...
        Node curr = root;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word.length();i++) {
            int idx=word.charAt(i)-'a';
            sb.append(word.charAt(i));
            curr=curr.children[idx];
            if(curr.freq==1) {
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        
        for(String word:arr) {
            insert(word);
        }
        for(String word:arr) {
            System.out.println(word+" -> "+search(word));
        }
    }
}
