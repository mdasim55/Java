// 58. Create a program to create a simple calculator that uses a switch statement to perform basic arithemetic 
//     operations like addition, subtraction, multiplication and divison.  

import java.util.Scanner;

public class Qs_58 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome switch calculator.");
        System.out.print("Enter the first number: ");
        int num1=input.nextInt();
        System.out.print("Enter the second number: ");
        int num2=input.nextInt();
        System.out.print("Enter the operation: ");
        String operator=input.next();
        int result=switch(operator) {
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            case "%" -> num1%num2;
            default -> -1;
        };
        System.out.println("The result is: "+result);
        input.close();
    }
}
