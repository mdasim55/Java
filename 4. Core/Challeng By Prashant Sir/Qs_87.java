/* 87. Arithemetic Exception Handling.
       Write a program that asks the user to enter two integer and then devides the first by the second. The program
       should handle any arithemetic exceptions that occure(like divisible by zero) and display an appropriate message.
       Key Points:- 
       . Use Scanner to read user input.
       . Implement a try-catch block to handle arithemetic exception.
       . Display a user-friendly message ifn division by zero occurs. 
*/ 

import java.util.Scanner;

public class Qs_87 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first=input.nextInt();
        System.out.print("Enter the second number: ");
        int second=input.nextInt();
        input.close();
        try {
            int result=first/second;         // ArithmeticException
            System.out.println("The result is: "+result);
        } catch(ArithmeticException e) {            
            if(e.getMessage().equals("/ by zero")) {
                System.out.println("We are failed to devide. Reason is: ");
                System.out.println(e);
                System.out.printf("%s\n", e.getMessage());
                System.out.println("Devided by zero is occured.");
            } else {
                throw e;
            }
        }
        System.out.println("It is the end of thr program.");
    }
}