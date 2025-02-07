// 30. Wtite a function that calculate the factorial of a given number.

import java.util.Scanner;

public class Qs_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial calculator...");
        System.out.print("Enter the number to be calculate the factorial: ");
        int n= input.nextInt();
        long fact=calculateFact(n);
        System.out.println("The factorial of the number "+n+" is: "+fact);
        long fact1=calculateFact1(n);
        System.out.println("The factorial of the number "+n+" is: "+fact1);
    }
    // Using rescursion...
    public static long calculateFact(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        return n*calculateFact(n-1);
    }
    // Using Loop....
    public static long calculateFact1(int n) {
        long fact=1;
        for(int i=n;i>=1;i--) {
            fact=fact*i;
        }
        return fact;
    }
}
