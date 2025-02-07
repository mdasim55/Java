import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0) {
            System.out.println("The given number is Even");
        }
        else {
            System.out.println("The given number is Odd");
        }
    }
}
