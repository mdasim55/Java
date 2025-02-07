// 65. Create a program using break to read inputs from the user in a loop and break the loop if specific keyword (like: "exit") is entered.

import java.util.Scanner;

public class Qs_65 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to reads input from the user: ");
        String str;
        while(true) {
            System.out.print("Please enter your command : ");
            str=input.next();
            if(str.equals("exit")) {
                break;
            }
        }
        System.out.println("Thanks for entered the right keyword.");
        input.close();
    }
}
