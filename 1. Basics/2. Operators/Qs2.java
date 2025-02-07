// 1. Create a program to calculate Area of a triangle.

import java.util.Scanner;

public class Qs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of perimeter: ");
        int a=sc.nextInt();
        System.out.print("Enter the height of perimeter: ");
        int h=sc.nextInt();
        float area= 0.5f*a*h;
        System.out.println("The area of a rectangle is: "+area);        
    }
}

