// 1. Create a program to calculate Perimeter of a rectangle.

import java.util.Scanner;

public class Qs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of perimeter: ");
        int a=sc.nextInt();
        System.out.print("Enter the width of perimeter: ");
        int b=sc.nextInt();
        int perimeter=2*(a+b);
        System.out.println("The Perimeter of a rectangle is: "+perimeter);        
    }
}
