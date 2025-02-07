// Arithemetic Exception 

import java.util.Scanner;

public class TryCatch2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Deviding calculator: ");
        System.out.print("Enter the two numbers: ");
        int a=input.nextInt();
        int b=input.nextInt();
        // int arr[]=new int[5]; 
        try {
            //arr[6]=5;               // ArrayIndexOutOfBoundsException
            int result=a/b;         // ArithmeticException
            System.out.println("The result is: "+result);
        } catch(ArithmeticException exception) {            // Here we also write Exception in the place of ArithmeticException.
            System.out.println("We are failed to devide. Reason is: ");
            System.out.println(exception);
            System.out.printf("%s\n", exception.getMessage());
            System.out.println("You have entered wrong values.\nPlease enter valid values");
        } catch(ArrayIndexOutOfBoundsException exp) {
            System.out.println("Your array is out of bounds");
        } catch(Exception e) {
            System.out.println("General Exception");
        } catch(Throwable th) {
            System.out.println("General Exception 2");
        }
        System.out.println("It is the end of thr program.");
        input.close();
    }
}