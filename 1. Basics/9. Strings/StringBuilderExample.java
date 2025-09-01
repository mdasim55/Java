public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z'; ch++) {
            sb.append(ch);              // Time Complexity: O(n)
        } 
        System.out.println(sb);
    }
}
