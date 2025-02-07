/* 
 * 1. Create a program that shows bitwise AND of two numbers.
 * 2. Create a program that shows bitwise OR of two numbers.
 * 3. Create a program that shows bitwise XOR of two numbers.
 * 4. Create a program that shows bitwise compliment of two numbers.
 * 5. Create a program that shows use of left shift operator.
 * 6. Create a program that shows use of right shift operator.
 * 7. Write a program to check if a given number is even or odd using bitwise operators. 
 */

import java.util.Scanner;

public class BiteiseOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing the bit manipulation....");
        System.out.print("Enter the first number: ");
        int first=input.nextInt();
        System.out.print("Enter the second number: ");
        int second=input.nextInt();
        System.out.println("Result is: "+(first&second));
        System.out.println("Result is: "+(first|second));
        System.out.println("Result is: "+(first^second));
        System.out.println("Result is: "+(~first));
        System.out.println("Result is: "+(first<<2));
        System.out.println("Result is: "+(first>>2 ));

        // Check the given number is even or odd.
        System.out.println("Welcome to odd even calculator.");
        int num=first&1;
        if(num==0) {
            System.out.println("The given number is Even.");
        } else {
            System.out.println("The given number is Odd.");
        }
    }
}
