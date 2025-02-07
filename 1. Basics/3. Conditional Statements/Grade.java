// 2. Create a program that calculates grade based on marks.
// A --> above 90% ,  B --> above 75%,   C --> above 60%,  D --> above 40%,  F --> below 40%, 

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to grade calculator...");
        System.out.print("Enter the marks: ");
        int marks=input.nextInt();
        if(marks>=90 && marks<=100) {
            System.out.println("Great, you habe got: A");
        }
        else if(marks>=75 && marks<=89) {
            System.out.println("Good, You have got : B");
        }
        else if(marks>=60 && marks<=74) {
            System.out.println("You have got: C , yot must be study.");
        }
        else if(marks>=40 && marks<=59) {
            System.out.println("You have got: D , you must be study hard.");
        } 
        else if(marks>=0 && marks<40) {
            System.out.println("You got: F , Sorry, you have failed the test.");
        } else {
            System.out.println("you have entered wrong marks.");
        }
    }
}
