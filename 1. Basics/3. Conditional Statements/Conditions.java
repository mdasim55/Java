import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18) {
            System.out.println("You are an adult");
            System.out.println("You can drive");
            System.out.println("You can vote");
        }
        else {
            System.out.println("You are not adult");
        }
    }
}