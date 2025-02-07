// 1. Print numbers from 5 to 1...

import java.util.Scanner;

public class Qs1 {
    public static void printNumbers(int n) {
        System.out.println(n);
        if(n==1) {
            return;
        }
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printNumbers(n);
    }
}