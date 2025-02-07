// 35. Create a program to revers the digits of a number. 

import java.util.Scanner;

public class Qs_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to revers digit calculator...");
        System.out.print("Enter the number of the digit: ");
        int n= input.nextInt();
        int reverse=reverseDigit(n);
        System.out.println("The reverse of the digit is: "+reverse);
    }
    public static int reverseDigit(int n) {
        int reverse=0;
        while(n>0) {
            int digit=(n%10);
            reverse=reverse*10+digit;
            n=n/10;
        }
        return reverse;    
    }
}