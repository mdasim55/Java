// 59. Create a program using do-while ton find password checker until a valid password is entered.

import java.util.Scanner;

public class Qs_59 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to set your password:  ");
        String password;
        do {
            System.out.print("Enter the password: ");
            password=input.next();
        } while(!isValidPass(password));
        System.out.println("Thanks for entering valid password.");
        input.close();
    }
    public static boolean isValidPass(String password) {
        return password.length()>6;
    }
}

