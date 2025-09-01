// Reverse a String using Stack...

import java.util.Stack;

public class Q2_ReverseString {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx=0;
        while(idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(! s.isEmpty()) {
            char top = s.pop();
            result.append(top);
        }
        return result.toString();       // Convert object to tring
    }
    public static void main(String[] args) {
        String str = "abcdef";
        String str2 = "HelloWolrd";
        String result = reverseString(str);
        String result2 = reverseString(str2);
        System.out.println(result);
        System.out.println(result2);
    }    
}
