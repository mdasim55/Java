// 1. Create a program that determines if a given year is a leap year.
// conditions: considiring conditions like divisible by 4 but not 100, unless also divisible by 400.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Checking the Leapyear...");
        System.out.print("Enter the year that you want to check: ");
        int year=input.nextInt();
        if(year%400==0) {
            System.out.println(year+" is a leapyear");
        } else if(year%4==0 && year%100!=0) {
            System.out.println(year+" is a leapyear");
        } else {
            System.out.println(year+" is not a leapyear");
        } 
    }
}