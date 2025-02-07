// 31. Create a program that computes the sum of digits of an integer.

import java.util.Scanner;

public class Qs_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of digit calculator...");
        System.out.print("Enter the number of the digit: ");
        int n= input.nextInt();
        int sum=calculateDigit(n);
        System.out.println("The sum of the digit is: "+sum);
    }
    public static int calculateDigit(int n) {
        int sum=0;
        while(n>0) {
            sum+=(n%10);
            n=n/10;
        }
        return sum;    
    }
}
