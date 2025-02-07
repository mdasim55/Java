// 33. Create a program to find the Greatest Common Divisor (GCD) of two numbers.

import java.util.Scanner;

public class Qs_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD calculator...");
        System.out.print("Enter the first number: ");
        int num1= input.nextInt();
        System.out.print("Enter the second number: ");
        int num2= input.nextInt();
        int GCD=calculateGCD(num1,num2);
        System.out.println("The GCD of the "+num1+" and "+num2+" is: "+GCD);
    }
    public static int calculateGCD(int num1,int num2) {
        int gcd=1;
        int least=least(num1,num2);
        for(int i=2;i<=least;i++) {
            if(num1%i==0 && num2%i==0) {
                gcd=i;
            }
        }
        return gcd;
    }
    public static int least(int num1,int num2) {
        if(num1<num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
