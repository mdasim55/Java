import java.util.Scanner;

public class NewtedTry3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={23,56,78};
        System.out.print("Enter the index of of the array: ");
        int ind=input.nextInt();
        System.out.print("Enter the value to be devided: ");
        int number=input.nextInt();
        try {
            System.out.println("Welcome to try block.");
            try {
                System.out.println("The array value is: "+arr[ind]);
                System.out.println("The devide is : "+arr[ind]/number);
            } catch(ArrayIndexOutOfBoundsException e)  {
                System.out.println("The array index out of bound.");
                System.out.println(e);
                System.out.println("This is the exception level 2.");
            } catch(ArithmeticException e) {
                System.out.println("We failed the to calculte the dividing value: ");
                System.out.println(e);
                System.out.println("This is the exception level 2.");
            }
        } catch(Exception e) {
            System.out.println("Here is occure some exception");
            System.out.println(e);
            System.out.println("This is the exception level 1.");
        }
        input.close();
    }
}
