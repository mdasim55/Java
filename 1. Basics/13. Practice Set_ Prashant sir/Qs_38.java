// 38. Create a program to verify if a number is a palindrome. 
//     Example of palindrome number:-> 0,1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,101,111,121,131,141,151,161,........ 

import java.util.Scanner;

public class Qs_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome calculator...");
        System.out.print("Enter the number: ");
        int num= input.nextInt();
        boolean isPalindrome=isPalindrome(num);
        if(isPalindrome) {
            System.out.println(num+" is a Palindrome number.");
        } else {
            System.out.println(num+" is not a palindrome number.");
        }
    }
    public static boolean isPalindrome(int num) {
        int reverse=0;
        int numCopy=num;
        while(numCopy>0) {
            int digit=(numCopy%10);
            reverse=reverse*10+digit;
            numCopy=numCopy/10;
        }
        if(reverse==num) {
            return true;
        } else {
            return false;
        }
    }
}