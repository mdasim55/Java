// 34. Create a program to check wheather a given number is prime or not.
//     Prime number example:- 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97. --> 25 prime numbers

import java.util.Scanner;

public class Qs_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime number calculator...");
        System.out.print("Enter the number: ");
        int num= input.nextInt();
        boolean isPrime=isPrime(num);
        if(isPrime) {
            System.out.println(num+" is a Prime number.");
        } else {
            System.out.println(num+" is not a Prime number.");
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
