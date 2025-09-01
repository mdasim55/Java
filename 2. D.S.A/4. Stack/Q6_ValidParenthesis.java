//  Checks the given parenthesis strings is valid or not... 

import java.util.Stack;

public class Q6_ValidParenthesis {
    public static boolean isValid(String str) {             // Time complexity O(n)
        Stack<Character> s = new Stack<>();
        
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            // Opening brackets
            if(ch=='(' || ch=='{' || ch=='[') {
                s.push(ch);
            } else {                // Closing Brackets
                if(s.isEmpty()) {
                    return false;
                }
                if((s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']')) {
                    s.pop();
                } else {
                    return false;
                }
            } 
        }
        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({})[]";          // True
        String str2 = "({})[)]";          // False
        if(isValid(str2)) {
            System.out.println("The given string is valid.");
        } else {
            System.out.println("The given string is not valid.");
        }
    }
}
