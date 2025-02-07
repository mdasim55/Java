// 57. Create a program to print the month of the year bsed on a number (1-12) input by the user.

import java.util.Scanner;

public class Qs_57 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome number-month calculator.");
        System.out.print("Enter the number of the month: ");
        int month=input.nextInt();
        switchMonth(month);
    }
    public static void switchMonth(int month) {
        String monthStr=switch(month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default-> "Invalid Input";
        };
        System.out.println("The month is: "+monthStr);
    } 
}
