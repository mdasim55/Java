// Check if the expression is contain duplicate parenthesis or not...

import java.util.Stack;

public class Q7_DuplicaterParenthesis {
    public static boolean isDuplicateParenthesis(String exp) {          // Time Complexity: O(n)
        Stack<Character> s = new Stack<>();
        
        for(int i=0;i<exp.length();i++) {
            char ch = exp.charAt(i);
            // Opening Parenthesis , Operator, operand
            if(ch!=')') {
                s.push(ch);
            } else {            // Closing parenthesis...
                int count=0;
                while(s.peek()!='(') {      // while(s.pop() != '(') {
                    s.pop();
                    count++;
                }
                if(count>0) {
                    s.pop();
                } else {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String expression = "(c+(a+b))";
        
        boolean result=isDuplicateParenthesis(expression);
        if(result) {
            System.out.println("The expression is containing duplicate parenthesis...");
        } else {
            System.out.println("The expression is not containing duplicate parenthesis...");
        }

    }
}
