import java.util.Scanner;

public class Error1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        // SYNTAX ERROR DEMO --->
        // Here the wrong syntax written by the programmer.
        // int a=5         // Error: no semicolon.
        // b=10;           // Error: not declared.

        // LOGICAL ERROR ---->
        // Wrong logic by the programmer.
        // Write a program to print all prime numbers between 1 to 10 ?
        System.out.println(2);
        for(int i=1;i<5;i++) {
            System.out.println(i*2+1);   // Print the other prime number
        }
        // Here 9 is print but 9 not a prime number..so in the porogram the logic is incorrect. that is called Logical error.
        
        // RUN TIME ERROR ----> Exception
        // Here the occured given wrong input value by the user.
        System.out.print("Enter the value of k: ");
        int k=input.nextInt();
        System.out.println("1000 / k is: "+1000/k);
        // When the value of k is 0 then the program give throw an error ---> Arithemetic Error
        input.close();
    }
}
