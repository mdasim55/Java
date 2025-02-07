// 28. Develop a program that prints the multiplication table for a given number.

import java.util.Scanner;

public class Qs_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication table calculator: ");
        System.out.print("Enter the number: ");
        int n= input.nextInt();
        multiplyTable(n);
    }
    public static void multiplyTable(int n) {
        System.out.println("The multiplication table of the "+n+" is: ");
        for(int i=1;i<=10;i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    } 
}