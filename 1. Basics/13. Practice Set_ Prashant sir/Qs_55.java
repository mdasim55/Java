// 55. Create a program to calculate the absolute value of a given number using ternary operator.

import java.util.Scanner;

public class Qs_55 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to absolute number calculator.");
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        int result=num>=0 ? num : -num;
        System.out.println("The absolute number of "+num+" is: "+result);
    }
}
