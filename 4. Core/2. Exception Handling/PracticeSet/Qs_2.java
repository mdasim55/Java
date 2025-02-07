//2. Write a java program that's prints "Ha!Ha!" during Arithemetic execution and "He!He!" during illegal arguments exception.

import java.util.Scanner;

public class Qs_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 2 number for deviding: ");
        int a=input.nextInt();
        int b=input.nextInt();
        try {
            int result=a/b;
            System.out.println("The result is: "+result);
        } catch(ArithmeticException e) {
            System.out.println("Ha!Ha!");
            System.out.println(e);
        } catch(IllegalArgumentException e) {
            System.out.println("He!He!");
            System.out.println(e);
        } catch(Exception e) {
            System.out.println("Another Exception.");
            System.out.println(e);
        }
        input.close();
    }
}
