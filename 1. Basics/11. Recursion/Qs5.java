// 5.Print the fibonacchi sequence till nth term.

import java.util.Scanner;

public class Qs5 {
    public static int calcFib(int n) {
        if(n<=1) {
            return n;
        }
        int fibo=calcFib(n-1)+calcFib(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.print(calcFib(i)+" ");
        }
    }
}
