// 62. Create a program using for to display if a number is prime or not.

import java.util.Scanner;

public class Qs_62 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to prime number chaechc calculator: ");
        System.out.print("Enter the numnber: ");
        int num=input.nextInt();
        input.close();
        boolean isPrime=isPrime(num);
        if(isPrime) {
            System.out.println(num+" , is a prime number.");
        } else {
            System.out.println(num+" , is not a prime number.");
        }
    }
    public static boolean isPrime(int num) {
        for(int i=2;i<num;i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}
