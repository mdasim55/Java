// 54. Create a program to find if the given number is even or odd.

import java.util.Scanner;

public class Qs_54 {
        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to even odd calculator.");
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        String str=num%2==0? "Even":"Odd";
        System.out.println(num+" is a "+str+" number");
    }
}
