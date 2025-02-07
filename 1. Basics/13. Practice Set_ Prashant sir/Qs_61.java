// 61. Create a program using for loop multiplication table for a number.

import java.util.Scanner;

public class Qs_61 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to multiplication table calculator: ");
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(num+" x "+i+" = "+i*num);
        }
        input.close();
    }
    
}
