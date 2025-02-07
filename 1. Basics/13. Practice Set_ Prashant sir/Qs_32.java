// 32. Create a program to find the Least Common Multiple(LCM) of two numbers.

import java.util.Scanner;

public class Qs_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM calculator...");
        System.out.print("Enter the first number: ");
        int num1= input.nextInt();
        System.out.print("Enter the second number: ");
        int num2= input.nextInt();
        int LCM=calculateLCM(num1,num2);
        System.out.println("The LCM of the "+num1+" and "+num2+" is: "+LCM);
    }
    public static int calculateLCM(int num1,int num2) {
        for(int i=1;i<=num2;i++) {
            int factor= num1*i;
            if(factor%num2==0) {
                return factor;
            }
        }
        return num1*num2;
    }
}
