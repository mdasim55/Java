// Print numbers from 1 to 5...

import java.util.Scanner;

public class Qs2 {
    public static void printNumbers(int n) {
        if(n==6) {
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        printNumbers(n);
    }
}
