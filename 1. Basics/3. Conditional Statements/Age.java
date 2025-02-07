// 3. Create a program that categorize a person into different age groups.
// Child --> below 10,  teen --> below 20, adult --> below 60, senior --> above 60  

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to age categorize...");
        System.out.print("Enter the age: ");
        int age=input.nextInt();
        if(age>=0 && age<=10) {
            System.out.println("You are a Child.");
        }
        else if(age>=11 && age<=19) {
            System.out.println("You are a Teeneger.");
        }
        else if(age>=20 && age<=59) {
            System.out.println("You are an Adult.");
        }
        else if(age>=60 && age<=120) {
            System.out.println("You are a Senior.");
        } else {
            System.out.println("You have entered wrong age.");
        }
    }
}
