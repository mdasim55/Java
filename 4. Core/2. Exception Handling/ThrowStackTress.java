// Exception with Throw stack tress methods

import java.util.Scanner;

public class ThrowStackTress {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        b();
    }
    public static void b() {
        c();
    }
    public static void c() {
        d();
    }
    public static void d() {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Deviding calculator: ");
        System.out.print("Enter the two numbers: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int arr[]=new int[5]; 
        try {
           // arr[6]=5;               // ArrayIndexOutOfBoundsException
            int result=a/b;         // ArithmeticException
            System.out.println("The result is: "+result);
        } catch(ArithmeticException exception) {
            System.out.printf("%s\n", exception.getMessage());
            System.out.println(" You have entered wrong values.\nPlease enter valid values");
            throw exception;
        } catch(ArrayIndexOutOfBoundsException exp) {
            System.out.println("Your array is out of bounds");
            throw exp;
        } catch(Exception e) {
            System.out.println("General Exception");
        } catch(Throwable th) {
            System.out.println("General Exception 2");
        } finally {
            System.out.println("I am a final keyword statement.");
        }
        input.close();    
    }
}
