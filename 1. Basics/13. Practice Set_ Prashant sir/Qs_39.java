/*  39. Create a program that print the given patterns.
     
   1.   *                     2.  *  *  *  *  *          3.               *
        *  *                      *  *  *  *                           *  *
        *  *  *                   *  *  *                           *  *  *
        *  *  *  *                *  *                           *  *  *  *
        *  *  *  *  *             *                           *  *  *  *  *
 */

import java.util.Scanner;

public class Qs_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Print-pattern calculator...");
        System.out.print("Enter the row: ");
        int row= input.nextInt();
        printPattrens1(row);
        printPattrens2(row);
        printPattrens3(row);
    }
    public static void printPattrens1(int row) {
        System.out.println("Here is Right Half pyramid.");
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void printPattrens2(int row) {
        System.out.println("Here is Reverse Right Half pyramid.");
        for(int i=row;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void printPattrens3(int row) {
        System.out.println("Here is left Half pyramid.");
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=row-i;j++) {
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }   
}
