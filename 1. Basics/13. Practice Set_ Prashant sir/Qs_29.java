// 29. Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.Scanner;

public class Qs_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum calculator...");
        System.out.print("Enter the number to be calculate the sum: ");
        int n= input.nextInt();
        int sum=calculateSum(n);
        System.out.println("The sum of all odd numbers from 1 to "+n+" is: "+sum);
    }
    public static int calculateSum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++) {             // for(int i=1;i<=n;i+=2) {
            if(i%2==1) {                    //     sum+=i;      
                sum+=i;                     // }
            }                               // return sum;
        }
        return sum;
    }
}
