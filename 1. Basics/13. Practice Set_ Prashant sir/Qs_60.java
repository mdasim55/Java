// create a program using do-while to implement a number guessing game.

import java.util.Scanner;

public class Qs_60 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to gussing the number:  ");
        int num=15; 
        int guess;
        do {
            System.out.print("Please enter the number between 0 t0 25: ");
            guess=input.nextInt();
            if(num!=guess) {
                System.out.println("You have gussed wrong number.");
            }
        } while(num!=guess);
        System.out.println("Thanks, you have guessed the correct number: .");
        input.close();
    }
}