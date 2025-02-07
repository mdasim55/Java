// 4. Print factorial of number n....

import java.util.Scanner;

public class Qs4 {
    public static int factorial(int n) {
        if(n==1) {
            return 1;
        }
        int fact_m1=factorial(n-1);                                        // fact_m1 = Factorial-1
        int fact=n*fact_m1;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println("The factorial is: "+fact);
    }
}
